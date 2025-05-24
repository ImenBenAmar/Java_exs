import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ClassFen extends JFrame implements ActionListener {

    // Création des composants
    JLabel idLabel = new JLabel("id:");
    JTextField idField = new JTextField(20);

    JLabel libLabel = new JLabel("Libele:");
    JTextField libField = new JTextField(20);

    JLabel prixLabel = new JLabel("Prix:");
    JTextField prixField = new JTextField(20);

    JLabel etatLabel = new JLabel("État:");
    String[] etatOptions = {"dispo", "encore"};
    JComboBox<String> etatComboBox = new JComboBox<>(etatOptions);

    JButton ajout = new JButton("ajouter");
    JButton supprimer = new JButton("supprimer");
    JButton annuler = new JButton("annuler");
    JButton quitter = new JButton("quitter");

    Object[][] elem = {
        {"1", "prod1", 28},
        {"2", "prod2", 100},
        {"3", "prod3", 70}
    };
    String[] titre = {"ID", "Libele", "Prix"};
    DefaultTableModel model = new DefaultTableModel(elem, titre);
    JTable table = new JTable(model);

    // Constructeur
    public ClassFen() {
        // title 
        this.setTitle("bonjour");
        this.setSize(400, 500);
        // position au centre 
        this.setLocationRelativeTo(null);
        // termine le processus 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        // Panel principal
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(4, 2));
        pan.add(idLabel);
        pan.add(idField);
        pan.add(libLabel);
        pan.add(libField);
        pan.add(prixLabel);
        pan.add(prixField);
        pan.add(etatLabel);
        pan.add(etatComboBox);
        
        JPanel pa = new JPanel();
        pa.setLayout(new GridLayout(4, 1));
        pa.add(ajout);
        pa.add(supprimer);
        pa.add(annuler);
        pa.add(quitter);

        JScrollPane pan3 = new JScrollPane(table);
        this.add(pan, BorderLayout.NORTH);
        this.add(pa, BorderLayout.EAST);
        this.add(pan3, BorderLayout.CENTER);

        ajout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String lib = libField.getText();
                String prix = prixField.getText();
                if (!id.isEmpty() && !lib.isEmpty() && !prix.isEmpty()) {
                    model.addRow(new Object[]{id, lib, prix});
                    idField.setText("");
                    libField.setText("");
                    prixField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        supprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Veuillez sélectionner une ligne à supprimer", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        annuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                idField.setText("");
                libField.setText("");
                prixField.setText("");
            }
        });

        quitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Rien à implémenter ici pour le moment
    }

    public static void main(String[] args) {
        new ClassFen();
    }
}
