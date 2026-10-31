package com.google.android.gms.internal.meet_coactivities;

import p.b380;
import p.bym1;
import p.ipo1;
import p.iti1;
import p.lxo1;
import p.qgn1;
import p.rvg;
import p.y2g1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzkf implements zzkm {
    public /* synthetic */ zzkf(zzke zzkeVar) {
    }

    public static zzkf zzc() {
        return zzkd.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final rvg zza(zzqi zzqiVar) {
        bym1 bym1VarA = rvg.a();
        if (zzqiVar.zzh()) {
            zzqa zzqaVarZza = zzqiVar.zza();
            iti1 iti1VarA = ipo1.a();
            iti1VarA.e(zzqaVarZza.zza());
            iti1VarA.f(b380.q((lxo1[]) zzqaVarZza.zze().stream().map(new zzka(this)).toArray(new zzkb())));
            bym1VarA.j(iti1VarA.g());
        }
        if (zzqiVar.zzj()) {
            zzqw zzqwVarZze = zzqiVar.zze();
            y2g1 y2g1VarA = qgn1.a();
            y2g1VarA.a(zzqwVarZze.zze());
            y2g1VarA.b(zzqwVarZze.zza());
            bym1VarA.m(y2g1VarA.c());
        }
        return bym1VarA.p();
    }

    public final zzqi zzd(rvg rvgVar) {
        zzqh zzqhVarZzb = zzqi.zzb();
        ipo1 ipo1VarB = rvgVar.b();
        if (ipo1VarB != null) {
            zzpz zzpzVarZzb = zzqa.zzb();
            zzpzVarZzb.zzb(ipo1VarB.b());
            ipo1VarB.c().forEach(new zzkc(this, zzpzVarZzb));
            zzqhVarZzb.zza(zzpzVarZzb.zzk());
        }
        qgn1 qgn1VarC = rvgVar.c();
        if (qgn1VarC != null) {
            zzqv zzqvVarZzb = zzqw.zzb();
            zzqvVarZzb.zza(qgn1VarC.b());
            zzqvVarZzb.zzb(qgn1VarC.c());
            zzqhVarZzb.zzb(zzqvVarZzb.zzk());
        }
        return zzqhVarZzb.zzk();
    }

    private zzkf() {
        throw null;
    }
}
