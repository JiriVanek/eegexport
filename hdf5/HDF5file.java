package eegnix;

import ncsa.hdf.hdf5lib.H5;
import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException;


/**
 * Class for HDF5 file handling
 * 
 * @author Vanek
 * 
 */
public class HDF5file {
	private String filename = null;
	private String path = null;
	private int file;
	private DataWriter dataWriter;
	private String blockID = "23";
	private final String VERSION = "0.9";
	private final String NAMEVERSION = "version";
	public final String DATA = "/DATA";
	public final String METADATA = "/METADATA";
	private final String NAMECREATED = "created_at";
	private final String NAMEUPDATED = "updated_at";
	private final String FORMAT = "EEGBase";
	private final String NAMEFORMAT = "format";

	/**
	 * constructor of the hdf5 file class
	 * 
	 * @param filename
	 *            name of the file with .h5 extension
	 * @param path
	 *            path
	 * @throws NullPointerException
	 * @throws HDF5LibraryException
	 */
	public HDF5file(String filename, String path) throws HDF5LibraryException,
			NullPointerException {
		this.filename = filename;
		this.path = path;
		CreateFile();
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getFile() {
		return file;
	}

	public void setFile(int file) {
		this.file = file;
	}

	/**
	 * creates new file
	 * 
	 * @throws NullPointerException
	 * @throws HDF5LibraryException
	 */
	private void CreateFile() throws HDF5LibraryException, NullPointerException {
		this.file = H5.H5Fcreate(path + filename, HDF5Constants.H5F_ACC_TRUNC,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		if (file >= 0) {
			WriteVersion(VERSION);
			WriteFormat(FORMAT);
//			WriteUpdateDate();
//			WriteCreateDate();
			WriteGroups();
			this.dataWriter = new DataWriter(this);
			dataWriter.AddBlock(blockID);
		}
	}



	/**
	 * writes version and format type to hdf
	 * 
	 * @param version
	 *            version number
	 * @throws HDF5LibraryException
	 */
	private void WriteVersion(String version) throws HDF5LibraryException {
		int attribute_id = -1;
		int attrs_id = -1;
		int stype = -1;

		attrs_id = H5.H5Screate(HDF5Constants.H5S_SCALAR);
		// if ((file >= 0) && (attribute_id >= 0))
		stype = H5.H5Tcopy(HDF5Constants.H5T_C_S1);
		H5.H5Tset_size(stype, version.length());
		// if (attribute_id >= 0)
		attribute_id = H5.H5Acreate(file, NAMEVERSION, stype, attrs_id,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		H5.H5Awrite(attribute_id, stype, version.getBytes());
		// Close the attribute.
		if (attribute_id >= 0)
			H5.H5Aclose(attribute_id);
		if (attrs_id >= 0)
			H5.H5Sclose(attrs_id);
	}

	/**
	 * writes name of format do HDF5 file
	 * 
	 * @param format
	 *            name of file format
	 * @throws HDF5LibraryException
	 */
	private void WriteFormat(String format) throws HDF5LibraryException {
		int attribute_id = -1;
		int attrs_id = -1;
		int stype = -1;

		attrs_id = H5.H5Screate(HDF5Constants.H5S_SCALAR);
		// if ((file >= 0) && (attribute_id >= 0))
		stype = H5.H5Tcopy(HDF5Constants.H5T_C_S1);
		H5.H5Tset_size(stype, format.length());
		// if (attribute_id >= 0)
		attribute_id = H5.H5Acreate(file, NAMEFORMAT, stype, attrs_id,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		H5.H5Awrite(attribute_id, stype, format.getBytes());
		// Close the attribute.
		if (attribute_id >= 0)
			H5.H5Aclose(attribute_id);
		if (attrs_id >= 0)
			H5.H5Sclose(attrs_id);

	}

	/**
	 * creates basic group DATA and METADATA in hdf
	 * 
	 * @throws NullPointerException
	 * @throws HDF5LibraryException
	 */
	private void WriteGroups() throws HDF5LibraryException,
			NullPointerException {
		int group_id = -1;

		group_id = H5.H5Gcreate(file, DATA, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		if (group_id >= 0)
			H5.H5Gclose(group_id);
		group_id = H5.H5Gcreate(file, METADATA, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		if (group_id >= 0)
			H5.H5Gclose(group_id);

	}


}
