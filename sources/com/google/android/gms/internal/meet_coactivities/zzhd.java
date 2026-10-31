package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import p.fc11;
import p.qvg;
import p.svg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzhd implements zzib {
    private final qvg zza;
    private final Executor zzb;

    private zzhd(qvg qvgVar, Executor executor) {
        this.zzb = executor;
    }

    public static zzhd zza(qvg qvgVar, Executor executor) {
        return new zzhd(qvgVar, executor);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzib
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final svg svgVar = (svg) obj;
        zzia.zza(fc11.i0(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzhc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(svgVar);
            }
        }, this.zzb), "Failed to apply state.", new Object[0]);
    }

    public final /* synthetic */ void zzc(svg svgVar) {
        throw null;
    }
}
