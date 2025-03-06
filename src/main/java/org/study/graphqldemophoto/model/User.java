package org.study.graphqldemophoto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

  @Id
  private String githubLogin;
  private String name;
  private String avatar;

  @OneToMany(fetch = FetchType.LAZY)
  private List<Photo> postedPhotos = new ArrayList<>();

  @OneToMany(fetch = FetchType.LAZY)
  private List<Photo> inPhotos = new ArrayList<>();
}
