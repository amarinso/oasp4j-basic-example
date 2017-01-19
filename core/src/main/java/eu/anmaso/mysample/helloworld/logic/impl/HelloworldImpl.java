package eu.anmaso.mysample.helloworld.logic.impl;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.anmaso.mysample.general.logic.base.AbstractComponentFacade;
import eu.anmaso.mysample.helloworld.dataaccess.api.HelloWorldEntity;
import eu.anmaso.mysample.helloworld.dataaccess.api.dao.HelloWorldDao;
import eu.anmaso.mysample.helloworld.logic.api.Helloworld;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldEto;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Implementation of component interface of helloworld
 */
@Named
public class HelloworldImpl extends AbstractComponentFacade implements Helloworld {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(HelloworldImpl.class);

  /** @see #getHelloWorldDao() */
  @Inject
  private HelloWorldDao helloWorldDao;

  /**
   * The constructor.
   */
  public HelloworldImpl() {
    super();
  }

  @Override
  public HelloWorldEto findHelloWorld(Long id) {

    HelloWorldEto helloWorldEto = new HelloWorldEto();
    helloWorldEto.setName("demo");
    helloWorldEto.setGreeting("hello");
    return helloWorldEto;

  }

  @Override
  public PaginatedListTo<HelloWorldEto> findHelloWorldEtos(HelloWorldSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<HelloWorldEntity> helloworlds = getHelloWorldDao().findHelloWorlds(criteria);
    return mapPaginatedEntityList(helloworlds, HelloWorldEto.class);
  }

  @Override
  public boolean deleteHelloWorld(Long helloWorldId) {

    HelloWorldEntity helloWorld = getHelloWorldDao().find(helloWorldId);
    getHelloWorldDao().delete(helloWorld);
    LOG.debug("The helloWorld with id '{}' has been deleted.", helloWorldId);
    return true;
  }

  @Override
  public HelloWorldEto saveHelloWorld(HelloWorldEto helloWorld) {

    Objects.requireNonNull(helloWorld, "helloWorld");
    HelloWorldEntity helloWorldEntity = getBeanMapper().map(helloWorld, HelloWorldEntity.class);

    // initialize, validate helloWorldEntity here if necessary
    getHelloWorldDao().save(helloWorldEntity);
    LOG.debug("HelloWorld with id '{}' has been created.", helloWorldEntity.getId());

    return getBeanMapper().map(helloWorldEntity, HelloWorldEto.class);
  }

  /**
   * Returns the field 'helloWorldDao'.
   *
   * @return the {@link HelloWorldDao} instance.
   */
  public HelloWorldDao getHelloWorldDao() {

    return this.helloWorldDao;
  }

}