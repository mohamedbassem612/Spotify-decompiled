package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aqb0 {
    public err0 a;
    public err0 b;

    public static /* synthetic */ qim0 b(aqb0 aqb0Var, qim0 qim0Var, pxg1 pxg1Var, ni20 ni20Var, int i) {
        ni20 ni20VarL0 = pxg1Var;
        if ((i & 1) != 0) {
            ni20VarL0 = irn1.l0(0.0f, 400.0f, (Object) null, 5);
        }
        if ((i & 2) != 0) {
            n511 n511Var = ckk1.a;
            ni20Var = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
        }
        return aqb0Var.a(qim0Var, ni20VarL0, ni20Var, irn1.l0(0.0f, 400.0f, (Object) null, 5));
    }

    public static qim0 c(aqb0 aqb0Var) {
        return new jtr0(1.0f, (err0) null, aqb0Var.b, 2);
    }

    public final qim0 a(qim0 qim0Var, ni20 ni20Var, ni20 ni20Var2, n8b1 n8b1Var) {
        return (ni20Var == null && ni20Var2 == null && n8b1Var == null) ? qim0Var : qim0Var.then(new lrb0(ni20Var, ni20Var2, n8b1Var));
    }

    public final qim0 d(qim0 qim0Var, float f) {
        return qim0Var.then(new jtr0(f, this.a, (err0) null, 4));
    }
}
