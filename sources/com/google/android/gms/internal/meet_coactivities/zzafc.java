package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzafc {
    private ArrayList zza = new ArrayList();
    private volatile zzxa zzb = zzxa.IDLE;

    public final void zza(zzxa zzxaVar) {
        dm5.s(zzxaVar, "newState");
        if (this.zzb == zzxaVar || this.zzb == zzxa.SHUTDOWN) {
            return;
        }
        this.zzb = zzxaVar;
        if (this.zza.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.zza;
        this.zza = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
