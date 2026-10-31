package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzyc {
    private Object zza;

    public /* synthetic */ zzyc(zzyb zzybVar) {
    }

    public final zzyc zza(Object obj) {
        dm5.s(obj, "config");
        this.zza = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzye zzb() {
        dm5.z(this.zza != null, "config is not set");
        return new zzye(zzabe.zza, this.zza, null, 0 == true ? 1 : 0);
    }

    private zzyc() {
        throw null;
    }
}
