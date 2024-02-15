/* Dans le tableau des attributs */
SELECT * FROM `ittraining-essai`.attributs;
INSERT INTO `ittraining-essai`.attributs VALUES(
1,
"Languages Informatique",
"Thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
2,
"Certifications ENI",
"Thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
3,
"Formations en Informatique",
"Catégorie"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
4,
"Big Data",
"Thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
5,
"Certifications PHP",
"Sous-thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
6,
"Java",
"Sous-thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
7,
"Spark",
"Sous-thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
8,
"Bash/Linux",
"Sous-thème"
);
INSERT INTO `ittraining-essai`.attributs VALUES(
9,
"SQL",
"Sous-thème"
);
/* Données formations et attributs_formation */
INSERT INTO `ittraining-essai`.formation VALUES(
 1,
"Se former aux principales librairies du langage",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Tellus at urna condimentum mattis pellentesque id. Adipiscing elit pellentesque habitant morbi tristique senectus et netus. Amet nisl suscipit adipiscing bibendum est ultricies integer. Vitae purus faucibus ornare suspendisse sed nisi lacus. Mauris nunc congue nisi vitae. Erat imperdiet sed euismod nisi porta lorem mollis aliquam. Id nibh tortor id aliquet lectus proin. Congue eu consequat ac felis donec. Urna neque viverra justo nec ultrices dui sapien eget. Risus commodo viverra maecenas accumsan lacus vel facilisis volutpat est. Leo duis ut diam quam nulla porttitor massa id neque. Velit sed ullamcorper morbi tincidunt ornare. Commodo sed egestas egestas fringilla phasellus faucibus scelerisque. Et tortor consequat id porta. Blandit massa enim nec dui nunc mattis enim ut. A erat nam at lectus urna. Purus sit amet volutpat consequat mauris nunc congue nisi. Ornare quam viverra orci sagittis eu. Erat pellentesque adipiscing commodo elit.",
"4 jours (28 heures)",
"Formation - Développement Java avancé et accès aux données",
"2 410,00 €  HT",
"Lille"
);
/*Categorie*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
1,
3
);
/*thème*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
1,
1
);
/*Sous-thème */
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
1,
6
);

INSERT INTO `ittraining-essai`.formation VALUES(
 2,
"Se former aux principales librairies du langage",
"Id consectetur purus ut faucibus pulvinar elementum integer enim. Et sollicitudin ac orci phasellus. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Sed risus ultricies tristique nulla aliquet enim tortor. Interdum consectetur libero id faucibus nisl tincidunt eget. Ut eu sem integer vitae justo eget magna fermentum iaculis. Sem et tortor consequat id porta nibh venenatis. Placerat orci nulla pellentesque dignissim enim sit amet. Dictum at tempor commodo ullamcorper a lacus vestibulum. Pretium quam vulputate dignissim suspendisse in est. Nisi est sit amet facilisis magna etiam tempor. Donec ultrices tincidunt arcu non sodales. Integer eget aliquet nibh praesent tristique. Quis auctor elit sed vulputate mi sit amet.
",
"8h45min",
"Certification Développement de sites web dynamiques (option langage PHP)",
"180,00 €  HT",
"Paris"
);/*Categorie*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
2,
3
);
/*thème*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
2,
2
);
/*Sous-thème */
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
2,
5
);
INSERT INTO `ittraining-essai`.formation VALUES(
 3,
"Se former aux outils de la Big Data - Spark",
"Id consectetur purus ut faucibus pulvinar elementum integer enim. Et sollicitudin ac orci phasellus. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Sed risus ultricies tristique nulla aliquet enim tortor. Interdum consectetur libero id faucibus nisl tincidunt eget. Ut eu sem integer vitae justo eget magna fermentum iaculis. Sem et tortor consequat id porta nibh venenatis. Placerat orci nulla pellentesque dignissim enim sit amet. Dictum at tempor commodo ullamcorper a lacus vestibulum. Pretium quam vulputate dignissim suspendisse in est. Nisi est sit amet facilisis magna etiam tempor. Donec ultrices tincidunt arcu non sodales. Integer eget aliquet nibh praesent tristique. Quis auctor elit sed vulputate mi sit amet.
",
"3 jours (21 heures)",
"Formation - Big Data et Spark",
"2420,00 €  HT",
"Rouen"
);
/*Categorie*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
3,
3
);
/*thème*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
3,
4
);
/*Sous-thème */
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
3,
7
);
INSERT INTO `ittraining-essai`.formation VALUES(
	4,
    "Se former au Linux",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Tellus at urna condimentum mattis pellentesque id. Adipiscing elit pellentesque habitant morbi tristique senectus et netus. Amet nisl suscipit adipiscing bibendum est ultricies integer. Vitae purus faucibus ornare suspendisse sed nisi lacus. Mauris nunc congue nisi vitae. Erat imperdiet sed euismod nisi porta lorem mollis aliquam. Id nibh tortor id aliquet lectus proin. Congue eu consequat ac felis donec. Urna neque viverra justo nec ultrices dui sapien eget. Risus commodo viverra maecenas accumsan lacus vel facilisis volutpat est. Leo duis ut diam quam nulla porttitor massa id neque. Velit sed ullamcorper morbi tincidunt ornare. Commodo sed egestas egestas fringilla phasellus faucibus scelerisque. Et tortor consequat id porta. Blandit massa enim nec dui nunc mattis enim ut. A erat nam at lectus urna. Purus sit amet volutpat consequat mauris nunc congue nisi. Ornare quam viverra orci sagittis eu. Erat pellentesque adipiscing commodo elit.",
    "17 jours (119 heures)",
    "Formation - Cursus Administrateur Linux",
	"8020,00 €  HT",
	"Lille" 
);
/*Categorie*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
4,
3
);
/*thème*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
4,
1
);
/*Sous-thème */
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
4,
8
);
INSERT INTO `ittraining-essai`.formation VALUES(
	 5,
    "Se former en Bases de Données SQL",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Tellus at urna condimentum mattis pellentesque id. Adipiscing elit pellentesque habitant morbi tristique senectus et netus. Amet nisl suscipit adipiscing bibendum est ultricies integer. Vitae purus faucibus ornare suspendisse sed nisi lacus. Mauris nunc congue nisi vitae. Erat imperdiet sed euismod nisi porta lorem mollis aliquam. Id nibh tortor id aliquet lectus proin. Congue eu consequat ac felis donec. Urna neque viverra justo nec ultrices dui sapien eget. Risus commodo viverra maecenas accumsan lacus vel facilisis volutpat est. Leo duis ut diam quam nulla porttitor massa id neque. Velit sed ullamcorper morbi tincidunt ornare. Commodo sed egestas egestas fringilla phasellus faucibus scelerisque. Et tortor consequat id porta. Blandit massa enim nec dui nunc mattis enim ut. A erat nam at lectus urna. Purus sit amet volutpat consequat mauris nunc congue nisi. Ornare quam viverra orci sagittis eu. Erat pellentesque adipiscing commodo elit.",
    "3 jours (21 heures)",
    "Formation - SQL - Les fondamentaux",
	"1840,00 €  HT",
	"Paris"
);
/*Categorie*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
5,
3
);
/*thème*/
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
5,
1
);
/*Sous-thème */
INSERT INTO `ittraining-essai`.formation_attributs VALUES(
5,
9
);

