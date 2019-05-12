import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfessorForm extends JFrame implements ActionListener {

    JButton saisirNoteBouton;
    JPanel saisirNotesPanel;
    JButton consulterNoteBouton;
    JPanel consulterNotes;
    JButton listeBouton;
    JPanel listePanel;
    JPanel rightPanel;
    JButton addBouton;

    public ProfessorForm(){
        super();
    }

    private void build() {

        setTitle("Moodle / Professeur");
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

    }

    private void addCompoProfessor() {

       // mainPanel = (JPanel) this.getContentPane();

        JSplitPane jSplitPane1 = new javax.swing.JSplitPane();
        JPanel leftPanel = new javax.swing.JPanel();
        saisirNoteBouton = new javax.swing.JButton();
        consulterNoteBouton = new javax.swing.JButton();
        listeBouton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        saisirNotesPanel = new javax.swing.JPanel();
        JLabel saisieNoteLabel = new javax.swing.JLabel();
        JTextField prenomTextField = new javax.swing.JTextField();
        JLabel prenomLabel = new javax.swing.JLabel();
        JTextField nomTextField = new javax.swing.JTextField();
        JLabel nomLabel = new javax.swing.JLabel();
        JLabel typeControleLabel = new javax.swing.JLabel();
        JComboBox typeComboBox = new javax.swing.JComboBox<>();
        JTextField matriculeEleveTextField = new javax.swing.JTextField();
        JLabel matriculeLabel = new javax.swing.JLabel();
        JTextField codeCoursTextField = new javax.swing.JTextField();
        JLabel codeCoursLabel = new javax.swing.JLabel();
        JTextField noteTextField = new javax.swing.JTextField();
        JLabel noteLabel = new javax.swing.JLabel();
        addBouton = new javax.swing.JButton();
        consulterNotes = new javax.swing.JPanel();
        JLabel consulteLabel = new javax.swing.JLabel();
        JScrollPane jScrollPaneConsulter = new javax.swing.JScrollPane();
        JTable jTableConsulterNote = new javax.swing.JTable();
        listePanel = new javax.swing.JPanel();
        JLabel ListeGrpjLabel = new javax.swing.JLabel();
        JPanel panelSeparation = new javax.swing.JPanel();
        JLabel CoursLabel = new javax.swing.JLabel();
        JScrollPane numGrpScrollPane = new javax.swing.JScrollPane();
        JTable jTableNumgrp = new javax.swing.JTable();
        JScrollPane numCoursScrollPane = new javax.swing.JScrollPane();
        JTable jTableNumCours = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(0, 0, 0));
        leftPanel.setMaximumSize(new java.awt.Dimension(180, 437));
        leftPanel.setMinimumSize(new java.awt.Dimension(180, 437));

        saisirNoteBouton.setBackground(new java.awt.Color(0, 0, 0));
        saisirNoteBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saisirNoteBouton.setForeground(new java.awt.Color(255, 255, 255));
        saisirNoteBouton.setText("Saisir Notes");
        saisirNoteBouton.setBorderPainted(false);
        saisirNoteBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        saisirNoteBouton.addActionListener(this);

        leftPanel.add(saisirNoteBouton);

        consulterNoteBouton.setBackground(new java.awt.Color(0, 0, 0));
        consulterNoteBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        consulterNoteBouton.setForeground(new java.awt.Color(255, 255, 255));
        consulterNoteBouton.setText("Consulter Notes");
        consulterNoteBouton.setBorderPainted(false);
        consulterNoteBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        consulterNoteBouton.addActionListener(this);

        leftPanel.add(consulterNoteBouton);

        listeBouton.setBackground(new java.awt.Color(0, 0, 0));
        listeBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listeBouton.setForeground(new java.awt.Color(255, 255, 255));
        listeBouton.setText("Liste cours et groupe");
        listeBouton.setBorderPainted(false);
        listeBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        listeBouton.addActionListener(this);

        leftPanel.add(listeBouton);

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());

        saisirNotesPanel.setBackground(new java.awt.Color(255, 255, 255));

        saisieNoteLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        saisieNoteLabel.setText("Saisie de Note");

        prenomTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        prenomTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        prenomLabel.setText("Prénom étudiant");

        nomTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nomTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nomLabel.setText("Nom étudiant");

        typeControleLabel.setText("Type de contrôle");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DE", "TP", "Projet" }));

        matriculeEleveTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        matriculeEleveTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        matriculeLabel.setText("Matricule élève");

        codeCoursTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        codeCoursTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codeCoursLabel.setText("Code Cours");

        noteTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        noteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        noteLabel.setText("Note");
        addBouton.setBackground(new java.awt.Color(0, 0, 0));
        addBouton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addBouton.setForeground(new java.awt.Color(255, 255, 255));
        addBouton.setText("Ajouter");
        addBouton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBouton.setBorderPainted(false);


        javax.swing.GroupLayout saisirNotesPanelLayout = new javax.swing.GroupLayout(saisirNotesPanel);
        saisirNotesPanel.setLayout(saisirNotesPanelLayout);
        saisirNotesPanelLayout.setHorizontalGroup(
                saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(saisirNotesPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(prenomLabel)
                                                .addComponent(typeControleLabel)
                                                .addComponent(prenomTextField)
                                                .addComponent(typeComboBox, 0, 148, Short.MAX_VALUE)
                                                .addComponent(codeCoursTextField))
                                        .addComponent(codeCoursLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nomLabel)
                                                .addComponent(matriculeLabel)
                                                .addComponent(nomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                .addComponent(matriculeEleveTextField)
                                                .addComponent(noteTextField))
                                        .addComponent(noteLabel))
                                .addGap(83, 83, 83))
                        .addGroup(saisirNotesPanelLayout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saisieNoteLabel)
                                        .addGroup(saisirNotesPanelLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(addBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(227, Short.MAX_VALUE))
        );
        saisirNotesPanelLayout.setVerticalGroup(
                saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisirNotesPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(saisieNoteLabel)
                                .addGap(31, 31, 31)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prenomLabel)
                                        .addComponent(nomLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(saisirNotesPanelLayout.createSequentialGroup()
                                                .addComponent(typeControleLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(saisirNotesPanelLayout.createSequentialGroup()
                                                .addComponent(matriculeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(matriculeEleveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(codeCoursLabel)
                                        .addComponent(noteLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(saisirNotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(codeCoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(noteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(addBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
        );

        rightPanel.add(saisirNotesPanel, "card2");

        consulterNotes.setBackground(new java.awt.Color(255, 255, 255));

        consulteLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        consulteLabel.setText("Consulter Notes");

        jTableConsulterNote.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"20160001", "1", "DE", "18"}
                },
                new String [] {
                        "Matricule élève", "Code cours", "Types", "Notes"
                }
        ));
        jScrollPaneConsulter.setViewportView(jTableConsulterNote);

        javax.swing.GroupLayout consulterNotesLayout = new javax.swing.GroupLayout(consulterNotes);
        consulterNotes.setLayout(consulterNotesLayout);
        consulterNotesLayout.setHorizontalGroup(
                consulterNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consulterNotesLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(consulteLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPaneConsulter, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        consulterNotesLayout.setVerticalGroup(
                consulterNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consulterNotesLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(consulteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jScrollPaneConsulter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.add(consulterNotes, "card3");

        listePanel.setBackground(new java.awt.Color(255, 255, 255));

        ListeGrpjLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ListeGrpjLabel.setText("Liste des groupes : ");

        panelSeparation.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout panelSeparationLayout = new javax.swing.GroupLayout(panelSeparation);
        panelSeparation.setLayout(panelSeparationLayout);
        panelSeparationLayout.setHorizontalGroup(
                panelSeparationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 13, Short.MAX_VALUE)
        );
        panelSeparationLayout.setVerticalGroup(
                panelSeparationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        CoursLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CoursLabel.setText("Liste des cours : ");

        jTableNumgrp.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"1"},
                        {"2"}
                },
                new String [] {
                        "NUMERO GROUPE"
                }
        ));
        numGrpScrollPane.setViewportView(jTableNumgrp);

        jTableNumCours.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"math"}
                },
                new String [] {
                        "NOM COURS"
                }
        ));
        numCoursScrollPane.setViewportView(jTableNumCours);

        javax.swing.GroupLayout listePanelLayout = new javax.swing.GroupLayout(listePanel);
        listePanel.setLayout(listePanelLayout);
        listePanelLayout.setHorizontalGroup(
                listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listePanelLayout.createSequentialGroup()
                                                .addComponent(ListeGrpjLabel)
                                                .addGap(111, 111, 111))
                                        .addComponent(numGrpScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(panelSeparation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CoursLabel)
                                        .addComponent(numCoursScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        listePanelLayout.setVerticalGroup(
                listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelSeparation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(listePanelLayout.createSequentialGroup()
                                .addGroup(listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listePanelLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(ListeGrpjLabel))
                                        .addGroup(listePanelLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(CoursLabel)))
                                .addGroup(listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listePanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                                .addComponent(numGrpScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                        .addGroup(listePanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(numCoursScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        rightPanel.add(listePanel, "card4");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();

    }

    public static void createAndShowGUIProfessor() {

        ProfessorForm frame = new ProfessorForm();

        frame.build();
        frame.addCompoProfessor();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == saisirNoteBouton)
        {
            rightPanel.removeAll();
            rightPanel.add(saisirNotesPanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }
        else if(source == consulterNoteBouton){
            rightPanel.removeAll();
            rightPanel.add(consulterNotes);
            rightPanel.repaint();
            rightPanel.revalidate();
        }
        else if(source == listeBouton){
            rightPanel.removeAll();
            rightPanel.add(listePanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }

    }
}
