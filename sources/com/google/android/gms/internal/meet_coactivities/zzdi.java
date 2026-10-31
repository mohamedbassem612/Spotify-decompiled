package com.google.android.gms.internal.meet_coactivities;

import java.util.Optional;
import java.util.function.Supplier;
import p.gug;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzdi implements Supplier {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ gug zzb;
    public final /* synthetic */ Optional zzc;

    public /* synthetic */ zzdi(zzfa zzfaVar, gug gugVar, Optional optional) {
        this.zza = zzfaVar;
        this.zzb = gugVar;
        this.zzc = optional;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.zza.zzX(this.zzb, this.zzc);
    }
}
