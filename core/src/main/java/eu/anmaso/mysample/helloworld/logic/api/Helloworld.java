package eu.anmaso.mysample.helloworld.logic.api;

import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldEto;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Helloworld component.
 */
public interface Helloworld {

  /**
   * Returns a HelloWorld by its id 'id'.
   *
   * @param id The id 'id' of the HelloWorld.
   * @return The {@link HelloWorldEto} with id 'id'
   */
  HelloWorldEto findHelloWorld(Long id);

  /**
   * Returns a paginated list of HelloWorlds matching the search criteria.
   *
   * @param criteria the {@link HelloWorldSearchCriteriaTo}.
   * @return the {@link List} of matching {@link HelloWorldEto}s.
   */
  PaginatedListTo<HelloWorldEto> findHelloWorldEtos(HelloWorldSearchCriteriaTo criteria);

  /**
   * Deletes a helloWorld from the database by its id 'helloWorldId'.
   *
   * @param helloWorldId Id of the helloWorld to delete
   * @return boolean <code>true</code> if the helloWorld can be deleted, <code>false</code> otherwise
   */
  boolean deleteHelloWorld(Long helloWorldId);

  /**
   * Saves a helloWorld and store it in the database.
   *
   * @param helloWorld the {@link HelloWorldEto} to create.
   * @return the new {@link HelloWorldEto} that has been saved with ID and version.
   */
  HelloWorldEto saveHelloWorld(HelloWorldEto helloWorld);

}