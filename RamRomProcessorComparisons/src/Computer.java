import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Computer {
	
	//Ram in GB
	//Rom in GB
	//processor speed in Ghz
	
	int Ram;
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getRom() {
		return Rom;
	}
	public void setRom(int rom) {
		Rom = rom;
	}
	public int getPreSpeed() {
		return preSpeed;
	}
	public void setPreSpeed(int preSpeed) {
		this.preSpeed = preSpeed;
	}
	int Rom;
	int preSpeed;

	public Computer(int ram,int rom,int prospeed)
	{
		this.setRam(ram);
		this.setRom(rom);
		this.setPreSpeed(prospeed);
	}
	
	
	public static void main(String args[])
	{
		ArrayList<Computer> c= new ArrayList<Computer>();
		c.add(new Computer(4, 5, 3));
		c.add(new Computer(1,10,3));
		c.add(new Computer(5, 1, 3));
		
		printlist(c);
        RamRomProcessorSort srt = new RamRomProcessorSort();
		Collections.sort(c, srt);
		printlist(c);
		
	}
	private static void printlist(ArrayList<Computer> c) {
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i).Ram +" " + c.get(i).Rom + " " +c.get(i).preSpeed);
		}
		
	}
}
