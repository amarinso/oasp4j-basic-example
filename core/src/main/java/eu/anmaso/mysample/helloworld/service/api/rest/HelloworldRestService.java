package eu.anmaso.mysample.helloworld.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import eu.anmaso.mysample.helloworld.logic.api.Helloworld;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldEto;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Helloworld}.
 */
@Path("/helloworld/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface HelloworldRestService {

  /**
   * Delegates to {@link Helloworld#findHelloWorld}.
   *
   * @param id the ID of the {@link HelloWorldEto}
   * @return the {@link HelloWorldEto}
   */
  @GET
  @Path("/helloworld/{id}/")
  public HelloWorldEto getHelloWorld(@PathParam("id") long id);

  /**
   * Delegates to {@link Helloworld#saveHelloWorld}.
   *
   * @param helloworld the {@link HelloWorldEto} to be saved
   * @return the recently created {@link HelloWorldEto}
   */
  @POST
  @Path("/helloworld/")
  public HelloWorldEto saveHelloWorld(HelloWorldEto helloworld);

  /**
   * Delegates to {@link Helloworld#deleteHelloWorld}.
   *
   * @param id ID of the {@link HelloWorldEto} to be deleted
   */
  @DELETE
  @Path("/helloworld/{id}/")
  public void deleteHelloWorld(@PathParam("id") long id);

  /**
   * Delegates to {@link Helloworld#findHelloWorldEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding helloworlds.
   * @return the {@link PaginatedListTo list} of matching {@link HelloWorldEto}s.
   */
  @Path("/helloworld/search")
  @POST
  public PaginatedListTo<HelloWorldEto> findHelloWorldsByPost(HelloWorldSearchCriteriaTo searchCriteriaTo);

}