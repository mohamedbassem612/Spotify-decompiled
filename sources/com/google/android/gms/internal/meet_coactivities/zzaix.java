package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.Logger;
import p.dhe1;
import p.dm5;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaix implements Runnable {
    private static final Logger zza = Logger.getLogger(zzaix.class.getName());
    private final Runnable zzb;

    public zzaix(Runnable runnable) {
        dm5.s(runnable, "task");
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(String.valueOf(this.zzb)), th);
            Object obj = dhe1.a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            eg.f(th);
        }
    }

    public final String toString() {
        return f4i1.f("LogExceptionRunnable(", String.valueOf(this.zzb), ")");
    }
}
