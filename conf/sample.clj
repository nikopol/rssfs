{:title "Sample"
 :link "http://localhost"
 :description "last stock files"
 :author "sample"
 :paths [{:path "/stock/film" :mode "file" :mask "(?i)^[^\\.].*\\.(avi|mkv|mpg|mp4|wmv)" :category "Film"}
 		 {:path "/stock/serie" :mode "file" :mask "(?i)^[^\\.].*\\.(avi|mkv|mpg|mp4|wmv)$" :category "Serie"}
         {:path "/stock/zik" :mode "dir" :category "ZiK"}
        ]
}