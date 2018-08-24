package window;

import java.awt.Color;
import java.awt.Container;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JFame extends JFrame{
	public void CreateJFame(){
	JFrame jf=new JFrame();
	Container container=jf.getContentPane();
	JLabel jl=new JLabel("这是一个聊天室");
	jl.setHorizontalAlignment(SwingConstants.CENTER);
	container.add(jl);
	container.setBackground(Color.pink);
	jf.setVisible(true);
	jf.setSize(200, 150);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JFame().CreateJFame();
	}
	
	
	
}
