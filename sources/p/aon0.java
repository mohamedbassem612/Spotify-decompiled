package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class aon0 {
    public static final kiv a = mod.h(w0n0.c);

    public static final void a(iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1002330906);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new znn0(iu30Var);
                x340Var.s0(objT);
            }
            mod.b(a.a((xnn0) objT), apo.r(-2064592934, new fc3(j2iVar, (byte) 17), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l04(i, j2iVar, iu30Var);
        }
    }
}
