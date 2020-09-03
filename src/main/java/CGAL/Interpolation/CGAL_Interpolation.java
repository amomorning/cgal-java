/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Interpolation;
import CGAL.Triangulation_2.Delaunay_triangulation_2; import CGAL.Triangulation_3.Delaunay_triangulation_3; import CGAL.Triangulation_2.Regular_triangulation_2; import CGAL.Kernel.Point_2; import CGAL.Kernel.Point_3; import CGAL.Kernel.Vector_3; import CGAL.Kernel.Vector_2; import CGAL.Kernel.Weighted_point_2; import java.util.Collection; import CGAL.Triangulation_2.Delaunay_triangulation_2_Face_handle; import CGAL.Triangulation_2.Delaunay_triangulation_2_Vertex_handle; import CGAL.Triangulation_2.Regular_triangulation_2_Face_handle; import CGAL.Triangulation_2.Regular_triangulation_2_Vertex_handle; import java.util.Iterator; import CGAL.Triangulation_2.Delaunay_triangulation_2_Edge; import CGAL.Triangulation_2.Regular_triangulation_2_Edge; import CGAL.Triangulation_3.Delaunay_triangulation_3_Cell_handle;
public class CGAL_Interpolation {
  public static Double_and_bool natural_neighbor_coordinates_2(Delaunay_triangulation_2 dt, Point_2 p, Collection<Point_2_and_double> out, Delaunay_triangulation_2_Face_handle start) {
    return new Double_and_bool(CGAL_InterpolationJNI.natural_neighbor_coordinates_2__SWIG_0(Delaunay_triangulation_2.getCPtr(dt), dt, Point_2.getCPtr(p), p, out, Delaunay_triangulation_2_Face_handle.getCPtr(start), start), true);
  }

  public static Double_and_bool natural_neighbor_coordinates_2(Delaunay_triangulation_2 dt, Point_2 p, Collection<Point_2_and_double> out) {
    return new Double_and_bool(CGAL_InterpolationJNI.natural_neighbor_coordinates_2__SWIG_1(Delaunay_triangulation_2.getCPtr(dt), dt, Point_2.getCPtr(p), p, out), true);
  }

  public static Double_and_bool natural_neighbor_coordinates_2(Delaunay_triangulation_2 dt, Point_2 p, Collection<Point_2_and_double> out, Iterator<Delaunay_triangulation_2_Edge> its) {
    return new Double_and_bool(CGAL_InterpolationJNI.natural_neighbor_coordinates_2__SWIG_2(Delaunay_triangulation_2.getCPtr(dt), dt, Point_2.getCPtr(p), p, out, its), true);
  }

  public static Double_and_bool natural_neighbor_coordinates_2(Delaunay_triangulation_2 dt, Delaunay_triangulation_2_Vertex_handle vh, Collection<Point_2_and_double> out) {
    return new Double_and_bool(CGAL_InterpolationJNI.natural_neighbor_coordinates_2__SWIG_3(Delaunay_triangulation_2.getCPtr(dt), dt, Delaunay_triangulation_2_Vertex_handle.getCPtr(vh), vh, out), true);
  }

  public static Double_and_bool regular_neighbor_coordinates_2(Regular_triangulation_2 dt, Weighted_point_2 p, Collection<Weighted_point_2_and_double> out, Regular_triangulation_2_Face_handle start) {
    return new Double_and_bool(CGAL_InterpolationJNI.regular_neighbor_coordinates_2__SWIG_0(Regular_triangulation_2.getCPtr(dt), dt, Weighted_point_2.getCPtr(p), p, out, Regular_triangulation_2_Face_handle.getCPtr(start), start), true);
  }

  public static Double_and_bool regular_neighbor_coordinates_2(Regular_triangulation_2 dt, Weighted_point_2 p, Collection<Weighted_point_2_and_double> out) {
    return new Double_and_bool(CGAL_InterpolationJNI.regular_neighbor_coordinates_2__SWIG_1(Regular_triangulation_2.getCPtr(dt), dt, Weighted_point_2.getCPtr(p), p, out), true);
  }

