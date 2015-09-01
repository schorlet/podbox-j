# The Podbox connector Challenge!
<img align="right" alt="We want you!" title="We want you!" width="350px" src="https://s3.amazonaws.com/podbox-blog/blog/wp-content/uploads/2015/05/we-want-you.jpg" />
So you are willing to have fun working along with the [Podbox](https://www.podbox.com/about-us) team? Here is the first step, which will give you the freedom to demonstrate some of your developer skills!

<br clear="all" />

## The game
This repository contains the skeleton of a web application whose purpose is **to display the top 10 music tracks of the week along with a Spotify player**.

Your goals are to:
* make a service that call the Billboard's feed to retrieve the 100 hottest tracks of the week: http://www.billboard.com/rss/charts/hot-100
* make a service that call the Spotify api to search a track: https://developer.spotify.com/web-api/search-item/
* implement the [`com.podbox.challenge.ChartsService.getHot10`](https://github.com/podbox/podbox-challenge-connector/blob/master/src/main/java/com/podbox/challenge/service/ChartsService.java#L17) method to retrieve the top 10 with the optional corresponding Spotify URI.
* when you like your solution, you can submit it by sending us your proposal to `rd+challenge@podbox.com`

You are not expected neither to modify the client code nor to add new server functionalities.

You can see a running version of a solution here: [https://podbox.herokuapp.com/](https://podbox.herokuapp.com/). The app can be slow to startup and be careful that your ad blocker is not preventing from embedding the Spotify player.

## How will you impress us?
* by the simplicity of your solution
* it find a way to make the calls to Spotify in parallel ([be careful...](https://www.youtube.com/watch?v=4F4qzPbcFiA))

Notes:
* **we will test your submission** by running the project with `./gradlew bootRun` and then going to [http://localhost:8080/](http://localhost:8080/). Make sure this works!
* we will spend about half an hour reviewing your submission, so don't waste days writing too much code (it is just a challenge)

## Setup
Enter the challenge!
* retrieve this skeleton repository
* install the jdk8 on your computer (this is a Java Spring web application)
* launch the web application with `./gradlew bootRun`
* visit [http://localhost:8080/](http://localhost:8080/) in your browser
* press `ctrl`+`c` in the terminal to stop the web application
