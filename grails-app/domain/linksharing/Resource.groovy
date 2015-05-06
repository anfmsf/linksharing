package linksharing

class Resource {
    String description
    Date dateCreated
    Date lastUpdated
    Topic topic
    static belongsTo = [users:User,topic:Topic]
    static hasMany = [read:ReadingItem]

    static constraints = {

    }
}
