package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.runners.WorkRunner;
import p.gvg;
import p.rue0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class MessageDispatcher<M> implements Consumer<M>, Disposable {
    public final WorkRunner a;
    public final Consumer b;
    public volatile boolean c = false;

    public MessageDispatcher(WorkRunner workRunner, Consumer consumer) {
        this.a = workRunner;
        this.b = consumer;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(final Object obj) {
        if (this.c) {
            return;
        }
        this.a.post(new Runnable() { // from class: com.spotify.mobius.a
            @Override // java.lang.Runnable
            public final void run() {
                MessageDispatcher messageDispatcher = this.a;
                Object obj2 = obj;
                try {
                    ((DiscardAfterDisposeWrapper) messageDispatcher.b).accept(obj2);
                } catch (Throwable th) {
                    RuntimeException runtimeException = new RuntimeException(gvg.g(obj2, "Consumer threw an exception when accepting message: "), th);
                    rue0 rue0Var = MobiusHooks.a;
                    synchronized (MobiusHooks.class) {
                        MobiusHooks.b.a(runtimeException);
                    }
                }
            }
        });
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.c = true;
        this.a.dispose();
    }
}
