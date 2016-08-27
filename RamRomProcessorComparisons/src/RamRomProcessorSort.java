import java.util.Comparator;

public class RamRomProcessorSort implements Comparator<Computer> {

	

	@Override
	public int compare(Computer o1, Computer o2) {
		if(o1.getRam()<o2.getRam())
			return 1;
		else
		return	checkROM(o1,o2);
		
	}

	private int checkROM(Computer o1, Computer o2) {
		if(o1.getRom()<o2.getRom())
			return 1;
		else
		return checkProcessor(o1,o2);
	}

	private int checkProcessor(Computer o1, Computer o2) {
		if(o1.getPreSpeed()<o2.getPreSpeed())
			return 1;
		return -1;
	}

}
