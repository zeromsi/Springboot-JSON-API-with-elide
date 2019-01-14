Viewing the Results
Let’s take a look at the various JSON API endpoints that we have just exposed. I have taken the liberty of uploading a version of this application to Heroku, so you can see the results of these URLs live.

https://elide-test.herokuapp.com/parent will display a list of the parent entities

https://elide-test.herokuapp.com/parent/1 will display the details of a single parent entity

https://elide-test.herokuapp.com/parent/1/relationships/children will display the type and id of the children assigned to a single parent

https://elide-test.herokuapp.com/parent/1/children will display the complete details of the children assigned to a single parent

We also get a number of useful query parameters that can be used to customize the output:

https://elide-test.herokuapp.com/parent?fields[parent]=name will display only the name attribute of the parent entities (this is known as sparse fieldsets in the JSON API spec)

https://elide-test.herokuapp.com/parent?filter[parent.id]=2 will return the parent entity with the id of 2

https://elide-test.herokuapp.com/parent?filter[parent.name][prefix]=Jane will return the parent entities with the name attribute starting with “Jane”

https://elide-test.herokuapp.com/parent?sort=-name will return the parent entities sorted by the name attribute in descending order

You can find more information on the format of these query parameters in the Elide documentation.
