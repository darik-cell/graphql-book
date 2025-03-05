package org.study.graphqldemophoto.resolver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.study.graphqldemophoto.model.Photo;
import org.study.graphqldemophoto.model.PostPhotoInput;

import java.time.LocalDateTime;
import java.util.UUID;

@Controller
public class MutationController {

  @MutationMapping
  public Photo postPhoto(@Argument PostPhotoInput input) {
    Photo photo = Photo.builder()
            .id(UUID.randomUUID().toString())
            .name(input.getName())
            .description(input.getDescription())
            .category(input.getCategory())
            .created(LocalDateTime.now())
            .build();

    photo.setUrl("http://example.com/photos/" + photo.getId());
    return photo;
  }
}
