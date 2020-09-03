/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */


#ifndef SWIGJAVA
#define SWIGJAVA
#endif



#ifdef __cplusplus
/* SwigValueWrapper is described in swig.swg */
template<typename T> class SwigValueWrapper {
  struct SwigMovePointer {
    T *ptr;
    SwigMovePointer(T *p) : ptr(p) { }
    ~SwigMovePointer() { delete ptr; }
    SwigMovePointer& operator=(SwigMovePointer& rhs) { T* oldptr = ptr; ptr = 0; delete oldptr; ptr = rhs.ptr; rhs.ptr = 0; return *this; }
  } pointer;
  SwigValueWrapper& operator=(const SwigValueWrapper<T>& rhs);
  SwigValueWrapper(const SwigValueWrapper<T>& rhs);
public:
  SwigValueWrapper() : pointer(0) { }
  SwigValueWrapper& operator=(const T& t) { SwigMovePointer tmp(new T(t)); pointer = tmp; return *this; }
  operator T&() const { return *pointer.ptr; }
  T *operator&() { return pointer.ptr; }
};

template <typename T> T SwigValueInit() {
  return T();
}
#endif

/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__))
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__))
# else
#   define SWIGUNUSED
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if defined(__GNUC__)
#  if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#    ifndef GCC_HASCLASSVISIBILITY
#      define GCC_HASCLASSVISIBILITY
#    endif
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif

/* Deal with Apple's deprecated 'AssertMacros.h' from Carbon-framework */
#if defined(__APPLE__) && !defined(__ASSERT_MACROS_DEFINE_VERSIONS_WITHOUT_UNDERSCORES)
# define __ASSERT_MACROS_DEFINE_VERSIONS_WITHOUT_UNDERSCORES 0
#endif

/* Intel's compiler complains if a variable which was never initialised is
 * cast to void, which is a common idiom which we use to indicate that we
 * are aware a variable isn't used.  So we just silence that warning.
 * See: https://github.com/swig/swig/issues/192 for more discussion.
 */
#ifdef __INTEL_COMPILER
# pragma warning disable 592
#endif


