package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import java.util.Optional;
import p.gug;
import p.h0s0;
import p.i02;
import p.j02;
import p.n8d0;
import p.p02;
import p.q02;
import p.qvg;
import p.txg;
import p.u02;
import p.zii0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface zzie extends j02 {
    @Override // p.j02
    /* synthetic */ p02 newSessionBuilder(u02 u02Var);

    /* synthetic */ void notifyAddonFailureEvent(Context context, i02 i02Var);

    @Override // p.j02
    /* synthetic */ void registerMeetingStatusListener(Context context, zii0 zii0Var, Optional optional);

    @Override // p.j02
    /* synthetic */ void unregisterMeetingStatusListener(Context context);

    void zzQ(Runnable runnable);

    void zzR();

    void zzS(txg txgVar);

    void zzT(zzrr zzrrVar);

    void zzU(zzrr zzrrVar, h0s0 h0s0Var);

    boolean zzW();

    @Deprecated
    n8d0 zza(gug gugVar, Optional optional);

    @Deprecated
    n8d0 zzb(qvg qvgVar, Optional optional);

    @Deprecated
    n8d0 zzc(Context context, u02 u02Var);

    @Deprecated
    n8d0 zzd();

    n8d0 zzm(Context context, u02 u02Var);

    n8d0 zzn(q02 q02Var);
}
