package linksharing

class Topic {

                String name;
                Date dateCreated;
                Date lastUpdated;
                static belongsTo =[users:User];
                static hasMany =[resource:Resource,sub:Subscription];


    static constraints = {
        User(Unique:true);
        Resource(Unique:true);

    }
}
