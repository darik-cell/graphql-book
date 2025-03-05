package org.study.graphqldemophoto.model;

import lombok.Data;

@Data
public class PostPhotoInput {
  private String name;
  private String description;
  private PhotoCategory category = PhotoCategory.PORTRAIT;
}
