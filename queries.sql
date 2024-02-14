SELECT u.nom, u.prenom FROM user u 
INNER JOIN session_user su on u.id=su.id_user
INNER JOIN session s on su.id_session=s.id
WHERE s.date_end_session LIKE "%20 Mai 2024%";

SELECT session.* FROM session
INNER JOIN formation on session.formation_id=formation.id
WHERE formation.id = 1;

UPDATE attributs
SET nom = 'Spark', type= 'Sous-thème'
WHERE id = 7;

SELECT a.id FROM attributs a
INNER JOIN formation_attributs fa on a.id=fa.id_attributs
INNER JOIN formation f on fa.id_formation=f.id
WHERE f.id = 1;