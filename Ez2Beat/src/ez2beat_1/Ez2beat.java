package ez2beat_1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.util.ArrayList;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ez2beat extends JFrame {
	
	private Image screenImage;     // 인트로 이미지 삽입시 버벅거림 현상을 줄이기 위해 더블버퍼를 사용하기 위해 생성 메인 클래스 위치 기반, intro.JPG 를 intro 변수에 초기화
	private Graphics screenGraphic;
	

	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/exit_entered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("/images/exit.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/startButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("/images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/quitButtonEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("/images/quitButtonBasic.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/rightEntered.png"));
	private ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("/images/rightBasic.png"));
	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/leftEntered.png"));
	private ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("/images/leftBasic.png"));
	private ImageIcon easyButtonBasic = new ImageIcon(Main.class.getResource("/images/easyButtonBasic.png"));
	private ImageIcon easyButtonEntered = new ImageIcon(Main.class.getResource("/images/easyButtonEntered.png"));
	private ImageIcon hardButtonBasic = new ImageIcon(Main.class.getResource("/images/hardButtonBasic.png"));
	private ImageIcon hardButtonEntered = new ImageIcon(Main.class.getResource("/images/hardButtonEntered.png"));
	private ImageIcon backButtonBasic = new ImageIcon(Main.class.getResource("/images/backButtonBasic.png"));
	private ImageIcon backButtonEntered = new ImageIcon(Main.class.getResource("/images/backButtonEntered.png"));
	
	//private Image titleImage = new ImageIcon(Main.class.getResource("/images/intro.jpg")).getImage();
//    private Image StayImage ;
//	private Image selectedImage ; 
	private Image background =  new ImageIcon(Main.class.getResource("/images/intro.jpg")).getImage(); // 인트로 사진 담기위한 하나의 객체 생성
//	private Image gameInfoImage =  new ImageIcon(Main.class.getResource("/images/gameinfo.png")).getImage();   // Gmae 클래스로 옮김
//	private Image judgementLine =  new ImageIcon(Main.class.getResource("/images/judgementLine.png")).getImage();
//	private Image noteRoute =  new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
//	private Image noteRouteLine =  new ImageIcon(Main.class.getResource("/images/noteRouteLine.png")).getImage();
//	private Image noteBasic =  new ImageIcon(Main.class.getResource("/images/noteBasic.jpg")).getImage();
	
	private JLabel menuBar = new JLabel (new ImageIcon(Main.class.getResource("/images/menuBar.png"))); // JLabel menuBar 객체 안에 해당 이미지 삽입

	
	
	private JButton exitButton = new JButton(exitButtonBasicImage);  // 변수 생성
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton rightButton = new JButton(rightButtonBasicImage);
	private JButton leftButton = new JButton(leftButtonBasicImage);
	private JButton easyButton = new JButton(easyButtonBasic);
	private JButton hardButton = new JButton(hardButtonBasic);
	private JButton backButton = new JButton(backButtonBasic);

	
	private int mouseX, mouseY;
	
//	private Image StayImage ;
	private Image selectedImage ;
//	private boolean isStayScreen = false;
	private boolean isMainScreen = false; 
	private boolean isGameScreen = false; // 게임화면으로 넘어왔는지 확인하는 변수
//	
	//ArrayList<Track> trackList = new ArrayList<Track>(); // 곡 트랙 변수 닮을 수 있는 가변 배열 생성 
//	
	
	//private Music selectedMusic; // 코드 함수화 통해 간결하고 선언 해준 변수 사용 할 수 있도록
	//private int nowSelected = 0; // 현재 선택된 트랙의 번호를 의미. 0부터 시작이 첫곡
	
   public static Game game = new Game() ; // 게임 변수는 프로젝트 전체에서 사용되는 변수 왜냐하면 곡을 하나만 할게 아니기 때문
	
