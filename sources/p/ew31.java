package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ew31 {
    public static final jw31 a = new jw31(h36.a, een.Z);

    public static final jw31 a(c36 c36Var, pl3 pl3Var, b0k b0kVar, int i) {
        if (c36Var.equals(h36.a) && u890.j(pl3Var, een.Z)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1073830487);
            x340Var.r(false);
            return a;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && x340Var2.g(c36Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !x340Var2.g(pl3Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new jw31(c36Var, pl3Var);
            x340Var2.s0(objT);
        }
        jw31 jw31Var = (jw31) objT;
        x340Var2.r(false);
        return jw31Var;
    }
}
