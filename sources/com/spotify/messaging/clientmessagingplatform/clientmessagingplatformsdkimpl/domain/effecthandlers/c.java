package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p.mjc;
import p.njc;
import p.qyo1;
import p.rjc;
import p.yic;
import p.z8b0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c {
    public final mjc a;
    public final yic b;

    public c(mjc mjcVar, yic yicVar) {
        this.a = mjcVar;
        this.b = yicVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteCacheEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(rjc rjcVar) {
                qyo1.x(((njc) this.this$0.a).a.a, false, true, new z8b0());
                this.this$0.b.a();
            }
        };
    }
}
