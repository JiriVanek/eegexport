package eegnix;

import java.util.Collection;
import java.util.UUID;

import ncsa.hdf.hdf5lib.H5;
import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.hdf5lib.exceptions.HDF5Exception;
import ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException;

/**
 * Class handling data part of HDF5 file
 * 
 * @author Vanek
 * 
 */
public class DataWriter {
	private String DATA = "/data/block";
	private String DATAARRAYS = "";
	private String MULTITAGS = "";
	private final String ID = "ID";
	private final String RESOLUTION = "resolution";
	private final String UNITS = "resolution unit";
	private final String SAMPLING = "sampling interval in microseconds";
	private int block = -1;
	private int signal = -1;
	private int markers = -1;
	private HDF5file hdf5file;

	public DataWriter(HDF5file hdf) {
		this.hdf5file = hdf;
	}

	/**
	 * prida block do HDF souboru s predanym ID
	 * 
	 * @param id
	 *            ID zapisovaneho blocku
	 */
	public void AddBlock(String id) {
		int stype = -1;
		this.DATA = DATA + id + "/";
		this.DATAARRAYS = this.DATA + "/data_arrays";
		this.MULTITAGS= this.DATA + "/multi_tags";
		try {
			this.block = H5.H5Gcreate(hdf5file.getFile(), DATA,
					HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
					HDF5Constants.H5P_DEFAULT);
            SaveAttributeString(this.block, "name", "block" + id);
            SaveAttributeString(this.block, "type", "block");
            SaveAttributeString(this.block, "entity_it", UUID.randomUUID().toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		int attribute_id = -1;
		try {
			attribute_id = H5.H5Screate(HDF5Constants.H5S_SCALAR);
			// if ((file >= 0) && (attribute_id >= 0))
			stype = H5.H5Tcopy(HDF5Constants.H5T_C_S1);
			H5.H5Tset_size(stype, id.length());
			// if (attribute_id >= 0)
			attribute_id = H5.H5Acreate(this.block, ID, stype, attribute_id,
					HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
			H5.H5Awrite(attribute_id, stype, id.getBytes());
			// Close the attribute.
			if (attribute_id >= 0)
				H5.H5Aclose(attribute_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			AddChannelGroup();
			AddMarkerGroup();
		} catch (HDF5LibraryException | NullPointerException e) {
			e.printStackTrace();
		}
	}

	private void AddChannelGroup() throws HDF5LibraryException,
			NullPointerException {

		this.signal = H5.H5Gcreate(this.block, this.DATAARRAYS,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);

	}

	/**
	 * creates group for storing markers in hdf
	 * 
	 * @throws HDF5LibraryException
	 *             error with HDF5 library
	 * @throws NullPointerException
	 *             cant create group in hdf
	 */
	private void AddMarkerGroup() throws HDF5LibraryException,
			NullPointerException {

		this.markers = H5.H5Gcreate(this.block, this.MULTITAGS,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);

	}

	/**
	 * closes block
	 * 
	 * @throws HDF5LibraryException
	 *             error with hdf library
	 */
	public void CloseBlock() throws HDF5LibraryException {
		if (this.signal >= 0)
			H5.H5Gclose(signal);
		if (this.markers >= 0)
			H5.H5Gclose(markers);
		if (this.block >= 0)
			H5.H5Gclose(this.block);
	}


/**
 * adds multitag (stimuli) to hdf5
 * @param name name of tag - stimulus
 * @param position collection of positions of stimuli
 * @throws HDF5LibraryException
 * @throws NullPointerException
 * @throws HDF5Exception
 */
	public void AddMarker(String name, Collection<Integer> position)
			throws HDF5LibraryException, NullPointerException, HDF5Exception {
		int multitag_id = -1;
		int dataarray_id = -1;
        int positions_id = -1;
        int positionsSpace_id = -1;
        String positionsName = name + ".positions";
		long[] dimsf = { position.size(), 1 };
        positionsSpace_id = H5.H5Screate_simple(2, dimsf, null);
		if (this.markers >= 0 && this.signal >= 0 && positionsSpace_id >= 0) {
            multitag_id = H5.H5Gcreate(this.markers, name,
                    HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
                    HDF5Constants.H5P_DEFAULT);
            SaveAttributeString(multitag_id, "name", name);
            SaveAttributeString(multitag_id, "type", "Marker");
            SaveAttributeString(multitag_id, "entity_id", UUID.randomUUID().toString());


			dataarray_id = H5.H5Gcreate(this.signal, positionsName,
					HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
					HDF5Constants.H5P_DEFAULT);
            SaveAttributeString(dataarray_id, "name", positionsName);
            SaveAttributeString(dataarray_id, "type", "Marker Positions");
            SaveAttributeString(dataarray_id, "entity_id", UUID.randomUUID().toString());


            positions_id = H5.H5Dcreate(dataarray_id, "data",
                    HDF5Constants.H5T_STD_I32LE, positionsSpace_id,
                    HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
                    HDF5Constants.H5P_DEFAULT);

            H5.H5Lcreate_hard(dataarray_id, positionsName, multitag_id, "positions",
                    HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		}

		if (multitag_id != -1)
			WriteMarkers(positions_id, name, position);
        H5.H5Gclose(dataarray_id);
		H5.H5Gclose(multitag_id);
        H5.H5Sclose(positionsSpace_id);
        H5.H5Dclose(positions_id);
	}

    public void AddSignal(String name, double[] signal)
            throws HDF5LibraryException, NullPointerException, HDF5Exception {
        int dataarray_id = -1;
        int signal_id = -1;
        int signalSpace_id = -1;
        long[] dimsf = { signal.length, 1 };
        signalSpace_id = H5.H5Screate_simple(2, dimsf, null);
        if (this.signal >= 0 && signalSpace_id >= 0) {
            dataarray_id = H5.H5Gcreate(this.signal, name,
                    HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
                    HDF5Constants.H5P_DEFAULT);
            SaveAttributeString(dataarray_id, "name", name);
            SaveAttributeString(dataarray_id, "type", "Signal");
            SaveAttributeString(dataarray_id, "entity_id", UUID.randomUUID().toString());


            signal_id = H5.H5Dcreate(dataarray_id, "data",
                    HDF5Constants.H5T_IEEE_F64LE, signalSpace_id,
                    HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
                    HDF5Constants.H5P_DEFAULT);
        }

        if (signal_id != -1)
            WriteDataset(signal_id, signal);
        H5.H5Sclose(signalSpace_id);
        H5.H5Gclose(dataarray_id);
    }
/**
 * adds multitag (stimuli) to hdf5 with SZip compression
 * @param name name of tag - stimulus
 * @param possition collection of positions of stimuli
 * @param chunkSize for compression, bigger chunk - bigger compression, 1 compression is disabled
 * @throws HDF5LibraryException
 * @throws NullPointerException
 * @throws HDF5Exception
 */
/*
	public void AddMultiTagSZip(String name, Collection<Integer> possition, int chunkSize)
			throws HDF5LibraryException, NullPointerException, HDF5Exception {
		int dataset_id = -1;
		int multitagSpace_id = -1;
		int multitag_id=-1;
		String id = IDGEN.nextSessionId();
		long[] dimsf = { possition.size(), 1 };
		long[] chunk_dims = { chunkSize, 1 };

		multitagSpace_id = H5.H5Screate_simple(2, dimsf, null);
		int dcpl_id = H5.H5Pcreate(HDF5Constants.H5P_DATASET_CREATE);
		if (dcpl_id >= 0) {
			H5.H5Pset_szip(dcpl_id, HDF5Constants.H5_SZIP_NN_OPTION_MASK, 2);
			// Set the chunk size.
			H5.H5Pset_chunk(dcpl_id, SZip.NDIMS, chunk_dims);
		}		
		  if (multitagSpace_id >= 0 && this.markers >= 0)
			  multitag_id =
		  H5.H5Dcreate(markers, MARKER + name, HDF5Constants.H5T_STD_I32LE,
		 multitagSpace_id, HDF5Constants.H5P_DEFAULT,
		 HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		 
		if (multitagSpace_id != -1)
			dataset_id = H5.H5Dcreate(markers, MARKER + name,
					HDF5Constants.H5T_STD_I32LE, multitagSpace_id,
					HDF5Constants.H5P_DEFAULT, dcpl_id,
					HDF5Constants.H5P_DEFAULT);
		int[] pole = Ints.toArray(possition);
		if (dataset_id >= 0)
			H5.H5Dwrite(dataset_id, HDF5Constants.H5T_IEEE_F64LE,
					HDF5Constants.H5S_ALL, HDF5Constants.H5S_ALL,
					HDF5Constants.H5P_DEFAULT, pole);
		SaveAttributeString(multitag_id, id, ID);
		H5.H5Dclose(dataset_id);
		H5.H5Sclose(multitagSpace_id);
	}

	*/

	/**
	 * writes data to HDF5
	 * 
	 * @param multitag_id
	 *            tag of allocated space for multitag
	 * @param name
	 *            name of stimuli
	 * @param position
	 *            collections of stimuli possitions
	 * @throws HDF5Exception
	 * @throws NullPointerException
	 * @throws HDF5LibraryException
	 */
	private void WriteMarkers(int multitag_id, String name,
                              Collection<Integer> position) throws HDF5LibraryException,
			NullPointerException, HDF5Exception {
	    // TODO: Copy position
		int[] pole = new int[position.size()];

		if (multitag_id >= 0)
			H5.H5Dwrite(multitag_id, HDF5Constants.H5T_STD_I32LE,
					HDF5Constants.H5S_ALL, HDF5Constants.H5S_ALL,
					HDF5Constants.H5P_DEFAULT, pole);

	}


	/**
	 * zapise data do HDF5 souboru
	 * 
	 * @param dataset_id
	 *            oznaceni (id) otevreneho datasetu v ramci HDF
	 * @param dset_data
	 *            ukladana data kanalu
	 * @throws HDF5Exception
	 * @throws NullPointerException
	 * @throws HDF5LibraryException
	 */
	private void WriteDataset(int dataset_id, double[] dset_data)
			throws HDF5LibraryException, NullPointerException, HDF5Exception {

		if (dataset_id >= 0)
			H5.H5Dwrite(dataset_id, HDF5Constants.H5T_IEEE_F64LE,
					HDF5Constants.H5S_ALL, HDF5Constants.H5S_ALL,
					HDF5Constants.H5P_DEFAULT, dset_data);

	}

	/**
	 * saves string attribute
	 * 
	 * @param dataset_id
	 *            location where save attribute
	 * @param savedString
	 *            string for save
	 * @param HdfName
	 *            name of attribute
	 * @throws HDF5LibraryException
	 * @throws NullPointerException
	 */
	private void SaveAttributeString(int dataset_id, String savedString,
                                     String HdfName) throws HDF5LibraryException, NullPointerException {
		int attribute_space, attribute_id = -1;
		int stype = -1;
		attribute_space = H5.H5Screate(HDF5Constants.H5S_SCALAR);
		stype = H5.H5Tcopy(HDF5Constants.H5T_C_S1);
		H5.H5Tset_size(stype, savedString.length());
		attribute_id = H5.H5Acreate(dataset_id, HdfName, stype,
				attribute_space, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		H5.H5Awrite(attribute_id, stype, savedString.getBytes());
		if (attribute_space > -1)
			H5.H5Sclose(attribute_space);
		if (attribute_id > -1)
			H5.H5Aclose(attribute_id);
	}

}
