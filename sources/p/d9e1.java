package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d9e1 implements bx80 {
    public final Flowable a;
    public final g0l b;
    public final phi0 c;
    public final zeu d;
    public final c9n e;
    public xab1 f;

    public d9e1(Flowable flowable, g0l g0lVar, phi0 phi0Var, zeu zeuVar, llm llmVar) {
        this.a = flowable;
        this.b = g0lVar;
        this.c = phi0Var;
        this.d = zeuVar;
        this.e = llmVar;
    }

    public final void b(String str, vt81 vt81Var) {
        if (this.f != null) {
            eg.m("This interaction is already in progress");
        } else {
            this.f = fn31.T(this.e, (o8n) null, 0, new q721(this, str, vt81Var, (lnm) null), 3);
        }
    }

    public final void cancel() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
