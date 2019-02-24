(ns sudoku.core
  (:use [clojure.core.logic :rename {== ===}])
  (:gen-class))

(defn permutate [coll]
  (if (next coll)
    (apply concat
           (for [x coll]
             (map (partial concat [x]) (permutate (remove #{x} coll)))))
    [coll]))
(def eazy
  [[1 2 3 4]
   [3 4 1 2]
   [2 1 4 3]
   [4 3 2 1]])
(def eazy-limit [1 2 3 4])
(defn eazy []
  (count (run* [a1 a2 a3 a4
         b1 b2 b3 b4
         c1 c2 c3 c4
         d1 d2 d3 d4]
;;    (=== a1 1)
;;    (=== a2 2)
    (=== a3 3)
;;    (=== a4 4)
    (=== b1 3)
    (=== b2 4)
    (=== b3 1)
;;    (=== b4 2)
    (=== c1 2)
;;    (=== c2 1)
    (=== c3 4)
    (=== c4 3)
;;    (=== d1 4)
;;    (=== d2 3)
;;    (=== d3 2)
;;    (=== d4 1)
    (membero a1 eazy-limit)
    (membero a2 eazy-limit)
    (membero a3 eazy-limit)
    (membero a4 eazy-limit)
    (membero b1 eazy-limit)
    (membero b2 eazy-limit)
    (membero b3 eazy-limit)
    (membero b4 eazy-limit)
    (membero c1 eazy-limit)
    (membero c2 eazy-limit)
    (membero c3 eazy-limit)
    (membero c4 eazy-limit)
    (membero d1 eazy-limit)
    (membero d2 eazy-limit)
    (membero d3 eazy-limit)
    (membero d4 eazy-limit)
    (distincto [a1 a2 a3 a4])
    (distincto [b1 b2 b3 b4])
    (distincto [c1 c2 c3 c4])
    (distincto [d1 d2 d3 d4])

    (distincto [a1 b1 c1 d1])
    (distincto [a2 b2 c2 d2])
    (distincto [a3 b3 c3 d3])
    (distincto [a4 b4 c4 d4])

    (distincto [a1 a2 b1 b2])
    (distincto [a3 a4 b3 b4])
    (distincto [c1 c2 d1 d2])
    (distincto [c3 c4 d3 d4]))))



(def hard-limit [1 2 3 4 5 6 7 8 9])
(defn hard []
  (run* [a1 a2 a3 a4 a5 a6 a7 a8 a9
       b1 b2 b3 b4 b5 b6 b7 b8 b9
       c1 c2 c3 c4 c5 c6 c7 c8 c9
       d1 d2 d3 d4 d5 d6 d7 d8 d9
       e1 e2 e3 e4 e5 e6 e7 e8 e9
       f1 f2 f3 f4 f5 f6 f7 f8 f9
       g1 g2 g3 g4 g5 g6 g7 g8 g9
       h1 h2 h3 h4 h5 h6 h7 h8 h9
       i1 i2 i3 i4 i5 i6 i7 i8 i9]
  (=== a3 5)
  (=== a4 3)
  (=== b1 8)
  (=== b8 2)
  (=== c2 7)
  (=== c5 1)
  (=== c7 5)
  (=== d1 4)
  (=== d6 5)
  (=== d7 3)
  (=== e2 1)
  (=== e5 7)
  (=== e9 6)
  (=== f3 3)
  (=== f4 2)
  (=== f8 8)
  (=== g2 6)
  (=== g4 5)
  (=== g9 9)
  (=== h3 4)
  (=== h8 3)
  (=== i6 9)
  (=== i7 7)
  (membero a1 hard-limit)
  (membero a2 hard-limit)
  (membero a3 hard-limit)
  (membero a4 hard-limit)
  (membero a5 hard-limit)
  (membero a6 hard-limit)
  (membero a7 hard-limit)
  (membero a8 hard-limit)
  (membero a9 hard-limit)
  (membero b1 hard-limit)
  (membero b2 hard-limit)
  (membero b3 hard-limit)
  (membero b4 hard-limit)
  (membero b5 hard-limit)
  (membero b6 hard-limit)
  (membero b7 hard-limit)
  (membero b8 hard-limit)
  (membero b9 hard-limit)
  (membero c1 hard-limit)
  (membero c2 hard-limit)
  (membero c3 hard-limit)
  (membero c4 hard-limit)
  (membero c5 hard-limit)
  (membero c6 hard-limit)
  (membero c7 hard-limit)
  (membero c8 hard-limit)
  (membero c9 hard-limit)
  (membero d1 hard-limit)
  (membero d2 hard-limit)
  (membero d3 hard-limit)
  (membero d4 hard-limit)
  (membero d5 hard-limit)
  (membero d6 hard-limit)
  (membero d7 hard-limit)
  (membero d8 hard-limit)
  (membero d9 hard-limit)
  (membero e1 hard-limit)
  (membero e2 hard-limit)
  (membero e3 hard-limit)
  (membero e4 hard-limit)
  (membero e5 hard-limit)
  (membero e6 hard-limit)
  (membero e7 hard-limit)
  (membero e8 hard-limit)
  (membero e9 hard-limit)
  (membero f1 hard-limit)
  (membero f2 hard-limit)
  (membero f3 hard-limit)
  (membero f4 hard-limit)
  (membero f5 hard-limit)
  (membero f6 hard-limit)
  (membero f7 hard-limit)
  (membero f8 hard-limit)
  (membero f9 hard-limit)
  (membero g1 hard-limit)
  (membero g2 hard-limit)
  (membero g3 hard-limit)
  (membero g4 hard-limit)
  (membero g5 hard-limit)
  (membero g6 hard-limit)
  (membero g7 hard-limit)
  (membero g8 hard-limit)
  (membero g9 hard-limit)
  (membero h1 hard-limit)
  (membero h2 hard-limit)
  (membero h3 hard-limit)
  (membero h4 hard-limit)
  (membero h5 hard-limit)
  (membero h6 hard-limit)
  (membero h7 hard-limit)
  (membero h8 hard-limit)
  (membero h9 hard-limit)
  (membero i1 hard-limit)
  (membero i2 hard-limit)
  (membero i3 hard-limit)
  (membero i4 hard-limit)
  (membero i5 hard-limit)
  (membero i6 hard-limit)
  (membero i7 hard-limit)
  (membero i8 hard-limit)
  (membero i9 hard-limit)
  (distincto [a1 a2 a3 a4 a5 a6 a7 a8 a9])
  (distincto [b1 b2 b3 b4 b5 b6 b7 b8 b9])
  (distincto [c1 c2 c3 c4 c5 c6 c7 c8 c9])
  (distincto [d1 d2 d3 d4 d5 d6 d7 d8 d9])
  (distincto [e1 e2 e3 e4 e5 e6 e7 e8 e9])
  (distincto [f1 f2 f3 f4 f5 f6 f7 f8 f9])
  (distincto [g1 g2 g3 g4 g5 g6 g7 g8 g9])
  (distincto [h1 h2 h3 h4 h5 h6 h7 h8 h9])
  (distincto [i1 i2 i3 i4 i5 i6 i7 i8 i9])

  (distincto [a1 b1 c1 d1 e1 f1 g1 h1 i1])
  (distincto [a2 b2 c2 d2 e2 f2 g2 h2 i2])
  (distincto [a3 b3 c3 d3 e3 f3 g3 h3 i3])
  (distincto [a4 b4 c4 d4 e4 f4 g4 h4 i4])
  (distincto [a5 b5 c5 d5 e5 f5 g5 h5 i5])
  (distincto [a6 b6 c6 d6 e6 f6 g6 h6 i6])
  (distincto [a7 b7 c7 d7 e7 f7 g7 h7 i7])
  (distincto [a8 b8 c8 d8 e8 f8 g8 h8 i8])
  (distincto [a9 b9 c9 d9 e9 f9 g9 h9 i9])

  (distincto [a1 a2 a3 b1 b2 b3 c1 c2 c3])
  (distincto [a4 a5 a6 b4 b5 b6 c4 c5 c6])
  (distincto [a7 a8 a9 b7 b8 b9 c7 c8 c9])
  (distincto [d1 d2 d3 e1 e2 e3 f1 f2 f3])
  (distincto [d4 d5 d6 e4 e5 e6 f4 f5 f6])
  (distincto [d7 d8 d9 e7 e8 e9 f7 f8 f9])
  (distincto [g1 g2 g3 h1 h2 h3 i1 i2 i3])
  (distincto [g4 g5 g6 h4 h5 h6 i4 i5 i6])
  (distincto [g7 g8 g9 h7 h8 h9 i7 i8 i9])))

(def eazy-board
  [[0 0 3 0]
   [3 4 1 0]
   [2 0 4 3]
   [0 0 0 0]])

(def hard-board
  [[0 0 5 3 0 0 0 0 0]
   [8 0 0 0 0 0 0 2 0]
   [0 7 0 0 1 0 5 0 0]
   [4 0 0 0 0 5 3 0 0]
   [0 1 0 0 7 0 0 0 6]
   [0 0 3 2 0 0 0 8 0]
   [0 6 0 5 0 0 0 0 9]
   [0 0 4 0 0 0 0 3 0]
   [0 0 0 0 0 9 7 0 0]])

(defn -main
  [& args]
  (time (prn (eazy))))
