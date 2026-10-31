package com.google.android.gms.internal.meet_coactivities;

import p.hhg1;
import p.t02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzkl implements zzkm {
    public /* synthetic */ zzkl(zzkk zzkkVar) {
    }

    public static zzkl zzb() {
        return zzkj.zza;
    }

    public static final t02 zzc(zzam zzamVar) {
        return zzd(zzamVar);
    }

    private static t02 zzd(zzam zzamVar) {
        int iOrdinal = zzamVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return t02.b;
            }
            if (iOrdinal != 2) {
                hhg1.c();
                return null;
            }
        }
        return t02.a;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        return zzd((zzam) obj);
    }

    private zzkl() {
        throw null;
    }
}
