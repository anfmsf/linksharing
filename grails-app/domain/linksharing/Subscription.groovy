package linksharing

class Subscription {
    Date dateCreated
    Topic topic
    User users
    static belongsTo = [users:User,topic:Topic ]

    static constraints = {
    }
}
