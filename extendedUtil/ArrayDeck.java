/* ArrayList implementation of Deck
*  By: Devon Call
*/

package extendedUtil;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.List;

public class ArrayDeck<E> extends ArrayList<E> implements Deck<E>{
	private static final long serialVersionUID = -2904746283373124747L;	
	public ArrayDeck(){
		super();
	}
	
	public ArrayDeck(Collection<E> c){
		super(c);
	}
	
	public ArrayDeck(int initialCapacity){
		super(initialCapacity);
	}
	
	public List<E> getDrawStack(){
		return new LinkedList<E>(this);
	}
}