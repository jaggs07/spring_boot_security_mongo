package com.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	// get the database name
	@Override
	protected String getDatabaseName() {

		return "users";
	}

	// configures the mongo client
	@Override
	public Mongo mongo() throws Exception {

		return new MongoClient("127.0.0.1", 27017);
	}
}