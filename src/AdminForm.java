import bdd.BaseDeDonnees;
import ecole.Eleve;
import ecole.Personne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AdminForm extends JFrame implements ActionListener {

    BaseDeDonnees baseDeDonnees = new BaseDeDonnees();

    JButton addStudentBouton;
    JButton majBouton;
    JButton consulterNoteBouton;
    JButton listeBouton;
    JButton validationBouton;
    JPanel rightPanel;
    JPanel saisirNotesPanel;
    JPanel consulterNotes;
    JPanel listePanel;
    JPanel addStudentPanel;
    JPanel validerBulletinPanel;

    private final int PANEL_ADD_STUDENT = 1;
    private final int PANEL_GRADES_UPDATE = 2;
    private final int PANEL_GRADES_DISPLAY = 3;
    private final int PANEL_GROUPS_AND_CLASSES = 4;
    private final int PANEL_SCHOOL_REPORT = 5;

    private int currentPanel;

    public AdminForm(){
        super();
    }

    private void build() {

        setTitle("Moodle / Administration");
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

    }

    private void addCompoAdmin() {

        //Personne p = Personne.creerPersonneResponsableDansBdd(baseDeDonnees, "Dupont", "Jean", "1 rue LOL", 123456, "Springfield", "123456789", "lol@lol.com");

        ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        JSplitPane jSplitPane1 = new javax.swing.JSplitPane();
        JPanel leftPanel = new javax.swing.JPanel();
        addStudentBouton = new javax.swing.JButton();
        majBouton = new javax.swing.JButton();
        consulterNoteBouton = new javax.swing.JButton();
        listeBouton = new javax.swing.JButton();
        validationBouton = new javax.swing.JButton();
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
        JButton addBouton = new javax.swing.JButton();
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
        addStudentPanel = new javax.swing.JPanel();
        JLabel addLabel = new javax.swing.JLabel();
        JTextField prenomAddStudentField = new javax.swing.JTextField();
        JLabel prenomAddStudentLabel = new javax.swing.JLabel();
        JTextField nomAddStudentField = new javax.swing.JTextField();
        JLabel nomAddStudentLabel = new javax.swing.JLabel();
        JLabel typeControleLabel1 = new javax.swing.JLabel();
        JTextField villeBornTextField = new javax.swing.JTextField();
        JLabel villeBornLabel = new javax.swing.JLabel();
        JLabel adresseLabel = new javax.swing.JLabel();
        JTextField adresseTextField = new javax.swing.JTextField();
        JTextField paysBornTextField = new javax.swing.JTextField();
        JLabel paysBornLabel = new javax.swing.JLabel();
        JRadioButton FemmeRadioButton = new javax.swing.JRadioButton();
        JRadioButton MaleRadioButton = new javax.swing.JRadioButton();
        JTextField mailTextField = new javax.swing.JTextField();
        JLabel mailLabel = new javax.swing.JLabel();
        JTextField cpTextField = new javax.swing.JTextField();
        JLabel cpLabel = new javax.swing.JLabel();
        JTextField villeTextField = new javax.swing.JTextField();
        JLabel villeLabel = new javax.swing.JLabel();
        JTextField telephoneTextField = new javax.swing.JTextField();
        JLabel telephoneLabel = new javax.swing.JLabel();
        JTextField mdpTextField = new javax.swing.JTextField();
        JLabel mdpLabel = new javax.swing.JLabel();
        JTextField grpTextField = new javax.swing.JTextField();
        JLabel grpLabel = new javax.swing.JLabel();
        JButton AddStudentButton = new javax.swing.JButton();
        validerBulletinPanel = new javax.swing.JPanel();
        JLabel validationLabel = new javax.swing.JLabel();
        JTextField matriculeValidTextField = new javax.swing.JTextField();
        JLabel matriculeValidationLabel = new javax.swing.JLabel();
        JButton validationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(0, 0, 0));
        leftPanel.setMaximumSize(new java.awt.Dimension(180, 437));
        leftPanel.setMinimumSize(new java.awt.Dimension(180, 437));

        addStudentBouton.setBackground(new java.awt.Color(0, 0, 0));
        addStudentBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStudentBouton.setForeground(new java.awt.Color(255, 255, 255));
        addStudentBouton.setText("Ajouter un élève");
        addStudentBouton.setBorderPainted(false);
        addStudentBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        addStudentBouton.addActionListener(this);

        leftPanel.add(addStudentBouton);

        majBouton.setBackground(new java.awt.Color(0, 0, 0));
        majBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        majBouton.setForeground(new java.awt.Color(255, 255, 255));
        majBouton.setText("Mise à jour notes");
        majBouton.setBorderPainted(false);
        majBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        majBouton.addActionListener(this);

        leftPanel.add(majBouton);

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

        validationBouton.setBackground(new java.awt.Color(0, 0, 0));
        validationBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        validationBouton.setForeground(new java.awt.Color(255, 255, 255));
        validationBouton.setText("Valider un bulletin");
        validationBouton.setBorderPainted(false);
        validationBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        validationBouton.addActionListener(this);

        leftPanel.add(validationBouton);

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());

        saisirNotesPanel.setBackground(new java.awt.Color(255, 255, 255));

        saisieNoteLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        saisieNoteLabel.setText("Mise à jour");

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
        addBouton.addActionListener(this);

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
                                .addContainerGap(223, Short.MAX_VALUE))
                        .addGroup(consulterNotesLayout.createSequentialGroup()
                                .addComponent(jScrollPaneConsulter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(106, 106, 106))
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

        addStudentPanel.setBackground(new java.awt.Color(255, 255, 255));

        addLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addLabel.setText("Ajout d'un élève");

        prenomAddStudentField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        prenomAddStudentField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        prenomAddStudentLabel.setText("Prénom étudiant");

        nomAddStudentField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nomAddStudentField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nomAddStudentLabel.setText("Nom étudiant");

        typeControleLabel1.setText("Sexe");

        villeBornTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        villeBornTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        villeBornLabel.setText("Ville de naissance");

        adresseLabel.setText("Adresse");

        adresseTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        adresseTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        paysBornTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        paysBornTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        paysBornLabel.setText("Pays de naissance");

        FemmeRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FemmeRadioButton);
        FemmeRadioButton.setText("F");


        MaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setText("M");

        mailTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mailLabel.setText("Email");

        cpTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cpTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cpLabel.setText("Code Postal");

        villeTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        villeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        villeLabel.setText("Ville");

        telephoneTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        telephoneTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        telephoneLabel.setText("Telephone");

        mdpTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mdpTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mdpLabel.setText("Mot de Passe");

        grpTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        grpTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


        grpLabel.setText("Numero Groupe");

        AddStudentButton.setBackground(new java.awt.Color(0, 0, 0));
        AddStudentButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        AddStudentButton.setText("Ajouter");
        AddStudentButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AddStudentButton.setBorderPainted(false);

        javax.swing.GroupLayout addStudentPanelLayout = new javax.swing.GroupLayout(addStudentPanel);
        addStudentPanel.setLayout(addStudentPanelLayout);
        addStudentPanelLayout.setHorizontalGroup(
                addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                .addGap(198, 198, 198)
                                                .addComponent(addLabel))
                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(prenomAddStudentLabel)
                                                                        .addComponent(prenomAddStudentField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(villeBornTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(villeBornLabel)
                                                                        .addComponent(adresseLabel))
                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(nomAddStudentField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(nomAddStudentLabel)
                                                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(paysBornTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(paysBornLabel))
                                                                                                .addGap(26, 26, 26)
                                                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(typeControleLabel1)
                                                                                                        .addComponent(FemmeRadioButton))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(MaleRadioButton))))
                                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                                .addGap(91, 91, 91)
                                                                                .addComponent(villeLabel))))
                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(villeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(telephoneTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cpTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                                                .addComponent(cpLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                                        .addComponent(telephoneLabel))
                                                                .addGap(28, 28, 28)
                                                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mailLabel)
                                                                        .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                                .addComponent(mdpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(43, 43, 43)
                                                                                .addComponent(grpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                                                .addComponent(mdpLabel)
                                                                                .addGap(127, 127, 127)
                                                                                .addComponent(grpLabel))))))
                                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                                .addGap(222, 222, 222)
                                                .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))
        );
        addStudentPanelLayout.setVerticalGroup(
                addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addLabel)
                                .addGap(37, 37, 37)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prenomAddStudentLabel)
                                        .addComponent(nomAddStudentLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prenomAddStudentField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomAddStudentField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(villeBornLabel)
                                        .addComponent(paysBornLabel)
                                        .addComponent(typeControleLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(villeBornTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paysBornTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FemmeRadioButton)
                                        .addComponent(MaleRadioButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adresseLabel)
                                        .addComponent(villeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(villeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cpLabel)
                                        .addComponent(mailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(telephoneLabel)
                                        .addComponent(mdpLabel)
                                        .addComponent(grpLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mdpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(grpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
        );


        /*String nom = nomAddStudentField.getText();
        String prenom = prenomAddStudentField.getText();
        String adresse = adresseTextField.getText();
        int codeP = Integer.parseInt(cpTextField.getText());
        String ville = villeTextField.getText();
        String tel = telephoneTextField.getText();
        String mail = mailTextField.getText();
        String cityBorn = villeBornTextField.getText();
        String countryBorn = paysBornTextField.getText();
        String mdp = mdpTextField.getText();
        String sexe = buttonGroup1.getSelection().getActionCommand();
        int numGroupe = Integer.parseInt(grpTextField.getText());*/



       // Eleve e = Eleve.creerEleveDansBdd(baseDeDonnees, 2016, nom, prenom, adresse,
        //        codeP,ville, tel, mail, new Date(), cityBorn,
          //      countryBorn, sexe, mdp, numGroupe, p);

        rightPanel.add(addStudentPanel, "card5");

        validerBulletinPanel.setBackground(new java.awt.Color(255, 255, 255));

        validationLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        validationLabel.setText("Validation d'un bulletin");

        matriculeValidTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        matriculeValidTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        matriculeValidationLabel.setText("Matricule élève");

        validationButton.setBackground(new java.awt.Color(0, 0, 0));
        validationButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        validationButton.setForeground(new java.awt.Color(255, 255, 255));
        validationButton.setText("Valider");
        validationButton.setBorderPainted(false);

        javax.swing.GroupLayout validerBulletinPanelLayout = new javax.swing.GroupLayout(validerBulletinPanel);
        validerBulletinPanel.setLayout(validerBulletinPanelLayout);
        validerBulletinPanelLayout.setHorizontalGroup(
                validerBulletinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(validerBulletinPanelLayout.createSequentialGroup()
                                .addGroup(validerBulletinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(validerBulletinPanelLayout.createSequentialGroup()
                                                .addGap(167, 167, 167)
                                                .addComponent(validationLabel))
                                        .addGroup(validerBulletinPanelLayout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addGroup(validerBulletinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(matriculeValidationLabel)
                                                        .addComponent(matriculeValidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(167, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, validerBulletinPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(validationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(211, 211, 211))
        );
        validerBulletinPanelLayout.setVerticalGroup(
                validerBulletinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(validerBulletinPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(validationLabel)
                                .addGap(65, 65, 65)
                                .addComponent(matriculeValidationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriculeValidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(validationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(166, Short.MAX_VALUE))
        );

        rightPanel.add(validerBulletinPanel, "card6");

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

    public static void createAndShowGUIAdmin() {

        AdminForm frame = new AdminForm();

        frame.build();
        frame.addCompoAdmin();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addStudentBouton)
        {
            rightPanel.removeAll();
            rightPanel.add(addStudentPanel);
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
        else if(source == majBouton){
            rightPanel.removeAll();
            rightPanel.add(saisirNotesPanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }
        else if(source == validationBouton){
            rightPanel.removeAll();
            rightPanel.add(validerBulletinPanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }
    }
}
