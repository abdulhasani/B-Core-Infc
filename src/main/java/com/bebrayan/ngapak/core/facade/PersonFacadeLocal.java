package com.bebrayan.ngapak.core.facade;

import com.bebrayan.ngapak.core.entity.Person;
import javax.ejb.Local;

/**
 *
 * @author hasani
 */
@Local
public interface PersonFacadeLocal extends DatabaseFacadeLocal<Person>{    
}
