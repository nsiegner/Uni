
package eidi2.sose23.Siegner.Nick.sheet01.ex03;

public class DynamicArray extends Array{
    
    public DynamicArray() {
        this.array = new int[10];
    }

    public DynamicArray(int n) {
        this.array = new int[n];
    }

    public DynamicArray(int... values) {
        this.array = new int[values.length];
        for(int i : values) {
        	this.add(i);
        	
        }
        
    }

    public void resize(int newLength) {
    	if(newLength < 0) {
    		throw new IllegalArgumentException();
    	}
    	
    	int oldSize = this.size();
    	int[] oldArray = this.array;
    	this.array = new int[newLength];
    	
    	this.nextSpace = 0;
    	
    	if(newLength > oldSize) {
    		for(int i: oldArray) {
    			this.add(i);
    			
    		}
    		for(int i = oldSize; i < newLength; i++) {
    			this.array[i] = 0;
    		}
    		
    		
    	}
    	
    	if(newLength < oldSize) {
    		
			for(int i = 0; i < newLength; i++) {
				if(i < oldSize) {
    				this.add(oldArray[i]);
				}
				else {
					this.array[i] = 0;
				}
			}
    		
    		
    	}
    	
    }
    
    public void add(int val) {
    	if(this.nextSpace == this.array.length) {
    		//der tatsächliche Wert um den man das Array erweitert kann von anwendung zu anwendung variieren
    		//zum Beispiel kann es Anwendungen geben, bei denen es viele Werte geben wird die zusätzlich in das 
    		//Array gespeichert werden müssen, es gibt aber auch Anwendungen in denen es nur wenige weitere Werte 
    		//gibt die in das Array gespeichert werden müssen.
    		this.resize(this.size()+10);
    		this.add(val);
    		
    	}
    	
    	this.array[this.nextSpace] = val;
    	this.nextSpace++;
    
    	
    	
    }
}