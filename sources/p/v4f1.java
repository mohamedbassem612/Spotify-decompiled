package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v4f1 {
    public static final zzq0 a = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);

    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:113:0x0210  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    public static final void a(final r5f1 r5f1Var, qim0 qim0Var, hw61 hw61Var, float f, hw61 hw61Var2, long j, long j2, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        int i3;
        hw61 hw61Var3;
        int i4;
        long jE;
        long jE2;
        int i5;
        boolean z;
        b0k b0kVar2;
        final float f2;
        final hw61 hw61Var4;
        final hw61 hw61Var5;
        final long j3;
        final long j4;
        final qim0 qim0Var2;
        h311 h311VarV;
        int i6;
        qim0 qim0Var3;
        float f3;
        hw61 hw61VarB;
        int i7;
        hw61 hw61Var6;
        qim0 qim0Var4;
        int i8;
        qim0 qim0Var5;
        qim0 qim0VarThen;
        hw61 hw61Var7;
        Object objT;
        Object obj;
        final ven0 ven0Var;
        boolean z2;
        Object objT2;
        boolean zG;
        Object objT3;
        int i9;
        int i10;
        int i11;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-343758958);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(r5f1Var) : b0kVar3.i(r5f1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i3 | 48;
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                hw61Var3 = hw61Var;
                i12 |= b0kVar3.g(hw61Var3) ? SemanticState.Hidden : SemanticState.Focused;
            }
            i4 = i12 | 3072;
            if ((i & 24576) == 0) {
                i4 = i12 | 11264;
            }
            if ((196608 & i) == 0) {
                jE = j;
                if ((i2 & 16) == 0 || !b0kVar3.f(jE)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i4 |= i11;
            } else {
                jE = j;
            }
            if ((1572864 & i) == 0) {
                jE2 = j2;
                if ((i2 & 32) == 0 || !b0kVar3.f(jE2)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i4 |= i10;
            } else {
                jE2 = j2;
            }
            i5 = 113246208 | i4;
            if ((805306368 & i) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            }
            if ((306783379 & i5) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                i6 = i & 1;
                qim0Var3 = nim0.a;
                if (i6 != 0 || b0kVar3.E()) {
                    if (i13 != 0) {
                        hw61Var3 = null;
                    }
                    f3 = m4f1.b;
                    hw61VarB = px61.b(b0kVar3, 5);
                    i7 = i5 & (-57345);
                    if ((i2 & 16) != 0) {
                        jE = eah.e(b0kVar3, 4);
                        i7 = i5 & (-516097);
                    }
                    if ((i2 & 32) != 0) {
                        jE2 = eah.e(b0kVar3, 6);
                        i7 &= -3670017;
                    }
                    hw61Var6 = hw61Var3;
                    qim0Var4 = qim0Var3;
                    i8 = i7;
                } else {
                    b0kVar3.b0();
                    int i14 = i5 & (-57345);
                    if ((i2 & 16) != 0) {
                        i14 = i5 & (-516097);
                    }
                    if ((i2 & 32) != 0) {
                        i14 &= -3670017;
                    }
                    hw61VarB = hw61Var2;
                    hw61Var6 = hw61Var3;
                    i8 = i14;
                    qim0Var4 = qim0Var;
                    f3 = f;
                }
                b0kVar3.s();
                if (hw61Var6 != null) {
                    b0kVar3.i0(-1720477287);
                    objT = b0kVar3.T();
                    obj = fkj0.X;
                    if (objT == obj) {
                        objT = v8r.q(new kch0(kch0.a()));
                        b0kVar3.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    final wat watVar = (wat) b0kVar3.k(t4k.h);
                    final long jA = ((crl1) b0kVar3.k(t4k.u)).a();
                    if ((i8 & 14) != 4 || ((i8 & 8) != 0 && b0kVar3.i(r5f1Var))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = b0kVar3.T();
                    if (z2 || objT2 == obj) {
                        objT2 = new w7d1((Object) r5f1Var, (byte) 9);
                        b0kVar3.s0(objT2);
                    }
                    final iu30 iu30Var = (iu30) objT2;
                    final mfv0 mfv0Var = r5f1Var.b;
                    qim0VarThen = j9k1.x(qim0Var3, new xu30() { // from class: p.t4f1
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            long jFloatToRawIntBits;
                            int iFloatToRawIntBits;
                            ifh0 ifh0Var = (ifh0) obj2;
                            q5t0 q5t0VarH = ((afh0) obj3).H(((hjl) obj4).a);
                            int i15 = q5t0VarH.a;
                            int i16 = q5t0VarH.b;
                            int i17 = (int) (jA >> 32);
                            float f4 = i15;
                            float f5 = i16;
                            elb0 elb0Var = (elb0) iu30Var.invoke(ifh0Var);
                            if (elb0Var != null) {
                                int iI0 = watVar.i0(4.0f);
                                n511 n511VarN = nho1.n(elb0Var, true);
                                float f6 = n511VarN.b;
                                boolean z3 = mfv0Var instanceof n5f1;
                                if (!z3 ? (f6 - f5) - iI0 < 0.0f : (f6 - f5) - iI0 < 0.0f) {
                                    f5 = 0.0f;
                                }
                                if (z3) {
                                    jFloatToRawIntBits = Float.floatToRawIntBits(v4f1.c(f4, i17, n511VarN));
                                    iFloatToRawIntBits = Float.floatToRawIntBits(f5);
                                } else {
                                    jFloatToRawIntBits = Float.floatToRawIntBits(v4f1.c(f4, i17, n511VarN));
                                    iFloatToRawIntBits = Float.floatToRawIntBits(f5);
                                }
                                long j5 = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                                float[] fArrA = kch0.a();
                                kch0.k(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), fArrA);
                                if (z3) {
                                    if (f5 == 0.0f) {
                                        kch0.g(fArrA);
                                    }
                                } else if (f5 == 0.0f) {
                                    kch0.g(fArrA);
                                }
                                ven0Var.setValue(new kch0(fArrA));
                            }
                            return ifh0Var.S(i15, i16, b7x.a, new p6(q5t0VarH, (byte) 21));
                        }
                    }).then(qim0Var4);
                    qim0Var5 = qim0Var4;
                    zG = b0kVar3.g(hw61VarB) | ((i8 & 896) == 256);
                    objT3 = b0kVar3.T();
                    if (zG || objT3 == obj) {
                        objT3 = new a4f1(ven0Var, hw61VarB, hw61Var6);
                        b0kVar3.s0(objT3);
                    }
                    hw61Var7 = (a4f1) objT3;
                    b0kVar3.r(false);
                } else {
                    qim0Var5 = qim0Var4;
                    b0kVar3.i0(-1719831991);
                    b0kVar3.r(false);
                    qim0VarThen = qim0Var5;
                    hw61Var7 = hw61VarB;
                }
                int i15 = i8 >> 9;
                b0kVar2 = b0kVar3;
                long j5 = jE2;
                w3d1.a(qim0VarThen, hw61Var7, j5, 0L, 0.0f, 0.0f, null, apo.r(-1573998995, new u4f1(f3, jE, j2iVar), b0kVar3), b0kVar2, ((i8 >> 12) & 896) | 12582912 | (57344 & i15) | (i15 & 458752), 72);
                qim0Var2 = qim0Var5;
                hw61Var5 = hw61Var6;
                f2 = f3;
                hw61Var4 = hw61VarB;
                j3 = jE;
                j4 = j5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                f2 = f;
                hw61Var4 = hw61Var2;
                hw61Var5 = hw61Var3;
                j3 = jE;
                j4 = jE2;
                qim0Var2 = qim0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.r4f1
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        v4f1.a(r5f1Var, qim0Var2, hw61Var5, f2, hw61Var4, j3, j4, j2iVar, (b0k) obj2, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i12 = i3 | 432;
        hw61Var3 = hw61Var;
        i4 = i12 | 3072;
        if ((i & 24576) == 0) {
            i4 = i12 | 11264;
        }
        if ((196608 & i) == 0) {
            jE = j;
            if ((i2 & 16) == 0) {
                i11 = 65536;
            } else {
                i11 = 65536;
            }
            i4 |= i11;
        } else {
            jE = j;
        }
        if ((1572864 & i) == 0) {
            jE2 = j2;
            if ((i2 & 32) == 0) {
                i10 = 524288;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        } else {
            jE2 = j2;
        }
        i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i5 |= i9;
        }
        if ((306783379 & i5) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i5 & 1, z)) {
            b0kVar3.d0();
            i6 = i & 1;
            qim0Var3 = nim0.a;
            if (i6 != 0) {
                if (i13 != 0) {
                    hw61Var3 = null;
                }
                f3 = m4f1.b;
                hw61VarB = px61.b(b0kVar3, 5);
                i7 = i5 & (-57345);
                if ((i2 & 16) != 0) {
                    jE = eah.e(b0kVar3, 4);
                    i7 = i5 & (-516097);
                }
                if ((i2 & 32) != 0) {
                    jE2 = eah.e(b0kVar3, 6);
                    i7 &= -3670017;
                }
                hw61Var6 = hw61Var3;
                qim0Var4 = qim0Var3;
                i8 = i7;
            } else {
                if (i13 != 0) {
                    hw61Var3 = null;
                }
                f3 = m4f1.b;
                hw61VarB = px61.b(b0kVar3, 5);
                i7 = i5 & (-57345);
                if ((i2 & 16) != 0) {
                    jE = eah.e(b0kVar3, 4);
                    i7 = i5 & (-516097);
                }
                if ((i2 & 32) != 0) {
                    jE2 = eah.e(b0kVar3, 6);
                    i7 &= -3670017;
                }
                hw61Var6 = hw61Var3;
                qim0Var4 = qim0Var3;
                i8 = i7;
            }
            b0kVar3.s();
            if (hw61Var6 != null) {
                b0kVar3.i0(-1720477287);
                objT = b0kVar3.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = v8r.q(new kch0(kch0.a()));
                    b0kVar3.s0(objT);
                }
                ven0Var = (ven0) objT;
                final wat watVar2 = (wat) b0kVar3.k(t4k.h);
                final long jA2 = ((crl1) b0kVar3.k(t4k.u)).a();
                if ((i8 & 14) != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objT2 = b0kVar3.T();
                if (z2) {
                    objT2 = new w7d1((Object) r5f1Var, (byte) 9);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new w7d1((Object) r5f1Var, (byte) 9);
                    b0kVar3.s0(objT2);
                }
                final iu30 iu30Var2 = (iu30) objT2;
                final mfv0 mfv0Var2 = r5f1Var.b;
                qim0VarThen = j9k1.x(qim0Var3, new xu30() { // from class: p.t4f1
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        ifh0 ifh0Var = (ifh0) obj2;
                        q5t0 q5t0VarH = ((afh0) obj3).H(((hjl) obj4).a);
                        int i16 = q5t0VarH.a;
                        int i17 = q5t0VarH.b;
                        int i18 = (int) (jA2 >> 32);
                        float f4 = i16;
                        float f5 = i17;
                        elb0 elb0Var = (elb0) iu30Var2.invoke(ifh0Var);
                        if (elb0Var != null) {
                            int iI0 = watVar2.i0(4.0f);
                            n511 n511VarN = nho1.n(elb0Var, true);
                            float f6 = n511VarN.b;
                            boolean z3 = mfv0Var2 instanceof n5f1;
                            if (!z3 ? (f6 - f5) - iI0 < 0.0f : (f6 - f5) - iI0 < 0.0f) {
                                f5 = 0.0f;
                            }
                            if (z3) {
                                jFloatToRawIntBits = Float.floatToRawIntBits(v4f1.c(f4, i18, n511VarN));
                                iFloatToRawIntBits = Float.floatToRawIntBits(f5);
                            } else {
                                jFloatToRawIntBits = Float.floatToRawIntBits(v4f1.c(f4, i18, n511VarN));
                                iFloatToRawIntBits = Float.floatToRawIntBits(f5);
                            }
                            long j6 = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                            float[] fArrA = kch0.a();
                            kch0.k(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), fArrA);
                            if (z3) {
                                if (f5 == 0.0f) {
                                    kch0.g(fArrA);
                                }
                            } else if (f5 == 0.0f) {
                                kch0.g(fArrA);
                            }
                            ven0Var.setValue(new kch0(fArrA));
                        }
                        return ifh0Var.S(i16, i17, b7x.a, new p6(q5t0VarH, (byte) 21));
                    }
                }).then(qim0Var4);
                qim0Var5 = qim0Var4;
                zG = b0kVar3.g(hw61VarB) | ((i8 & 896) == 256);
                objT3 = b0kVar3.T();
                if (zG) {
                    objT3 = new a4f1(ven0Var, hw61VarB, hw61Var6);
                    b0kVar3.s0(objT3);
                } else {
                    objT3 = new a4f1(ven0Var, hw61VarB, hw61Var6);
                    b0kVar3.s0(objT3);
                }
                hw61Var7 = (a4f1) objT3;
                b0kVar3.r(false);
            } else {
                qim0Var5 = qim0Var4;
                b0kVar3.i0(-1719831991);
                b0kVar3.r(false);
                qim0VarThen = qim0Var5;
                hw61Var7 = hw61VarB;
            }
            int i16 = i8 >> 9;
            b0kVar2 = b0kVar3;
            long j6 = jE2;
            w3d1.a(qim0VarThen, hw61Var7, j6, 0L, 0.0f, 0.0f, null, apo.r(-1573998995, new u4f1(f3, jE, j2iVar), b0kVar3), b0kVar2, ((i8 >> 12) & 896) | 12582912 | (57344 & i16) | (i16 & 458752), 72);
            qim0Var2 = qim0Var5;
            hw61Var5 = hw61Var6;
            f2 = f3;
            hw61Var4 = hw61VarB;
            j3 = jE;
            j4 = j6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f2 = f;
            hw61Var4 = hw61Var2;
            hw61Var5 = hw61Var3;
            j3 = jE;
            j4 = jE2;
            qim0Var2 = qim0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.r4f1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    v4f1.a(r5f1Var, qim0Var2, hw61Var5, f2, hw61Var4, j3, j4, j2iVar, (b0k) obj2, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(final mfv0 mfv0Var, final j2i j2iVar, final w5f1 w5f1Var, qim0 qim0Var, boolean z, final j2i j2iVar2, b0k b0kVar, final int i, final int i2) {
        int i3;
        final qim0 qim0Var2;
        final boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-293753984);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(mfv0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? x340Var.g(w5f1Var) : x340Var.i(w5f1Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= x340Var.g(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        int i5 = i3 | 14376960;
        if ((100663296 & i) == 0) {
            i5 |= x340Var.i(j2iVar2) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i5 & 1, (38347923 & i5) != 38347922)) {
            qim0 qim0Var3 = i4 != 0 ? nim0.a : qim0Var;
            mhg1 mhg1VarU = bno1.u(w5f1Var.a(), "tooltip transition", x340Var, 48, 0);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new r5f1(new e45(ven0Var, (byte) 11), mfv0Var);
                x340Var.s0(objT2);
            }
            z6p1.b(mfv0Var, apo.r(-527401546, new g7t(mhg1VarU, j2iVar, (r5f1) objT2, (byte) 6), x340Var), w5f1Var, qim0Var3, apo.r(-23901870, new ek1(ven0Var, j2iVar2, (byte) 17), x340Var), x340Var, (i5 & 14) | 100663344 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128));
            qim0Var2 = qim0Var3;
            z2 = true;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.s4f1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v4f1.b(mfv0Var, j2iVar, w5f1Var, qim0Var2, z2, j2iVar2, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final float c(float f, int i, n511 n511Var) {
        float fMin;
        float f2 = n511Var.a;
        float f3 = n511Var.c;
        float f4 = (f2 + f3) / 2.0f;
        float f5 = i;
        if (f >= f5) {
            return f4;
        }
        float f6 = f / 2.0f;
        if (f4 - f6 < 0.0f) {
            fMin = Math.max(f - f5, -f2);
        } else {
            if (f4 + f6 <= f5) {
                return f6;
            }
            fMin = Math.min(f - f3, 0.0f);
        }
        return fMin + f4;
    }
}
