package com.google.android.gms.internal.meet_coactivities;

import p.f4i1;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zzoz {
    private final int zza;
    private final zzmj zzb;

    public zzoz(zzmj zzmjVar, int i) {
        if (zzmjVar == null) {
            hhg1.n("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            hhg1.n(f4i1.c(i, "invalid index: "));
            throw null;
        }
        this.zza = i;
        this.zzb = zzmjVar;
    }

    public abstract void zzb(zzpa zzpaVar, Object obj);

    public final int zzc() {
        return this.zza;
    }

    public final zzmj zzd() {
        return this.zzb;
    }

    public final void zze(zzpa zzpaVar, Object[] objArr) {
        int i = this.zza;
        if (i >= objArr.length) {
            zzpaVar.zzf();
            return;
        }
        Object obj = objArr[i];
        if (obj != null) {
            zzb(zzpaVar, obj);
        } else {
            zzpaVar.zzg();
        }
    }
}
