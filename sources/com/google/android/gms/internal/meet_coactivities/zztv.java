package com.google.android.gms.internal.meet_coactivities;

import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zztv implements zzud {
    private final zzud[] zza;

    public zztv(zzud... zzudVarArr) {
        this.zza = zzudVarArr;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final zzuc zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzud zzudVar = this.zza[i];
            if (zzudVar.zzc(cls)) {
                return zzudVar.zzb(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
