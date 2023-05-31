package GARBASE_COLLECTOR;


class finalizee{
    public void finalize()
    {
        System.out.println("object is garbage collected 1");
    }
}

public class Main {
    public void finalize()
    {
        System.out.println("object is garbage collected 2");
    }

    public static void main(String args[])
    {
//        Main s1=new Main();
          Main s2=new Main();
          finalizee s1=new finalizee();
        s1=null;
        s2=null;
        System.gc();
    }
}

//Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC).
// This thread calls to finalize() method before object is garbage collected.

