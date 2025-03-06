### pom.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<groupId>org.study</groupId>
	<artifactId>graphql-demo-photo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>graphql-demo-photo</name>
	<description>graphql-demo-photo</description>

	<properties>
		<java.version>17</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-graphql</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>com.graphql-java</groupId>
			<artifactId>graphql-java-extended-scalars</artifactId>
			<version>22.0</version>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webflux</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.graphql</groupId>
			<artifactId>spring-graphql-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<annotationProcessorPaths>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</path>
					</annotationProcessorPaths>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>
```

### project-dump.md
```markdown
### pom.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<groupId>org.study</groupId>
	<artifactId>graphql-demo-photo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>graphql-demo-photo</name>
	<description>graphql-demo-photo</description>

	<properties>
		<java.version>17</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-graphql</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>com.graphql-java</groupId>
			<artifactId>graphql-java-extended-scalars</artifactId>
			<version>22.0</version>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webflux</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.graphql</groupId>
			<artifactId>spring-graphql-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<annotationProcessorPaths>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</path>
					</annotationProcessorPaths>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>
```

### src\main\java\org\study\graphqldemophoto\config\GraphQLConfig.java
```java
package org.study.graphqldemophoto.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLConfig {

  @Bean
  public RuntimeWiringConfigurer runtimeWiringConfigurer() {
    return builder -> builder.scalar(ExtendedScalars.DateTime);
  }
}
```

### src\main\java\org\study\graphqldemophoto\GraphqlDemoPhotoApplication.java
```java
package org.study.graphqldemophoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlDemoPhotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoPhotoApplication.class, args);
	}

}
```

### src\main\java\org\study\graphqldemophoto\model\Photo.java
```java
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
```

### src\main\java\org\study\graphqldemophoto\model\PhotoCategory.java
```java
package org.study.graphqldemophoto.model;

public enum PhotoCategory {
  SELFIE,
  PORTRAIT,
  ACTION,
  LANDSCAPE,
  GRAPHIC
}
```

### src\main\java\org\study\graphqldemophoto\model\PostPhotoInput.java
```java
package org.study.graphqldemophoto.model;

import lombok.Data;

@Data
public class PostPhotoInput {
  private String name;
  private String description;
  private PhotoCategory category = PhotoCategory.PORTRAIT;
}
```

### src\main\java\org\study\graphqldemophoto\model\User.java
```java
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
```

### src\main\java\org\study\graphqldemophoto\resolver\MutationController.java
```java
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
```

### src\main\java\org\study\graphqldemophoto\resolver\QueryController.java
```java
package org.study.graphqldemophoto.resolver;

import org.springframework.graphql.data.method.annotation.Argument;
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
```

### src\main\resources\application.properties
```properties
spring.application.name=graphql-demo-photo
```

### src\main\resources\application.yaml
```yaml
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password: 12345
    driver-class-name: org.h2.Driver

  jpa:
    hibernate:
      ddl-auto: none
    show-sql: true
    database-platform: org.hibernate.dialect.H2Dialect

  graphql:
    graphiql:
      enabled: true
```

### src\main\resources\graphql\schema.graphql
```
scalar DateTime

type User {
    githubLogin: ID!
    name: String
    avatar: String
    postedPhotos: [Photo!]!
    inPhotos: [Photo!]!
}

type Photo {
    id: ID!
    name: String!
    url: String!
    description: String
    created: DateTime!
    category: PhotoCategory!
    postedBy: User!
    taggedUsers: [User!]!
}

enum PhotoCategory {
    SELFIE
    PORTRAIT
    ACTION
    LANDSCAPE
    GRAPHIC
}

input PostPhotoInput {
    name: String!
    description: String
    category: PhotoCategory=PORTRAIT
}

type Mutation {
    postPhoto(input: PostPhotoInput!): Photo!
}

type Query {
    totalPhotos: Int!
    allPhotos(category: PhotoCategory): [Photo!]!
    totalUsers: Int!
    allUsers: [User!]!
    user(id: ID!): User!
}

schema {
    query: Query
    mutation: Mutation
}
```

```

### src\main\java\org\study\graphqldemophoto\config\GraphQLConfig.java
```java
package org.study.graphqldemophoto.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLConfig {

  @Bean
  public RuntimeWiringConfigurer runtimeWiringConfigurer() {
    return builder -> builder.scalar(ExtendedScalars.DateTime);
  }
}
```

### src\main\java\org\study\graphqldemophoto\GraphqlDemoPhotoApplication.java
```java
package org.study.graphqldemophoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlDemoPhotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoPhotoApplication.class, args);
	}

}
```

### src\main\java\org\study\graphqldemophoto\model\Photo.java
```java
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
```

### src\main\java\org\study\graphqldemophoto\model\PhotoCategory.java
```java
package org.study.graphqldemophoto.model;

public enum PhotoCategory {
  SELFIE,
  PORTRAIT,
  ACTION,
  LANDSCAPE,
  GRAPHIC
}
```

### src\main\java\org\study\graphqldemophoto\model\PostPhotoInput.java
```java
package org.study.graphqldemophoto.model;

import lombok.Data;

@Data
public class PostPhotoInput {
  private String name;
  private String description;
  private PhotoCategory category = PhotoCategory.PORTRAIT;
}
```

### src\main\java\org\study\graphqldemophoto\model\User.java
```java
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
```

### src\main\java\org\study\graphqldemophoto\resolver\MutationController.java
```java
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
```

### src\main\java\org\study\graphqldemophoto\resolver\QueryController.java
```java
package org.study.graphqldemophoto.resolver;

import org.springframework.graphql.data.method.annotation.Argument;
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
```

### src\main\resources\application.properties
```properties
spring.application.name=graphql-demo-photo
```

### src\main\resources\application.yaml
```yaml
spring:
  graphql:
    graphiql:
      enabled: true
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password: 12345
    driver-class-name: org.h2.Driver

  jpa:
    hibernate:
      ddl-auto: none
    show-sql: true
    database-platform: org.hibernate.dialect.H2Dialect

```

### src\main\resources\graphql\schema.graphqls
```
scalar DateTime

type User {
    githubLogin: ID!
    name: String
    avatar: String
    postedPhotos: [Photo!]!
    inPhotos: [Photo!]!
}

type Photo {
    id: ID!
    name: String!
    url: String!
    description: String
    created: DateTime!
    category: PhotoCategory!
    postedBy: User!
    taggedUsers: [User!]!
}

enum PhotoCategory {
    SELFIE
    PORTRAIT
    ACTION
    LANDSCAPE
    GRAPHIC
}

input PostPhotoInput {
    name: String!
    description: String
    category: PhotoCategory=PORTRAIT
}

type Mutation {
    postPhoto(input: PostPhotoInput!): Photo!
}

type Query {
    totalPhotos: Int!
    allPhotos(category: PhotoCategory): [Photo!]!
    totalUsers: Int!
    allUsers: [User!]!
    user(id: ID!): User!
}

schema {
    query: Query
    mutation: Mutation
}
```

