(ns webapp.views
  (:require [re-frame.core :as re-frame]))

(defn main-component []
  [:div.container
   [:div.formkit-container {:style "background-color:#ffffff"}
    [:div.formkit-container
     [:header
      [:div.formkit-header-background-container
       [:div.formkit-header-background {:style "background-color:#f9f7f5"}]]
      [:div.formkit-header-container
       [:div.formkit-header
        [:div.formkit-heading.formkit-heading-primary {:style "color:#111;font-weight:400"}
         [:h1 "$ave Thousand$"
          [:br]
          [:br]
          [:strong "Sell Your Home Yourself in 2021"
           [:br]
           [:br]]
          "It is easy using "
          [:br]
          "the "
          [:em "proven"]
          [:br]
          "Lane"
          " method"]]
        [:div.formkit-subheader {:style "color:#666"}
         [:h2 "Find out how REALLY SIMPLE it is to sell your home. Get your free copy of the 6 step report."]]]]]]]])
