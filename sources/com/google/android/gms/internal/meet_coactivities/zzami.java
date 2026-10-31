package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p.i0c1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzami {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Runnable zzc;
    private final i0c1 zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzami(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, i0c1 i0c1Var) {
        this.zzc = runnable;
        this.zzb = executor;
        this.zza = scheduledExecutorService;
        this.zzd = i0c1Var;
        i0c1Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzk() {
        i0c1 i0c1Var = this.zzd;
        if (i0c1Var.a) {
            return System.nanoTime() - i0c1Var.b;
        }
        return 0L;
    }

    public final void zzh(boolean z) {
        ScheduledFuture scheduledFuture;
        this.zzf = false;
        if (!z || (scheduledFuture = this.zzg) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.zzg = null;
    }

    public final void zzi(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long jZzk = zzk() + nanos;
        this.zzf = true;
        if (jZzk - this.zze < 0 || this.zzg == null) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzg = this.zza.schedule(new zzamh(this, null), nanos, TimeUnit.NANOSECONDS);
        }
        this.zze = jZzk;
    }
}
