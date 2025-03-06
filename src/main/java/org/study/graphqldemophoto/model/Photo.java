package org.study.graphqldemophoto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "photo")
public class Photo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String name;
  private String url;
  private String description;
  private LocalDateTime created;

  @Enumerated(EnumType.STRING)
  private PhotoCategory category;

  @ManyToOne(fetch = FetchType.LAZY)
  private User postedBy;

  @OneToMany(fetch = FetchType.LAZY)
  private List<User> taggedUsers = new ArrayList<>();
}
