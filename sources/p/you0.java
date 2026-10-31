package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class you0 extends v46 {
    public final xmu0 d;
    public final q8n e;
    public final u46 f;
    public final iz31 g;
    public llm h;
    public txx0 i;

    public you0(xmu0 xmu0Var, q8n q8nVar, u46 u46Var, iz31 iz31Var) {
        this.d = xmu0Var;
        this.e = q8nVar;
        this.f = u46Var;
        this.g = iz31Var;
        this.i = new txx0((String) null, "", true, "", l1d.m("spotify:user:", u46Var.b), new ee11(3, 1), nmu0.a, true, z6x.a, false, false, false);
    }

    public final void e() {
        j();
        String str = this.f.a;
        if (str == null) {
            i();
            return;
        }
        j0d1 j0d1VarB = guo1.B();
        q8n q8nVar = this.e;
        q8nVar.getClass();
        llm llmVarE = smo1.e(flo1.l(q8nVar, j0d1VarB));
        this.h = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new f3t0(this, str, null, (byte) 23), 3);
    }

    public final void f() {
        llm llmVar = this.h;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.h = null;
    }
}
