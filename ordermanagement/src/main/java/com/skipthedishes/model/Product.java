package com.skipthedishes.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@NoArgsConstructor
@Data
public class Product {
  private String id;
  private String storeId;
  private String name;
  private String description;
  private Double price;
  private DateTime createdAt;
  private DateTime modifiedAt;
}