//	Music introMusic = new Music("introMusic.mp3" ,true);  // isLoop를 이용해 true 값을 줘서 introMusic 무한 재생
	
	public Ez2beat() {
		setUndecorated(true); //실행 시 메뉴바가 안 보이게
		setTitle("Ez2Beat");
		setSize(Main.SCREEN_WIDTH, Main.SEREEN_HEIGHT); // 상수 선언한 사이즈로 제작
		setResizable(false); // 이미지 크기 변경 불가
		setLocationRelativeTo(null); // 실행 시 중간 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 종료되게
		setVisible(true); //보이게 정상 출력
		setBackground(new Color (0,0,0,0)); // painComponent 이후 배경색 흰색이 아닌 회색
	    setLayout(null); // 버튼이나 메뉴를 넣었을 시 그 위치에
	    
	    addKeyListener(new KeyListener());
	    
		easyButton.setVisible(false);
		hardButton.setVisible(false);
		backButton.setVisible(false);
//	    
		
//			introMusic.start();
//			
	    
//        trackList.add(new Track("RDM_intro.png", "RDM_intro.png", "RDM.png", "" , "RDM.mp3"));   // Track 에서 만든 5개 매개변수 생성자
//        trackList.add(new Track("Stay_intro.png", "Stay_intro.png", "Stay.png", "" , "Stay.mp3"));
//        trackList.add(new Track("images/Say That U_intro.png", "images/Say That U_intro.png", "Say That U.png", "" , "Say That U.mp3"));

	    
	    
	    exitButton.setBounds(1245,0,30,30);  // (x,y,width,height)
	    exitButton.setBorderPainted(false);
	    exitButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
	    exitButton.setFocusPainted(false);
	    exitButton.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		exitButton.setIcon(exitButtonEnteredImage);
	    		exitButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false); 버튼 클릭시 나는 소리
	    		//ButtonEnteredMusic.start();
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		exitButton.setIcon(exitButtonBasicImage);
	    		exitButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
	    	}
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
//	    		try {
//	    			Thread.sleep(1000); // 바로 종료되면 소리가 안들리니 1초 슬립동안 소리가 들리고 종료
//	    		}catch (InterruptedException ex) {
//	    			ex.printStackTrace();
//	    		}
	    		System.exit(0);
	    	}
	    	
	    });
	    
	    add(exitButton);
	    
	    startButton.setBounds(40,600,400,100);
	    startButton.setBorderPainted(false);
	    startButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
	    startButton.setFocusPainted(false);
	    startButton.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		startButton.setIcon(startButtonEnteredImage);
	    		startButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		startButton.setIcon(startButtonBasicImage);
	    		startButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
	    	}
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
                //게임 시작 이벤트
	    		
	    		//introMusic.close(); // 곡 선택 화면에 들어오면 인트로 음악 꺼지게
	    	
                enterMain();
//	    		startButton.setVisible(false); // 시작버튼이 보이지 않음.
//	    		quitButton.setVisible(false);
//	    		
//	    		rightButton.setVisible(true); // 오른쪽 왼쪾 버튼은 보이게ㅐ
//	    		leftButton.setVisible(true);
//	    		easyButton.setVisible(true);
//	    		hardButton.setVisible(true);
//	    		selectedImage = new ImageIcon(Main.class.getResource("/images/RDM_intro.png")).getImage();
//	    		background = new ImageIcon(Main.class.getResource("/images/main_Bakground.jpg")).getImage(); // 시작하기를 누른 후 시작하기 종료하기 버튼은 사라지고 배경화면 변경
//	    		isMainScreen = true;
	    	}
	    });
	    
	    add(startButton);
	    
	    
	    quitButton.setBounds(840,600,400,100);
	    quitButton.setBorderPainted(false);
	    quitButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
	    quitButton.setFocusPainted(false);
	    quitButton.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		quitButton.setIcon(quitButtonEnteredImage);
	    		quitButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		quitButton.setIcon(quitButtonBasicImage);
	    		quitButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
	    	}
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
//	    		try {
//	    			Thread.sleep(1000); // 바로 종료되면 소리가 안들리니 1초 슬립동안 소리가 들리고 종료
//	    		}catch (InterruptedException ex) {
//	    			ex.printStackTrace();
//	    		}
	    		System.exit(0);
	    	}
	    	
	    });
	    
	    add(quitButton);
	   
	   rightButton.setVisible(false); 
	   rightButton.setBounds(1200,600,60,60); 
	   rightButton.setBorderPainted(false);
	   rightButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
	   rightButton.setFocusPainted(false);
	   rightButton.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		rightButton.setIcon(rightButtonEnteredImage);
	    		rightButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		rightButton.setIcon(rightButtonBasicImage);
	    		rightButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
	    	}
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
	    		//ButtonEnteredMusic.start();
