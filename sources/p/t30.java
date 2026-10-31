package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t30 implements jsw {
    public final kly0 a;
    public final q30 b;
    public final boolean c;
    public final float d;
    public final idd1 e;

    public t30(kly0 kly0Var, q30 q30Var) {
        float f = ctl.b;
        this.a = kly0Var;
        this.b = q30Var;
        this.c = true;
        this.d = f;
        this.e = new idd1(new g3(this, (byte) 9));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(n30 n30Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        s30 s30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1961280998);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(n30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1027) != 1026)) {
            x340Var.b0();
        } else {
            if (!(n30Var instanceof m30)) {
                if (!(n30Var instanceof l30)) {
                    throw p3d1.k(x340Var, -699598930, false);
                }
                x340Var.i0(-212612331);
                l30 l30Var = (l30) n30Var;
                if (l30Var.a().isEmpty()) {
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        s30Var = new s30(this, n30Var, iu30Var, kswVar, i, (byte) 0);
                    }
                } else {
                    ctl.a(new dtl(l30Var.c(), l30Var.b(), l30Var.a()), (iuj) this.a.get(), (xpw) this.e.getValue(), this.c, null, 2, 16.0f, new p3v(384.0f), 0.0f, this.d, x340Var, 12779528, 16);
                    x340Var.r(false);
                }
                h311VarV.d = s30Var;
            }
            x340Var.i0(-699597622);
            x340Var.r(false);
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            s30Var = new s30(this, n30Var, iu30Var, kswVar, i, (byte) 1);
            h311VarV.d = s30Var;
        }
    }
}