  public static Double_and_bool regular_neighbor_coordinates_2(Regular_triangulation_2 dt, Weighted_point_2 p, Collection<Weighted_point_2_and_double> out, Iterator<Regular_triangulation_2_Edge> erange, Iterator<Regular_triangulation_2_Vertex_handle> vrange) {
    return new Double_and_bool(CGAL_InterpolationJNI.regular_neighbor_coordinates_2__SWIG_2(Regular_triangulation_2.getCPtr(dt), dt, Weighted_point_2.getCPtr(p), p, out, erange, vrange), true);
  }

  public static Double_and_bool regular_neighbor_coordinates_2(Regular_triangulation_2 dt, Regular_triangulation_2_Vertex_handle vh, Collection<Weighted_point_2_and_double> out) {
    return new Double_and_bool(CGAL_InterpolationJNI.regular_neighbor_coordinates_2__SWIG_3(Regular_triangulation_2.getCPtr(dt), dt, Regular_triangulation_2_Vertex_handle.getCPtr(vh), vh, out), true);
  }

  public static void surface_neighbors_3(Iterator<Point_3> range, Point_3 p, Vector_3 normal, Collection<Point_3> out) {
    CGAL_InterpolationJNI.surface_neighbors_3__SWIG_0(range, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out);
  }

  public static boolean surface_neighbors_certified_3(Iterator<Point_3> range, Point_3 p, Vector_3 normal, Collection<Point_3> out) {
    return CGAL_InterpolationJNI.surface_neighbors_certified_3__SWIG_0(range, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out);
  }

  public static boolean surface_neighbors_certified_3(Iterator<Point_3> range, Point_3 p, Vector_3 normal, double max_distance, Collection<Point_3> out) {
    return CGAL_InterpolationJNI.surface_neighbors_certified_3__SWIG_1(range, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, max_distance, out);
  }

  public static void surface_neighbors_3(Delaunay_triangulation_3 dt, Point_3 p, Vector_3 normal, Collection<Point_3> out, Delaunay_triangulation_3_Cell_handle start) {
    CGAL_InterpolationJNI.surface_neighbors_3__SWIG_1(Delaunay_triangulation_3.getCPtr(dt), dt, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out, Delaunay_triangulation_3_Cell_handle.getCPtr(start), start);
  }

  public static void surface_neighbors_3(Delaunay_triangulation_3 dt, Point_3 p, Vector_3 normal, Collection<Point_3> out) {
    CGAL_InterpolationJNI.surface_neighbors_3__SWIG_2(Delaunay_triangulation_3.getCPtr(dt), dt, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out);
  }

  public static Double_and_bool surface_neighbor_coordinates_3(Iterator<Point_3> range, Point_3 p, Vector_3 normal, Collection<Point_3_and_double> out) {
    return new Double_and_bool(CGAL_InterpolationJNI.surface_neighbor_coordinates_3__SWIG_0(range, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out), true);
  }

  public static Double_bool_bool surface_neighbor_coordinates_certified_3(Iterator<Point_3> range, Point_3 p, Vector_3 normal, Collection<Point_3_and_double> out) {
    return new Double_bool_bool(CGAL_InterpolationJNI.surface_neighbor_coordinates_certified_3__SWIG_0(range, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out), true);
  }

  public static Double_bool_bool surface_neighbor_coordinates_certified_3(Iterator<Point_3> range, Point_3 p, Vector_3 normal, double max_distance, Collection<Point_3_and_double> out) {
    return new Double_bool_bool(CGAL_InterpolationJNI.surface_neighbor_coordinates_certified_3__SWIG_1(range, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, max_distance, out), true);
  }

