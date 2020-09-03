/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Ray_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Ray_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ray_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Ray_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ray_2(Point_2 p, Point_2 q) {
    this(CGAL_KernelJNI.new_Ray_2__SWIG_0(Point_2.getCPtr(p), p, Point_2.getCPtr(q), q), true);
  }

  public Ray_2(Point_2 p, Direction_2 d) {
    this(CGAL_KernelJNI.new_Ray_2__SWIG_1(Point_2.getCPtr(p), p, Direction_2.getCPtr(d), d), true);
  }

  public Ray_2(Point_2 p, Vector_2 v) {
    this(CGAL_KernelJNI.new_Ray_2__SWIG_2(Point_2.getCPtr(p), p, Vector_2.getCPtr(v), v), true);
  }

  public Ray_2(Point_2 p, Line_2 l) {
    this(CGAL_KernelJNI.new_Ray_2__SWIG_3(Point_2.getCPtr(p), p, Line_2.getCPtr(l), l), true);
  }

  public Point_2 source() {
    return new Point_2(CGAL_KernelJNI.Ray_2_source__SWIG_0(swigCPtr, this), true);
  }

  public void source(Point_2 ref) {
    CGAL_KernelJNI.Ray_2_source__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public Point_2 point(int c) {
    return new Point_2(CGAL_KernelJNI.Ray_2_point__SWIG_0(swigCPtr, this, c), true);
  }

  public void point(int c, Point_2 ret) {
    CGAL_KernelJNI.Ray_2_point__SWIG_1(swigCPtr, this, c, Point_2.getCPtr(ret), ret);
  }

  public Direction_2 direction() {
    return new Direction_2(CGAL_KernelJNI.Ray_2_direction__SWIG_0(swigCPtr, this), true);
  }

  public void direction(Direction_2 ref) {
    CGAL_KernelJNI.Ray_2_direction__SWIG_1(swigCPtr, this, Direction_2.getCPtr(ref), ref);
  }

  public Vector_2 to_vector() {
    return new Vector_2(CGAL_KernelJNI.Ray_2_to_vector__SWIG_0(swigCPtr, this), true);
  }

  public void to_vector(Vector_2 ref) {
    CGAL_KernelJNI.Ray_2_to_vector__SWIG_1(swigCPtr, this, Vector_2.getCPtr(ref), ref);
  }

  public Line_2 supporting_line() {
    return new Line_2(CGAL_KernelJNI.Ray_2_supporting_line__SWIG_0(swigCPtr, this), true);
  }

  public void supporting_line(Line_2 ref) {
    CGAL_KernelJNI.Ray_2_supporting_line__SWIG_1(swigCPtr, this, Line_2.getCPtr(ref), ref);
  }

  public Ray_2 opposite() {
    return new Ray_2(CGAL_KernelJNI.Ray_2_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Ray_2 ref) {
    CGAL_KernelJNI.Ray_2_opposite__SWIG_1(swigCPtr, this, Ray_2.getCPtr(ref), ref);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Ray_2_is_degenerate(swigCPtr, this);
  }

  public boolean is_horizontal() {
    return CGAL_KernelJNI.Ray_2_is_horizontal(swigCPtr, this);
  }

  public boolean is_vertical() {
    return CGAL_KernelJNI.Ray_2_is_vertical(swigCPtr, this);
  }

  public boolean has_on(Point_2 c) {
    return CGAL_KernelJNI.Ray_2_has_on(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean collinear_has_on(Point_2 c) {
    return CGAL_KernelJNI.Ray_2_collinear_has_on(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean equals(Ray_2 p) {
    return CGAL_KernelJNI.Ray_2_equals(swigCPtr, this, Ray_2.getCPtr(p), p);
  }

  public boolean not_equals(Ray_2 p) {
    return CGAL_KernelJNI.Ray_2_not_equals(swigCPtr, this, Ray_2.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Ray_2_toString(swigCPtr, this);
  }

  public Ray_2 clone() {
    return new Ray_2(CGAL_KernelJNI.Ray_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Ray_2 other) {
    CGAL_KernelJNI.Ray_2_clone__SWIG_1(swigCPtr, this, Ray_2.getCPtr(other), other);
  }

}
