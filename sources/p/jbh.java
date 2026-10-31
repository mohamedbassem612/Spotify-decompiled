package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jbh {
    public static final mbh a = new mbh(h36.c, een.P0);

    public static final mbh a(g36 g36Var, nl3 nl3Var, b0k b0kVar, int i) {
        if (u890.j(g36Var, h36.c) && u890.j(nl3Var, een.P0)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1446604504);
            x340Var.r(false);
            return a;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && x340Var2.g(g36Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !x340Var2.g(nl3Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new mbh(g36Var, nl3Var);
            x340Var2.s0(objT);
        }
        mbh mbhVar = (mbh) objT;
        x340Var2.r(false);
        return mbhVar;
    }
}
