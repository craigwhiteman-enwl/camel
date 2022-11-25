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
 * Use a Camel Data Format as a regular Camel Component.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DataFormatEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Data Format component.
     */
    public interface DataFormatEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDataFormatEndpointBuilder advanced() {
            return (AdvancedDataFormatEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Data Format component.
     */
    public interface AdvancedDataFormatEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DataFormatEndpointBuilder basic() {
            return (DataFormatEndpointBuilder) this;
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
        default AdvancedDataFormatEndpointBuilder lazyStartProducer(
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
        default AdvancedDataFormatEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface DataFormatBuilders {
        /**
         * Data Format (camel-dataformat)
         * Use a Camel Data Format as a regular Camel Component.
         * 
         * Category: core,transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-dataformat
         * 
         * Syntax: <code>dataformat:name:operation</code>
         * 
         * Path parameter: name (required)
         * Name of data format
         * 
         * Path parameter: operation (required)
         * Operation to use either marshal or unmarshal
         * There are 2 enums and the value can be one of: marshal, unmarshal
         * 
         * @param path name:operation
         * @return the dsl builder
         */
        default DataFormatEndpointBuilder dataformat(String path) {
            return DataFormatEndpointBuilderFactory.endpointBuilder("dataformat", path);
        }
        /**
         * Data Format (camel-dataformat)
         * Use a Camel Data Format as a regular Camel Component.
         * 
         * Category: core,transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-dataformat
         * 
         * Syntax: <code>dataformat:name:operation</code>
         * 
         * Path parameter: name (required)
         * Name of data format
         * 
         * Path parameter: operation (required)
         * Operation to use either marshal or unmarshal
         * There are 2 enums and the value can be one of: marshal, unmarshal
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name:operation
         * @return the dsl builder
         */
        default DataFormatEndpointBuilder dataformat(
                String componentName,
                String path) {
            return DataFormatEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DataFormatEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DataFormatEndpointBuilderImpl extends AbstractEndpointBuilder implements DataFormatEndpointBuilder, AdvancedDataFormatEndpointBuilder {
            public DataFormatEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DataFormatEndpointBuilderImpl(path);
    }
}