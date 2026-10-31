package com.spotify.music.alarmlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.cfd;
import p.e4b1;
import p.l2p;
import p.t961;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/music/alarmlauncher/SpotifyAlarmLauncherReceiver;", "Lp/l2p;", "<init>", "()V", "src_main_java_com_spotify_music_alarmlauncher-alarmlauncher"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class SpotifyAlarmLauncherReceiver extends l2p {
    public e4b1 b;

    public final void b(Context context, Intent intent) {
        Bundle extras;
        Logger.g("SpotifyAlarmLauncherReceiver received an intent.", new Object[0]);
        e4b1 e4b1Var = this.b;
        if (e4b1Var == null) {
            u890.C("delegate");
            throw null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 30 || (extras = intent.getExtras()) == null) {
            return;
        }
        cfd cfdVar = (cfd) e4b1Var.b;
        extras.putString("com.spotify.music.extra.INTENT_SOURCE", "SpotifyAlarmLauncherReceiver");
        Context context2 = (Context) cfdVar.b;
        Intent intent2 = new Intent(context2, (Class<?>) SpotifyAlarmLauncherService.class);
        intent2.putExtras(extras);
        if (i >= 26) {
            ((t961) cfdVar.c).a(context2, intent2);
        } else {
            context2.startService(intent2);
        }
    }
}
