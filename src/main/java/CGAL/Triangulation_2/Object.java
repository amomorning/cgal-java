/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  import CGAL.Kernel.Point_2;
  import CGAL.Kernel.Point_3;
  import CGAL.Kernel.Triangle_2;
  import CGAL.Kernel.Triangle_3;
  import CGAL.Kernel.Segment_3;
  import CGAL.Kernel.Segment_2;
  import CGAL.Kernel.Line_3;
  import CGAL.Kernel.Line_2;
  import CGAL.Kernel.Plane_3;
  import CGAL.Kernel.Ray_2;
  import CGAL.Kernel.Ray_3;
  import CGAL.Kernel.Polygon_2;

public class Object {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Object(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Object obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Object(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Object() {
    this(CGAL_Triangulation_2JNI.new_Object(), true);
  }

  public boolean is_Point_2() {
    return CGAL_Triangulation_2JNI.Object_is_Point_2(swigCPtr, this);
  }

  public Point_2 get_Point_2() {
    return new Point_2(CGAL_Triangulation_2JNI.Object_get_Point_2(swigCPtr, this), true);
  }

  public boolean is_Point_3() {
    return CGAL_Triangulation_2JNI.Object_is_Point_3(swigCPtr, this);
  }

  public Point_3 get_Point_3() {
    return new Point_3(CGAL_Triangulation_2JNI.Object_get_Point_3(swigCPtr, this), true);
  }

  public boolean is_Triangle_2() {
    return CGAL_Triangulation_2JNI.Object_is_Triangle_2(swigCPtr, this);
  }

  public Triangle_2 get_Triangle_2() {
    return new Triangle_2(CGAL_Triangulation_2JNI.Object_get_Triangle_2(swigCPtr, this), true);
  }

  public boolean is_Triangle_3() {
    return CGAL_Triangulation_2JNI.Object_is_Triangle_3(swigCPtr, this);
  }

  public Triangle_3 get_Triangle_3() {
    return new Triangle_3(CGAL_Triangulation_2JNI.Object_get_Triangle_3(swigCPtr, this), true);
  }

  public boolean is_Segment_3() {
    return CGAL_Triangulation_2JNI.Object_is_Segment_3(swigCPtr, this);
  }

  public Segment_3 get_Segment_3() {
    return new Segment_3(CGAL_Triangulation_2JNI.Object_get_Segment_3(swigCPtr, this), true);
  }

  public boolean is_Segment_2() {
    return CGAL_Triangulation_2JNI.Object_is_Segment_2(swigCPtr, this);
  }

  public Segment_2 get_Segment_2() {
    return new Segment_2(CGAL_Triangulation_2JNI.Object_get_Segment_2(swigCPtr, this), true);
  }

  public boolean is_Line_3() {
    return CGAL_Triangulation_2JNI.Object_is_Line_3(swigCPtr, this);
  }

  public Line_3 get_Line_3() {
    return new Line_3(CGAL_Triangulation_2JNI.Object_get_Line_3(swigCPtr, this), true);
  }

  public boolean is_Line_2() {
    return CGAL_Triangulation_2JNI.Object_is_Line_2(swigCPtr, this);
  }

  public Line_2 get_Line_2() {
    return new Line_2(CGAL_Triangulation_2JNI.Object_get_Line_2(swigCPtr, this), true);
  }

  public boolean is_Plane_3() {
    return CGAL_Triangulation_2JNI.Object_is_Plane_3(swigCPtr, this);
  }

  public Plane_3 get_Plane_3() {
    return new Plane_3(CGAL_Triangulation_2JNI.Object_get_Plane_3(swigCPtr, this), true);
  }

  public boolean is_Ray_2() {
    return CGAL_Triangulation_2JNI.Object_is_Ray_2(swigCPtr, this);
  }

  public Ray_2 get_Ray_2() {
    return new Ray_2(CGAL_Triangulation_2JNI.Object_get_Ray_2(swigCPtr, this), true);
  }

  public boolean is_Ray_3() {
    return CGAL_Triangulation_2JNI.Object_is_Ray_3(swigCPtr, this);
  }

  public Ray_3 get_Ray_3() {
    return new Ray_3(CGAL_Triangulation_2JNI.Object_get_Ray_3(swigCPtr, this), true);
  }

  public boolean is_Polygon_2() {
    return CGAL_Triangulation_2JNI.Object_is_Polygon_2(swigCPtr, this);
  }

  public Polygon_2 get_Polygon_2() {
    return new Polygon_2(CGAL_Triangulation_2JNI.Object_get_Polygon_2(swigCPtr, this), true);
  }

  public boolean empty() {
    return CGAL_Triangulation_2JNI.Object_empty(swigCPtr, this);
  }

}
