import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class StudentForm extends JFrame implements ActionListener {

    private JPanel panel1;
    private JPanel form;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane5;
    JButton noteBouton;
    JButton planningBouton;
    JButton listeBouton;
    JPanel rightPanel;
    JPanel notesPanel;
    JPanel planningPanel;
    JPanel listePanel;

    public StudentForm(){
        super();
    }

    private void build() {

        setTitle("Moodle / Eleve");
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

    }

    // Ici je dois creer des panel avec les diff trucs qu'il pourra faire j'ai deja la liste

    private void addCompoStudent() {

        JSplitPane jSplitPane1 = new javax.swing.JSplitPane();
        JPanel leftPanel = new javax.swing.JPanel();
        noteBouton = new javax.swing.JButton();
        planningBouton = new javax.swing.JButton();
        listeBouton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        notesPanel = new javax.swing.JPanel();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        planningPanel = new javax.swing.JPanel();
        listePanel = new javax.swing.JPanel();

        JTable jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        JScrollPane calendarScrollPane = new javax.swing.JScrollPane();
        JTable calendarJTable = new javax.swing.JTable();

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

        noteBouton.setBackground(new java.awt.Color(0, 0, 0));
        noteBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noteBouton.setForeground(new java.awt.Color(255, 255, 255));
        noteBouton.setText("Notes");
        noteBouton.setBorderPainted(false);
        noteBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        noteBouton.addActionListener(this);

        leftPanel.add(noteBouton);

        planningBouton.setBackground(new java.awt.Color(0, 0, 0));
        planningBouton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planningBouton.setForeground(new java.awt.Color(255, 255, 255));
        planningBouton.setText("Planning");
        planningBouton.setBorderPainted(false);
        planningBouton.setPreferredSize(new java.awt.Dimension(180, 35));
        planningBouton.addActionListener(this);

        leftPanel.add(planningBouton);

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

        notesPanel.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Matiere", "Moyenne", "Note DE", "Note Projet", "Note TP"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Notes du Semestre");

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
                notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(notesPanelLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        notesPanelLayout.setVerticalGroup(
                notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.add(notesPanel, "card2");

        planningPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Planning semaine");

        calendarJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Anglais", "20/05/2019", "14h - 16h", "Smith"}
                },
                new String [] {
                        "Nom Cours", "Date Cours", "Heure Cours", "Professeur"
                }
        ));
        calendarScrollPane.setViewportView(calendarJTable);

        javax.swing.GroupLayout planningPanelLayout = new javax.swing.GroupLayout(planningPanel);
        planningPanel.setLayout(planningPanelLayout);
        planningPanelLayout.setHorizontalGroup(
                planningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(planningPanelLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(calendarScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        planningPanelLayout.setVerticalGroup(
                planningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(planningPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(calendarScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );

        rightPanel.add(planningPanel, "card3");

        listePanel.setBackground(new java.awt.Color(255, 255, 255));

        ListeGrpjLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ListeGrpjLabel.setText("Liste des groupes : ");

        panelSeparation.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout panelSeparationLayout = new javax.swing.GroupLayout(panelSeparation);
        panelSeparation.setLayout(panelSeparationLayout);
        panelSeparationLayout.setHorizontalGroup(
                panelSeparationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 20, Short.MAX_VALUE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CoursLabel)
                                        .addComponent(numCoursScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(listePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numGrpScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numCoursScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
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

    public static void createAndShowGUIStudent() {
        StudentForm frame = new StudentForm();

        frame.build();
        frame.addCompoStudent();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == noteBouton)
        {
            rightPanel.removeAll();
            rightPanel.add(notesPanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }
        else if (source == planningBouton)
        {
            rightPanel.removeAll();
            rightPanel.add(planningPanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }
        else if (source == listeBouton)
        {
            rightPanel.removeAll();
            rightPanel.add(listePanel);
            rightPanel.repaint();
            rightPanel.revalidate();
        }

    }

   /* public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {

            try {
                createAndShowGUIStudent();

            } catch (Exception e) {
                e.printStackTrace();
            }


        });
    }*/


}
