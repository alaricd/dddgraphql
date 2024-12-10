package com.example.dddgraphql.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class OrderResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    public String getOrder(String id) {
        // Fetch order by ID
        return "Order with ID: " + id;
    }

    public String createOrder(String details) {
        // Logic to create an order
        return "Created order with details: " + details;
    }
}

