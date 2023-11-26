package qlido.kreact.components

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML
import web.cssom.*
import web.cssom.Color as Color

val Header = FC {
    ReactHTML.div {
        css {
            overflow = Overflow.hidden
            backgroundColor = Color("#FFFFFF")
            padding = Padding(20.px, 10.px)
        }

        ReactHTML.a {
            css {
                fontSize = 25.px
                fontWeight = FontWeight.bold
            }

            +"Kotlin React Table"
        }
    }
}
