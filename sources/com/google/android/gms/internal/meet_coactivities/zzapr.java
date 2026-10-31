package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.logging.Level;
import p.gvg;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzapr {
    final /* synthetic */ zzapt zza;
    private final Object zzb;
    private final zzze zzc;
    private zzxa zzd = zzxa.CONNECTING;
    private zzzc zze;

    public zzapr(zzapt zzaptVar, Object obj, zzys zzysVar, Object obj2, zzzc zzzcVar) {
        this.zza = zzaptVar;
        this.zzb = obj;
        this.zze = zzzcVar;
        this.zzc = zzysVar.zza(new zzapq(this));
    }

    public final String toString() {
        String string = Arrays.toString(((zzaps) this.zzb).zza);
        String strValueOf = String.valueOf(this.zzd);
        return l1d.q(gvg.n("Address = ", string, ", state = ", strValueOf, ", picker type: "), String.valueOf(this.zze.getClass()), ", lb: ", String.valueOf(this.zzc));
    }

    public final zzxa zza() {
        return this.zzd;
    }

    public final zzzc zzb() {
        return this.zze;
    }

    public final void zzg() {
        this.zzc.zze();
        this.zzd = zzxa.SHUTDOWN;
        zzapt.zzh.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.zzb);
    }
}
