package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class t3g {
    public static final kiv a = new kiv(nyf.e, (byte) 1);

    public static final void a(r3g r3gVar, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1586452668);
        int i2 = (x340Var.g(r3gVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            b(r3gVar, apo.r(946604629, new s3g(r3gVar, j2iVar), x340Var), x340Var, (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s3g(r3gVar, j2iVar, i, (byte) 1);
        }
    }

    public static final void b(r3g r3gVar, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(80818401);
        int i2 = (x340Var.g(r3gVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(a.a(r3gVar), j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s3g(r3gVar, j2iVar, i, (byte) 2);
        }
    }
}
