package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaei implements zzaez {
    private final zzaez zza;

    public zzaei(zzaez zzaezVar, zzwa zzwaVar, Executor executor) {
        dm5.s(zzaezVar, "delegate");
        this.zza = zzaezVar;
        dm5.s(executor, "appExecutor");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaez, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaez
    public final zzafa zza(SocketAddress socketAddress, zzaey zzaeyVar, zzwh zzwhVar) {
        return new zzaeh(this, this.zza.zza(socketAddress, zzaeyVar, zzwhVar), zzaeyVar.zzf());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaez
    public final ScheduledExecutorService zzb() {
        return this.zza.zzb();
    }
}
