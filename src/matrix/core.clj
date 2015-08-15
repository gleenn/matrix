(ns matrix.core
  (:require
    [clojure.pprint :refer [pprint]]
    [clojure.core.matrix :as m]))

(defn fib [size]
  (reverse (loop [a 0 b 1 count 0 l (list)]
             (if (< count size)
               (recur b
                      (mod (+' a b) (int (/ Integer/MAX_VALUE 10)))
                      (inc count)
                      (conj l a))
               l))))

(defn foo [& args]
  (let [m (take 100 (fib 200)) v (fib 100)]
    (pprint (m/mmul m v))))

(foo)
