package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kdj1 implements f961 {
    public final llm a;
    public final xe01 b;

    public kdj1(vwj1 vwj1Var) {
        llm llmVarE = smo1.e(flo1.l(guo1.B(), igu.b));
        this.a = llmVarE;
        any anyVarN = f5p1.n(vwj1Var.c);
        o6x o6xVar = o6x.a;
        this.b = d5p1.t(new x010(new ht20(yoi1.g(yoi1.i(anyVarN, o6xVar)), new egv0(2, (lnm) null, (byte) 26)), new ht20(yoi1.g(yoi1.i(f5p1.n(vwj1Var.a), o6xVar)), new egv0(2, (lnm) null, (byte) 27)), new jmd1(this, (lnm) null, (byte) 3), (byte) 1), llmVarE, ey71.a, (Object) null);
    }

    public final void shutdown() {
        smo1.p(this.a, (CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
