package eu.anmaso.mysample.helloworld.logic.api.to;

import eu.anmaso.mysample.general.common.api.to.AbstractCto;

/**
 * Composite transport object of HelloWorld
 */
public class HelloWorldCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private HelloWorldEto helloWorld;

  public HelloWorldEto getHelloWorld() {

    return helloWorld;
  }

  public void setHelloWorld(HelloWorldEto helloWorld) {

    this.helloWorld = helloWorld;
  }

}
