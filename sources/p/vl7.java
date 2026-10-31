package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class vl7 {
    public static final kiv a = new kiv(vc7.e, (byte) 1);

    public static final void a(ul7 ul7Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-296920355);
        int i2 = (x340Var.i(ul7Var) ? 4 : 2) | i;
        byte b = 18;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(a.a(ul7Var), apo.r(-2060210275, new pu2(j2iVar, (byte) 6), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pp5(ul7Var, j2iVar, i, b);
        }
    }
}
