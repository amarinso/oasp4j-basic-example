package eu.anmaso.mysample.helloworld.logic.api.to;

import eu.anmaso.mysample.general.common.api.to.AbstractEto;
import eu.anmaso.mysample.helloworld.common.api.HelloWorld;

/**
 * Entity transport object of HelloWorld
 */
public class HelloWorldEto extends AbstractEto implements HelloWorld {

  private static final long serialVersionUID = 1L;

  private String name;

  private String greeting;

  @Override
  public String getName() {

    return name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getGreeting() {

    return greeting;
  }

  @Override
  public void setGreeting(String greeting) {

    this.greeting = greeting;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.greeting == null) ? 0 : this.greeting.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    HelloWorldEto other = (HelloWorldEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (this.greeting == null) {
      if (other.greeting != null) {
        return false;
      }
    } else if (!this.greeting.equals(other.greeting)) {
      return false;
    }
    return true;
  }
}
