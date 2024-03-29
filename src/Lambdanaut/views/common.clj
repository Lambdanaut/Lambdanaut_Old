(ns Lambdanaut.views.common
	(:use 
		[noir.core :only [defpartial]]
		[hiccup.page-helpers]
	)
)

(defpartial layout [title & content]
	(html5
		[:head
			[:title "Lambdanaut :: " title]
			[:meta {:name "description" :content "The personal home page of Josh Thomas"} ]
			[:meta {:name "author" :content "Lambdanaut"} ]
			[:meta {:name "keywords" :content "Lambdanaut Art Programming Haskell Clojure Python Internet Blog Joshua Thomas Josh DarkScythe Jelix Tealon Personette Lambda Functional Binary Robot Drawing Pixel Nunchuks"} ]
			(include-css "/css/reset.css")
			(include-css "/css/main.css")]
			[:body
				[:div#navigation 	
					(link-to "/" [:img {:src "/img/Lambdanautlogo.png" :alt "Lambdanaut Logo"} ] )
					[:ul
						[:li (link-to "/skills" "Skills")]
						[:li (link-to "/contact" "Contact")]
					]
				]
				[:div#content content]
			]
	)
)
