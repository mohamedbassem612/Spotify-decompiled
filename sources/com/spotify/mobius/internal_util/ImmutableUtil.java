package com.spotify.mobius.internal_util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class ImmutableUtil {
    public static void a() {
        Set set = Collections.EMPTY_SET;
    }

    public static Set b(Set set) {
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return Collections.unmodifiableSet(new HashSet(set));
    }
}
