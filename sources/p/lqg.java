package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lqg {
    public final pqg a;
    public final w6e0 b;
    public final q7r0 c;
    public final lag d;
    public LinkedHashMap e;
    public snc0 f;
    public final bpb1 g;
    public final xe01 h;
    public final llm i;
    public xab1 j;

    public lqg(pqg pqgVar, w6e0 w6e0Var, q7r0 q7r0Var, lag lagVar, q8n q8nVar) {
        this.a = pqgVar;
        this.b = w6e0Var;
        this.c = q7r0Var;
        this.d = lagVar;
        bpb1 bpb1VarB = gio1.b(sqg.a);
        this.g = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
        this.i = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void e(onm onmVar) {
        iqg iqgVar;
        if (onmVar instanceof iqg) {
            iqgVar = (iqg) onmVar;
            int i = iqgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqgVar.c = i - Integer.MIN_VALUE;
            } else {
                iqgVar = new iqg(this, onmVar);
            }
        } else {
            iqgVar = new iqg(this, onmVar);
        }
        Object obj = iqgVar.a;
        int i2 = iqgVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            mgb mgbVar = new mgb((xe01) this.b.c, this, (byte) 24);
            l1n0 l1n0Var = (l1n0) this.c.e(l1n0.class);
            cc9 cc9Var = new cc9(0, 0, 7);
            dnc0 dnc0Var = new dnc0((rzq) l1n0Var.a.a.k().c, fsm0.g, fsm0.h, cc9Var, (guh0) null, 6);
            dnc0Var.b(new gj50(new syf(mgbVar, (byte) 15), true), new kqg(this, (byte) 0));
            cnc0 cnc0VarA = dnc0Var.a();
            snc0 snc0Var = (snc0) cnc0VarA.a.invoke();
            this.f = snc0Var;
            this.e = cnc0VarA.c;
            zob1 zob1VarC = snc0Var.c();
            fdd fddVar = new fdd(this, (byte) 9);
            iqgVar.c = 1;
            if (zob1VarC.collect(fddVar, iqgVar) == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }
}
