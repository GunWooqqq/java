package ez2beat_1;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread {
	
	private Image noteBasic =  new ImageIcon(Main.class.getResource("/images/noteBasic.jpg")).getImage();
	private int x,y;
	private String noteType;
	
	public Note(int x, int y, String noteType) {
		super();
		this.x = x;
		this.y = y;
		this.noteType = noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("short"));
		{
			g.drawImage(noteBasic,x,y,null);
		}
		 if(noteType.equals("long")) {
			g.drawImage(noteBasic, x, y, null);
			g.drawImage(noteBasic, x + 100, y, null);
		}
	}
	@Override
	public void run() {}
	
}
