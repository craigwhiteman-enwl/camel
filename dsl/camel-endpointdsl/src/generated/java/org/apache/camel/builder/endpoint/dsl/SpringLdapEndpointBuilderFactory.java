/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform searches in LDAP servers using filters as the message payload.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SpringLdapEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spring LDAP component.
     */
    public interface SpringLdapEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSpringLdapEndpointBuilder advanced() {
            return (AdvancedSpringLdapEndpointBuilder) this;
        }
        /**
         * The LDAP operation to be performed.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.springldap.LdapOperation&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default SpringLdapEndpointBuilder operation(
                org.apache.camel.component.springldap.LdapOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The LDAP operation to be performed.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.springldap.LdapOperation&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default SpringLdapEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The scope of the search operation.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: subtree
         * Group: producer
         * 
         * @param scope the value to set
         * @return the dsl builder
         */
        default SpringLdapEndpointBuilder scope(String scope) {
            doSetProperty("scope", scope);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spring LDAP component.
     */
    public interface AdvancedSpringLdapEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SpringLdapEndpointBuilder basic() {
            return (SpringLdapEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedSpringLdapEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedSpringLdapEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SpringLdapBuilders {
        /**
         * Spring LDAP (camel-spring-ldap)
         * Perform searches in LDAP servers using filters as the message
         * payload.
         * 
         * Category: spring,ldap
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-spring-ldap
         * 
         * Syntax: <code>spring-ldap:templateName</code>
         * 
         * Path parameter: templateName (required)
         * Name of the Spring LDAP Template bean
         * 
         * @param path templateName
         * @return the dsl builder
         */
        default SpringLdapEndpointBuilder springLdap(String path) {
            return SpringLdapEndpointBuilderFactory.endpointBuilder("spring-ldap", path);
        }
        /**
         * Spring LDAP (camel-spring-ldap)
         * Perform searches in LDAP servers using filters as the message
         * payload.
         * 
         * Category: spring,ldap
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-spring-ldap
         * 
         * Syntax: <code>spring-ldap:templateName</code>
         * 
         * Path parameter: templateName (required)
         * Name of the Spring LDAP Template bean
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path templateName
         * @return the dsl builder
         */
        default SpringLdapEndpointBuilder springLdap(
                String componentName,
                String path) {
            return SpringLdapEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SpringLdapEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SpringLdapEndpointBuilderImpl extends AbstractEndpointBuilder implements SpringLdapEndpointBuilder, AdvancedSpringLdapEndpointBuilder {
            public SpringLdapEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SpringLdapEndpointBuilderImpl(path);
    }
}