package array;

import java.awt.FocusTraversalPolicy;
import java.util.Iterator;
import java.util.zip.ZipEntry;

public class XmasTree {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < (7-2*i+1)/2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2*i-1); k++) {
				System.out.print("*");
			}System.out.println();
		}

		int raw = 10;
		int max = 10*2 -1;
		
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < (max-2*i-1)/2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2*i -1); k++ ) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
