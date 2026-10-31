package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p.nkc;
import p.yic;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r {
    public final yic a;

    public r(yic yicVar) {
        this.a = yicVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.UpdateCappingEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(nkc nkcVar) {
                this.this$0.a.d(nkcVar.b, nkcVar.c);
            }
        };
    }
}
