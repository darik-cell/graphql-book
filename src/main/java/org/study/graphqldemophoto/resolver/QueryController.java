package org.study.graphqldemophoto.resolver;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.study.graphqldemophoto.model.Photo;
import org.study.graphqldemophoto.model.PhotoCategory;
import org.study.graphqldemophoto.model.QPhoto;
import org.study.graphqldemophoto.model.User;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QueryController {

  private final EntityManager em;
  private final JPAQueryFactory queryFactory = new JPAQueryFactory(em);
  private final QPhoto qPhoto = QPhoto.photo;

  @QueryMapping
  public int totalPhotos() {
    return 42;
  }

  @QueryMapping
  public List<Photo> allPhotos(@Argument PhotoCategory category) {
    Photo photo = queryFactory.selectFrom(qPhoto)
            .where(qPhoto.category.eq(PhotoCategory.SELFIE))
            .fetchOne();

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
