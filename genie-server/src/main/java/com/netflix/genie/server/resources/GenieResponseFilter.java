/*
 *
 *  Copyright 2015 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.server.resources;

/**
 * Used to increment various counters based on response from Jersey.
 *
 * @author tgianos
 */
//@Component
public class GenieResponseFilter /* implements ContainerResponseFilter */ {
//
//    private GenieNodeStatistics statistics;
//
//    /**
//     * Constructor.
//     *
//     * @param statistics The genie node statistics to use to capture information.
//     */
//    @Autowired
//    public GenieResponseFilter(final GenieNodeStatistics statistics) {
//        this.statistics = statistics;
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    public void filter(final ContainerRequestContext request, final ContainerResponseContext response) {
//        final int status = response.getStatus();
//        if (status >= HttpURLConnection.HTTP_OK && status < HttpURLConnection.HTTP_MULT_CHOICE) {
//            this.statistics.incrGenie2xxCount();
//        } else if (status >= HttpURLConnection.HTTP_BAD_REQUEST && status < HttpURLConnection.HTTP_INTERNAL_ERROR) {
//            this.statistics.incrGenie4xxCount();
//        } else if (status >= HttpURLConnection.HTTP_INTERNAL_ERROR) {
//            this.statistics.incrGenie5xxCount();
//        }
//    }
}
