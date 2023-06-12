import javax.swing.*;

public class EquationOfCircle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EC();
		
	}
}
class EC{
	
	EC(){
			Object[] obj0 = new Object[3];
			obj0[0]="Solve for Radius";
			obj0[1]="Passes through the origin";
			obj0[2]="Passes through the point";
			
			
			String select = (String) JOptionPane.showInputDialog(null,"Select an equation:", "Equation of Circle", JOptionPane.INFORMATION_MESSAGE, null, obj0, obj0[0]);
		
		switch (select){
			case "Solve for Radius":
				new Radius();
				break;
			case "Passes through the origin":
				Object[] choice = new Object[4];
				choice[0]="h:positive ; k:positive";
				choice[1]="h:positive ; k:negative";
				choice[2]="h:negative ; k:positive";
				choice[3]="h:negative ; k:negative";
				
				String o1 = (String) JOptionPane.showInputDialog(null,"Select type of variable:", "Passes through the origin", JOptionPane.INFORMATION_MESSAGE, null, choice, choice[0]);
			case "h:positive ; k:positive":
				new Origin1();
				break;
			case "h:positive ; k:negative":
			    new	pnOrigin();
				break;
			case "h:negative ; k:positive":
				new npOrigin();
				break;
			case "h:negative ; k:negative":
				new Origin1();
				break;
				
			case "Passes through the point":
				new Point();
				break;
		
		}
	}
		
		
class Radius{
	{
		int repeat;
		
	do{
	//Input value
	int x = Integer.parseInt(JOptionPane.showInputDialog("Enter X value of the point passes through: "));
	int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y value of the point passes through: "));
	int h = Integer.parseInt(JOptionPane.showInputDialog("Enter h value of the center: "));
	int k = Integer.parseInt(JOptionPane.showInputDialog("Enter k value of the center: "));

	double r = Math.sqrt(Math.pow((x-h),2)+Math.pow((y-k),2)); //Solution for radius
	
	JOptionPane.showMessageDialog(null,"Radius=  "+r); //Display the value of radius
	
	repeat = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CALCULATE AGAIN?","Equation of Circle",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
	} 
	while (repeat == JOptionPane.YES_OPTION);
	
		}
	}
}
	
	class Origin1{
		{
			int repeat;
			
			do{
			//Input value
			int x = 0;
			int y = 0;
			int h = Integer.parseInt(JOptionPane.showInputDialog("Enter h value of the center: "));
			int k = Integer.parseInt(JOptionPane.showInputDialog("Enter k value of the center: "));
			int r = Integer.parseInt(JOptionPane.showInputDialog("Enter value of the radius: "));
			
			
			
			int llx = h*2;  //value of the second term for x
			int lllx = h*h; //value of the third term for x
			

			int lly = k*2; //value of the second term for y
			int llly = k*k; //value of the third term for y
			
			int cxy = lllx+llly; //combining like terms
			int mr = cxy-r; //subtract r after it is transpose 
			
			JOptionPane.showMessageDialog(null,"Equation of Circle is \n x^2 + y^2-"+llx+"x-"+lly+"y+"+mr); //Arrange and display the Equation of Circle
			
			repeat = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CALCULATE AGAIN?","Equation of Circle",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
			} 
			while (repeat == JOptionPane.YES_OPTION);
			
				}
			}
	
	class pnOrigin{
		{
			int reP;
			
			do{
			//Input value
			
			int h = Integer.parseInt(JOptionPane.showInputDialog("Enter h value of the center: "));
			int k = Integer.parseInt(JOptionPane.showInputDialog("Enter k value of the center: "));
			int r = Integer.parseInt(JOptionPane.showInputDialog("Enter value of the radius: "));
			
			
			
			 //value of the second term for x
			int lllx = h*h; //value of the third term for x
			
			int lly = k*2; //value of the second term for y
			int llly = k*k; //value of the third term for y
			
			int cxy = lllx+llly; //combining like terms
			int mr = cxy-r; //subtract r after it is transpose 
			
			JOptionPane.showMessageDialog(null,"Equation of Circle is \n x^2 + y^2 -x-"+lly+"y+"+mr); //Arrange and display the Equation of Circle
			
			reP = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CALCULATE AGAIN?","Equation of Circle",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
			} 
			while (reP == JOptionPane.YES_OPTION);
			
				}
			}
	
	class npOrigin{
		{
			int reP;
			
			do{
			//Input value
			
			int h = Integer.parseInt(JOptionPane.showInputDialog("Enter h value of the center: "));
			int k = Integer.parseInt(JOptionPane.showInputDialog("Enter k value of the center: "));
			int r = Integer.parseInt(JOptionPane.showInputDialog("Enter value of the radius: "));
			
			
			
			int llx = h*2; //value of the second term for x
			int lllx = h*h; //value of the third term for x
			
			int lly = k*2; //value of the second term for y
			int llly = k*k; //value of the third term for y
			
			int cxy = lllx+llly; //combining like terms
			int mr = cxy-r; //subtract r after it is transpose 
			
			JOptionPane.showMessageDialog(null,"Equation of Circle is \n x^2 + y^2+"+llx+"-y+"+mr); //Arrange and display the Equation of Circle
			
			reP = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CALCULATE AGAIN?","Equation of Circle",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
			} 
			while (reP == JOptionPane.YES_OPTION);
			
				}
			}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class Point{
		{
			int repeat;
			
			do{
			//Input value
			int x = Integer.parseInt(JOptionPane.showInputDialog("Enter X value of the point passes through: "));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y value of the point passes through: "));
			int h = Integer.parseInt(JOptionPane.showInputDialog("Enter h value of the center: "));
			int k = Integer.parseInt(JOptionPane.showInputDialog("Enter k value of the center: "));
			int r = Integer.parseInt(JOptionPane.showInputDialog("Enter value of the radius: "));

			
			int llx = h*2;  //value of the second term for x
			int lllx = h*h; //value of the third term for x
			

			int lly = k*2; //value of the second term for y
			int llly = k*k; //value of the third term for y
			
			int cxy = lllx+llly; //combining like terms
			int mr = cxy-r; //subtract r after it is transpose 
			
			JOptionPane.showMessageDialog(null,"Equation of Circle is \n x^2x + y^2-"+llx+"x-"+lly+"y+"+mr); //Arrange and display the Equation of Circle
			
			repeat = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CALCULATE AGAIN?","Equation of Circle",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
			} 
			while (repeat == JOptionPane.YES_OPTION);
			
		}
	}
		
