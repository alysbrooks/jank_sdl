(defproject jank_sdl "0.1-SNAPSHOT"
  :license {:name "MPL 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies []
  :plugins [[org.jank-lang/lein-jank "0.5"]]
  :middleware [leiningen.jank/middleware]
  :main jank-sdl.hello-sdl
  :profiles {:base {:jank {:output-dir "target/debug"
                           :optimization-level 0}}
             :release {:jank {:output-dir "target/release"
                              :optimization-level 2}}}
    :jank {:library-dirs ["/usr/lib/x86_64-linux-gnu/"]
         :linked-libraries ["SDL2"]})
