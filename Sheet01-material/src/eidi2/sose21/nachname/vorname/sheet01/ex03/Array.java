package eidi2.sose21.nachname.vorname.sheet01.ex03;



public abstract class Array{
    
	public static void main(String[] args) {
		DynamicArray array = new DynamicArray();
		for(int i = 0; i < 10; i++) {
			array.add(i+1);
		}
		System.out.println(array);
		array.remove(4);
		System.out.println(array);
		
		
	}
	
	protected int[] array;
    
    protected int nextSpace;
    
    public void add(int val) {
    	if(this.nextSpace == this.array.length) {
    		throw new ArrayIndexOutOfBoundsException();
    		
    	}
    	
    	this.array[this.nextSpace] = val;
    	this.nextSpace++;
    }

    public int size() {
        
    	return nextSpace;
    }

    public int get(int index) {
    	if(index<0 || index>this.array.length-1) {
    		throw new ArrayIndexOutOfBoundsException();
    		
    		
    	}
    	else {
    	return this.array[index];
    	}	
    }

    public void remove(int index) {
    	
    	if(index<0 || index >= this.size()) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	
    	else {
    		for(int i = index;i<this.size()-1;i++) {
    			this.array[i] = this.array[i+1];
    			this.array[i+1] = 0;
    			
    			
    			
    		}
    		this.nextSpace--;
    		
    	}
    	
    	
    }
    
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return new String(sb);
    }
}
