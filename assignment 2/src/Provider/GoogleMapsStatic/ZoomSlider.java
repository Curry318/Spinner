package Provider.GoogleMapsStatic;

import java.awt.*;
import java.awt.event.*;
//import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.event.*;


public class ZoomSlider extends JPanel implements WindowListener,
													ChangeListener {
	
	    public int value = 0;
	    private JTextField ttfZoom = new JTextField();
	
		static final int FPS_MIN = 1;
		static final int FPS_MAX = 19;
		static final int FPS_INIT = 10;
		
	   
	  
		public ZoomSlider()
		{
	    	JSlider SZoom = new JSlider(JSlider.HORIZONTAL,1,19,10);
			SZoom.addChangeListener(null);
			
			SZoom.setMajorTickSpacing(2);
			SZoom.setMinorTickSpacing(1);
			SZoom.setPaintTicks(true);
			
			SZoom.addChangeListener(this);	
			SZoom.setPaintLabels(true);
			
			add(SZoom);
		
	}
		
    
	public void stateChanged(ChangeEvent e){
		JSlider bar = (JSlider)e.getSource();
		if(!bar.getValueIsAdjusting())
		{
			this.value = bar.getValue();
	        String str = Integer.toString (value);
	        ttfZoom.setText(str);
		}
   }
	public void actionPerformed(ActionEvent e){
		
	}
			
	void addWindowListener(Window w){
		    w.addWindowListener(this);
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

