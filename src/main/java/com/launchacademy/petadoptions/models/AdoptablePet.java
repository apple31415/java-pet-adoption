package com.launchacademy.petadoptions.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="adoptable_pets")
public class AdoptablePet {

  @Id
  @SequenceGenerator(name = "adoptable_pet_generator", sequenceName = "adoptable_pets_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adoptable_pet_generator")

  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "img_url", nullable = false)
  private String imgUrl;

  @Column(name = "age", nullable = false)
  private Integer age;

  @Column(name = "vaccination_status", nullable = false)
  private Boolean vaccinationStatus;

  @Column(name = "adoption_story", nullable = false)
  private String adoptionStory;

  @Column(name = "adoption_status", nullable = false)
  private String adoptionStatus;

  @ManyToOne
  @JoinColumn(name = "type_id", nullable = false)
  private PetType petType;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Boolean getVaccinationStatus() {
    return vaccinationStatus;
  }

  public void setVaccinationStatus(Boolean vaccinationStatus) {
    this.vaccinationStatus = vaccinationStatus;
  }

  public String getAdoptionStory() {
    return adoptionStory;
  }

  public void setAdoptionStory(String adoptionStory) {
    this.adoptionStory = adoptionStory;
  }

  public String getAdoptionStatus() {
    return adoptionStatus;
  }

  public void setAdoptionStatus(String adoptionStatus) {
    this.adoptionStatus = adoptionStatus;
  }

  public PetType getPetType() {
    return petType;
  }

  public void setPetType(PetType petType) {
    this.petType = petType;
  }

  public void setTypeId(int i) {
  }

}
