(ns Lambdanaut.views.bio (:require [Lambdanaut.views.common :as common])
	(:use 
		[noir.core :only [defpage]]
		[hiccup.core]
		[hiccup.page-helpers :only [link-to] ]
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
			"I'm currently working as a software developer at " (link-to "http://gigbureau.com" "The Gig Bureau") " in Wilmington, NC. It's a great company in a beautiful location and the culture there is untouched pristine startup. It's real nice. "
		]
		[:p 
			"But that's enough paragraphs starting with the letter \""[:b "I"]"\" for today, so I'll throw some mad street cred out to my homies. My friends are the most awesome people in existence, and some are even cooler than me!" (link-to "#f4" [:sup "4"]) " " (link-to "http://ariaofthedolls.tumblr.com/" "Adriana") ", " (link-to "http://drawrawr.com/!catherine!" "Catherine") ", and " (link-to "http://nguillemot.blogspot.ca/" "Nicolas") " have been my best friends for a long time" (link-to"#f5" [:sup "5"]) ", and I've been dating Cat for over two years now &#9829;! Good people those chaps. " 
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
		[:p 
			"For more information about this website, " (link-to "/meta" "click here")
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
