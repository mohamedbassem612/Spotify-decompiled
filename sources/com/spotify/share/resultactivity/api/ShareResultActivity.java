package com.spotify.share.resultactivity.api;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.gj5;
import p.j1e1;
import p.s6z0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/share/resultactivity/api/ShareResultActivity;", "Lp/gj5;", "<init>", "()V", "src_main_java_com_spotify_share_resultactivity_api-api"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ShareResultActivity extends gj5 {
    public s6z0 a1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        j1e1.q(this);
        super/*p.dg30*/.onCreate(bundle);
        s6z0 s6z0Var = this.a1;
        if (s6z0Var == null) {
            u890.C("resultLogger");
            throw null;
        }
        s6z0Var.d(getIntent());
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        s6z0 s6z0Var = this.a1;
        if (s6z0Var == null) {
            u890.C("resultLogger");
            throw null;
        }
        s6z0Var.d(intent);
        finish();
    }
}