  public static Double_and_bool surface_neighbor_coordinates_3(Delaunay_triangulation_3 dt, Point_3 p, Vector_3 normal, Collection<Point_3_and_double> out, Delaunay_triangulation_3_Cell_handle start) {
    return new Double_and_bool(CGAL_InterpolationJNI.surface_neighbor_coordinates_3__SWIG_1(Delaunay_triangulation_3.getCPtr(dt), dt, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out, Delaunay_triangulation_3_Cell_handle.getCPtr(start), start), true);
  }

  public static Double_and_bool surface_neighbor_coordinates_3(Delaunay_triangulation_3 dt, Point_3 p, Vector_3 normal, Collection<Point_3_and_double> out) {
    return new Double_and_bool(CGAL_InterpolationJNI.surface_neighbor_coordinates_3__SWIG_2(Delaunay_triangulation_3.getCPtr(dt), dt, Point_3.getCPtr(p), p, Vector_3.getCPtr(normal), normal, out), true);
  }

  public static double linear_interpolation(Iterator<Point_2_and_double> range, double norm, Data_access_double_2 function_values) {
    return CGAL_InterpolationJNI.linear_interpolation(range, norm, Data_access_double_2.getCPtr(function_values), function_values);
  }

  public static Double_and_bool quadratic_interpolation(Iterator<Point_2_and_double> range, double norm, Point_2 p, Data_access_double_2 function_values, Data_access_vector_2 gradients) {
    return new Double_and_bool(CGAL_InterpolationJNI.quadratic_interpolation(range, norm, Point_2.getCPtr(p), p, Data_access_double_2.getCPtr(function_values), function_values, Data_access_vector_2.getCPtr(gradients), gradients), true);
  }

  public static Double_and_bool sibson_c1_interpolation(Iterator<Point_2_and_double> range, double norm, Point_2 p, Data_access_double_2 function_values, Data_access_vector_2 gradients) {
    return new Double_and_bool(CGAL_InterpolationJNI.sibson_c1_interpolation(range, norm, Point_2.getCPtr(p), p, Data_access_double_2.getCPtr(function_values), function_values, Data_access_vector_2.getCPtr(gradients), gradients), true);
  }

  public static Double_and_bool sibson_c1_interpolation_square(Iterator<Point_2_and_double> range, double norm, Point_2 p, Data_access_double_2 function_values, Data_access_vector_2 gradients) {
    return new Double_and_bool(CGAL_InterpolationJNI.sibson_c1_interpolation_square(range, norm, Point_2.getCPtr(p), p, Data_access_double_2.getCPtr(function_values), function_values, Data_access_vector_2.getCPtr(gradients), gradients), true);
  }

  public static Double_and_bool farin_c1_interpolation(Iterator<Point_2_and_double> range, double norm, Point_2 p, Data_access_double_2 function_values, Data_access_vector_2 gradients) {
    return new Double_and_bool(CGAL_InterpolationJNI.farin_c1_interpolation(range, norm, Point_2.getCPtr(p), p, Data_access_double_2.getCPtr(function_values), function_values, Data_access_vector_2.getCPtr(gradients), gradients), true);
  }

  public static Vector_2 sibson_gradient_fitting(Iterator<Point_2_and_double> range, double norm, Point_2 p, Data_access_double_2 function_values) {
    return new Vector_2(CGAL_InterpolationJNI.sibson_gradient_fitting(range, norm, Point_2.getCPtr(p), p, Data_access_double_2.getCPtr(function_values), function_values), true);
  }

  public static void sibson_gradient_fitting_nn_2(Delaunay_triangulation_2 dt, Data_access_vector_2 gradients, Data_access_double_2 function_values) {
    CGAL_InterpolationJNI.sibson_gradient_fitting_nn_2(Delaunay_triangulation_2.getCPtr(dt), dt, Data_access_vector_2.getCPtr(gradients), gradients, Data_access_double_2.getCPtr(function_values), function_values);
  }

}
