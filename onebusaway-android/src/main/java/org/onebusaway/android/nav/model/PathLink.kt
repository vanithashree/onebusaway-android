/*
 * Copyright (C) 2018 University of South Florida (sjbarbeau@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onebusaway.android.nav.model

import android.location.Location

/**
 * A model class that holds path link information from one stop to another stop.  Multiple path links
 * form a [Path].
 */
data class PathLink

/**
 * Construct a path link between locations (stops)
 *
 * @param fromLoc   User's origin location (may be null if origin isn't known)
 * @param secondToLast Second to last location (stop prior to destination stop)
 * @param toLoc     Destination location
 */
(val fromLocation: Location?, val beforeLocation: Location?, val toLocation: Location?) {

    val pathLinkId: Int = 0

    val agencyFeedId: Int = 0

    val routeIdGtfs: String? = null

    val tripHeadsignGtfs: String? = null

    val directionIdGtfs: Int = 0

    val idStopFrom: Int = 0

    val idStopFromTransitAgencyGTFS: String? = null

    val idStopTo: Int = 0

    val idStopToTransitAgencyGTFS: String? = null

    var alertDistance: Float = 0.toFloat()

    var tripId: String? = null
}
