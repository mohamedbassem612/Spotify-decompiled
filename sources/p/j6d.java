package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j6d {
    public final hrr0 a = xto.t((Object) null);

    public final void a(b0k b0kVar, int i) {
        h311 h311VarV;
        i6d i6dVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(163078231);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            iu30 iu30Var = (iu30) this.a.getValue();
            if (iu30Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    i6dVar = new i6d(this, i, (byte) 1);
                }
            } else {
                nyx.a(2, (wux) null, apo.r(-1518999766, new swc(this, pno1.m(x340Var), iu30Var, (byte) 2), x340Var), x340Var, 3078, 6);
            }
            h311VarV.d = i6dVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            i6dVar = new i6d(this, i, (byte) 0);
            h311VarV.d = i6dVar;
        }
    }
}
