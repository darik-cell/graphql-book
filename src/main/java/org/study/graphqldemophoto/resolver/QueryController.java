package org.study.graphqldemophoto.resolver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.study.graphqldemophoto.model.Photo;
import org.study.graphqldemophoto.model.PhotoCategory;
import org.study.graphqldemophoto.model.User;

import java.util.List;

@Controller
public class QueryController {

  @QueryMapping
  public int totalPhotos() {
    return 42;
  }

  @QueryMapping
  public List<Photo> allPhotos(@Argument PhotoCategory category) {
    return List.of();
  }

  @QueryMapping
  public int totalUsers() {
    return 10;
  }

  @QueryMapping
  public User user(@Argument String id) {
    return User.builder()
            .githubLogin(id)
            .name("Dummy User")
            .build();
  }
}
