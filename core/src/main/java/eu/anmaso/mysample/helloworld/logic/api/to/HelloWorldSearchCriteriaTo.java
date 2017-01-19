package eu.anmaso.mysample.helloworld.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link eu.anmaso.mysample.helloworld.common.api.HelloWorld}s.
 *
 */
public class HelloWorldSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String greeting;

  /**
   * The constructor.
   */
  public HelloWorldSearchCriteriaTo() {

    super();
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getGreeting() {

    return greeting;
  }

  public void setGreeting(String greeting) {

    this.greeting = greeting;
  }

}
