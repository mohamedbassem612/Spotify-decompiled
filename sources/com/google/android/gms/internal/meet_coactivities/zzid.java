package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p.dmd0;
import p.ekm0;
import p.fkm0;
import p.gkm0;
import p.u8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzid {
    private final ScheduledFuture zza;

    private zzid(u8d0 u8d0Var) {
        this.zza = u8d0Var;
    }

    public static zzid zza(zzgg zzggVar, final Runnable runnable, dmd0 dmd0Var) {
        if (zzggVar.zzd()) {
            return new zzid(null);
        }
        Runnable runnable2 = new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzic
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    zzia.zze(e);
                }
            }
        };
        long millis = zzggVar.zza().toMillis();
        long millis2 = zzggVar.zza().toMillis();
        gkm0 gkm0Var = (gkm0) dmd0Var;
        gkm0Var.getClass();
        fkm0 fkm0Var = new fkm0(runnable2);
        return new zzid(new ekm0(fkm0Var, gkm0Var.b.scheduleAtFixedRate(fkm0Var, millis, millis2, TimeUnit.MILLISECONDS)));
    }

    public final void zzb() {
        ScheduledFuture scheduledFuture = this.zza;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
