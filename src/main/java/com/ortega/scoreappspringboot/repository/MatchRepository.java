package com.ortega.scoreappspringboot.repository;

import com.ortega.scoreappspringboot.model.Match;
import com.ortega.scoreappspringboot.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, String> {

    List<Match> findByTeamAOrTeamB(Team teamA, Team teamB);

}
