package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ich0 {
    public static final kiv a;

    static {
        mod.t(new n4k((byte) 17));
        a = mod.t(new n4k((byte) 18));
    }

    public static final void a(dah dahVar, jnm0 jnm0Var, mx61 mx61Var, k2h1 k2h1Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(904511636);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dahVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(jnm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(mx61Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(k2h1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            ci31 ci31VarA = ai31.a(0.0f, 7, false);
            long j = dahVar.a;
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                rce1 rce1Var = new rce1(j, u7h.b(j, 0.4f, 0.0f, 0.0f, 0.0f, 14));
                x340Var.s0(rce1Var);
                objT = rce1Var;
            }
            mod.c(new ely0[]{eah.a.a(dahVar), a.a(jnm0Var), da80.a.a(ci31VarA), px61.a.a(mx61Var), sce1.a.a((rce1) objT), o2h1.a.a(k2h1Var)}, apo.r(-1750539308, new ek1(k2h1Var, j2iVar, (byte) 11), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hfa(dahVar, jnm0Var, mx61Var, k2h1Var, j2iVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void b(dah dahVar, mx61 mx61Var, k2h1 k2h1Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        k2h1 k2h1VarQ;
        int i3;
        boolean z;
        mx61 mx61Var2;
        k2h1 k2h1Var2;
        h311 h311VarV;
        mx61 mx61VarP;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-449719819);
        int i4 = i | (x340Var.g(dahVar) ? 4 : 2) | (((i2 & 2) == 0 && x340Var.g(mx61Var)) ? 32 : 16);
        if ((i2 & 4) == 0) {
            k2h1VarQ = k2h1Var;
            int i5 = x340Var.g(k2h1VarQ) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 2) != 0) {
                        mx61VarP = lgo1.p(x340Var);
                        i3 &= -113;
                    } else {
                        mx61VarP = mx61Var;
                    }
                    if ((i2 & 4) != 0) {
                        k2h1VarQ = lgo1.q(x340Var);
                        i3 &= -897;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    mx61VarP = mx61Var;
                }
                x340Var.s();
                int i6 = i3;
                int i7 = i6 & 14;
                int i8 = i6 << 3;
                a(dahVar, lgo1.o(x340Var), mx61VarP, k2h1VarQ, j2iVar, x340Var, (i8 & 7168) | i7 | (i8 & 896) | 24576);
                mx61Var2 = mx61VarP;
            } else {
                x340Var.b0();
                mx61Var2 = mx61Var;
            }
            k2h1Var2 = k2h1VarQ;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gsb0(i, dahVar, mx61Var2, k2h1Var2, j2iVar, i2, (byte) 1);
            }
        }
        k2h1VarQ = k2h1Var;
        i3 = i4 | i5;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    mx61VarP = lgo1.p(x340Var);
                    i3 &= -113;
                } else {
                    mx61VarP = mx61Var;
                }
                if ((i2 & 4) != 0) {
                    k2h1VarQ = lgo1.q(x340Var);
                    i3 &= -897;
                }
            } else {
                if ((i2 & 2) != 0) {
                    mx61VarP = lgo1.p(x340Var);
                    i3 &= -113;
                } else {
                    mx61VarP = mx61Var;
                }
                if ((i2 & 4) != 0) {
                    k2h1VarQ = lgo1.q(x340Var);
                    i3 &= -897;
                }
            }
            x340Var.s();
            int i9 = i3;
            int i10 = i9 & 14;
            int i11 = i9 << 3;
            a(dahVar, lgo1.o(x340Var), mx61VarP, k2h1VarQ, j2iVar, x340Var, (i11 & 7168) | i10 | (i11 & 896) | 24576);
            mx61Var2 = mx61VarP;
        } else {
            x340Var.b0();
            mx61Var2 = mx61Var;
        }
        k2h1Var2 = k2h1VarQ;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gsb0(i, dahVar, mx61Var2, k2h1Var2, j2iVar, i2, (byte) 1);
        }
    }
}
