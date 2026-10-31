package com.google.android.gms.internal.meet_coactivities;

import p.b380;
import p.h380;
import p.i8p1;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzde {
    public static final j380 zza;
    public static final j380 zzb;
    public static final b380 zzc;

    static {
        h380 h380VarA = j380.a();
        zzj zzjVar = zzj.HOST_APP_HAM;
        h380VarA.e(zzjVar, 3061514L);
        zzj zzjVar2 = zzj.HOST_APP_MIG;
        h380VarA.e(zzjVar2, 63397229L);
        zzj zzjVar3 = zzj.HOST_APP_DUET;
        h380VarA.e(zzjVar3, 3775507L);
        zzj zzjVar4 = zzj.HOST_APP_FAKE_TACHYON;
        h380VarA.e(zzjVar4, 0L);
        zza = h380VarA.b(true);
        h380 h380VarA2 = j380.a();
        h380VarA2.e(zzjVar, "com.google.android.apps.meetings");
        h380VarA2.e(zzjVar2, "com.google.android.gm");
        h380VarA2.e(zzjVar3, "com.google.android.apps.tachyon");
        h380VarA2.e(zzjVar4, "com.google.android.apps.faketachyon");
        zzb = h380VarA2.b(true);
        Object[] objArr = {zzjVar4, zzjVar3, zzjVar, zzjVar2};
        i8p1.m(objArr);
        zzc = b380.l(4, objArr);
    }
}
