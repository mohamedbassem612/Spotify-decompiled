package com.spotify.carmobile.wazesdk.navigation;

import android.content.Context;
import android.content.Intent;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.l2p;
import p.o2b1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/carmobile/wazesdk/navigation/WazeWakeUpReceiver;", "Lp/l2p;", "<init>", "()V", "src_main_java_com_spotify_carmobile_wazesdk-wazesdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class WazeWakeUpReceiver extends l2p {
    public o2b1 b;

    public final void b(Context context, Intent intent) {
        o2b1 o2b1Var = this.b;
        if (o2b1Var != null) {
            o2b1Var.i("com.spotify.music.internal.waze.WAKE_BY_MBS");
        } else {
            u890.C("wazeLauncher");
            throw null;
        }
    }
}
