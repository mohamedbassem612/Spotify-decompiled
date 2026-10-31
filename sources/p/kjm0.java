package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kjm0 implements lqw, iac0 {
    public final llm a;
    public final bpb1 b;
    public final bbc c;
    public int d;
    public final jjm0 e;
    public final tac0 f;

    public kjm0(o8n o8nVar, Object obj, h141 h141Var, j2i j2iVar) {
        a840 a840Var;
        llm llmVarE = smo1.e(o8nVar);
        this.a = llmVarE;
        this.b = gio1.b(obj);
        this.c = mno1.a(0, 2, 5);
        this.e = new jjm0(this, h141Var);
        tac0 tac0Var = new tac0(this, false);
        this.f = tac0Var;
        tac0Var.i(w8c0.e);
        r7j0 r7j0Var = new r7j0(h141Var, (byte) 26);
        rvg0 rvg0Var = new rvg0(this, h141Var, j2iVar, (byte) 27);
        int iC = l1d.C(2);
        if (iC == 0) {
            a840Var = o6x.a;
        } else {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            a840Var = new a840(llmVarE, o8nVar);
        }
        o8n o8nVarY = llmVarE.a.y(o8nVar).y(a840Var);
        p311 p311Var = new p311(o8nVarY);
        h4k h4kVar = new h4k(p311Var, tih1.e);
        p811 p811Var = new p811();
        fn31.S(llmVarE, o8nVarY, 4, new wkk0(p311Var, h4kVar, p811Var, (lnm) null, (byte) 6));
        int iC2 = l1d.C(1);
        if (iC2 != 0) {
            if (iC2 != 1) {
                eg.o();
                throw null;
            }
            pg pgVar = new pg(new l811(), llmVarE, o8nVarY, (byte) 22);
            synchronized (pv91.c) {
                pv91.i = o7h.O0(pgVar, pv91.i);
            }
            pv91.c();
            p811Var.a = new iv91(pgVar, (byte) 1);
        }
        h4kVar.A(new j2i(-17548624, new f14(r7j0Var, rvg0Var, (byte) 21), true));
    }

    public final void d(Object obj) {
        this.b.l(obj);
    }

    public final void dispose() {
        smo1.p(this.a, (CancellationException) null);
        this.f.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.f;
    }

    public final void k(Object obj, tqw tqwVar) {
        jo31.u(new wkk0(this, obj, tqwVar, (lnm) null, (byte) 5));
    }
}
