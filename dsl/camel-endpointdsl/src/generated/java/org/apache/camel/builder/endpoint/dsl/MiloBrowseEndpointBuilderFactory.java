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
 * Connect to OPC UA servers using the binary protocol for browsing the node
 * tree.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MiloBrowseEndpointBuilderFactory {


    /**
     * Builder for endpoint for the OPC UA Browser component.
     */
    public interface MiloBrowseEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMiloBrowseEndpointBuilder advanced() {
            return (AdvancedMiloBrowseEndpointBuilder) this;
        }
        /**
         * A virtual client id to force the creation of a new connection
         * instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clientId the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * When browsing recursively into sub-types, what's the maximum search
         * depth for diving into the tree. Default value notice: Maximum depth
         * for browsing recursively (only if recursive = true).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3
         * Group: producer
         * 
         * @param depth the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder depth(int depth) {
            doSetProperty("depth", depth);
            return this;
        }
        /**
         * When browsing recursively into sub-types, what's the maximum search
         * depth for diving into the tree. Default value notice: Maximum depth
         * for browsing recursively (only if recursive = true).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3
         * Group: producer
         * 
         * @param depth the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder depth(String depth) {
            doSetProperty("depth", depth);
            return this;
        }
        /**
         * The direction to browse (forward, inverse, ...). Default value
         * notice: The direction to browse; see
         * org.eclipse.milo.opcua.stack.core.types.enumerated.BrowseDirection.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.milo.opcua.stack.core.types.enumerated.BrowseDirection&lt;/code&gt; type.
         * 
         * Default: Forward
         * Group: producer
         * 
         * @param direction the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder direction(
                org.eclipse.milo.opcua.stack.core.types.enumerated.BrowseDirection direction) {
            doSetProperty("direction", direction);
            return this;
        }
        /**
         * The direction to browse (forward, inverse, ...). Default value
         * notice: The direction to browse; see
         * org.eclipse.milo.opcua.stack.core.types.enumerated.BrowseDirection.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.eclipse.milo.opcua.stack.core.types.enumerated.BrowseDirection&lt;/code&gt; type.
         * 
         * Default: Forward
         * Group: producer
         * 
         * @param direction the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder direction(String direction) {
            doSetProperty("direction", direction);
            return this;
        }
        /**
         * A suffix for endpoint URI when discovering.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param discoveryEndpointSuffix the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder discoveryEndpointSuffix(
                String discoveryEndpointSuffix) {
            doSetProperty("discoveryEndpointSuffix", discoveryEndpointSuffix);
            return this;
        }
        /**
         * An alternative discovery URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param discoveryEndpointUri the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder discoveryEndpointUri(
                String discoveryEndpointUri) {
            doSetProperty("discoveryEndpointUri", discoveryEndpointUri);
            return this;
        }
        /**
         * Filter out node ids to limit browsing. Default value notice: Regular
         * filter expression matching node ids.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: None
         * Group: producer
         * 
         * @param filter the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder filter(String filter) {
            doSetProperty("filter", filter);
            return this;
        }
        /**
         * Whether to include sub-types for browsing; only applicable for
         * non-recursive browsing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param includeSubTypes the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder includeSubTypes(
                boolean includeSubTypes) {
            doSetProperty("includeSubTypes", includeSubTypes);
            return this;
        }
        /**
         * Whether to include sub-types for browsing; only applicable for
         * non-recursive browsing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param includeSubTypes the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder includeSubTypes(String includeSubTypes) {
            doSetProperty("includeSubTypes", includeSubTypes);
            return this;
        }
        /**
         * The maximum number node ids requested per server call. Default value
         * notice: Maximum number of node ids requested per browse call (applies
         * to browsing sub-types only; only if recursive = true).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: producer
         * 
         * @param maxNodeIdsPerRequest the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder maxNodeIdsPerRequest(
                int maxNodeIdsPerRequest) {
            doSetProperty("maxNodeIdsPerRequest", maxNodeIdsPerRequest);
            return this;
        }
        /**
         * The maximum number node ids requested per server call. Default value
         * notice: Maximum number of node ids requested per browse call (applies
         * to browsing sub-types only; only if recursive = true).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: producer
         * 
         * @param maxNodeIdsPerRequest the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder maxNodeIdsPerRequest(
                String maxNodeIdsPerRequest) {
            doSetProperty("maxNodeIdsPerRequest", maxNodeIdsPerRequest);
            return this;
        }
        /**
         * The node definition (see Node ID). Default value notice: Root folder
         * as per OPC-UA spec.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: ns=0;id=84
         * Group: producer
         * 
         * @param node the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder node(String node) {
            doSetProperty("node", node);
            return this;
        }
        /**
         * The mask indicating the node classes of interest in browsing. Default
         * value notice: Comma-separated node class list; see
         * org.eclipse.milo.opcua.stack.core.types.enumerated.NodeClass.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: Variable,Object,DataType
         * Group: producer
         * 
         * @param nodeClasses the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder nodeClasses(String nodeClasses) {
            doSetProperty("nodeClasses", nodeClasses);
            return this;
        }
        /**
         * Whether to browse recursively into sub-types, ignores includeSubTypes
         * setting as it's implied to be set to true. Default value notice:
         * Whether to recursively browse sub-types: truefalse.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * Whether to browse recursively into sub-types, ignores includeSubTypes
         * setting as it's implied to be set to true. Default value notice:
         * Whether to recursively browse sub-types: truefalse.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder recursive(String recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * A set of allowed security policy URIs. Default is to accept all and
         * use the highest.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param allowedSecurityPolicies the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder allowedSecurityPolicies(
                String allowedSecurityPolicies) {
            doSetProperty("allowedSecurityPolicies", allowedSecurityPolicies);
            return this;
        }
        /**
         * The application name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: Apache Camel adapter for Eclipse Milo
         * Group: client
         * 
         * @param applicationName the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder applicationName(String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * The application URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://camel.apache.org/EclipseMilo/Client
         * Group: client
         * 
         * @param applicationUri the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder applicationUri(String applicationUri) {
            doSetProperty("applicationUri", applicationUri);
            return this;
        }
        /**
         * Channel lifetime in milliseconds.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param channelLifetime the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder channelLifetime(Long channelLifetime) {
            doSetProperty("channelLifetime", channelLifetime);
            return this;
        }
        /**
         * Channel lifetime in milliseconds.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param channelLifetime the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder channelLifetime(String channelLifetime) {
            doSetProperty("channelLifetime", channelLifetime);
            return this;
        }
        /**
         * The name of the key in the keystore file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param keyAlias the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder keyAlias(String keyAlias) {
            doSetProperty("keyAlias", keyAlias);
            return this;
        }
        /**
         * The key password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param keyPassword the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder keyPassword(String keyPassword) {
            doSetProperty("keyPassword", keyPassword);
            return this;
        }
        /**
         * The keystore password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param keyStorePassword the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder keyStorePassword(
                String keyStorePassword) {
            doSetProperty("keyStorePassword", keyStorePassword);
            return this;
        }
        /**
         * The key store type.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param keyStoreType the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder keyStoreType(String keyStoreType) {
            doSetProperty("keyStoreType", keyStoreType);
            return this;
        }
        /**
         * The URL where the key should be loaded from.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param keyStoreUrl the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder keyStoreUrl(String keyStoreUrl) {
            doSetProperty("keyStoreUrl", keyStoreUrl);
            return this;
        }
        /**
         * The maximum number of pending publish requests.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param maxPendingPublishRequests the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder maxPendingPublishRequests(
                Long maxPendingPublishRequests) {
            doSetProperty("maxPendingPublishRequests", maxPendingPublishRequests);
            return this;
        }
        /**
         * The maximum number of pending publish requests.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param maxPendingPublishRequests the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder maxPendingPublishRequests(
                String maxPendingPublishRequests) {
            doSetProperty("maxPendingPublishRequests", maxPendingPublishRequests);
            return this;
        }
        /**
         * The maximum number of bytes a response message may have.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param maxResponseMessageSize the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder maxResponseMessageSize(
                Long maxResponseMessageSize) {
            doSetProperty("maxResponseMessageSize", maxResponseMessageSize);
            return this;
        }
        /**
         * The maximum number of bytes a response message may have.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param maxResponseMessageSize the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder maxResponseMessageSize(
                String maxResponseMessageSize) {
            doSetProperty("maxResponseMessageSize", maxResponseMessageSize);
            return this;
        }
        /**
         * Override the server reported endpoint host with the host from the
         * endpoint URI.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: client
         * 
         * @param overrideHost the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder overrideHost(boolean overrideHost) {
            doSetProperty("overrideHost", overrideHost);
            return this;
        }
        /**
         * Override the server reported endpoint host with the host from the
         * endpoint URI.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: client
         * 
         * @param overrideHost the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder overrideHost(String overrideHost) {
            doSetProperty("overrideHost", overrideHost);
            return this;
        }
        /**
         * The product URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://camel.apache.org/EclipseMilo
         * Group: client
         * 
         * @param productUri the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder productUri(String productUri) {
            doSetProperty("productUri", productUri);
            return this;
        }
        /**
         * The requested publishing interval in milliseconds.
         * 
         * The option is a: &lt;code&gt;java.lang.Double&lt;/code&gt; type.
         * 
         * Default: 1_000.0
         * Group: client
         * 
         * @param requestedPublishingInterval the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder requestedPublishingInterval(
                Double requestedPublishingInterval) {
            doSetProperty("requestedPublishingInterval", requestedPublishingInterval);
            return this;
        }
        /**
         * The requested publishing interval in milliseconds.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Double&lt;/code&gt; type.
         * 
         * Default: 1_000.0
         * Group: client
         * 
         * @param requestedPublishingInterval the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder requestedPublishingInterval(
                String requestedPublishingInterval) {
            doSetProperty("requestedPublishingInterval", requestedPublishingInterval);
            return this;
        }
        /**
         * Request timeout in milliseconds.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param requestTimeout the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder requestTimeout(Long requestTimeout) {
            doSetProperty("requestTimeout", requestTimeout);
            return this;
        }
        /**
         * Request timeout in milliseconds.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param requestTimeout the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder requestTimeout(String requestTimeout) {
            doSetProperty("requestTimeout", requestTimeout);
            return this;
        }
        /**
         * Session name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param sessionName the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder sessionName(String sessionName) {
            doSetProperty("sessionName", sessionName);
            return this;
        }
        /**
         * Session timeout in milliseconds.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param sessionTimeout the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder sessionTimeout(Long sessionTimeout) {
            doSetProperty("sessionTimeout", sessionTimeout);
            return this;
        }
        /**
         * Session timeout in milliseconds.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: client
         * 
         * @param sessionTimeout the value to set
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder sessionTimeout(String sessionTimeout) {
            doSetProperty("sessionTimeout", sessionTimeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OPC UA Browser component.
     */
    public interface AdvancedMiloBrowseEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MiloBrowseEndpointBuilder basic() {
            return (MiloBrowseEndpointBuilder) this;
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
        default AdvancedMiloBrowseEndpointBuilder lazyStartProducer(
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
        default AdvancedMiloBrowseEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface MiloBrowseBuilders {
        /**
         * OPC UA Browser (camel-milo)
         * Connect to OPC UA servers using the binary protocol for browsing the
         * node tree.
         * 
         * Category: iot
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-milo
         * 
         * @return the dsl builder for the headers' name.
         */
        default MiloBrowseHeaderNameBuilder miloBrowse() {
            return MiloBrowseHeaderNameBuilder.INSTANCE;
        }
        /**
         * OPC UA Browser (camel-milo)
         * Connect to OPC UA servers using the binary protocol for browsing the
         * node tree.
         * 
         * Category: iot
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-milo
         * 
         * Syntax: <code>milo-browse:endpointUri</code>
         * 
         * Path parameter: endpointUri (required)
         * The OPC UA server endpoint
         * 
         * @param path endpointUri
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder miloBrowse(String path) {
            return MiloBrowseEndpointBuilderFactory.endpointBuilder("milo-browse", path);
        }
        /**
         * OPC UA Browser (camel-milo)
         * Connect to OPC UA servers using the binary protocol for browsing the
         * node tree.
         * 
         * Category: iot
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-milo
         * 
         * Syntax: <code>milo-browse:endpointUri</code>
         * 
         * Path parameter: endpointUri (required)
         * The OPC UA server endpoint
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path endpointUri
         * @return the dsl builder
         */
        default MiloBrowseEndpointBuilder miloBrowse(
                String componentName,
                String path) {
            return MiloBrowseEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the OPC UA Browser component.
     */
    public static class MiloBrowseHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final MiloBrowseHeaderNameBuilder INSTANCE = new MiloBrowseHeaderNameBuilder();

        /**
         * The node ids.
         * 
         * The option is a: {@code List} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MiloNodeIds}.
         */
        public String miloNodeIds() {
            return "MiloNodeIds";
        }
    }
    static MiloBrowseEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class MiloBrowseEndpointBuilderImpl extends AbstractEndpointBuilder implements MiloBrowseEndpointBuilder, AdvancedMiloBrowseEndpointBuilder {
            public MiloBrowseEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MiloBrowseEndpointBuilderImpl(path);
    }
}