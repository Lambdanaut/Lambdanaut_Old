(ns Lambdanaut.views.meta (:require [Lambdanaut.views.common :as common])
	(:use 
		[noir.core :only [defpage]]
		[hiccup.core]
		[hiccup.page-helpers :only [link-to] ]
	)
)

(defpage "/meta" []
	(common/layout "Meta"
		[:h1 "Lambdanaut.com"]
		[:p 
			"Lambdanaut.com is my personal website for Internet shenanigans. I intend to post all of my projects and happenings up here, as well as using it as a casual e-resume. The website is written in " (link-to "http://clojure.com" "Clojure") " using the " (link-to "http://webnoir.org" "Noir Web Framework") ". I host Lambdanaut.com on " (link-to "http://heroku.com" "Heroku") ", a cloud application platform that abstracts working directly with the server away from me. "
		]
		[:p
			"If you're interested in viewing the source code for this website, you can check it out on " (link-to "https://github.com/Lambdanaut/Lambdanaut" "Github.com") ". "
		]
	)
)
