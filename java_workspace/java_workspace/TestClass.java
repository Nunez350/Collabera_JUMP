interface Writeable {
    void writes();
}
interface Readable 
{   
    void reads();
     
}
class TestClass implements Readable,Writable
{
    public void reads()
    {
    system.out.print("Student reads.. ");
    }
    public void writes()
    {
    System.out.print("Student writes..");
    }
 
public static void main(String args[]) {
    TestClass s = new TestClass();
    s.reads();
    s.writes();
    }
}

