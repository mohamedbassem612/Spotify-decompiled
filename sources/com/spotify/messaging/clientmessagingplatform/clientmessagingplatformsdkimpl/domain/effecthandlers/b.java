package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;
import p.pih1;
import p.qjc;
import p.r4j0;
import p.ric;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b {
    public final ric a;

    public b(ric ricVar) {
        this.a = ricVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CleanupPresenterRegistryEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(qjc qjcVar) {
                pih1 pih1Var = qjcVar.b;
                if (qjcVar.c != null) {
                    WeakReference weakReference = (WeakReference) this.this$0.a.a.get(pih1Var.a);
                    r4j0 r4j0Var = weakReference != null ? (r4j0) weakReference.get() : null;
                    if (r4j0Var != null) {
                        r4j0Var.dismiss();
                    }
                }
                this.this$0.a.a.remove(pih1Var.a);
            }
        };
    }
}