//	    		try {
//	    			Thread.sleep(1000); // 바로 종료되면 소리가 안들리니 1초 슬립동안 소리가 들리고 종료
//	    		}catch (InterruptedException ex) {
//	    			ex.printStackTrace();
//	    		}
	    		// 오른쪽 버튼 이벤트
	    		
//	    		selectRight();
	    		
//	    		
//	    		isMainScreen = false;
//	    		StayImage = new ImageIcon(Main.class.getResource("/images/Stay_intro.png")).getImage(); // 시작하기를 누른 후 시작하기 종료하기 버튼은 사라지고 배경화면 변경
//	    		rightButton.setVisible(true); // 오른쪽 왼쪾 버튼은 보이게ㅐ
//	    		leftButton.setVisible(true);
	    		
	    	}
	    	
	    });
	    
	    add(rightButton);
	    
	    leftButton.setVisible(false);
	    leftButton.setBounds(40,600,60,60); 
	    leftButton.setBorderPainted(false);
	    leftButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
	    leftButton.setFocusPainted(false);
	    leftButton.addMouseListener(new MouseAdapter(){
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		leftButton.setIcon(leftButtonEnteredImage);
		    		leftButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
		    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
		    		//ButtonEnteredMusic.start();
		    	}
		    	@Override
		    	public void mouseExited(MouseEvent e) {
		    		leftButton.setIcon(leftButtonBasicImage);
		    		leftButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
		    	}
		    	@Override
		    	public void mousePressed(MouseEvent e) {
		    		//Music ButtonEnteredMusic = new Music("introMusic.mp3" ,false);
		    		//ButtonEnteredMusic.start();
//		    		try {
//		    			Thread.sleep(1000); // 바로 종료되면 소리가 안들리니 1초 슬립동안 소리가 들리고 종료
//		    		}catch (InterruptedException ex) {
//		    			ex.printStackTrace();
//		    		}
//	    		selectLeft();
		    		
		    		isMainScreen = false;
		    	}
		    	
		    });
		    
		    add(leftButton);
		    
		    easyButton.setBounds(375,580,250,67);  // (x,y,width,height)
		    easyButton.setBorderPainted(false);
		    easyButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
		    easyButton.setFocusPainted(false);
		    easyButton.addMouseListener(new MouseAdapter(){
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		easyButton.setIcon(easyButtonEntered);
		    		easyButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
		    		
		    	}
		    	@Override
		    	public void mouseExited(MouseEvent e) {
		    		easyButton.setIcon(easyButtonBasic);
		    		easyButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
		    	}
		    	@Override
		    	public void mousePressed(MouseEvent e) {
		    	
		    	 // 난이도 쉬움 이벤트
		    		isMainScreen= false;
		    		backButton.setVisible(true);
		    		rightButton.setVisible(false); 
		    		leftButton.setVisible(false);
		    		easyButton.setVisible(false);
		    		hardButton.setVisible(false);
		    		background =  new ImageIcon(Main.class.getResource("/images/RDM.png")).getImage();
		    		isGameScreen = true;
		    		setFocusable(true);
		    	}
		    	
		    });
		    
		    add(easyButton);
		    
		    hardButton.setBounds(655,580,250,67);  // (x,y,width,height)
		    hardButton.setBorderPainted(false);
		    hardButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
		    hardButton.setFocusPainted(false);
		    hardButton.addMouseListener(new MouseAdapter(){
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		hardButton.setIcon(hardButtonEntered);
		    		hardButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
		    		
		    	}
		    	@Override
		    	public void mouseExited(MouseEvent e) {
		    		hardButton.setIcon(hardButtonBasic);
		    		hardButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
		    	}
		    	@Override
		    	public void mousePressed(MouseEvent e) {
		    	
		    	 // 난이도 어려움 이벤트
		    		isMainScreen= false;
		    		backButton.setVisible(true);
		    		rightButton.setVisible(false); 
		    		leftButton.setVisible(false);
		    		easyButton.setVisible(false);
		    		hardButton.setVisible(false);
		    		background =  new ImageIcon(Main.class.getResource("/images/RDM.png")).getImage();
		    		isGameScreen = true; 
		    		setFocusable(true);
		    	
		    	}
		    	
		    });
		    
		    add(hardButton);
		    
		   
		    backButton.setBounds(20,50,60,60);  // (x,y,width,height)
		    backButton.setBorderPainted(false);
		    backButton.setContentAreaFilled(false); // 3개의 코드는 배경과 어울리게 exit 버튼을 삽입하기 위해
		    backButton.setFocusPainted(false);
		    backButton.addMouseListener(new MouseAdapter(){
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		backButton.setIcon(backButtonEntered);
		    		backButton.setCursor (new Cursor(Cursor.HAND_CURSOR)); // exit 버튼 위에 마우스 올렸을 시 마우스 커서
		    		
		    	}
		    	@Override
		    	public void mouseExited(MouseEvent e) {
		    		backButton.setIcon(backButtonBasic);
		    		backButton.setCursor (new Cursor(Cursor.DEFAULT_CURSOR));
		    	}
		    	@Override
		    	public void mousePressed(MouseEvent e) {
		    	
		        //메인 돌아가기 구현
		    		
		    		backMain();
		    	}
		    	
		    });
		    
		    add(backButton);
		    
	    
	    menuBar.setBounds(0,0,1280,30);
	    menuBar.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		mouseX = e.getX();
	    		mouseY = e.getY();  // 마우스 이벤트가 발생한 위치를 얻어온다.
	    	}
	});
	    menuBar.addMouseMotionListener(new MouseAdapter() {
	    	@Override
	    	public void mouseDragged(MouseEvent e) {
	    		int x = e.getXOnScreen();
	    		int y = e.getYOnScreen();
	    		setLocation ( x - mouseX , y - mouseY); // 마우스 드래그 할떄마다 위치를 이동 메뉴바 이동
	    
	    }
	});
	    add(menuBar);
	    
		
	}
   public void paint(Graphics g) {
	   screenImage = createImage(Main.SCREEN_WIDTH, Main.SEREEN_HEIGHT); // 내가 정한 상수 크기만큼 이미지를 만들어서 screenImage 에 넣어준다
	   screenGraphic =  screenImage.getGraphics(); // 스크린 이미지를 이용해 객체를 얻어온다.
	   screenDraw((Graphics2D)screenGraphic);  // screenDraw 매서드를 이용해 그린다 // 그래픽스2D 라이브러리 임폴트해서 그래픽스의 화질을 좋게 만든다.
	   g.drawImage(screenImage, 0 , 0 ,null);
	   
   }
   public void screenDraw (Graphics2D g) {
	   
	   g.drawImage(background, 0, 0 , null);
	   if(isMainScreen) {
		   g.drawImage(selectedImage, 340,100,null); // 선택곡 보여주기
	   }
	   if(isGameScreen) {
		   game.ScreenDraw(g);  // game 클래스 가져와서 그림 그려주기
		   
//		   g.drawImage(gameInfoImage, 0,660,null);
//		   g.drawImage(judgementLine,0,580, null);
//		   g.drawImage(noteRoute,228,30, null); // 노트 떨어지는 칸
//		   g.drawImage(noteRoute,332,30, null);
//		   g.drawImage(noteRoute,436,30, null);
//		   g.drawImage(noteRoute,540,30, null);
//		   g.drawImage(noteRoute,640,30, null);
//		   g.drawImage(noteRoute,744,30, null);
//		   g.drawImage(noteRoute,848,30, null);
//		   g.drawImage(noteRoute,952,30, null);
//		   g.drawImage(noteRouteLine,224,30,null); //노트 구분선
//		   g.drawImage(noteRouteLine,328,30,null);
//		   g.drawImage(noteRouteLine,432,30,null);
//		   g.drawImage(noteRouteLine,536,30,null);
//		   g.drawImage(noteRouteLine,740,30,null);
//		   g.drawImage(noteRouteLine,844,30,null);
//		   g.drawImage(noteRouteLine,948,30,null);
//		   g.drawImage(noteRouteLine,1052,30,null);
//		   g.drawImage(noteBasic, 228,120,null);
//		   g.drawImage(noteBasic, 332,580,null);
//		   g.drawImage(noteBasic, 436,500,null);
//		   g.drawImage(noteBasic, 540,340,null);
//		   g.drawImage(noteBasic, 640,340,null);
//		   g.drawImage(noteBasic, 744,325,null);
//		   g.drawImage(noteBasic, 848,305,null);
//		   g.drawImage(noteBasic, 952,305,null);
//		   
//		   g.setColor(Color.white); // 곡 제목 글자 색
//		   g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING , RenderingHints.VALUE_TEXT_ANTIALIAS_ON); // 매끄럽게 출력하기 위한 렌더링 작업
//		   g.setColor(Color.white); 
//		   g.setFont(new Font("Arial",Font.BOLD,30)); // 넣은 곡 제목 글자 조정 Arial 폰트로 , 굵게 , 30 크기
//		   g.drawString ("RDM - Andy Lee", 20 , 702); // 곡 제목과 좌표 
//		   g.drawString ("EASY", 1190 , 702); // 난이도 표시
//		   
//		 
//		   g.setFont(new Font("Arial",Font.BOLD,26));
//		   g.setColor(Color.DARK_GRAY); 
//		   g.drawString("S",270,609); // 입력 키 알려주는 텍스트
//		   g.drawString("D",374,609);
//		   g.drawString("F",478,609);
//		   g.drawString("Space Bar",580,609);
//		   g.drawString("J",784,609);
//		   g.drawString("K",889,609);
//		   g.drawString("L",993,609);
//		   g.setColor(Color.LIGHT_GRAY);
//		   g.setFont(new Font("Elephant",Font.BOLD,30));
//		   g.drawString("000000", 565, 702); // 점수 넣을거임
//		   
//		   
	   }
	   
//	   if(isStayScreen) {
//		   g.drawImage(StayImage, 340,100,null); // 선택곡 보여주기
//	   }
//	   
	   paintComponents(g); // 변수안에 이미지 그려주는 대신에 JFame안에 이미지를 그려주는것 // 메뉴바는 항상 고정으로 존재해야 하는 이미지므로 paintComponents 사용
	   this.repaint();  // repaint 함수를 이용해 매순간 그려준다. 이렇게 해야 버벅거림 현상이 줄어듬
   }
   
   
   public void backMain () {
	   isMainScreen = true;
	   backButton.setVisible(false);
		rightButton.setVisible(true); 
		leftButton.setVisible(true);
		easyButton.setVisible(true);
		hardButton.setVisible(true);
		background =  new ImageIcon(Main.class.getResource("/images/main_Bakground.jpg")).getImage();
		isGameScreen = false;
		
		//selectTrack(nowSelected);
	   
   }
   
   public void enterMain () {
	   
	   startButton.setVisible(false); // 시작버튼이 보이지 않음.
		quitButton.setVisible(false);
		
		rightButton.setVisible(true); // 오른쪽 왼쪾 버튼은 보이게ㅐ
		leftButton.setVisible(true);
		easyButton.setVisible(true);
		hardButton.setVisible(true);
		selectedImage = new ImageIcon(Main.class.getResource("/images/RDM_intro.png")).getImage();
		background = new ImageIcon(Main.class.getResource("/images/main_Bakground.jpg")).getImage(); // 시작하기를 누른 후 시작하기 종료하기 버튼은 사라지고 배경화면 변경
		isMainScreen = true; 
	   
   }
