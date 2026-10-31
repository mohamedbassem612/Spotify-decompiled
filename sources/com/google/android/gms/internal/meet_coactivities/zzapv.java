package com.google.android.gms.internal.meet_coactivities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzapv extends zzzc {
    private final List zza;
    private final AtomicInteger zzb;
    private final int zzc;

    public zzapv(List list, AtomicInteger atomicInteger) {
        dm5.n(!list.isEmpty(), "empty list");
        this.zza = list;
        dm5.s(atomicInteger, "index");
        this.zzb = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((zzzc) it.next()).hashCode();
        }
        this.zzc = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzapv)) {
            return false;
        }
        zzapv zzapvVar = (zzapv) obj;
        if (zzapvVar == this) {
            return true;
        }
        return this.zzc == zzapvVar.zzc && this.zzb == zzapvVar.zzb && this.zza.size() == zzapvVar.zza.size() && new HashSet(this.zza).containsAll(zzapvVar.zza);
    }

    public final int hashCode() {
        return this.zzc;
    }

    public final String toString() {
        rl1 rl1Var = new rl1("zzapv");
        rl1Var.m(this.zza, "subchannelPickers");
        return rl1Var.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzc
    public final zzyw zza(zzyx zzyxVar) {
        return ((zzzc) this.zza.get((this.zzb.getAndIncrement() & Integer.MAX_VALUE) % this.zza.size())).zza(zzyxVar);
    }
}
