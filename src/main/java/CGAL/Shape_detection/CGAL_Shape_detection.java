/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Shape_detection;

import CGAL.Kernel.Point_3;
import CGAL.Kernel.Vector_3;
import CGAL.Point_set_3.Point_set_3;
import CGAL.Point_set_3.Point_set_3_Int_map;
import java.util.Iterator;
import java.util.Collection;

public class CGAL_Shape_detection {
  public static int region_growing(Point_set_3 point_set, Point_set_3_Int_map plane_map, int min_points, double epsilon, double cluster_epsilon, double normal_treshold, int k) {
    return CGAL_Shape_detectionJNI.region_growing__SWIG_0(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(plane_map), plane_map, min_points, epsilon, cluster_epsilon, normal_treshold, k);
  }

  public static int region_growing(Point_set_3 point_set, Point_set_3_Int_map plane_map, int min_points, double epsilon, double cluster_epsilon, double normal_treshold) {
    return CGAL_Shape_detectionJNI.region_growing__SWIG_1(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(plane_map), plane_map, min_points, epsilon, cluster_epsilon, normal_treshold);
  }

  public static int region_growing(Point_set_3 point_set, Point_set_3_Int_map plane_map, int min_points, double epsilon, double cluster_epsilon) {
    return CGAL_Shape_detectionJNI.region_growing__SWIG_2(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(plane_map), plane_map, min_points, epsilon, cluster_epsilon);
  }

  public static int region_growing(Point_set_3 point_set, Point_set_3_Int_map plane_map, int min_points, double epsilon) {
    return CGAL_Shape_detectionJNI.region_growing__SWIG_3(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(plane_map), plane_map, min_points, epsilon);
  }

  public static int region_growing(Point_set_3 point_set, Point_set_3_Int_map plane_map, int min_points) {
    return CGAL_Shape_detectionJNI.region_growing__SWIG_4(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(plane_map), plane_map, min_points);
  }

  public static int region_growing(Point_set_3 point_set, Point_set_3_Int_map plane_map) {
    return CGAL_Shape_detectionJNI.region_growing__SWIG_5(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(plane_map), plane_map);
  }

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold, double probability, boolean planes, boolean cones, boolean cylinders, boolean spheres, boolean tori) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_0(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold, probability, planes, cones, cylinders, spheres, tori);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold, double probability, boolean planes, boolean cones, boolean cylinders, boolean spheres) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_1(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold, probability, planes, cones, cylinders, spheres);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold, double probability, boolean planes, boolean cones, boolean cylinders) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_2(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold, probability, planes, cones, cylinders);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold, double probability, boolean planes, boolean cones) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_3(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold, probability, planes, cones);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold, double probability, boolean planes) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_4(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold, probability, planes);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold, double probability) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_5(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold, probability);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon, double normal_threshold) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_6(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon, normal_threshold);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon, double cluster_epsilon) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_7(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon, cluster_epsilon);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points, double epsilon) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_8(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points, epsilon);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map, int min_points) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_9(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map, min_points);}

  public static String[] efficient_RANSAC(Point_set_3 point_set, Point_set_3_Int_map shape_map) {return CGAL_Shape_detectionJNI.efficient_RANSAC__SWIG_10(Point_set_3.getCPtr(point_set), point_set, Point_set_3_Int_map.getCPtr(shape_map), shape_map);}

}
