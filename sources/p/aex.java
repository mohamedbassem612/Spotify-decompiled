package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class aex {
    public static final cr31 a = er31.b(3.0f);

    public static final void a(boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(934782431);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.b;
            cr31 cr31Var = a;
            qim0 qim0VarQ = k8p1.q(k8p1.q(u291.r(nim0Var, 16.0f), !z, d1u.E(1.0f, j, nim0Var, cr31Var)), z, dug.f(nim0Var, cbx.a(x340Var).c.f, cr31Var));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(-1341384870);
                eso1.g((b180) rvf.a.getValue(), isl.a, (qim0) null, new p3v(16.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, new f2b(cbx.a(x340Var).a.c, 5), x340Var, 221232, 196);
                x340Var.r(false);
            } else {
                x340Var.i0(-1341105219);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zdx(b, i, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0188  */
    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0246  */
    /* JADX WARN: Code duplicated, block: B:114:0x0262  */
    /* JADX WARN: Code duplicated, block: B:116:0x0266  */
    /* JADX WARN: Code duplicated, block: B:119:0x0276  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0154  */
    /* JADX WARN: Code duplicated, block: B:94:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    public static final void b(boolean z, iu30 iu30Var, qim0 qim0Var, String str, int i, idn0 idn0Var, ga80 ga80Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        String str2;
        int i6;
        int i7;
        idn0 idn0VarY;
        boolean z2;
        int i8;
        ga80 ga80Var2;
        qim0 qim0Var3;
        idn0 idn0Var2;
        String str3;
        h311 h311VarV;
        int i9;
        qim0 qim0Var4;
        ga80 ga80VarO;
        int i10;
        int i11;
        idn0 idn0Var3;
        int i12;
        qim0 qim0Var5;
        boolean z3;
        int i13;
        boolean z4;
        boolean z5;
        Object objT;
        ga80 ga80Var3;
        jw31 jw31VarA;
        String str4;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int iC;
        boolean z6;
        int i14;
        x340 x340Var;
        boolean z7;
        String str5;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(636875896);
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i2 & 384) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var2.i(qim0Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    str2 = str;
                    if (x340Var2.g(str2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        idn0VarY = idn0Var;
                        int i16 = x340Var2.i(idn0VarY) ? 131072 : 65536;
                        i7 |= i16;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    i7 |= i16;
                } else {
                    idn0VarY = idn0Var;
                }
                if ((1572864 & i2) == 0) {
                    i7 |= 524288;
                }
                if ((599187 & i7) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var2.Y(i7 & 1, z2)) {
                    x340Var2.d0();
                    i9 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i9 != 0 || x340Var2.E()) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            str2 = null;
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            idn0VarY = zso1.Y(x340Var2);
                        }
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(x340Var2).f;
                        ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                        i10 = i7 & (-3670017);
                        i11 = 2;
                    } else {
                        x340Var2.b0();
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                        }
                        i10 = i7 & (-3670017);
                        i11 = i;
                        ga80VarO = ga80Var;
                    }
                    idn0Var3 = idn0VarY;
                    i12 = i10;
                    qim0Var5 = qim0Var2;
                    x340Var2.s();
                    pm31 pm31Var = new pm31(1);
                    if ((i12 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i13 = i12 & 14;
                    if (i13 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z4 | z3;
                    objT = x340Var2.T();
                    if (z5 || objT == fkj0.X) {
                        objT = new z20(iu30Var, z, (byte) 14);
                        x340Var2.s0(objT);
                    }
                    ga80Var3 = ga80VarO;
                    qim0 qim0VarP = dgo1.p(qim0Var5, z, idn0Var3, ga80Var3, true, pm31Var, (Function0) objT);
                    jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    str4 = str2;
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarP);
                    hzj.A.getClass();
                    if (x340Var2.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    iC = l1d.C(i11);
                    if (iC != 0) {
                        z6 = true;
                        if (iC == 1) {
                            throw p3d1.k(x340Var2, 980125623, false);
                        }
                        x340Var2.i0(319415201);
                        a(z, x340Var2, i13);
                        if (str4 != null) {
                            x340Var2.i0(319470691);
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar = cbx.b(x340Var2).b;
                            z7 = false;
                            str5 = str4;
                            uwo1.e(str5, null, ktd.l(qim0Var4, 12.0f, x340Var2, x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                            x340Var = x340Var2;
                            x340Var.r(false);
                        } else {
                            x340Var = x340Var2;
                            z7 = false;
                            str5 = str4;
                            x340Var.i0(319627334);
                            x340Var.r(false);
                        }
                        x340Var.r(z7);
                        str2 = str5;
                        x340Var2 = x340Var;
                    } else {
                        z6 = true;
                        str2 = str4;
                        x340Var2.i0(319176160);
                        if (str2 != null) {
                            x340Var2.i0(319202882);
                            uwr uwrVar3 = cbx.a;
                            i14 = i13;
                            uwo1.e(str2, null, cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                            x340Var2 = x340Var2;
                            op71.g(x340Var2, new wnb0(1.0f, true));
                            x340Var2.r(false);
                        } else {
                            x340Var2 = x340Var2;
                            i14 = i13;
                            x340Var2.i0(319329734);
                            x340Var2.r(false);
                        }
                        a(z, x340Var2, i14);
                        x340Var2.r(false);
                    }
                    x340Var2.r(z6);
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    i8 = i11;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var2.b0();
                    i8 = i;
                    ga80Var2 = ga80Var;
                    qim0Var3 = qim0Var2;
                    idn0Var2 = idn0VarY;
                }
                str3 = str2;
                h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new rk9(z, iu30Var, qim0Var3, str3, i8, idn0Var2, ga80Var2, i2, i3);
                }
            }
            i4 |= 3072;
            str2 = str;
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    idn0VarY = idn0Var;
                    if (x340Var2.i(idn0VarY)) {
                    }
                    i7 |= i16;
                } else {
                    idn0VarY = idn0Var;
                }
                i7 |= i16;
            } else {
                idn0VarY = idn0Var;
            }
            if ((1572864 & i2) == 0) {
                i7 |= 524288;
            }
            if ((599187 & i7) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i7 & 1, z2)) {
                x340Var2.d0();
                i9 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i9 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        idn0VarY = zso1.Y(x340Var2);
                    }
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var2).f;
                    ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                    i10 = i7 & (-3670017);
                    i11 = 2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        idn0VarY = zso1.Y(x340Var2);
                    }
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var2).f;
                    ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                    i10 = i7 & (-3670017);
                    i11 = 2;
                }
                idn0Var3 = idn0VarY;
                i12 = i10;
                qim0Var5 = qim0Var2;
                x340Var2.s();
                pm31 pm31Var2 = new pm31(1);
                if ((i12 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i13 = i12 & 14;
                if (i13 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                objT = x340Var2.T();
                if (z5) {
                    objT = new z20(iu30Var, z, (byte) 14);
                    x340Var2.s0(objT);
                } else {
                    objT = new z20(iu30Var, z, (byte) 14);
                    x340Var2.s0(objT);
                }
                ga80Var3 = ga80VarO;
                qim0 qim0VarP2 = dgo1.p(qim0Var5, z, idn0Var3, ga80Var3, true, pm31Var2, (Function0) objT);
                jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                str4 = str2;
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarP2);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                iC = l1d.C(i11);
                if (iC != 0) {
                    z6 = true;
                    if (iC == 1) {
                        throw p3d1.k(x340Var2, 980125623, false);
                    }
                    x340Var2.i0(319415201);
                    a(z, x340Var2, i13);
                    if (str4 != null) {
                        x340Var2.i0(319470691);
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        z7 = false;
                        str5 = str4;
                        uwo1.e(str5, null, ktd.l(qim0Var4, 12.0f, x340Var2, x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var2;
                        z7 = false;
                        str5 = str4;
                        x340Var.i0(319627334);
                        x340Var.r(false);
                    }
                    x340Var.r(z7);
                    str2 = str5;
                    x340Var2 = x340Var;
                } else {
                    z6 = true;
                    str2 = str4;
                    x340Var2.i0(319176160);
                    if (str2 != null) {
                        x340Var2.i0(319202882);
                        uwr uwrVar7 = cbx.a;
                        i14 = i13;
                        uwo1.e(str2, null, cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                        x340Var2 = x340Var2;
                        op71.g(x340Var2, new wnb0(1.0f, true));
                        x340Var2.r(false);
                    } else {
                        x340Var2 = x340Var2;
                        i14 = i13;
                        x340Var2.i0(319329734);
                        x340Var2.r(false);
                    }
                    a(z, x340Var2, i14);
                    x340Var2.r(false);
                }
                x340Var2.r(z6);
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80Var3;
                i8 = i11;
                qim0Var3 = qim0Var5;
            } else {
                x340Var2.b0();
                i8 = i;
                ga80Var2 = ga80Var;
                qim0Var3 = qim0Var2;
                idn0Var2 = idn0VarY;
            }
            str3 = str2;
            h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new rk9(z, iu30Var, qim0Var3, str3, i8, idn0Var2, ga80Var2, i2, i3);
            }
        }
        i4 |= 384;
        qim0Var2 = qim0Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                str2 = str;
                if (x340Var2.g(str2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    idn0VarY = idn0Var;
                    if (x340Var2.i(idn0VarY)) {
                    }
                    i7 |= i16;
                } else {
                    idn0VarY = idn0Var;
                }
                i7 |= i16;
            } else {
                idn0VarY = idn0Var;
            }
            if ((1572864 & i2) == 0) {
                i7 |= 524288;
            }
            if ((599187 & i7) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i7 & 1, z2)) {
                x340Var2.d0();
                i9 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i9 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        idn0VarY = zso1.Y(x340Var2);
                    }
                    uwr uwrVar8 = cbx.a;
                    cua cuaVar4 = cbx.b(x340Var2).f;
                    ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                    i10 = i7 & (-3670017);
                    i11 = 2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        str2 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        idn0VarY = zso1.Y(x340Var2);
                    }
                    uwr uwrVar9 = cbx.a;
                    cua cuaVar5 = cbx.b(x340Var2).f;
                    ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                    i10 = i7 & (-3670017);
                    i11 = 2;
                }
                idn0Var3 = idn0VarY;
                i12 = i10;
                qim0Var5 = qim0Var2;
                x340Var2.s();
                pm31 pm31Var3 = new pm31(1);
                if ((i12 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i13 = i12 & 14;
                if (i13 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                objT = x340Var2.T();
                if (z5) {
                    objT = new z20(iu30Var, z, (byte) 14);
                    x340Var2.s0(objT);
                } else {
                    objT = new z20(iu30Var, z, (byte) 14);
                    x340Var2.s0(objT);
                }
                ga80Var3 = ga80VarO;
                qim0 qim0VarP3 = dgo1.p(qim0Var5, z, idn0Var3, ga80Var3, true, pm31Var3, (Function0) objT);
                jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                str4 = str2;
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarP3);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                iC = l1d.C(i11);
                if (iC != 0) {
                    z6 = true;
                    if (iC == 1) {
                        throw p3d1.k(x340Var2, 980125623, false);
                    }
                    x340Var2.i0(319415201);
                    a(z, x340Var2, i13);
                    if (str4 != null) {
                        x340Var2.i0(319470691);
                        uwr uwrVar10 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        z7 = false;
                        str5 = str4;
                        uwo1.e(str5, null, ktd.l(qim0Var4, 12.0f, x340Var2, x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var2;
                        z7 = false;
                        str5 = str4;
                        x340Var.i0(319627334);
                        x340Var.r(false);
                    }
                    x340Var.r(z7);
                    str2 = str5;
                    x340Var2 = x340Var;
                } else {
                    z6 = true;
                    str2 = str4;
                    x340Var2.i0(319176160);
                    if (str2 != null) {
                        x340Var2.i0(319202882);
                        uwr uwrVar11 = cbx.a;
                        i14 = i13;
                        uwo1.e(str2, null, cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                        x340Var2 = x340Var2;
                        op71.g(x340Var2, new wnb0(1.0f, true));
                        x340Var2.r(false);
                    } else {
                        x340Var2 = x340Var2;
                        i14 = i13;
                        x340Var2.i0(319329734);
                        x340Var2.r(false);
                    }
                    a(z, x340Var2, i14);
                    x340Var2.r(false);
                }
                x340Var2.r(z6);
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80Var3;
                i8 = i11;
                qim0Var3 = qim0Var5;
            } else {
                x340Var2.b0();
                i8 = i;
                ga80Var2 = ga80Var;
                qim0Var3 = qim0Var2;
                idn0Var2 = idn0VarY;
            }
            str3 = str2;
            h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new rk9(z, iu30Var, qim0Var3, str3, i8, idn0Var2, ga80Var2, i2, i3);
            }
        }
        i4 |= 3072;
        str2 = str;
        i7 = i4 | 24576;
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                idn0VarY = idn0Var;
                if (x340Var2.i(idn0VarY)) {
                }
                i7 |= i16;
            } else {
                idn0VarY = idn0Var;
            }
            i7 |= i16;
        } else {
            idn0VarY = idn0Var;
        }
        if ((1572864 & i2) == 0) {
            i7 |= 524288;
        }
        if ((599187 & i7) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i7 & 1, z2)) {
            x340Var2.d0();
            i9 = i2 & 1;
            qim0Var4 = nim0.a;
            if (i9 != 0) {
                if (i15 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i5 != 0) {
                    str2 = null;
                }
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    idn0VarY = zso1.Y(x340Var2);
                }
                uwr uwrVar12 = cbx.a;
                cua cuaVar6 = cbx.b(x340Var2).f;
                ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                i10 = i7 & (-3670017);
                i11 = 2;
            } else {
                if (i15 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i5 != 0) {
                    str2 = null;
                }
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    idn0VarY = zso1.Y(x340Var2);
                }
                uwr uwrVar13 = cbx.a;
                cua cuaVar7 = cbx.b(x340Var2).f;
                ga80VarO = vno1.o(er31.b(6.0f), x340Var2, 0);
                i10 = i7 & (-3670017);
                i11 = 2;
            }
            idn0Var3 = idn0VarY;
            i12 = i10;
            qim0Var5 = qim0Var2;
            x340Var2.s();
            pm31 pm31Var4 = new pm31(1);
            if ((i12 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            i13 = i12 & 14;
            if (i13 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | z3;
            objT = x340Var2.T();
            if (z5) {
                objT = new z20(iu30Var, z, (byte) 14);
                x340Var2.s0(objT);
            } else {
                objT = new z20(iu30Var, z, (byte) 14);
                x340Var2.s0(objT);
            }
            ga80Var3 = ga80VarO;
            qim0 qim0VarP4 = dgo1.p(qim0Var5, z, idn0Var3, ga80Var3, true, pm31Var4, (Function0) objT);
            jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            str4 = str2;
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarP4);
            hzj.A.getClass();
            if (x340Var2.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            iC = l1d.C(i11);
            if (iC != 0) {
                z6 = true;
                if (iC == 1) {
                    throw p3d1.k(x340Var2, 980125623, false);
                }
                x340Var2.i0(319415201);
                a(z, x340Var2, i13);
                if (str4 != null) {
                    x340Var2.i0(319470691);
                    uwr uwrVar14 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    z7 = false;
                    str5 = str4;
                    uwo1.e(str5, null, ktd.l(qim0Var4, 12.0f, x340Var2, x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    z7 = false;
                    str5 = str4;
                    x340Var.i0(319627334);
                    x340Var.r(false);
                }
                x340Var.r(z7);
                str2 = str5;
                x340Var2 = x340Var;
            } else {
                z6 = true;
                str2 = str4;
                x340Var2.i0(319176160);
                if (str2 != null) {
                    x340Var2.i0(319202882);
                    uwr uwrVar15 = cbx.a;
                    i14 = i13;
                    uwo1.e(str2, null, cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, (i12 >> 9) & 14, 0, 2042);
                    x340Var2 = x340Var2;
                    op71.g(x340Var2, new wnb0(1.0f, true));
                    x340Var2.r(false);
                } else {
                    x340Var2 = x340Var2;
                    i14 = i13;
                    x340Var2.i0(319329734);
                    x340Var2.r(false);
                }
                a(z, x340Var2, i14);
                x340Var2.r(false);
            }
            x340Var2.r(z6);
            idn0Var2 = idn0Var3;
            ga80Var2 = ga80Var3;
            i8 = i11;
            qim0Var3 = qim0Var5;
        } else {
            x340Var2.b0();
            i8 = i;
            ga80Var2 = ga80Var;
            qim0Var3 = qim0Var2;
            idn0Var2 = idn0VarY;
        }
        str3 = str2;
        h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new rk9(z, iu30Var, qim0Var3, str3, i8, idn0Var2, ga80Var2, i2, i3);
        }
    }
}
