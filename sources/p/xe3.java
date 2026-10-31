package p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xe3 implements oi51 {
    public final ajq0 a;
    public final zwg b;
    public final gev0 c;
    public final abm d;
    public final xf4 e;

    public xe3(ajq0 ajq0Var, zwg zwgVar, gev0 gev0Var, abm abmVar, xf4 xf4Var) {
        this.a = ajq0Var;
        this.b = zwgVar;
        this.c = gev0Var;
        this.d = abmVar;
        this.e = xf4Var;
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        r3r r3rVarQ;
        LinkedHashMap linkedHashMap = ji50Var.b;
        x6o0 x6o0Var = new x6o0(this, (byte) 13);
        ve3 ve3Var = new ve3(tcr0Var, (byte) 0);
        xf4 xf4Var = this.e;
        boolean zQ = xf4Var.q();
        oj2 oj2Var = new oj2(this, ve3Var, x6o0Var, (byte) 12);
        xj61 xj61Var = new xj61();
        xj61Var.add(new yp21(jo70.class));
        xj61Var.add(new yp21(xkk1.class));
        xj61Var.add(new yp21(zoy0.class));
        xj61Var.add(new yp21(gh3.class));
        if (this.d.a()) {
            xj61Var.add(new yp21(bql.class));
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        ra3 ra3Var = ra3.d1;
        p83 p83Var = p83.W0;
        if (zQ) {
            tyq tyqVarK = this.b.k(ji50Var.a, ve3Var, x6o0Var);
            if (xf4Var.o() && xf4Var.p()) {
                tyqVarK = new pdv0(tyqVarK);
            }
            r3rVarQ = new r3r(new xzq(tyqVarK, ra3.b1), p83Var, 4);
        } else {
            r3rVarQ = r4o1.Q(ra3Var, xj61VarJ, oj2Var, p83Var);
        }
        linkedHashMap.put(eer0.class, r3rVarQ);
    }

    public final Class b() {
        return eer0.class;
    }

    public final Set c() {
        return f46.S0(new scr0[]{new scr0(jcr0.a, ra3.e1), new scr0(qcr0.a, we3.b)});
    }
}
