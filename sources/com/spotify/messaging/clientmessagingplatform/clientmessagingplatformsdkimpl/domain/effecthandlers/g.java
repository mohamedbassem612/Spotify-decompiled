package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;
import p.mmc;
import p.nmc;
import p.pak1;
import p.pih1;
import p.r4j0;
import p.ric;
import p.vjc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g {
    public final ric a;
    public final mmc b;

    public g(ric ricVar, mmc mmcVar) {
        this.a = ricVar;
        this.b = mmcVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DismissMessageViewEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(vjc vjcVar) {
                DismissReason dismissReason = vjcVar.d;
                Message message = vjcVar.c;
                pih1 pih1Var = vjcVar.b;
                WeakReference weakReference = (WeakReference) this.this$0.a.a.get(pih1Var.a);
                r4j0 r4j0Var = weakReference != null ? (r4j0) weakReference.get() : null;
                if (r4j0Var != null) {
                    r4j0Var.dismiss();
                }
                ((nmc) this.this$0.b).a.accept(new pak1(pih1Var, message, dismissReason));
            }
        };
    }
}
