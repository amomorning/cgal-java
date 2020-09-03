/**
 * @classname: testCGAL
 * @description:
 * @author: amomorning
 * @date: 2020/09/03
 */
public class LoadMissingLibrary {
    static void init() {
        System.loadLibrary("CGAL_JAVA_CPP");
        System.loadLibrary("LIBMPFR-4");
        System.loadLibrary("CGAL_KERNEL_CPP");
        System.loadLibrary("CGAL_AABB_TREE_CPP");
        System.loadLibrary("CGAL_Alpha_shape_2_cpp");
        System.loadLibrary("CGAL_Mesh_3_cpp");
        System.loadLibrary("CGAL_Surface_mesher_cpp");
        System.loadLibrary("CGAL_Triangulation_2_cpp");
        System.loadLibrary("CGAL_Triangulation_3_cpp");
    }
}
