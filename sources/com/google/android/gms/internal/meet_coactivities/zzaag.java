package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p.cwl1;
import p.dm5;
import p.eg;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaag {
    private final int zza;
    private final zzaau zzb;
    private final zzabm zzc;
    private final zzaam zzd;
    private final ScheduledExecutorService zze;
    private final zzwh zzf;
    private final Executor zzg;

    public /* synthetic */ zzaag(Integer num, zzaau zzaauVar, zzabm zzabmVar, zzaam zzaamVar, ScheduledExecutorService scheduledExecutorService, zzwh zzwhVar, Executor executor, String str, zzaaf zzaafVar) {
        dm5.s(num, "defaultPort not set");
        this.zza = num.intValue();
        dm5.s(zzaauVar, "proxyDetector not set");
        this.zzb = zzaauVar;
        dm5.s(zzabmVar, "syncContext not set");
        this.zzc = zzabmVar;
        dm5.s(zzaamVar, "serviceConfigParser not set");
        this.zzd = zzaamVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzwhVar;
        this.zzg = executor;
    }

    public static zzaae zzb() {
        return new zzaae();
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.j(this.zza, "defaultPort");
        rl1VarR0.m(this.zzb, "proxyDetector");
        rl1VarR0.m(this.zzc, "syncContext");
        rl1VarR0.m(this.zzd, "serviceConfigParser");
        rl1VarR0.m(this.zze, "scheduledExecutorService");
        rl1VarR0.m(this.zzf, "channelLogger");
        rl1VarR0.m(this.zzg, "executor");
        rl1VarR0.m((Object) null, "overrideAuthority");
        return rl1VarR0.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzaam zzc() {
        return this.zzd;
    }

    public final zzaau zzd() {
        return this.zzb;
    }

    public final zzabm zze() {
        return this.zzc;
    }

    public final Executor zzf() {
        return this.zzg;
    }

    public final ScheduledExecutorService zzg() {
        ScheduledExecutorService scheduledExecutorService = this.zze;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        eg.m("ScheduledExecutorService not set in Builder");
        return null;
    }
}
