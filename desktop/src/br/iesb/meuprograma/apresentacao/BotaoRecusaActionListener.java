/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author kscka
 */
public class BotaoRecusaActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        
        JOptionPane.showMessageDialog(null, "A justificativa da recusa foi salva.");
        }
}
