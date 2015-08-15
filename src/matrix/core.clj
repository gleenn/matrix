(ns matrix.core
  (:require
    [clojure.pprint :refer [pprint]]
    [clojure.core.matrix :as m]))

(defn fib [size]
  (loop [a 0 b 1 count 0 l (list)]
    (if (< count size)
      (recur b
             (mod (+' a b) (int (Math/sqrt Integer/MAX_VALUE)))
             (inc count)
             (conj l a))
      l)))

(defn foo [& args]
  (time (let [size 1000000
              m (take size (fib (inc' size)))
              v (fib size)]
          (pprint (time (m/mmul m v))))))

(foo)
