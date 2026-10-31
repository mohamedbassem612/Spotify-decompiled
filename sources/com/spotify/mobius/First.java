package com.spotify.mobius;

import com.spotify.mobius.internal_util.ImmutableUtil;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class First<M, F> {
    public static First b(Object obj) {
        ImmutableUtil.a();
        return new AutoValue_First(obj, Collections.EMPTY_SET);
    }

    public static First c(Object obj, Set set) {
        return new AutoValue_First(obj, set);
    }

    public abstract Set a();

    public abstract Object d();
}
