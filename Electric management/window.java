package com.xiets.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.xu.access.DBS;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
    	
    	DBS A = new DBS();
    	DBS B = new DBS();
    	B.getConnection();
    	A.getConnection();
    	//A.executeinsert2();
    	//A.Adddata("insert into test(VOL,CUR) values(50,9)");
    	//ArrayList<Integer> list = new ArrayList<Integer>();
    	/*list = A.Reacherdata("select * from test",53);
    	int a[] = new int[list.size()];
    	for(int i = 0 ;i<list.size();i++)
    	{
    		a[i] =(int)list.get(i);
    		System.out.println(a[i]);
    	}*/
    //	int jj = 9;
    	//A.Deletedata(jj);
    	//A.Changedata("update test set name='���' where name='��è'");
    	
    	
    	
    	final JFrame jf = new JFrame("�����ش���");
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
        // ����ѡ���壨������������ѡ����壺�ܼ�ش��ڡ����01�����02��
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel01 = new JPanel(null);
        JPanel panel02 = new JPanel(null);
        JPanel panel03 = new JPanel(null);
        tabbedPane.addTab("�ܼ��Ӵ���", panel01);
        tabbedPane.addTab("���01", panel02);
        tabbedPane.addTab("���02", panel03);
        //����������
        JToggleButton switchbutton01 = new JToggleButton("����01");
        JToggleButton switchbutton02 = new JToggleButton("����02");
        JToggleButton switchbuttonall = new JToggleButton("�ܿ���");
    	JLabel state01 = new JLabel("�������״̬");
    	JLabel state02 = new JLabel("�������״̬");
    	JLabel statenow = new JLabel("�������");
    	JLabel abstatenow = new JLabel("�쳣ԭ��");
    	JLabel abstatetime= new JLabel("��������");
    	JLabel ele01 = new JLabel("���01");
    	JLabel ele02 = new JLabel("���02");
    	JLabel VOL01 = new JLabel("��ѹ");
    	JLabel VOL02 = new JLabel("��ѹ");
    	JLabel CUR01 = new JLabel("����");
      	JLabel CUR02 = new JLabel("����");
      	JLabel rotateS01 = new JLabel("ת��");
      	JLabel rotateS02 = new JLabel("ת��");
    	JTextField Textstate01 = new JTextField();
    	JTextField Textstate02 = new JTextField();
    	JTextField Textabstate02 = new JTextField();
    	JTextField Textabstate01 = new JTextField();
    	JTextField Textabstatetime01 = new JTextField();
    	JTextField Textabstatetime02 = new JTextField();
    	JTextField TextCUR01 = new JTextField();
    	JTextField TextCUR02 = new JTextField();
    	JTextField TextVOL01 = new JTextField();
    	JTextField TextVOL02 = new JTextField();
    	JTextField TextRotate01 = new JTextField();
    	JTextField TextRotate02 = new JTextField();  	
    	JButton detective = new JButton("������");
    	JLabel showcurve01 = new JLabel("������ʾ");
    	JLabel showcurve02 = new JLabel("������ʾ");
    	JButton showcurveCUR02 = new JButton("������ʱ��");
    	JButton showcurveCUR01 = new JButton("������ʱ��");
    	JButton showcurveVOL02 = new JButton("��ѹ��ʱ��");
    	JButton showcurveVOL01 = new JButton("��ѹ��ʱ��");
    	JButton showcurveSPE02 = new JButton("ת�١�ʱ��");
    	JButton showcurveSPE01 = new JButton("ת�١�ʱ��");
    	//���λ�ù̶�
    	detective.setBounds(120, 10, 90, 30);
    	switchbutton01.setBounds(10,10,90,30);
    	switchbutton02.setBounds(10,10,90,30);
    	switchbuttonall.setBounds(10,10,90,30);
    	state01.setBounds(10,70,100,30);
    	state02.setBounds(10,70,100,30);
    	showcurve01.setBounds(200,70,100,30);
    	showcurve02.setBounds(200,70,100,30);
    	showcurveVOL01.setBounds(200,120,100,30);
    	showcurveVOL02.setBounds(200,120,100,30);
    	showcurveCUR01.setBounds(200,170,100,30);
    	showcurveCUR02.setBounds(200,170,100,30);
    	showcurveSPE01.setBounds(200,220,100,30);
    	showcurveSPE02.setBounds(200,220,100,30);
    	statenow.setBounds(130,80,90,30);
    	abstatenow.setBounds(300,80,90,30);
    	abstatetime.setBounds(470,80,90,30);
    	Textstate01.setBounds(115,109,90,30);
    	Textabstate01.setBounds(285,109,90,30);
    	Textstate02.setBounds(115,219,90,30);
    	Textabstate02.setBounds(285,219,90,30);
    	Textabstatetime01.setBounds(455,109,90,30);
    	Textabstatetime02.setBounds(455,219,90,30);
    	ele01.setBounds(30,110,90,30);
    	ele02.setBounds(30,220,90,30);
    	VOL01.setBounds(10,120,100,30);
    	VOL02.setBounds(10,120,100,30);
    	CUR01.setBounds(10,170,100,30);
    	CUR02.setBounds(10,170,100,30);
    	rotateS01.setBounds(10,220,100,30);
    	rotateS02.setBounds(10,220,100,30);
    	TextCUR01.setBounds(50,120,100,30);
     	TextCUR02.setBounds(50,120,100,30);
     	TextVOL01.setBounds(50,170,100,30);
     	TextVOL02.setBounds(50,170,100,30);
     	TextRotate01.setBounds(50,220,100,30);
     	TextRotate02.setBounds(50,220,100,30);
    	//�����ӵ����
    	panel02.add(switchbutton01);
    	panel03.add(switchbutton02);
    	panel01.add(switchbuttonall);
        panel02.add(state01);
        panel02.add(showcurve01);
        panel03.add(showcurve02);
        panel02.add(showcurveVOL01);
        panel03.add(showcurveVOL02);
        panel02.add(showcurveCUR01);
        panel03.add(showcurveCUR02);
        panel02.add(showcurveSPE01);
        panel03.add(showcurveSPE02);
        panel03.add(state02);
        panel01.add(detective);
        panel01.add(statenow);
        panel01.add(abstatenow);
        panel01.add(abstatetime);
        panel01.add(Textstate01);
        panel01.add(Textstate02);
        panel01.add(Textabstate02);
        panel01.add(Textabstate01);
        panel01.add(Textabstatetime01);
        panel01.add(Textabstatetime02);
        panel02.add(TextCUR01);
        panel03.add(TextCUR02);
        panel02.add(TextVOL01);
        panel03.add(TextVOL02);
        panel02.add(TextRotate01);
        panel03.add(TextRotate02);
        panel01.add(ele01);
        panel01.add(ele02);
        panel02.add(VOL01);
        panel03.add(VOL02);
        panel02.add(CUR01);
        panel03.add(CUR02);
        panel02.add(rotateS01);
        panel03.add(rotateS02);

        //������������� 
        //����01
        showcurveVOL01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ArrayList<Integer> list = new ArrayList<Integer>();
            	try {
					list = A.Reacherdata("select * from test",2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	int a[] = new int[list.size()];
            	for(int i = 0 ;i<list.size();i++)
            	{
            		a[i] =(int)list.get(i);
            	//	System.out.println(a[i]);
            	}
            	
            	JFrame jFrame = new JFrame("��ѹ����ʱ��");
            	jFrame.setSize(500,500);
            	//jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//�رվ��˳�
                jFrame.setLocationRelativeTo(null);
                // ��������
                JPanel jpanel = new JPanel() {
                //���кţ���ʡ�ԣ�
                private static final long serialVersionUID = 1L;

                    // ��дpaint����
                    @Override
                    public void paint(Graphics g) {
                    	Graphics2D g2D = (Graphics2D) g;
                    	int Origin_X = 100;
                    	int Origin_Y = 270;

                    	// X,Y���յ�����
                    	int XAxis_X = 620;
                    	int XAxis_Y = 270;
                    	int YAxis_X = 100;
                    	int YAxis_Y = 80;

                    	// X���ϵ�ʱ��ֶ�ֵ��1�ֶ�=40���أ�
                    	int TIME_INTERVAL = 50;
                    	// Y����ֵ
                    	int PRESS_INTERVAL = 30;
                        // �����ȵ��ø����paint����
                        super.paint(g);
   
                     // ��������
                        g.setColor(Color.RED);
            			g2D.setStroke(new BasicStroke(Float.parseFloat("3.0F")));// ���ߴֶ�
            			// X���Լ������ͷ
            			g.drawLine(Origin_X, Origin_Y, XAxis_X, XAxis_Y);// x���ߵ�����
            			g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y - 5);// �ϱ߼�ͷ
            			g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y + 5);// �±߼�ͷ

            			// Y���Լ������ͷ
            			g.drawLine(Origin_X, Origin_Y, YAxis_X, YAxis_Y);
            			g.drawLine(YAxis_X, YAxis_Y, YAxis_X - 5, YAxis_Y + 5);
            			g.drawLine(YAxis_X, YAxis_Y, YAxis_X + 5, YAxis_Y + 5);

            			// ��X���ϵ�ʱ��̶ȣ���������ԭ����ÿ��TIME_INTERVAL(ʱ��ֶ�)���ػ�һʱ��㣬��X���յ�ֹ��
            			g.setColor(Color.BLUE);
            			g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));

            			// X��̶����α仯���
            			for (int i = Origin_X, j = 0; i < XAxis_X; i += TIME_INTERVAL, j += TIME_INTERVAL) {
            				g.drawString(" " + j, i - 10, Origin_Y + 20);
            			}
            			g.drawString("ʱ��/min", XAxis_X + 5, XAxis_Y + 5);

            			// ��Y���Ͽ̶ȣ�������ԭ����ÿ��10���ػ�һѹ��ֵ����Y���յ�ֹ��
            			for (int i = Origin_Y, j = 0; i > YAxis_Y; i -= PRESS_INTERVAL, j += TIME_INTERVAL) {
            				g.drawString(j + " ", Origin_X - 30, i + 3);
            			}
            			g.drawString("��ѹ/V", YAxis_X - 5, YAxis_Y - 5);// ��ѹ�̶�С��ͷֵ
            			// ��������
            			g.setColor(Color.BLACK);
            			// �����ڲ�����
            			for (int i = Origin_Y; i > YAxis_Y; i -= PRESS_INTERVAL) {
            				g.drawLine(Origin_X, i, Origin_X + 10 * TIME_INTERVAL, i);
            			}
            			// �����ڲ�����
            			for (int i = Origin_X; i < XAxis_X; i += TIME_INTERVAL) {
            				g.drawLine(i, Origin_Y, i, Origin_Y - 6 * PRESS_INTERVAL);
            			}
            			
            			g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));
            			g.setColor(Color.red);
            			int k = 50;
            			for(int i = 0;i<10;i++) {
            				g.drawLine(i*k+100, 270-(3*a[i])/5, (i+1)*k+100, 270-(3*a[i+1])/5);
            			}
            			
            			

                        
                    }
                };
                //������С��ͼ��Ļ���Ƕ�뵽�����
                jFrame.add(jpanel);
                // ���û����С����ȣ��߶ȣ���Ĭ�϶�Ϊ0
                jFrame.setSize(700, 400);
                // ������չʾ������true���ÿɼ���Ĭ��Ϊfalse����
                jFrame.setVisible(true);
            
                
                System.out.println("����01  �����");
            }
        });
        //����02
        showcurveCUR01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
            	 System.out.println("����02  �����");
            	ArrayList<Integer> list2 = new ArrayList<Integer>();
            	try {
					list2 = B.Reacherdata("select * from test",3);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
            	int b[] = new int[list2.size()];
            	for(int i = 0 ;i<list2.size();i++)
            	{
            		b[i] =(int)list2.get(i);
            		System.out.println(b[i]);
            	}
            	JFrame jFrame = new JFrame("��������ʱ��");
            	jFrame.setSize(500,500);
            	//jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//�رվ��˳�
                jFrame.setLocationRelativeTo(null);
                // ��������
                JPanel jpanel = new JPanel() {
                //���кţ���ʡ�ԣ�
                private static final long serialVersionUID = 1L;

                    // ��дpaint����
                    @Override
                    public void paint(Graphics g) {
                    	Graphics2D g2D = (Graphics2D) g;
                    	int Origin_X = 100;
                    	int Origin_Y = 270;

                    	// X,Y���յ�����
                    	int XAxis_X = 620;
                    	int XAxis_Y = 270;
                    	int YAxis_X = 100;
                    	int YAxis_Y = 80;

                    	// X���ϵ�ʱ��ֶ�ֵ��1�ֶ�=40���أ�
                    	int TIME_INTERVAL = 50;
                    	// Y����ֵ
                    	int PRESS_INTERVAL = 30;
                        // �����ȵ��ø����paint����
                        super.paint(g);
   
                     // ��������
                        g.setColor(Color.RED);
            			g2D.setStroke(new BasicStroke(Float.parseFloat("3.0F")));// ���ߴֶ�
            			// X���Լ������ͷ
            			g.drawLine(Origin_X, Origin_Y, XAxis_X, XAxis_Y);// x���ߵ�����
            			g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y - 5);// �ϱ߼�ͷ
            			g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y + 5);// �±߼�ͷ

            			// Y���Լ������ͷ
            			g.drawLine(Origin_X, Origin_Y, YAxis_X, YAxis_Y);
            			g.drawLine(YAxis_X, YAxis_Y, YAxis_X - 5, YAxis_Y + 5);
            			g.drawLine(YAxis_X, YAxis_Y, YAxis_X + 5, YAxis_Y + 5);

            			// ��X���ϵ�ʱ��̶ȣ���������ԭ����ÿ��TIME_INTERVAL(ʱ��ֶ�)���ػ�һʱ��㣬��X���յ�ֹ��
            			g.setColor(Color.BLUE);
            			g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));

            			// X��̶����α仯���
            			for (int i = Origin_X, j = 0; i < XAxis_X; i += TIME_INTERVAL, j += TIME_INTERVAL) {
            				g.drawString(" " + j, i - 10, Origin_Y + 20);
            			}
            			g.drawString("ʱ��/min", XAxis_X + 5, XAxis_Y + 5);

            			// ��Y���Ͽ̶ȣ�������ԭ����ÿ��10���ػ�һѹ��ֵ����Y���յ�ֹ��
            			for (int i = Origin_Y, j = 0; i > YAxis_Y; i -= PRESS_INTERVAL, j += TIME_INTERVAL-45) {
            				g.drawString((j + " "), Origin_X - 30, i + 3);
            			}
            			g.drawString("����/A", YAxis_X - 5, YAxis_Y - 5);// ��ѹ�̶�С��ͷֵ
            			// ��������
            			g.setColor(Color.BLACK);
            			// �����ڲ�����
            			for (int i = Origin_Y; i > YAxis_Y; i -= PRESS_INTERVAL) {
            				g.drawLine(Origin_X, i, Origin_X + 10 * TIME_INTERVAL, i);
            			}
            			// �����ڲ�����
            			for (int i = Origin_X; i < XAxis_X; i += TIME_INTERVAL) {
            				g.drawLine(i, Origin_Y, i, Origin_Y - 6 * PRESS_INTERVAL);
            			}
            			
            			g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));
            			g.setColor(Color.red);
            			int k = 50;
            			for(int i = 0;i<10;i++) {
            				g.drawLine(i*k+100, 270-(30*b[i])/5, (i+1)*k+100, 270-(30*b[i+1])/5);
            			}
            			
            			

                        
                    }
                };
                //������С��ͼ��Ļ���Ƕ�뵽�����
                jFrame.add(jpanel);
                // ���û����С����ȣ��߶ȣ���Ĭ�϶�Ϊ0
                jFrame.setSize(700, 400);
                // ������չʾ������true���ÿɼ���Ĭ��Ϊfalse����
                jFrame.setVisible(true);
                
                System.out.println("����02  �����");
            }
        });
      //����03
        showcurveSPE01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ArrayList<Integer> list = new ArrayList<Integer>();
            	try {
					list = A.Reacherdata("select * from test",4);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	int a[] = new int[list.size()];
            	for(int i = 0 ;i<list.size();i++)
            	{
            		a[i] =(int)list.get(i);
            	//	System.out.println(a[i]);
            	}
            	
            	JFrame jFrame = new JFrame("ת�١���ʱ��");
            	jFrame.setSize(500,500);
            	//jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//�رվ��˳�
                jFrame.setLocationRelativeTo(null);
                // ��������
                JPanel jpanel = new JPanel() {
                //���кţ���ʡ�ԣ�
                private static final long serialVersionUID = 1L;

                    // ��дpaint����
                    @Override
                    public void paint(Graphics g) {
                    	Graphics2D g2D = (Graphics2D) g;
                    	int Origin_X = 100;
                    	int Origin_Y = 270;

                    	// X,Y���յ�����
                    	int XAxis_X = 620;
                    	int XAxis_Y = 270;
                    	int YAxis_X = 100;
                    	int YAxis_Y = 80;

                    	// X���ϵ�ʱ��ֶ�ֵ��1�ֶ�=40���أ�
                    	int TIME_INTERVAL = 50;
                    	// Y����ֵ
                    	int PRESS_INTERVAL = 30;
                        // �����ȵ��ø����paint����
                        super.paint(g);
   
                     // ��������
                        g.setColor(Color.RED);
            			g2D.setStroke(new BasicStroke(Float.parseFloat("3.0F")));// ���ߴֶ�
            			// X���Լ������ͷ
            			g.drawLine(Origin_X, Origin_Y, XAxis_X, XAxis_Y);// x���ߵ�����
            			g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y - 5);// �ϱ߼�ͷ
            			g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y + 5);// �±߼�ͷ

            			// Y���Լ������ͷ
            			g.drawLine(Origin_X, Origin_Y, YAxis_X, YAxis_Y);
            			g.drawLine(YAxis_X, YAxis_Y, YAxis_X - 5, YAxis_Y + 5);
            			g.drawLine(YAxis_X, YAxis_Y, YAxis_X + 5, YAxis_Y + 5);

            			// ��X���ϵ�ʱ��̶ȣ���������ԭ����ÿ��TIME_INTERVAL(ʱ��ֶ�)���ػ�һʱ��㣬��X���յ�ֹ��
            			g.setColor(Color.BLUE);
            			g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));

            			// X��̶����α仯���
            			for (int i = Origin_X, j = 0; i < XAxis_X; i += TIME_INTERVAL, j += TIME_INTERVAL) {
            				g.drawString(" " + j, i - 10, Origin_Y + 20);
            			}
            			g.drawString("ʱ��/min", XAxis_X + 5, XAxis_Y + 5);

            			// ��Y���Ͽ̶ȣ�������ԭ����ÿ��10���ػ�һѹ��ֵ����Y���յ�ֹ��
            			for (int i = Origin_Y, j = 0; i > YAxis_Y; i -= PRESS_INTERVAL, j += TIME_INTERVAL) {
            				g.drawString(j + " ", Origin_X - 30, i + 3);
            			}
            			g.drawString("ת��/V", YAxis_X - 5, YAxis_Y - 5);// ��ѹ�̶�С��ͷֵ
            			// ��������
            			g.setColor(Color.BLACK);
            			// �����ڲ�����
            			for (int i = Origin_Y; i > YAxis_Y; i -= PRESS_INTERVAL) {
            				g.drawLine(Origin_X, i, Origin_X + 10 * TIME_INTERVAL, i);
            			}
            			// �����ڲ�����
            			for (int i = Origin_X; i < XAxis_X; i += TIME_INTERVAL) {
            				g.drawLine(i, Origin_Y, i, Origin_Y - 6 * PRESS_INTERVAL);
            			}
            			
            			g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));
            			g.setColor(Color.red);
            			int k = 50;
            			for(int i = 0;i<10;i++) {
            				g.drawLine(i*k+100, 270-(3*a[i])/5, (i+1)*k+100, 270-(3*a[i+1])/5);
            			}
            			
            			

                        
                    }
                };
                //������С��ͼ��Ļ���Ƕ�뵽�����
                jFrame.add(jpanel);
                // ���û����С����ȣ��߶ȣ���Ĭ�϶�Ϊ0
                jFrame.setSize(700, 400);
                // ������չʾ������true���ÿɼ���Ĭ��Ϊfalse����
                jFrame.setVisible(true);
            
                
                System.out.println("����01  �����");
            }
        });
        //�ܼ�ش��ڵ��������
        detective.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Textstate01.setText("����");
                ArrayList<Integer> list = new ArrayList<Integer>();
            	try {
					list = A.Reacherdata("select * from test",2);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
            	int a[] = new int[list.size()];
            	
            	 ArrayList<Integer> list2 = new ArrayList<Integer>();
             	try {
 					list2 = A.Reacherdata("select * from test",7);
 				} catch (Exception e1) {
 					e1.printStackTrace();
 				}
             	String b[] = new String[list.size()];
             	
            	
            	for(int i = 0 ;i<list.size();i++)
            	{
            		b[i] = list2.get(i).toString();
            		a[i] =(int)list.get(i);
            		if (a[i]<150) {
            			Textstate01.setText("�쳣");
            			Textabstate01.setText("��ѹ����");
            			Textabstatetime01.setText(b[i]+1);
            			
            			/*try {
							A.Changedata("update test set ����ԭ��  = '��ѹ����' where ID = "+(i+1)+"");
							A.Changedata("update test set ��������  = list3.get(i).getCalendarType() where ID = "+(i+1)+"");
						} catch (Exception e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}*/
            		}
            		else if (a[i]>300)
            		{
            			Textstate01.setText("�쳣");
            			Textabstate01.setText("��ѹ����");
            			Textabstatetime01.setText(b[i]+1);
            			/*try {
							A.Changedata("update test set ����ԭ��  = '��ѹ����' where ID = "+(i+1)+"");
							A.Changedata("update test set ��������  = list3.get(i).getCalendarType() where ID = "+(i+1)+"");
						} catch (Exception e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}*/
            			
            			
            		}
            	}
            	/*for(int i = 0 ;i<list2.size();i++)
            	{
            		b[i] =(int)list2.get(i);
            		if ( b[i]<10) {
            			Textstate01.setText("�쳣");
            			Textabstate01.setText("��������");
            			Textabstatetime01.setText(list3.get(i).getCalendarType());
            			try {
							A.Changedata("update test set ����ԭ��  = '��������' where ID = 'i+1'");
							A.Changedata("update test set ��������  = list3.get(i).getCalendarType() where ID = 'i+1'");
						} catch (Exception e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
            		}
            		else if (b[i]>30)
            		{
            			Textstate01.setText("�쳣");
            			Textabstate01.setText("��������");
            			Textabstatetime01.setText(list3.get(i).getCalendarType());
            			try {
							A.Changedata("update test set ����ԭ��  = '��������' where ID = 'i+1'");
							A.Changedata("update test set ��������  = list3.get(i).getCalendarType() where ID = 'i+1'");
						} catch (Exception e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
            		}*/
            	
                
                System.out.println("������  �����");
            }
            
            	
            }
        );
        //���01���ؼ���
        switchbutton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("���01  �����");
            }
        });
        //���02���ؼ���
        switchbutton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("���02  �����");
            }
        });
       
        
        
        // ���ѡ�ѡ��״̬�ı�ļ�����
        
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("��ǰѡ�е�ѡ�: " + tabbedPane.getSelectedIndex());
            }
        });

        // ����Ĭ��ѡ�е�ѡ�
        tabbedPane.setSelectedIndex(0);
        
        jf.setContentPane(tabbedPane);
        jf.setVisible(true);
    

        
        
        
        
    //�˵�����//////////////////////////////////////////////
        JMenuBar menuBar = new JMenuBar();
        JMenu menuload = new JMenu("����(L)");
        JMenuItem menuclientcreat = new JMenuItem("��������");
        JMenuItem menuforgetsecret = new JMenuItem("�Ͽ�����");
        JMenu menuparameter = new JMenu("״̬���(P)");
        JMenuItem menuVoltage = new  JMenuItem("��ѹ��V��");
        JMenuItem menuCurrent = new  JMenuItem("������A��");
        JMenuItem menuTemperature = new  JMenuItem("�¶ȣ�C��");
        JMenuItem menuspeed = new  JMenuItem("ת�٣�r/s��");
        JMenu menuSystem = new JMenu("���ݴ���D��");
		JMenuItem menutypein = new JMenuItem("����¼��");
		JMenuItem menureacher = new JMenuItem("���ݲ�ѯ");
		JMenuItem menudelete = new JMenuItem("����ɾ��");
		JMenu menucurve = new JMenu("������ߣ�Q��");
		JCheckBoxMenuItem Volcurve = new JCheckBoxMenuItem("��ѹ��ʱ��");
		JCheckBoxMenuItem Curcurve = new JCheckBoxMenuItem("������ʱ��");
		JCheckBoxMenuItem Specurve = new JCheckBoxMenuItem("ת�١�ʱ��");
		JMenu menuAbout = new JMenu("����");
		JMenuItem SQL = new JMenuItem("���ݿ�˵��");
		
        // һ���˵���ӵ��˵���
		menuBar.add(menuload);
		menuload.add(menuclientcreat);
		menuload.add(menuforgetsecret);
		
		menuBar.add(menuparameter);
		menuparameter.add(menuVoltage);
		menuparameter.add( menuCurrent);
		menuparameter.add( menuTemperature);
		menuparameter.add( menuspeed);
		menuBar.add( menuSystem);
		menuSystem.add(menutypein);
		menuSystem.add(menureacher);
		menuSystem.add(menudelete);
		menuBar.add(menucurve);
		menucurve.add(Volcurve);
		menucurve.add(Curcurve);
		menucurve.add(Specurve);
		menuBar.add(  menuAbout);
		menuAbout.add(SQL);
	
	
       
        
        // �˵���ĵ��/״̬�ı��¼�����/////////////////////////////////////////////////////////////////////////////////
        
		//���á����ӡ����Ӳ˵��ļ�����
		
		// ���� "��������" �Ӳ˵�������ļ���
        menuclientcreat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 JFrame load = new JFrame("�û���¼");
            	 load.setSize(200,200);
            	 load.setLocationRelativeTo(null);
                 //load.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                 // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������
                 JPanel panel01 = new JPanel();
                 panel01.add(new JLabel("�û���"));
                 panel01.add(new JTextField(10));

                 // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������
                 JPanel panel02 = new JPanel();
                 panel02.add(new JLabel("��   ��"));
                 panel02.add(new JPasswordField(10));

                 // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ
                 JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 panel03.add(new JButton("��¼"));
                 panel03.add(new JButton("ע��"));

                 // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
                 Box vBox = Box.createVerticalBox();
                 vBox.add(panel01);
                 vBox.add(panel02);
                 vBox.add(panel03);

                 load.setContentPane(vBox);

                 load.pack();
                 load.setLocationRelativeTo(null);
                 load.setVisible(true);
                  
                System.out.println("��������  �����");
            	
            }
        });
        // ���� "�Ͽ�����" �Ӳ˵�������ļ�����
        menuforgetsecret.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("�Ͽ�����  �����");
            }
        });
        
       
        
        
        
        // ���� "���ݴ���" �Ӳ˵�������ļ�����
     
        menutypein.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	 final JFrame load = new JFrame("����¼��");
            	 load.setSize(400,400);
            	 load.setLocationRelativeTo(null);
                 //load.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                 // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������
            	 JTextField text1 =  new JTextField(10);
            	 JTextField text2 =  new JTextField(10);
            	 JTextField text3 =  new JTextField(10);
            	 JTextField text4 =  new JTextField(10);
                 JPanel panel01 = new JPanel();
                 panel01.add(new JLabel("����"));
                 panel01.add(text1);
              

                 // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������
                 JPanel panel02 = new JPanel();
                 panel02.add(new JLabel("��ѹ"));
                 panel02.add(text2);

                 // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ
                 JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 JButton confirm = new JButton("ȷ��");
                 panel03.add(confirm);
                 panel03.add(new JButton("ȡ��"));
                 
                 // �� 4 �� JPanel, ʹ�ø�������, �������������������ʾ
                 JPanel panel04 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 panel04.add(new JLabel("ת��"));
                 panel04.add(text3);
                 
                 JPanel panel05 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 JLabel states = new JLabel(" ");
                 panel05.add(states);
                // panel05.add(text4);
            
                 // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
                 Box vBox = Box.createVerticalBox();
                 vBox.add(panel01);
                 vBox.add(panel02);
                 vBox.add(panel04);
                 vBox.add(panel05);
                 vBox.add(panel03);

                 load.setContentPane(vBox);
                 load.pack();
                 load.setLocationRelativeTo(null);
                 load.setVisible(true);
                 
                 //ȷ����������
                 confirm.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                    	 String cur = text1.getText();
                         String vol  = text2.getText();
                         String spe  = text3.getText();
                         //System.out.println(typeintextname);
                         int k = Integer.valueOf(cur);
                         int kkkk = 0;
                         int kk = Integer.valueOf(vol);
                         int kkk = Integer.valueOf(spe);
                         System.out.println(k);
                     	try {
                     	A.Adddata("insert into test(CUR,VOL,ת��) values(("+k+"),("+kk+"),("+kkk+"))");
                     	kkkk++;
                     	
     				} catch (Exception e1) {
     					// TODO Auto-generated catch block
     					e1.printStackTrace();
     				}
                   	  if(kkkk == 1)
                      {
                   		  states.setText("������ӳɹ�");
                   		 
                      }
                   	  else
                   	  {
                   		  states.setText("�������ʧ��");
                   	  }
                         
                      
                     }
                 });
                
                System.out.println("����¼��  �����");
            }
        });
        

        menureacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
              	 final JFrame load = new JFrame("���ݲ�ѯ");
            	 load.setSize(400,400);
            	 load.setLocationRelativeTo(null);
                 //load.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	
            		ArrayList<Integer> list2 = new ArrayList<Integer>();
                	try {
    					list2 = B.Reacherdata("select * from test",6);
    				} catch (Exception e2) {
    					// TODO Auto-generated catch block
    					e2.printStackTrace();
    				}
                	int b[] = new int[list2.size()];
                	for(int i = 0 ;i<list2.size();i++)
                	{
                		b[i] =(int)list2.get(i);
                		System.out.println(b[i]);
                	}

                 // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������
            	 JTextField text1 =  new JTextField(10);
            	 JTextField text2 =  new JTextField(10);
            	 JTextField text3 =  new JTextField(10);
                 JPanel panel01 = new JPanel();
                 panel01.add(new JLabel("ʱ��"));
                 panel01.add(text1);
              

                 // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������
                JPanel panel02 = new JPanel();
                JLabel states = new JLabel(" ");
                 panel02.add( states );
                 //panel02.add(text2);

                 // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ
                 JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 JButton confirm = new JButton("ȷ��");
                 panel03.add(confirm);
                 panel03.add(new JButton("ȡ��"));
                 
                 	//�� 4 �� JPanel, ʹ�ø�������, �������������������ʾ
                JPanel panel04 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 panel04.add(new JLabel("ת��"));
                 panel04.add(text3);
            
                 // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
                 Box vBox = Box.createVerticalBox();
                 vBox.add(panel01);
                 vBox.add(panel02);
                // vBox.add(panel04);
                 vBox.add(panel03);

                 load.setContentPane(vBox);
                 load.pack();
                 load.setLocationRelativeTo(null);
                 load.setVisible(true);
                 
                 //ȷ����������
                 confirm.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                    	 String time = text1.getText();
                         //System.out.println(typeintextname);
                         int k = Integer.valueOf(time);
                       int kk = 0;
                     	for(int i = 0;i<6;i++)
                     	{
                     		if(b[i] == k)
                     		{
                     			kk++;
                     		}
                     			
                     	}
                     	if(kk>=1)
                     	{
                     		states.setText("��ѯ�ɹ�");
                     		System.out.println("��ѯ�ɹ�");
                     	}
                     		
                     	else
                     	{
                     		states.setText("��ѯʧ��");
                     		System.out.println("��ѯʧ��");
                            
                     	}
                     	
                         
                      
                     }

					private int strlen() {
						// TODO Auto-generated method stub
						return 0;
					}
                 });
            	 
                System.out.println("���ݲ�ѯ  �����");
            }
        });
        
        menureacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 
                System.out.println("����¼��  �����");
            }
        });
        menudelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              	 final JFrame load = new JFrame("����ɾ��");
            	 load.setSize(400,400);
            	 load.setLocationRelativeTo(null);
                 //load.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                 // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������
            	 JTextField text1 =  new JTextField(10);
            	 JTextField text2 =  new JTextField(10);
            	 JTextField text3 =  new JTextField(10);
                 JPanel panel01 = new JPanel();
                 panel01.add(new JLabel("ʱ��"));
                 panel01.add(text1);
              

                 // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������
                /* JPanel panel02 = new JPanel();
                 panel02.add(new JLabel("��ѹ"));
                 panel02.add(text2);*/

                 // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ
                 JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 JButton confirm = new JButton("ȷ��");
                 panel03.add(confirm);
                 panel03.add(new JButton("ȡ��"));
                 
                 // �� 4 �� JPanel, ʹ�ø�������, �������������������ʾ
                 JPanel panel04 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                 JLabel states = new JLabel(" ");
                 panel04.add(states);
                // panel04.add(text3);
            
                 // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
                 Box vBox = Box.createVerticalBox();
                 vBox.add(panel01);
               //  vBox.add(panel02);
                 vBox.add(panel04);
                 vBox.add(panel03);

                 load.setContentPane(vBox);
                 load.pack();
                 load.setLocationRelativeTo(null);
                 load.setVisible(true);
                 
                 //ȷ����������
                 confirm.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                    	 String time = text1.getText();
                         //System.out.println(typeintextname);
                         int k = Integer.valueOf(time);
                       int kk = 0;
                     	try {
                     	///String a = "delete from test where time = "+k+" ";
                     	A.Deletedata(k);/////////////////////////////////////////
                     	kk++;
                     	
     				} catch (Exception e1) {
     					// TODO Auto-generated catch block
     					e1.printStackTrace();
     				}
                     	  if(kk == 1)
                          {
                       		  states.setText("����ɾ���ɹ�");
                       		 
                          }
                       	  else
                       	  {
                       		  states.setText("����ɾ��ʧ��");
                       	  }
                         
                      
                     }
                 });
            	 
                System.out.println("����ɾ��  �����");
            }
        });
        
        menureacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 
                System.out.println("����¼��  �����");
            }
        });
        

        // ���� ��ѡ���Ӳ˵����ܵĵ�ѹ��������ת�����ߣ� ״̬�ı� ������
        Volcurve .addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("��ѹ���߸�ѡ���Ƿ�ѡ��: " + Volcurve .isSelected());
            }
        });
        Curcurve .addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("�������߸�ѡ���Ƿ�ѡ��: " + Volcurve .isSelected());
            }
        });
        Specurve .addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("ת�����߸�ѡ���Ƿ�ѡ��: " + Volcurve .isSelected());
            }
        });
        
        

     
      
        jf.setJMenuBar(menuBar);
        jf.setVisible(true);
    }

	private static char[] a(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}