# API Star Wars - Cytaty

![Star Wars Logo](images/Star_Wars_Logo.svg.png)

# Description

This is a simple API that allows you to access quotes from the Star Wars universe. You can use this API to get a random quote or search for quotes by character.
Usage of spring security allows adding quotations only to users with the MODERATOR ROLE, also adding and editing only to users with the ADMIN ROLE.

### Add quote

To add a quote, simply execute a POST query at the following address:

localhost:8080/api

![Star Wars Logo](images/POST.png)

### Delete quote

To delete a quote, simply execute a DELETE query at the following address:

localhost:8080/api?id={id_number}

![Star Wars Logo](images/DELETE.png)

### All quotes

To get all quotes, simply execute a GET query at the following address:

localhost:8080/api

![Star Wars Logo](images/GET.png)

# Random quote

To get a random quote, simply execute a GET query at the following address:

localhost:8080/api/random

The response will contain a random Star Wars quote in JSON format.

# Quote by character

To get a quote about a specific character, perform a GET query at:

localhost:8080/api/character/{character_name}

Where {character_name} is the name of the character, e.g. Luke Skywalker.

https://api.starwarsquotes.com/category/{category_name}

//

May the Force be with you! 🌌🚀🌟

