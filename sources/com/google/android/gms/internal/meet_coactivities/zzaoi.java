package com.google.android.gms.internal.meet_coactivities;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaoi implements Executor, Runnable {
    private static final Logger zza = Logger.getLogger(zzaoi.class.getName());
    private static final zzaod zzb;
    private final Executor zzc;
    private final Queue zzd = new ConcurrentLinkedQueue();
    private volatile int zze = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        zzaod zzaohVar;
        Object[] objArr = 0;
        try {
            zzaohVar = new zzaof(AtomicIntegerFieldUpdater.newUpdater(zzaoi.class, "zze"), null);
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            zzaohVar = new zzaoh(objArr == true ? 1 : 0);
        }
        zzb = zzaohVar;
    }

    public zzaoi(Executor executor) {
        dm5.s(executor, "'executor' must not be null.");
        this.zzc = executor;
    }

    private final void zzc(Runnable runnable) {
        if (zzb.zzb(this, 0, -1)) {
            try {
                this.zzc.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.zzd.remove(runnable);
                }
                zzb.zza(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dm5.s(runnable, "'r' must not be null.");
        this.zzd.add(runnable);
        zzc(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.zzc;
            while (executor == this.zzc && (runnable = (Runnable) this.zzd.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", "Exception while executing runnable " + runnable.toString(), (Throwable) e);
                }
            }
            zzb.zza(this, 0);
            if (this.zzd.isEmpty()) {
                return;
            }
            zzc(null);
        } catch (Throwable th) {
            zzb.zza(this, 0);
            throw th;
        }
    }
}
