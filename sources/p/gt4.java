package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class gt4 {
    public static final nfv0 a = new nfv0(1, true, true);

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:73:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final Function0 function0, qim0 qim0Var, long j, es41 es41Var, nfv0 nfv0Var, hw61 hw61Var, long j2, float f, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        Function0 function1;
        qim0 qim0Var2;
        hw61 hw61VarB;
        long jE;
        int i3;
        boolean z2;
        final long jFloatToRawIntBits;
        final float f2;
        final qim0 qim0Var3;
        final long j3;
        final es41 es41Var2;
        final hw61 hw61Var2;
        final nfv0 nfv0Var2;
        h311 h311VarV;
        qim0 qim0Var4;
        int i4;
        int i5;
        nfv0 nfv0Var3;
        qim0 qim0Var5;
        es41 es41Var3;
        hw61 hw61Var3;
        long j4;
        float f3;
        Object objT;
        Object obj;
        zen0 zen0Var;
        Object objT2;
        ven0 ven0Var;
        wat watVar;
        boolean zG;
        Object objT3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1725609375);
        int i6 = (x340Var.h(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            function1 = function0;
            i6 |= x340Var.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i6 |= x340Var.g(qim0Var2) ? SemanticState.Hidden : SemanticState.Focused;
            }
            int i8 = i6 | 207872;
            if ((i2 & 64) == 0) {
                hw61VarB = hw61Var;
                int i9 = x340Var.g(hw61VarB) ? 1048576 : 524288;
                int i10 = i8 | i9;
                if ((i2 & SemanticState.Focused) == 0) {
                    jE = j2;
                    int i11 = x340Var.f(jE) ? 8388608 : 4194304;
                    i3 = i10 | i11 | 905969664;
                    if ((306783379 & i3) == 306783378) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (x340Var.Y(i3 & 1, z2)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if (i7 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            qim0 qim0Var6 = qim0Var4;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
                            i4 = i3 & (-57345);
                            if ((i2 & 64) != 0) {
                                zzq0 zzq0Var = nsi0.a;
                                hw61VarB = px61.b(x340Var, 5);
                                i4 = i3 & (-3727361);
                            }
                            if ((i2 & SemanticState.Focused) != 0) {
                                zzq0 zzq0Var2 = nsi0.a;
                                jE = eah.e(x340Var, 37);
                                i5 = i4 & (-29360129);
                            } else {
                                i5 = i4;
                            }
                            zzq0 zzq0Var3 = nsi0.a;
                            nfv0Var3 = a;
                            qim0Var5 = qim0Var6;
                            es41Var3 = es41VarC;
                            hw61Var3 = hw61VarB;
                            j4 = jE;
                            f3 = 3.0f;
                        } else {
                            x340Var.b0();
                            int i12 = i3 & (-57345);
                            if ((i2 & 64) != 0) {
                                i12 = i3 & (-3727361);
                            }
                            if ((i2 & SemanticState.Focused) != 0) {
                                i12 &= -29360129;
                            }
                            es41Var3 = es41Var;
                            nfv0Var3 = nfv0Var;
                            f3 = f;
                            i5 = i12;
                            qim0Var5 = qim0Var2;
                            hw61Var3 = hw61VarB;
                            j4 = jE;
                            jFloatToRawIntBits = j;
                        }
                        x340Var.s();
                        objT = x340Var.T();
                        obj = fkj0.X;
                        if (objT == obj) {
                            objT = new zen0(Boolean.FALSE);
                            x340Var.s0(objT);
                        }
                        zen0Var = (zen0) objT;
                        zen0Var.w1(Boolean.valueOf(z));
                        if (!((Boolean) zen0Var.c.getValue()).booleanValue() || ((Boolean) zen0Var.d.getValue()).booleanValue()) {
                            x340Var.i0(1165905588);
                            objT2 = x340Var.T();
                            if (objT2 == obj) {
                                objT2 = v8r.q(new ofg1(ofg1.b));
                                x340Var.s0(objT2);
                            }
                            ven0Var = (ven0) objT2;
                            watVar = (wat) x340Var.k(t4k.h);
                            zG = x340Var.g(watVar);
                            objT3 = x340Var.T();
                            if (zG || objT3 == obj) {
                                objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                                x340Var.s0(objT3);
                            }
                            sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1166965571);
                            x340Var.r(false);
                        }
                        nfv0Var2 = nfv0Var3;
                        qim0Var3 = qim0Var5;
                        es41Var2 = es41Var3;
                        hw61Var2 = hw61Var3;
                        j3 = j4;
                        f2 = f3;
                    } else {
                        x340Var.b0();
                        jFloatToRawIntBits = j;
                        f2 = f;
                        qim0Var3 = qim0Var2;
                        j3 = jE;
                        es41Var2 = es41Var;
                        hw61Var2 = hw61VarB;
                        nfv0Var2 = nfv0Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.dt4
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iP = czo1.p(i | 1);
                                gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                jE = j2;
                i3 = i10 | i11 | 905969664;
                if ((306783379 & i3) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (x340Var.Y(i3 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        qim0 qim0Var7 = qim0Var4;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        es41 es41VarC2 = l6o1.C(0, 0, 1, x340Var);
                        i4 = i3 & (-57345);
                        if ((i2 & 64) != 0) {
                            zzq0 zzq0Var4 = nsi0.a;
                            hw61VarB = px61.b(x340Var, 5);
                            i4 = i3 & (-3727361);
                        }
                        if ((i2 & SemanticState.Focused) != 0) {
                            zzq0 zzq0Var5 = nsi0.a;
                            jE = eah.e(x340Var, 37);
                            i5 = i4 & (-29360129);
                        } else {
                            i5 = i4;
                        }
                        zzq0 zzq0Var6 = nsi0.a;
                        nfv0Var3 = a;
                        qim0Var5 = qim0Var7;
                        es41Var3 = es41VarC2;
                        hw61Var3 = hw61VarB;
                        j4 = jE;
                        f3 = 3.0f;
                    } else {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        qim0 qim0Var8 = qim0Var4;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        es41 es41VarC3 = l6o1.C(0, 0, 1, x340Var);
                        i4 = i3 & (-57345);
                        if ((i2 & 64) != 0) {
                            zzq0 zzq0Var7 = nsi0.a;
                            hw61VarB = px61.b(x340Var, 5);
                            i4 = i3 & (-3727361);
                        }
                        if ((i2 & SemanticState.Focused) != 0) {
                            zzq0 zzq0Var8 = nsi0.a;
                            jE = eah.e(x340Var, 37);
                            i5 = i4 & (-29360129);
                        } else {
                            i5 = i4;
                        }
                        zzq0 zzq0Var9 = nsi0.a;
                        nfv0Var3 = a;
                        qim0Var5 = qim0Var8;
                        es41Var3 = es41VarC3;
                        hw61Var3 = hw61VarB;
                        j4 = jE;
                        f3 = 3.0f;
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    obj = fkj0.X;
                    if (objT == obj) {
                        objT = new zen0(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    zen0Var = (zen0) objT;
                    zen0Var.w1(Boolean.valueOf(z));
                    if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                        x340Var.i0(1165905588);
                        objT2 = x340Var.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new ofg1(ofg1.b));
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        watVar = (wat) x340Var.k(t4k.h);
                        zG = x340Var.g(watVar);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        }
                        sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1165905588);
                        objT2 = x340Var.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new ofg1(ofg1.b));
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        watVar = (wat) x340Var.k(t4k.h);
                        zG = x340Var.g(watVar);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        }
                        sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                        x340Var.r(false);
                    }
                    nfv0Var2 = nfv0Var3;
                    qim0Var3 = qim0Var5;
                    es41Var2 = es41Var3;
                    hw61Var2 = hw61Var3;
                    j3 = j4;
                    f2 = f3;
                } else {
                    x340Var.b0();
                    jFloatToRawIntBits = j;
                    f2 = f;
                    qim0Var3 = qim0Var2;
                    j3 = jE;
                    es41Var2 = es41Var;
                    hw61Var2 = hw61VarB;
                    nfv0Var2 = nfv0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.dt4
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = czo1.p(i | 1);
                            gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                            return rih1.a;
                        }
                    };
                }
            }
            hw61VarB = hw61Var;
            int i13 = i8 | i9;
            if ((i2 & SemanticState.Focused) == 0) {
                jE = j2;
                if (x340Var.f(jE)) {
                }
                i3 = i13 | i11 | 905969664;
                if ((306783379 & i3) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (x340Var.Y(i3 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        qim0 qim0Var9 = qim0Var4;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        es41 es41VarC4 = l6o1.C(0, 0, 1, x340Var);
                        i4 = i3 & (-57345);
                        if ((i2 & 64) != 0) {
                            zzq0 zzq0Var10 = nsi0.a;
                            hw61VarB = px61.b(x340Var, 5);
                            i4 = i3 & (-3727361);
                        }
                        if ((i2 & SemanticState.Focused) != 0) {
                            zzq0 zzq0Var11 = nsi0.a;
                            jE = eah.e(x340Var, 37);
                            i5 = i4 & (-29360129);
                        } else {
                            i5 = i4;
                        }
                        zzq0 zzq0Var12 = nsi0.a;
                        nfv0Var3 = a;
                        qim0Var5 = qim0Var9;
                        es41Var3 = es41VarC4;
                        hw61Var3 = hw61VarB;
                        j4 = jE;
                        f3 = 3.0f;
                    } else {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        qim0 qim0Var10 = qim0Var4;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        es41 es41VarC5 = l6o1.C(0, 0, 1, x340Var);
                        i4 = i3 & (-57345);
                        if ((i2 & 64) != 0) {
                            zzq0 zzq0Var13 = nsi0.a;
                            hw61VarB = px61.b(x340Var, 5);
                            i4 = i3 & (-3727361);
                        }
                        if ((i2 & SemanticState.Focused) != 0) {
                            zzq0 zzq0Var14 = nsi0.a;
                            jE = eah.e(x340Var, 37);
                            i5 = i4 & (-29360129);
                        } else {
                            i5 = i4;
                        }
                        zzq0 zzq0Var15 = nsi0.a;
                        nfv0Var3 = a;
                        qim0Var5 = qim0Var10;
                        es41Var3 = es41VarC5;
                        hw61Var3 = hw61VarB;
                        j4 = jE;
                        f3 = 3.0f;
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    obj = fkj0.X;
                    if (objT == obj) {
                        objT = new zen0(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    zen0Var = (zen0) objT;
                    zen0Var.w1(Boolean.valueOf(z));
                    if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                        x340Var.i0(1165905588);
                        objT2 = x340Var.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new ofg1(ofg1.b));
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        watVar = (wat) x340Var.k(t4k.h);
                        zG = x340Var.g(watVar);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        }
                        sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1165905588);
                        objT2 = x340Var.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new ofg1(ofg1.b));
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        watVar = (wat) x340Var.k(t4k.h);
                        zG = x340Var.g(watVar);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        }
                        sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                        x340Var.r(false);
                    }
                    nfv0Var2 = nfv0Var3;
                    qim0Var3 = qim0Var5;
                    es41Var2 = es41Var3;
                    hw61Var2 = hw61Var3;
                    j3 = j4;
                    f2 = f3;
                } else {
                    x340Var.b0();
                    jFloatToRawIntBits = j;
                    f2 = f;
                    qim0Var3 = qim0Var2;
                    j3 = jE;
                    es41Var2 = es41Var;
                    hw61Var2 = hw61VarB;
                    nfv0Var2 = nfv0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.dt4
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = czo1.p(i | 1);
                            gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                            return rih1.a;
                        }
                    };
                }
            }
            jE = j2;
            i3 = i13 | i11 | 905969664;
            if ((306783379 & i3) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    qim0 qim0Var11 = qim0Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    es41 es41VarC6 = l6o1.C(0, 0, 1, x340Var);
                    i4 = i3 & (-57345);
                    if ((i2 & 64) != 0) {
                        zzq0 zzq0Var16 = nsi0.a;
                        hw61VarB = px61.b(x340Var, 5);
                        i4 = i3 & (-3727361);
                    }
                    if ((i2 & SemanticState.Focused) != 0) {
                        zzq0 zzq0Var17 = nsi0.a;
                        jE = eah.e(x340Var, 37);
                        i5 = i4 & (-29360129);
                    } else {
                        i5 = i4;
                    }
                    zzq0 zzq0Var18 = nsi0.a;
                    nfv0Var3 = a;
                    qim0Var5 = qim0Var11;
                    es41Var3 = es41VarC6;
                    hw61Var3 = hw61VarB;
                    j4 = jE;
                    f3 = 3.0f;
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    qim0 qim0Var12 = qim0Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    es41 es41VarC7 = l6o1.C(0, 0, 1, x340Var);
                    i4 = i3 & (-57345);
                    if ((i2 & 64) != 0) {
                        zzq0 zzq0Var19 = nsi0.a;
                        hw61VarB = px61.b(x340Var, 5);
                        i4 = i3 & (-3727361);
                    }
                    if ((i2 & SemanticState.Focused) != 0) {
                        zzq0 zzq0Var110 = nsi0.a;
                        jE = eah.e(x340Var, 37);
                        i5 = i4 & (-29360129);
                    } else {
                        i5 = i4;
                    }
                    zzq0 zzq0Var111 = nsi0.a;
                    nfv0Var3 = a;
                    qim0Var5 = qim0Var12;
                    es41Var3 = es41VarC7;
                    hw61Var3 = hw61VarB;
                    j4 = jE;
                    f3 = 3.0f;
                }
                x340Var.s();
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = new zen0(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                zen0Var = (zen0) objT;
                zen0Var.w1(Boolean.valueOf(z));
                if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                    x340Var.i0(1165905588);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = v8r.q(new ofg1(ofg1.b));
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    watVar = (wat) x340Var.k(t4k.h);
                    zG = x340Var.g(watVar);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    }
                    sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1165905588);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = v8r.q(new ofg1(ofg1.b));
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    watVar = (wat) x340Var.k(t4k.h);
                    zG = x340Var.g(watVar);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    }
                    sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                    x340Var.r(false);
                }
                nfv0Var2 = nfv0Var3;
                qim0Var3 = qim0Var5;
                es41Var2 = es41Var3;
                hw61Var2 = hw61Var3;
                j3 = j4;
                f2 = f3;
            } else {
                x340Var.b0();
                jFloatToRawIntBits = j;
                f2 = f;
                qim0Var3 = qim0Var2;
                j3 = jE;
                es41Var2 = es41Var;
                hw61Var2 = hw61VarB;
                nfv0Var2 = nfv0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.dt4
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i | 1);
                        gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                        return rih1.a;
                    }
                };
            }
        }
        i6 |= 384;
        qim0Var2 = qim0Var;
        int i14 = i6 | 207872;
        if ((i2 & 64) == 0) {
            hw61VarB = hw61Var;
            if (x340Var.g(hw61VarB)) {
            }
            int i15 = i14 | i9;
            if ((i2 & SemanticState.Focused) == 0) {
                jE = j2;
                if (x340Var.f(jE)) {
                }
                i3 = i15 | i11 | 905969664;
                if ((306783379 & i3) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (x340Var.Y(i3 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        qim0 qim0Var13 = qim0Var4;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        es41 es41VarC8 = l6o1.C(0, 0, 1, x340Var);
                        i4 = i3 & (-57345);
                        if ((i2 & 64) != 0) {
                            zzq0 zzq0Var112 = nsi0.a;
                            hw61VarB = px61.b(x340Var, 5);
                            i4 = i3 & (-3727361);
                        }
                        if ((i2 & SemanticState.Focused) != 0) {
                            zzq0 zzq0Var113 = nsi0.a;
                            jE = eah.e(x340Var, 37);
                            i5 = i4 & (-29360129);
                        } else {
                            i5 = i4;
                        }
                        zzq0 zzq0Var114 = nsi0.a;
                        nfv0Var3 = a;
                        qim0Var5 = qim0Var13;
                        es41Var3 = es41VarC8;
                        hw61Var3 = hw61VarB;
                        j4 = jE;
                        f3 = 3.0f;
                    } else {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        qim0 qim0Var14 = qim0Var4;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        es41 es41VarC9 = l6o1.C(0, 0, 1, x340Var);
                        i4 = i3 & (-57345);
                        if ((i2 & 64) != 0) {
                            zzq0 zzq0Var115 = nsi0.a;
                            hw61VarB = px61.b(x340Var, 5);
                            i4 = i3 & (-3727361);
                        }
                        if ((i2 & SemanticState.Focused) != 0) {
                            zzq0 zzq0Var116 = nsi0.a;
                            jE = eah.e(x340Var, 37);
                            i5 = i4 & (-29360129);
                        } else {
                            i5 = i4;
                        }
                        zzq0 zzq0Var117 = nsi0.a;
                        nfv0Var3 = a;
                        qim0Var5 = qim0Var14;
                        es41Var3 = es41VarC9;
                        hw61Var3 = hw61VarB;
                        j4 = jE;
                        f3 = 3.0f;
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    obj = fkj0.X;
                    if (objT == obj) {
                        objT = new zen0(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    zen0Var = (zen0) objT;
                    zen0Var.w1(Boolean.valueOf(z));
                    if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                        x340Var.i0(1165905588);
                        objT2 = x340Var.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new ofg1(ofg1.b));
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        watVar = (wat) x340Var.k(t4k.h);
                        zG = x340Var.g(watVar);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        }
                        sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1165905588);
                        objT2 = x340Var.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new ofg1(ofg1.b));
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        watVar = (wat) x340Var.k(t4k.h);
                        zG = x340Var.g(watVar);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                            x340Var.s0(objT3);
                        }
                        sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                        x340Var.r(false);
                    }
                    nfv0Var2 = nfv0Var3;
                    qim0Var3 = qim0Var5;
                    es41Var2 = es41Var3;
                    hw61Var2 = hw61Var3;
                    j3 = j4;
                    f2 = f3;
                } else {
                    x340Var.b0();
                    jFloatToRawIntBits = j;
                    f2 = f;
                    qim0Var3 = qim0Var2;
                    j3 = jE;
                    es41Var2 = es41Var;
                    hw61Var2 = hw61VarB;
                    nfv0Var2 = nfv0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.dt4
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = czo1.p(i | 1);
                            gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                            return rih1.a;
                        }
                    };
                }
            }
            jE = j2;
            i3 = i15 | i11 | 905969664;
            if ((306783379 & i3) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    qim0 qim0Var15 = qim0Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    es41 es41VarC10 = l6o1.C(0, 0, 1, x340Var);
                    i4 = i3 & (-57345);
                    if ((i2 & 64) != 0) {
                        zzq0 zzq0Var118 = nsi0.a;
                        hw61VarB = px61.b(x340Var, 5);
                        i4 = i3 & (-3727361);
                    }
                    if ((i2 & SemanticState.Focused) != 0) {
                        zzq0 zzq0Var119 = nsi0.a;
                        jE = eah.e(x340Var, 37);
                        i5 = i4 & (-29360129);
                    } else {
                        i5 = i4;
                    }
                    zzq0 zzq0Var1110 = nsi0.a;
                    nfv0Var3 = a;
                    qim0Var5 = qim0Var15;
                    es41Var3 = es41VarC10;
                    hw61Var3 = hw61VarB;
                    j4 = jE;
                    f3 = 3.0f;
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    qim0 qim0Var16 = qim0Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    es41 es41VarC11 = l6o1.C(0, 0, 1, x340Var);
                    i4 = i3 & (-57345);
                    if ((i2 & 64) != 0) {
                        zzq0 zzq0Var1111 = nsi0.a;
                        hw61VarB = px61.b(x340Var, 5);
                        i4 = i3 & (-3727361);
                    }
                    if ((i2 & SemanticState.Focused) != 0) {
                        zzq0 zzq0Var1112 = nsi0.a;
                        jE = eah.e(x340Var, 37);
                        i5 = i4 & (-29360129);
                    } else {
                        i5 = i4;
                    }
                    zzq0 zzq0Var1113 = nsi0.a;
                    nfv0Var3 = a;
                    qim0Var5 = qim0Var16;
                    es41Var3 = es41VarC11;
                    hw61Var3 = hw61VarB;
                    j4 = jE;
                    f3 = 3.0f;
                }
                x340Var.s();
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = new zen0(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                zen0Var = (zen0) objT;
                zen0Var.w1(Boolean.valueOf(z));
                if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                    x340Var.i0(1165905588);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = v8r.q(new ofg1(ofg1.b));
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    watVar = (wat) x340Var.k(t4k.h);
                    zG = x340Var.g(watVar);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    }
                    sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1165905588);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = v8r.q(new ofg1(ofg1.b));
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    watVar = (wat) x340Var.k(t4k.h);
                    zG = x340Var.g(watVar);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    }
                    sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                    x340Var.r(false);
                }
                nfv0Var2 = nfv0Var3;
                qim0Var3 = qim0Var5;
                es41Var2 = es41Var3;
                hw61Var2 = hw61Var3;
                j3 = j4;
                f2 = f3;
            } else {
                x340Var.b0();
                jFloatToRawIntBits = j;
                f2 = f;
                qim0Var3 = qim0Var2;
                j3 = jE;
                es41Var2 = es41Var;
                hw61Var2 = hw61VarB;
                nfv0Var2 = nfv0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.dt4
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i | 1);
                        gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                        return rih1.a;
                    }
                };
            }
        }
        hw61VarB = hw61Var;
        int i16 = i14 | i9;
        if ((i2 & SemanticState.Focused) == 0) {
            jE = j2;
            if (x340Var.f(jE)) {
            }
            i3 = i16 | i11 | 905969664;
            if ((306783379 & i3) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    qim0 qim0Var17 = qim0Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    es41 es41VarC12 = l6o1.C(0, 0, 1, x340Var);
                    i4 = i3 & (-57345);
                    if ((i2 & 64) != 0) {
                        zzq0 zzq0Var1114 = nsi0.a;
                        hw61VarB = px61.b(x340Var, 5);
                        i4 = i3 & (-3727361);
                    }
                    if ((i2 & SemanticState.Focused) != 0) {
                        zzq0 zzq0Var1115 = nsi0.a;
                        jE = eah.e(x340Var, 37);
                        i5 = i4 & (-29360129);
                    } else {
                        i5 = i4;
                    }
                    zzq0 zzq0Var1116 = nsi0.a;
                    nfv0Var3 = a;
                    qim0Var5 = qim0Var17;
                    es41Var3 = es41VarC12;
                    hw61Var3 = hw61VarB;
                    j4 = jE;
                    f3 = 3.0f;
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    qim0 qim0Var18 = qim0Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    es41 es41VarC13 = l6o1.C(0, 0, 1, x340Var);
                    i4 = i3 & (-57345);
                    if ((i2 & 64) != 0) {
                        zzq0 zzq0Var1117 = nsi0.a;
                        hw61VarB = px61.b(x340Var, 5);
                        i4 = i3 & (-3727361);
                    }
                    if ((i2 & SemanticState.Focused) != 0) {
                        zzq0 zzq0Var1118 = nsi0.a;
                        jE = eah.e(x340Var, 37);
                        i5 = i4 & (-29360129);
                    } else {
                        i5 = i4;
                    }
                    zzq0 zzq0Var1119 = nsi0.a;
                    nfv0Var3 = a;
                    qim0Var5 = qim0Var18;
                    es41Var3 = es41VarC13;
                    hw61Var3 = hw61VarB;
                    j4 = jE;
                    f3 = 3.0f;
                }
                x340Var.s();
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = new zen0(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                zen0Var = (zen0) objT;
                zen0Var.w1(Boolean.valueOf(z));
                if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                    x340Var.i0(1165905588);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = v8r.q(new ofg1(ofg1.b));
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    watVar = (wat) x340Var.k(t4k.h);
                    zG = x340Var.g(watVar);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    }
                    sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1165905588);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = v8r.q(new ofg1(ofg1.b));
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    watVar = (wat) x340Var.k(t4k.h);
                    zG = x340Var.g(watVar);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                        x340Var.s0(objT3);
                    }
                    sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                    x340Var.r(false);
                }
                nfv0Var2 = nfv0Var3;
                qim0Var3 = qim0Var5;
                es41Var2 = es41Var3;
                hw61Var2 = hw61Var3;
                j3 = j4;
                f2 = f3;
            } else {
                x340Var.b0();
                jFloatToRawIntBits = j;
                f2 = f;
                qim0Var3 = qim0Var2;
                j3 = jE;
                es41Var2 = es41Var;
                hw61Var2 = hw61VarB;
                nfv0Var2 = nfv0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.dt4
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i | 1);
                        gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                        return rih1.a;
                    }
                };
            }
        }
        jE = j2;
        i3 = i16 | i11 | 905969664;
        if ((306783379 & i3) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                qim0 qim0Var19 = qim0Var4;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                es41 es41VarC14 = l6o1.C(0, 0, 1, x340Var);
                i4 = i3 & (-57345);
                if ((i2 & 64) != 0) {
                    zzq0 zzq0Var11110 = nsi0.a;
                    hw61VarB = px61.b(x340Var, 5);
                    i4 = i3 & (-3727361);
                }
                if ((i2 & SemanticState.Focused) != 0) {
                    zzq0 zzq0Var11111 = nsi0.a;
                    jE = eah.e(x340Var, 37);
                    i5 = i4 & (-29360129);
                } else {
                    i5 = i4;
                }
                zzq0 zzq0Var11112 = nsi0.a;
                nfv0Var3 = a;
                qim0Var5 = qim0Var19;
                es41Var3 = es41VarC14;
                hw61Var3 = hw61VarB;
                j4 = jE;
                f3 = 3.0f;
            } else {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                qim0 qim0Var110 = qim0Var4;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                es41 es41VarC15 = l6o1.C(0, 0, 1, x340Var);
                i4 = i3 & (-57345);
                if ((i2 & 64) != 0) {
                    zzq0 zzq0Var11113 = nsi0.a;
                    hw61VarB = px61.b(x340Var, 5);
                    i4 = i3 & (-3727361);
                }
                if ((i2 & SemanticState.Focused) != 0) {
                    zzq0 zzq0Var11114 = nsi0.a;
                    jE = eah.e(x340Var, 37);
                    i5 = i4 & (-29360129);
                } else {
                    i5 = i4;
                }
                zzq0 zzq0Var11115 = nsi0.a;
                nfv0Var3 = a;
                qim0Var5 = qim0Var110;
                es41Var3 = es41VarC15;
                hw61Var3 = hw61VarB;
                j4 = jE;
                f3 = 3.0f;
            }
            x340Var.s();
            objT = x340Var.T();
            obj = fkj0.X;
            if (objT == obj) {
                objT = new zen0(Boolean.FALSE);
                x340Var.s0(objT);
            }
            zen0Var = (zen0) objT;
            zen0Var.w1(Boolean.valueOf(z));
            if (((Boolean) zen0Var.c.getValue()).booleanValue()) {
                x340Var.i0(1165905588);
                objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = v8r.q(new ofg1(ofg1.b));
                    x340Var.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                watVar = (wat) x340Var.k(t4k.h);
                zG = x340Var.g(watVar);
                objT3 = x340Var.T();
                if (zG) {
                    objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                    x340Var.s0(objT3);
                } else {
                    objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                    x340Var.s0(objT3);
                }
                sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1165905588);
                objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = v8r.q(new ofg1(ofg1.b));
                    x340Var.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                watVar = (wat) x340Var.k(t4k.h);
                zG = x340Var.g(watVar);
                objT3 = x340Var.T();
                if (zG) {
                    objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                    x340Var.s0(objT3);
                } else {
                    objT3 = new kav(jFloatToRawIntBits, watVar, new od4(ven0Var, (byte) 1));
                    x340Var.s0(objT3);
                }
                sy4.a((kav) objT3, function1, nfv0Var3, apo.r(-917492520, new ft4(qim0Var5, zen0Var, ven0Var, es41Var3, hw61Var3, j4, f3, j2iVar), x340Var), x340Var, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
                x340Var.r(false);
            }
            nfv0Var2 = nfv0Var3;
            qim0Var3 = qim0Var5;
            es41Var2 = es41Var3;
            hw61Var2 = hw61Var3;
            j3 = j4;
            f2 = f3;
        } else {
            x340Var.b0();
            jFloatToRawIntBits = j;
            f2 = f;
            qim0Var3 = qim0Var2;
            j3 = jE;
            es41Var2 = es41Var;
            hw61Var2 = hw61VarB;
            nfv0Var2 = nfv0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.dt4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i | 1);
                    gt4.a(z, function0, qim0Var3, jFloatToRawIntBits, es41Var2, nfv0Var2, hw61Var2, j3, f2, j2iVar, (b0k) obj2, iP, i2);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x014b  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void b(final j2i j2iVar, final Function0 function0, qim0 qim0Var, vu30 vu30Var, boolean z, wsi0 wsi0Var, vzq0 vzq0Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        final qim0 qim0Var2;
        int i4;
        vu30 vu30Var2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        b0k b0kVar2;
        final wsi0 wsi0Var2;
        final vzq0 vzq0Var2;
        final vu30 vu30Var3;
        final boolean z4;
        h311 h311VarV;
        qim0 qim0Var3;
        vu30 vu30Var4;
        boolean z5;
        dah dahVar;
        wsi0 wsi0Var3;
        wsi0 wsi0Var4;
        qim0 qim0Var4;
        vu30 vu30Var5;
        vzq0 vzq0Var3;
        int i10;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-532959117);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? SemanticState.Hidden : SemanticState.Focused;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    vu30Var2 = vu30Var;
                    if (b0kVar3.i(vu30Var2)) {
                        i5 = SemanticState.Modal;
                    } else {
                        i5 = SemanticState.ReadOnly;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (b0kVar3.h(z2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    if ((1572864 & i) == 0) {
                        i6 |= 524288;
                    }
                    i9 = i6 | 113246208;
                    if ((38347923 & i9) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (b0kVar3.Y(i9 & 1, z3)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0 || b0kVar3.E()) {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var4 = null;
                            } else {
                                vu30Var4 = vu30Var2;
                            }
                            z5 = i7 == 0 ? z2 : true;
                            zzq0 zzq0Var = nsi0.a;
                            dahVar = (dah) b0kVar3.k(eah.a);
                            wsi0Var3 = dahVar.b0;
                            if (wsi0Var3 == null) {
                                wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                                dahVar.b0 = wsi0Var4;
                            } else {
                                wsi0Var4 = wsi0Var3;
                            }
                            qim0Var4 = qim0Var3;
                            vu30Var5 = vu30Var4;
                            vzq0Var3 = nsi0.a;
                            i10 = i9 & (-3670017);
                        } else {
                            b0kVar3.b0();
                            i10 = i9 & (-3670017);
                            wsi0Var4 = wsi0Var;
                            vzq0Var3 = vzq0Var;
                            z5 = z2;
                            qim0Var4 = qim0Var2;
                            vu30Var5 = vu30Var2;
                        }
                        b0kVar3.s();
                        b0kVar2 = b0kVar3;
                        guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                        qim0Var2 = qim0Var4;
                        vu30Var3 = vu30Var5;
                        z4 = z5;
                        wsi0Var2 = wsi0Var4;
                        vzq0Var2 = vzq0Var3;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        wsi0Var2 = wsi0Var;
                        vzq0Var2 = vzq0Var;
                        vu30Var3 = vu30Var2;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.et4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i6 = 221184 | i3;
                z2 = z;
                if ((1572864 & i) == 0) {
                    i6 |= 524288;
                }
                i9 = i6 | 113246208;
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i9 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 == 0) {
                        }
                        zzq0 zzq0Var2 = nsi0.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        wsi0Var3 = dahVar.b0;
                        if (wsi0Var3 == null) {
                            wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.b0 = wsi0Var4;
                        } else {
                            wsi0Var4 = wsi0Var3;
                        }
                        qim0Var4 = qim0Var3;
                        vu30Var5 = vu30Var4;
                        vzq0Var3 = nsi0.a;
                        i10 = i9 & (-3670017);
                    } else {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 == 0) {
                        }
                        zzq0 zzq0Var3 = nsi0.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        wsi0Var3 = dahVar.b0;
                        if (wsi0Var3 == null) {
                            wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.b0 = wsi0Var4;
                        } else {
                            wsi0Var4 = wsi0Var3;
                        }
                        qim0Var4 = qim0Var3;
                        vu30Var5 = vu30Var4;
                        vzq0Var3 = nsi0.a;
                        i10 = i9 & (-3670017);
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                    qim0Var2 = qim0Var4;
                    vu30Var3 = vu30Var5;
                    z4 = z5;
                    wsi0Var2 = wsi0Var4;
                    vzq0Var2 = vzq0Var3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    wsi0Var2 = wsi0Var;
                    vzq0Var2 = vzq0Var;
                    vu30Var3 = vu30Var2;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.et4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            vu30Var2 = vu30Var;
            i6 = i3 | 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (b0kVar3.h(z2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                if ((1572864 & i) == 0) {
                    i6 |= 524288;
                }
                i9 = i6 | 113246208;
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i9 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 == 0) {
                        }
                        zzq0 zzq0Var4 = nsi0.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        wsi0Var3 = dahVar.b0;
                        if (wsi0Var3 == null) {
                            wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.b0 = wsi0Var4;
                        } else {
                            wsi0Var4 = wsi0Var3;
                        }
                        qim0Var4 = qim0Var3;
                        vu30Var5 = vu30Var4;
                        vzq0Var3 = nsi0.a;
                        i10 = i9 & (-3670017);
                    } else {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 == 0) {
                        }
                        zzq0 zzq0Var5 = nsi0.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        wsi0Var3 = dahVar.b0;
                        if (wsi0Var3 == null) {
                            wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.b0 = wsi0Var4;
                        } else {
                            wsi0Var4 = wsi0Var3;
                        }
                        qim0Var4 = qim0Var3;
                        vu30Var5 = vu30Var4;
                        vzq0Var3 = nsi0.a;
                        i10 = i9 & (-3670017);
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                    qim0Var2 = qim0Var4;
                    vu30Var3 = vu30Var5;
                    z4 = z5;
                    wsi0Var2 = wsi0Var4;
                    vzq0Var2 = vzq0Var3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    wsi0Var2 = wsi0Var;
                    vzq0Var2 = vzq0Var;
                    vu30Var3 = vu30Var2;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.et4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i6 = 221184 | i3;
            z2 = z;
            if ((1572864 & i) == 0) {
                i6 |= 524288;
            }
            i9 = i6 | 113246208;
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i9 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 == 0) {
                    }
                    zzq0 zzq0Var6 = nsi0.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    wsi0Var3 = dahVar.b0;
                    if (wsi0Var3 == null) {
                        wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.b0 = wsi0Var4;
                    } else {
                        wsi0Var4 = wsi0Var3;
                    }
                    qim0Var4 = qim0Var3;
                    vu30Var5 = vu30Var4;
                    vzq0Var3 = nsi0.a;
                    i10 = i9 & (-3670017);
                } else {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 == 0) {
                    }
                    zzq0 zzq0Var7 = nsi0.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    wsi0Var3 = dahVar.b0;
                    if (wsi0Var3 == null) {
                        wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.b0 = wsi0Var4;
                    } else {
                        wsi0Var4 = wsi0Var3;
                    }
                    qim0Var4 = qim0Var3;
                    vu30Var5 = vu30Var4;
                    vzq0Var3 = nsi0.a;
                    i10 = i9 & (-3670017);
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                qim0Var2 = qim0Var4;
                vu30Var3 = vu30Var5;
                z4 = z5;
                wsi0Var2 = wsi0Var4;
                vzq0Var2 = vzq0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                wsi0Var2 = wsi0Var;
                vzq0Var2 = vzq0Var;
                vu30Var3 = vu30Var2;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.et4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                vu30Var2 = vu30Var;
                if (b0kVar3.i(vu30Var2)) {
                    i5 = SemanticState.Modal;
                } else {
                    i5 = SemanticState.ReadOnly;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (b0kVar3.h(z2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                if ((1572864 & i) == 0) {
                    i6 |= 524288;
                }
                i9 = i6 | 113246208;
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i9 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 == 0) {
                        }
                        zzq0 zzq0Var8 = nsi0.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        wsi0Var3 = dahVar.b0;
                        if (wsi0Var3 == null) {
                            wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.b0 = wsi0Var4;
                        } else {
                            wsi0Var4 = wsi0Var3;
                        }
                        qim0Var4 = qim0Var3;
                        vu30Var5 = vu30Var4;
                        vzq0Var3 = nsi0.a;
                        i10 = i9 & (-3670017);
                    } else {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 == 0) {
                        }
                        zzq0 zzq0Var9 = nsi0.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        wsi0Var3 = dahVar.b0;
                        if (wsi0Var3 == null) {
                            wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.b0 = wsi0Var4;
                        } else {
                            wsi0Var4 = wsi0Var3;
                        }
                        qim0Var4 = qim0Var3;
                        vu30Var5 = vu30Var4;
                        vzq0Var3 = nsi0.a;
                        i10 = i9 & (-3670017);
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                    qim0Var2 = qim0Var4;
                    vu30Var3 = vu30Var5;
                    z4 = z5;
                    wsi0Var2 = wsi0Var4;
                    vzq0Var2 = vzq0Var3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    wsi0Var2 = wsi0Var;
                    vzq0Var2 = vzq0Var;
                    vu30Var3 = vu30Var2;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.et4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i6 = 221184 | i3;
            z2 = z;
            if ((1572864 & i) == 0) {
                i6 |= 524288;
            }
            i9 = i6 | 113246208;
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i9 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 == 0) {
                    }
                    zzq0 zzq0Var10 = nsi0.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    wsi0Var3 = dahVar.b0;
                    if (wsi0Var3 == null) {
                        wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.b0 = wsi0Var4;
                    } else {
                        wsi0Var4 = wsi0Var3;
                    }
                    qim0Var4 = qim0Var3;
                    vu30Var5 = vu30Var4;
                    vzq0Var3 = nsi0.a;
                    i10 = i9 & (-3670017);
                } else {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 == 0) {
                    }
                    zzq0 zzq0Var11 = nsi0.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    wsi0Var3 = dahVar.b0;
                    if (wsi0Var3 == null) {
                        wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.b0 = wsi0Var4;
                    } else {
                        wsi0Var4 = wsi0Var3;
                    }
                    qim0Var4 = qim0Var3;
                    vu30Var5 = vu30Var4;
                    vzq0Var3 = nsi0.a;
                    i10 = i9 & (-3670017);
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                qim0Var2 = qim0Var4;
                vu30Var3 = vu30Var5;
                z4 = z5;
                wsi0Var2 = wsi0Var4;
                vzq0Var2 = vzq0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                wsi0Var2 = wsi0Var;
                vzq0Var2 = vzq0Var;
                vu30Var3 = vu30Var2;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.et4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 3072;
        vu30Var2 = vu30Var;
        i6 = i3 | 24576;
        i7 = i2 & 32;
        if (i7 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (b0kVar3.h(z2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i6 |= i8;
            }
            if ((1572864 & i) == 0) {
                i6 |= 524288;
            }
            i9 = i6 | 113246208;
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i9 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 == 0) {
                    }
                    zzq0 zzq0Var12 = nsi0.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    wsi0Var3 = dahVar.b0;
                    if (wsi0Var3 == null) {
                        wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.b0 = wsi0Var4;
                    } else {
                        wsi0Var4 = wsi0Var3;
                    }
                    qim0Var4 = qim0Var3;
                    vu30Var5 = vu30Var4;
                    vzq0Var3 = nsi0.a;
                    i10 = i9 & (-3670017);
                } else {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 == 0) {
                    }
                    zzq0 zzq0Var13 = nsi0.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    wsi0Var3 = dahVar.b0;
                    if (wsi0Var3 == null) {
                        wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.b0 = wsi0Var4;
                    } else {
                        wsi0Var4 = wsi0Var3;
                    }
                    qim0Var4 = qim0Var3;
                    vu30Var5 = vu30Var4;
                    vzq0Var3 = nsi0.a;
                    i10 = i9 & (-3670017);
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
                qim0Var2 = qim0Var4;
                vu30Var3 = vu30Var5;
                z4 = z5;
                wsi0Var2 = wsi0Var4;
                vzq0Var2 = vzq0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                wsi0Var2 = wsi0Var;
                vzq0Var2 = vzq0Var;
                vu30Var3 = vu30Var2;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.et4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i6 = 221184 | i3;
        z2 = z;
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        i9 = i6 | 113246208;
        if ((38347923 & i9) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i9 & 1, z3)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i4 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i7 == 0) {
                }
                zzq0 zzq0Var14 = nsi0.a;
                dahVar = (dah) b0kVar3.k(eah.a);
                wsi0Var3 = dahVar.b0;
                if (wsi0Var3 == null) {
                    wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                    dahVar.b0 = wsi0Var4;
                } else {
                    wsi0Var4 = wsi0Var3;
                }
                qim0Var4 = qim0Var3;
                vu30Var5 = vu30Var4;
                vzq0Var3 = nsi0.a;
                i10 = i9 & (-3670017);
            } else {
                if (i11 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i4 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i7 == 0) {
                }
                zzq0 zzq0Var15 = nsi0.a;
                dahVar = (dah) b0kVar3.k(eah.a);
                wsi0Var3 = dahVar.b0;
                if (wsi0Var3 == null) {
                    wsi0Var4 = new wsi0(eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                    dahVar.b0 = wsi0Var4;
                } else {
                    wsi0Var4 = wsi0Var3;
                }
                qim0Var4 = qim0Var3;
                vu30Var5 = vu30Var4;
                vzq0Var3 = nsi0.a;
                i10 = i9 & (-3670017);
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            guo1.f(j2iVar, function0, qim0Var4, vu30Var5, z5, wsi0Var4, vzq0Var3, b0kVar2, i10 & 268435454);
            qim0Var2 = qim0Var4;
            vu30Var3 = vu30Var5;
            z4 = z5;
            wsi0Var2 = wsi0Var4;
            vzq0Var2 = vzq0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            wsi0Var2 = wsi0Var;
            vzq0Var2 = vzq0Var;
            vu30Var3 = vu30Var2;
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.et4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gt4.b(j2iVar, function0, qim0Var2, vu30Var3, z4, wsi0Var2, vzq0Var2, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }
}
