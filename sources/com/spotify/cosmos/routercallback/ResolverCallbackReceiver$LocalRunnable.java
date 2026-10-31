package com.spotify.cosmos.routercallback;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver$LocalRunnable;", "Ljava/lang/Runnable;", "response", "<init>", "(Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;Ljava/lang/Object;)V", "Lp/rih1;", "run", "()V", "Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResolverCallbackReceiver$LocalRunnable implements Runnable {
    private final T response;
    final /* synthetic */ ResolverCallbackReceiver<T> this$0;

    public ResolverCallbackReceiver$LocalRunnable(ResolverCallbackReceiver resolverCallbackReceiver, T t) {
        this.this$0 = resolverCallbackReceiver;
        this.response = t;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.this$0.onResolved(this.response);
    }
}
