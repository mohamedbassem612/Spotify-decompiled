package p;

import android.graphics.Color;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class so60 {
    public static final long a = z4p1.g(4293914602L);
    public static final long b;
    public static final long c;
    public static final oex d;
    public static final oex e;
    public static final oex f;
    public static final oex g;

    static {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        b = ((yex) zscVar.d).a;
        c = ((vex) zscVar.e).c;
        d = new oex(4, (vu30) null, oq50.W0, (vu30) null, 10);
        e = new oex(1, (vu30) null, v30.X0, (vu30) null, 10);
        oq50 oq50Var = oq50.X0;
        oq50 oq50Var2 = oq50.Y0;
        f = new oex(1, oq50Var, oq50Var2, (vu30) null, 8);
        g = new oex(4, oq50.V0, oq50Var2, (vu30) null, 8);
    }

    public static final void a(un60 un60Var, c380 c380Var, gbx gbxVar, iu30 iu30Var, wj31 wj31Var, boolean z, boolean z2, qim0 qim0Var, boolean z3, vn60 vn60Var, b0k b0kVar, int i) {
        int i2;
        gbx gbxVar2;
        wj31 wj31Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(445875421);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(un60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gbxVar2 = gbxVar;
            i2 |= x340Var.g(gbxVar2) ? 256 : 128;
        } else {
            gbxVar2 = gbxVar;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.e(300) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            wj31Var2 = wj31Var;
            i2 |= x340Var.i(wj31Var2) ? 131072 : 65536;
        } else {
            wj31Var2 = wj31Var;
        }
        if ((1572864 & i) == 0) {
            z4 = z;
            i2 |= x340Var.h(z4) ? 1048576 : 524288;
        } else {
            z4 = z;
        }
        if ((12582912 & i) == 0) {
            z5 = z2;
            i2 |= x340Var.h(z5) ? 8388608 : 4194304;
        } else {
            z5 = z2;
        }
        int i3 = i2 | 100663296;
        if ((805306368 & i) == 0) {
            z6 = z3;
            i3 |= x340Var.h(z6) ? 536870912 : 268435456;
        } else {
            z6 = z3;
        }
        int i4 = i3;
        int i5 = x340Var.g(vn60Var) ? 4 : 2;
        if (x340Var.Y(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i6 = i4 >> 3;
            int i7 = i4 >> 9;
            b(un60Var, gbxVar2, wj31Var2, z4, z5, z6, x340Var, (i4 & 14) | (i6 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016));
            x340Var = x340Var;
            if (c380Var.isEmpty()) {
                x340Var.i0(2115299017);
                x340Var.r(false);
            } else {
                x340Var.i0(2115010717);
                c(un60Var, c380Var, iu30Var, z3, vn60Var, x340Var, (i4 & 126) | (i6 & 896) | (i6 & 7168) | ((i4 >> 15) & 57344) | ((i5 << 15) & 458752));
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mo60(un60Var, c380Var, gbxVar, iu30Var, wj31Var, z, z2, qim0Var2, z3, vn60Var, i);
        }
    }

    public static final void b(un60 un60Var, gbx gbxVar, wj31 wj31Var, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) {
        int i2;
        wj31 wj31Var2;
        boolean z4;
        gbx gbxVar2;
        boolean z5;
        un60 un60Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-448655223);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(un60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(gbxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(wj31Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(nim0.a) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z3) ? 1048576 : 524288;
        }
        if (!x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            wj31Var2 = wj31Var;
            z4 = z3;
            gbxVar2 = gbxVar;
            z5 = z2;
            un60Var2 = un60Var;
            x340Var.b0();
        } else if (z && un60Var.g == 4 && un60Var.f && un60Var.i != null) {
            x340Var.i0(51130272);
            wj31Var2 = wj31Var;
            k7m1.b(un60Var, gbxVar, wj31Var2, z3, z2, x340Var, (i2 & 1022) | ((i2 >> 9) & 7168) | (57344 & i2) | (i2 & 458752));
            un60Var2 = un60Var;
            gbxVar2 = gbxVar;
            z4 = z3;
            z5 = z2;
            x340Var.r(false);
        } else {
            wj31Var2 = wj31Var;
            z4 = z3;
            gbxVar2 = gbxVar;
            z5 = z2;
            un60Var2 = un60Var;
            x340Var.i0(51615794);
            gfx.b(z4 ? 4 : 1, apo.r(-39944350, new kn50(z4, un60Var2, gbxVar2), x340Var), x340Var, 48);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oo60(un60Var2, gbxVar2, wj31Var2, z, z5, z4, i);
        }
    }

    public static final void c(un60 un60Var, c380 c380Var, iu30 iu30Var, boolean z, vn60 vn60Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1069878131);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(un60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.e(300) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var.g(vn60Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            era eraVar = ((flb0) x340Var.k(t4k.n)) == flb0.a ? een.R0 : een.P0;
            int iI0 = ((wat) x340Var.k(t4k.h)).i0(21.0f);
            qim0 qim0VarX = j9k1.x(nim0.a, new ac8());
            int i3 = i2;
            pxg1 pxg1VarO0 = irn1.o0(300, 0, (dlv) null, 6);
            boolean zE = x340Var.e(iI0);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = new po60(iI0, (byte) 0);
                x340Var.s0(objT);
            }
            bby bbyVarB = xay.b(pxg1VarO0, eraVar, (iu30) objT, 4);
            pxg1 pxg1VarO1 = irn1.o0(300, 0, (dlv) null, 6);
            boolean zE2 = x340Var.e(iI0);
            Object objT2 = x340Var.T();
            if (zE2 || objT2 == m4cVar) {
                objT2 = new po60(iI0, (byte) 1);
                x340Var.s0(objT2);
            }
            fq7.g(z, qim0VarX, bbyVarB, xay.i(pxg1VarO1, eraVar, (iu30) objT2, 4), (String) null, apo.r(-120117173, new c9y(c380Var, vn60Var, iu30Var, un60Var, (byte) 5), x340Var), x340Var, ((i3 >> 12) & 14) | 196608, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(un60Var, c380Var, iu30Var, z, vn60Var, i, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    public static final void d(gbx gbxVar, qex qexVar, lex lexVar, boolean z, qim0 qim0Var, qex qexVar2, idn0 idn0Var, boolean z2, vzq0 vzq0Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        b0k b0kVar2;
        boolean z5;
        qim0 qim0Var3;
        qex qexVar3;
        idn0 idn0Var2;
        vzq0 vzq0Var2;
        h311 h311VarV;
        qex qexVar4;
        Object objT;
        int i7;
        idn0 idn0Var3;
        vzq0 vzq0VarG;
        qex qexVar5;
        boolean z6;
        Object objT2;
        int i8;
        int i9;
        boolean zI;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-264468730);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(qexVar) : b0kVar3.i(qexVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(lexVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) != 0) {
                    i9 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zI = b0kVar3.g(qexVar2);
                    } else {
                        zI = b0kVar3.i(qexVar2);
                    }
                    if (zI) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                }
                i3 |= i9;
            }
            i4 = 1572864 | i3;
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    z3 = z2;
                    if (b0kVar3.h(z3)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                if ((100663296 & i) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i) != 0) {
                    if (b0kVar3.i(vu30Var)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i4 |= i8;
                }
                if ((i4 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b0kVar3.Y(i4 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            qexVar4 = e;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        objT = b0kVar3.T();
                        if (objT == m4cVar) {
                            objT = zr7.d();
                            b0kVar3.s0(objT);
                        }
                        idn0 idn0Var4 = (idn0) objT;
                        if (i5 != 0) {
                            z3 = false;
                        }
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar3).b;
                        cvx cvxVar2 = cbx.b(b0kVar3).b;
                        i7 = (-234881025) & i4;
                        idn0Var3 = idn0Var4;
                        vzq0VarG = uyn1.g(6.0f);
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        idn0Var3 = idn0Var;
                        vzq0VarG = vzq0Var;
                        i7 = i4 & (-234881025);
                        qexVar4 = qexVar2;
                    }
                    boolean z7 = z3;
                    b0kVar3.s();
                    if (z) {
                        qexVar5 = qexVar;
                    } else {
                        qexVar5 = qexVar4;
                    }
                    qim0 qim0VarN = anm1.N("HomeFilterChip", qim0Var2);
                    z6 = (i7 & 7168) == 2048;
                    objT2 = b0kVar3.T();
                    if (z6 || objT2 == m4cVar) {
                        objT2 = new mj10((byte) 8, z);
                        b0kVar3.s0(objT2);
                    }
                    b0kVar2 = b0kVar3;
                    poo1.e(gbxVar, qexVar5, lexVar, s161.b(qim0VarN, false, (iu30) objT2), 0, (String) null, (max) null, (vu30) null, (vu30) null, idn0Var3, (ga80) null, z7, vzq0VarG, vu30Var, b0kVar2, (i7 & 910) | ((i7 << 9) & 1879048192), (i7 >> 18) & 8176, 1520);
                    qexVar3 = qexVar4;
                    qim0Var3 = qim0Var2;
                    idn0Var2 = idn0Var3;
                    z5 = z7;
                    vzq0Var2 = vzq0VarG;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0 qim0Var4 = qim0Var2;
                    z5 = z3;
                    qim0Var3 = qim0Var4;
                    qexVar3 = qexVar2;
                    idn0Var2 = idn0Var;
                    vzq0Var2 = vzq0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new qo60(gbxVar, qexVar, lexVar, z, qim0Var3, qexVar3, idn0Var2, z5, vzq0Var2, vu30Var, i, i2);
                }
            }
            i4 = 14155776 | i3;
            z3 = z2;
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (b0kVar3.i(vu30Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i4 |= i8;
            }
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i4 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        qexVar4 = e;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = zr7.d();
                        b0kVar3.s0(objT);
                    }
                    idn0 idn0Var5 = (idn0) objT;
                    if (i5 != 0) {
                        z3 = false;
                    }
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    cvx cvxVar4 = cbx.b(b0kVar3).b;
                    i7 = (-234881025) & i4;
                    idn0Var3 = idn0Var5;
                    vzq0VarG = uyn1.g(6.0f);
                } else {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        qexVar4 = e;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = zr7.d();
                        b0kVar3.s0(objT);
                    }
                    idn0 idn0Var6 = (idn0) objT;
                    if (i5 != 0) {
                        z3 = false;
                    }
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                    cvx cvxVar6 = cbx.b(b0kVar3).b;
                    i7 = (-234881025) & i4;
                    idn0Var3 = idn0Var6;
                    vzq0VarG = uyn1.g(6.0f);
                }
                boolean z8 = z3;
                b0kVar3.s();
                if (z) {
                    qexVar5 = qexVar;
                } else {
                    qexVar5 = qexVar4;
                }
                qim0 qim0VarN2 = anm1.N("HomeFilterChip", qim0Var2);
                if ((i7 & 7168) == 2048) {
                }
                objT2 = b0kVar3.T();
                if (z6) {
                    objT2 = new mj10((byte) 8, z);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new mj10((byte) 8, z);
                    b0kVar3.s0(objT2);
                }
                b0kVar2 = b0kVar3;
                poo1.e(gbxVar, qexVar5, lexVar, s161.b(qim0VarN2, false, (iu30) objT2), 0, (String) null, (max) null, (vu30) null, (vu30) null, idn0Var3, (ga80) null, z8, vzq0VarG, vu30Var, b0kVar2, (i7 & 910) | ((i7 << 9) & 1879048192), (i7 >> 18) & 8176, 1520);
                qexVar3 = qexVar4;
                qim0Var3 = qim0Var2;
                idn0Var2 = idn0Var3;
                z5 = z8;
                vzq0Var2 = vzq0VarG;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0 qim0Var5 = qim0Var2;
                z5 = z3;
                qim0Var3 = qim0Var5;
                qexVar3 = qexVar2;
                idn0Var2 = idn0Var;
                vzq0Var2 = vzq0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qo60(gbxVar, qexVar, lexVar, z, qim0Var3, qexVar3, idn0Var2, z5, vzq0Var2, vu30Var, i, i2);
            }
        }
        i3 |= 24576;
        qim0Var2 = qim0Var;
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i9 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zI = b0kVar3.g(qexVar2);
                } else {
                    zI = b0kVar3.i(qexVar2);
                }
                if (zI) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
            }
            i3 |= i9;
        }
        i4 = 1572864 | i3;
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((12582912 & i) == 0) {
                z3 = z2;
                if (b0kVar3.h(z3)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (b0kVar3.i(vu30Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i4 |= i8;
            }
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i4 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        qexVar4 = e;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = zr7.d();
                        b0kVar3.s0(objT);
                    }
                    idn0 idn0Var7 = (idn0) objT;
                    if (i5 != 0) {
                        z3 = false;
                    }
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar7 = cbx.b(b0kVar3).b;
                    cvx cvxVar8 = cbx.b(b0kVar3).b;
                    i7 = (-234881025) & i4;
                    idn0Var3 = idn0Var7;
                    vzq0VarG = uyn1.g(6.0f);
                } else {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        qexVar4 = e;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = zr7.d();
                        b0kVar3.s0(objT);
                    }
                    idn0 idn0Var8 = (idn0) objT;
                    if (i5 != 0) {
                        z3 = false;
                    }
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar9 = cbx.b(b0kVar3).b;
                    cvx cvxVar10 = cbx.b(b0kVar3).b;
                    i7 = (-234881025) & i4;
                    idn0Var3 = idn0Var8;
                    vzq0VarG = uyn1.g(6.0f);
                }
                boolean z9 = z3;
                b0kVar3.s();
                if (z) {
                    qexVar5 = qexVar;
                } else {
                    qexVar5 = qexVar4;
                }
                qim0 qim0VarN3 = anm1.N("HomeFilterChip", qim0Var2);
                if ((i7 & 7168) == 2048) {
                }
                objT2 = b0kVar3.T();
                if (z6) {
                    objT2 = new mj10((byte) 8, z);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new mj10((byte) 8, z);
                    b0kVar3.s0(objT2);
                }
                b0kVar2 = b0kVar3;
                poo1.e(gbxVar, qexVar5, lexVar, s161.b(qim0VarN3, false, (iu30) objT2), 0, (String) null, (max) null, (vu30) null, (vu30) null, idn0Var3, (ga80) null, z9, vzq0VarG, vu30Var, b0kVar2, (i7 & 910) | ((i7 << 9) & 1879048192), (i7 >> 18) & 8176, 1520);
                qexVar3 = qexVar4;
                qim0Var3 = qim0Var2;
                idn0Var2 = idn0Var3;
                z5 = z9;
                vzq0Var2 = vzq0VarG;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0 qim0Var6 = qim0Var2;
                z5 = z3;
                qim0Var3 = qim0Var6;
                qexVar3 = qexVar2;
                idn0Var2 = idn0Var;
                vzq0Var2 = vzq0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qo60(gbxVar, qexVar, lexVar, z, qim0Var3, qexVar3, idn0Var2, z5, vzq0Var2, vu30Var, i, i2);
            }
        }
        i4 = 14155776 | i3;
        z3 = z2;
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) != 0) {
            if (b0kVar3.i(vu30Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        if ((i4 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i4 & 1, z4)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                    qexVar4 = e;
                } else {
                    qexVar4 = qexVar2;
                }
                objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = zr7.d();
                    b0kVar3.s0(objT);
                }
                idn0 idn0Var9 = (idn0) objT;
                if (i5 != 0) {
                    z3 = false;
                }
                uwr uwrVar6 = cbx.a;
                cvx cvxVar11 = cbx.b(b0kVar3).b;
                cvx cvxVar12 = cbx.b(b0kVar3).b;
                i7 = (-234881025) & i4;
                idn0Var3 = idn0Var9;
                vzq0VarG = uyn1.g(6.0f);
            } else {
                if (i10 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                    qexVar4 = e;
                } else {
                    qexVar4 = qexVar2;
                }
                objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = zr7.d();
                    b0kVar3.s0(objT);
                }
                idn0 idn0Var10 = (idn0) objT;
                if (i5 != 0) {
                    z3 = false;
                }
                uwr uwrVar7 = cbx.a;
                cvx cvxVar13 = cbx.b(b0kVar3).b;
                cvx cvxVar14 = cbx.b(b0kVar3).b;
                i7 = (-234881025) & i4;
                idn0Var3 = idn0Var10;
                vzq0VarG = uyn1.g(6.0f);
            }
            boolean z10 = z3;
            b0kVar3.s();
            if (z) {
                qexVar5 = qexVar;
            } else {
                qexVar5 = qexVar4;
            }
            qim0 qim0VarN4 = anm1.N("HomeFilterChip", qim0Var2);
            if ((i7 & 7168) == 2048) {
            }
            objT2 = b0kVar3.T();
            if (z6) {
                objT2 = new mj10((byte) 8, z);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new mj10((byte) 8, z);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, qexVar5, lexVar, s161.b(qim0VarN4, false, (iu30) objT2), 0, (String) null, (max) null, (vu30) null, (vu30) null, idn0Var3, (ga80) null, z10, vzq0VarG, vu30Var, b0kVar2, (i7 & 910) | ((i7 << 9) & 1879048192), (i7 >> 18) & 8176, 1520);
            qexVar3 = qexVar4;
            qim0Var3 = qim0Var2;
            idn0Var2 = idn0Var3;
            z5 = z10;
            vzq0Var2 = vzq0VarG;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0 qim0Var7 = qim0Var2;
            z5 = z3;
            qim0Var3 = qim0Var7;
            qexVar3 = qexVar2;
            idn0Var2 = idn0Var;
            vzq0Var2 = vzq0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qo60(gbxVar, qexVar, lexVar, z, qim0Var3, qexVar3, idn0Var2, z5, vzq0Var2, vu30Var, i, i2);
        }
    }

    public static final qex e(un60 un60Var) {
        String str = un60Var.h;
        int i = un60Var.g;
        boolean z = i == 2;
        boolean z2 = i == 4;
        if (!z || str == null || ihc1.y0(str)) {
            return z2 ? new oex(4, oq50.a1, new sre((byte) 23, a), (vu30) null, 8) : new nex(4);
        }
        return new oex(4, oq50.Z0, new sre((byte) 23, z4p1.e(Color.parseColor(str))), (vu30) null, 8);
    }
}
