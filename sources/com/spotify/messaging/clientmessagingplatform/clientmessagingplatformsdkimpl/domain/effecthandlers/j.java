package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p.fmc;
import p.yjc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j {
    public final fmc a;

    public j(fmc fmcVar) {
        this.a = fmcVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DispatchProcessingStatusEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(yjc yjcVar) {
                fmc fmcVar = this.this$0.a;
                fmcVar.a.onNext(yjcVar.b);
            }
        };
    }
}
