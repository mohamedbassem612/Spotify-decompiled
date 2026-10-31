package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzos implements Iterator {
    final /* synthetic */ zzot zza;
    private int zzb = 0;

    public zzos(zzot zzotVar) {
        this.zza = zzotVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzot zzotVar = this.zza;
        return i < zzotVar.zza() - zzotVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zzb;
        zzot zzotVar = this.zza;
        if (i >= zzotVar.zza() - zzotVar.zzb()) {
            hhg1.k();
            return null;
        }
        zzot zzotVar2 = this.zza;
        Object obj = zzou.zzc(zzotVar2.zzb)[zzotVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
