package com.google.android.gms.internal.meet_coactivities;

import j$.time.Duration;
import p.pvg;
import p.rvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
interface zzif extends pvg, zzhe {
    /* synthetic */ void notifyBuffering(Duration duration);

    /* synthetic */ void notifyEnded(Duration duration);

    /* synthetic */ void notifyPauseState(boolean z, Duration duration);

    /* synthetic */ void notifyPlayoutRate(double d, Duration duration);

    /* synthetic */ void notifyQueueUpdate(rvg rvgVar);

    /* synthetic */ void notifyReady(Duration duration);

    /* synthetic */ void notifySeekToTimestamp(Duration duration);

    /* synthetic */ void notifySwitchedToMedia(String str, String str2, Duration duration);

    @Override // p.pvg
    /* synthetic */ void notifySwitchedToMedia(String str, String str2, Duration duration, rvg rvgVar);
}
