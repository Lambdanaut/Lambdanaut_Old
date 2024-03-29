(ns Lambdanaut.server
	(:require [noir.server :as server])
)

(server/load-views "src/Lambdanaut/views/")

(defn -main [& m]
	(let [mode (keyword (or (first m) :dev)) port (Integer. (get (System/getenv) "PORT" "80"))]
		(server/start port {:mode mode :ns 'Lambdanaut})
	)
)
