package eu.anmaso.mysample.helloworld.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import eu.anmaso.mysample.helloworld.logic.api.Helloworld;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldEto;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldSearchCriteriaTo;
import eu.anmaso.mysample.helloworld.service.api.rest.HelloworldRestService;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Helloworld}.
 */
@Named("HelloworldRestService")
public class HelloworldRestServiceImpl implements HelloworldRestService {

  @Inject
  private Helloworld helloworld;

  @Override
  public HelloWorldEto getHelloWorld(long id) {

    return this.helloworld.findHelloWorld(id);
  }

  @Override
  public HelloWorldEto saveHelloWorld(HelloWorldEto helloworld) {

    return this.helloworld.saveHelloWorld(helloworld);
  }

  @Override
  public void deleteHelloWorld(long id) {

    this.helloworld.deleteHelloWorld(id);
  }

  @Override
  public PaginatedListTo<HelloWorldEto> findHelloWorldsByPost(HelloWorldSearchCriteriaTo searchCriteriaTo) {

    return this.helloworld.findHelloWorldEtos(searchCriteriaTo);
  }

}