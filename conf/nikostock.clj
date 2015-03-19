{:title "NiKoSToCK"
 :link "http://localhost"
 :description "last nikostok files"
 :author "nikostock"
 :paths [{:path "/stock/film" :mode "file" :mask "(?i)^[^\\.].*\\.(avi|mkv|mpg|mp4|wmv)" :category "Film"}
 		 {:path "/stock/serie" :mode "file" :mask "(?i)^[^\\.].*\\.(avi|mkv|mpg|mp4|wmv)$" :category "Série"}
         {:path "/stock/zik" :mode "dir" :category "ZiK"}
        ]
}