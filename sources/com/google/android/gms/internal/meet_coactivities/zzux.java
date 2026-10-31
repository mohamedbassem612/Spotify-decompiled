package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Map;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzux implements Iterator {
    final /* synthetic */ zzvb zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzux(zzvb zzvbVar, zzuw zzuwVar) {
        this.zza = zzvbVar;
    }

    private final Iterator zza() {
        Iterator it = this.zzd;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.zza.zzb.entrySet().iterator();
        this.zzd = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb + 1 >= this.zza.zza.size()) {
            return !this.zza.zzb.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        return i < this.zza.zza.size() ? (Map.Entry) this.zza.zza.get(this.zzb) : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            eg.m("remove() was called before next()");
            return;
        }
        this.zzc = false;
        this.zza.zzn();
        if (this.zzb >= this.zza.zza.size()) {
            zza().remove();
            return;
        }
        zzvb zzvbVar = this.zza;
        int i = this.zzb;
        this.zzb = i - 1;
        zzvbVar.zzl(i);
    }
}
