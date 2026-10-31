package com.google.android.gms.internal.meet_coactivities;

import p.hhg1;
import p.svg;
import p.vbp1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzki implements zzkm {
    private final zzkf zza = zzkd.zza;

    private zzki() {
    }

    public static zzki zzc() {
        return zzkg.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final svg zza(zzqk zzqkVar) {
        vbp1 vbp1VarA = svg.a();
        vbp1VarA.c(zzqkVar.zzg());
        vbp1VarA.d(zzvu.zzb(zzqkVar.zzf()));
        int iZzo = zzqkVar.zzo() - 2;
        int i = 1;
        if (iZzo != 1) {
            i = 2;
            if (iZzo != 2) {
                i = 3;
                if (iZzo != 3) {
                    i = 4;
                    if (iZzo != 4) {
                        hhg1.c();
                        return null;
                    }
                }
            }
        }
        vbp1VarA.f(i);
        double dZza = zzqkVar.zza();
        if (dZza == 0.0d) {
            dZza = 1.0d;
        }
        vbp1VarA.e(dZza);
        vbp1VarA.b(this.zza.zza(zzqkVar.zzb()));
        return vbp1VarA.a();
    }

    public /* synthetic */ zzki(zzkh zzkhVar) {
    }
}
