package Double_Letters;

import javax.swing.JOptionPane;

import org.w3c.dom.stylesheets.MediaList;

public class Program {

	static String x;

	public static void main(String[] args) {
		x = JOptionPane.showInputDialog("Which word do you want to convert?");
		dub(x);
	}

	static String dub(String l) {
		char[] m = l.toCharArray();
		StringBuilder o = new StringBuilder(l);
		for (int i = 0; i < m.length; i++) {
			char p = m[i];
			for (int j = 0; j < m.length; j++) {
				
			if(m[j] == p) {
//			o.deleteCharAt(i);
			o.delete(i, i+1);
		}}
		}
		String k = o.toString();
		System.out.println(k);
		return k;
	}
}
