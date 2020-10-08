package com.launchacademy.petadoptions.seeders;

import com.launchacademy.petadoptions.models.AdoptablePet;
import com.launchacademy.petadoptions.models.PetType;
import com.launchacademy.petadoptions.repositories.AdoptablePetsRepository;
import com.launchacademy.petadoptions.repositories.PetTypeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AdoptablePetSeeder {
  private AdoptablePetsRepository adoptablePetsRepository;
  private PetTypeRepository petTypeRepository;


  @Autowired
  public AdoptablePetSeeder(AdoptablePetsRepository adoptablePetsRepository, PetTypeRepository petTypeRepository) {
    this.adoptablePetsRepository = adoptablePetsRepository;
    this.petTypeRepository = petTypeRepository;
  }


  public void seed(){
    AdoptablePet newAdoptablePet = new AdoptablePet();
    newAdoptablePet.setName("Rick");
    newAdoptablePet.setImgUrl("https://www.indiewire.com/wp-content/uploads/2020/05/Rick-Morty-Rick-Five-Arms.png?resize=800,515");
    newAdoptablePet.setAge(68);
    newAdoptablePet.setVaccinationStatus(true);
    newAdoptablePet.setAdoptionStory("I was not adopted and then I became adopted");
    newAdoptablePet.setAdoptionStatus("true");
    Optional<PetType> petType = petTypeRepository.findById(2);
    if (petType.isPresent()) newAdoptablePet.setPetType(petType.get());


    AdoptablePet newAdoptablePet2 = new AdoptablePet();
    newAdoptablePet2.setName("Lady Amalthea");
    newAdoptablePet2.setImgUrl("https://assets.wired.com/photos/w_582/wp-content/uploads/2020/05/Cul-lastunicorn-W786CE.jpg");
    newAdoptablePet2.setAge(1000);
    newAdoptablePet2.setVaccinationStatus(true);
    newAdoptablePet2.setAdoptionStory("Where are all the other unicorns?");
    newAdoptablePet2.setAdoptionStatus("true");
    Optional<PetType> petType2 = petTypeRepository.findById(4);
    if (petType2.isPresent()) newAdoptablePet2.setPetType(petType2.get());

    AdoptablePet newAdoptablePet3 = new AdoptablePet();
    newAdoptablePet3.setName("Snowball");
    newAdoptablePet3.setImgUrl("https://heavy.com/wp-content/uploads/2020/04/snuffles-e1585726869132.jpg?quality=65&strip=all&w=780");
    newAdoptablePet3.setAge(13);
    newAdoptablePet3.setVaccinationStatus(false);
    newAdoptablePet3.setAdoptionStory("I have not been adopted yet cuz I am old");
    newAdoptablePet3.setAdoptionStatus("false");
    Optional<PetType> petType3 = petTypeRepository.findById(1);
    if (petType3.isPresent()) newAdoptablePet3.setPetType(petType3.get());

    AdoptablePet newAdoptablePet4 = new AdoptablePet();
    newAdoptablePet4.setName("Morty");
    newAdoptablePet4.setImgUrl("https://vignette.wikia.nocookie.net/rickandmorty/images/4/41/Morty_Smith.jpg/revision/latest?cb=20200519152019");
    newAdoptablePet4.setAge(2);
    newAdoptablePet4.setVaccinationStatus(true);
    newAdoptablePet4.setAdoptionStory("I ate my brother");
    newAdoptablePet4.setAdoptionStatus("false");
    Optional<PetType> petType4 = petTypeRepository.findById(3);
    if (petType4.isPresent()) newAdoptablePet4.setPetType(petType4.get());


    AdoptablePet newAdoptablePet5 = new AdoptablePet();
    newAdoptablePet5.setName("Princess Caroline");
    newAdoptablePet5.setImgUrl("https://i.pinimg.com/originals/6e/14/dd/6e14ddc0cf089d0cdcb2ecb8061794b0.jpg");
    newAdoptablePet5.setAge(12);
    newAdoptablePet5.setVaccinationStatus(true);
    newAdoptablePet5.setAdoptionStory("I'm fabulous, so why wouldn't I be adopted?");
    newAdoptablePet5.setAdoptionStatus("true");
    Optional<PetType> petType5 = petTypeRepository.findById(2);
    if (petType5.isPresent()) newAdoptablePet5.setPetType(petType5.get());


    AdoptablePet newAdoptablePet6 = new AdoptablePet();
    newAdoptablePet6.setName("BoJack");
    newAdoptablePet6.setImgUrl("https://img1.looper.com/img/gallery/will-bojack-horseman-season-7-ever-happen/intro-1584547451.jpg");
    newAdoptablePet6.setAge(52);
    newAdoptablePet6.setVaccinationStatus(true);
    newAdoptablePet6.setAdoptionStory("I'm a horse of course");
    newAdoptablePet6.setAdoptionStatus("true");
    Optional<PetType> petType6 = petTypeRepository.findById(3);
    if (petType6.isPresent()) newAdoptablePet6.setPetType(petType6.get());


    AdoptablePet newAdoptablePet7 = new AdoptablePet();
    newAdoptablePet7.setName("Mr. Peanutbutter");
    newAdoptablePet7.setImgUrl("https://preview.redd.it/fwd787aihpw11.png?width=1280&format=png&auto=webp&s=19e94a8826827eb9b7be9da6922a00317d0688a0");
    newAdoptablePet7.setAge(10);
    newAdoptablePet7.setVaccinationStatus(true);
    newAdoptablePet7.setAdoptionStory("Everyone loves a good dog!");
    newAdoptablePet7.setAdoptionStatus("true");
    Optional<PetType> petType7 = petTypeRepository.findById(1);
    if (petType7.isPresent()) newAdoptablePet7.setPetType(petType7.get());


    List<AdoptablePet> findAdoptablePet = (List<AdoptablePet>)adoptablePetsRepository.findAll();
      if (findAdoptablePet.size() == 0) {
      adoptablePetsRepository.save(newAdoptablePet);
      adoptablePetsRepository.save(newAdoptablePet2);
      adoptablePetsRepository.save(newAdoptablePet3);
      adoptablePetsRepository.save(newAdoptablePet4);
      adoptablePetsRepository.save(newAdoptablePet5);
      adoptablePetsRepository.save(newAdoptablePet6);
      adoptablePetsRepository.save(newAdoptablePet7);
    }
  }
}