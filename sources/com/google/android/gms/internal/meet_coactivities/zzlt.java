package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import p.dv20;
import p.eg;
import p.rjx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class zzlt {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    private zzlt(String str, Class cls, boolean z, boolean z2) {
        zzpj.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        this.zzd = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.zze = j;
    }

    public static zzlt zzd(String str, Class cls) {
        return new zzlt(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return rjx.o(dv20.g(name, "/"), this.zza, "[", cls.getName(), "]");
    }

    public void zza(Iterator it, zzls zzlsVar) {
        while (it.hasNext()) {
            zzb(it.next(), zzlsVar);
        }
    }

    public void zzb(Object obj, zzls zzlsVar) {
        zzlsVar.zza(this.zza, obj);
    }

    public final long zzc() {
        return this.zze;
    }

    public final Object zze(Object obj) {
        return this.zzb.cast(obj);
    }

    public final String zzf() {
        return this.zza;
    }

    public final void zzg(Object obj, zzls zzlsVar) {
        if (!this.zzd || zzns.zza() <= 20) {
            zzb(obj, zzlsVar);
        } else {
            zzlsVar.zza(this.zza, obj);
        }
    }

    public final void zzh(Iterator it, zzls zzlsVar) {
        if (!this.zzc) {
            eg.m("non repeating key");
        } else if (!this.zzd || zzns.zza() <= 20) {
            zza(it, zzlsVar);
        } else {
            while (it.hasNext()) {
                zzlsVar.zza(this.zza, it.next());
            }
        }
    }

    public final boolean zzi() {
        return this.zzc;
    }

    public zzlt(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
