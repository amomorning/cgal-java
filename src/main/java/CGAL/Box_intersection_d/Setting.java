/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Box_intersection_d;

public enum Setting {
  COMPLETE,
  BIPARTITE;

  public final int swigValue() {
    return swigValue;
  }

  public static Setting swigToEnum(int swigValue) {
    Setting[] swigValues = Setting.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Setting swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Setting.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Setting() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Setting(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Setting(Setting swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

