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
			[:dt "Email"] [:dd (link-to "mailto:personettelabs@gmail.com" "personettelabs@gmail.com")]
			[:dt "Drawrawr"] [:dd (link-to "http://drawrawr.com/lambdanaut" "http://drawrawr.com/lambdanaut")]
			[:dt "Facebook"] [:dd (link-to "http://facebook.com/lambdanaut" "http://facebook.com/lambdanaut")]
		]
		[:dl
			[:dt "Github"] [:dd (link-to "http://github.com/lambdanaut" "http://github.com/lambdanaut")]
			[:dt "Hacker News"] [:dd (link-to "http://news.ycombinator.com/user?id=Lambdanaut" "http://news.ycombinator.com/user?id=Lambdanaut")]
			[:dt "Reddit"] [:dd (link-to "http://www.reddit.com/user/TheMrBlueSky/" "http://www.reddit.com/user/TheMrBlueSky/")]
		]
	)
)
