package com.expd.anniec.spring5webapp.repositories;

import com.expd.anniec.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
