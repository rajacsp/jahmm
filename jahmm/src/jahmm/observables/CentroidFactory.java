/*
 * Copyright (c) 2004-2009, Jean-Marc François. All Rights Reserved.
 * Licensed under the New BSD license.  See the LICENSE file.
 */
package jahmm.observables;

/**
 * Creates a centroid for type <O>. Used by the k-means algorithm.
 *
 * @param <O>
 */
public interface CentroidFactory<O> {

    /**
     *
     * @return @throws java.lang.CloneNotSupportedException
     */
    public Centroid<O> factor() throws CloneNotSupportedException;
}
