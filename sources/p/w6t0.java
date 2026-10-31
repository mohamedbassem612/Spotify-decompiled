package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class w6t0 {
    public static final List a;
    public static final v6t0 b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        List listM = p7h.M(new v6t0[]{new v6t0(10.0f, 4.0f, 8.0f, z4p1.g(4284643114L)), new v6t0(8.0f, 4.0f, 6.0f, z4p1.g(4284643114L)), new v6t0(4.0f, 4.0f, 4.0f, z4p1.g(4294930787L)), new v6t0(1.0f, 4.0f, 3.0f, z4p1.g(4288057855L))});
        a = listM;
        b = new v6t0(-1.0f, 2.0f, 2.0f, z4p1.g(4288057855L));
        Iterator it = listM.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return;
        }
        v6t0 v6t0Var = (v6t0) it.next();
        float fMax = v6t0Var.d + v6t0Var.c + v6t0Var.b;
        while (it.hasNext()) {
            v6t0 v6t0Var2 = (v6t0) it.next();
            fMax = Math.max(fMax, v6t0Var2.d + v6t0Var2.c + v6t0Var2.b);
        }
        c = fMax;
        Iterator it2 = a.iterator();
        if (!it2.hasNext()) {
            hhg1.k();
            return;
        }
        v6t0 v6t0Var3 = (v6t0) it2.next();
        float fMax2 = (v6t0Var3.d + v6t0Var3.c) - v6t0Var3.b;
        while (it2.hasNext()) {
            v6t0 v6t0Var4 = (v6t0) it2.next();
            fMax2 = Math.max(fMax2, (v6t0Var4.d + v6t0Var4.c) - v6t0Var4.b);
        }
        if (fMax2 < 0.0f) {
            fMax2 = 0.0f;
        }
        d = fMax2;
        Iterator it3 = a.iterator();
        if (!it3.hasNext()) {
            hhg1.k();
            return;
        }
        v6t0 v6t0Var5 = (v6t0) it3.next();
        float fMax3 = v6t0Var5.d + v6t0Var5.c + v6t0Var5.b;
        while (it3.hasNext()) {
            v6t0 v6t0Var6 = (v6t0) it3.next();
            fMax3 = Math.max(fMax3, v6t0Var6.d + v6t0Var6.c + v6t0Var6.b);
        }
        e = fMax3 >= 0.0f ? fMax3 : 0.0f;
    }

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(211467421);
        int i2 = (x340Var.g(qim0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new ewq0(1, (byte) 6);
                x340Var.s0(objT);
            }
            op71.g(x340Var, exd0.r(qim0Var, (iu30) objT));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 1);
        }
    }
}
