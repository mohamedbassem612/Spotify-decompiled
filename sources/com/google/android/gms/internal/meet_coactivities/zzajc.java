package com.google.android.gms.internal.meet_coactivities;

import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzajc extends zzzc {
    final /* synthetic */ Throwable zza;
    private final zzyw zzb;

    public zzajc(zzakp zzakpVar, Throwable th) {
        this.zza = th;
        this.zzb = zzyw.zza(zzabe.zzj.zze("Panic! This is a bug!").zzd(th));
    }

    public final String toString() {
        rl1 rl1Var = new rl1("zzajc");
        rl1Var.m(this.zzb, "panicPickResult");
        return rl1Var.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzc
    public final zzyw zza(zzyx zzyxVar) {
        return this.zzb;
    }
}
