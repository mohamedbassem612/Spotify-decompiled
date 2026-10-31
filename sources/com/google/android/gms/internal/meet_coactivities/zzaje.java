package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaje implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzakp zza;

    public zzaje(zzakp zzakpVar) {
        this.zza = zzakpVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzakp.zza.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", f4i1.f("[", String.valueOf(this.zza.zzc()), "] Uncaught exception in the SynchronizationContext. Panic!"), th);
        this.zza.zzV(th);
    }
}
