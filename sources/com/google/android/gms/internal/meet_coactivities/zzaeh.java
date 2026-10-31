package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicInteger;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaeh extends zzahm {
    private final zzafa zza;
    private final AtomicInteger zzb = new AtomicInteger(-2147483647);
    private volatile zzabe zzc;

    public zzaeh(zzaei zzaeiVar, zzafa zzafaVar, String str) {
        dm5.s(zzafaVar, "delegate");
        this.zza = zzafaVar;
        dm5.s(str, "authority");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzahm
    public final zzafa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzahm, com.google.android.gms.internal.meet_coactivities.zzaex
    public final zzaeu zzd(zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzwr[] zzwrVarArr) {
        return this.zzb.get() >= 0 ? new zzahh(this.zzc, zzaev.PROCESSED, zzwrVarArr) : this.zza.zzd(zzaacVar, zzzwVar, zzweVar, zzwrVarArr);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzahm, com.google.android.gms.internal.meet_coactivities.zzald
    public final void zzm(zzabe zzabeVar) {
        dm5.s(zzabeVar, "status");
        synchronized (this) {
            try {
                if (this.zzb.get() < 0) {
                    this.zzc = zzabeVar;
                    this.zzb.addAndGet(Integer.MAX_VALUE);
                    if (this.zzb.get() != 0) {
                        return;
                    }
                    super.zzm(zzabeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
