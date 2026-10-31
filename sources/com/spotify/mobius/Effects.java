package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Effects {
    public static HashSet a(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Preconditions.a(objArr);
        Collections.addAll(hashSet, objArr);
        return hashSet;
    }
}
