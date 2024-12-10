package com.example.dddgraphql.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    public String getUser(String id) {
        // Fetch user by ID
        return "User with ID: " + id;
    }

    public String createUser(String name) {
        // Logic to create a user
        return "Created user with name: " + name;
    }
}

