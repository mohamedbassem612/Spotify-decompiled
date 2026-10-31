package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a8e1 extends l5t implements zlb0, mv40, j4k {
    public aae1 Q0;
    public boolean R0;
    public final k5c S0;
    public Map T0;

    public a8e1(aae1 aae1Var, ggg1 ggg1Var, lee1 lee1Var, boolean z, vu30 vu30Var, kua0 kua0Var) {
        this.Q0 = aae1Var;
        this.R0 = z;
        k5c k5cVar = new k5c(aae1Var.h);
        H1(k5cVar);
        this.S0 = k5cVar;
        aae1 aae1Var2 = this.Q0;
        aae1Var2.b = vu30Var;
        boolean z2 = this.R0;
        aae1Var2.a.a.setValue(new z5e1(ggg1Var, lee1Var, z2, !z2, kua0Var.c == 4));
    }

    public final void E(elb0 elb0Var) {
        this.Q0.d.setValue(elb0Var);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        aae1 aae1Var = this.Q0;
        flb0 layoutDirection = ifh0Var.getLayoutDirection();
        f930 f930Var = (f930) lcc.z(this, t4k.k);
        a6e1 a6e1Var = aae1Var.a;
        y5e1 y5e1Var = new y5e1(ifh0Var, layoutDirection, f930Var, j);
        a6e1Var.b.setValue(y5e1Var);
        z5e1 z5e1Var = (z5e1) a6e1Var.a.getValue();
        if (z5e1Var == null) {
            tf80.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            jah.d();
            return null;
        }
        y9e1 y9e1VarC = a6e1Var.c(z5e1Var, y5e1Var);
        long j2 = y9e1VarC.c;
        vu30 vu30Var = aae1Var.b;
        if (vu30Var != null) {
            vu30Var.invoke(ifh0Var, new ww21(aae1Var, (byte) 23));
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        q5t0 q5t0VarH = afh0Var.H(m5n1.v(i, i, i2, i2));
        this.Q0.g.setValue(new p3v(this.R0 ? ifh0Var.M0(r2p1.h(y9e1VarC.b.b(0))) : 0.0f));
        Map linkedHashMap = this.T0;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(xl3.a, Integer.valueOf(Math.round(y9e1VarC.d)));
        linkedHashMap.put(xl3.b, Integer.valueOf(Math.round(y9e1VarC.e)));
        this.T0 = linkedHashMap;
        return ifh0Var.S(i, i2, linkedHashMap, new p6(q5t0VarH, (byte) 19));
    }
}
