package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p.mjc;
import p.njc;
import p.ps;
import p.qyo1;
import p.ujc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f {
    public final mjc a;

    public f(mjc mjcVar) {
        this.a = mjcVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteMessageFromCacheEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(ujc ujcVar) {
                mjc mjcVar = this.this$0.a;
                long j = ujcVar.b;
                njc njcVar = (njc) mjcVar;
                if (j != -1) {
                    qyo1.x(njcVar.a.a, false, true, new ps((byte) 14, j));
                } else {
                    njcVar.getClass();
                }
            }
        };
    }
}
