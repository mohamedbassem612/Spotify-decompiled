package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cbc0 {
    public static final List a = p7h.M(new n1i[]{n1i.a, n1i.b, n1i.c, n1i.d});

    public static final void a(mr20 mr20Var, Object obj, uh0 uh0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1096389620);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(mr20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(uh0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean zI = x340Var.i(mr20Var) | (i3 == 256);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ss90(mr20Var, uh0Var, (lnm) null, (byte) 19);
                x340Var.s0(objT);
            }
            qxd0.t(obj, x340Var, (vu30) objT);
            ven0 ven0VarG = rwq.g(mr20Var, (Object) null, (o8n) null, x340Var, (i2 & 14) | 48, 2);
            boolean zG = x340Var.g(ven0VarG) | (i3 == 256);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new vq80(uh0Var, ven0VarG, (byte) 23);
                x340Var.s0(objT2);
            }
            qxd0.i(obj, (iu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(mr20Var, obj, uh0Var, i, (byte) 23);
        }
    }
}
