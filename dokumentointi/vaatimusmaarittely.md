# Vaatimusmäärittely

## Sovelluksen tarkoitus

Sovelluksen avulla käyttäjien on mahdollista seurata opintojensa edistymistä. 

## Käyttäjäroolit

Sovelluksella on alkuun vain yksi käyttäjärooli (peruskäyttäjä), joka pystyy käsittelemään vain omia tietojaan. Sovellukseen 
saatetaan lisätä myöhemmin myös toinen käyttäjärooli (pääkäyttäjä), jonka on mahdollista käsitellä kaikkien käyttäjien
tietoja.

## Käyttöliittymä

Sovellus toimii yksikertaisella graafisella käyttöliittymällä.

## Perusversion tarjoama toiminnallisuus

### Ennen kirjautumista
- käyttäjä voi luoda käyttäjätunnuksen ja salasanan
  - uuden käyttäjätunnuksen on oltava uniikki
- käyttäjä voi kirjautua järjestelmään
  - järjestelmään kirjaudutaan, jos käyttäjätunnus löytyy ja salasana täsmää
  - jos käyttäjää ei löydy tai salasana on väärä, tulee virheilmoitus

### Kirjautumisen jälkeen
- käyttäjä näkee suorittamansa opintojaksot
  - suoritetut opintojaksot listana
  - kokonaisuuden seuranta graafina (suoritetut vs. tavoite)
- käyttäjä voi lisätä uuden opintosuorituksen
- käyttäjä voi kirjautua ulos järjestelmästä

## Jatkokehitysideoita

Perusversiota täydennetään mahdollisuuksien mukaan seuraavilla ominaisuuksilla:
- opintojen ryhmittely ja tarkastelu

