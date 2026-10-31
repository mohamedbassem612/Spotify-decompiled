package com.spotify.cosmos.p000servicebasedrouter;

import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$NullResolveCallback;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$SubscriptionResolveCallback;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "", "requestUri", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;Ljava/lang/String;)V", "Lcom/spotify/cosmos/cosmos/Response;", "response", "Lp/rih1;", "onResolved", "(Lcom/spotify/cosmos/cosmos/Response;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "", "getId", "()I", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RemoteNativeRouter$NullResolveCallback extends RemoteNativeRouter.SubscriptionResolveCallback {
    final /* synthetic */ RemoteNativeRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteNativeRouter$NullResolveCallback(RemoteNativeRouter remoteNativeRouter, String str) {
        super(remoteNativeRouter, (ResolverCallbackReceiver) null, str);
        this.this$0 = remoteNativeRouter;
    }

    public int getId() {
        return RemoteNativeRouter.Companion.getINVALID_SUBSCRIPTION_ID();
    }

    public void onError(Throwable throwable) {
    }

    public void onResolved(Response response) {
    }
}
