(ns Lambdanaut.views.index (:require [Lambdanaut.views.common :as common])
	(:use 
		[noir.core :only [defpage]]
		[hiccup.core]
		[hiccup.page-helpers]
	)
)

(defpage "/" []
	(common/layout "Home"
		[:h1 "Lambdanaut.com"]
		[:p "Arts, Farts, and Software Parts&hellip;" ]
		[:img.gallery_image {:src "/img/gallery/AnotherWorldApart.png" :alt "Another World Apart"} ]
		[:img.gallery_image {:src "/img/gallery/FuhrerAndZoidberg.png" :alt "A bunch of popular media characters, and Hitler"} ]
		[:img.gallery_image {:src "/img/gallery/maze.png" :alt "Escher Maze"} ]
		[:img.gallery_image {:src "/img/gallery/katz.png" :alt "Katz from Courage the Cowardly Dog"} ]
		[:img.gallery_image {:src "/img/gallery/turtlegroup.png" :alt "Adriana's characters on a turtle"} ]
	)
)
