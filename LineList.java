import java.util.ArrayList;


public class LineList {
	
	ArrayList <String> l;
	
	public LineList(){
		l = new ArrayList<String>();
	}
	
	public int size() {
		return l.size();
	}
	
	public String get (int k){
		return l.get(k);
	}
	
	public void add(String line){
		l.add(line);
	}
	
	public String remove (int k){
		String temp = l.get(k);
		
		l.remove(k);
		
		return temp;
	}
	
	public void move(int index, int newIndex){
		
	}
	
	public static void main(String[] args){
		
	}
}
