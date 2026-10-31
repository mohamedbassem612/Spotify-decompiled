package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import p.fki0;
import p.mjc;
import p.njc;
import p.qyo1;
import p.tjc;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e {
    public final mjc a;

    public e(mjc mjcVar) {
        this.a = mjcVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteJitTriggerFromCacheEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(tjc tjcVar) {
                List list = tjcVar.b;
                e eVar = this.this$0;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    qyo1.x(((njc) eVar.a).a.a, false, true, new fki0(xcg1.i((String) it.next(), "#", tjcVar.c.name()), (byte) 3));
                }
            }
        };
    }
}
