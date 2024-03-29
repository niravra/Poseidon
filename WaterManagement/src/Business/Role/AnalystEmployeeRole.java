/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.AnalystGroupEmployee.AnalystEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author N
 */
public class AnalystEmployeeRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AnalystEmployeeWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
}
