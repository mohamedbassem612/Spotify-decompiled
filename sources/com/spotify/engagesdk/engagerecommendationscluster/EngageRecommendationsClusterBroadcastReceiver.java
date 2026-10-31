package com.spotify.engagesdk.engagerecommendationscluster;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import p.j6y;
import p.l2p;
import p.r0z0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/engagesdk/engagerecommendationscluster/EngageRecommendationsClusterBroadcastReceiver;", "Lp/l2p;", "<init>", "()V", "src_main_java_com_spotify_engagesdk_engagerecommendationscluster-engagerecommendationscluster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EngageRecommendationsClusterBroadcastReceiver extends l2p {
    public r0z0 b;
    public j6y c;

    @Override // p.l2p
    public final void b(Context context, Intent intent) {
        r0z0 r0z0Var = this.b;
        if (r0z0Var == null) {
            u890.C("publishingScheduler");
            throw null;
        }
        r0z0Var.a();
        j6y j6yVar = this.c;
        if (j6yVar != null) {
            j6yVar.a();
        } else {
            u890.C("onBroadcastSignInHandlerScheduler");
            throw null;
        }
    }
}
