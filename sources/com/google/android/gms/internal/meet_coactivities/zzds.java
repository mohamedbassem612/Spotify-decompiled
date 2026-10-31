package com.google.android.gms.internal.meet_coactivities;

import java.util.Optional;
import java.util.function.Supplier;
import p.qvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzds implements Supplier {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ qvg zzb;
    public final /* synthetic */ Optional zzc;

    public /* synthetic */ zzds(zzfa zzfaVar, qvg qvgVar, Optional optional) {
        this.zza = zzfaVar;
        this.zzc = optional;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.zza.zzj((qvg) null, this.zzc);
    }
}
