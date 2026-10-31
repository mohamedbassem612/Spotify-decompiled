package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p.sjc;
import p.yic;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d {
    public final yic a;

    public d(yic yicVar) {
        this.a = yicVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteCappingEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(sjc sjcVar) {
                this.this$0.a.b(sjcVar.b);
            }
        };
    }
}
