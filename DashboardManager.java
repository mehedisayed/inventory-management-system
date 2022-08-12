import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class DashboardManager extends JPanel implements ActionListener,MouseListener
{
	JMenu product,catagory, report,sales,logname,user;
	JMenuItem p_add, p_remove, p_update,c_add, c_remove, c_update,s_new,s_update,u_add,u_remove,logout;
	JPanel  pnl_product, pnl_catagory,pnl_report, p;
	JLabel lblHeading;
	JFrame f;
	String uname;
	public DashboardManager(String uname)
	{
		this.uname=uname;
		 f = new JFrame("Manager Dashboard");

		f.setSize(1500,971);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);


		JMenuBar mb = new JMenuBar();
		product = new JMenu("Product");
		sales = new JMenu("Sales");
		catagory = new JMenu("Catagory");
		report = new JMenu("Report");
		logname=new JMenu(this.uname);
		user=new JMenu("User");
		

		p_add = new JMenuItem("Add");
		p_remove = new JMenuItem("Remove");
		p_update = new JMenuItem("Update");
		
		s_new = new JMenuItem("New");
		s_update = new JMenuItem("Update");

		c_add = new JMenuItem("Add");
		c_remove = new JMenuItem("Remove");
		c_update = new JMenuItem("Update");
		
		u_add=new JMenuItem("Add");
		u_remove=new JMenuItem("Remove");
		logout=new JMenuItem("Log Out");
		
		logname.add(logout);
		product.add(p_add); product.add(p_remove); product.add(p_update);
		sales.add(s_new); sales.add(s_update);
		catagory.add(c_add); catagory.add(c_remove); catagory.add(c_update);
		user.add(u_add);user.add(u_remove);
		

		mb.add(product); mb.add(catagory);mb.add(user); mb.add(sales); mb.add(report);
		mb.add(Box.createHorizontalGlue());
		mb.add(logname);

		f.setJMenuBar(mb);
		
		Font myFont_head = new Font("Cambria", Font.ITALIC + Font.BOLD, 40);

	

		p = new JPanel();
		p.setLayout(null);

		lblHeading = new JLabel("Welcome to Manager Panel");
		lblHeading.setFont(myFont_head);
		this.lblHeading.setBounds(520,50,1000,600);
		Color bgcolor = new Color(204, 255, 204);				// color
		p.setBackground(bgcolor);	

		p.add(lblHeading);

		f.add(p);

		p_add.addActionListener(this);
		p_remove.addActionListener(this);
		c_add.addActionListener(this);
		c_remove.addActionListener(this);
		c_update.addActionListener(this);
		s_new.addActionListener(this);
		s_update.addActionListener(this);
		logout.addActionListener(this);
		p_update.addActionListener(this);
		u_add.addActionListener(this);
	    u_remove.addActionListener(this);
		report.addMouseListener(this);
	}


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==p_add) {
				
			Add_Product pr = new Add_Product();
			f.getContentPane().removeAll();
			f.getContentPane().add(pr.panel1);
			f.revalidate();
		
		}
		else if (e.getSource()==p_remove) {
			Remove_product rp=new Remove_product();
			f.getContentPane().removeAll();
			f.getContentPane().add(rp.pnlremove_product);
			f.revalidate();
		}
		
		else if(e.getSource()== c_add)
		{
			Add_Catagory ac=new Add_Catagory();
			f.getContentPane().removeAll();
			f.getContentPane().add(ac.pnl_add_catagory);
			f.revalidate();
		}
		else if(e.getSource()== c_remove)
		{
			Remove_Catagory rc=new Remove_Catagory();
			f.getContentPane().removeAll();
			f.getContentPane().add(rc.pnl_remove_catagory);
			f.revalidate();
		}
		else if(e.getSource()== c_update)
		{
			Update_Catagory uc=new Update_Catagory();
			f.getContentPane().removeAll();
			f.getContentPane().add(uc.pnl_update_catagory);
			f.revalidate();
		}
		
		else if (e.getSource()==s_new)
		{
			
			Sales_New ps = new Sales_New();
			f.getContentPane().removeAll();
			f.getContentPane().add(ps.panelS);
			f.revalidate();

		}
		else if(e.getSource()== p_update)
		{
			Update_product pu=new Update_product();
			f.getContentPane().removeAll();
			f.getContentPane().add(pu.pnl_update_product);
			f.revalidate();
		}
				else if(e.getSource()==u_add)
		{
			Add_User_Manager urm=new Add_User_Manager();
			f.getContentPane().removeAll();
			f.getContentPane().add(urm.pnladd_user);
			f.revalidate();
			f.setVisible(true);
			f.setResizable(false);
			f.setLocationRelativeTo(null);
		}
		else if(e.getSource()== u_remove)
		{
			Remove_User_Manager rum=new Remove_User_Manager();
			f.getContentPane().removeAll();
			f.getContentPane().add(rum.pnlremove_user);
			f.revalidate();
		}
				else if (e.getSource()==s_update)
		{
			
			Sales_Update uds = new Sales_Update();
			f.getContentPane().removeAll();
			f.getContentPane().add(uds.pnlsales_update);
			f.revalidate();
		}
		else if (e.getSource() == logout) {
			
			int flag = JOptionPane.showConfirmDialog(null,"Are you want to logout?", "Logout Confirm",JOptionPane.YES_NO_OPTION);
			if (flag==0) {
				f.setVisible(false);
				Login ln = new Login();
				ln.setVisible(true);
			}
			else
			{
				f.setVisible(true);
			}
		}
	}
	
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==report)
		{
			Report rp=new Report();
			f.getContentPane().removeAll();
			f.getContentPane().add(rp.panel_report);
			f.revalidate();
		}

	}

	public void mousePressed(MouseEvent e){

	}
	public void mouseReleased(MouseEvent e){

	}

	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
}