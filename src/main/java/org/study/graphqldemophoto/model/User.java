package org.study.graphqldemophoto.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class User {
  private String githubLogin;
  private String name;
  private String avatar;
  private List<Photo> postedPhotos = new ArrayList<>();
  private List<Photo> inPhotos = new ArrayList<>();
}
