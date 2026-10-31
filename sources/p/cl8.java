package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cl8 implements rdo0 {
    public final iuw0 a;
    public final wh61 b;
    public final kh61 c;
    public final u380 d;
    public final llm e;
    public final jl8 f;
    public final hrr0 g;

    public cl8(iuw0 iuw0Var, wh61 wh61Var, kh61 kh61Var, jl8 jl8Var, u380 u380Var) {
        this.a = iuw0Var;
        this.b = wh61Var;
        this.c = kh61Var;
        this.d = u380Var;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        llm llmVarE = smo1.e(flo1.l(bs50Var, j0d1VarB));
        this.e = llmVarE;
        jl8Var = jl8Var instanceof gl8 ? il8.a : jl8Var;
        this.f = jl8Var;
        this.g = v8r.q(jl8Var);
        fn31.T(llmVarE, (o8n) null, 0, new vk6(this, (lnm) null, (byte) 5), 3);
    }

    public static boolean a(th61 th61Var) {
        return (!th61Var.b || th61Var.c || th61Var.d) ? false : true;
    }

    public static boolean b(th61 th61Var) {
        return (th61Var.b || th61Var.c || th61Var.d) ? false : true;
    }

    @Override // p.rdo0
    public final void dispose() {
        smo1.p(this.e, (CancellationException) null);
    }
}