/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1, 
  SWIG_JavaIOException, 
  SWIG_JavaRuntimeException, 
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  jenv->ExceptionClear();
  excep = jenv->FindClass(except_ptr->java_exception);
  if (excep)
    jenv->ThrowNew(excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else

/*  Errors in SWIG */
#define  SWIG_UnknownError    	   -1
#define  SWIG_IOError        	   -2
#define  SWIG_RuntimeError   	   -3
#define  SWIG_IndexError     	   -4
#define  SWIG_TypeError      	   -5
#define  SWIG_DivisionByZero 	   -6
#define  SWIG_OverflowError  	   -7
#define  SWIG_SyntaxError    	   -8
#define  SWIG_ValueError     	   -9
#define  SWIG_SystemError    	   -10
#define  SWIG_AttributeError 	   -11
#define  SWIG_MemoryError    	   -12
#define  SWIG_NullReferenceError   -13




  #include <SWIG_CGAL/Java/exception.h>


SWIGINTERN void SWIG_JavaException(JNIEnv *jenv, int code, const char *msg) {
  SWIG_JavaExceptionCodes exception_code = SWIG_JavaUnknownError;
  switch(code) {
  case SWIG_MemoryError:
    exception_code = SWIG_JavaOutOfMemoryError;
    break;
  case SWIG_IOError:
    exception_code = SWIG_JavaIOException;
    break;
  case SWIG_SystemError:
  case SWIG_RuntimeError:
    exception_code = SWIG_JavaRuntimeException;
    break;
  case SWIG_OverflowError:
  case SWIG_IndexError:
    exception_code = SWIG_JavaIndexOutOfBoundsException;
    break;
  case SWIG_DivisionByZero:
    exception_code = SWIG_JavaArithmeticException;
    break;
  case SWIG_SyntaxError:
  case SWIG_ValueError:
  case SWIG_TypeError:
    exception_code = SWIG_JavaIllegalArgumentException;
    break;
  case SWIG_UnknownError:
  default:
    exception_code = SWIG_JavaUnknownError;
    break;
  }
  SWIG_JavaThrowException(jenv, exception_code, msg);
}


#include <typeinfo>
#include <stdexcept>


#include <string>


#if !defined(SWIGPYTHON) && !defined(SWIGJAVA)
  #define SWIG_CGAL_NON_SUPPORTED_TARGET_LANGUAGE 1
#else
  #define SWIG_CGAL_NON_SUPPORTED_TARGET_LANGUAGE 0
#endif  


  #include <SWIG_CGAL/Kernel/typedefs.h>
  #include <SWIG_CGAL/Kernel/Point_3.h>
  #include <SWIG_CGAL/Polyhedron_3/all_includes.h>
  #include <SWIG_CGAL/Point_set_3/all_includes.h>
  #include <SWIG_CGAL/Advancing_front_surface_reconstruction/impl.h>
  #include <SWIG_CGAL/Common/Output_iterator_wrapper.h>

typedef Polyhedron_3_wrapper< Polyhedron_3_,SWIG_Polyhedron_3::CGAL_Vertex_handle<Polyhedron_3_>,SWIG_Polyhedron_3::CGAL_Halfedge_handle<Polyhedron_3_>,SWIG_Polyhedron_3::CGAL_Facet_handle<Polyhedron_3_> >  Polyhedron_3_SWIG_wrapper; 

  void advancing_front_surface_reconstruction(
    Point_set_3_wrapper<CGAL_PS3> point_set,
    boost::function_output_iterator<Container_writer<int,int> > out,
    double radius_ratio_bound = 5,
    double beta = 0.52)
  {
    afsr_reconstruction<EPIC_Kernel>(point_set.get_data().points().begin(),
                                     point_set.get_data().points().end(),
                                     out, radius_ratio_bound, beta);
  }

  void advancing_front_surface_reconstruction(
    Point_set_3_wrapper<CGAL_PS3> point_set,
    Polyhedron_3_SWIG_wrapper& P,
    double radius_ratio_bound = 5,
    double beta = 0.52)
  {
    afsr_reconstruction_poly<EPIC_Kernel>(point_set.get_data().points().begin(),
                                          point_set.get_data().points().end(),
                                          P.get_data(), radius_ratio_bound, beta);
  }


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT void JNICALL Java_CGAL_Advancing_1front_1surface_1reconstruction_CGAL_1Advancing_1front_1surface_1reconstructionJNI_advancing_1front_1surface_1reconstruction_1_1SWIG_10(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jobject jarg2, jdouble jarg3, jdouble jarg4) {
  Point_set_3_wrapper< CGAL_PS3 > arg1 ;
  boost::function_output_iterator< Container_writer< int,int > > arg2 ;
  double arg3 ;
  double arg4 ;
  Point_set_3_wrapper< CGAL_PS3 > *argp1 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  argp1 = *(Point_set_3_wrapper< CGAL_PS3 > **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null Point_set_3_wrapper< CGAL_PS3 >");
    return ;
  }
  arg1 = *argp1; 
  {
    arg2=boost::make_function_output_iterator( Container_writer<int,int>(jarg2,"Ljava/lang/Integer;") );
  }
  arg3 = (double)jarg3; 
  arg4 = (double)jarg4; 
  {
    try{
      advancing_front_surface_reconstruction(arg1,arg2,arg3,arg4);
    }
    catch(std::exception& e){
      std::string error_msg("Error in SWIG_CGAL code. Here is the text of the C++ exception:\n");
      error_msg += e.what();
      if ( !throwJavaException(error_msg.c_str()) )
      throw; //rethrow exception that could not be thrown in java
    }
    catch(...){
      if ( !throwJavaException("Unknown error in SWIG_CGAL code") )
      throw; //rethrow exception that could not be thrown in java
    }
  }
}


SWIGEXPORT void JNICALL Java_CGAL_Advancing_1front_1surface_1reconstruction_CGAL_1Advancing_1front_1surface_1reconstructionJNI_advancing_1front_1surface_1reconstruction_1_1SWIG_11(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jobject jarg2, jdouble jarg3) {
  Point_set_3_wrapper< CGAL_PS3 > arg1 ;
  boost::function_output_iterator< Container_writer< int,int > > arg2 ;
  double arg3 ;
  Point_set_3_wrapper< CGAL_PS3 > *argp1 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  argp1 = *(Point_set_3_wrapper< CGAL_PS3 > **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null Point_set_3_wrapper< CGAL_PS3 >");
    return ;
  }
  arg1 = *argp1; 
  {
    arg2=boost::make_function_output_iterator( Container_writer<int,int>(jarg2,"Ljava/lang/Integer;") );
  }
  arg3 = (double)jarg3; 
  {
    try{
      advancing_front_surface_reconstruction(arg1,arg2,arg3);
    }
    catch(std::exception& e){
      std::string error_msg("Error in SWIG_CGAL code. Here is the text of the C++ exception:\n");
      error_msg += e.what();
      if ( !throwJavaException(error_msg.c_str()) )
      throw; //rethrow exception that could not be thrown in java
    }
    catch(...){
      if ( !throwJavaException("Unknown error in SWIG_CGAL code") )
      throw; //rethrow exception that could not be thrown in java
    }
  }
}


SWIGEXPORT void JNICALL Java_CGAL_Advancing_1front_1surface_1reconstruction_CGAL_1Advancing_1front_1surface_1reconstructionJNI_advancing_1front_1surface_1reconstruction_1_1SWIG_12(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jobject jarg2) {
  Point_set_3_wrapper< CGAL_PS3 > arg1 ;
  boost::function_output_iterator< Container_writer< int,int > > arg2 ;
  Point_set_3_wrapper< CGAL_PS3 > *argp1 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  argp1 = *(Point_set_3_wrapper< CGAL_PS3 > **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null Point_set_3_wrapper< CGAL_PS3 >");
    return ;
  }
  arg1 = *argp1; 
  {
    arg2=boost::make_function_output_iterator( Container_writer<int,int>(jarg2,"Ljava/lang/Integer;") );
  }
  {
    try{
      advancing_front_surface_reconstruction(arg1,arg2);
    }
    catch(std::exception& e){
      std::string error_msg("Error in SWIG_CGAL code. Here is the text of the C++ exception:\n");
      error_msg += e.what();
      if ( !throwJavaException(error_msg.c_str()) )
      throw; //rethrow exception that could not be thrown in java
    }
    catch(...){
      if ( !throwJavaException("Unknown error in SWIG_CGAL code") )
      throw; //rethrow exception that could not be thrown in java
    }
  }
}


SWIGEXPORT void JNICALL Java_CGAL_Advancing_1front_1surface_1reconstruction_CGAL_1Advancing_1front_1surface_1reconstructionJNI_advancing_1front_1surface_1reconstruction_1_1SWIG_13(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jobject jarg2_, jdouble jarg3, jdouble jarg4) {
  Point_set_3_wrapper< CGAL_PS3 > arg1 ;
  Polyhedron_3_SWIG_wrapper *arg2 = 0 ;
  double arg3 ;
  double arg4 ;
  Point_set_3_wrapper< CGAL_PS3 > *argp1 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg2_;
  argp1 = *(Point_set_3_wrapper< CGAL_PS3 > **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null Point_set_3_wrapper< CGAL_PS3 >");
    return ;
  }
  arg1 = *argp1; 
  arg2 = *(Polyhedron_3_SWIG_wrapper **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Polyhedron_3_SWIG_wrapper & reference is null");
    return ;
  } 
  arg3 = (double)jarg3; 
  arg4 = (double)jarg4; 
  {
    try{
      advancing_front_surface_reconstruction(arg1,*arg2,arg3,arg4);
    }
    catch(std::exception& e){
      std::string error_msg("Error in SWIG_CGAL code. Here is the text of the C++ exception:\n");
      error_msg += e.what();
      if ( !throwJavaException(error_msg.c_str()) )
      throw; //rethrow exception that could not be thrown in java
    }
    catch(...){
      if ( !throwJavaException("Unknown error in SWIG_CGAL code") )
      throw; //rethrow exception that could not be thrown in java
    }
  }
}


SWIGEXPORT void JNICALL Java_CGAL_Advancing_1front_1surface_1reconstruction_CGAL_1Advancing_1front_1surface_1reconstructionJNI_advancing_1front_1surface_1reconstruction_1_1SWIG_14(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jobject jarg2_, jdouble jarg3) {
  Point_set_3_wrapper< CGAL_PS3 > arg1 ;
  Polyhedron_3_SWIG_wrapper *arg2 = 0 ;
  double arg3 ;
  Point_set_3_wrapper< CGAL_PS3 > *argp1 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg2_;
  argp1 = *(Point_set_3_wrapper< CGAL_PS3 > **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null Point_set_3_wrapper< CGAL_PS3 >");
    return ;
  }
  arg1 = *argp1; 
  arg2 = *(Polyhedron_3_SWIG_wrapper **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Polyhedron_3_SWIG_wrapper & reference is null");
    return ;
  } 
  arg3 = (double)jarg3; 
  {
    try{
      advancing_front_surface_reconstruction(arg1,*arg2,arg3);
    }
    catch(std::exception& e){
      std::string error_msg("Error in SWIG_CGAL code. Here is the text of the C++ exception:\n");
      error_msg += e.what();
      if ( !throwJavaException(error_msg.c_str()) )
      throw; //rethrow exception that could not be thrown in java
    }
    catch(...){
      if ( !throwJavaException("Unknown error in SWIG_CGAL code") )
      throw; //rethrow exception that could not be thrown in java
    }
  }
}


SWIGEXPORT void JNICALL Java_CGAL_Advancing_1front_1surface_1reconstruction_CGAL_1Advancing_1front_1surface_1reconstructionJNI_advancing_1front_1surface_1reconstruction_1_1SWIG_15(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jobject jarg2_) {
  Point_set_3_wrapper< CGAL_PS3 > arg1 ;
  Polyhedron_3_SWIG_wrapper *arg2 = 0 ;
  Point_set_3_wrapper< CGAL_PS3 > *argp1 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg2_;
  argp1 = *(Point_set_3_wrapper< CGAL_PS3 > **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null Point_set_3_wrapper< CGAL_PS3 >");
    return ;
  }
  arg1 = *argp1; 
  arg2 = *(Polyhedron_3_SWIG_wrapper **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Polyhedron_3_SWIG_wrapper & reference is null");
    return ;
  } 
  {
    try{
      advancing_front_surface_reconstruction(arg1,*arg2);
    }
    catch(std::exception& e){
      std::string error_msg("Error in SWIG_CGAL code. Here is the text of the C++ exception:\n");
      error_msg += e.what();
      if ( !throwJavaException(error_msg.c_str()) )
      throw; //rethrow exception that could not be thrown in java
    }
    catch(...){
      if ( !throwJavaException("Unknown error in SWIG_CGAL code") )
      throw; //rethrow exception that could not be thrown in java
    }
  }
}


#ifdef __cplusplus
}
#endif
