(ns matrix.core
  (:require [clojure.pprint :refer [pprint]]))

(defn fib [size]
  (loop [a 0 b 1 count 0 l (list) x " "]
    (if (<= count size)
      (recur b
             (+ a b)
             (inc count)
             (conj l a)
             (prn l))
      l)))

(defn foo [& args]
  (pprint (fib 6)))
