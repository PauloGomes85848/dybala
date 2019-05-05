/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.ListaAssociados;
import Backend.Projeto;
import Backend.Sistema;
import Backend.Tarefa;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bidas
 */
public class ListagemDeProjetos extends javax.swing.JFrame {

    /**
     * Creates new form ListagemDeProjetos
     */
    private Sistema sistema;

    DefaultTableModel model;

    public ListagemDeProjetos(Sistema sistema) {
        initComponents();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                sistema.sair();
            }
        });

        this.sistema = sistema;
        model = (DefaultTableModel) listagem.getModel();

        model.setNumRows(0);
        for (Projeto p : sistema.getListaProjetos().getListaProjetos()) {
            model.addRow(new Object[]{p.getTitulo(), p.getDescricao(), p.getData_de_inicio(), p.getData_de_fim(), p.getOwner().getNome()});
        }
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listagem = new javax.swing.JTable();
        ListarosProjetos = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Descricao ", "Data de Início", "Data de Fim", "Associados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listagem.setColumnSelectionAllowed(true);
        listagem.setShowHorizontalLines(false);
        listagem.setShowVerticalLines(false);
        jScrollPane1.setViewportView(listagem);
        listagem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        ListarosProjetos.setText("Listar projetos");
        ListarosProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarosProjetosActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VoltarMousePressed(evt);
            }
        });
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Voltar)
                    .addComponent(ListarosProjetos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ListarosProjetos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Voltar)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarosProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarosProjetosActionPerformed
        model.setNumRows(0);
    }//GEN-LAST:event_ListarosProjetosActionPerformed

    private void VoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMousePressed
        dispose();
    }//GEN-LAST:event_VoltarMousePressed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarosProjetos;
    private javax.swing.JButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listagem;
    // End of variables declaration//GEN-END:variables
}
