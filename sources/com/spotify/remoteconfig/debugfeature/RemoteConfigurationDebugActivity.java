package com.spotify.remoteconfig.debugfeature;

import android.R;
import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.dg30;
import p.h021;
import p.nu9;
import p.tg30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/remoteconfig/debugfeature/RemoteConfigurationDebugActivity;", "Lp/dg30;", "<init>", "()V", "src_main_java_com_spotify_remoteconfig_debugfeature-debugfeature"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class RemoteConfigurationDebugActivity extends dg30 {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nu9 nu9Var = new nu9(((tg30) ((dg30) this).U0.b).g);
        nu9Var.k(R.id.content, new h021(), (String) null, 1);
        nu9Var.f();
    }
}
