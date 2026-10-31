package com.google.android.gms.internal.meet_coactivities;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaad {
    private static zzaad zza;

    public zzaad() {
        new HashSet();
    }

    public static synchronized zzaad zza() {
        zzaad zzaadVar;
        zzaadVar = zza;
        if (zzaadVar == null) {
            zzaadVar = new zzaad();
            zza = zzaadVar;
        }
        return zzaadVar;
    }
}
