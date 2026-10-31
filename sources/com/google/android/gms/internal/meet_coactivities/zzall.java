package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import p.b380;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzall {
    private List zza;
    private int zzb;
    private int zzc;

    public zzall(List list) {
        this.zza = list == null ? Collections.EMPTY_LIST : list;
    }

    public final int zza() {
        List list = this.zza;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final zzvz zzb() {
        if (zzg()) {
            return ((zzxn) this.zza.get(this.zzb)).zza();
        }
        eg.m("Index is off the end of the address group list");
        return null;
    }

    public final SocketAddress zzc() {
        if (zzg()) {
            return (SocketAddress) ((zzxn) this.zza.get(this.zzb)).zzb().get(this.zzc);
        }
        eg.m("Index is past the end of the address group list");
        return null;
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zze(b380 b380Var) {
        if (b380Var == null) {
            b380Var = Collections.EMPTY_LIST;
        }
        this.zza = b380Var;
        zzd();
    }

    public final boolean zzf() {
        if (!zzg()) {
            return false;
        }
        zzxn zzxnVar = (zzxn) this.zza.get(this.zzb);
        int i = this.zzc + 1;
        this.zzc = i;
        if (i < zzxnVar.zzb().size()) {
            return true;
        }
        int i2 = this.zzb + 1;
        this.zzb = i2;
        this.zzc = 0;
        return i2 < this.zza.size();
    }

    public final boolean zzg() {
        return this.zzb < this.zza.size();
    }

    public final boolean zzh(SocketAddress socketAddress) {
        for (int i = 0; i < this.zza.size(); i++) {
            int iIndexOf = ((zzxn) this.zza.get(i)).zzb().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.zzb = i;
                this.zzc = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
