import java.util.ArrayList;
import java.util.LinkedList;

class KeyVal
{
	Object key;
	Object val;
	}

public class MyHashMap {

	int size=10;
	LinkedList<ArrayList<KeyVal>> list = new LinkedList<>();
	//ArrayList<?> ar = new ArrayList<>();
	
	public MyHashMap()
	{
		initList(size);
	}

	public MyHashMap(int size)
	{
		initList(size);
	}
	
	private void initList(int size2) {
		for (int i = 0; i < size2; i++) {
			list.add(new ArrayList<>());
		}
		
	}

	public void put(Object key,Object value)
	{
		KeyVal kv = new KeyVal();
		kv.key = key;
		kv.val = value;
		
		int pos = hash(key);
		ArrayList ar = list.get(pos);
		
		for (int i = 0; i < ar.size(); i++) {
			KeyVal kv1 = (KeyVal) ar.get(i);
			if(kv1.key == key){
				kv1.val = value;
				return ;
			}
		}
		ar.add(kv);
		list.set(pos, ar);
	
	}
	public Object get(Object key)
	{
		return null;
	}

	private int hash(Object key) {
		return key.hashCode()%size;
		
	}
	
}
