package ez2beat_1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

	public void KeyPressed(KeyEvent e) { //  키 입력 이벤트를 받아 사용하기 위해
		
	if(Ez2beat.game == null) { // 현재 게임이 진행되고 있지 않다면 리턴한다. 키보드를 누르더라도 밑 이벤트가 발생하지 않게.
		return;
	}
		if(e.getKeyCode() == KeyEvent.VK_S) {// S키를 입력 받으면 이벤트 발생
			Ez2beat.game.pressS();
	}
	
	else if (e.getKeyCode() == KeyEvent.VK_D) {
		Ez2beat.game.pressD();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_F) {
		Ez2beat.game.pressF();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		Ez2beat.game.pressSpace();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_J) {
		Ez2beat.game.pressJ();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_K) {
		Ez2beat.game.pressK();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_L) {
		Ez2beat.game.pressL();
	} 
	}
	



public void KeyReleased(KeyEvent e) { // 키 눌렀따 떌떄 이벤트
	
	if(Ez2beat.game == null) { // 현재 게임이 진행되고 있지 않다면 리턴한다. 키보드를 누르더라도 밑 이벤트가 발생하지 않게.
		return;
	}
	
	if(e.getKeyCode() == KeyEvent.VK_S) {
		Ez2beat.game.releaseS();
	}   
	
	else if (e.getKeyCode() == KeyEvent.VK_D) {
		Ez2beat.game.releaseD();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_F) {
		Ez2beat.game.releaseF();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		Ez2beat.game.releaseSpace();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_J) {
		Ez2beat.game.releaseJ();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_K) {
		Ez2beat.game.releaseK();
	}
		
	else if (e.getKeyCode() == KeyEvent.VK_L) {
		Ez2beat.game.releaseL();
	}
	
}
}