package eu.anmaso.mysample.helloworld.dataaccess.impl.dao;

import javax.inject.Named;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import eu.anmaso.mysample.general.dataaccess.base.dao.ApplicationDaoImpl;
import eu.anmaso.mysample.helloworld.dataaccess.api.HelloWorldEntity;
import eu.anmaso.mysample.helloworld.dataaccess.api.dao.HelloWorldDao;
import eu.anmaso.mysample.helloworld.logic.api.to.HelloWorldSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link HelloWorldDao}.
 */
@Named
public class HelloWorldDaoImpl extends ApplicationDaoImpl<HelloWorldEntity> implements HelloWorldDao {

  /**
   * The constructor.
   */
  public HelloWorldDaoImpl() {

    super();
  }

  @Override
  public Class<HelloWorldEntity> getEntityClass() {

    return HelloWorldEntity.class;
  }

  @Override
  public PaginatedListTo<HelloWorldEntity> findHelloWorlds(HelloWorldSearchCriteriaTo criteria) {

    HelloWorldEntity helloworld = Alias.alias(HelloWorldEntity.class);
    EntityPathBase<HelloWorldEntity> alias = Alias.$(helloworld);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    String name = criteria.getName();
    if (name != null) {
      query.where(Alias.$(helloworld.getName()).eq(name));
    }
    String greeting = criteria.getGreeting();
    if (greeting != null) {
      query.where(Alias.$(helloworld.getGreeting()).eq(greeting));
    }
    return findPaginated(criteria, query, alias);
  }

}