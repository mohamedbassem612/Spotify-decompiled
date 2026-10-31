package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k4j1 {
    public static final nma0 g = m5n1.z(p4j1.Companion.serializer());
    public static final bma1 h = bma1.b.q("version_sunsetting_data_source_cache");
    public final dma1 a;
    public final oj80 b;
    public final kly0 c;
    public final nfa0 d;
    public final m4j1 e;
    public p4j1 f;

    public k4j1(ajg ajgVar, dma1 dma1Var, oj80 oj80Var, gbp gbpVar, nfa0 nfa0Var) {
        this.a = dma1Var;
        this.b = oj80Var;
        this.c = gbpVar;
        this.d = nfa0Var;
        this.e = o0p1.n(ajgVar.a());
        String strE = dma1Var.e(h, (String) null);
        this.f = strE != null ? (p4j1) nfa0Var.a(strE, g) : null;
    }

    public final void a(p4j1 p4j1Var) {
        if (u890.j(this.f, p4j1Var)) {
            return;
        }
        this.f = p4j1Var;
        m4j1 m4j1Var = p4j1Var.a;
        m4j1 m4j1Var2 = p4j1Var.b;
        Objects.toString(m4j1Var);
        Objects.toString(m4j1Var2);
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(h, this.d.b(g, p4j1Var));
        hma1VarEdit.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        j4j1 j4j1Var;
        if (onmVar instanceof j4j1) {
            j4j1Var = (j4j1) onmVar;
            int i = j4j1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4j1Var.c = i - Integer.MIN_VALUE;
            } else {
                j4j1Var = new j4j1(this, onmVar);
            }
        } else {
            j4j1Var = new j4j1(this, onmVar);
        }
        Object objC = j4j1Var.a;
        int i2 = j4j1Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            xi4 xi4Var = (xi4) this.c.get();
            int i3 = xi4Var == null ? -1 : i4j1.a[xi4Var.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    j4j1Var.c = 1;
                    objC = this.b.c(j4j1Var);
                    d9n d9nVar = d9n.a;
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                } else if (i3 == 2) {
                    a(new p4j1(new m4j1(), null));
                } else {
                    if (i3 != 3) {
                        eg.o();
                        return null;
                    }
                    a(new p4j1(null, new m4j1()));
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objC);
        p4j1 p4j1Var = (p4j1) objC;
        if (p4j1Var != null) {
            a(p4j1Var);
        }
        return rih1.a;
    }
}
