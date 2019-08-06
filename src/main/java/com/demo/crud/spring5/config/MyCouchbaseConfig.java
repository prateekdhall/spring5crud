package com.demo.crud.spring5.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.convert.MappingCouchbaseConverter;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages={"com.demo.crud.spring5"})
public class MyCouchbaseConfig extends AbstractCouchbaseConfiguration {

	@Autowired
	Environment env;
	
	@Override
	protected List<String> getBootstrapHosts() {
		return Arrays.asList("localhost");
	}

	@Override
	protected String getBucketName() {
		return "student";
	}

	@Override
	protected String getBucketPassword() {
		return "";
	}
	/*
	 * @Override public String typeKey() { // use "javaClass" instead of "_class"
	 * return MappingCouchbaseConverter.TYPEKEY_SYNCGATEWAY_COMPATIBLE; }
	 */
}