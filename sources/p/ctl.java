package p;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ctl {
    public static final qim0 a = anm1.N("ContentEvaluationListRow", nim0.a);
    public static final float b = 4.0f;

    /* JADX WARN: Code duplicated, block: B:106:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:136:0x0205  */
    /* JADX WARN: Code duplicated, block: B:138:0x0232  */
    /* JADX WARN: Code duplicated, block: B:140:0x0268  */
    /* JADX WARN: Code duplicated, block: B:142:0x026c  */
    /* JADX WARN: Code duplicated, block: B:145:0x027f  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    public static final void a(dtl dtlVar, iuj iujVar, maa maaVar, boolean z, qim0 qim0Var, int i, float f, p3v p3vVar, float f2, float f3, b0k b0kVar, int i2, int i3) {
        int i4;
        iuj iujVar2;
        maa maaVar2;
        float f4;
        int i5;
        int i6;
        float f5;
        int i7;
        float f6;
        int i8;
        boolean z2;
        qim0 qim0Var2;
        p3v p3vVar2;
        float f7;
        float f8;
        float f9;
        int i9;
        h311 h311VarV;
        float fE;
        int i10;
        p3v p3vVar3;
        int i11;
        float f10;
        float f11;
        float f12;
        qim0 qim0Var3;
        float f13;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i12;
        float f14;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1759236149);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(dtlVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            iujVar2 = iujVar;
            i4 |= x340Var.i(iujVar2) ? 32 : 16;
        } else {
            iujVar2 = iujVar;
        }
        if ((i2 & 384) == 0) {
            maaVar2 = maaVar;
            i4 |= x340Var.i(maaVar2) ? 256 : 128;
        } else {
            maaVar2 = maaVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.h(z) ? 2048 : 1024;
        }
        int i13 = i4 | 24576;
        int i14 = i3 & 32;
        if (i14 == 0) {
            if ((196608 & i2) == 0) {
                i13 |= x340Var.e(i) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f4 = f;
                    int i15 = x340Var.d(f4) ? 1048576 : 524288;
                    i13 |= i15;
                } else {
                    f4 = f;
                }
                i13 |= i15;
            } else {
                f4 = f;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                if ((12582912 & i2) == 0) {
                    if (x340Var.g(p3vVar)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i13 |= i6;
                }
                if ((100663296 & i2) == 0) {
                    if ((i3 & 256) == 0) {
                        f5 = f2;
                        int i16 = x340Var.d(f5) ? 67108864 : 33554432;
                        i13 |= i16;
                    } else {
                        f5 = f2;
                    }
                    i13 |= i16;
                } else {
                    f5 = f2;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    if ((805306368 & i2) == 0) {
                        f6 = f3;
                        if (x340Var.d(f6)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i13 |= i8;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i13 & 1, z2)) {
                        x340Var.d0();
                        fE = 0.0f;
                        if ((i2 & 1) != 0 || x340Var.E()) {
                            if (i14 != 0) {
                                i10 = 3;
                            } else {
                                i10 = i;
                            }
                            if ((i3 & 64) != 0) {
                                i13 &= -3670017;
                                f4 = 0.0f;
                            }
                            if (i5 != 0) {
                                p3vVar3 = null;
                            } else {
                                p3vVar3 = p3vVar;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar = cbx.a;
                                cvx cvxVar = cbx.b(x340Var).b;
                                i11 = (-234881025) & i13;
                                f10 = 16.0f;
                            } else {
                                i11 = i13;
                                f10 = f5;
                            }
                            qim0 qim0Var4 = nim0.a;
                            if (i7 != 0) {
                                f11 = f10;
                                f12 = f4;
                                f6 = b;
                            } else {
                                f11 = f10;
                                f12 = f4;
                            }
                            qim0Var3 = qim0Var4;
                        } else {
                            x340Var.b0();
                            if ((i3 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i13 &= -234881025;
                            }
                            i11 = i13;
                            f12 = f4;
                            f11 = f5;
                            qim0Var3 = qim0Var;
                            i10 = i;
                            p3vVar3 = p3vVar;
                        }
                        x340Var.s();
                        qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                        f13 = f11;
                        mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarF);
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        if (z) {
                            x340Var.i0(-1452601521);
                            x340Var.r(false);
                        } else {
                            fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                        }
                        i12 = i11 & 14;
                        d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                        if (dtlVar.c.size() <= i10) {
                            x340Var.i0(-264361184);
                            float f15 = f6;
                            c(dtlVar, maaVar2, fE, f15, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                            f14 = f15;
                            x340Var.r(false);
                        } else {
                            f14 = f6;
                            x340Var.i0(-264098273);
                            int i17 = i11 >> 3;
                            b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i17 & 112) | ((i11 >> 18) & 7168) | (i17 & 57344) | (458752 & i17) | (3670016 & i17));
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        p3vVar2 = p3vVar3;
                        f7 = f13;
                        f8 = f14;
                        i9 = i10;
                        f9 = f12;
                        qim0Var2 = qim0Var3;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        p3vVar2 = p3vVar;
                        f7 = f5;
                        f8 = f6;
                        f9 = f4;
                        i9 = i;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
                    }
                }
                i13 |= 805306368;
                f6 = f3;
                if ((i13 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i13 & 1, z2)) {
                    x340Var.d0();
                    fE = 0.0f;
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            i10 = 3;
                        } else {
                            i10 = i;
                        }
                        if ((i3 & 64) != 0) {
                            i13 &= -3670017;
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            p3vVar3 = null;
                        } else {
                            p3vVar3 = p3vVar;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            i11 = (-234881025) & i13;
                            f10 = 16.0f;
                        } else {
                            i11 = i13;
                            f10 = f5;
                        }
                        qim0 qim0Var5 = nim0.a;
                        if (i7 != 0) {
                            f11 = f10;
                            f12 = f4;
                            f6 = b;
                        } else {
                            f11 = f10;
                            f12 = f4;
                        }
                        qim0Var3 = qim0Var5;
                    } else {
                        if (i14 != 0) {
                            i10 = 3;
                        } else {
                            i10 = i;
                        }
                        if ((i3 & 64) != 0) {
                            i13 &= -3670017;
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            p3vVar3 = null;
                        } else {
                            p3vVar3 = p3vVar;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar3 = cbx.b(x340Var).b;
                            i11 = (-234881025) & i13;
                            f10 = 16.0f;
                        } else {
                            i11 = i13;
                            f10 = f5;
                        }
                        qim0 qim0Var6 = nim0.a;
                        if (i7 != 0) {
                            f11 = f10;
                            f12 = f4;
                            f6 = b;
                        } else {
                            f11 = f10;
                            f12 = f4;
                        }
                        qim0Var3 = qim0Var6;
                    }
                    x340Var.s();
                    qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                    f13 = f11;
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    if (z) {
                        x340Var.i0(-1452601521);
                        x340Var.r(false);
                    } else {
                        fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                    }
                    i12 = i11 & 14;
                    d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                    if (dtlVar.c.size() <= i10) {
                        x340Var.i0(-264361184);
                        float f16 = f6;
                        c(dtlVar, maaVar2, fE, f16, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                        f14 = f16;
                        x340Var.r(false);
                    } else {
                        f14 = f6;
                        x340Var.i0(-264098273);
                        int i18 = i11 >> 3;
                        b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i18 & 112) | ((i11 >> 18) & 7168) | (i18 & 57344) | (458752 & i18) | (3670016 & i18));
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    p3vVar2 = p3vVar3;
                    f7 = f13;
                    f8 = f14;
                    i9 = i10;
                    f9 = f12;
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    p3vVar2 = p3vVar;
                    f7 = f5;
                    f8 = f6;
                    f9 = f4;
                    i9 = i;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
                }
            }
            i13 |= 12582912;
            if ((100663296 & i2) == 0) {
                if ((i3 & 256) == 0) {
                    f5 = f2;
                    if (x340Var.d(f5)) {
                    }
                    i13 |= i16;
                } else {
                    f5 = f2;
                }
                i13 |= i16;
            } else {
                f5 = f2;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                if ((805306368 & i2) == 0) {
                    f6 = f3;
                    if (x340Var.d(f6)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i13 |= i8;
                }
                if ((i13 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i13 & 1, z2)) {
                    x340Var.d0();
                    fE = 0.0f;
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            i10 = 3;
                        } else {
                            i10 = i;
                        }
                        if ((i3 & 64) != 0) {
                            i13 &= -3670017;
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            p3vVar3 = null;
                        } else {
                            p3vVar3 = p3vVar;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar4 = cbx.a;
                            cvx cvxVar4 = cbx.b(x340Var).b;
                            i11 = (-234881025) & i13;
                            f10 = 16.0f;
                        } else {
                            i11 = i13;
                            f10 = f5;
                        }
                        qim0 qim0Var7 = nim0.a;
                        if (i7 != 0) {
                            f11 = f10;
                            f12 = f4;
                            f6 = b;
                        } else {
                            f11 = f10;
                            f12 = f4;
                        }
                        qim0Var3 = qim0Var7;
                    } else {
                        if (i14 != 0) {
                            i10 = 3;
                        } else {
                            i10 = i;
                        }
                        if ((i3 & 64) != 0) {
                            i13 &= -3670017;
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            p3vVar3 = null;
                        } else {
                            p3vVar3 = p3vVar;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar5 = cbx.a;
                            cvx cvxVar5 = cbx.b(x340Var).b;
                            i11 = (-234881025) & i13;
                            f10 = 16.0f;
                        } else {
                            i11 = i13;
                            f10 = f5;
                        }
                        qim0 qim0Var8 = nim0.a;
                        if (i7 != 0) {
                            f11 = f10;
                            f12 = f4;
                            f6 = b;
                        } else {
                            f11 = f10;
                            f12 = f4;
                        }
                        qim0Var3 = qim0Var8;
                    }
                    x340Var.s();
                    qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                    f13 = f11;
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF3);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    if (z) {
                        x340Var.i0(-1452601521);
                        x340Var.r(false);
                    } else {
                        fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                    }
                    i12 = i11 & 14;
                    d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                    if (dtlVar.c.size() <= i10) {
                        x340Var.i0(-264361184);
                        float f17 = f6;
                        c(dtlVar, maaVar2, fE, f17, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                        f14 = f17;
                        x340Var.r(false);
                    } else {
                        f14 = f6;
                        x340Var.i0(-264098273);
                        int i19 = i11 >> 3;
                        b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i19 & 112) | ((i11 >> 18) & 7168) | (i19 & 57344) | (458752 & i19) | (3670016 & i19));
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    p3vVar2 = p3vVar3;
                    f7 = f13;
                    f8 = f14;
                    i9 = i10;
                    f9 = f12;
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    p3vVar2 = p3vVar;
                    f7 = f5;
                    f8 = f6;
                    f9 = f4;
                    i9 = i;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
                }
            }
            i13 |= 805306368;
            f6 = f3;
            if ((i13 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i13 & 1, z2)) {
                x340Var.d0();
                fE = 0.0f;
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        i10 = 3;
                    } else {
                        i10 = i;
                    }
                    if ((i3 & 64) != 0) {
                        i13 &= -3670017;
                        f4 = 0.0f;
                    }
                    if (i5 != 0) {
                        p3vVar3 = null;
                    } else {
                        p3vVar3 = p3vVar;
                    }
                    if ((i3 & 256) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar6 = cbx.b(x340Var).b;
                        i11 = (-234881025) & i13;
                        f10 = 16.0f;
                    } else {
                        i11 = i13;
                        f10 = f5;
                    }
                    qim0 qim0Var9 = nim0.a;
                    if (i7 != 0) {
                        f11 = f10;
                        f12 = f4;
                        f6 = b;
                    } else {
                        f11 = f10;
                        f12 = f4;
                    }
                    qim0Var3 = qim0Var9;
                } else {
                    if (i14 != 0) {
                        i10 = 3;
                    } else {
                        i10 = i;
                    }
                    if ((i3 & 64) != 0) {
                        i13 &= -3670017;
                        f4 = 0.0f;
                    }
                    if (i5 != 0) {
                        p3vVar3 = null;
                    } else {
                        p3vVar3 = p3vVar;
                    }
                    if ((i3 & 256) != 0) {
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar7 = cbx.b(x340Var).b;
                        i11 = (-234881025) & i13;
                        f10 = 16.0f;
                    } else {
                        i11 = i13;
                        f10 = f5;
                    }
                    qim0 qim0Var10 = nim0.a;
                    if (i7 != 0) {
                        f11 = f10;
                        f12 = f4;
                        f6 = b;
                    } else {
                        f11 = f10;
                        f12 = f4;
                    }
                    qim0Var3 = qim0Var10;
                }
                x340Var.s();
                qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
                f13 = f11;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF4);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z) {
                    x340Var.i0(-1452601521);
                    x340Var.r(false);
                } else {
                    fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                }
                i12 = i11 & 14;
                d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                if (dtlVar.c.size() <= i10) {
                    x340Var.i0(-264361184);
                    float f18 = f6;
                    c(dtlVar, maaVar2, fE, f18, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                    f14 = f18;
                    x340Var.r(false);
                } else {
                    f14 = f6;
                    x340Var.i0(-264098273);
                    int i110 = i11 >> 3;
                    b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i110 & 112) | ((i11 >> 18) & 7168) | (i110 & 57344) | (458752 & i110) | (3670016 & i110));
                    x340Var.r(false);
                }
                x340Var.r(true);
                p3vVar2 = p3vVar3;
                f7 = f13;
                f8 = f14;
                i9 = i10;
                f9 = f12;
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                p3vVar2 = p3vVar;
                f7 = f5;
                f8 = f6;
                f9 = f4;
                i9 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
            }
        }
        i13 = 221184 | i4;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f4 = f;
                if (x340Var.d(f4)) {
                }
                i13 |= i15;
            } else {
                f4 = f;
            }
            i13 |= i15;
        } else {
            f4 = f;
        }
        i5 = i3 & 128;
        if (i5 != 0) {
            if ((12582912 & i2) == 0) {
                if (x340Var.g(p3vVar)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i13 |= i6;
            }
            if ((100663296 & i2) == 0) {
                if ((i3 & 256) == 0) {
                    f5 = f2;
                    if (x340Var.d(f5)) {
                    }
                    i13 |= i16;
                } else {
                    f5 = f2;
                }
                i13 |= i16;
            } else {
                f5 = f2;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                if ((805306368 & i2) == 0) {
                    f6 = f3;
                    if (x340Var.d(f6)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i13 |= i8;
                }
                if ((i13 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i13 & 1, z2)) {
                    x340Var.d0();
                    fE = 0.0f;
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            i10 = 3;
                        } else {
                            i10 = i;
                        }
                        if ((i3 & 64) != 0) {
                            i13 &= -3670017;
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            p3vVar3 = null;
                        } else {
                            p3vVar3 = p3vVar;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar8 = cbx.a;
                            cvx cvxVar8 = cbx.b(x340Var).b;
                            i11 = (-234881025) & i13;
                            f10 = 16.0f;
                        } else {
                            i11 = i13;
                            f10 = f5;
                        }
                        qim0 qim0Var11 = nim0.a;
                        if (i7 != 0) {
                            f11 = f10;
                            f12 = f4;
                            f6 = b;
                        } else {
                            f11 = f10;
                            f12 = f4;
                        }
                        qim0Var3 = qim0Var11;
                    } else {
                        if (i14 != 0) {
                            i10 = 3;
                        } else {
                            i10 = i;
                        }
                        if ((i3 & 64) != 0) {
                            i13 &= -3670017;
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            p3vVar3 = null;
                        } else {
                            p3vVar3 = p3vVar;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar9 = cbx.a;
                            cvx cvxVar9 = cbx.b(x340Var).b;
                            i11 = (-234881025) & i13;
                            f10 = 16.0f;
                        } else {
                            i11 = i13;
                            f10 = f5;
                        }
                        qim0 qim0Var12 = nim0.a;
                        if (i7 != 0) {
                            f11 = f10;
                            f12 = f4;
                            f6 = b;
                        } else {
                            f11 = f10;
                            f12 = f4;
                        }
                        qim0Var3 = qim0Var12;
                    }
                    x340Var.s();
                    qim0 qim0VarF5 = u291.f(qim0Var3, 1.0f);
                    f13 = f11;
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF5);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    if (z) {
                        x340Var.i0(-1452601521);
                        x340Var.r(false);
                    } else {
                        fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                    }
                    i12 = i11 & 14;
                    d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                    if (dtlVar.c.size() <= i10) {
                        x340Var.i0(-264361184);
                        float f19 = f6;
                        c(dtlVar, maaVar2, fE, f19, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                        f14 = f19;
                        x340Var.r(false);
                    } else {
                        f14 = f6;
                        x340Var.i0(-264098273);
                        int i111 = i11 >> 3;
                        b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i111 & 112) | ((i11 >> 18) & 7168) | (i111 & 57344) | (458752 & i111) | (3670016 & i111));
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    p3vVar2 = p3vVar3;
                    f7 = f13;
                    f8 = f14;
                    i9 = i10;
                    f9 = f12;
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    p3vVar2 = p3vVar;
                    f7 = f5;
                    f8 = f6;
                    f9 = f4;
                    i9 = i;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
                }
            }
            i13 |= 805306368;
            f6 = f3;
            if ((i13 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i13 & 1, z2)) {
                x340Var.d0();
                fE = 0.0f;
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        i10 = 3;
                    } else {
                        i10 = i;
                    }
                    if ((i3 & 64) != 0) {
                        i13 &= -3670017;
                        f4 = 0.0f;
                    }
                    if (i5 != 0) {
                        p3vVar3 = null;
                    } else {
                        p3vVar3 = p3vVar;
                    }
                    if ((i3 & 256) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cvx cvxVar10 = cbx.b(x340Var).b;
                        i11 = (-234881025) & i13;
                        f10 = 16.0f;
                    } else {
                        i11 = i13;
                        f10 = f5;
                    }
                    qim0 qim0Var13 = nim0.a;
                    if (i7 != 0) {
                        f11 = f10;
                        f12 = f4;
                        f6 = b;
                    } else {
                        f11 = f10;
                        f12 = f4;
                    }
                    qim0Var3 = qim0Var13;
                } else {
                    if (i14 != 0) {
                        i10 = 3;
                    } else {
                        i10 = i;
                    }
                    if ((i3 & 64) != 0) {
                        i13 &= -3670017;
                        f4 = 0.0f;
                    }
                    if (i5 != 0) {
                        p3vVar3 = null;
                    } else {
                        p3vVar3 = p3vVar;
                    }
                    if ((i3 & 256) != 0) {
                        uwr uwrVar11 = cbx.a;
                        cvx cvxVar11 = cbx.b(x340Var).b;
                        i11 = (-234881025) & i13;
                        f10 = 16.0f;
                    } else {
                        i11 = i13;
                        f10 = f5;
                    }
                    qim0 qim0Var14 = nim0.a;
                    if (i7 != 0) {
                        f11 = f10;
                        f12 = f4;
                        f6 = b;
                    } else {
                        f11 = f10;
                        f12 = f4;
                    }
                    qim0Var3 = qim0Var14;
                }
                x340Var.s();
                qim0 qim0VarF6 = u291.f(qim0Var3, 1.0f);
                f13 = f11;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF6);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z) {
                    x340Var.i0(-1452601521);
                    x340Var.r(false);
                } else {
                    fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                }
                i12 = i11 & 14;
                d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                if (dtlVar.c.size() <= i10) {
                    x340Var.i0(-264361184);
                    float f110 = f6;
                    c(dtlVar, maaVar2, fE, f110, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                    f14 = f110;
                    x340Var.r(false);
                } else {
                    f14 = f6;
                    x340Var.i0(-264098273);
                    int i112 = i11 >> 3;
                    b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i112 & 112) | ((i11 >> 18) & 7168) | (i112 & 57344) | (458752 & i112) | (3670016 & i112));
                    x340Var.r(false);
                }
                x340Var.r(true);
                p3vVar2 = p3vVar3;
                f7 = f13;
                f8 = f14;
                i9 = i10;
                f9 = f12;
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                p3vVar2 = p3vVar;
                f7 = f5;
                f8 = f6;
                f9 = f4;
                i9 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
            }
        }
        i13 |= 12582912;
        if ((100663296 & i2) == 0) {
            if ((i3 & 256) == 0) {
                f5 = f2;
                if (x340Var.d(f5)) {
                }
                i13 |= i16;
            } else {
                f5 = f2;
            }
            i13 |= i16;
        } else {
            f5 = f2;
        }
        i7 = i3 & 512;
        if (i7 != 0) {
            if ((805306368 & i2) == 0) {
                f6 = f3;
                if (x340Var.d(f6)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i13 |= i8;
            }
            if ((i13 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i13 & 1, z2)) {
                x340Var.d0();
                fE = 0.0f;
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        i10 = 3;
                    } else {
                        i10 = i;
                    }
                    if ((i3 & 64) != 0) {
                        i13 &= -3670017;
                        f4 = 0.0f;
                    }
                    if (i5 != 0) {
                        p3vVar3 = null;
                    } else {
                        p3vVar3 = p3vVar;
                    }
                    if ((i3 & 256) != 0) {
                        uwr uwrVar12 = cbx.a;
                        cvx cvxVar12 = cbx.b(x340Var).b;
                        i11 = (-234881025) & i13;
                        f10 = 16.0f;
                    } else {
                        i11 = i13;
                        f10 = f5;
                    }
                    qim0 qim0Var15 = nim0.a;
                    if (i7 != 0) {
                        f11 = f10;
                        f12 = f4;
                        f6 = b;
                    } else {
                        f11 = f10;
                        f12 = f4;
                    }
                    qim0Var3 = qim0Var15;
                } else {
                    if (i14 != 0) {
                        i10 = 3;
                    } else {
                        i10 = i;
                    }
                    if ((i3 & 64) != 0) {
                        i13 &= -3670017;
                        f4 = 0.0f;
                    }
                    if (i5 != 0) {
                        p3vVar3 = null;
                    } else {
                        p3vVar3 = p3vVar;
                    }
                    if ((i3 & 256) != 0) {
                        uwr uwrVar13 = cbx.a;
                        cvx cvxVar13 = cbx.b(x340Var).b;
                        i11 = (-234881025) & i13;
                        f10 = 16.0f;
                    } else {
                        i11 = i13;
                        f10 = f5;
                    }
                    qim0 qim0Var16 = nim0.a;
                    if (i7 != 0) {
                        f11 = f10;
                        f12 = f4;
                        f6 = b;
                    } else {
                        f11 = f10;
                        f12 = f4;
                    }
                    qim0Var3 = qim0Var16;
                }
                x340Var.s();
                qim0 qim0VarF7 = u291.f(qim0Var3, 1.0f);
                f13 = f11;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF7);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z) {
                    x340Var.i0(-1452601521);
                    x340Var.r(false);
                } else {
                    fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
                }
                i12 = i11 & 14;
                d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
                if (dtlVar.c.size() <= i10) {
                    x340Var.i0(-264361184);
                    float f111 = f6;
                    c(dtlVar, maaVar2, fE, f111, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                    f14 = f111;
                    x340Var.r(false);
                } else {
                    f14 = f6;
                    x340Var.i0(-264098273);
                    int i113 = i11 >> 3;
                    b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i113 & 112) | ((i11 >> 18) & 7168) | (i113 & 57344) | (458752 & i113) | (3670016 & i113));
                    x340Var.r(false);
                }
                x340Var.r(true);
                p3vVar2 = p3vVar3;
                f7 = f13;
                f8 = f14;
                i9 = i10;
                f9 = f12;
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                p3vVar2 = p3vVar;
                f7 = f5;
                f8 = f6;
                f9 = f4;
                i9 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
            }
        }
        i13 |= 805306368;
        f6 = f3;
        if ((i13 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i13 & 1, z2)) {
            x340Var.d0();
            fE = 0.0f;
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    i10 = 3;
                } else {
                    i10 = i;
                }
                if ((i3 & 64) != 0) {
                    i13 &= -3670017;
                    f4 = 0.0f;
                }
                if (i5 != 0) {
                    p3vVar3 = null;
                } else {
                    p3vVar3 = p3vVar;
                }
                if ((i3 & 256) != 0) {
                    uwr uwrVar14 = cbx.a;
                    cvx cvxVar14 = cbx.b(x340Var).b;
                    i11 = (-234881025) & i13;
                    f10 = 16.0f;
                } else {
                    i11 = i13;
                    f10 = f5;
                }
                qim0 qim0Var17 = nim0.a;
                if (i7 != 0) {
                    f11 = f10;
                    f12 = f4;
                    f6 = b;
                } else {
                    f11 = f10;
                    f12 = f4;
                }
                qim0Var3 = qim0Var17;
            } else {
                if (i14 != 0) {
                    i10 = 3;
                } else {
                    i10 = i;
                }
                if ((i3 & 64) != 0) {
                    i13 &= -3670017;
                    f4 = 0.0f;
                }
                if (i5 != 0) {
                    p3vVar3 = null;
                } else {
                    p3vVar3 = p3vVar;
                }
                if ((i3 & 256) != 0) {
                    uwr uwrVar15 = cbx.a;
                    cvx cvxVar15 = cbx.b(x340Var).b;
                    i11 = (-234881025) & i13;
                    f10 = 16.0f;
                } else {
                    i11 = i13;
                    f10 = f5;
                }
                qim0 qim0Var18 = nim0.a;
                if (i7 != 0) {
                    f11 = f10;
                    f12 = f4;
                    f6 = b;
                } else {
                    f11 = f10;
                    f12 = f4;
                }
                qim0Var3 = qim0Var18;
            }
            x340Var.s();
            qim0 qim0VarF8 = u291.f(qim0Var3, 1.0f);
            f13 = f11;
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF8);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(-1452601521);
                x340Var.r(false);
            } else {
                fE = z5c.e(x340Var, -1452600968, 2131165289, x340Var, false);
            }
            i12 = i11 & 14;
            d(dtlVar, iujVar2, fE, f13, x340Var, (i11 & 126) | ((i11 >> 15) & 7168));
            if (dtlVar.c.size() <= i10) {
                x340Var.i0(-264361184);
                float f112 = f6;
                c(dtlVar, maaVar2, fE, f112, f12, x340Var, i12 | ((i11 >> 3) & 112) | ((i11 >> 18) & 7168) | ((i11 >> 6) & 57344));
                f14 = f112;
                x340Var.r(false);
            } else {
                f14 = f6;
                x340Var.i0(-264098273);
                int i114 = i11 >> 3;
                b(dtlVar, maaVar, fE, f14, i10, f12, p3vVar3, x340Var, i12 | (i114 & 112) | ((i11 >> 18) & 7168) | (i114 & 57344) | (458752 & i114) | (3670016 & i114));
                x340Var.r(false);
            }
            x340Var.r(true);
            p3vVar2 = p3vVar3;
            f7 = f13;
            f8 = f14;
            i9 = i10;
            f9 = f12;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            p3vVar2 = p3vVar;
            f7 = f5;
            f8 = f6;
            f9 = f4;
            i9 = i;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vsl(dtlVar, iujVar, maaVar, z, qim0Var2, i9, f9, p3vVar2, f7, f8, i2, i3);
        }
    }

    public static final void b(dtl dtlVar, maa maaVar, float f, float f2, int i, float f3, p3v p3vVar, b0k b0kVar, int i2) {
        int i3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2118724581);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(dtlVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(maaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.d(f3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.g(p3vVar) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            float f4 = f + f2;
            boolean zG = x340Var.g(dtlVar.c) | ((i3 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = o7h.s1(dtlVar.c, i, i);
                x340Var.s0(objT);
            }
            List list = (List) objT;
            boolean zI = x340Var.i(list);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new a1e(list, (byte) 1);
                x340Var.s0(objT2);
            }
            kes kesVarB = lkr0.b(0, (Function0) objT2, x340Var, 0, 3);
            boolean zE = ((i3 & 7168) == 2048) | x340Var.e(list.size()) | ((3670016 & i3) == 1048576);
            Object objT3 = x340Var.T();
            if (zE || objT3 == obj) {
                objT3 = new htl(f2, list.size(), p3vVar);
                x340Var.s0(objT3);
            }
            w0h1.c(kesVarB, u291.f(nim0.a, 1.0f), uyn1.h(2, f4, 0.0f), (htl) objT3, 1, f3, null, q0o1.j(kesVarB, o610.b(), irn1.o0(300, 0, mlv.b, 2), x340Var, 0, 20), false, null, null, zov0.g, null, apo.r(2077922716, new ysl(f3, list, i, maaVar), x340Var), x340Var, (458752 & i3) | 24576, 12096);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsl(dtlVar, maaVar, f, f2, i, f3, p3vVar, i2);
        }
    }

    public static final void c(dtl dtlVar, maa maaVar, float f, float f2, float f3, b0k b0kVar, int i) {
        int i2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1522465419);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(dtlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(maaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f3) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            nim0 nim0Var = nim0.a;
            if (z || objT == m4cVar) {
                objT = uyn1.z(f2 + f, 0.0f, 2, anm1.N("ContentEvaluationListRow", u291.f(nim0Var, 1.0f)));
                x340Var.s0(objT);
            }
            qim0 qim0Var = (qim0) objT;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(new d36(f3, true, new um5((byte) 16)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            x340Var.i0(146834683);
            Iterator it = dtlVar.c.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(tgp1.l(x340Var));
                xos0 xos0VarM2 = x340Var.m();
                Iterator it2 = it;
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                boolean zE = x340Var.e(i3);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new uv4(i3, (byte) 10);
                    x340Var.s0(objT2);
                }
                dgo1.c(next, (iu30) objT2, apo.r(1896862665, new xsl(maaVar, next, (byte) 1), x340Var), x340Var, 384);
                x340Var.r(true);
                i3 = i4;
                it = it2;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new atl(dtlVar, maaVar, f, f2, f3, i, (byte) 0);
        }
    }

    public static final void d(dtl dtlVar, iuj iujVar, float f, float f2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1129861581);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(dtlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iujVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarZ = uyn1.z(f + f2, 0.0f, 2, u291.f(nim0.a, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            iujVar.a(dtlVar.b, x340Var, i2 & 112);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new btl((byte) 0, f, f2, i, dtlVar, iujVar);
        }
    }
}
