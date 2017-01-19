package eu.anmaso.mysample.helloworld.dataaccess.api.dao;

import eu.anmaso.mysample.general.dataaccess.api.dao.ApplicationDao;
import eu.anmaso.mysample.helloworld.dataaccess.api.HelloWorldEntity;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for HelloWorld entities
 */
public interface HelloWorldDao extends ApplicationDao<HelloWorldEntity> {

  /**
   * Finds the {@link HelloWorldEntity helloworlds} matching the given {@link HelloWorldSearchCriteriaTo}.
   *
   * @param criteria is the {@link HelloWorldSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link HelloWorldEntity} objects.
   */
  PaginatedListTo<HelloWorldEntity> findHelloWorlds(HelloWorldSearchCriteriaTo criteria);
}
