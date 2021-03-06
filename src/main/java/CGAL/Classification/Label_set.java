/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Classification;

public class Label_set {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Label_set(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Label_set obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_ClassificationJNI.delete_Label_set(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Label_set() {
    this(CGAL_ClassificationJNI.new_Label_set(), true);
  }

  public Label add(String label) {
    return new Label(CGAL_ClassificationJNI.Label_set_add(swigCPtr, this, label), true);
  }

  public boolean remove(Label label) {
    return CGAL_ClassificationJNI.Label_set_remove(swigCPtr, this, Label.getCPtr(label), label);
  }

  public void clear() {
    CGAL_ClassificationJNI.Label_set_clear(swigCPtr, this);
  }

}
