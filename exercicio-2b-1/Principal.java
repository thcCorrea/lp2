import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        data = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        campoNom = new javax.swing.JTextField();
        campoDat = new javax.swing.JTextField();
        campoTelefon = new javax.swing.JTextField();
        campoEnderec = new javax.swing.JTextField();
        botaoAdd = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        data.setText("Data Nascimento:");

        telefone.setText("Telefone:");

        endereco.setText("Endereço:");

        nome.setText("Nome:");

        campoNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomActionPerformed(evt);
            }
        });

        botaoAdd.setText("Adicionar");
        botaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        tabelaUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
            },
            new String [] {
                "Nome", "Data Nascimento", "Telefone", "Title 4"
            }
        ));
        tabelaUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(data)
                            .addComponent(telefone)
                            .addComponent(endereco))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDat)
                            .addComponent(campoTelefon)
                            .addComponent(campoEnderec)
                            .addComponent(campoNom)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(campoNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data)
                    .addComponent(campoDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(campoTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEnderec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdd)
                    .addComponent(botaoRemover)
                    .addComponent(botaoSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void campoNomActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                             
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsua.getModel();
       
        int rowSelected = tabelaUsua.getSelectedRow();
        if(rowSelected == -1){
            JOptionPane.showMessageDialog(this, "Selecione a linha antes de remove-la");
        }
        
        else{
            
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que dezeja remover a linha selecionada ?", "Confirme sua operaçao, ", JOptionPane.YES_NO_OPTION);
            
            if(opcao== JOptionPane.YES_OPTION){
                dtm.removeRow(rowSelected);
            }
        }
    }                                            

    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String nom, dat, telefon, enderec;   
         
         nom = campoNom.getText();
         dat = campoDat.getText();
         telefon = campoTelefon.getText();
         enderec = campoEnderec.getText();
         
         if (nom.equals("") || dat.equals("") || telefon.equals("") || enderec.equals("")){
         
         JOptionPane.showMessageDialog(this, "Os campos sao Obrigatórios");
         
         }
         
         else{
         DefaultTableModel dtm = (DefaultTableModel) tabelaUsu.getModel();
         String a [] = new String[] {nom, dat, telefon, enderec};
         dtm.addRow( a );
         }
         

    }                                        

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                            
         
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsu.getModel();
        int rowSelected = tabelaUsu.getSelectedRow();
        String nom, dat, telefon, enderec;

        nom = campoNom.getText();
        dat = campoDat.getText();
        telefon = campoTelefon.getText();
        enderec = campoEnderec.getText();

        if (nom.equals("") || dat.equals("") || telefon.equals("") || enderec.equals("")) {
            JOptionPane.showMessageDialog(this, "Os campos sao Obrigatórios");
        } else if (rowSelected == -1) {
            dtm.addRow(new String[]{nom, dat, telefon, enderec});
        } else {
            dtm.setValueAt(nom, rowSelected, 0);
            dtm.setValueAt(dat, rowSelected, 1);
            dtm.setValueAt(telefon, rowSelected, 2);
            dtm.setValueAt(enderec, rowSelected, 3);
        }
    }                                           

    private void tabelaUsuMouseClicked(java.awt.event.MouseEvent evt) {                                       
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsu.getModel();
        int rowSelected = tabelaUsu.getSelectedRow();

        campoNom.setText(dtm.getValueAt(rowSelected, 0).toString());
        campoDat.setText(dtm.getValueAt(rowSelected, 1).toString());
        campoTelefon.setText(dtm.getValueAt(rowSelected, 2).toString());
        campoEnderec.setText(dtm.getValueAt(rowSelected, 3).toString());
    }                                      

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoDat;
    private javax.swing.JTextField campoEnderec;
    private javax.swing.JTextField campoNom;
    private javax.swing.JTextField campoTelefon;
    private javax.swing.JLabel data;
    private javax.swing.JLabel endereco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JTable tabelaUsu;
    private javax.swing.JLabel telefone;
    // End of variables declaration                   
}
