package com.google.android.gms.internal.meet_coactivities;

import p.mjh1;
import p.t380;
import p.yii0;
import p.zii0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zziz implements zii0 {
    private final t380 zza;

    public zziz(t380 t380Var) {
        this.zza = t380Var;
    }

    @Override // p.zii0
    public final void onMeetingStatusChange(yii0 yii0Var) {
        mjh1 it = this.zza.iterator();
        while (it.hasNext()) {
            ((zii0) it.next()).onMeetingStatusChange(yii0Var);
        }
    }
}
