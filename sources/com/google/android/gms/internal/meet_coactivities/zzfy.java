package com.google.android.gms.internal.meet_coactivities;

import p.bb00;
import p.gvg;
import p.rjx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfy extends zzhw {
    private final zzcf zza;
    private final zzid zzb;
    private final zzjr zzc;
    private final zzjv zzd;
    private final zzgg zze;
    private final zzib zzf;

    public /* synthetic */ zzfy(zzcf zzcfVar, zzid zzidVar, zzjr zzjrVar, zzjv zzjvVar, zzgg zzggVar, zzib zzibVar, zzfx zzfxVar) {
        this.zza = zzcfVar;
        this.zzb = zzidVar;
        this.zzc = zzjrVar;
        this.zzd = zzjvVar;
        this.zze = zzggVar;
        this.zzf = zzibVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhw) {
            zzhw zzhwVar = (zzhw) obj;
            if (this.zza.equals(zzhwVar.zza()) && this.zzb.equals(zzhwVar.zzd()) && this.zzc.equals(zzhwVar.zze()) && this.zzd.equals(zzhwVar.zzf()) && this.zze.equals(zzhwVar.zzb()) && this.zzf.equals(zzhwVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
        return this.zzf.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        zzib zzibVar = this.zzf;
        zzgg zzggVar = this.zze;
        zzjv zzjvVar = this.zzd;
        zzjr zzjrVar = this.zzc;
        zzid zzidVar = this.zzb;
        String string = this.zza.toString();
        String string2 = zzidVar.toString();
        String string3 = zzjrVar.toString();
        String string4 = zzjvVar.toString();
        String string5 = zzggVar.toString();
        String string6 = zzibVar.toString();
        StringBuilder sbN = gvg.n("CoXClientParams{ipcManager=", string, ", heartbeatSchedule=", string2, ", thinLocalState=");
        bb00.j(sbN, string3, ", updateProcessor=", string4, ", config=");
        return rjx.o(sbN, string5, ", handler=", string6, "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhw
    public final zzcf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhw
    public final zzgg zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhw
    public final zzib zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhw
    public final zzid zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhw
    public final zzjr zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhw
    public final zzjv zzf() {
        return this.zzd;
    }
}
