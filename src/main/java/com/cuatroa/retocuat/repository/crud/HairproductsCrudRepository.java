package com.cuatroa.retocuat.repository.crud;

import com.cuatroa.retocuat.model.Hairproducts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jaime
 */
public interface HairproductsCrudRepository extends MongoRepository<Hairproducts, String> {
    
}
