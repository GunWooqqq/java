package ez2beat_1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;




  public class Music extends Thread {
	
	private Player player; // JAVA ZOOM 라이브러리 사용해야 함
    private boolean isLoop; // isLoop 변수로 무한반복인지 한번 재생인지 설정할 변수
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;
    
    
    public Music(String name , boolean isLoop) {
		// TODO Auto-generated constructor stub
    	try {
    		this.isLoop = isLoop;
    		file = new File (Main.class.getResource("introMusic.mp3" + name).toURI());  // toURI로 music 폴더 안에 파일 실행을 위한 
    		fis = new FileInputStream(file);  
    		bis = new BufferedInputStream(fis); // 해당 파일 버퍼에 담아서 읽을 수 있도록
    		player = new Player (bis); // 가져온 mp3 파일 담을 수 있게
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
	}

	public int getTime() {   // 현재 실행중인 음악이 현재 어떤 위치에 실행중인지 알려주기 위한  (노트를 만들기 위해) 0.001초 단위까지 알려줌.
    	if (player == null)
    		return 0;
    	return player.getPosition();
    }
    
    public void close() { // 음악이 어디서 실행중이던 항상 종료가 가능하게
    	isLoop = false;
    	player.close();
    	this.interrupt();  // 곡을 종료하기 위한 쓰레드 
    }

	@Override
	public void run() { // 쓰레드 상속 받으면 무조건 사용해야 하기 떄문에 오버라이드
		// TODO Auto-generated method stub
		super.run();
		try 
		{	
			do {
			player.play(); //곡 실행
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player (bis);
			} while (isLoop); // isLoop가 트루값이면 무한루프
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

    
	
    
}
