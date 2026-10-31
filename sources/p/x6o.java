package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x6o extends x7e0 {
    public final bpb1 X;
    public final bpb1 Y;
    public mko Z;
    public final uu00 d;
    public final lko e;
    public final c7o f;
    public final bw2 g;
    public final q8n h;
    public llm i;
    public final String t;

    public x6o(uu00 uu00Var, lko lkoVar, c7o c7oVar, bw2 bw2Var, q8n q8nVar) {
        this.d = uu00Var;
        this.e = lkoVar;
        this.f = c7oVar;
        this.g = bw2Var;
        this.h = q8nVar;
        String str = c7oVar.b;
        this.t = str == null ? "" : str;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.X = bpb1VarB;
        this.Y = bpb1VarB;
    }

    public final void e() {
        if (d()) {
            return;
        }
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarE = smo1.e(this.h);
        this.i = llmVarE;
        j();
        l4p1.u(llmVarE, new lt20(new fu20(yoi1.g(this.d.b(new oi("credits-bottomsheet", false, new fnn(this, (byte) 13))).filter(cxo1.T0).map(new vun(this, (byte) 1))), new eum(this, null, (byte) 10), (byte) 1), new mnl(this, (lnm) null, (byte) 5), (byte) 0));
    }

    public final void f() {
        mko mkoVar = this.Z;
        if (mkoVar != null) {
            mkoVar.stop();
        }
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.i = null;
    }
}
