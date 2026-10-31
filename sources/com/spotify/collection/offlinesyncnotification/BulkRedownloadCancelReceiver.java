package com.spotify.collection.offlinesyncnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.Empty;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p.bm0;
import p.f3p;
import p.fcc;
import p.j1e1;
import p.nm;
import p.sl10;
import p.u890;
import p.vpp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/collection/offlinesyncnotification/BulkRedownloadCancelReceiver;", "Lp/f3p;", "<init>", "()V", "src_main_java_com_spotify_collection_offlinesyncnotification-offlinesyncnotification"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BulkRedownloadCancelReceiver extends f3p {
    public vpp0 a;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onReceive(Context context, Intent intent) {
        j1e1.s(this, context);
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        vpp0 vpp0Var = this.a;
        if (vpp0Var != null) {
            vpp0Var.callSingle("spotify.offline_esperanto.proto.Offline", "BulkRedownloadCancel", Empty.n()).map(sl10.V0).timeout(5L, TimeUnit.SECONDS).doFinally(new bm0(context, pendingResultGoAsync, (byte) 13)).subscribe(nm.e1, fcc.b);
        } else {
            u890.C("offlineClient");
            throw null;
        }
    }
}
