public class Cell implements Cloneable {

	private int pos_x = 50;
	private int pos_y = 25;
	private boolean canMut = false;
	private int probOfMut = 50;
	private int age = 0;
	
	public void Display(int i) {
		
		System.out.printf("cell : " + i + "\n");
		System.out.printf(" x =  " +  pos_x + "\n");
		System.out.printf(" y =  " +  pos_y + "\n");
		System.out.printf("Can Mut : " + canMut + "\n");
		System.out.printf("Age : " + age +"\n");
		System.out.printf("Prob : " + probOfMut +"\n");
		
	}
	
	public void happyBirthday() {
		age++;
	}
	
	public boolean ripCell() {
		if(age > 3) {
			this.canMut = false;
			return true;
		}
		
		else return false;
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	public int getProbOfMut() {
		return probOfMut;
	}

	public void setProbOfMut(int probOfMut) {
		this.probOfMut = probOfMut;
	}

	public boolean canMut() {
		return canMut;
	}

	public void setCanMut(boolean canMut) {
		this.canMut = canMut;
	}

	public int getPos_x() {
		return pos_x;
	}

	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}

	public int getPos_y() {
		return pos_y;
	}

	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}

	@Override
	public Object clone() 
	   { 
	       Object obj = null; 
	       try 
	       { 
	       	obj = super.clone(); 
	       }  
	       catch (CloneNotSupportedException e)  
	       { 
	           e.printStackTrace(); 
	       } 
        return obj; 
       }
	
}
