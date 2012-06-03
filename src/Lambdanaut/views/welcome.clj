(ns Lambdanaut.views.welcome (:require [Lambdanaut.views.common :as common])
	(:use 
		[noir.core :only [defpage]]
		[hiccup.core]
		[hiccup.page-helpers]
	)
)

(defpage "/" []
	(common/layout "Home"
		[:h1 "Lambdanaut.com"]
		[:p "My personal website for Internet shenanigans. "]
	)
)

(defpage "/bio" []
	(common/layout "Bio"
		[:h1 "Salutations, pal!"]
		[:p 
			"I'm " [:b "Josh"] ". " 
		]
		[:p
			"I make " (link-to "http://drawrawr.com" "websites") " and " (link-to "http://drawrawr.com/lambdanaut" "draw stuff") ". "
		]
		[:p
			"When I'm concentrating on a problem I like to swing " (link-to "http://en.wikipedia.org/wiki/Balisong_(knife)" "dangerous") " " (link-to "http://en.wikipedia.org/wiki/Nunchuks" "things") " around and pretend to be good at doing it. At the end of every day I can be found wearing the latest fashion" (link-to "#f1" [:sup "1"] ) ". "
		]
		[:p
			"I'm interested in " (link-to "http://www.gnu.org/philosophy/free-software-for-freedom.html" "Open Source Software") " and have crazy facial hair" (link-to "#f2" [:sup "2"]) " in order to fit in with the unkempt basement gods" (link-to "#f3" [:sup "3"]) ". "
		]
		[:p
			"I also tinker with electronics when I'm bored. Microcontrollers kick ass and I'm a big fan of the " (link-to "http://www.arduino.cc/" "Arduino") " project. "
		]
		[:p 
			"But that's enough paragraphs starting with the letter \""[:b "I"]"\" for today, so I'll throw some mad street cred out to my homies. My friends are the most awesome people in existence, and some are even cooler than me!" (link-to "#f4" [:sup "4"]) " " (link-to "http://ariaofthedolls.tumblr.com/" "Adriana") ", " (link-to "http://drawrawr.com/!catherine!" "Catherine") ", and Nicolas have been my best friends for a long time" (link-to"#f5" [:sup "5"]) ", and I've been dating Cat for over two years now &#9829;! Good people those chaps. " 
		]
		[:p
			"My favorite thing to do is program in " (link-to "http://www.haskell.org/haskellwiki/Haskell" "Functional Languages") ", but I also work in Python, PHP, Javascript, C++, and hell, whateva. I'm better at learning new things than specializing, so if you have a project that you'd like to work with me on, I can quickly adapt to the environment. Like a chameleon. " [:i "Hiss"] ". "
		]
		[:br]
		"You can find me on: "
		[:ul
			[:li (link-to "http://drawrawr.com/lambdanaut" "Drawrawr") ]
			[:li (link-to "https://github.com/Lambdanaut" "Github") ]
			[:li (link-to "http://www.reddit.com/user/TheMrBlueSky/" "Reddit") ]
		]

		[:br][:hr]

		[:ol
			[:li#f1 "Bandaids"]
			[:li#f2 "Sideburns"]
			[:li#f3 "Richard Stalman"]
			[:li#f4 "Sarcasm"]
			[:li#f5 "Since I was 13"]
		]

	)
)

(defpage "/skills" []
	(common/layout "My Skills"
		[:h1 "Stuff I'm Good At"]
		[:h2 "Programming"]

		[:div.skill
			"Python"
			[:ul
				[:li.hidden]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Clojure"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
			]
		]
		[:div.skill
			"PHP"
			[:ul
				[:li.hidden]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Haskell"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Javascript"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Coffeescript"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"MySQL"
			[:ul
				[:li.hidden]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"MongoDB"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"HTML/CSS"
			[:ul
				[:li]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Actionscript"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"C / C++"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
			]
		]
		[:div.skill
			"BASH"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.clear]

		[:h2 "Software"]
		[:div.skill
			"Windows"
			[:ul
				[:li]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Linux"
			[:ul
				[:li.hidden]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Gimp"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Adobe Flash"
			[:ul
				[:li]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Git"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Vim"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.clear]
		[:h2 "Hardware"]
		[:div.skill
			"Arduino"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Soldering"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Robotics"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
			]
		]
		[:div.skill
			"Construction"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
			]
		]
		[:div.clear]
		[:h2 "Languages"]
		[:div.skill
			"English"
			[:ul
				[:li]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Spanish"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"German"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li.hidden]
				[:li]
			]
		]
		[:div.clear]
		[:h2 "Talents"]
		[:div.skill
			"Nunchucks"
			[:ul
				[:li]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Balisong"
			[:ul
				[:li.hidden]
				[:li.hidden]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.skill
			"Painting"
			[:ul
				[:li.hidden]
				[:li]
				[:li]
				[:li]
				[:li]
			]
		]
		[:div.clear]
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

		[:h2 "Phibot"]
		[:p
			"A re-write of my classic " (link-to "http://wetgenes.com" "wetgenes.com") " bot. Phi reads the chat from the tv rooms in their raw form, and then parses it to give meaning and use to bot writers. The example bot can stalk users from room to room, visit links posted in the room and give a summary of them, and even unscramble words and earn cookies! It's pretty radical, and caused some cool drama over on wetgenes back in the day. The original version could hack wetgenes, take the site down, and reset all bans, which was awesome. " 
		]
		(link-to "http://github.com/Lambdanaut/Phibot" "Phibot @ Github")
		[:img.project_image {:src "/img/projects/PhibotDOS.png" :alt "Screenshot of Phibot" :title "Phibot pawning some noobs on wetgenes.com. Notice all the \"X USER has left room public.tv\". That's wetgenes being taken down. "}]
		
	)
)

(defpage "/contact" []
	(common/layout "Contact"
		[:h1 "Drop me a line"]
		[:p 
			"You can send me an " (link-to "mailto:josh@lambdanaut.com" "email") " or find me online at " (link-to "http://drawrawr.com/lambdanaut" "Drawrawr.com") ". I'm also on " (link-to "http://facebook.com/lambdanaut" "Facebook") ". "
		]
	)
)
