package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class jv71 {
    public static final kiv a = new kiv(da71.W0, (byte) 0);

    public static final void a(pv71 pv71Var, wa5 wa5Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(341847801);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(pv71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(wa5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(a.a(new iv71(pv71Var, wa5Var)), apo.r(-1639939143, new j2r0(j2iVar, (byte) 16), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(pv71Var, wa5Var, j2iVar, i, (byte) 23);
        }
    }
}