//   
//   public void selectTrack(int nowSelected) { //현재 선택된 곡에 번호를 넣어서 해당 곡이 선택 됨을 알려줌
//	   if(selectedMusic != null) // 어떠한 곡이 실행되고 있다면 바로 종료
//		   selectedMusic.close();
//	   titleImage = new  ImageIcon(Main.class.getResource("/images/intro.jpg" + trackList.get(nowSelected).getStartImage())).getImage(); // titleImage 값 현재 선택된 곡이 가지고 있는 타이틀 이미 값을 가져옴
//	   selectedImage = new  ImageIcon(Main.class.getResource("/images/intro.jpg" + trackList.get(nowSelected).getStartImage())).getImage(); // 게임 시작 후 곡 선택을 위한 이미지
//	   selectedMusic = new Music (trackList.get(nowSelected).getStartMusic(),true); 
//	   selectedMusic.start();
//   }
   
//   public void selectLeft() { // 왼쪽 버튼 클릭시 트랙을 움직이는 로직
//	   if (nowSelected == 0)
//		   nowSelected = trackList.size() - 1;
//	   else
//		   nowSelected--;
//	   selectTrack(nowSelected);
//   }
//   
//   public void selectRight() { // 마찬가지로 오른쪽으로 클릭시 트랙을 움직이는 로직
//	   
//		  if (nowSelected == trackList.size() - 1)
//			  nowSelected = 0;
//	   else
//		   nowSelected++;
//	   selectTrack(nowSelected);
//   }
}
