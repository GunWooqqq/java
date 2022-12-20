package ez2beat_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread {
   
	private Image noteBasic =  new ImageIcon(Main.class.getResource("/images/noteBasic.jpg")).getImage();
	private Image noteRouteLine =  new ImageIcon(Main.class.getResource("/images/noteRouteLine.png")).getImage();
	private Image judgementLine =  new ImageIcon(Main.class.getResource("/images/judgementLine.png")).getImage();
	private Image gameInfoImage =  new ImageIcon(Main.class.getResource("/images/gameinfo.png")).getImage();
	
//	private Image noteRoute =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteS =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteD =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteF =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteSpace1 =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage(); // 스페이스바는 길어서 2개로
	private Image noteRouteSpace2 =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteJ =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteK =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteL =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	
//	private String titleName;
	
	ArrayList<Note> noteList = new ArrayList<Note>();
	
	
//	public Game (String TitleName) {
//	dropNotes(titleName);
//	}
//	
//	
	

	public void ScreenDraw(Graphics2D g) {
		
	
		   g.drawImage(noteRouteS,228,30, null); // 노트 떨어지는 칸
		   g.drawImage(noteRouteD,332,30, null);
		   g.drawImage(noteRouteF,436,30, null);
		   g.drawImage(noteRouteSpace1,540,30, null);
		   g.drawImage(noteRouteSpace2,640,30, null);
		   g.drawImage(noteRouteJ,744,30, null);
		   g.drawImage(noteRouteK,848,30, null);
		   g.drawImage(noteRouteL,952,30, null);
		   g.drawImage(noteRouteLine,224,30,null); //노트 구분선
		   g.drawImage(noteRouteLine,328,30,null);
		   g.drawImage(noteRouteLine,432,30,null);
		   g.drawImage(noteRouteLine,536,30,null);
		   g.drawImage(noteRouteLine,740,30,null);
		   g.drawImage(noteRouteLine,844,30,null);
		   g.drawImage(noteRouteLine,948,30,null);
		   g.drawImage(noteRouteLine,1052,30,null);
		   
		   for(int i = 0; i < noteList.size(); i++) { // 객체지향 스럽게 리스트에 있는 노트들을 불러와서 그려 줄 수 있게
			   
			   Note note = noteList.get(i);   
			   note.screenDraw(g);
			   
		   }

			   g.drawImage(gameInfoImage, 0,660,null);
			   g.drawImage(judgementLine,0,580, null);
		   g.drawImage(noteBasic, 228,120,null);
		   g.drawImage(noteBasic, 332,580,null);
		   g.drawImage(noteBasic, 436,500,null);
		   g.drawImage(noteBasic, 540,340,null);
		   g.drawImage(noteBasic, 640,340,null);
		   g.drawImage(noteBasic, 744,325,null);
		   g.drawImage(noteBasic, 848,305,null);
		   g.drawImage(noteBasic, 952,305,null);
		   
		   g.setColor(Color.white); // 곡 제목 글자 색
		   g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING , RenderingHints.VALUE_TEXT_ANTIALIAS_ON); // 매끄럽게 출력하기 위한 렌더링 작업
		   g.setColor(Color.white); 
		   g.setFont(new Font("Arial",Font.BOLD,30)); // 넣은 곡 제목 글자 조정 Arial 폰트로 , 굵게 , 30 크기
		   g.drawString ("RDM - Andy Lee", 20 , 702); // 곡 제목과 좌표 
		   g.drawString ("HARD", 1190 , 702); // 난이도 표시
		   
		 
		   g.setFont(new Font("Arial",Font.BOLD,26));
		   g.setColor(Color.DARK_GRAY); 
		   g.drawString("S",270,609); // 입력 키 알려주는 텍스트
		   g.drawString("D",374,609);
		   g.drawString("F",478,609);
		   g.drawString("Space Bar",580,609);
		   g.drawString("J",784,609);
		   g.drawString("K",889,609);
		   g.drawString("L",993,609);
		   g.setColor(Color.LIGHT_GRAY);
		   g.setFont(new Font("Elephant",Font.BOLD,30));
		   g.drawString("000000", 565, 702); // 점수 넣을거임
		   
		   
	}
	
	public void pressS() { // S 입력 이벤트 처리 함수
		
		noteRouteS = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		
	}
	
public void releaseS() { // S 입력 이벤트 처리 함수
		
		noteRouteS = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
		
	}

public void pressD() { // S 입력 이벤트 처리 함수
	
	noteRouteD = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
	
}

public void releaseD() { // S 입력 이벤트 처리 함수
	
	noteRouteD = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	
}
	
public void pressF() { // S 입력 이벤트 처리 함수
	
	noteRouteF = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
	
}

public void releaseF() { // S 입력 이벤트 처리 함수
	
	noteRouteF = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	
}

public void pressSpace() { // S 입력 이벤트 처리 함수
	
	noteRouteSpace1 = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
	noteRouteSpace2 = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
}

public void releaseSpace() { // S 입력 이벤트 처리 함수
	
	noteRouteSpace1 = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	noteRouteSpace2 = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
}

public void pressJ() { // S 입력 이벤트 처리 함수
	
	noteRouteJ = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
	
}

public void releaseJ() { // S 입력 이벤트 처리 함수
	
	noteRouteJ = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	
}

public void pressK() { // S 입력 이벤트 처리 함수
	
	noteRouteK = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
	
}

public void releaseK() { // S 입력 이벤트 처리 함수
	
	noteRouteK = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	
}

public void pressL() { // S 입력 이벤트 처리 함수
	
	noteRouteL = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
	
}

public void releaseL() { // S 입력 이벤트 처리 함수
	
	noteRouteL = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	
}

	public void run() {}
	
 public void dropNotes(String TitleName) {
	 
	 noteList.add(new Note(228,120, "short"));
	 noteList.add(new Note(332,580, "short"));
	 noteList.add(new Note(436,500, "short"));
	 noteList.add(new Note(540,340, "long"));
	 noteList.add(new Note(744,325, "short"));
	 noteList.add(new Note(848,305, "short"));
	 noteList.add(new Note(952,305, "short"));
	 
 }
}

