(ns Lambdanaut.views.contact (:require [Lambdanaut.views.common :as common])
	(:use 
		[noir.core :only [defpage]]
		[hiccup.core]
		[hiccup.page-helpers :only [link-to] ]
	)
)

(defpage "/contact" []
	(common/layout "Contact"
		[:h1 "Drop me a line"]
		[:p 
			"You can send me an " (link-to "mailto:personettelabs@gmail.com" "email") " or find me online at " (link-to "http://drawrawr.com/lambdanaut" "Drawrawr.com") ". I'm also on " (link-to "http://facebook.com/lambdanaut" "Facebook") ". "
		]
	)
)
