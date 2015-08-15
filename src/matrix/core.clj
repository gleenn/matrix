(ns matrix.core
  (:require [clojure.pprint :refer [pprint]]))

(defn fib [size]
  (reverse (loop [a 0 b 1 count 0 l (list)]
             (if (<= count size)
               (recur b
                      (+ a b)
                      (inc count)
                      (conj l a))
               l))))

(defn foo [& args]
  (pprint (fib 6)))
