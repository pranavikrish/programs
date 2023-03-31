package Tasks;
import java.io.FileReader;
public class NoVowels {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("E://Sri.txt ");
			int i = 0;
			String s = "";
			while ((i = fr.read()) != -1) {
				s = s + ((char) i);
			}
			fr.close();
			System.out.print(s);

			
		} catch (Exception e) {
			System.out.println(".....");
		}
	}
}




