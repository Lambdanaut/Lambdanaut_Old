(ns Lambdanaut.views.creations (:require [Lambdanaut.views.common :as common])
	(:use 
		[noir.core :only [defpage]]
		[hiccup.core]
		[hiccup.page-helpers :only [link-to] ]
	)
)

(defpage "/creations" []
	(common/layout "Creations"
		[:h1 "My Projects"]
		[:h2 "Drawrawr.com"]
		[:p
			"A social community for artists that has been a WIP since late 2010. The prototype version is up on " (link-to "http://drawrawr.com" "Drawrawr.com") " right now, but the completed site is scheduled for release sometime later this year. It's a huge site " [:i "packed"] " with features and it's going to be a pretty big deal. "
		]
		[:img.project_image {:src "/img/projects/drscreenshot.png" :alt "Screenshot of Drawrawr.com" :title "A screenshot of Drawrawr One, the prototype version of Drawrawr only open to a few hundred testers. "} ]
		[:h2 "Catguice.com"]
		[:p
			(link-to "http://catguice.com" "Catguice.com") " is a storefront website written in Python for the sale of awesome custom apparel. I created it for Catherine Kern for her design company. The source code is up on " (link-to "http://github.com/Lambdanaut/Catguice" "Github.com")
		]
		[:img.project_image {:src "/img/projects/catguice.png" :alt "Screenshot of Catguice.com" :title "A screenshot of Catguice," } ]

		[:h2 "Phibot"]
		[:p
			"A re-write of my classic " (link-to "http://wetgenes.com" "wetgenes.com") " bot. Phi reads the chat from the tv rooms in their raw form, and then parses it to give meaning and use to bot writers. The example bot can stalk users from room to room, visit links posted in the room and give a summary of them, and even unscramble words and earn cookies! It's pretty radical, and caused some cool drama over on wetgenes back in the day. The original version could hack wetgenes, take the site down, and reset all bans, which was awesome. " 
		]
		(link-to "http://github.com/Lambdanaut/Phibot" "Phibot @ Github")
		[:img.project_image {:src "/img/projects/PhibotDOS.png" :alt "Screenshot of Phibot" :title "Phibot pawning some noobs on wetgenes.com. Notice all the \"X USER has left room public.tv\". That's wetgenes being taken down. "}]
		
	)
)
