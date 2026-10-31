package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sv71 {
    public static final n8b1 a = irn1.l0(0.0f, 400.0f, ckk1.a, 1);
    public static final qv71 b = new qv71();

    static {
        new nen0();
    }

    public static final void a(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(646379026);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            b(6, apo.r(1948801580, new juy0(qim0Var, j2iVar, (byte) 5), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rbh(qim0Var2, j2iVar, i, i2, (byte) 6);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1908320054);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            ton1.g(6, apo.r(2062852661, new rv71(j2iVar, (byte) 0), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2r0(j2iVar, i, (byte) 17);
        }
    }

    public static final void c(wdn0 wdn0Var) {
        k0d k0dVar = k0d.i;
        int i = wdn0Var.b;
        for (int i2 = 1; i2 < i; i2++) {
            Object objG = wdn0Var.g(i2);
            int i3 = i2 - 1;
            while (i3 >= 0 && k0dVar.compare(wdn0Var.g(i3), objG) > 0) {
                wdn0Var.o(i3 + 1, wdn0Var.g(i3));
                i3--;
            }
            wdn0Var.o(i3 + 1, objG);
        }
    }
}
