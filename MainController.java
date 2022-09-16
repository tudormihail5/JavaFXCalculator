package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController 
{
	@FXML
	private Button one,two,three,four,five,six,seven,eight,nine,zero,eq,pl,min,div,c,mult;
	@FXML
	private Label label;
	private boolean p=false;
	private int pcta=0,pctb=0;
	private double a=Double.MIN_VALUE,b=Double.MIN_VALUE,a1;
	private String s="";
	public void power(ActionEvent event)
	{
		if(a==Double.MIN_VALUE)
			label.setText("0.0");
		p=true;
	}
	public void off(ActionEvent event)
	{
		label.setText("");
		p=false;
		s="";
		a=Double.MIN_VALUE;
		b=Double.MIN_VALUE;
		pcta=0;
		pctb=0;
	}
	public void one(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+1;
					else
					{
						a=(a*Math.pow(10,pcta)+1)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-1;
					else
					{
						a=(a*Math.pow(10,pcta)-1)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+1;
				else
				{
					b=(b*Math.pow(10,pctb)+1)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void two(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+2;
					else
					{
						a=(a*Math.pow(10,pcta)+2)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-2;
					else
					{
						a=(a*Math.pow(10,pcta)-2)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+2;
				else
				{
					b=(b*Math.pow(10,pctb)+2)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void three(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+3;
					else
					{
						a=(a*Math.pow(10,pcta)+3)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-3;
					else
					{
						a=(a*Math.pow(10,pcta)-3)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+3;
				else
				{
					b=(b*Math.pow(10,pctb)+3)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void four(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+4;
					else
					{
						a=(a*Math.pow(10,pcta)+4)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-4;
					else
					{
						a=(a*Math.pow(10,pcta)-4)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+4;
				else
				{
					b=(b*Math.pow(10,pctb)+4)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void five(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+5;
					else
					{
						a=(a*Math.pow(10,pcta)+5)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-5;
					else
					{
						a=(a*Math.pow(10,pcta)-5)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+5;
				else
				{
					b=(b*Math.pow(10,pctb)+5)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void six(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+6;
					else
					{
						a=(a*Math.pow(10,pcta)+6)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-6;
					else
					{
						a=(a*Math.pow(10,pcta)-6)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+6;
				else
				{
					b=(b*Math.pow(10,pctb)+6)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void seven(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+7;
					else
					{
						a=(a*Math.pow(10,pcta)+7)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-7;
					else
					{
						a=(a*Math.pow(10,pcta)-7)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+7;
				else
				{
					b=(b*Math.pow(10,pctb)+7)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void eight(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+8;
					else
					{
						a=(a*Math.pow(10,pcta)+8)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-8;
					else
					{
						a=(a*Math.pow(10,pcta)-8)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+8;
				else
				{
					b=(b*Math.pow(10,pctb)+8)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void nine(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a>=0)
				{
					if(pcta==0)
						a=a*10+9;
					else
					{
						a=(a*Math.pow(10,pcta)+9)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
				else
				{
					if(pcta==0)
						a=a*10-9;
					else
					{
						a=(a*Math.pow(10,pcta)-9)/Math.pow(10,pcta);
						++pcta;
					}
					label.setText(String.valueOf(a));
				}
			}
			else
			{
				if(pctb==0)
					b=b*10+9;
				else
				{
					b=(b*Math.pow(10,pctb)+9)/Math.pow(10,pctb);
					++pctb;
				}
				label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void zero(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals(""))
			{
				if(a==Double.MIN_VALUE)
					a=0;
				if(pcta==0)
					a=a*10;
				else
				{
					a=(a*Math.pow(10,pcta))/Math.pow(10,pcta);
					++pcta;
				}
				if(pcta>2)
					label.setText(String.valueOf(a)+"0");
				else
					label.setText(String.valueOf(a));
			}
			else
			{
				if(b==Double.MIN_VALUE)
					b=0;
				if(pctb==0)
					b=b*10;
				else
				{
					b=(b*Math.pow(10,pctb))/Math.pow(10,pctb);
					++pctb;
				}
				if(pctb>2)
					label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b)+"0");
				else
					label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
			}
		}			
	}
	public void eq(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals("+"))
				a=a+b;
			else
				if(s.equals("*"))
					a=a*b;
				else
					if(s.equals("/")&&b!=0)
						a=a/b;
					else
						if(s.equals("-"))
							a=a-b;	
						else
							if(s.equals("/")&&b==0)
								System.out.println("Impossible computation!");
			label.setText(String.valueOf(a));			
			b=Double.MIN_VALUE;
			s="";
			pcta=0;
			a1=a*10;
			if(a1%10!=0)
			{
				a1/=10;
				while(a1%10!=0)
				{
					a1*=10;
					++pcta;
				}
			}
			a1=0;
			pctb=0;
		}			
	}
	public void pl(ActionEvent event)
	{
		if(p==true&&a!=Double.MIN_VALUE&&s.equals(""))
		{
			s="+";
			label.setText(label.getText()+" + ");
		}			
	}
	public void min(ActionEvent event)
	{
		if(p==true&&a!=Double.MIN_VALUE&&s.equals(""))
		{
			s="-";
			label.setText(label.getText()+" - ");
		}			
	}
	public void mult(ActionEvent event)
	{
		if(p==true&&a!=Double.MIN_VALUE&&s.equals(""))
		{
			s="*";
			label.setText(label.getText()+" * ");
		}			
	}
	public void div(ActionEvent event)
	{
		if(p==true&&a!=Double.MIN_VALUE&&s.equals(""))
		{
			s="/";
			label.setText(label.getText()+" / ");
		}			
	}
	public void c(ActionEvent event)
	{
		if(p==true)
		{
			s="";
			a=Double.MIN_VALUE;
			b=Double.MIN_VALUE;
			label.setText("0.0");
			pcta=0;
			pctb=0;
		}			
	}
	public void p(ActionEvent event)
	{
		if(p==true)
		{
			if(s.equals("")&&pcta==0&&a!=Double.MIN_VALUE)
			{
				++pcta;
				label.setText(String.valueOf(a));
			}
			else
				if(s.equals("")&&pcta==0&&a==Double.MIN_VALUE)
				{
					++pcta;
					label.setText("0.0");
				}
			else
				if(!s.equals("")&&pctb==0)
				{
					++pctb;
					label.setText(String.valueOf(a)+" "+s+" "+String.valueOf(b));
				}
		}	
	}
}