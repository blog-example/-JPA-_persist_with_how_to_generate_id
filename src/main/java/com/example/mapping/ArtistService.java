package com.example.mapping;

import com.example.mapping.entity.Artist;
import com.example.mapping.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RequiredArgsConstructor
@Service
public class ArtistService {

  @PersistenceContext
  private final EntityManager entityManager;

  @Transactional
  public void createArtist() {
    Artist artist = new Artist("New Jeans");
    log.info("a_id1: >> " + artist.getArtistId());
    entityManager.persist(artist);
    log.info("a_id2: >> " + artist.getArtistId());
  }

}
