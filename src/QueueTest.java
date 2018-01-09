/** M Madden, M Schukat, 2005 - 2015: Abstract Stack interface */

import javax.swing.JOptionPane;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue q = new LLQueue(); //create a new Linked List queue 
		
		JOptionPane.showMessageDialog(null, "About to enqueue words onto queue.");
		
		for(int i=1; i<=10; i++){
			q.enqueue("Word " + i); //add strings to the Linked List
		}

		String front = (String)q.front();
		JOptionPane.showMessageDialog(null, "The Object at the front of the list is: \n" + front);
		
		JOptionPane.showMessageDialog(null, "The size of the LL is: \n" + q.size());
		
		JOptionPane.showMessageDialog(null, "We will now remove two elements and see \nif the list updates accordingly");
		String word1 = (String)q.dequeue(); // Note: have to cast Objects popped to String
		JOptionPane.showMessageDialog(null, "Word dequeued: \n" + word1);
		String word2 = (String)q.dequeue(); // Note: have to cast Objects popped to String
		JOptionPane.showMessageDialog(null, "Word dequeued: \n" + word2);
		
		String newFront = (String)q.front();
		JOptionPane.showMessageDialog(null, "The new Object at the front of the list is: \n" + newFront);
		
		JOptionPane.showMessageDialog(null, "The new size of the LL is: \n" + q.size());
		
		JOptionPane.showMessageDialog(null, "We will now dequeue all objects in the LL.");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: \n" + word);
		}
		
		JOptionPane.showMessageDialog(null, "About to check if the code will stop you from \ndequeuing when there is nothing in the array");
		q.dequeue();
		
		System.exit(0);
	}
}
