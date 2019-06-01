# Annotation practice task

This is practice task related to lesson about annotations

## Getting Started

From this lesson you will learn how to create custom annotations, and how to read information about them in your code

#### Prerequisites

For successful passing the task you will need some additional information from Reflection API.
###### To get list of methods:
```
Object object = new Object();
Method[] methods = object.getClass().getDeclaredMethods();
```
###### To execute method:
```
method.invoke(object, arg1, arg2, ...)
```
### Task

1. Clone repository
2. In annotations package create your own annotation:
* **@Execute** annotation
* With int parameter **times** and default value **1**
* Annotation should be available in runtime
* Annotation should be applicable only to methods
3. Annotate with created annotation any two methods from **AnnotatedClass** class
4. In one of annotations change default value for **times** parameter
5. In **AnnotationTester** class implement the **main** method:
* Using Reflection API get list of methods from **AnnotatedClass** 
* Execute only annotated methods from the class
* Each method should be executed *n* times, depending on **times** value from annotation.

