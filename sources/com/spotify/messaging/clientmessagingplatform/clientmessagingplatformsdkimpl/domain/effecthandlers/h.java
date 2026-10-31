package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p.imc;
import p.wjc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h {
    public final imc a;

    public h(imc imcVar) {
        this.a = imcVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DispatchMessageResponseEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(wjc wjcVar) {
                imc imcVar = this.this$0.a;
                imcVar.a.onNext(wjcVar.b);
            }
        };
    }
}
