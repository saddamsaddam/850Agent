import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class TabbedPaneExample {
    static JTextField jtt ;
   static JCheckBox advancecheckbox=new JCheckBox();
   static JCheckBox[] crytocheckbox=new JCheckBox[4];
   static JTextField[] advanceTextfield=new JTextField[1];
   static JPasswordField[] advancepassTextfield=new JPasswordField[2];
   static JTextField[] cryptoTextfield=new JTextField[2];
   Boolean result;
    public static void main(String[] args) {
        String[] generaltext={"Name","D.O.B","S.S.N","850"};
        String[] activatetext={"Activation Code","PIN","Confirm PIN","ON"};
        String[] cryptotext={"USDT ADD 1","USDT ADD 2","MIX","MULTIPLY 3X","SWAP","EXCHANGE"};
       
        int ad=0;
        int adp=0;
        int cr=0;
        int crch=0;
       
        int width=150; int height=30;
        JFrame frame = new JFrame("850 Agent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel generalPanel = new JPanel();
         JPanel mainPanelgenaral = new JPanel();
         mainPanelgenaral.setLayout(new BoxLayout(mainPanelgenaral, BoxLayout.Y_AXIS));
         mainPanelgenaral.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
        
       // rightPanel .setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
           for(int j=0;j<5;j++)
           {
           JPanel rightPanel = new JPanel();
           rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0,10, 0));

           rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.X_AXIS));
           for (int i = 0; i < 2; i++) {
            JPanel subPanel = new JPanel();
            
            subPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
            subPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
            
            if(i==0){
                if(j==4)
                {
                     subPanel.setPreferredSize(new Dimension(width, height));
                    JButton jl=new JButton("ON");
                      jl.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Check if required fields are filled
                            if (!advanceTextfield[0].getText().isEmpty() &&
                                    !advancepassTextfield[0].getText().isEmpty() &&
                                    !advancepassTextfield[1].getText().isEmpty()&& advancecheckbox.isSelected() ) {

                                // Disable text fields and checkbox
                                advanceTextfield[0].setEnabled(false);
                                advancepassTextfield[0].setEnabled(false);
                                advancepassTextfield[1].setEnabled(false);
                                //numberField.setEnabled(false);
                                advancecheckbox.setEnabled(false);
                            }
                        }
                    });
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    jl.setPreferredSize(new Dimension(width-20,height-5)); 
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
                else
                {
                     subPanel.setPreferredSize(new Dimension(width-70, height));
                    JLabel jl=new JLabel(generaltext[j]);
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
           
            
            
            }else{
                if(j==3)
                {
                   //JCheckBox jk =new JCheckBox();
                   advancecheckbox=new JCheckBox();
                   subPanel.add(advancecheckbox);
                   subPanel.setBorder(null);
                   subPanel.setPreferredSize(new Dimension(width, height));
                }
               else if(j==4)
                {
                     subPanel.setPreferredSize(new Dimension(width, height));
                    JButton jl=new JButton("OFF");
                    jl.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Check if required fields are filled
                            // Disable text fields and checkbox
                                advanceTextfield[0].setEnabled(true);
                                advancepassTextfield[0].setEnabled(true);
                                advancepassTextfield[1].setEnabled(true);
                                //numberField.setEnabled(false);
                                advancecheckbox.setEnabled(true);
                        }
                    });
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                     jl.setPreferredSize(new Dimension(width-20,height-5)); 
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
                else
                {
                    if(j==0)
                    {
                      // JTextField jt = new JTextField();
                    advanceTextfield[ad]=new JTextField();
                   advanceTextfield[ad].setHorizontalAlignment(SwingConstants.CENTER);
                    advanceTextfield[ad]=new JTextField();
                   advanceTextfield[ad].setBackground(subPanel.getBackground()); // Set the text field's background to match the panel
                   advanceTextfield[ad].setHorizontalAlignment(JTextField.CENTER);
                   advanceTextfield[ad].setBackground(null);
                   advanceTextfield[ad].setBorder(null);
                   advanceTextfield[ad].setPreferredSize(new Dimension(width-5,height-5)); 
                    subPanel.setPreferredSize(new Dimension(width, height));
                    subPanel.add(advanceTextfield[ad]);
                    subPanel.setBackground(Color.white);
                    ad++;  
                    }
                    else
                    {
                       // JTextField jt = new JTextField();
                    advancepassTextfield[adp]=new JPasswordField();
                    advancepassTextfield[adp].setHorizontalAlignment(SwingConstants.CENTER);
                   advancepassTextfield[adp].setBackground(subPanel.getBackground()); // Set the text field's background to match the panel
                   advancepassTextfield[adp].setHorizontalAlignment(JTextField.CENTER);
                   advancepassTextfield[adp].setBackground(null);
                   advancepassTextfield[adp].setBorder(null);
                  advancepassTextfield[adp].setPreferredSize(new Dimension(width-5,height-5)); 
                    subPanel.setPreferredSize(new Dimension(width, height));
                    subPanel.add(advancepassTextfield[adp]);
                    subPanel.setBackground(Color.white);
                    adp++; 
                    }
                   
                }
            
            }

            rightPanel.add(subPanel, BorderLayout.CENTER);
        }
         //
        mainPanelgenaral.add(rightPanel, BorderLayout.CENTER);
        
               
           }

        // Adding the text panel to the general panel
        generalPanel.add(mainPanelgenaral);
        

        // Other panels (Advanced, Activate, Crypto) remain unchanged
        JPanel advancedPanel = new JPanel();
        advancedPanel.add(new JLabel("Advanced Settings Content"));
        

        JPanel activatePanel = new JPanel();
       // activatePanel.add(new JLabel("Activate Settings Content"));
        JPanel mainPanelactivate = new JPanel();
         mainPanelactivate.setLayout(new BoxLayout(mainPanelactivate, BoxLayout.Y_AXIS));
         mainPanelactivate.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
        
       // rightPanel .setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
           for(int j=0;j<5;j++)
           {
           JPanel rightPanel = new JPanel();
           rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0,10, 0));

           rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.X_AXIS));
           for (int i = 0; i < 2; i++) {
            JPanel subPanel = new JPanel();
            
            subPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
            subPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
            
            if(i==0){
                if(j==4)
                {
                     subPanel.setPreferredSize(new Dimension(width*2, height));
                    JButton jl=new JButton("Activate");
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    jl.setPreferredSize(new Dimension(2*width-20,height-5)); 
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
               else if(j==3)
                {
                    subPanel.setPreferredSize(new Dimension(width, height));
                    JButton jl=new JButton("Set Pin");
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    jl.setPreferredSize(new Dimension(width-20,height-5)); 
                    subPanel.add(jl);
                    subPanel.setBorder(null); 
                }
                else
                {
                    subPanel.setPreferredSize(new Dimension(width-70, height));
                    JLabel jl=new JLabel(activatetext[j]);
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
           
            
            
            }else{
                if(j==3)
                {
                    subPanel.setPreferredSize(new Dimension(width, height));
                    JButton jl=new JButton("Change Pin");
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    jl.setPreferredSize(new Dimension(width-20,height-5)); 
                    subPanel.add(jl);
                    subPanel.setBorder(null); 
                }
               else if(j==4)
                {
                     subPanel.setPreferredSize(new Dimension(0, 0));
                    
                    subPanel.setBorder(null);
                }
                else
                {
                    
                   
                    if(j==2|| j==1)
                    {
                     JPasswordField jt = new JPasswordField(5);
                     jt.setHorizontalAlignment(SwingConstants.CENTER);
                      jt.setHorizontalAlignment(JTextField.CENTER);
                         // Create a DocumentFilter to limit the text length
                    ((AbstractDocument) jt.getDocument()).setDocumentFilter(new DocumentFilter() {
                        @Override
                        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                            // Check if the resulting text length is less than or equal to 5
                            if ((fb.getDocument().getLength() + text.length() - length) <= 5) {
                                super.replace(fb, offset, length, text, attrs);
                            } else {
                                // Display an error or take appropriate action if the limit is exceeded
                                // For now, just beep to indicate an error
                                Toolkit.getDefaultToolkit().beep();
                            }
                        }
                    });
                     jt.setBackground(subPanel.getBackground()); // Set the text field's background to match the panel
                   
                    jt.setBackground(null);
                    jt.setBorder(null);
                    jt.setPreferredSize(new Dimension(width-5,height-5)); 
                    subPanel.setPreferredSize(new Dimension(width, height));
                    subPanel.add(jt);
                    subPanel.setBackground(Color.white);
                    }
                    else
                    {
                     jtt = new JTextField();
                     jtt.setHorizontalAlignment(SwingConstants.LEFT);
                      jtt.setHorizontalAlignment(JTextField.LEFT);
                      jtt.setBackground(subPanel.getBackground()); // Set the text field's background to match the panel
                   
                    jtt.setBackground(null);
                    jtt.setBorder(null);
                    jtt.setPreferredSize(new Dimension(width-5,height-5)); 
                    subPanel.setPreferredSize(new Dimension(width, height));
                    subPanel.add(jtt);
                    subPanel.setBackground(Color.white);
                    }
                   
                   // jt=new JTextField();
                   
                }
            
            }

            rightPanel.add(subPanel, BorderLayout.CENTER);
        }
         //
        mainPanelactivate.add(rightPanel, BorderLayout.CENTER);
        
               
           }

        // Adding the text panel to the general panel
        activatePanel.add(mainPanelactivate);

        JPanel cryptoPanel = new JPanel();
        //cryptoPanel.add(new JLabel("Crypto Settings Content"));
         JPanel mainPanelcrypto = new JPanel();
         mainPanelcrypto.setLayout(new BoxLayout(mainPanelcrypto, BoxLayout.Y_AXIS));
         mainPanelcrypto.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
        
       // rightPanel .setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
           for(int j=0;j<7;j++)
           {
           JPanel rightPanel = new JPanel();
           rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0,10, 0));

           rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.X_AXIS));
           for (int i = 0; i < 2; i++) {
            JPanel subPanel = new JPanel();
            
            subPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
            subPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
            
            if(i==0){
                if(j==6)
                {
                     subPanel.setPreferredSize(new Dimension(2*width, height));
                    JButton jl=new JButton("SEND");
                    jl.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Check if required fields are filled
                            if (!cryptoTextfield[0].getText().isEmpty() &&
                                    !cryptoTextfield[1].getText().isEmpty()
                                   && crytocheckbox[0].isSelected()&&crytocheckbox[1].isSelected() && crytocheckbox[2].isSelected()&&crytocheckbox[3].isSelected() ) {

                                
                                 
                                if(!cryptoTextfield[0].isEnabled()&& !cryptoTextfield[1].isEnabled()&&!crytocheckbox[0].isEnabled()&&!crytocheckbox[1].isEnabled()&&!crytocheckbox[2].isEnabled()&&!crytocheckbox[3].isEnabled())
                                  {
                                     cryptoTextfield[0].setEnabled(true);
                                      cryptoTextfield[1].setEnabled(true);
                                       crytocheckbox[0].setEnabled(true);
                                       crytocheckbox[1].setEnabled(true);
                                       crytocheckbox[2].setEnabled(true);
                                       crytocheckbox[3].setEnabled(true);
                                       
                                       cryptoTextfield[0].setText("");
                                      cryptoTextfield[1].setText("");
                                       crytocheckbox[0].setSelected(false);
                                       crytocheckbox[1].setSelected(false);
                                       crytocheckbox[2].setSelected(false);
                                       crytocheckbox[3].setSelected(false);
                                  }
                                else
                                {
                                    // Disable text fields and checkbox
                                cryptoTextfield[0].setEnabled(false);
                                cryptoTextfield[1].setEnabled(false);
                                 crytocheckbox[0].setEnabled(false);
                                 crytocheckbox[1].setEnabled(false);
                                 crytocheckbox[2].setEnabled(false);
                                 crytocheckbox[3].setEnabled(false);
                                }
                                
                                 
                            }
                            
                           
                        }
                    });
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    jl.setPreferredSize(new Dimension(2*width-20,height-5)); 
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
                else 
                {
                     subPanel.setPreferredSize(new Dimension(width-70, height));
                    JLabel jl=new JLabel(cryptotext[j]);
                    jl.setHorizontalAlignment(SwingConstants.CENTER);
                    jl.setHorizontalAlignment(JLabel.CENTER);
                    subPanel.add(jl);
                    subPanel.setBorder(null);
                }
           
            
            
            }else{
                if(j>=2 && j<=5)
                {
                   crytocheckbox[crch]=new JCheckBox();
                   subPanel.add(crytocheckbox[crch]);
                   subPanel.setBorder(null);
                   subPanel.setPreferredSize(new Dimension(width, height));
                   crch++;
                }
               else if(j==6)
                {
                     subPanel.setPreferredSize(new Dimension(0, 0));
                    
                    subPanel.setBorder(null);
                }
               else if(j==0|| j==1)
                {
                    cryptoTextfield[cr]=new JTextField();
                    cryptoTextfield[cr].setHorizontalAlignment(SwingConstants.CENTER);
                    cryptoTextfield[cr]=new JTextField();
                    cryptoTextfield[cr].setBackground(subPanel.getBackground()); // Set the text field's background to match the panel
                    cryptoTextfield[cr].setHorizontalAlignment(JTextField.CENTER);
                    cryptoTextfield[cr].setBackground(null);
                    cryptoTextfield[cr].setBorder(null);
                    cryptoTextfield[cr].setPreferredSize(new Dimension(width-5,height-5)); 
                    subPanel.setPreferredSize(new Dimension(width, height));
                    subPanel.add(cryptoTextfield[cr]);
                    subPanel.setBackground(Color.white);
                    cr++;
                }
            
            }

            rightPanel.add(subPanel, BorderLayout.CENTER);
        }
         //
        mainPanelcrypto.add(rightPanel, BorderLayout.CENTER);
        
               
           }

        // Adding the text panel to the general panel
        cryptoPanel.add(mainPanelcrypto);
        

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("General", generalPanel);
        tabbedPane.addTab("Advanced", advancedPanel);
        tabbedPane.setEnabledAt(1, false); // Assuming "Advanced" is at index 1


        tabbedPane.addTab("Activate", activatePanel);
        tabbedPane.addTab("Crypto", cryptoPanel);

        frame.add(tabbedPane);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
