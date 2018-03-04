/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammerplayersheet;

import com.sun.glass.events.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rivs
 */
public class PlayerSheet extends javax.swing.JFrame {

    /**
     * Creates new form PlayerSheet
     */
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Profession> professions = new ArrayList<Profession>();
    Race races = new Race();
    ArrayList<Skill> skills = new ArrayList<Skill>();
    ArrayList<Talent> talents = new ArrayList<Talent>();
    ArrayList<Equipment> equipment = new ArrayList<Equipment>();    
    public PlayerSheet() throws IOException{
        initComponents();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        new_player = new javax.swing.JButton();
        save = new javax.swing.JButton();
        load = new javax.swing.JButton();
        addAsset = new javax.swing.JButton();
        addAsset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fantasy RolePlay Warhammer");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        new_player.setText("Nowy gracz");
        new_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_playerActionPerformed(evt);
            }
        });

        save.setText("Zapisz");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        load.setText("Wczytaj");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        addAsset.setText("Dodaj...");
        addAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssetActionPerformed(evt);
            }
        });

        addAsset1.setText("Przeglądaj...");
        addAsset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAsset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(new_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAsset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAsset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(new_player)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(load)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAsset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAsset1)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void new_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_playerActionPerformed
        new PlayerCreation(this).setVisible(true);
    }//GEN-LAST:event_new_playerActionPerformed
    boolean clearBase()
    {
        Object[] options = {"Spoko", "Lepiej nie"};
        int optionPane = JOptionPane.showOptionDialog(this, "Usunąć dane programu?", "Usuwanie danych zapisanych w programie", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);               
        if(optionPane != 0)
        {
            System.out.println("Nie usunięto bazy");
            return false;
        }    
        players = new ArrayList<Player>();
        professions = new ArrayList<Profession>();
        races = new Race();
        skills = new ArrayList<Skill>();
        talents = new ArrayList<Talent>();
        equipment = new ArrayList<Equipment>();
        System.out.println();
        return true;
    }
    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("."));
        fc.setDialogTitle("Zapisz");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setApproveButtonText("Zapisz");
        fc.setApproveButtonToolTipText("Zapisz w pliku");
        fc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("WarhammerPlayerSheet database", "wpsdb");
        fc.addChoosableFileFilter(filter);
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            try {
                save(fc.getSelectedFile().getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(PlayerSheet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed
    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        Object[] options = {"Nowa baza", "Istniejąca"};
        if(JOptionPane.showOptionDialog(this, "Co chcesz zrobić?", "Wyczyścić bazę", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null)==0)
        {
            clearBase();
            printDatabase();
        }
        else
        {
            JFileChooser fc = new JFileChooser();
            fc.setCurrentDirectory(new java.io.File("."));
            fc.setDialogTitle("Otwórz");
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setApproveButtonText("Otwórz");
            fc.setApproveButtonToolTipText("Otwórz z pliku");
            fc.setAcceptAllFileFilterUsed(false);  
            FileNameExtensionFilter filter = new FileNameExtensionFilter("WarhammerPlayerSheet database", "wpsdb");
            fc.addChoosableFileFilter(filter);
            if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                try {
                    load(fc.getSelectedFile().getAbsolutePath());
                } catch (IOException ex) {
                    Logger.getLogger(PlayerSheet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_loadActionPerformed

    private void addAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAssetActionPerformed
        new AddAsset(professions, skills, talents, equipment).setVisible(true);
    }//GEN-LAST:event_addAssetActionPerformed

    private void addAsset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAsset1ActionPerformed
        new BrowseAssets(professions, skills, talents, players).setVisible(true);
    }//GEN-LAST:event_addAsset1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object[] options = {"Zamykamy", "OH NEEIN!"};
        if(JOptionPane.showOptionDialog(this, "Zamknąć?", "Zamykanie", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null)==0)
        {            
            System.out.println("Zapisywanie danych");     
            try {
                save();
            } catch (IOException ex) {
                Logger.getLogger(PlayerSheet.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Zabijanie");     
            System.exit(0);
        }
        else
        {
            System.out.println("Okazano litość");     
        }
                
           
    }//GEN-LAST:event_formWindowClosing
    boolean save() throws IOException
    {
        //System.out.println(System.getenv("localappdata") + "\\WarhammerPlayerSheet\\defaultDatabase");
        return save(System.getenv("localappdata") + "\\WarhammerPlayerSheet\\defaultDatabase");
    }    
    boolean save(String filePath) throws FileNotFoundException, IOException
    {
        Object[] temptab = new Object[6];        
        temptab[0] = players;
        temptab[1] = professions;
        temptab[2] = races;
        temptab[3] = skills;
        temptab[4] = talents;
        temptab[5] = equipment;        
        try{            
            File filex = new File(filePath);  
            filex.getParentFile().mkdirs();
            filePath=filex.getAbsolutePath();
            if(filex.exists())
            {    
                Object[] options = {"Poproszę", "Um, nope"};
                int optionPane = JOptionPane.showOptionDialog(this, "Nadpisać istniejący plik?", "Istniejący plik", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);               
                if(optionPane != 0)
                {
                    System.out.println("Nie nadpisano pliku");
                    return false;
                }                  
            }
            String extension = ".wpsdb";                     
            if(!filePath.endsWith(extension))
            {
                filePath+=extension;
            }                
            FileOutputStream file = new FileOutputStream(filePath);            
            ObjectOutputStream temp = new ObjectOutputStream(file);            
            temp.writeObject(temptab);
            temp.close();
            
            System.out.println("Zapisano w "+filePath);
        }catch(Exception e)
        {
            Logger.getLogger(PlayerSheet.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        return true;
    }boolean load() throws IOException
    {
        //System.out.println(System.getenv("localappdata") + "\\WarhammerPlayerSheet\\defaultDatabase");
        return load(System.getenv("localappdata") + "\\WarhammerPlayerSheet\\defaultDatabase");
    }
    boolean load(String filePath) throws FileNotFoundException, IOException
    {      
        if(!filePath.endsWith(".wpsdb"))
        {
            filePath+=".wpsdb";
        }
        Object[] temptab = new Object[6];
        try{             
            FileInputStream file = new FileInputStream(filePath);
            ObjectInputStream temp = new ObjectInputStream(file);
            temptab = (Object[]) temp.readObject();            
            temp.close();            
            players = (ArrayList<Player>)temptab[0]; 
            professions= (ArrayList<Profession>)temptab[1];
            races= (Race)temptab[2];
            skills= (ArrayList<Skill>)temptab[3];
            talents= (ArrayList<Talent>)temptab[4];
            equipment= (ArrayList<Equipment>)temptab[5];
            
        }catch(FileNotFoundException e)
        {   
            System.out.println("Wczytywanie z "+filePath+" nie powiodło się. Nie znaleziono pliku.");     	
            //return false;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            //return false;
        }
        System.out.println("Wczytywanie z "+filePath);
        printDatabase();
        return true;
    }
    void printDatabase()
    {
        System.out.println("Graczy: "+players.size());
        System.out.println("Profesji: "+professions.size());
        System.out.println("Umiejętności: "+skills.size());
        System.out.println("Zdolności: "+talents.size());
        System.out.println("Ekwipunek: "+equipment.size());
    }
    public static boolean yesno()
    {
        Object[] options = {"Hai", "Īe"};
        return JOptionPane.showOptionDialog(null, "Usunąć?", "Usuwanie elementu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null)==0;
    }
    public static void checkField(JTextField field, java.awt.event.KeyEvent evt)
    {
        String temp = field.getText();        
        if(!isNumber(evt.getKeyChar()) && !evt.isActionKey() && evt.getKeyCode()!=KeyEvent.VK_BACKSPACE)
        {            
            field.setText(temp.substring(0, temp.length()-1));            
        } 
        if(temp.length()>2)
        {
            field.setText(temp.substring(0, 2));
        }
    }
    public static boolean isNumber(char input)
    {
        return input >= '0' && input < '9';
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {  
                    new PlayerSheet().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PlayerSheet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAsset;
    private javax.swing.JButton addAsset1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JButton load;
    private javax.swing.JButton new_player;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
