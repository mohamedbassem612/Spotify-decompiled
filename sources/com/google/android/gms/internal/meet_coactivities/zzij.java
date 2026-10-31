package com.google.android.gms.internal.meet_coactivities;

import p.h380;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzij implements zzig {
    private static final j380 zza;

    static {
        h380 h380VarA = j380.a();
        h380VarA.e(845714248040L, "youtube");
        h380VarA.e(523214873043L, "youtube-music");
        h380VarA.e(583859152812L, "testapp");
        h380VarA.e(32147523519L, "samsung-notes");
        h380VarA.e(878579687799L, "kahoot");
        h380VarA.e(135083966748L, "spotify");
        zza = h380VarA.b(true);
    }

    public /* synthetic */ zzij(zzii zziiVar) {
    }

    public static zzij zzb() {
        return zzih.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzig
    public final String zza(long j) {
        Object obj = zza.get(Long.valueOf(j));
        if (obj == null) {
            obj = "";
        }
        return (String) obj;
    }

    private zzij() {
        throw null;
    }
}
