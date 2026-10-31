package com.google.android.gms.internal.meet_coactivities;

import p.bb00;
import p.bid0;
import p.dmd0;
import p.gvg;
import p.rjx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zzge extends zzin {
    private final bid0 zza;
    private final dmd0 zzb;
    private final bid0 zzc;
    private final bid0 zzd;
    private final bid0 zze;
    private final bid0 zzf;

    public /* synthetic */ zzge(bid0 bid0Var, dmd0 dmd0Var, bid0 bid0Var2, bid0 bid0Var3, bid0 bid0Var4, bid0 bid0Var5, zzgd zzgdVar) {
        this.zza = bid0Var;
        this.zzb = dmd0Var;
        this.zzc = bid0Var2;
        this.zzd = bid0Var3;
        this.zze = bid0Var4;
        this.zzf = bid0Var5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzin) {
            zzin zzinVar = (zzin) obj;
            if (this.zza.equals(zzinVar.zzd()) && this.zzb.equals(zzinVar.zzf()) && this.zzc.equals(zzinVar.zzb()) && this.zzd.equals(zzinVar.zza()) && this.zze.equals(zzinVar.zze()) && this.zzf.equals(zzinVar.zzc())) {
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
        bid0 bid0Var = this.zzf;
        bid0 bid0Var2 = this.zze;
        bid0 bid0Var3 = this.zzd;
        bid0 bid0Var4 = this.zzc;
        dmd0 dmd0Var = this.zzb;
        String string = this.zza.toString();
        String string2 = dmd0Var.toString();
        String string3 = bid0Var4.toString();
        String string4 = bid0Var3.toString();
        String string5 = bid0Var2.toString();
        String string6 = bid0Var.toString();
        StringBuilder sbN = gvg.n("LiveSharingExecutors{internalExecutor=", string, ", heartbeatExecutor=", string2, ", coWatchingHandlerExecutor=");
        bb00.j(sbN, string3, ", coDoingHandlerExecutor=", string4, ", outgoingIpcExecutor=");
        return rjx.o(sbN, string5, ", incomingIpcExecutor=", string6, "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final bid0 zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final bid0 zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final bid0 zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final bid0 zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final bid0 zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzin
    public final dmd0 zzf() {
        return this.zzb;
    }
}
