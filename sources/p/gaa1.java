package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class gaa1 {
    public static final kiv a = new kiv(gr81.S0, (byte) 0);

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void a(u7h u7hVar, long j, long j2, qim0 qim0Var, boolean z, fe5 fe5Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        fe5 fe5Var2;
        boolean z4;
        h311 h311VarV;
        fe5 fe5VarO0;
        long j3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-88327857);
        int i4 = (x340Var.g(u7hVar) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16) | (x340Var.f(j2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i4 |= x340Var.h(z2) ? 16384 : 8192;
            }
            i3 = i4 | 65536;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i5 != 0) {
                        z2 = false;
                    }
                    fe5VarO0 = irn1.o0(1500, 0, (dlv) null, 6);
                } else {
                    x340Var.b0();
                    fe5VarO0 = fe5Var;
                }
                boolean z5 = z2;
                x340Var.s();
                if (u7hVar != null) {
                    j3 = u7hVar.a;
                } else {
                    uwr uwrVar = cbx.a;
                    j3 = ((yex) zex.a.d).e;
                }
                mod.b(p3d1.o(j3, a), apo.r(-1664910193, new daa1(z5, qim0Var, j, j2, w191.a(j3, fe5VarO0, "animatedExtractedColor", x340Var, 384, 8), j2iVar), x340Var), x340Var, 56);
                fe5Var2 = fe5VarO0;
                z4 = z5;
            } else {
                x340Var.b0();
                fe5Var2 = fe5Var;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new eaa1(u7hVar, j, j2, qim0Var, z4, fe5Var2, j2iVar, i, i2);
            }
        }
        i4 |= 24576;
        z2 = z;
        i3 = i4 | 65536;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    z2 = false;
                }
                fe5VarO0 = irn1.o0(1500, 0, (dlv) null, 6);
            } else {
                if (i5 != 0) {
                    z2 = false;
                }
                fe5VarO0 = irn1.o0(1500, 0, (dlv) null, 6);
            }
            boolean z6 = z2;
            x340Var.s();
            if (u7hVar != null) {
                j3 = u7hVar.a;
            } else {
                uwr uwrVar2 = cbx.a;
                j3 = ((yex) zex.a.d).e;
            }
            mod.b(p3d1.o(j3, a), apo.r(-1664910193, new daa1(z6, qim0Var, j, j2, w191.a(j3, fe5VarO0, "animatedExtractedColor", x340Var, 384, 8), j2iVar), x340Var), x340Var, 56);
            fe5Var2 = fe5VarO0;
            z4 = z6;
        } else {
            x340Var.b0();
            fe5Var2 = fe5Var;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eaa1(u7hVar, j, j2, qim0Var, z4, fe5Var2, j2iVar, i, i2);
        }
    }
}
