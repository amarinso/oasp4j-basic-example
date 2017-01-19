package eu.anmaso.mysample.helloworld.common.api;

import eu.anmaso.mysample.general.common.api.ApplicationEntity;

public interface HelloWorld extends ApplicationEntity {

  public String getName();

  public void setName(String name);

  public String getGreeting();

  public void setGreeting(String greeting);

}
