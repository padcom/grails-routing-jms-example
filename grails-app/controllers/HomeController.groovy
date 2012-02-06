class HomeController {
    def index = {
        sendMessage("activemq:example", "Hello World!")
        render text: "Message sent", contentType: "text/plain"
    }
}
