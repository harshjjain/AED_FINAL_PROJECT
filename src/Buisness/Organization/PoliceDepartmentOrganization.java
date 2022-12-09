/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InvestigatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 18572
 */
public class PoliceDepartmentOrganization extends Organization{

    public PoliceDepartmentOrganization() {
        super(Organization.Type.PoliceDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InvestigatorRole());
        return roles;
    }
     
}