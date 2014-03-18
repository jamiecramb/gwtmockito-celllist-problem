gwtmockito-celllist-problem
===========================
This project is an example of a problem with GWT Mockito that is faced when trying to test a class which has a @UiFactory method in it that creates a CellList.

I have been unable to get this working so far... I've tried the following approaches and had the following results:

| Approach  | Result |
| ------------- | ------------- |
|Just using the standard GwtMockitoTestRunner  |  java.lang.ClassCastException: com.google.gwt.user.client.Element$$EnhancerByMockitoWithCGLIB$$19f20bd7 cannot be cast to com.google.gwt.dom.client.DivElement |
|Using a custom runner that adds CellList to the list of classes to be stubbed | java.lang.NoClassDefFoundError: com/google/gwt/user/cellview/client/CellList |
|Using the @WithClassesToStub annotation to provide the CellList as a class to be stubbed out|java.lang.ArrayStoreException: sun.reflect.annotation.TypeNotPresentExceptionProxy|
