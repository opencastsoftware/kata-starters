(ns kata-test
  (:require
   [kata :as kata]
   [clojure.test :refer [deftest is testing]]))

(deftest increment
  (testing "incrementing 1 should equal 2"
    (is (= (kata/increment 1) 2))))