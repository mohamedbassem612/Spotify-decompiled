package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Consumer;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzjk implements zzjv {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/state/ThinCoDoingUpdateProcessor");
    private final zzjr zzb;
    private final Consumer zzc;
    private final zzgg zzd;
    private final zzip zze;

    public zzjk(zzjr zzjrVar, final Consumer consumer, zzgg zzggVar, zzip zzipVar) {
        dm5.s(zzjrVar, consumer);
        this.zzb = zzjrVar;
        this.zzc = consumer;
        this.zzd = zzggVar;
        this.zze = zzipVar;
        zzipVar.zzb(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzjj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(consumer);
            }
        });
    }

    public final /* synthetic */ void zza(Consumer consumer) {
        consumer.accept((zzqe) this.zzb.zzg().zzb());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjv
    public final void zzb(zzpy zzpyVar) {
        zzqe zzqeVarZza = zzpyVar.zzf().zza();
        if (this.zzb.zzh(zzqeVarZza, zzjn.zza, (zzpyVar.zzr() || this.zzd.zzc()) ? 2 : 1) == 2) {
            if (this.zze.zzd()) {
                zza.zzc().zzh("com/google/android/meet/addons/internal/state/ThinCoDoingUpdateProcessor", "processInboundUpdate", 59, "ThinCoDoingUpdateProcessor.java").zzo("Application of an update to LSA skipped due to suspension.");
            } else {
                this.zzc.accept(zzqeVarZza);
            }
        }
    }
}
