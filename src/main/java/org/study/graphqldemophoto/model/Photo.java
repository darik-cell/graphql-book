package org.study.graphqldemophoto.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Photo {
  private String id;
  private String name;
  private String url;
  private String description;
  private LocalDateTime created;
  private PhotoCategory category;
  private User postedBy;
  private List<User> taggedUsers = new ArrayList<>();
}
