/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.Area;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Senai
 */
public class DisciplinaDao {
    public List<DisciplinaDao> lerDisciplina() {
        List<DisciplinaDao> lista = new ArrayList();
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("o inner join é aqui");
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                DisciplinaDao dis = new DisciplinaDao();
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                dis.setNome_disciplina(rs.getString("nome_disciplina"));
                
                Area area = new Area();
                area.setId(rs.getInt("id_area"));
                area.setNome(rs.getString("nome_area"));
                area.setDescricao(rs.getString("descricao_area"));
                dis.setArea(area);
                
                lista.add(dis);
                
                
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return lista;
        
    }
    
}