/* Données User */
/*Admins*/
INSERT INTO `ittraining-essai`.user VALUES(
1,
"exemple@email.com",
"MonEntreprise",
"Dupont",
"Claire",
"Admin",
"+123456789"
);
INSERT INTO `ittraining-essai`.user VALUES(
2,
"exemple@email.com",
"MonEntreprise",
"Dupuis",
"Pierre",
"Admin",
"+123456789"
);
INSERT INTO `ittraining-essai`.user VALUES(
3,
"exemple@email.com",
"MonEntreprise",
"Desprez",
"Amélie",
"Admin",
"+123456789"
);
/*Client*/
INSERT INTO `ittraining-essai`.user VALUES(
4,
"exemple@email.com",
"MonEntreprise",
"Dupont",
"Paul",
"Client",
"+123456789"
);
INSERT INTO `ittraining-essai`.user VALUES(
5,
"exemple@email.com",
"MonEntreprise",
"Dupont",
"Jacques",
"Client",
"+123456789"
);

/* Données pour le tableau de sessions */    
    
INSERT INTO `ittraining-essai`.session VALUES (
1,
"20 Mai 2024",
"20 Avril 2024",
1
);

INSERT INTO `ittraining-essai`.session VALUES (
2,
"21 Juin 2024",
"21 Mai 2024",
2
);
INSERT INTO `ittraining-essai`.session VALUES(
3,
"23 Juillet 2024",
"23 Juin 2024",
1);
INSERT INTO `ittraining-essai`.session VALUES (
4,
"30 Juin 2024",
"31 Mai 2024",
3
);
INSERT INTO `ittraining-essai`.session VALUES(
5,
"13 Juillet 2024",
"13 Juin 2024",
4);
INSERT INTO `ittraining-essai`.session VALUES(
6,
"10 Juillet 2024",
"10 Juin 2024",
5);

/* Données pour le tableau sessions User */
INSERT INTO `ittraining-essai`.session_user VALUES(
1,
4
);
INSERT INTO `ittraining-essai`.session_user VALUES(
1,
5
);

/* Données évaluation */

INSERT INTO `ittraining-essai`.evaluation VALUES (
1,
"Super Formateur",
5,
1
);

/*Données Demandes Spé de Formation */
INSERT INTO `ittraining-essai`.demande_personalisee VALUES (
1,
"Formation de Java pour 12 personnes.",
"Intra-Entreprise",
4
);

