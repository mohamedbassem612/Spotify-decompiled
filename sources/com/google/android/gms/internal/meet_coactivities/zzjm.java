package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import p.dm5;
import p.h380;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzjm implements zzjv {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/state/ThinCoWatchingUpdateProcessor");
    private final zzjr zzb;
    private final Consumer zzc;
    private final zzgg zzd;
    private final zzip zze;

    public zzjm(zzjr zzjrVar, final Consumer consumer, zzgg zzggVar, zzip zzipVar) {
        dm5.s(zzjrVar, consumer);
        this.zzb = zzjrVar;
        this.zzc = consumer;
        this.zzd = zzggVar;
        this.zze = zzipVar;
        zzipVar.zzb(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzjl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(consumer);
            }
        });
    }

    public final /* synthetic */ void zza(Consumer consumer) {
        consumer.accept((zzqk) this.zzb.zzg().zzb());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjv
    public final void zzb(zzpy zzpyVar) {
        zzqm zzqmVar;
        h380 h380VarA = j380.a();
        Iterator it = zzpyVar.zzg().zzg().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if (iIntValue == 0) {
                zzqmVar = zzqm.INVALID;
            } else if (iIntValue == 1) {
                zzqmVar = zzqm.SWITCH_MEDIA;
            } else if (iIntValue == 2) {
                zzqmVar = zzqm.ALTER_POSITION;
            } else if (iIntValue == 3) {
                zzqmVar = zzqm.ALTER_PLAYBACK_STATE;
            } else if (iIntValue != 4) {
                zzqmVar = iIntValue != 5 ? null : zzqm.ALTER_QUEUE;
            } else {
                zzqmVar = zzqm.ALTER_SPEED;
            }
            if (zzqmVar == null) {
                zzqmVar = zzqm.INVALID;
            }
            h380VarA.e(zzqmVar, (zzqp) entry.getValue());
        }
        zzqk zzqkVarZza = zzpyVar.zzg().zza();
        if (this.zzb.zzh(zzqkVarZza, new zzjf(h380VarA.b(true)), (zzpyVar.zzr() || this.zzd.zzc()) ? 2 : 1) == 2) {
            if (this.zze.zzd()) {
                zza.zzc().zzh("com/google/android/meet/addons/internal/state/ThinCoWatchingUpdateProcessor", "processInboundUpdate", 72, "ThinCoWatchingUpdateProcessor.java").zzo("Application of an update to LSA skipped due to suspension.");
            } else {
                this.zzc.accept(zzqkVarZza);
            }
        }
    }
}
