package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cpf0 {
    public final pqp a;
    public final epf0 b;

    public cpf0(pqp pqpVar, epf0 epf0Var) {
        this.a = pqpVar;
        this.b = epf0Var;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-425820353);
        int i2 = (x340Var.g(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tbr0 tbr0VarC = ((cir0) x340Var.k(k2r0.a)).c();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                t7p t7pVar = (t7p) this.a.a.c;
                dpf0 dpf0Var = (dpf0) t7pVar.b;
                lnf0 lnf0Var = (lnf0) ((dpf0) t7pVar.b).c.get();
                c8o.l(lnf0Var);
                epf0 epf0Var = (epf0) t7pVar.c;
                q8n q8nVar = (q8n) dpf0Var.a.get();
                c8o.l(q8nVar);
                q8n q8nVar2 = (q8n) dpf0Var.b.get();
                c8o.l(q8nVar2);
                Flowable flowable = (Flowable) dpf0Var.d.get();
                c8o.l(flowable);
                q8q q8qVar = (q8q) dpf0Var.e.get();
                c8o.l(q8qVar);
                b9y b9yVar = (b9y) dpf0Var.f.get();
                c8o.l(b9yVar);
                pof0 pof0Var = new pof0(lnf0Var, epf0Var, q8nVar, q8nVar2, flowable, q8qVar, b9yVar, tbr0VarC);
                x340Var.s0(pof0Var);
                objT = pof0Var;
            }
            pof0 pof0Var2 = (pof0) objT;
            epf0 epf0Var2 = this.b;
            fpf0 fpf0Var = new fpf0(epf0Var2.a, epf0Var2.b, epf0Var2.c);
            otw.c(pof0Var2, fpf0Var, u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3), wpb1.C("LyricsShareSelectorElement", pof0Var2, fpf0Var, x340Var, 6, 8), x340Var, 0, 0);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbf0(this, i, (byte) 5);
        }
    }
}
