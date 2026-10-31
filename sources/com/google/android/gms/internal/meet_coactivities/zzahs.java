package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzahs implements zzaop {
    @Override // com.google.android.gms.internal.meet_coactivities.zzaop
    public final /* bridge */ /* synthetic */ Object zza() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, zzahx.zzd("grpc-timer-%d", true));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            eg.j(e2);
            return null;
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaop
    public final /* synthetic */ void zzb(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }
}
