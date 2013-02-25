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
		[:dl {:style "float: left; margin-right: 170px;"}
			[:dt "Email"] [:dd (link-to "mailto:josh@gigsalad.com" "josh@gigsalad.com")]
			[:dt "Skype"] [:dd (link-to "skype:scythesrsexy?call" "scythesrsexy")]
			[:dt "Facebook"] [:dd (link-to "http://facebook.com/lambdanaut" "http://facebook.com/lambdanaut")]
		]
		[:dl
			[:dt "Github"] [:dd (link-to "http://github.com/lambdanaut" "http://github.com/lambdanaut")]
			[:dt "Drawrawr"] [:dd (link-to "http://drawrawr.com/lambdanaut" "http://drawrawr.com/lambdanaut")]
		]
	)
)
