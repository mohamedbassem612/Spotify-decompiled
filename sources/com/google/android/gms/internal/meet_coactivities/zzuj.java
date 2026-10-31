package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Map;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzuj implements zzur {
    private final zzuf zza;
    private final zzvf zzb;
    private final boolean zzc;
    private final zzsl zzd;

    private zzuj(zzvf zzvfVar, zzsl zzslVar, zzuf zzufVar) {
        this.zzb = zzvfVar;
        this.zzc = zzufVar instanceof zzsv;
        this.zzd = zzslVar;
        this.zza = zzufVar;
    }

    public static zzuj zzc(zzvf zzvfVar, zzsl zzslVar, zzuf zzufVar) {
        return new zzuj(zzvfVar, zzslVar, zzufVar);
    }

    public final int zza(Object obj) {
        int iZzb = ((zzsz) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzsv) obj).zzb.zzd() : iZzb;
    }

    public final int zzb(Object obj) {
        int iHashCode = ((zzsz) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzsv) obj).zzb.zza.hashCode() : iHashCode;
    }

    public final Object zze() {
        zzsz zzszVar = this.zza;
        return zzszVar instanceof zzsz ? zzszVar.zzD() : zzszVar.zzR().zzm();
    }

    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzut.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzut.zzp(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzuq zzuqVar, zzsk zzskVar) {
        this.zzb.zza(obj);
        throw null;
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzrf zzrfVar) {
        zzsz zzszVar = (zzsz) obj;
        if (zzszVar.zzc == zzvg.zzc()) {
            zzszVar.zzc = zzvg.zzf();
        }
        throw null;
    }

    public final void zzj(Object obj, zzvs zzvsVar) {
        Iterator itZzf = ((zzsv) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzso zzsoVar = (zzso) entry.getKey();
            if (zzsoVar.zzc() != zzvr.MESSAGE || zzsoVar.zze() || zzsoVar.zzd()) {
                eg.m("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof zztm) {
                zzvsVar.zzx(zzsoVar.zza(), ((zztm) entry).zza().zzb());
            } else {
                zzvsVar.zzx(zzsoVar.zza(), entry.getValue());
            }
        }
        ((zzsz) obj).zzc.zzk(zzvsVar);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzsz) obj).zzc.equals(((zzsz) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzsv) obj).zzb.equals(((zzsv) obj2).zzb);
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return ((zzsv) obj).zzb.zzj();
    }
}
