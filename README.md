# roman

A simple client side app to convert decimal to Roman numerals

The actual functions that convert to and from Roman Numerals are exercises I did as part of the 4Clojure 

[Read Roman Numerals](http://www.4clojure.com/problem/92)
[Write Roman Numerals](http://www.4clojure.com/problem/104)

See the source code main.cljs for some links that helped me out getting started with Clojurescript.

# How this app was made

Having installed Leiningen I created a new project with 'lein new roman' 

I then edited the project.clj to add the dependencies I needed and especially to set up lein-cljsbuild which enables you to build cljs code easily.

The html is in index.html and the javascript is compiled into the javascripts folder from the Clojurescript.

I had a terminal with the comman 'lein cljsbuild auto' running, so that any changes to the cljs files are compiled to javascript. 

## License

Copyright © 2013 Justin Heyes-Jones

Distributed under the Eclipse Public License, the same as Clojure.
