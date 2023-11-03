package com.example.ski.repositories;

import com.example.ski.entities.Cours;
import com.example.ski.entities.Skieur;
import com.example.ski.entities.enums.Couleur;
import com.example.ski.entities.enums.Support;
import com.example.ski.entities.enums.TypeAbonnement;
import com.example.ski.entities.enums.TypeCours;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieursRepository extends CrudRepository<Skieur, Long> {
  List <Skieur> findByAbonTypeAbon (TypeAbonnement abon_typeAbon);
  List <Skieur> findByAbonTypeAbonAndPistesCouleurAndInscriptionsCourSupportAndInscriptionsCourTypeCours(TypeAbonnement abon_typeAbon, Couleur pistes_couleur, Support inscriptions_cour_support, TypeCours inscriptions_cour_typeCours);
  @Query(value = "SELECT * " +
    "FROM skieur s " +
    "JOIN inscription i ON s.num_skieur = i.skieur_num_skieur " +
    "JOIN moniteur_cours mc ON i.cour_num_cours = mc.cours_num_cours " +
    "JOIN moniteur m ON m.num_moniteur = mc.moniteur_num_moniteur " +
    "WHERE m.nomm= :MoniteurName", nativeQuery = true )
  List<Skieur> GetSkieurByMoniteurNameSql (@Param("MoniteurName")String MoniteurName );
  @Query("select i.skieur " +
    "from Inscription i " +
    "join Moniteur m on i.cour member m.cours " +
    "where m.nomM = :MoniteurName order by ")  //ordonnés selon le nombre des pistes affectés aux skieurs
  List<Skieur> GetSkieurByMoniteurNameJpql (@Param("MoniteurName") String MoniteurName);

}
