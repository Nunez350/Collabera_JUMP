//an example of mutiple inherintance interface


interface Mom{
    void gene1();
}

interface Dad {   
    void gene2();
}


/*In the following class, because we are implementing the two interfaces Mom and Dad,
 we must define the functions inside this class. Now if we do not implement one of the methods like say the gene2,
  the program will not compile.
*/
class Child implements Mom,Dad{
    public void gene1() {
        System.out.print("mom_gene ");
    }

    public void gene2(){
        System.out.print("dad_gene ");
    }
 
    public static void main(String args[]) {
    Child s = new Child();
    s.gene1();
    s.gene2();
    System.out.println("\nWe have a child!");
}

}
