package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j22 {
    public static h22 a(th30 th30Var, int i, n12 n12Var, yf30 yf30Var) {
        h22 h22Var = (h22) th30Var.F(i);
        if (h22Var != null) {
            return h22Var;
        }
        zf30 zf30VarA = th30Var.N().a(th30Var.x.e.getClassLoader(), h22.class.getName());
        zf30VarA.T0(lap1.q(n12Var));
        if (yf30Var != null) {
            zf30VarA.V0(yf30Var);
        }
        nu9 nu9Var = new nu9(th30Var);
        nu9Var.k(i, zf30VarA, null, 1);
        nu9Var.h();
        return (h22) zf30VarA;
    }
}
