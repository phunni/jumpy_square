(ns jumpy-square.core.desktop-launcher
  (:require [jumpy-square.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. jumpy_square-game "jumpy_square" 800 600)
  (Keyboard/enableRepeatEvents true))
