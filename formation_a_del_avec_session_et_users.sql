/* Insertion de la formation à supprimer*/
SELECT * FROM ittraining.formation;
INSERT INTO ittraining.formation VALUES(
6,
"Formations en informatique",
"Formation à supprimer",
"Détail",
"3 jours",
"Formation",
"2500,00 € HT",
"Sous-theme",
"Theme",
"Paris"
);

/* Attribution de la formation à une session qu'il faut créer*/
SELECT * FROM ittraining.session;
INSERT INTO ittraining.session VALUES(
7,
"2 Juillet 2024",
"2 Juin 2024",
6
);

INSERT INTO ittraining.session VALUES(
8,
"1 Juillet 2024",
"1 Juin 2024",
6
);

/*Attribution des users à cette session de formation*/
SELECT * FROM ittraining.session_user;
INSERT INTO ittraining.session_user VALUES(
7,
7
);
INSERT INTO ittraining.session_user VALUES(
7,
8
);
INSERT INTO ittraining.session_user VALUES(
7,
9
);
/*Delete session 7 et voir si users sont supprimés */ 
/* Vérifié avec insomnia grâce à localhost:8080/sessions/delete/7 */
/*Delete la formation et vérifier si ça delete les sessions et utilisateurs sur insomnia */