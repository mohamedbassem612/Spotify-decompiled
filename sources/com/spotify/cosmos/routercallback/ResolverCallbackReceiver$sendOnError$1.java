package com.spotify.cosmos.routercallback;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class ResolverCallbackReceiver$sendOnError$1 implements Runnable {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ ResolverCallbackReceiver<T> this$0;

    public ResolverCallbackReceiver$sendOnError$1(ResolverCallbackReceiver<T> resolverCallbackReceiver, Throwable th) {
        this.this$0 = resolverCallbackReceiver;
        this.$error = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.this$0.onError(this.$error);
    }
}
