package p;

import android.view.animation.PathInterpolator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class fiw0 {
    public static final pxg1 a;
    public static final pxg1 b;

    static {
        ceo ceoVar = new ceo(0.3f, 0.0f, 0.4f, 1.0f);
        a = irn1.o0(150, 0, ceoVar, 2);
        b = irn1.o0(150, 0, ceoVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void a(oiw0 oiw0Var, Function0 function0, boolean z, qim0 qim0Var, boolean z2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        String strA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1437782189);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(oiw0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (x340Var.h(z3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    if (i6 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    strA = oiw0Var.a();
                    if (oiw0Var instanceof jiw0) {
                        strA = x0d.k(x340Var, 1900822329, 2131960403, x340Var, false);
                    } else if (oiw0Var instanceof kiw0) {
                        strA = x0d.k(x340Var, 1900825240, 2131960402, x340Var, false);
                    } else if (oiw0Var instanceof liw0) {
                        strA = x0d.k(x340Var, 1900828376, 2131960407, x340Var, false);
                    } else if (oiw0Var instanceof miw0) {
                        x340Var.i0(1900831328);
                        strA = cwl1.n0(2131960409, new Object[]{strA}, x340Var);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1900834043);
                        x340Var.r(false);
                    }
                    boolean z5 = z3;
                    nyx.a(2, (wux) null, apo.r(1171314682, new erc(oiw0Var, z, z5, qim0Var4, strA, function0), x340Var), x340Var, 3078, 6);
                    z3 = z5;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new pwx(oiw0Var, function0, z, qim0Var3, z3, i, i2);
                }
            }
            i3 |= 24576;
            z3 = z2;
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                strA = oiw0Var.a();
                if (oiw0Var instanceof jiw0) {
                    strA = x0d.k(x340Var, 1900822329, 2131960403, x340Var, false);
                } else if (oiw0Var instanceof kiw0) {
                    strA = x0d.k(x340Var, 1900825240, 2131960402, x340Var, false);
                } else if (oiw0Var instanceof liw0) {
                    strA = x0d.k(x340Var, 1900828376, 2131960407, x340Var, false);
                } else if (oiw0Var instanceof miw0) {
                    x340Var.i0(1900831328);
                    strA = cwl1.n0(2131960409, new Object[]{strA}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1900834043);
                    x340Var.r(false);
                }
                boolean z6 = z3;
                nyx.a(2, (wux) null, apo.r(1171314682, new erc(oiw0Var, z, z6, qim0Var4, strA, function0), x340Var), x340Var, 3078, 6);
                z3 = z6;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pwx(oiw0Var, function0, z, qim0Var3, z3, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (x340Var.h(z3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                strA = oiw0Var.a();
                if (oiw0Var instanceof jiw0) {
                    strA = x0d.k(x340Var, 1900822329, 2131960403, x340Var, false);
                } else if (oiw0Var instanceof kiw0) {
                    strA = x0d.k(x340Var, 1900825240, 2131960402, x340Var, false);
                } else if (oiw0Var instanceof liw0) {
                    strA = x0d.k(x340Var, 1900828376, 2131960407, x340Var, false);
                } else if (oiw0Var instanceof miw0) {
                    x340Var.i0(1900831328);
                    strA = cwl1.n0(2131960409, new Object[]{strA}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1900834043);
                    x340Var.r(false);
                }
                boolean z7 = z3;
                nyx.a(2, (wux) null, apo.r(1171314682, new erc(oiw0Var, z, z7, qim0Var4, strA, function0), x340Var), x340Var, 3078, 6);
                z3 = z7;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pwx(oiw0Var, function0, z, qim0Var3, z3, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z2;
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i3 & 1, z4)) {
            if (i6 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i4 != 0) {
                z3 = false;
            }
            strA = oiw0Var.a();
            if (oiw0Var instanceof jiw0) {
                strA = x0d.k(x340Var, 1900822329, 2131960403, x340Var, false);
            } else if (oiw0Var instanceof kiw0) {
                strA = x0d.k(x340Var, 1900825240, 2131960402, x340Var, false);
            } else if (oiw0Var instanceof liw0) {
                strA = x0d.k(x340Var, 1900828376, 2131960407, x340Var, false);
            } else if (oiw0Var instanceof miw0) {
                x340Var.i0(1900831328);
                strA = cwl1.n0(2131960409, new Object[]{strA}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1900834043);
                x340Var.r(false);
            }
            boolean z8 = z3;
            nyx.a(2, (wux) null, apo.r(1171314682, new erc(oiw0Var, z, z8, qim0Var4, strA, function0), x340Var), x340Var, 3078, 6);
            z3 = z8;
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pwx(oiw0Var, function0, z, qim0Var3, z3, i, i2);
        }
    }

    public static final void b(giw0 giw0Var, b0k b0kVar, int i) {
        giw0 giw0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1388595042);
        int i2 = (x340Var.g(giw0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            giw0Var2 = giw0Var;
            i(giw0Var2, t9j.e, null, null, 0.0f, x340Var, (i2 & 14) | 48, 28);
        } else {
            giw0Var2 = giw0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y6w0(giw0Var2, i, (byte) 2);
        }
    }

    public static final void c(hiw0 hiw0Var, giw0 giw0Var, b0k b0kVar, int i) {
        int i2;
        giw0 giw0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1210078966);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hiw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(giw0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            giw0Var2 = giw0Var;
            i(giw0Var2, t9j.a, k(hiw0Var.f, x340Var), apo.r(14386297, new y6w0(hiw0Var, (byte) 3), x340Var), 0.0f, x340Var, ((i2 >> 3) & 14) | 3120, 16);
        } else {
            giw0Var2 = giw0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(hiw0Var, giw0Var2, i, (byte) 15);
        }
    }

    public static final void d(iiw0 iiw0Var, giw0 giw0Var, b0k b0kVar, int i) {
        int i2;
        giw0 giw0Var2;
        cb80 cb80VarG;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1208223100);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iiw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(giw0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = iiw0Var.c;
            PathInterpolator pathInterpolator = vaw0.a;
            Object obj = fkj0.X;
            if (z) {
                x340Var.i0(-2104354983);
                db80 db80VarR = t5p1.r("Idle Alpha Transition", x340Var, 0);
                Object objT = x340Var.T();
                if (objT == obj) {
                    objT = p2g.c;
                    x340Var.s0(objT);
                }
                cb80VarG = t5p1.g(db80VarR, 0.6f, 1.0f, irn1.Y(new pxg1(650, 150, (dlv) objT), 2, 0L, 4), "Idle Alpha Animation", x340Var, 29112, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-2104303399);
                Object objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = us71.i(1.0f, x340Var);
                }
                cb80VarG = (drr0) objT2;
                x340Var.r(false);
            }
            giw0Var2 = giw0Var;
            i(giw0Var2, t9j.b, k(iiw0Var.f, x340Var), apo.r(69787691, new hws0(iiw0Var, cb80VarG, (byte) 25), x340Var), 0.0f, x340Var, ((i2 >> 3) & 14) | 3120, 16);
        } else {
            giw0Var2 = giw0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(iiw0Var, giw0Var2, i, (byte) 16);
        }
    }

    public static final void e(long j, b0k b0kVar, int i) {
        long j2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-281867699);
        int i2 = (x340Var.f(j) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarV = u291.v(nim0.a, 16.0f);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            j2 = j;
            wkt0.a(zkt0.a, u291.h(qim0VarV, 16.0f), (ksl) null, j2, false, x340Var, ((i2 << 9) & 7168) | 6, 20);
        } else {
            j2 = j;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q9j0(j2, i, (byte) 13);
        }
    }

    public static final void f(niw0 niw0Var, giw0 giw0Var, b0k b0kVar, int i) {
        int i2;
        giw0 giw0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(37985910);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(niw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(giw0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            giw0Var2 = giw0Var;
            i(giw0Var2, t9j.d, null, apo.r(2081117351, new diw0(niw0Var, (byte) 1), x340Var), 0.0f, x340Var, ((i2 >> 3) & 14) | 3120, 20);
        } else {
            giw0Var2 = giw0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(niw0Var, giw0Var2, i, (byte) 17);
        }
    }

    public static final void g(miw0 miw0Var, giw0 giw0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        j2i j2iVarK;
        k4m k4mVar = miw0Var.k;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-724636802);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(miw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(giw0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2i j2iVar = t9j.c;
            if (k4mVar == k4m.d) {
                x340Var.i0(-1149033458);
                x340Var.r(false);
                j2iVarK = null;
            } else {
                x340Var.i0(-1149004473);
                j2iVarK = k(k4mVar, x340Var);
                x340Var.r(false);
            }
            i(giw0Var, j2iVar, j2iVarK, apo.r(-114951763, new hws0(miw0Var, function0, (byte) 26), x340Var), 0.0f, x340Var, ((i2 >> 3) & 14) | 3120, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(miw0Var, giw0Var, function0, i, (byte) 3);
        }
    }

    public static final void h(oiw0 oiw0Var, giw0 giw0Var, b0k b0kVar, int i) {
        int i2;
        giw0 giw0Var2;
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(768110437);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(oiw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(giw0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            float f = oiw0Var.a().length() == 0 ? 10.0f : 12.0f;
            if (oiw0Var.a().length() > 0) {
                x340Var.i0(-807324116);
                j2iVarR = apo.r(85629145, new hws0(oiw0Var, giw0Var, (byte) 27), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-807240200);
                x340Var.r(false);
                j2iVarR = null;
            }
            j2i j2iVar = j2iVarR;
            giw0Var2 = giw0Var;
            i(giw0Var2, t9j.f, null, j2iVar, f, x340Var, ((i2 >> 3) & 14) | 48, 4);
        } else {
            giw0Var2 = giw0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(oiw0Var, giw0Var2, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:104:0x022e  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3 A[PHI: r4 r7 r9
      0x00b3: PHI (r4v15 int) = (r4v8 int), (r4v8 int), (r4v17 int) binds: [B:70:0x00c4, B:62:0x00b0, B:63:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r7v14 p.vu30) = (r7v4 p.vu30), (r7v2 p.vu30), (r7v2 p.vu30) binds: [B:70:0x00c4, B:62:0x00b0, B:63:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r9v10 p.vu30) = (r9v4 p.vu30), (r9v2 p.vu30), (r9v2 p.vu30) binds: [B:70:0x00c4, B:62:0x00b0, B:63:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0182  */
    /* JADX WARN: Code duplicated, block: B:84:0x0188  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    public static final void i(giw0 giw0Var, j2i j2iVar, vu30 vu30Var, vu30 vu30Var2, float f, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var3;
        int i4;
        vu30 vu30Var4;
        int i5;
        float f2;
        boolean z;
        vu30 vu30Var5;
        vu30 vu30Var6;
        float f3;
        h311 h311VarV;
        int i6;
        vu30 vu30Var7;
        float f4;
        vu30 vu30Var8;
        qim0 qim0Var;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        Function0 function0;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        f36 f36Var;
        qim0 qim0Var2;
        Function0 function1;
        boolean z3;
        float f5;
        boolean z4;
        era eraVar = een.P0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-610324192);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(giw0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                vu30Var3 = vu30Var;
                i3 |= x340Var.i(vu30Var3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    vu30Var4 = vu30Var2;
                    if (x340Var.i(vu30Var4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        f2 = f;
                        int i8 = x340Var.d(f2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        f2 = f;
                    }
                    i3 |= i8;
                } else {
                    f2 = f;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        }
                        if ((i2 & 16) != 0) {
                            vu30 vu30Var9 = vu30Var3;
                            i6 = i3 & (-57345);
                            vu30Var7 = vu30Var9;
                            f4 = 12.0f;
                            vu30Var8 = vu30Var4;
                        }
                        x340Var.s();
                        float f6 = giw0Var.a;
                        qim0Var = nim0.a;
                        qim0 qim0VarB = uyn1.B(u291.b(0.0f, f6, 1, qim0Var), f4, 0.0f, f4, 0.0f, 10);
                        jw31VarA = ew31.a(h36.f, een.N0, x340Var, 0);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarB);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        z2 = x340Var.S;
                        function0 = hmb0.t1;
                        if (z2) {
                            x340Var.l(function0);
                        } else {
                            x340Var.v0();
                        }
                        lljVar = y580.O0;
                        nko1.H(jw31VarA, x340Var, lljVar);
                        lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var, lljVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        lljVar3 = y580.R0;
                        nko1.H(numValueOf, x340Var, lljVar3);
                        nko1.F(x340Var);
                        lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var, lljVar4);
                        j2iVar.invoke(pw31.a, x340Var, Integer.valueOf((i6 & 112) | 6));
                        f36Var = h36.c;
                        if (vu30Var7 == null) {
                            x340Var.i0(1705218723);
                            x340Var.r(false);
                            qim0Var2 = qim0Var;
                            z3 = false;
                            function1 = function0;
                        } else {
                            x340Var.i0(1705218724);
                            qim0Var2 = qim0Var;
                            qim0 qim0VarB2 = uyn1.B(qim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                            int iHashCode2 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM2 = x340Var.m();
                            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                            x340Var.m0();
                            if (x340Var.S) {
                                function1 = function0;
                                x340Var.l(function1);
                            } else {
                                function1 = function0;
                                x340Var.v0();
                            }
                            nko1.H(mbhVarA, x340Var, lljVar);
                            nko1.H(xos0VarM2, x340Var, lljVar2);
                            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                            nko1.H(qim0VarE2, x340Var, lljVar4);
                            z3 = false;
                            us71.k(0, vu30Var7, x340Var, true, false);
                        }
                        if (vu30Var8 == null) {
                            x340Var.i0(1705304903);
                            x340Var.r(z3);
                            z4 = true;
                        } else {
                            x340Var.i0(1705304904);
                            if (vu30Var7 != null) {
                                f5 = 4.0f;
                            } else {
                                f5 = 8.0f;
                            }
                            qim0 qim0VarB3 = uyn1.B(qim0Var2, f5, 0.0f, 0.0f, 0.0f, 14);
                            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                            int iHashCode3 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM3 = x340Var.m();
                            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB3);
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(mbhVarA2, x340Var, lljVar);
                            nko1.H(xos0VarM3, x340Var, lljVar2);
                            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                            nko1.H(qim0VarE3, x340Var, lljVar4);
                            b3o1.j(j(giw0Var, x340Var), 0L, apo.r(-1371948867, new k7f((byte) 28, vu30Var8, false), x340Var), x340Var, 384, 2);
                            z4 = true;
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                        x340Var.r(z4);
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                        f3 = f4;
                    } else {
                        x340Var.b0();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    vu30 vu30Var10 = vu30Var3;
                    i6 = i3;
                    vu30Var7 = vu30Var10;
                    vu30Var8 = vu30Var4;
                    f4 = f2;
                    x340Var.s();
                    float f7 = giw0Var.a;
                    qim0Var = nim0.a;
                    qim0 qim0VarB4 = uyn1.B(u291.b(0.0f, f7, 1, qim0Var), f4, 0.0f, f4, 0.0f, 10);
                    jw31VarA = ew31.a(h36.f, een.N0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarB4);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z2 = x340Var.S;
                    function0 = hmb0.t1;
                    if (z2) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf2, x340Var, lljVar3);
                    nko1.F(x340Var);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    j2iVar.invoke(pw31.a, x340Var, Integer.valueOf((i6 & 112) | 6));
                    f36Var = h36.c;
                    if (vu30Var7 == null) {
                        x340Var.i0(1705218723);
                        x340Var.r(false);
                        qim0Var2 = qim0Var;
                        z3 = false;
                        function1 = function0;
                    } else {
                        x340Var.i0(1705218724);
                        qim0Var2 = qim0Var;
                        qim0 qim0VarB5 = uyn1.B(qim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode4 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM4 = x340Var.m();
                        qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB5);
                        x340Var.m0();
                        if (x340Var.S) {
                            function1 = function0;
                            x340Var.l(function1);
                        } else {
                            function1 = function0;
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA3, x340Var, lljVar);
                        nko1.H(xos0VarM4, x340Var, lljVar2);
                        x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE4, x340Var, lljVar4);
                        z3 = false;
                        us71.k(0, vu30Var7, x340Var, true, false);
                    }
                    if (vu30Var8 == null) {
                        x340Var.i0(1705304903);
                        x340Var.r(z3);
                        z4 = true;
                    } else {
                        x340Var.i0(1705304904);
                        if (vu30Var7 != null) {
                            f5 = 4.0f;
                        } else {
                            f5 = 8.0f;
                        }
                        qim0 qim0VarB6 = uyn1.B(qim0Var2, f5, 0.0f, 0.0f, 0.0f, 14);
                        mbh mbhVarA4 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode5 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM5 = x340Var.m();
                        qim0 qim0VarE5 = zr7.E(x340Var, qim0VarB6);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA4, x340Var, lljVar);
                        nko1.H(xos0VarM5, x340Var, lljVar2);
                        x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE5, x340Var, lljVar4);
                        b3o1.j(j(giw0Var, x340Var), 0L, apo.r(-1371948867, new k7f((byte) 28, vu30Var8, false), x340Var), x340Var, 384, 2);
                        z4 = true;
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    x340Var.r(z4);
                    vu30Var5 = vu30Var7;
                    vu30Var6 = vu30Var8;
                    f3 = f4;
                } else {
                    x340Var.b0();
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    f3 = f2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fst(giw0Var, j2iVar, vu30Var5, vu30Var6, f3, i, i2, (byte) 2);
                }
            }
            i3 |= 3072;
            vu30Var4 = vu30Var2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                    }
                    i3 |= i8;
                } else {
                    f2 = f;
                }
                i3 |= i8;
            } else {
                f2 = f;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        vu30 vu30Var11 = vu30Var3;
                        i6 = i3 & (-57345);
                        vu30Var7 = vu30Var11;
                        f4 = 12.0f;
                        vu30Var8 = vu30Var4;
                    } else {
                        vu30 vu30Var12 = vu30Var3;
                        i6 = i3;
                        vu30Var7 = vu30Var12;
                        vu30Var8 = vu30Var4;
                        f4 = f2;
                    }
                } else {
                    if (i7 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        vu30 vu30Var13 = vu30Var3;
                        i6 = i3 & (-57345);
                        vu30Var7 = vu30Var13;
                        f4 = 12.0f;
                        vu30Var8 = vu30Var4;
                    } else {
                        vu30 vu30Var14 = vu30Var3;
                        i6 = i3;
                        vu30Var7 = vu30Var14;
                        vu30Var8 = vu30Var4;
                        f4 = f2;
                    }
                }
                x340Var.s();
                float f8 = giw0Var.a;
                qim0Var = nim0.a;
                qim0 qim0VarB7 = uyn1.B(u291.b(0.0f, f8, 1, qim0Var), f4, 0.0f, f4, 0.0f, 10);
                jw31VarA = ew31.a(h36.f, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB7);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                function0 = hmb0.t1;
                if (z2) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                j2iVar.invoke(pw31.a, x340Var, Integer.valueOf((i6 & 112) | 6));
                f36Var = h36.c;
                if (vu30Var7 == null) {
                    x340Var.i0(1705218723);
                    x340Var.r(false);
                    qim0Var2 = qim0Var;
                    z3 = false;
                    function1 = function0;
                } else {
                    x340Var.i0(1705218724);
                    qim0Var2 = qim0Var;
                    qim0 qim0VarB8 = uyn1.B(qim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    mbh mbhVarA5 = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB8);
                    x340Var.m0();
                    if (x340Var.S) {
                        function1 = function0;
                        x340Var.l(function1);
                    } else {
                        function1 = function0;
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA5, x340Var, lljVar);
                    nko1.H(xos0VarM6, x340Var, lljVar2);
                    x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE6, x340Var, lljVar4);
                    z3 = false;
                    us71.k(0, vu30Var7, x340Var, true, false);
                }
                if (vu30Var8 == null) {
                    x340Var.i0(1705304903);
                    x340Var.r(z3);
                    z4 = true;
                } else {
                    x340Var.i0(1705304904);
                    if (vu30Var7 != null) {
                        f5 = 4.0f;
                    } else {
                        f5 = 8.0f;
                    }
                    qim0 qim0VarB9 = uyn1.B(qim0Var2, f5, 0.0f, 0.0f, 0.0f, 14);
                    mbh mbhVarA6 = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode7 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM7 = x340Var.m();
                    qim0 qim0VarE7 = zr7.E(x340Var, qim0VarB9);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA6, x340Var, lljVar);
                    nko1.H(xos0VarM7, x340Var, lljVar2);
                    x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE7, x340Var, lljVar4);
                    b3o1.j(j(giw0Var, x340Var), 0L, apo.r(-1371948867, new k7f((byte) 28, vu30Var8, false), x340Var), x340Var, 384, 2);
                    z4 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z4);
                vu30Var5 = vu30Var7;
                vu30Var6 = vu30Var8;
                f3 = f4;
            } else {
                x340Var.b0();
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fst(giw0Var, j2iVar, vu30Var5, vu30Var6, f3, i, i2, (byte) 2);
            }
        }
        i3 |= 384;
        vu30Var3 = vu30Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                vu30Var4 = vu30Var2;
                if (x340Var.i(vu30Var4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                    }
                    i3 |= i8;
                } else {
                    f2 = f;
                }
                i3 |= i8;
            } else {
                f2 = f;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        vu30 vu30Var15 = vu30Var3;
                        i6 = i3 & (-57345);
                        vu30Var7 = vu30Var15;
                        f4 = 12.0f;
                        vu30Var8 = vu30Var4;
                    } else {
                        vu30 vu30Var16 = vu30Var3;
                        i6 = i3;
                        vu30Var7 = vu30Var16;
                        vu30Var8 = vu30Var4;
                        f4 = f2;
                    }
                } else {
                    if (i7 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        vu30 vu30Var17 = vu30Var3;
                        i6 = i3 & (-57345);
                        vu30Var7 = vu30Var17;
                        f4 = 12.0f;
                        vu30Var8 = vu30Var4;
                    } else {
                        vu30 vu30Var18 = vu30Var3;
                        i6 = i3;
                        vu30Var7 = vu30Var18;
                        vu30Var8 = vu30Var4;
                        f4 = f2;
                    }
                }
                x340Var.s();
                float f9 = giw0Var.a;
                qim0Var = nim0.a;
                qim0 qim0VarB10 = uyn1.B(u291.b(0.0f, f9, 1, qim0Var), f4, 0.0f, f4, 0.0f, 10);
                jw31VarA = ew31.a(h36.f, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB10);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                function0 = hmb0.t1;
                if (z2) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf4, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                j2iVar.invoke(pw31.a, x340Var, Integer.valueOf((i6 & 112) | 6));
                f36Var = h36.c;
                if (vu30Var7 == null) {
                    x340Var.i0(1705218723);
                    x340Var.r(false);
                    qim0Var2 = qim0Var;
                    z3 = false;
                    function1 = function0;
                } else {
                    x340Var.i0(1705218724);
                    qim0Var2 = qim0Var;
                    qim0 qim0VarB11 = uyn1.B(qim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    mbh mbhVarA7 = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode8 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM8 = x340Var.m();
                    qim0 qim0VarE8 = zr7.E(x340Var, qim0VarB11);
                    x340Var.m0();
                    if (x340Var.S) {
                        function1 = function0;
                        x340Var.l(function1);
                    } else {
                        function1 = function0;
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA7, x340Var, lljVar);
                    nko1.H(xos0VarM8, x340Var, lljVar2);
                    x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE8, x340Var, lljVar4);
                    z3 = false;
                    us71.k(0, vu30Var7, x340Var, true, false);
                }
                if (vu30Var8 == null) {
                    x340Var.i0(1705304903);
                    x340Var.r(z3);
                    z4 = true;
                } else {
                    x340Var.i0(1705304904);
                    if (vu30Var7 != null) {
                        f5 = 4.0f;
                    } else {
                        f5 = 8.0f;
                    }
                    qim0 qim0VarB12 = uyn1.B(qim0Var2, f5, 0.0f, 0.0f, 0.0f, 14);
                    mbh mbhVarA8 = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode9 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM9 = x340Var.m();
                    qim0 qim0VarE9 = zr7.E(x340Var, qim0VarB12);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA8, x340Var, lljVar);
                    nko1.H(xos0VarM9, x340Var, lljVar2);
                    x0d.q(iHashCode9, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE9, x340Var, lljVar4);
                    b3o1.j(j(giw0Var, x340Var), 0L, apo.r(-1371948867, new k7f((byte) 28, vu30Var8, false), x340Var), x340Var, 384, 2);
                    z4 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z4);
                vu30Var5 = vu30Var7;
                vu30Var6 = vu30Var8;
                f3 = f4;
            } else {
                x340Var.b0();
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fst(giw0Var, j2iVar, vu30Var5, vu30Var6, f3, i, i2, (byte) 2);
            }
        }
        i3 |= 3072;
        vu30Var4 = vu30Var2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                }
                i3 |= i8;
            } else {
                f2 = f;
            }
            i3 |= i8;
        } else {
            f2 = f;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    vu30Var3 = null;
                }
                if (i4 != 0) {
                    vu30Var4 = null;
                }
                if ((i2 & 16) != 0) {
                    vu30 vu30Var19 = vu30Var3;
                    i6 = i3 & (-57345);
                    vu30Var7 = vu30Var19;
                    f4 = 12.0f;
                    vu30Var8 = vu30Var4;
                } else {
                    vu30 vu30Var110 = vu30Var3;
                    i6 = i3;
                    vu30Var7 = vu30Var110;
                    vu30Var8 = vu30Var4;
                    f4 = f2;
                }
            } else {
                if (i7 != 0) {
                    vu30Var3 = null;
                }
                if (i4 != 0) {
                    vu30Var4 = null;
                }
                if ((i2 & 16) != 0) {
                    vu30 vu30Var111 = vu30Var3;
                    i6 = i3 & (-57345);
                    vu30Var7 = vu30Var111;
                    f4 = 12.0f;
                    vu30Var8 = vu30Var4;
                } else {
                    vu30 vu30Var112 = vu30Var3;
                    i6 = i3;
                    vu30Var7 = vu30Var112;
                    vu30Var8 = vu30Var4;
                    f4 = f2;
                }
            }
            x340Var.s();
            float f10 = giw0Var.a;
            qim0Var = nim0.a;
            qim0 qim0VarB13 = uyn1.B(u291.b(0.0f, f10, 1, qim0Var), f4, 0.0f, f4, 0.0f, 10);
            jw31VarA = ew31.a(h36.f, een.N0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB13);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z2 = x340Var.S;
            function0 = hmb0.t1;
            if (z2) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf5 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf5, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            j2iVar.invoke(pw31.a, x340Var, Integer.valueOf((i6 & 112) | 6));
            f36Var = h36.c;
            if (vu30Var7 == null) {
                x340Var.i0(1705218723);
                x340Var.r(false);
                qim0Var2 = qim0Var;
                z3 = false;
                function1 = function0;
            } else {
                x340Var.i0(1705218724);
                qim0Var2 = qim0Var;
                qim0 qim0VarB14 = uyn1.B(qim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                mbh mbhVarA9 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode10 = Long.hashCode(x340Var.T);
                xos0 xos0VarM10 = x340Var.m();
                qim0 qim0VarE10 = zr7.E(x340Var, qim0VarB14);
                x340Var.m0();
                if (x340Var.S) {
                    function1 = function0;
                    x340Var.l(function1);
                } else {
                    function1 = function0;
                    x340Var.v0();
                }
                nko1.H(mbhVarA9, x340Var, lljVar);
                nko1.H(xos0VarM10, x340Var, lljVar2);
                x0d.q(iHashCode10, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE10, x340Var, lljVar4);
                z3 = false;
                us71.k(0, vu30Var7, x340Var, true, false);
            }
            if (vu30Var8 == null) {
                x340Var.i0(1705304903);
                x340Var.r(z3);
                z4 = true;
            } else {
                x340Var.i0(1705304904);
                if (vu30Var7 != null) {
                    f5 = 4.0f;
                } else {
                    f5 = 8.0f;
                }
                qim0 qim0VarB15 = uyn1.B(qim0Var2, f5, 0.0f, 0.0f, 0.0f, 14);
                mbh mbhVarA10 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode11 = Long.hashCode(x340Var.T);
                xos0 xos0VarM11 = x340Var.m();
                qim0 qim0VarE11 = zr7.E(x340Var, qim0VarB15);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA10, x340Var, lljVar);
                nko1.H(xos0VarM11, x340Var, lljVar2);
                x0d.q(iHashCode11, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE11, x340Var, lljVar4);
                b3o1.j(j(giw0Var, x340Var), 0L, apo.r(-1371948867, new k7f((byte) 28, vu30Var8, false), x340Var), x340Var, 384, 2);
                z4 = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z4);
            vu30Var5 = vu30Var7;
            vu30Var6 = vu30Var8;
            f3 = f4;
        } else {
            x340Var.b0();
            vu30Var5 = vu30Var3;
            vu30Var6 = vu30Var4;
            f3 = f2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fst(giw0Var, j2iVar, vu30Var5, vu30Var6, f3, i, i2, (byte) 2);
        }
    }

    public static final lee1 j(giw0 giw0Var, b0k b0kVar) {
        if (giw0Var.c) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1546977765);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).o;
            x340Var.r(false);
            return lee1Var;
        }
        if (giw0Var.b) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-1546976104);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var2).g;
            x340Var2.r(false);
            return lee1Var2;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-1546974793);
        uwr uwrVar3 = cbx.a;
        lee1 lee1Var3 = cbx.d(x340Var3).j;
        x340Var3.r(false);
        return lee1Var3;
    }

    public static final j2i k(k4m k4mVar, b0k b0kVar) {
        if (eiw0.a[k4mVar.ordinal()] == 1) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-452278803);
            x340Var.r(false);
            return null;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-452254622);
        j2i j2iVarR = apo.r(1363829132, new y6w0(k4mVar, (byte) 4), x340Var2);
        x340Var2.r(false);
        return j2iVarR;
    }
}
