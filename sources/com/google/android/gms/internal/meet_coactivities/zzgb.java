package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p.bb00;
import p.gvg;
import p.l1d;
import p.u02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzgb extends zzil {
    private final Context zza;
    private final zzcf zzb;
    private final String zzc;
    private final zzp zzd;
    private final u02 zze;

    public /* synthetic */ zzgb(Context context, zzcf zzcfVar, String str, zzp zzpVar, u02 u02Var, zzga zzgaVar) {
        this.zza = context;
        this.zzb = zzcfVar;
        this.zzc = str;
        this.zzd = zzpVar;
        this.zze = u02Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzil) {
            zzil zzilVar = (zzil) obj;
            if (this.zza.equals(zzilVar.zza()) && this.zzb.equals(zzilVar.zzc()) && this.zzc.equals(zzilVar.zze()) && this.zzd.equals(zzilVar.zzb()) && this.zze.equals(zzilVar.zzd())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
        return this.zze.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        u02 u02Var = this.zze;
        zzp zzpVar = this.zzd;
        zzcf zzcfVar = this.zzb;
        String string = this.zza.toString();
        String string2 = zzcfVar.toString();
        String string3 = zzpVar.toString();
        String string4 = u02Var.toString();
        StringBuilder sbN = gvg.n("LiveSharingConnection{appContext=", string, ", ipcManager=", string2, ", activityName=");
        bb00.j(sbN, this.zzc, ", startInfo=", string3, ", addonSessionHandler=");
        return l1d.n(string4, "}", sbN);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final zzp zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final zzcf zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final u02 zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzil
    public final String zze() {
        return this.zzc;
    }
}
