/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Advancing_front_surface_reconstruction;

  import CGAL.Kernel.Point_3;
  import CGAL.Point_set_3.Point_set_3;
  import java.util.Iterator;
  import java.util.Collection;
  import CGAL.Polyhedron_3.Polyhedron_3;

public class CGAL_Advancing_front_surface_reconstructionJNI {

    static {
      try {
          System.loadLibrary("CGAL_Advancing_front_surface_reconstruction");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Advancing_front_surface_reconstruction failed to load. \n" + e);
        throw e;
      }
    }
  

    static{
      try {
          System.loadLibrary("CGAL_Java");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Java failed to load. \n" + e);
        throw e;
      }
    }
  
  public final static native void advancing_front_surface_reconstruction__SWIG_0(long jarg1, Point_set_3 jarg1_, Collection<Integer> jarg2, double jarg3, double jarg4);
  public final static native void advancing_front_surface_reconstruction__SWIG_1(long jarg1, Point_set_3 jarg1_, Collection<Integer> jarg2, double jarg3);
  public final static native void advancing_front_surface_reconstruction__SWIG_2(long jarg1, Point_set_3 jarg1_, Collection<Integer> jarg2);
  public final static native void advancing_front_surface_reconstruction__SWIG_3(long jarg1, Point_set_3 jarg1_, long jarg2, Polyhedron_3 jarg2_, double jarg3, double jarg4);
  public final static native void advancing_front_surface_reconstruction__SWIG_4(long jarg1, Point_set_3 jarg1_, long jarg2, Polyhedron_3 jarg2_, double jarg3);
  public final static native void advancing_front_surface_reconstruction__SWIG_5(long jarg1, Point_set_3 jarg1_, long jarg2, Polyhedron_3 jarg2_);
}
