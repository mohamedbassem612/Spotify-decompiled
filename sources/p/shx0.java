package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class shx0 {
    public static final ceo a = new ceo(0.2f, 0.0f, 0.8f, 1.0f);
    public static final ceo b = new ceo(0.4f, 0.0f, 1.0f, 1.0f);
    public static final ceo c = new ceo(0.0f, 0.0f, 0.65f, 1.0f);
    public static final ceo d = new ceo(0.1f, 0.0f, 0.45f, 1.0f);
    public static final ceo e = new ceo(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void a(final float f, final qim0 qim0Var, final long j, final float f2, final long j2, final int i, b0k b0kVar, final int i2) {
        int i3;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1746618448);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.d(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.f(j) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.d(f2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.f(j2) ? 16384 : SemanticState.Multiline;
        }
        if ((196608 & i2) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        boolean z = true;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            float f3 = f < 0.0f ? 0.0f : f;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            final float f4 = f3;
            final phc1 phc1Var = new phc1(((wat) x340Var.k(t4k.h)).X0(f2), 0.0f, i4, 0, null, 26);
            Float fValueOf = Float.valueOf(f4);
            if (Float.isNaN(f4)) {
                fValueOf = null;
            }
            qim0 qim0VarR = u291.r(t3k1.K(qim0Var, fValueOf != null ? fValueOf.floatValue() : 0.0f, (jsg) null, 6), 40.0f);
            boolean zD = x340Var.d(f4) | ((57344 & i3) == 16384) | x340Var.i(phc1Var);
            if ((((i3 & 896) ^ 384) <= 256 || !x340Var.f(j)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z2 = zD | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                i5 = 0;
                iu30 iu30Var = new iu30() { // from class: p.mhx0
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float f5 = 360.0f * f4;
                        long j3 = j2;
                        phc1 phc1Var2 = phc1Var;
                        shx0.e(drawScope, 0.0f, 360.0f, j3, phc1Var2);
                        shx0.e(drawScope, 270.0f, f5, j, phc1Var2);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var);
                objT = iu30Var;
            } else {
                i5 = 0;
            }
            j0o1.b(i5, x340Var, (iu30) objT, qim0VarR);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ohx0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    shx0.a(f, qim0Var, j, f2, j2, i ? 1 : 0, (b0k) obj, czo1.p(i2 | 1));
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:0x0231  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae A[PHI: r2 r8 r13
      0x00ae: PHI (r2v20 int) = (r2v9 int), (r2v9 int), (r2v21 int) binds: [B:70:0x00bd, B:62:0x00ab, B:63:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r8v6 float) = (r8v3 float), (r8v2 float), (r8v2 float) binds: [B:70:0x00bd, B:62:0x00ab, B:63:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r13v24 long) = (r13v3 long), (r13v2 long), (r13v2 long) binds: [B:70:0x00bd, B:62:0x00ab, B:63:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0204  */
    public static final void b(float f, int i, final int i2, final int i3, final long j, long j2, b0k b0kVar, final qim0 qim0Var) {
        int i4;
        final float f2;
        int i5;
        long j3;
        int i6;
        int i7;
        boolean z;
        x340 x340Var;
        final float f3;
        final long j4;
        final int i8;
        h311 h311VarV;
        long j5;
        int i9;
        final phc1 phc1Var;
        int i10;
        final cb80 cb80VarH;
        final cb80 cb80VarG;
        Object objT;
        Object obj;
        long j6;
        final cb80 cb80VarG2;
        Object objT2;
        final cb80 cb80VarG3;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT3;
        final long j7;
        int i11;
        int i12;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1119119072);
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.g(qim0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.f(j) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                f2 = f;
                i4 |= x340Var2.d(f2) ? SemanticState.Hidden : SemanticState.Focused;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    j3 = j2;
                    if (x340Var2.f(j3)) {
                        i6 = SemanticState.Modal;
                    } else {
                        i6 = SemanticState.ReadOnly;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        i7 = i;
                        if (x340Var2.e(i7)) {
                            i12 = TlsSocketProvider.READ_BUFFER_SIZE;
                        }
                        i4 |= i12;
                    } else {
                        i7 = i;
                    }
                    i12 = SemanticState.Multiline;
                    i4 |= i12;
                } else {
                    i7 = i;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var2.Y(i4 & 1, z)) {
                    x340Var2.d0();
                    if ((i2 & 1) != 0 || x340Var2.E()) {
                        if (i13 != 0) {
                            f2 = 4.0f;
                        }
                        if (i5 != 0) {
                            j3 = u7h.j;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            j5 = j3;
                            i9 = 2;
                        }
                        x340Var2.s();
                        phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f2), 0.0f, i9, 0, null, 26);
                        int i14 = i9;
                        db80 db80VarR = t5p1.r((String) null, x340Var2, 1);
                        llv llvVar = mlv.d;
                        i10 = i4;
                        cb80VarH = t5p1.h(db80VarR, 0, 5, rno1.b, irn1.Y(irn1.o0(6660, 0, llvVar, 2), 0, 0L, 6), (String) null, x340Var2, 33208, 16);
                        cb80VarG = t5p1.g(db80VarR, 0.0f, 286.0f, irn1.Y(irn1.o0(1332, 0, llvVar, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                        objT = x340Var2.T();
                        obj = fkj0.X;
                        if (objT == obj) {
                            objT = new g6f0((byte) 22);
                            x340Var2.s0(objT);
                        }
                        j6 = j5;
                        cb80VarG2 = t5p1.g(db80VarR, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                        objT2 = x340Var2.T();
                        if (objT2 == obj) {
                            objT2 = new g6f0((byte) 25);
                            x340Var2.s0(objT2);
                        }
                        cb80VarG3 = t5p1.g(db80VarR, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                        x340Var = x340Var2;
                        qim0 qim0VarR = u291.r(s161.b(qim0Var, true, new cix0((byte) 0)), 40.0f);
                        if ((i10 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean zI = z2 | x340Var.i(phc1Var) | x340Var.g(cb80VarH) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.g(cb80VarG);
                        if ((i10 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zI | z3 | ((((i10 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(j)) || (i10 & 48) == 32);
                        objT3 = x340Var.T();
                        if (!z4 || objT3 == obj) {
                            j7 = j6;
                            i11 = 0;
                            iu30 iu30Var = new iu30() { // from class: p.ihx0
                                public final Object invoke(Object obj2) {
                                    DrawScope drawScope = (DrawScope) obj2;
                                    long j8 = j7;
                                    phc1 phc1Var2 = phc1Var;
                                    shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                                    float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                                    float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                                    tob1 tob1Var = cb80VarG3;
                                    shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                                    return rih1.a;
                                }
                            };
                            x340Var.s0(iu30Var);
                            objT3 = iu30Var;
                        } else {
                            i11 = 0;
                            j7 = j6;
                        }
                        j0o1.b(i11, x340Var, (iu30) objT3, qim0VarR);
                        f3 = f2;
                        i8 = i14;
                        j4 = j7;
                    } else {
                        x340Var2.b0();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                    }
                    j5 = j3;
                    i9 = i7;
                    x340Var2.s();
                    phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f2), 0.0f, i9, 0, null, 26);
                    int i15 = i9;
                    db80 db80VarR2 = t5p1.r((String) null, x340Var2, 1);
                    llv llvVar2 = mlv.d;
                    i10 = i4;
                    cb80VarH = t5p1.h(db80VarR2, 0, 5, rno1.b, irn1.Y(irn1.o0(6660, 0, llvVar2, 2), 0, 0L, 6), (String) null, x340Var2, 33208, 16);
                    cb80VarG = t5p1.g(db80VarR2, 0.0f, 286.0f, irn1.Y(irn1.o0(1332, 0, llvVar2, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                    objT = x340Var2.T();
                    obj = fkj0.X;
                    if (objT == obj) {
                        objT = new g6f0((byte) 22);
                        x340Var2.s0(objT);
                    }
                    j6 = j5;
                    cb80VarG2 = t5p1.g(db80VarR2, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                    objT2 = x340Var2.T();
                    if (objT2 == obj) {
                        objT2 = new g6f0((byte) 25);
                        x340Var2.s0(objT2);
                    }
                    cb80VarG3 = t5p1.g(db80VarR2, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                    x340Var = x340Var2;
                    qim0 qim0VarR2 = u291.r(s161.b(qim0Var, true, new cix0((byte) 0)), 40.0f);
                    if ((i10 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean zI2 = z2 | x340Var.i(phc1Var) | x340Var.g(cb80VarH) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.g(cb80VarG);
                    if ((i10 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zI2 | z3 | ((((i10 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(j)) || (i10 & 48) == 32);
                    objT3 = x340Var.T();
                    if (z4) {
                        j7 = j6;
                        i11 = 0;
                        iu30 iu30Var2 = new iu30() { // from class: p.ihx0
                            public final Object invoke(Object obj2) {
                                DrawScope drawScope = (DrawScope) obj2;
                                long j8 = j7;
                                phc1 phc1Var2 = phc1Var;
                                shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                                float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                                float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                                tob1 tob1Var = cb80VarG3;
                                shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                                return rih1.a;
                            }
                        };
                        x340Var.s0(iu30Var2);
                        objT3 = iu30Var2;
                    } else {
                        j7 = j6;
                        i11 = 0;
                        iu30 iu30Var3 = new iu30() { // from class: p.ihx0
                            public final Object invoke(Object obj2) {
                                DrawScope drawScope = (DrawScope) obj2;
                                long j8 = j7;
                                phc1 phc1Var2 = phc1Var;
                                shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                                float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                                float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                                tob1 tob1Var = cb80VarG3;
                                shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                                return rih1.a;
                            }
                        };
                        x340Var.s0(iu30Var3);
                        objT3 = iu30Var3;
                    }
                    j0o1.b(i11, x340Var, (iu30) objT3, qim0VarR2);
                    f3 = f2;
                    i8 = i15;
                    j4 = j7;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f2;
                    j4 = j3;
                    i8 = i7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.khx0
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = czo1.p(i2 | 1);
                            shx0.b(f3, i8, iP, i3, j, j4, (b0k) obj2, qim0Var);
                            return rih1.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            j3 = j2;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    i7 = i;
                    if (x340Var2.e(i7)) {
                        i12 = TlsSocketProvider.READ_BUFFER_SIZE;
                    }
                    i4 |= i12;
                } else {
                    i7 = i;
                }
                i12 = SemanticState.Multiline;
                i4 |= i12;
            } else {
                i7 = i;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i4 & 1, z)) {
                x340Var2.d0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        f2 = 4.0f;
                    }
                    if (i5 != 0) {
                        j3 = u7h.j;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        j5 = j3;
                        i9 = 2;
                    } else {
                        j5 = j3;
                        i9 = i7;
                    }
                } else {
                    if (i13 != 0) {
                        f2 = 4.0f;
                    }
                    if (i5 != 0) {
                        j3 = u7h.j;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        j5 = j3;
                        i9 = 2;
                    } else {
                        j5 = j3;
                        i9 = i7;
                    }
                }
                x340Var2.s();
                phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f2), 0.0f, i9, 0, null, 26);
                int i16 = i9;
                db80 db80VarR3 = t5p1.r((String) null, x340Var2, 1);
                llv llvVar3 = mlv.d;
                i10 = i4;
                cb80VarH = t5p1.h(db80VarR3, 0, 5, rno1.b, irn1.Y(irn1.o0(6660, 0, llvVar3, 2), 0, 0L, 6), (String) null, x340Var2, 33208, 16);
                cb80VarG = t5p1.g(db80VarR3, 0.0f, 286.0f, irn1.Y(irn1.o0(1332, 0, llvVar3, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                objT = x340Var2.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = new g6f0((byte) 22);
                    x340Var2.s0(objT);
                }
                j6 = j5;
                cb80VarG2 = t5p1.g(db80VarR3, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                objT2 = x340Var2.T();
                if (objT2 == obj) {
                    objT2 = new g6f0((byte) 25);
                    x340Var2.s0(objT2);
                }
                cb80VarG3 = t5p1.g(db80VarR3, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                x340Var = x340Var2;
                qim0 qim0VarR3 = u291.r(s161.b(qim0Var, true, new cix0((byte) 0)), 40.0f);
                if ((i10 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zI3 = z2 | x340Var.i(phc1Var) | x340Var.g(cb80VarH) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.g(cb80VarG);
                if ((i10 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zI3 | z3 | ((((i10 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(j)) || (i10 & 48) == 32);
                objT3 = x340Var.T();
                if (z4) {
                    j7 = j6;
                    i11 = 0;
                    iu30 iu30Var4 = new iu30() { // from class: p.ihx0
                        public final Object invoke(Object obj2) {
                            DrawScope drawScope = (DrawScope) obj2;
                            long j8 = j7;
                            phc1 phc1Var2 = phc1Var;
                            shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                            float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                            tob1 tob1Var = cb80VarG3;
                            shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                            return rih1.a;
                        }
                    };
                    x340Var.s0(iu30Var4);
                    objT3 = iu30Var4;
                } else {
                    j7 = j6;
                    i11 = 0;
                    iu30 iu30Var5 = new iu30() { // from class: p.ihx0
                        public final Object invoke(Object obj2) {
                            DrawScope drawScope = (DrawScope) obj2;
                            long j8 = j7;
                            phc1 phc1Var2 = phc1Var;
                            shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                            float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                            tob1 tob1Var = cb80VarG3;
                            shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                            return rih1.a;
                        }
                    };
                    x340Var.s0(iu30Var5);
                    objT3 = iu30Var5;
                }
                j0o1.b(i11, x340Var, (iu30) objT3, qim0VarR3);
                f3 = f2;
                i8 = i16;
                j4 = j7;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f2;
                j4 = j3;
                i8 = i7;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.khx0
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i2 | 1);
                        shx0.b(f3, i8, iP, i3, j, j4, (b0k) obj2, qim0Var);
                        return rih1.a;
                    }
                };
            }
        }
        i4 |= 384;
        f2 = f;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                j3 = j2;
                if (x340Var2.f(j3)) {
                    i6 = SemanticState.Modal;
                } else {
                    i6 = SemanticState.ReadOnly;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    i7 = i;
                    if (x340Var2.e(i7)) {
                        i12 = TlsSocketProvider.READ_BUFFER_SIZE;
                    }
                    i4 |= i12;
                } else {
                    i7 = i;
                }
                i12 = SemanticState.Multiline;
                i4 |= i12;
            } else {
                i7 = i;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i4 & 1, z)) {
                x340Var2.d0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        f2 = 4.0f;
                    }
                    if (i5 != 0) {
                        j3 = u7h.j;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        j5 = j3;
                        i9 = 2;
                    } else {
                        j5 = j3;
                        i9 = i7;
                    }
                } else {
                    if (i13 != 0) {
                        f2 = 4.0f;
                    }
                    if (i5 != 0) {
                        j3 = u7h.j;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        j5 = j3;
                        i9 = 2;
                    } else {
                        j5 = j3;
                        i9 = i7;
                    }
                }
                x340Var2.s();
                phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f2), 0.0f, i9, 0, null, 26);
                int i17 = i9;
                db80 db80VarR4 = t5p1.r((String) null, x340Var2, 1);
                llv llvVar4 = mlv.d;
                i10 = i4;
                cb80VarH = t5p1.h(db80VarR4, 0, 5, rno1.b, irn1.Y(irn1.o0(6660, 0, llvVar4, 2), 0, 0L, 6), (String) null, x340Var2, 33208, 16);
                cb80VarG = t5p1.g(db80VarR4, 0.0f, 286.0f, irn1.Y(irn1.o0(1332, 0, llvVar4, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                objT = x340Var2.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = new g6f0((byte) 22);
                    x340Var2.s0(objT);
                }
                j6 = j5;
                cb80VarG2 = t5p1.g(db80VarR4, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                objT2 = x340Var2.T();
                if (objT2 == obj) {
                    objT2 = new g6f0((byte) 25);
                    x340Var2.s0(objT2);
                }
                cb80VarG3 = t5p1.g(db80VarR4, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                x340Var = x340Var2;
                qim0 qim0VarR4 = u291.r(s161.b(qim0Var, true, new cix0((byte) 0)), 40.0f);
                if ((i10 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zI4 = z2 | x340Var.i(phc1Var) | x340Var.g(cb80VarH) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.g(cb80VarG);
                if ((i10 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zI4 | z3 | ((((i10 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(j)) || (i10 & 48) == 32);
                objT3 = x340Var.T();
                if (z4) {
                    j7 = j6;
                    i11 = 0;
                    iu30 iu30Var6 = new iu30() { // from class: p.ihx0
                        public final Object invoke(Object obj2) {
                            DrawScope drawScope = (DrawScope) obj2;
                            long j8 = j7;
                            phc1 phc1Var2 = phc1Var;
                            shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                            float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                            tob1 tob1Var = cb80VarG3;
                            shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                            return rih1.a;
                        }
                    };
                    x340Var.s0(iu30Var6);
                    objT3 = iu30Var6;
                } else {
                    j7 = j6;
                    i11 = 0;
                    iu30 iu30Var7 = new iu30() { // from class: p.ihx0
                        public final Object invoke(Object obj2) {
                            DrawScope drawScope = (DrawScope) obj2;
                            long j8 = j7;
                            phc1 phc1Var2 = phc1Var;
                            shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                            float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                            tob1 tob1Var = cb80VarG3;
                            shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                            return rih1.a;
                        }
                    };
                    x340Var.s0(iu30Var7);
                    objT3 = iu30Var7;
                }
                j0o1.b(i11, x340Var, (iu30) objT3, qim0VarR4);
                f3 = f2;
                i8 = i17;
                j4 = j7;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f2;
                j4 = j3;
                i8 = i7;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.khx0
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = czo1.p(i2 | 1);
                        shx0.b(f3, i8, iP, i3, j, j4, (b0k) obj2, qim0Var);
                        return rih1.a;
                    }
                };
            }
        }
        i4 |= 3072;
        j3 = j2;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i7 = i;
                if (x340Var2.e(i7)) {
                    i12 = TlsSocketProvider.READ_BUFFER_SIZE;
                }
                i4 |= i12;
            } else {
                i7 = i;
            }
            i12 = SemanticState.Multiline;
            i4 |= i12;
        } else {
            i7 = i;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i4 & 1, z)) {
            x340Var2.d0();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    f2 = 4.0f;
                }
                if (i5 != 0) {
                    j3 = u7h.j;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    j5 = j3;
                    i9 = 2;
                } else {
                    j5 = j3;
                    i9 = i7;
                }
            } else {
                if (i13 != 0) {
                    f2 = 4.0f;
                }
                if (i5 != 0) {
                    j3 = u7h.j;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    j5 = j3;
                    i9 = 2;
                } else {
                    j5 = j3;
                    i9 = i7;
                }
            }
            x340Var2.s();
            phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f2), 0.0f, i9, 0, null, 26);
            int i18 = i9;
            db80 db80VarR5 = t5p1.r((String) null, x340Var2, 1);
            llv llvVar5 = mlv.d;
            i10 = i4;
            cb80VarH = t5p1.h(db80VarR5, 0, 5, rno1.b, irn1.Y(irn1.o0(6660, 0, llvVar5, 2), 0, 0L, 6), (String) null, x340Var2, 33208, 16);
            cb80VarG = t5p1.g(db80VarR5, 0.0f, 286.0f, irn1.Y(irn1.o0(1332, 0, llvVar5, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            objT = x340Var2.T();
            obj = fkj0.X;
            if (objT == obj) {
                objT = new g6f0((byte) 22);
                x340Var2.s0(objT);
            }
            j6 = j5;
            cb80VarG2 = t5p1.g(db80VarR5, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            objT2 = x340Var2.T();
            if (objT2 == obj) {
                objT2 = new g6f0((byte) 25);
                x340Var2.s0(objT2);
            }
            cb80VarG3 = t5p1.g(db80VarR5, 0.0f, 290.0f, irn1.Y(irn1.e0((iu30) objT2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            x340Var = x340Var2;
            qim0 qim0VarR5 = u291.r(s161.b(qim0Var, true, new cix0((byte) 0)), 40.0f);
            if ((i10 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zI5 = z2 | x340Var.i(phc1Var) | x340Var.g(cb80VarH) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.g(cb80VarG);
            if ((i10 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = zI5 | z3 | ((((i10 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(j)) || (i10 & 48) == 32);
            objT3 = x340Var.T();
            if (z4) {
                j7 = j6;
                i11 = 0;
                iu30 iu30Var8 = new iu30() { // from class: p.ihx0
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        long j8 = j7;
                        phc1 phc1Var2 = phc1Var;
                        shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                        float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                        tob1 tob1Var = cb80VarG3;
                        shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var8);
                objT3 = iu30Var8;
            } else {
                j7 = j6;
                i11 = 0;
                iu30 iu30Var9 = new iu30() { // from class: p.ihx0
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        long j8 = j7;
                        phc1 phc1Var2 = phc1Var;
                        shx0.e(drawScope, 0.0f, 360.0f, j8, phc1Var2);
                        float fIntValue = (((Number) cb80VarH.getValue()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) cb80VarG2.getValue()).floatValue();
                        tob1 tob1Var = cb80VarG3;
                        shx0.e(drawScope, ((Number) tob1Var.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue() + (fIntValue - 90.0f) + (phc1Var2.c == 0 ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) tob1Var.getValue()).floatValue()), 0.1f), j, phc1Var2);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var9);
                objT3 = iu30Var9;
            }
            j0o1.b(i11, x340Var, (iu30) objT3, qim0VarR5);
            f3 = f2;
            i8 = i18;
            j4 = j7;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            f3 = f2;
            j4 = j3;
            i8 = i7;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.khx0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i2 | 1);
                    shx0.b(f3, i8, iP, i3, j, j4, (b0k) obj2, qim0Var);
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(final int i, final int i2, final long j, final long j2, b0k b0kVar, final qim0 qim0Var) {
        int i3;
        x340 x340Var;
        int i4;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1501635280);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.g(qim0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.f(j2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.e(i) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var2.d0();
            if ((i2 & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            db80 db80VarR = t5p1.r((String) null, x340Var2, 1);
            Object objT = x340Var2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new g6f0((byte) 26);
                x340Var2.s0(objT);
            }
            final cb80 cb80VarG = t5p1.g(db80VarR, 0.0f, 1.0f, irn1.Y(irn1.e0((iu30) objT), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            Object objT2 = x340Var2.T();
            if (objT2 == obj) {
                objT2 = new g6f0((byte) 27);
                x340Var2.s0(objT2);
            }
            final cb80 cb80VarG2 = t5p1.g(db80VarR, 0.0f, 1.0f, irn1.Y(irn1.e0((iu30) objT2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = new g6f0((byte) 28);
                x340Var2.s0(objT3);
            }
            final cb80 cb80VarG3 = t5p1.g(db80VarR, 0.0f, 1.0f, irn1.Y(irn1.e0((iu30) objT3), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            Object objT4 = x340Var2.T();
            if (objT4 == obj) {
                objT4 = new g6f0((byte) 29);
                x340Var2.s0(objT4);
            }
            final cb80 cb80VarG4 = t5p1.g(db80VarR, 0.0f, 1.0f, irn1.Y(irn1.e0((iu30) objT4), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            x340Var = x340Var2;
            qim0 qim0VarS = u291.s(s161.b(uyn1.z(0.0f, 10.0f, 1, s161.b(j9k1.x(qim0Var, new dh((byte) 12)), true, new g6f0((byte) 24))), true, new cix0((byte) 0)), 240.0f, 4.0f);
            boolean zG = ((((i3 & 7168) ^ 3072) > 2048 && x340Var.e(i)) || (i3 & 3072) == 2048) | ((((i3 & 896) ^ 384) > 256 && x340Var.f(j2)) || (i3 & 384) == 256) | x340Var.g(cb80VarG) | x340Var.g(cb80VarG2) | ((((i3 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && x340Var.f(j)) || (i3 & 48) == 32) | x340Var.g(cb80VarG3) | x340Var.g(cb80VarG4);
            Object objT5 = x340Var.T();
            if (zG || objT5 == obj) {
                i4 = 0;
                iu30 iu30Var = new iu30() { // from class: p.dhx0
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                        long j3 = j2;
                        boolean z = i;
                        shx0.f(drawScope, 0.0f, 1.0f, j3, fIntBitsToFloat, z ? 1 : 0);
                        tob1 tob1Var = cb80VarG;
                        float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                        tob1 tob1Var2 = cb80VarG2;
                        float fFloatValue2 = fFloatValue - ((Number) tob1Var2.getValue()).floatValue();
                        long j4 = j;
                        if (fFloatValue2 > 0.0f) {
                            shx0.f(drawScope, ((Number) tob1Var.getValue()).floatValue(), ((Number) tob1Var2.getValue()).floatValue(), j4, fIntBitsToFloat, z ? 1 : 0);
                        }
                        tob1 tob1Var3 = cb80VarG3;
                        float fFloatValue3 = ((Number) tob1Var3.getValue()).floatValue();
                        tob1 tob1Var4 = cb80VarG4;
                        if (fFloatValue3 - ((Number) tob1Var4.getValue()).floatValue() > 0.0f) {
                            shx0.f(drawScope, ((Number) tob1Var3.getValue()).floatValue(), ((Number) tob1Var4.getValue()).floatValue(), j4, fIntBitsToFloat, z ? 1 : 0);
                        }
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var);
                objT5 = iu30Var;
            } else {
                i4 = 0;
            }
            j0o1.b(i4, x340Var, (iu30) objT5, qim0VarS);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ehx0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i2 | 1);
                    boolean z = i;
                    long j3 = j;
                    long j4 = j2;
                    shx0.c(z ? 1 : 0, iP, j3, j4, (b0k) obj2, qim0Var);
                    return rih1.a;
                }
            };
        }
    }

    public static final void d(final float f, final int i, final int i2, final long j, final long j2, b0k b0kVar, final qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-531984864);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.d(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.f(j) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.f(j2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.e(i) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        boolean z = true;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            float f2 = f < 0.0f ? 0.0f : f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            qim0 qim0VarZ = uyn1.z(0.0f, 10.0f, 1, s161.b(j9k1.x(qim0Var, new dh((byte) 12)), true, new g6f0((byte) 24)));
            Float fValueOf = Float.valueOf(f2);
            if (Float.isNaN(f2)) {
                fValueOf = null;
            }
            qim0 qim0VarS = u291.s(t3k1.K(qim0VarZ, fValueOf != null ? fValueOf.floatValue() : 0.0f, (jsg) null, 6), 240.0f, 4.0f);
            boolean zD = ((((i3 & 7168) ^ 3072) > 2048 && x340Var.f(j2)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && x340Var.e(i)) || (i3 & 24576) == 16384) | x340Var.d(f2);
            if ((((i3 & 896) ^ 384) <= 256 || !x340Var.f(j)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z2 = zD | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                final float f3 = f2;
                iu30 iu30Var = new iu30() { // from class: p.fhx0
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                        long j3 = j2;
                        boolean z3 = i;
                        shx0.f(drawScope, 0.0f, 1.0f, j3, fIntBitsToFloat, z3 ? 1 : 0);
                        shx0.f(drawScope, 0.0f, f3, j, fIntBitsToFloat, z3 ? 1 : 0);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var);
                objT = iu30Var;
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarS);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ghx0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i2 | 1);
                    float f4 = f;
                    boolean z3 = i;
                    long j3 = j;
                    long j4 = j2;
                    shx0.d(f4, z3 ? 1 : 0, iP, j3, j4, (b0k) obj, qim0Var);
                    return rih1.a;
                }
            };
        }
    }

    public static final void e(DrawScope drawScope, float f, float f2, long j, phc1 phc1Var) {
        float f3 = phc1Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - (2.0f * f3);
        DrawScope.i1(drawScope, j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), phc1Var, 832);
    }

    public static final void f(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = drawScope.getLayoutDirection() == flb0.a;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            DrawScope.p0(drawScope, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, (uw4) null, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        jsg jsgVar = new jsg(f7, fIntBitsToFloat - f7);
        float fFloatValue = ((Number) yoi1.u(Float.valueOf(f5), jsgVar)).floatValue();
        float fFloatValue2 = ((Number) yoi1.u(Float.valueOf(f6), jsgVar)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.p0(drawScope, j, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, (uw4) null, 480);
        }
    }
}
