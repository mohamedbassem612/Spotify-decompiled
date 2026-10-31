package com.google.android.gms.internal.meet_coactivities;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.Executor;
import p.fc11;
import p.gug;
import p.hug;
import p.jsd0;
import p.nne;
import p.u350;
import p.z2p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzgo implements zzib {
    private final gug zza;
    private final Executor zzb;

    private zzgo(gug gugVar, Executor executor) {
        this.zza = gugVar;
        this.zzb = executor;
    }

    public static zzgo zza(gug gugVar, Executor executor) {
        return new zzgo(gugVar, executor);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzib
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final hug hugVar = (hug) obj;
        zzia.zza(fc11.i0(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzgn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(hugVar);
            }
        }, this.zzb), "Failed to apply state.", new Object[0]);
    }

    public final void zzc(hug hugVar) {
        u350 u350Var = this.zza;
        u350Var.getClass();
        Logger.b("[LiveSharing] Received coDoingState within live-sharing session:" + hugVar + ".", new Object[0]);
        u350Var.a.d(new jsd0(new String(((z2p1) hugVar).a, nne.a)));
    }
}
