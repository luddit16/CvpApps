/**
 * 
 */
package com.cvpapps.constants;

/**
 * @author iNsaN3
 *
 */
public enum UserRoles {
	ADMIN(1),SUPERADMIN(0),LEAD(2),USER(3);
	private final int value;   
	UserRoles(int value) {
        this.value= value;
    }
	public Integer intValue() {
		return this.value;
	}
	
}
