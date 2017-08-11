package hdf5;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import ncsa.hdf.hdf5lib.H5;
import ncsa.hdf.hdf5lib.HDF5Constants;
/**
 * GZip compression filter class
 * @author vanek2
 *
 */
public class GZip {
	

    public static final int CHUNK_X = 256;
    public static final int NDIMS = 2;

    // Values for the status of space allocation
    enum H5Z_filter {
        H5Z_FILTER_ERROR(HDF5Constants.H5Z_FILTER_ERROR), H5Z_FILTER_NONE(HDF5Constants.H5Z_FILTER_NONE), 
        H5Z_FILTER_DEFLATE(HDF5Constants.H5Z_FILTER_DEFLATE), H5Z_FILTER_SHUFFLE(HDF5Constants.H5Z_FILTER_SHUFFLE), 
        H5Z_FILTER_FLETCHER32(HDF5Constants.H5Z_FILTER_FLETCHER32), H5Z_FILTER_SZIP(HDF5Constants.H5Z_FILTER_SZIP), 
        H5Z_FILTER_NBIT(HDF5Constants.H5Z_FILTER_NBIT), H5Z_FILTER_SCALEOFFSET(HDF5Constants.H5Z_FILTER_SCALEOFFSET), 
        H5Z_FILTER_RESERVED(HDF5Constants.H5Z_FILTER_RESERVED), H5Z_FILTER_MAX(HDF5Constants.H5Z_FILTER_MAX);
        private static final Map<Integer, H5Z_filter> lookup = new HashMap<Integer, H5Z_filter>();

        static {
            for (H5Z_filter s : EnumSet.allOf(H5Z_filter.class))
                lookup.put(s.getCode(), s);
        }

        private int code;

        H5Z_filter(int layout_type) {
            this.code = layout_type;
        }

        public int getCode() {
            return this.code;
        }

        public static H5Z_filter get(int code) {
            return lookup.get(code);
        }
    }
/**
 * is GZip avivable
 * @return bool if is GZip avivable
 */
    public static boolean checkGzipFilter() {
        try {
            int available = H5.H5Zfilter_avail(HDF5Constants.H5Z_FILTER_DEFLATE);
            if (available == 0) {
                System.out.println("gzip filter not available.");
                return false;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int filter_info = H5.H5Zget_filter_info(HDF5Constants.H5Z_FILTER_DEFLATE);
            if (((filter_info & HDF5Constants.H5Z_FILTER_CONFIG_ENCODE_ENABLED) == 0)
                    || ((filter_info & HDF5Constants.H5Z_FILTER_CONFIG_DECODE_ENABLED) == 0)) {
                System.out.println("gzip filter not available for encoding and decoding.");
                return false;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
