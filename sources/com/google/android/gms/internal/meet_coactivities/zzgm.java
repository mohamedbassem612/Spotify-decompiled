package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import p.dm5;
import p.fug;
import p.hug;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzgm extends zzhu implements fug, zzhe {
    public zzgm(zzhw zzhwVar) {
        super(zzhwVar);
    }

    public final void setGlobalState(final hug hugVar) {
        dm5.s(hugVar, "Expected 'newGlobalState' to be provided.");
        dm5.x("Blob size cannot be greater than %s bytes.", 16384, zzjz.zzd(hugVar).zzd().zzd() <= 16384);
        zze(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzgl
            @Override // java.util.function.Supplier
            public final Object get() {
                zzjo zzjoVar = (zzjo) this.zza.zzc;
                final hug hugVar2 = hugVar;
                return zzjoVar.zza(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgk
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return zzjz.zzd(hugVar2);
                    }
                });
            }
        });
    }
}
