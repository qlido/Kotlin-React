package qlido.kreact

import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider
import tanstack.react.query.useQuery
import web.dom.document
import web.html.HTML
import web.html.HTML.div

fun main() {
    val root = document.createElement(HTML.div)
    document.body.appendChild(root)
    createRoot(root)
        .render(App.create())
}

private val QueryClient = QueryClient()

private val App = FC<Props> {
    QueryClientProvider {
        client = QueryClient


        div{
            +"asdf"
        }

    }
}