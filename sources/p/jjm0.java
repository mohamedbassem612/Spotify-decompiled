package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jjm0 {
    public final /* synthetic */ kjm0 a;
    public final /* synthetic */ h141 b;

    public jjm0(kjm0 kjm0Var, h141 h141Var) {
        this.a = kjm0Var;
        this.b = h141Var;
    }

    public final void a(zu30 zu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(562860355);
        kjm0 kjm0Var = this.a;
        boolean zI = x340Var.i(kjm0Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new r7j0(kjm0Var, (byte) 27);
            x340Var.s0(objT);
        }
        rih1 rih1Var = rih1.a;
        qxd0.i(rih1Var, (iu30) objT, x340Var);
        ven0 ven0VarS = v8r.s(zu30Var, x340Var);
        boolean zI2 = x340Var.i(kjm0Var) | x340Var.i(ven0VarS);
        h141 h141Var = this.b;
        boolean zI3 = zI2 | x340Var.i(h141Var);
        Object objT2 = x340Var.T();
        if (zI3 || objT2 == m4cVar) {
            objT2 = new ijm0(kjm0Var, h141Var, ven0VarS, null);
            x340Var.s0(objT2);
        }
        qxd0.t(rih1Var, x340Var, (vu30) objT2);
        x340Var.r(false);
    }
}
