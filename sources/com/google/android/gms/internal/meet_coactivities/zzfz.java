package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p.bhn0;
import p.eg;
import p.u02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfz extends zzik {
    private Context zza;
    private zzcf zzb;
    private String zzc;
    private zzp zzd;
    private u02 zze;

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zza(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        bhn0.i("Null activityName");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zzb(u02 u02Var) {
        if (u02Var != null) {
            this.zze = u02Var;
            return this;
        }
        bhn0.i("Null addonSessionHandler");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zzc(Context context) {
        if (context != null) {
            this.zza = context;
            return this;
        }
        bhn0.i("Null appContext");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zzd(zzcf zzcfVar) {
        if (zzcfVar != null) {
            this.zzb = zzcfVar;
            return this;
        }
        bhn0.i("Null ipcManager");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzik zze(zzp zzpVar) {
        if (zzpVar != null) {
            this.zzd = zzpVar;
            return this;
        }
        bhn0.i("Null startInfo");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzik
    public final zzil zzf() {
        zzcf zzcfVar;
        String str;
        zzp zzpVar;
        u02 u02Var;
        Context context = this.zza;
        if (context != null && (zzcfVar = this.zzb) != null && (str = this.zzc) != null && (zzpVar = this.zzd) != null && (u02Var = this.zze) != null) {
            return new zzgb(context, zzcfVar, str, zzpVar, u02Var, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" appContext");
        }
        if (this.zzb == null) {
            sb.append(" ipcManager");
        }
        if (this.zzc == null) {
            sb.append(" activityName");
        }
        if (this.zzd == null) {
            sb.append(" startInfo");
        }
        if (this.zze == null) {
            sb.append(" addonSessionHandler");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
