package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class qr21 {
    public static final List a = p7h.M(new Integer[]{2131961288, 2131961283, 2131961301, 2131961293});
    public static final List b = p7h.M(new Integer[]{2131961286, 2131961282, 2131961300, 2131961292});

    public static final void a(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1640983774);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new p4g0(i, (byte) 16);
                x340Var.s0(objT);
            }
            ejo1.l(0, 0, x340Var, (vu30) objT, qim0VarF);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 17, i, i2);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2096244293);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            w2g0.c(u291.d(nim0.a, 1.0f), (tl3) null, apo.r(-1506461403, new ut1(j2iVar, i, (byte) 9), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bf6(i, j2iVar, i2, (byte) 7);
        }
    }
}
