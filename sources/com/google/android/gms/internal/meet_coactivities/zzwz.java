package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzwz {
    private static zzwz zza;
    private final List zzb = Collections.EMPTY_LIST;

    public static synchronized zzwz zza() {
        zzwz zzwzVar;
        zzwzVar = zza;
        if (zzwzVar == null) {
            zzwzVar = new zzwz();
            zza = zzwzVar;
        }
        return zzwzVar;
    }

    public final synchronized List zzb() {
        return this.zzb;
    }

    public final synchronized boolean zzc() {
        return false;
    }
}
