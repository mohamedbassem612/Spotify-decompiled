package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class qp0 {
    public static final kiv a = new kiv(pp0.a, (byte) 1);

    public static final void a(kp0 kp0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(637562208);
        int i4 = (x340Var.i(kp0Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var;
            otw.c((op0) x340Var.k(a), kp0Var, qim0Var3, (ipb1) null, x340Var, (i3 << 3) & 1008, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(kp0Var, qim0Var2, i, i2, (byte) 3);
        }
    }

    public static final kiv b() {
        return a;
    }
}
