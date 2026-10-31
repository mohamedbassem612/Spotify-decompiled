package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PresentationOperation;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.lang.ref.WeakReference;
import p.eg;
import p.hmc;
import p.l1d;
import p.p6j0;
import p.q6j0;
import p.ric;
import p.vz21;
import p.w7q0;
import p.xjc;
import p.y4q0;
import p.yhm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i {
    public final ric a;
    public final hmc b;
    public final w7q0 c;
    public final y4q0 d;

    public i(ric ricVar, hmc hmcVar, w7q0 w7q0Var, y4q0 y4q0Var) {
        this.a = ricVar;
        this.b = hmcVar;
        this.c = w7q0Var;
        this.d = y4q0Var;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DispatchMessageViewResponseEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(xjc xjcVar) {
                p6j0 p6j0Var = xjcVar.b;
                if (p6j0Var instanceof p6j0) {
                    p6j0 p6j0Var2 = p6j0Var;
                    this.this$0.d.a(yhm0.q(p6j0Var2.G()), p6j0Var2.F(), p6j0Var2.E());
                    return;
                }
                if (!(p6j0Var instanceof q6j0)) {
                    eg.o();
                    return;
                }
                ric ricVar = this.this$0.a;
                q6j0 q6j0Var = (q6j0) p6j0Var;
                ricVar.a.put(q6j0Var.F().a, new WeakReference(q6j0Var.E()));
                hmc hmcVar = this.this$0.b;
                vz21 vz21Var = (vz21) hmcVar.a.get(q6j0Var.F().a);
                if (vz21Var == null) {
                    Logger.k(l1d.m("CMP: Response context not found while in ViewDispatched state for requestId ", q6j0Var.F().a), new Object[0]);
                    return;
                }
                ((ReplaySubject) vz21Var.a()).onNext(new PresentationOperation.Present(q6j0Var.E(), this.this$0.c));
            }
        };
    }
}
