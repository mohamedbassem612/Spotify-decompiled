package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class rhx0 {
    public static final ceo a = onm0.c;

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:95:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x024d  */
    public static final void a(qim0 qim0Var, long j, float f, long j2, int i, float f2, b0k b0kVar, final int i2, final int i3) {
        qim0 qim0Var2;
        int i4;
        long j3;
        float f3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        x340 x340Var;
        final long j4;
        final qim0 qim0Var3;
        final long j5;
        final float f4;
        final int i11;
        final float f5;
        h311 h311VarV;
        long jE;
        int i12;
        final float f6;
        final int i13;
        long j6;
        final phc1 phc1Var;
        final cb80 cb80VarG;
        final cb80 cb80VarG2;
        final cb80 cb80VarG3;
        boolean z2;
        boolean z3;
        boolean zG;
        Object objT;
        final long j7;
        final long j8;
        final float f7;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(333154241);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
            qim0Var2 = qim0Var;
        } else if ((i2 & 6) == 0) {
            qim0Var2 = qim0Var;
            i4 = (x340Var2.g(qim0Var2) ? 4 : 2) | i2;
        } else {
            qim0Var2 = qim0Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && x340Var2.f(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i4 |= x340Var2.d(f3) ? SemanticState.Hidden : SemanticState.Focused;
            }
            i5 = i4 | SemanticState.ReadOnly;
            i6 = i3 & 16;
            if (i6 != 0) {
                i9 = i4 | 25600;
                i7 = i;
            } else {
                i7 = i;
                if (x340Var2.e(i7)) {
                    i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i8 = SemanticState.Multiline;
                }
                i9 = i5 | i8;
            }
            i10 = i9 | 196608;
            if ((74899 & i10) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i10 & 1, z)) {
                x340Var2.d0();
                if ((i2 & 1) != 0 || x340Var2.E()) {
                    if (i14 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jE = eah.e(x340Var2, 26);
                        i10 &= -113;
                    } else {
                        jE = j3;
                    }
                    if (i15 != 0) {
                        f3 = 4.0f;
                    }
                    long j9 = u7h.j;
                    i12 = i10 & (-7169);
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    f6 = 4.0f;
                    i13 = i7;
                    j6 = j9;
                } else {
                    x340Var2.b0();
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                    }
                    f6 = f2;
                    i12 = i10 & (-7169);
                    qim0Var3 = qim0Var2;
                    i13 = i7;
                    jE = j3;
                    j6 = j2;
                }
                x340Var2.s();
                phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f3), 0.0f, i13, 0, null, 26);
                db80 db80VarR = t5p1.r((String) null, x340Var2, 1);
                cb80VarG = t5p1.g(db80VarR, 0.0f, 1080.0f, irn1.Y(irn1.o0(6000, 0, mlv.d, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                cb80VarG2 = t5p1.g(db80VarR, 0.0f, 360.0f, irn1.Y(irn1.e0(new g6f0((byte) 23)), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                xua0 xua0Var = new xua0();
                xua0Var.a = (short) 6000;
                xua0Var.a(Float.valueOf(0.87f), 3000).b = a;
                xua0Var.a(Float.valueOf(0.1f), 6000);
                cb80VarG3 = t5p1.g(db80VarR, 0.1f, 0.87f, irn1.Y(new yua0(xua0Var), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
                x340Var = x340Var2;
                qim0 qim0VarR = u291.r(s161.b(qim0Var3, true, new cix0((byte) 0)), 40.0f);
                boolean zG2 = x340Var.g(cb80VarG3);
                if ((57344 & i12) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z2 | zG2;
                if ((i12 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z4 | z3 | x340Var.g(cb80VarG) | x340Var.g(cb80VarG2) | x340Var.f(j6) | x340Var.i(phc1Var) | ((((i12 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(jE)) || (i12 & 48) == 32);
                objT = x340Var.T();
                if (!zG || objT == fkj0.X) {
                    j7 = j6;
                    j8 = jE;
                    f7 = f3;
                    objT = new iu30() { // from class: p.lhx0
                        public final Object invoke(Object obj) {
                            long j10 = j7;
                            phc1 phc1Var2 = phc1Var;
                            long j11 = j8;
                            DrawScope drawScope = (DrawScope) obj;
                            float fFloatValue = ((Number) cb80VarG3.getValue()).floatValue() * 360.0f;
                            boolean z5 = i13;
                            float f8 = f6;
                            if (z5 && Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.j() >> 32))) {
                                f8 += f7;
                            }
                            float fN0 = (f8 / ((float) (((double) drawScope.N0(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) cb80VarG2.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue();
                            long jG1 = drawScope.g1();
                            cab cabVarA1 = drawScope.a1();
                            long jU = cabVarA1.u();
                            cabVarA1.p().q();
                            try {
                                ((dg8) cabVarA1.b).s(fFloatValue2, jG1);
                                rhx0.d(drawScope, Math.min(fFloatValue, fN0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fN0) * 2.0f), j10, phc1Var2);
                                rhx0.d(drawScope, 0.0f, fFloatValue, j11, phc1Var2);
                                return rih1.a;
                            } finally {
                                i3a.n(cabVarA1, jU);
                            }
                        }
                    };
                    x340Var.s0(objT);
                } else {
                    j7 = j6;
                    j8 = jE;
                    f7 = f3;
                }
                j0o1.b(0, x340Var, (iu30) objT, qim0VarR);
                i11 = i13;
                f4 = f6;
                f5 = f7;
                j4 = j7;
                j5 = j8;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                j4 = j2;
                qim0Var3 = qim0Var2;
                j5 = j3;
                f4 = f2;
                i11 = i7;
                f5 = f3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.nhx0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i2 | 1);
                        qim0 qim0Var4 = qim0Var3;
                        long j10 = j5;
                        float f8 = f5;
                        long j11 = j4;
                        boolean z5 = i11;
                        float f9 = f4;
                        rhx0.a(qim0Var4, j10, f8, j11, z5 ? 1 : 0, f9, (b0k) obj, iP, i3);
                        return rih1.a;
                    }
                };
            }
        }
        i4 |= 384;
        f3 = f;
        i5 = i4 | SemanticState.ReadOnly;
        i6 = i3 & 16;
        if (i6 != 0) {
            i9 = i4 | 25600;
            i7 = i;
        } else {
            i7 = i;
            if (x340Var2.e(i7)) {
                i8 = TlsSocketProvider.READ_BUFFER_SIZE;
            } else {
                i8 = SemanticState.Multiline;
            }
            i9 = i5 | i8;
        }
        i10 = i9 | 196608;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i10 & 1, z)) {
            x340Var2.d0();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i3 & 2) != 0) {
                    jE = eah.e(x340Var2, 26);
                    i10 &= -113;
                } else {
                    jE = j3;
                }
                if (i15 != 0) {
                    f3 = 4.0f;
                }
                long j10 = u7h.j;
                i12 = i10 & (-7169);
                if (i6 != 0) {
                    i7 = 1;
                }
                f6 = 4.0f;
                i13 = i7;
                j6 = j10;
            } else {
                if (i14 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i3 & 2) != 0) {
                    jE = eah.e(x340Var2, 26);
                    i10 &= -113;
                } else {
                    jE = j3;
                }
                if (i15 != 0) {
                    f3 = 4.0f;
                }
                long j11 = u7h.j;
                i12 = i10 & (-7169);
                if (i6 != 0) {
                    i7 = 1;
                }
                f6 = 4.0f;
                i13 = i7;
                j6 = j11;
            }
            x340Var2.s();
            phc1Var = new phc1(((wat) x340Var2.k(t4k.h)).X0(f3), 0.0f, i13, 0, null, 26);
            db80 db80VarR2 = t5p1.r((String) null, x340Var2, 1);
            cb80VarG = t5p1.g(db80VarR2, 0.0f, 1080.0f, irn1.Y(irn1.o0(6000, 0, mlv.d, 2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            cb80VarG2 = t5p1.g(db80VarR2, 0.0f, 360.0f, irn1.Y(irn1.e0(new g6f0((byte) 23)), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            xua0 xua0Var2 = new xua0();
            xua0Var2.a = (short) 6000;
            xua0Var2.a(Float.valueOf(0.87f), 3000).b = a;
            xua0Var2.a(Float.valueOf(0.1f), 6000);
            cb80VarG3 = t5p1.g(db80VarR2, 0.1f, 0.87f, irn1.Y(new yua0(xua0Var2), 0, 0L, 6), (String) null, x340Var2, 4536, 8);
            x340Var = x340Var2;
            qim0 qim0VarR2 = u291.r(s161.b(qim0Var3, true, new cix0((byte) 0)), 40.0f);
            boolean zG3 = x340Var.g(cb80VarG3);
            if ((57344 & i12) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = z2 | zG3;
            if ((i12 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = z5 | z3 | x340Var.g(cb80VarG) | x340Var.g(cb80VarG2) | x340Var.f(j6) | x340Var.i(phc1Var) | ((((i12 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && x340Var.f(jE)) || (i12 & 48) == 32);
            objT = x340Var.T();
            if (zG) {
                j7 = j6;
                j8 = jE;
                f7 = f3;
                objT = new iu30() { // from class: p.lhx0
                    public final Object invoke(Object obj) {
                        long j12 = j7;
                        phc1 phc1Var2 = phc1Var;
                        long j13 = j8;
                        DrawScope drawScope = (DrawScope) obj;
                        float fFloatValue = ((Number) cb80VarG3.getValue()).floatValue() * 360.0f;
                        boolean z6 = i13;
                        float f8 = f6;
                        if (z6 && Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.j() >> 32))) {
                            f8 += f7;
                        }
                        float fN0 = (f8 / ((float) (((double) drawScope.N0(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) cb80VarG2.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue();
                        long jG1 = drawScope.g1();
                        cab cabVarA1 = drawScope.a1();
                        long jU = cabVarA1.u();
                        cabVarA1.p().q();
                        try {
                            ((dg8) cabVarA1.b).s(fFloatValue2, jG1);
                            rhx0.d(drawScope, Math.min(fFloatValue, fN0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fN0) * 2.0f), j12, phc1Var2);
                            rhx0.d(drawScope, 0.0f, fFloatValue, j13, phc1Var2);
                            return rih1.a;
                        } finally {
                            i3a.n(cabVarA1, jU);
                        }
                    }
                };
                x340Var.s0(objT);
            } else {
                j7 = j6;
                j8 = jE;
                f7 = f3;
                objT = new iu30() { // from class: p.lhx0
                    public final Object invoke(Object obj) {
                        long j12 = j7;
                        phc1 phc1Var2 = phc1Var;
                        long j13 = j8;
                        DrawScope drawScope = (DrawScope) obj;
                        float fFloatValue = ((Number) cb80VarG3.getValue()).floatValue() * 360.0f;
                        boolean z6 = i13;
                        float f8 = f6;
                        if (z6 && Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.j() >> 32))) {
                            f8 += f7;
                        }
                        float fN0 = (f8 / ((float) (((double) drawScope.N0(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) cb80VarG2.getValue()).floatValue() + ((Number) cb80VarG.getValue()).floatValue();
                        long jG1 = drawScope.g1();
                        cab cabVarA1 = drawScope.a1();
                        long jU = cabVarA1.u();
                        cabVarA1.p().q();
                        try {
                            ((dg8) cabVarA1.b).s(fFloatValue2, jG1);
                            rhx0.d(drawScope, Math.min(fFloatValue, fN0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fN0) * 2.0f), j12, phc1Var2);
                            rhx0.d(drawScope, 0.0f, fFloatValue, j13, phc1Var2);
                            return rih1.a;
                        } finally {
                            i3a.n(cabVarA1, jU);
                        }
                    }
                };
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarR2);
            i11 = i13;
            f4 = f6;
            f5 = f7;
            j4 = j7;
            j5 = j8;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            j4 = j2;
            qim0Var3 = qim0Var2;
            j5 = j3;
            f4 = f2;
            i11 = i7;
            f5 = f3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.nhx0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i2 | 1);
                    qim0 qim0Var4 = qim0Var3;
                    long j12 = j5;
                    float f8 = f5;
                    long j13 = j4;
                    boolean z6 = i11;
                    float f9 = f4;
                    rhx0.a(qim0Var4, j12, f8, j13, z6 ? 1 : 0, f9, (b0k) obj, iP, i3);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, final qim0 qim0Var, final long j, final float f, final long j2, final int i, final float f2, b0k b0kVar, final int i2) {
        int i3;
        int i4;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1798883595);
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.i(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = i3 | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.f(j) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.d(f) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.f(j2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.e(i) ? 131072 : 65536) | (x340Var.d(f2) ? 1048576 : 524288);
        if (x340Var.Y(i5 & 1, (i5 & 599187) != 599186)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            boolean z = (i5 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = new zxs(function0, (byte) 6);
                x340Var.s0(objT);
            }
            final Function0 function1 = (Function0) objT;
            final phc1 phc1Var = new phc1(((wat) x340Var.k(t4k.h)).X0(f), 0.0f, i, 0, null, 26);
            boolean zG = x340Var.g(function1);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new ki5(function1, (byte) 5);
                x340Var.s0(objT2);
            }
            qim0 qim0VarR = u291.r(s161.b(qim0Var, true, (iu30) objT2), 40.0f);
            boolean zG2 = x340Var.g(function1) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | ((i5 & 7168) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && x340Var.f(j2)) || (i5 & 24576) == 16384) | x340Var.i(phc1Var) | ((((i5 & 896) ^ 384) > 256 && x340Var.f(j)) || (i5 & 384) == 256);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj) {
                i4 = 0;
                iu30 iu30Var = new iu30() { // from class: p.hhx0
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        float fFloatValue = ((Number) function1.invoke()).floatValue() * 360.0f;
                        boolean z2 = i;
                        float f3 = f2;
                        if (z2 && Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.j() >> 32))) {
                            f3 += f;
                        }
                        float fN0 = (f3 / ((float) (((double) drawScope.N0(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fN0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fN0) * 2.0f);
                        long j3 = j2;
                        phc1 phc1Var2 = phc1Var;
                        rhx0.d(drawScope, fMin, fMin2, j3, phc1Var2);
                        rhx0.d(drawScope, 270.0f, fFloatValue, j, phc1Var2);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var);
                objT3 = iu30Var;
            } else {
                i4 = 0;
            }
            j0o1.b(i4, x340Var, (iu30) objT3, qim0VarR);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.jhx0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i2 | 1);
                    Function0 function2 = function0;
                    qim0 qim0Var2 = qim0Var;
                    long j3 = j;
                    float f3 = f;
                    long j4 = j2;
                    boolean z2 = i;
                    float f4 = f2;
                    rhx0.b(function2, qim0Var2, j3, f3, j4, z2 ? 1 : 0, f4, (b0k) obj2, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(final Function0 function0, final qim0 qim0Var, final long j, final long j2, int i, float f, iu30 iu30Var, b0k b0kVar, final int i2, final int i3) {
        final int i4;
        int i5;
        float f2;
        iu30 iu30Var2;
        final iu30 iu30Var3;
        final float f3;
        final int i6;
        final float f4;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-339970038);
        int i7 = (x340Var.i(function0) ? 4 : 2) | i2 | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.f(j) ? SemanticState.Hidden : SemanticState.Focused);
        if ((i2 & 3072) == 0) {
            i7 |= x340Var.f(j2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i7 | 24576;
            i4 = i;
        } else {
            i4 = i;
            i5 = i7 | (x340Var.e(i4) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i5 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 196608) == 0) {
                i5 |= x340Var.d(f2) ? 131072 : 65536;
            }
        }
        if ((i2 & 1572864) == 0) {
            iu30Var2 = iu30Var;
            i5 |= ((i3 & 64) == 0 && x340Var.i(iu30Var2)) ? 1048576 : 524288;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i5 & 1, (i5 & 599187) != 599186)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                if (i8 != 0) {
                    i4 = 1;
                }
                if (i9 != 0) {
                    f2 = 4.0f;
                }
                if ((i3 & 64) != 0) {
                    boolean z = ((((i5 & 896) ^ 384) > 256 && x340Var.f(j)) || (i5 & 384) == 256) | ((i5 & 57344) == 16384);
                    Object objT = x340Var.T();
                    if (z || objT == obj) {
                        objT = new iu30() { // from class: p.phx0
                            public final Object invoke(Object obj2) {
                                DrawScope drawScope = (DrawScope) obj2;
                                float fMin = Math.min(drawScope.X0(4.0f), Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)));
                                float fX0 = drawScope.X0(6.0f);
                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fMin) / 2.0f;
                                float f5 = fIntBitsToFloat > fX0 ? fX0 : fIntBitsToFloat;
                                flb0 layoutDirection = drawScope.getLayoutDirection();
                                flb0 flb0Var = flb0.b;
                                long j3 = j;
                                int i10 = i4;
                                if (layoutDirection == flb0Var) {
                                    long jG1 = drawScope.g1();
                                    cab cabVarA1 = drawScope.a1();
                                    long jU = cabVarA1.u();
                                    cabVarA1.p().q();
                                    try {
                                        ((dg8) cabVarA1.b).t(-1.0f, 1.0f, jG1);
                                        cgj1.u(drawScope, i10, j3, fMin, f5);
                                    } finally {
                                        i3a.n(cabVarA1, jU);
                                    }
                                } else {
                                    cgj1.u(drawScope, i10, j3, fMin, f5);
                                }
                                return rih1.a;
                            }
                        };
                        x340Var.s0(objT);
                    }
                    iu30Var2 = (iu30) objT;
                    i5 &= -3670017;
                }
            } else {
                x340Var.b0();
                if ((i3 & 64) != 0) {
                    i5 &= -3670017;
                }
            }
            final iu30 iu30Var4 = iu30Var2;
            int i10 = i5;
            final int i11 = i4;
            x340Var.s();
            boolean z2 = (i10 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == obj) {
                objT2 = new zxs(function0, (byte) 7);
                x340Var.s0(objT2);
            }
            final Function0 function1 = (Function0) objT2;
            qim0 qim0VarThen = qim0Var.then(fh.b);
            boolean zG = x340Var.g(function1);
            Object objT3 = x340Var.T();
            if (zG || objT3 == obj) {
                objT3 = new ki5(function1, (byte) 6);
                x340Var.s0(objT3);
            }
            qim0 qim0VarS = u291.s(s161.b(qim0VarThen, true, (iu30) objT3), 240.0f, 4.0f);
            boolean zG2 = ((458752 & i10) == 131072) | ((i10 & 57344) == 16384) | x340Var.g(function1) | ((((i10 & 7168) ^ 3072) > 2048 && x340Var.f(j2)) || (i10 & 3072) == 2048) | ((((i10 & 896) ^ 384) > 256 && x340Var.f(j)) || (i10 & 384) == 256) | ((((3670016 & i10) ^ 1572864) > 1048576 && x340Var.g(iu30Var4)) || (i10 & 1572864) == 1048576);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                f4 = f2;
                iu30 iu30Var5 = new iu30() { // from class: p.qhx0
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                        byte b = i11;
                        float fN0 = f4;
                        if (b != 0 && Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.j() >> 32))) {
                            fN0 += drawScope.N0(fIntBitsToFloat);
                        }
                        float fN1 = fN0 / drawScope.N0(Float.intBitsToFloat((int) (drawScope.j() >> 32)));
                        float fFloatValue = ((Number) function1.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fN1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            rhx0.e(drawScope, fMin, 1.0f, j2, fIntBitsToFloat, b);
                        }
                        rhx0.e(drawScope, 0.0f, fFloatValue, j, fIntBitsToFloat, b);
                        iu30Var4.invoke(drawScope);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var5);
                objT4 = iu30Var5;
            } else {
                f4 = f2;
            }
            j0o1.b(0, x340Var, (iu30) objT4, qim0VarS);
            i6 = i11;
            f3 = f4;
            iu30Var3 = iu30Var4;
        } else {
            x340Var.b0();
            iu30Var3 = iu30Var2;
            f3 = f2;
            i6 = i4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.chx0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    rhx0.c(function0, qim0Var, j, j2, i6, f3, iu30Var3, (b0k) obj2, czo1.p(i2 | 1), i3);
                    return rih1.a;
                }
            };
        }
    }

    public static final void d(DrawScope drawScope, float f, float f2, long j, phc1 phc1Var) {
        float f3 = phc1Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - (2.0f * f3);
        DrawScope.i1(drawScope, j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), phc1Var, 832);
    }

    public static final void e(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
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
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.p0(drawScope, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, (uw4) null, 480);
        }
    }
}
