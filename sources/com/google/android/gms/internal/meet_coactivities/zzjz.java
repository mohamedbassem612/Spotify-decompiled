package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.hug;
import p.z2p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzjz implements zzkm {
    public /* synthetic */ zzjz(zzjy zzjyVar) {
    }

    public static zzjz zzb() {
        return zzjx.zza;
    }

    public static final hug zzc(zzqe zzqeVar) {
        byte[] bArrZzn = zzqeVar.zzd().zzn();
        if (bArrZzn != null) {
            return new z2p1(bArrZzn);
        }
        bhn0.i("Null state");
        return null;
    }

    public static final zzqe zzd(hug hugVar) {
        zzqd zzqdVarZza = zzqe.zza();
        byte[] bArr = ((z2p1) hugVar).a;
        zzqdVarZza.zza(zzrr.zzk(bArr, 0, bArr.length));
        return (zzqe) zzqdVarZza.zzk();
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        return zzc((zzqe) obj);
    }

    private zzjz() {
        throw null;
    }
}
