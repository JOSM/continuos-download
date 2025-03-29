// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.plugins.continuosDownload;

import java.util.Collection;
import java.util.Collections;

import org.openstreetmap.josm.data.Bounds;

/**
 * A simple strategy for simple minds.
 */
public class SimpleStrategy extends AbstractDownloadStrategy {

    @Override
    public Collection<Bounds> getBoxes(Bounds bbox, Collection<Bounds> present, int maxBoxes) {
        return Collections.singleton(bbox);
    }
}
