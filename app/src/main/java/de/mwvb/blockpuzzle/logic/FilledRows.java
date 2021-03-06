package de.mwvb.blockpuzzle.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.mwvb.blockpuzzle.entity.QPosition;

public class FilledRows {
    private final List<Integer> ylist = new ArrayList<>();
    private final List<Integer> xlist = new ArrayList<>();
    /** blocks that must not be cleared */
    private final Set<QPosition> exclusions = new HashSet<>();

    public List<Integer> getYlist() {
        return ylist;
    }

    public List<Integer> getXlist() {
        return xlist;
    }

    public int getHits() {
        return ylist.size() + xlist.size();
    }

    public boolean containsX(Integer x) {
        return xlist.contains(x);
    }

    public boolean containsY(Integer y) {
        return ylist.contains(y);
    }

    public Set<QPosition> getExclusions() {
        return exclusions;
    }
}
