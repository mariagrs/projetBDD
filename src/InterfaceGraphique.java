import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class InterfaceGraphique extends JFrame implements ActionListener {

    JPanel form;
    private JPanel mainPanel;

    JPanel form2;

    JButton connexionButton;
    JTextField login;
    JPasswordField password;
    JPanel panelColor;
    JLabel LogInText;
    JLabel PasswordText;

    private InterfaceGraphique(){
        super();

    }

    private void build() {

        setTitle("Moodle Connexion");
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

    }

    private void addCompononents() throws FileNotFoundException {

       /* mainPanel = (JPanel) this.getContentPane();
        // Students management card

        form = new JPanel(new BorderLayout());
        form2 = new JPanel(new BorderLayout());

        login = new JTextField(20);
        password = new JPasswordField(20);

        connexionButton = new JButton("Login");
        connexionButton.addActionListener(this);

        JLabel labelUser = new JLabel("username ");
        JLabel labelPassword = new JLabel("password ");


        JPanel textFieldsPanel = new JPanel(new FlowLayout());
        JPanel textFieldsPanel2 = new JPanel(new FlowLayout());

        textFieldsPanel.add(labelUser);
        textFieldsPanel.add(login);

        textFieldsPanel2.add(labelPassword);
        textFieldsPanel2.add(password);


        form.add(textFieldsPanel, BorderLayout.NORTH);
        form.add(textFieldsPanel2, BorderLayout.CENTER);
        form.add(connexionButton, BorderLayout.SOUTH);

        mainPanel.add(form, BorderLayout.CENTER);*/


        mainPanel = new javax.swing.JPanel();
        panelColor = new javax.swing.JPanel();
        LogInText = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        JLabel EmailText = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        connexionButton = new javax.swing.JButton();
        JLabel LogInText1 = new javax.swing.JLabel();
        JLabel IconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        panelColor.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
                panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 20, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
                panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 341, Short.MAX_VALUE)
        );

        LogInText.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        LogInText.setForeground(new java.awt.Color(102, 102, 102));
        LogInText.setText("Log In");

        login.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(51, 51, 51));
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));


        PasswordText.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(51, 51, 51));
        PasswordText.setText("Password");

        EmailText.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        EmailText.setForeground(new java.awt.Color(51, 51, 51));
        EmailText.setText("Email");

        password.setText("jPasswordField1");
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        password.setMinimumSize(new java.awt.Dimension(3, 25));

        connexionButton.setBackground(new java.awt.Color(204, 0, 51));
        connexionButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        connexionButton.setForeground(new java.awt.Color(255, 255, 255));
        connexionButton.setText("Log In");
        connexionButton.setToolTipText("");
        connexionButton.setBorder(null);
        connexionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connexionButton.setName(""); // NOI18N
        connexionButton.addActionListener(this);

        LogInText1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        LogInText1.setForeground(new java.awt.Color(102, 102, 102));
        LogInText1.setText("Moodle");
        LogInText1.setToolTipText("");
        LogInText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("accountlogin-icon.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LogInText1)
                                        .addComponent(IconLabel))
                                .addGap(41, 41, 41)
                                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(connexionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PasswordText)
                                                        .addComponent(EmailText))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(LogInText)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(16, Short.MAX_VALUE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(LogInText)
                                .addGap(37, 37, 37)
                                .addComponent(EmailText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(PasswordText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(connexionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(LogInText1)
                                .addGap(18, 18, 18)
                                .addComponent(IconLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(564, 380));
        setLocationRelativeTo(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        String userName = login.getText();
        String pwd = password.getText();

        // en gros par rapport à ton username ou mail ça t'envoie vers le panel correspondant

        if(source == connexionButton ) {

           if (userName.equals("mariagrs")&& pwd.equals("123")) { // en gros c'est l'eleve mais bon faudra relier à la bdd

               //JOptionPane.showMessageDialog(mainPanel,"You are sucessfully login");
               mainPanel.setVisible(false);
               dispose();
               StudentForm stdform = new StudentForm();
               stdform.createAndShowGUIStudent();

           }
           else if (userName.equals("prof")&& pwd.equals("234")){ // idem pour ça / prof

               mainPanel.setVisible(false);
               dispose();
               ProfessorForm profForm = new ProfessorForm();
               profForm.createAndShowGUIProfessor();
           }
           else if (userName.equals("admin")&& pwd.equals("345")){ // Admin

               mainPanel.setVisible(false);
               dispose();
               AdminForm adminForm = new AdminForm();
               adminForm.createAndShowGUIAdmin();
           }
           else
               JOptionPane.showMessageDialog(mainPanel,"Invalid username or password");


        }

    }

    private static void createAndShowGUI() throws FileNotFoundException {

        InterfaceGraphique frame = new InterfaceGraphique();

        frame.build();
        frame.addCompononents();
        frame.setVisible(true);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {
            try {
                createAndShowGUI();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });

    }

}
