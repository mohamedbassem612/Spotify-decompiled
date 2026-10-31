package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rfl {
    public static final fdn0 a;

    static {
        je31 je31Var = kah.e;
        int i = je31Var.c;
        scl sclVarX = lqc.x(je31Var);
        int i2 = je31Var.c;
        xzp0 xzp0Var = kah.x;
        int i3 = (xzp0Var.c << 6) | i2;
        ucl uclVar = new ucl(je31Var, xzp0Var, 0);
        int i4 = (i2 << 6) | xzp0Var.c;
        ucl uclVar2 = new ucl(xzp0Var, je31Var, 0);
        fdn0 fdn0Var = pr80.a;
        fdn0 fdn0Var2 = new fdn0();
        fdn0Var2.i(i | (i << 6), sclVarX);
        fdn0Var2.i(i3, uclVar);
        fdn0Var2.i(i4, uclVar2);
        a = fdn0Var2;
    }
}
