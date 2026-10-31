package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Consumer;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzef implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = zzfa.zzc;
        dm5.z(!((zzil) obj).zzb().zzk(), "Unexpected call to `unRegisterMeetingStatusListener` after calling `verifyRecordingInfo` before connecting to the meeting.");
    }
}
