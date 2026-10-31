package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class vvx {
    public static final kiv a = new kiv(xzu.e1, (byte) 0);

    public static final void a(xu30 xu30Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(663877354);
        int i2 = (x340Var.i(xu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            kiv kivVar = a;
            mod.b(kivVar.a(xu30Var.invoke(x340Var.k(kivVar), x340Var, Integer.valueOf((i2 << 3) & 112))), j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(xu30Var, j2iVar, i, (byte) 16);
        }
    }

    public static final kiv b() {
        return a;
    }
}
