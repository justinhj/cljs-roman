# cljs-roman

A simple client side app to convert decimal to Roman numerals written in clojurescript

![Screenshot](roman-screenshot.png Screenshot)

The actual functions that convert to and from Roman Numerals are exercises I did as part of the 4Clojure puzzles below. As such I didn't spend much time making the code readable or worrying too much about whether it's a perfect implementation of converting numbers. The main goal of this project was to identify a problem small enough to do in a few hours to get started with Clojurescript development.

[Read Roman Numerals](http://www.4clojure.com/problem/92)

[Write Roman Numerals](http://www.4clojure.com/problem/104)

See the source code main.cljs for some links that helped me out getting started with Clojurescript.

# How this app was made

Having installed Leiningen I created a new project with 'lein new roman' 

I then edited the project.clj to add the dependencies I needed and especially to set up lein-cljsbuild which enables you to build cljs code easily.

The html is in roman.html and the javascript is compiled into the javascripts folder from the Clojurescript in the src/cljs folder.

I had a terminal with the comman 'lein cljsbuild auto' running, so that any changes to the cljs files are compiled to javascript. 

## License

Copyright © 2013 Justin Heyes-Jones

Distributed under the Eclipse Public License, the same as Clojure.
