package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzwc {
    private final String zza;
    private final Object zzb = null;

    private zzwc(String str, Object obj) {
        this.zza = str;
    }

    public static zzwc zza(String str) {
        dm5.s(str, "debugString");
        return new zzwc(str, null);
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzwc zzwcVar) {
        Object obj = zzwcVar.zzb;
        return null;
    }

    public final String toString() {
        return this.zza;
    }
}
