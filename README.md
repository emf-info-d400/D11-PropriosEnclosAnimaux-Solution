# Devoir 11 : Propriétaires, enclos et animaux de rente
## Objectifs :
- Entraînement à la lecture et à la retranscription en Java d'informations fournies textuellement.
- Entraînement à de l'algorithmique simple (révision module 319).
- Révision de l'ensemble des concepts vus en classe.
- **`Bonne préparation à la E1 à venir`**.

## Durée :
Vous devriez être en mesure de réaliser l'ensemble des fonctionnalités décrites ci-dessous en **1h à 1h30** maximum.

## Mission :
- Retranscrivez avec précision les explications ci-dessous dans votre projet Java afin d'obtenir une application fonctionnelle.
- Veillez à respecter les enseignements reçus à l'EMF (classes dans les bons packages, ordre des choses dans vos classes, choix des noms, ...).

## Contexte général :
Plusieurs propriétaires d'animaux de rente (bovins, caprins, porcins, volailles, équins, ...) se mettent ensemble et se cotisent afin que vous réalisiez un petit programme simple pour répartir leurs animaux dans des enclos, en tenant compte de quelques règles simples.

## Indications fournies :
Un propriétaire aura un nom et un prénom. Ces informations devront pouvoir être demandées ultérieurement mais plus jamais modifiées. L'affichage éventuel d'un propriétaire produira un résultat ressemblant à ceci : `"Paul Duchampsec"`.

Un enclos permet d'accueillir un certain nombre d'animaux. Il y a des grands enclos et des plus petits. La taille de chaque enclos sera définie lors de sa création. On doit pouvoir demander à un enclos s'il lui reste encore de la place, combien d'animaux il contient, combien d'animaux on pourrait encore y placer. On doit également pouvoir y placer un animal. Sans pour autant pouvoir spécifier lequel en particulier on souhaite retirer, on devra également pouvoir retirer un animal de cet enclos qui sera pris dans le cheptel actuel (au hasard si vous le souhaitez, vous êtes libres de faire comme vous voulez). Pour terminer, on doit pouvoir lui demander s'il contient au moins un herbivore.

Un animal aura un propriétaire, un type ("Cheval", "Porc", ...), un numéro unique (17, 324, ...) et si oui ou non il s'agit d'un herbivore (car herbivores et non-herbivores ne peuvent pas être mélangés dans le même enclos). Ces informations devront pouvoir être demandées ultérieurement mais jamais modifiées. L'affichage d'un animal devra produire un résultat ressemblant à ceci : `"N°0031-Cheval-Propriété de Paul Duchampsec"`.

A vôté de votre main(), faites une méthode de génération d'animaux qui recevra un propriétaire et qui produira aléatoirement un nouvel animal de l'un de ces types choisi au hasard ("Cheval", "Vache", "Chèvre", "Poule", "Chien", "Porc"). Seuls les 3 premiers sont des herbivores. Pour faire simple, faites en sorte que cette méthode utilise un compteur général, à chaque fois incrémenté, pour le numéro unique de l'animal afin de ne jamais réutiliser le même.

Dans votre main(), créez un tableau avec 8 enclos, chacun avec de la place pour 20 animaux.

Créez les 4 propriétaires suivants : "Mario Duprévert", "Paul Duchampsec", "Fred Dupaturage" et "Tom Delaprairie".

Pour chacun d'entre-eux, créez 10 animaux aléatoirement à l'aide de votre méthode de génération et tentez de placer ces animaux dans l'un ou l'autre des enclos disponibles. Si à un moment donné le placement d'un animal devait échouer, indiquez-le sur la console et faites que votre programme s'arrête.

Une fois que tous les animaux auront trouvé leur place, enclos par enclos, affichez leur contenu.

Vous devriez obtenir une sortie console ressemblant à ceci :
````
---------------------------------
L'école 'Ecole des métiers de Fribourg' contient les classes suivantes :
'MatuXYZ'
'300211'
---------------------------------
````

## RESTITUTION :
1. Rendre ce devoir normalement par `push` GitHub
