package com.google.android.gms.internal.meet_coactivities;

import p.dm5;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzyt extends zzzc {
    private final zzyw zza;

    public zzyt(zzyw zzywVar) {
        dm5.s(zzywVar, "result");
        this.zza = zzywVar;
    }

    public final String toString() {
        return f4i1.f("FixedResultPicker(", String.valueOf(this.zza), ")");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzc
    public final zzyw zza(zzyx zzyxVar) {
        return this.zza;
    }
}
