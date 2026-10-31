package com.google.android.gms.internal.meet_coactivities;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzalp extends zzzc {
    final /* synthetic */ zzalr zza;
    private final zzalr zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzalp(zzalr zzalrVar, zzalr zzalrVar2) {
        this.zza = zzalrVar;
        dm5.s(zzalrVar2, "pickFirstLeafLoadBalancer");
        this.zzb = zzalrVar2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzc
    public final zzyw zza(zzyx zzyxVar) {
        if (this.zzc.compareAndSet(false, true)) {
            zzabm zzabmVarZzb = this.zza.zzf.zzb();
            final zzalr zzalrVar = this.zzb;
            Objects.requireNonNull(zzalrVar);
            zzabmVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzalo
                @Override // java.lang.Runnable
                public final void run() {
                    zzalrVar.zzd();
                }
            });
            zzabmVarZzb.zzb();
        }
        return zzyw.zzc();
    }
}
