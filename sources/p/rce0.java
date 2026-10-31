package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class rce0 {
    public static final kiv a = new kiv(fnc0.d1, (byte) 1);

    public static final void a(tl7 tl7Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1658762622);
        int i2 = (x340Var.i(tl7Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(a.a(tl7Var), apo.r(-58291650, new ak10(j2iVar, (byte) 16), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(tl7Var, j2iVar, i, (byte) 1);
        }
    }
}
