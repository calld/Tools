/* Deck Interface extension of List
*  By: Devon Call
*/

package extendedUtil;
import java.util.List;
import java.util.Random;

public interface Deck<E> extends List<E>{
	default void shuffle(){
		shuffle(new Random());
	}
	default void shuffle(Random r){
		shuffle(0, this.size(), r);
	}
	default void shuffle(int start, int end, Random r) throws IndexOutOfBoundsException{
		if(end < start){
			throw new IndexOutOfBoundsException("improper range shuffle: start > end");
		}
		for(int i = end - start; i > 0; i--){
			int idx = r.nextInt(i);
			E temp = this.get(idx + start);
			this.set(idx, this.get(i + start - 1));
			this.set(i + start - 1, temp);
		}
	}
	List<E> getDrawStack();
}