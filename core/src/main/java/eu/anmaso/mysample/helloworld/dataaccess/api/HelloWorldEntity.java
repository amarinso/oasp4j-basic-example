package eu.anmaso.mysample.helloworld.dataaccess.api;

import javax.persistence.Entity;

import eu.anmaso.mysample.general.dataaccess.api.ApplicationPersistenceEntity;
import eu.anmaso.mysample.helloworld.common.api.HelloWorld;

/**
 * @author anmas
 */
@Entity
public class HelloWorldEntity extends ApplicationPersistenceEntity implements HelloWorld {

  private String name;

  private String greeting;

  private static final long serialVersionUID = 1L;

  /**
   * @return greeting
   */
  public String getGreeting() {

    return this.greeting;
  }

  /**
   * @param greeting new value of {@link #getgreeting}.
   */
  public void setGreeting(String greeting) {

    this.greeting = greeting;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

}
