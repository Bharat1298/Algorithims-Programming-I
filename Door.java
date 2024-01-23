public class Door {
	private String name;
	
	private boolean state;
	
	public void setName(String n)
    {
        name = n;
    }

    public boolean isOpen()
    {
        return state;
    }

    public void open()
    {
       state = true;
    }

    public void close()
    {
        state = false;
    }
    
    public void output()
    {
       System.out.print(name);
       System.out.print(": ");
       if (state)
       {
          System.out.println("open");
       }
       else
       {
          System.out.println("closed");
       }
    }
}
