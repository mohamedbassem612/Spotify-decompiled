package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaia {
    private final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final zzaia zza(Object obj) {
        this.zza.add(String.valueOf(obj));
        return this;
    }

    public final zzaia zzb(String str, Object obj) {
        this.zza.add(xcg1.i(str, "=", String.valueOf(obj)));
        return this;
    }
}
