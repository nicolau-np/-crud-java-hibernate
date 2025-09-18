/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.np.novo.projecto.hibernate.tables;

import com.np.novo.projecto.hibernate.models.Pessoa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class PessoaTableModel extends AbstractTableModel {

    private List<Pessoa> pessoas;
    private final String[] colunas = {"ID", "Nome", "Email"};

    public PessoaTableModel(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pessoa pessoa = pessoas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pessoa.getId();
            case 1:
                return pessoa.getNome();
            case 2:
                return pessoa.getEmail();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
        fireTableDataChanged(); // Notifica a JTable que os dados foram alterados
    }
}
