
Public Sa

class GrandParent 
{ 
    void doMethod() 
    { 
        System.out.println("Grandparent genes"); 
    } 
} 
  
// First Parent class 
class Parent1 extends GrandParent 
{ 
    void doMethod() 
    { 
        System.out.println("Parent1 genes"); 
    } 
} 
  
// Second Parent Class 
class Parent2 extends GrandParent 
{ 
    void doMethod() 
    { 
        System.out.println("Parent2 genes"); 
    } 
} 