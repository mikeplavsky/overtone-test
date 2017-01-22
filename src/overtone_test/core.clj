(ns overtone-test.core)

(use 'overtone.inst.piano)
(use 'overtone.core)

(defn play-note 
  [n]
  (if (= n :W) 
    (Thread/sleep 1000)
    (do 
      (piano (note n))
      (Thread/sleep 500))))

(defn ode_to_joy
  []
  (do (map play-note 
           [:B4 :B4 :C5 :D5 :D5
            :C5 :B4 :A4 
            :W 
            :G4 :G4
            :A4 :B4 :B4 :A4 :A4
            :W
            :B4 :B4 :C5 :D5 :D5
            :C5 :B4 :A4 
            :W
            :G4 :G4
            :A4 :B4 :A4 :G4 :G4
            :W
            :A4 :A4 :B4 :G4 :A4
            :C5 :B4 :G4 :A4 :C5
            :B4 :A4 :G4 :A4 :D5
            :W
            :B4 :B4 :C5 :D5 :D5
            :C5 :B4 :A4 :G4 :G4
            :A4 :B4 :A4 :G4 :G4])))
