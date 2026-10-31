package p;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class k1p1 {
    public static b180 a;
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:73:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x0171  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01da  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x020a  */
    /* JADX WARN: Code duplicated, block: B:89:0x020e  */
    /* JADX WARN: Code duplicated, block: B:92:0x021b  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, int i, qim0 qim0Var, long j, boolean z, m1a m1aVar, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        boolean z2;
        int i4;
        boolean zI;
        int i5;
        int i6;
        boolean z3;
        m1a m1aVar2;
        boolean z4;
        qim0 qim0Var2;
        h311 h311VarV;
        int i7;
        qim0 qim0VarK;
        int iC;
        boolean z5;
        qim0 qim0Var3;
        boolean z6;
        j2i j2iVarR;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        qim0 qim0VarE2;
        m1a m1aVar3 = m1aVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(990067154);
        int i8 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.g(str2) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i8 |= x340Var.e(l1d.C(i)) ? 256 : 128;
        }
        int i9 = i8 | 3072 | (x340Var.f(j) ? 16384 : 8192);
        int i10 = i3 & 32;
        if (i10 == 0) {
            if ((196608 & i2) == 0) {
                z2 = z;
                i9 |= x340Var.h(z2) ? 131072 : 65536;
            }
            i4 = i3 & 64;
            if (i4 != 0) {
                i5 = 1572864;
            } else {
                if ((2097152 & i2) == 0) {
                    zI = x340Var.g(m1aVar3);
                } else {
                    zI = x340Var.i(m1aVar3);
                }
                if (zI) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
            }
            i6 = i9 | i5;
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                x340Var.d0();
                i7 = i2 & 1;
                qim0VarK = nim0.a;
                if (i7 != 0 || x340Var.E()) {
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        z4 = z2;
                        qim0Var2 = qim0VarK;
                        m1aVar3 = null;
                    } else {
                        z4 = z2;
                        qim0Var2 = qim0VarK;
                    }
                } else {
                    x340Var.b0();
                    z4 = z2;
                    qim0Var2 = qim0Var;
                }
                x340Var.s();
                iC = l1d.C(i);
                if (iC != 0) {
                    if (iC != 1) {
                        x340Var.i0(1550493148);
                        cr31 cr31Var = er31.a;
                        uwr uwrVar = cbx.a;
                        avw0 avw0Var = cbx.b(x340Var).c;
                        qim0VarE2 = d1u.E(2.0f, cbx.a(x340Var).c.c, qim0VarK, cr31Var);
                        z5 = false;
                        x340Var.r(false);
                    } else if (iC != 2) {
                        x340Var.i0(-2028184001);
                        qim0 qim0VarD = u291.d(qim0VarK, 1.0f);
                        cr31 cr31Var2 = er31.a;
                        uwr uwrVar2 = cbx.a;
                        qim0VarE2 = uyn1.x(d1u.E(2.0f, cbx.a(x340Var).c.c, qim0VarD, cr31Var2), 4.0f);
                        z5 = false;
                        x340Var.r(false);
                    } else {
                        if (iC == 3) {
                            throw p3d1.k(x340Var, -2028195691, false);
                        }
                        x340Var.i0(-2028178465);
                        qim0 qim0VarD2 = u291.d(qim0VarK, 1.0f);
                        cr31 cr31Var3 = er31.a;
                        uwr uwrVar3 = cbx.a;
                        qim0VarE2 = uyn1.x(d1u.E(2.0f, cbx.a(x340Var).b.b, qim0VarD2, cr31Var3), 4.0f);
                        z5 = false;
                        x340Var.r(false);
                    }
                    qim0Var3 = qim0VarE2;
                } else {
                    z5 = false;
                    x340Var.i0(-2028177190);
                    x340Var.r(false);
                    qim0Var3 = qim0VarK;
                }
                if (z4) {
                    qim0VarK = d9y0.k(qim0VarK, 0.5f);
                }
                z6 = z5;
                j2iVarR = apo.r(158894522, new rb9(qim0Var3, qim0VarK, str, str2, j), x340Var);
                if (m1aVar3 != null) {
                    x340Var.i0(1551496060);
                    m1aVar2 = m1aVar3;
                    kno1.e(m1aVar3.b, apo.r(1205804610, new pb9(m1aVar3, z6 ? (byte) 1 : (byte) 0), x340Var), anm1.N("carousel-item-avatar-test-tag", qim0Var2), apo.r(-868216192, new pu2(j2iVarR, (byte) 8), x340Var), x340Var, 25008, 0);
                    x340Var.r(z6);
                } else {
                    m1aVar2 = m1aVar3;
                    x340Var.i0(1551991533);
                    qim0 qim0VarN = anm1.N("carousel-item-avatar-test-tag", u291.d(qim0Var2, 1.0f));
                    gfh0VarC = t1c.c(een.h, z6);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarN);
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    k4s0.i(6, j2iVarR, x340Var, true, z6);
                }
            } else {
                x340Var.b0();
                m1aVar2 = m1aVar3;
                z4 = z2;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qb9(str, str2, i, qim0Var2, j, z4, m1aVar2, i2, i3);
            }
        }
        i9 |= 196608;
        z2 = z;
        i4 = i3 & 64;
        if (i4 != 0) {
            i5 = 1572864;
        } else {
            if ((2097152 & i2) == 0) {
                zI = x340Var.g(m1aVar3);
            } else {
                zI = x340Var.i(m1aVar3);
            }
            if (zI) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
        }
        i6 = i9 | i5;
        if ((599187 & i6) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i6 & 1, z3)) {
            x340Var.d0();
            i7 = i2 & 1;
            qim0VarK = nim0.a;
            if (i7 != 0) {
                if (i10 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    z4 = z2;
                    qim0Var2 = qim0VarK;
                    m1aVar3 = null;
                } else {
                    z4 = z2;
                    qim0Var2 = qim0VarK;
                }
            } else {
                if (i10 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    z4 = z2;
                    qim0Var2 = qim0VarK;
                    m1aVar3 = null;
                } else {
                    z4 = z2;
                    qim0Var2 = qim0VarK;
                }
            }
            x340Var.s();
            iC = l1d.C(i);
            if (iC != 0) {
                if (iC != 1) {
                    x340Var.i0(1550493148);
                    cr31 cr31Var4 = er31.a;
                    uwr uwrVar4 = cbx.a;
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    qim0VarE2 = d1u.E(2.0f, cbx.a(x340Var).c.c, qim0VarK, cr31Var4);
                    z5 = false;
                    x340Var.r(false);
                } else if (iC != 2) {
                    x340Var.i0(-2028184001);
                    qim0 qim0VarD3 = u291.d(qim0VarK, 1.0f);
                    cr31 cr31Var5 = er31.a;
                    uwr uwrVar5 = cbx.a;
                    qim0VarE2 = uyn1.x(d1u.E(2.0f, cbx.a(x340Var).c.c, qim0VarD3, cr31Var5), 4.0f);
                    z5 = false;
                    x340Var.r(false);
                } else {
                    if (iC == 3) {
                        throw p3d1.k(x340Var, -2028195691, false);
                    }
                    x340Var.i0(-2028178465);
                    qim0 qim0VarD4 = u291.d(qim0VarK, 1.0f);
                    cr31 cr31Var6 = er31.a;
                    uwr uwrVar6 = cbx.a;
                    qim0VarE2 = uyn1.x(d1u.E(2.0f, cbx.a(x340Var).b.b, qim0VarD4, cr31Var6), 4.0f);
                    z5 = false;
                    x340Var.r(false);
                }
                qim0Var3 = qim0VarE2;
            } else {
                z5 = false;
                x340Var.i0(-2028177190);
                x340Var.r(false);
                qim0Var3 = qim0VarK;
            }
            if (z4) {
                qim0VarK = d9y0.k(qim0VarK, 0.5f);
            }
            z6 = z5;
            j2iVarR = apo.r(158894522, new rb9(qim0Var3, qim0VarK, str, str2, j), x340Var);
            if (m1aVar3 != null) {
                x340Var.i0(1551496060);
                m1aVar2 = m1aVar3;
                kno1.e(m1aVar3.b, apo.r(1205804610, new pb9(m1aVar3, z6 ? (byte) 1 : (byte) 0), x340Var), anm1.N("carousel-item-avatar-test-tag", qim0Var2), apo.r(-868216192, new pu2(j2iVarR, (byte) 8), x340Var), x340Var, 25008, 0);
                x340Var.r(z6);
            } else {
                m1aVar2 = m1aVar3;
                x340Var.i0(1551991533);
                qim0 qim0VarN2 = anm1.N("carousel-item-avatar-test-tag", u291.d(qim0Var2, 1.0f));
                gfh0VarC = t1c.c(een.h, z6);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarN2);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                k4s0.i(6, j2iVarR, x340Var, true, z6);
            }
        } else {
            x340Var.b0();
            m1aVar2 = m1aVar3;
            z4 = z2;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qb9(str, str2, i, qim0Var2, j, z4, m1aVar2, i2, i3);
        }
    }

    public static final void b(String str, hdn0 hdn0Var, long j, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        lee1 lee1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1943797107);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(hdn0Var) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                b0kVar3.i0(321760855);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(b0kVar3).g;
            } else {
                b0kVar3.i0(321761942);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(b0kVar3).j;
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.e(str, null, lee1Var, j, null, null, 2, false, new cjc0(5 - ((err0) hdn0Var).s()), 0, null, b0kVar2, (i2 & 14) | ((i2 << 3) & 7168), 0, 1714);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mx9(str, hdn0Var, j, z, i);
        }
    }

    public static final void c(pd71 pd71Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-441354935);
        int i2 = i | 6 | (x340Var.g(pd71Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(1185942752);
            if (rwq.h(pd71Var.a, x340Var, 0).getValue() != null) {
                bhn0.d();
                return;
            } else {
                x340Var.i0(19684678);
                x340Var.r(false);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u841(pd71Var, i, (byte) 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v33 */
    public static final void d(Bitmap bitmap, Function0 function0, Function0 function1, Function0 function2, boolean z, qim0 qim0Var, i3 i3Var, b0k b0kVar, int i) {
        Object obj;
        int i2;
        Object obj2;
        Object obj3;
        qim0 qim0Var2;
        float f;
        ?? r0;
        drr0 drr0Var;
        drr0 drr0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-607493719);
        int i3 = i | (x340Var.i(bitmap) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536) | (x340Var.i(i3Var) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            int i4 = ((Configuration) x340Var.k(kivVar)).screenWidthDp;
            int i5 = ((Configuration) x340Var.k(kivVar)).screenHeightDp;
            boolean zG = x340Var.g(bitmap);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                obj = objT;
                Integer numValueOf = Integer.valueOf(bitmap.getWidth());
                x340Var.s0(numValueOf);
                obj = numValueOf;
            }
            int iIntValue = ((Number) obj).intValue();
            boolean zG2 = x340Var.g(bitmap);
            Object objT2 = x340Var.T();
            Object obj4 = objT2;
            if (zG2 || objT2 == m4cVar) {
                Integer numValueOf2 = Integer.valueOf(bitmap.getHeight());
                x340Var.s0(numValueOf2);
                obj4 = numValueOf2;
            }
            int iIntValue2 = ((Number) obj4).intValue();
            boolean zE = x340Var.e(i4) | x340Var.e(i5);
            Object objT3 = x340Var.T();
            Object objK = objT3;
            if (zE || objT3 == m4cVar) {
                objK = ktd.k(Math.min(i4, i5), x340Var);
            }
            float f2 = ((p3v) objK).a;
            boolean zD = x340Var.d(f2);
            Object objT4 = x340Var.T();
            Object obj5 = objT4;
            if (zD || objT4 == m4cVar) {
                Float fValueOf = Float.valueOf(watVar.X0(f2));
                x340Var.s0(fValueOf);
                obj5 = fValueOf;
            }
            float fFloatValue = ((Number) obj5).floatValue();
            boolean zD2 = x340Var.d(fFloatValue) | x340Var.e(iIntValue) | x340Var.e(iIntValue2);
            Object objT5 = x340Var.T();
            Object obj6 = objT5;
            if (zD2 || objT5 == m4cVar) {
                Float fValueOf2 = Float.valueOf(fFloatValue / Math.min(iIntValue, iIntValue2));
                x340Var.s0(fValueOf2);
                obj6 = fValueOf2;
            }
            float fFloatValue2 = ((Number) obj6).floatValue();
            boolean zG3 = x340Var.g(bitmap) | x340Var.d(fFloatValue2) | x340Var.e(iIntValue) | x340Var.e(iIntValue2);
            Object objT6 = x340Var.T();
            if (zG3 || objT6 == m4cVar) {
                objT6 = Bitmap.createScaledBitmap(bitmap, (int) (iIntValue * fFloatValue2), (int) (iIntValue2 * fFloatValue2), true);
                x340Var.s0(objT6);
            }
            objT6.getClass();
            Bitmap bitmap2 = (Bitmap) objT6;
            boolean zG4 = x340Var.g(bitmap2);
            Object objT7 = x340Var.T();
            Object obj7 = objT7;
            if (zG4 || objT7 == m4cVar) {
                Float fValueOf3 = Float.valueOf(bitmap2.getWidth());
                x340Var.s0(fValueOf3);
                obj7 = fValueOf3;
            }
            float fFloatValue3 = ((Number) obj7).floatValue();
            Object objT8 = x340Var.T();
            Object obj8 = objT8;
            if (objT8 == m4cVar) {
                Float fValueOf4 = Float.valueOf(bitmap2.getHeight());
                x340Var.s0(fValueOf4);
                obj8 = fValueOf4;
            }
            float fFloatValue4 = ((Number) obj8).floatValue();
            Object[] objArr = {Float.valueOf(fFloatValue), Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4)};
            Object objT9 = x340Var.T();
            Object obj9 = objT9;
            if (objT9 == m4cVar) {
                h050 h050Var = h050.a1;
                x340Var.s0(h050Var);
                obj9 = h050Var;
            }
            drr0 drr0Var3 = (drr0) k5p1.s(objArr, (Function0) obj9, x340Var, 48);
            Object[] objArr2 = {Float.valueOf(fFloatValue), Float.valueOf(fFloatValue3)};
            boolean zD3 = x340Var.d(fFloatValue) | x340Var.d(fFloatValue3);
            Object objT10 = x340Var.T();
            if (zD3 || objT10 == m4cVar) {
                i2 = 0;
                ks70 ks70Var = new ks70(fFloatValue, fFloatValue3, (byte) 0);
                x340Var.s0(ks70Var);
                obj2 = ks70Var;
            } else {
                i2 = 0;
                obj2 = objT10;
            }
            drr0 drr0Var4 = (drr0) k5p1.s(objArr2, (Function0) obj2, x340Var, i2);
            Object[] objArr3 = {Float.valueOf(fFloatValue), Float.valueOf(fFloatValue4)};
            boolean zD4 = x340Var.d(fFloatValue);
            Object objT11 = x340Var.T();
            if (zD4 || objT11 == m4cVar) {
                ks70 ks70Var2 = new ks70(fFloatValue, fFloatValue4, (byte) 1);
                x340Var.s0(ks70Var2);
                obj3 = ks70Var2;
            } else {
                obj3 = objT11;
            }
            drr0 drr0Var5 = (drr0) k5p1.s(objArr3, (Function0) obj3, x340Var, 0);
            qim0 qim0VarR = i1p1.r(u291.r(anm1.N("image_cropper", qim0Var), f2));
            boolean zG5 = ((i3 & 7168) == 2048) | x340Var.g(drr0Var3) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | x340Var.g(drr0Var4) | x340Var.g(drr0Var5) | x340Var.d(fFloatValue3) | x340Var.d(fFloatValue);
            Object objT12 = x340Var.T();
            if (zG5 || objT12 == m4cVar) {
                qim0Var2 = qim0VarR;
                f = fFloatValue;
                r0 = 0;
                drr0Var = drr0Var4;
                drr0Var2 = drr0Var3;
                is70 is70Var = new is70(function2, function1, function0, fFloatValue3, f, fFloatValue4, drr0Var2, drr0Var, drr0Var5);
                drr0Var5 = drr0Var5;
                x340Var.s0(is70Var);
                objT12 = is70Var;
            } else {
                qim0Var2 = qim0VarR;
                drr0Var = drr0Var4;
                f = fFloatValue;
                r0 = 0;
                drr0Var2 = drr0Var3;
            }
            qim0 qim0VarB = f8d1.b(qim0Var2, rih1.a, (PointerInputEventHandler) objT12);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            qim0 qim0VarR2 = i1p1.r(u291.d(nim0.a, 1.0f));
            ?? r7 = (((((((x340Var.g(drr0Var2) ? 1 : 0) | (x340Var.g(drr0Var) ? 1 : 0)) | (x340Var.g(drr0Var5) ? 1 : 0) ? 1 : 0) | (x340Var.i(bitmap2) ? 1 : 0)) | (x340Var.d(fFloatValue2) ? 1 : 0) ? 1 : 0) | (x340Var.d(f) ? 1 : 0)) | (x340Var.e(iIntValue) ? 1 : 0) ? 1 : 0) | (x340Var.e((int) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x033f: ARITH (r7v27 'r7' ?? I:??[int, boolean]) = (wrap int:0x0333: ARITH (wrap int:?: TERNARY null = ((wrap boolean:0x032e: ARITH (wrap boolean:0x0329: ARITH (wrap boolean:?: TERNARY null = ((wrap boolean:0x0324: ARITH (wrap boolean:0x031f: ARITH (wrap boolean:?: TERNARY null = ((wrap boolean:0x031a: ARITH (wrap boolean:0x0315: ARITH (wrap boolean:?: TERNARY null = ((wrap boolean:0x030d: INVOKE (r2v1 'x340Var' p.x340), (r14v12 'drr0Var2' p.drr0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:782)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x0311: INVOKE (r2v1 'x340Var' p.x340), (r15v32 'drr0Var' p.drr0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:786)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:790)) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x0316: INVOKE (r2v1 'x340Var' p.x340), (r9v17 'drr0Var5' p.drr0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:791)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:795)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x031b: INVOKE (r2v1 'x340Var' p.x340), (r4v14 'bitmap2' android.graphics.Bitmap) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:796)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:800)) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x0320: INVOKE (r2v1 'x340Var' p.x340), (r14v10 'fFloatValue2' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:801)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:805)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x0325: INVOKE (r2v1 'x340Var' p.x340), (r12v7 'f' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:806)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:810)) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x032a: INVOKE (r2v1 'x340Var' p.x340), (r12v5 'iIntValue' int) VIRTUAL call: p.x340.e(int):boolean A[WRAPPED] (LINE:811)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:815)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (wrap int:?: TERNARY null = ((wrap boolean:0x032f: INVOKE 
                  (r2v1 'x340Var' p.x340)
                  (wrap int:?: CAST (int) (r17v8 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                 VIRTUAL call: p.x340.e(int):boolean A[WRAPPED] (LINE:816)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[DONT_WRAP, WRAPPED] (LINE:820)) | (wrap ??:?: TERNARY null = ((wrap int:0x0336: ARITH (r3v10 'i3' int) & (3670016 int) A[WRAPPED] (LINE:823)) == (1048576 int)) ? (1 ??[boolean, int, float, short, byte, char]) : (r0v3 'r0' ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])) A[DECLARE_VAR] (LINE:832) in method: p.k1p1.d(android.graphics.Bitmap, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, p.qim0, p.i3, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v8 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 946
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.k1p1.d(android.graphics.Bitmap, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, p.qim0, p.i3, p.b0k, int):void");
        }

        public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1010502066);
            int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, null, yla.r(x340Var), null, false, null, null, apo.r(-1517051049, new k750((byte) 17, z), x340Var), x340Var, i2 & 896, 6, 984);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 16);
            }
        }

        public static final void f(String str, String str2, boolean z, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            qim0 qim0Var2;
            int i2;
            qim0 qim0VarN;
            String strK;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1811351927);
            int i3 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(gbxVar) ? 2048 : 1024) | 8192;
            if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
                b0kVar3.d0();
                if ((i & 1) == 0 || b0kVar3.E()) {
                    i2 = i3 & (-57345);
                    qim0VarN = anm1.N("referral-item", nim0.a);
                } else {
                    b0kVar3.b0();
                    i2 = i3 & (-57345);
                    qim0VarN = qim0Var;
                }
                b0kVar3.s();
                xu30 xu30VarR = null;
                if (z) {
                    strK = x0d.k(b0kVar3, -1247440125, 2131960985, b0kVar3, false);
                } else {
                    b0kVar3.i0(-15876396);
                    b0kVar3.r(false);
                    strK = null;
                }
                if (str2 == null) {
                    b0kVar3.i0(-15664945);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(-15664944);
                    xu30VarR = apo.r(-412359463, new iww0(str2, (byte) 3), b0kVar3);
                    b0kVar3.r(false);
                }
                b0kVar2 = b0kVar3;
                jto1.b(u291.f(anm1.N("row-test-tag", qim0VarN), 1.0f), null, null, false, null, null, gbxVar, null, null, null, null, xu30VarR, null, null, null, apo.r(296600005, new xo6(str, strK, (byte) 12), b0kVar3), b0kVar2, (i2 << 9) & 3670016, 196608, 30654);
                qim0Var2 = qim0VarN;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new oa9(str, str2, z, gbxVar, qim0Var2, i, (byte) 2);
            }
        }

        public static final void g(long j, String str, String str2, hdn0 hdn0Var, boolean z, b0k b0kVar, int i) {
            lee1 lee1Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-853920752);
            int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(hdn0Var) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                if (str != null && str.length() != 0 && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var.i0(-61507772);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = ktd.o(56.0f, x340Var);
                    }
                    ven0 ven0Var2 = (ven0) objT2;
                    qim0 qim0VarH = u291.h(u291.v(nim0.a, 184.0f), ((p3v) ven0Var2.getValue()).a);
                    Uri uri = Uri.parse(str);
                    fwx fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
                    fwx fwxVarG2 = hso1.G(cox.c, 0L, 0L, x340Var, cox.d, 30);
                    boolean zI = x340Var.i(ven0Var2);
                    Object objT3 = x340Var.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new i2g1(ven0Var2, (byte) 6);
                        x340Var.s0(objT3);
                    }
                    iu30 iu30Var = (iu30) objT3;
                    boolean zI2 = x340Var.i(ven0Var);
                    Object objT4 = x340Var.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new i2g1(ven0Var, (byte) 7);
                        x340Var.s0(objT4);
                    }
                    eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG2, false, false, (j6m) null, iu30Var, (iu30) objT4, (iu30) null, 0L, x340Var, 2359296, 0, 118686), !ihc1.y0(str2) ? new jsl(str2) : isl.a, qim0VarH, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, een.g, (ColorFilter) null, x340Var, 221184, 264);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (str2.length() > 0) {
                    x340Var.i0(-60311358);
                    if (z) {
                        x340Var.i0(-279037766);
                        uwr uwrVar = cbx.a;
                        lee1Var = cbx.d(x340Var).c;
                    } else {
                        x340Var.i0(-279036677);
                        uwr uwrVar2 = cbx.a;
                        lee1Var = cbx.d(x340Var).d;
                    }
                    x340Var.r(false);
                    lee1 lee1Var2 = lee1Var;
                    cjc0 cjc0Var = new cjc0(3);
                    boolean zI3 = x340Var.i(hdn0Var);
                    Object objT5 = x340Var.T();
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new qsc1(hdn0Var, (byte) 5);
                        x340Var.s0(objT5);
                    }
                    uwo1.e(str2, null, lee1Var2, j, null, (iu30) objT5, 2, false, cjc0Var, 0, null, x340Var, ((i2 >> 6) & 14) | ((i2 << 9) & 7168), 0, 1682);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-59953742);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mvf(j, str, str2, hdn0Var, z, i, (byte) 4);
            }
        }

        public static final void h(Function0 function0, o6j1 o6j1Var, Function0 function1, Function0 function2, j2i j2iVar, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-317702326);
            int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(o6j1Var) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.h(z) ? 131072 : 65536) | (x340Var.h(z2) ? 1048576 : 524288) | 12582912;
            if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
                j2i j2iVarR = apo.r(1450870914, new xpg1(function2, function1, o6j1Var, upo1.A(x340Var), z, z2, function0, j2iVar), x340Var);
                qim0 qim0Var3 = nim0.a;
                upo1.j(0.0f, 390, 2, j2iVarR, x340Var, qim0Var3);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m8m(function0, o6j1Var, function1, function2, j2iVar, z, z2, qim0Var2, i);
            }
        }

        public static final x3s0 i(x3s0 x3s0Var, long j) {
            if (x3s0Var instanceof u3s0) {
                return new u3s0(j, ((u3s0) x3s0Var).b);
            }
            if (x3s0Var instanceof t3s0) {
                return new t3s0(j, ((t3s0) x3s0Var).b);
            }
            if (x3s0Var instanceof v3s0) {
                v3s0 v3s0Var = (v3s0) x3s0Var;
                return new v3s0(v3s0Var.a, (j - v3s0Var.c) + v3s0Var.b, j, v3s0Var.d);
            }
            if (!(x3s0Var instanceof w3s0)) {
                eg.o();
                return null;
            }
            w3s0 w3s0Var = (w3s0) x3s0Var;
            return new w3s0((j - w3s0Var.c) + w3s0Var.b, j, w3s0Var.d, w3s0Var.a);
        }

        public static h72 j(y4t0 y4t0Var, ivj ivjVar, a5t0 a5t0Var, q7r0 q7r0Var, rih1 rih1Var) {
            y4t0Var.getClass();
            ivjVar.getClass();
            rih1Var.getClass();
            return new h72(y4t0Var, ivjVar, a5t0Var, q7r0Var);
        }

        public static final boolean k(int i) {
            return i == 0;
        }

        public static final boolean l(int i, int i2) {
            return i == i2;
        }

        public static final mmr0 m(k6j1 k6j1Var) {
            long j;
            long j2;
            String str = k6j1Var.a;
            String str2 = k6j1Var.b;
            if ((str == null || ihc1.y0(str)) && (str2 == null || ihc1.y0(str2))) {
                int i = u7h.l;
                long j3 = u7h.j;
                return new mmr0(new u7h(j3), new u7h(j3));
            }
            String str3 = k6j1Var.a;
            u7h u7hVar = str3 != null ? new u7h(z4p1.e(Color.parseColor(str3))) : null;
            u7h u7hVar2 = str2 != null ? new u7h(z4p1.e(Color.parseColor(str2))) : null;
            if (u7hVar != null) {
                j = u7hVar.a;
            } else if (u7hVar2 != null) {
                j = u7hVar2.a;
            } else {
                int i2 = u7h.l;
                j = u7h.j;
            }
            u7h u7hVar3 = new u7h(j);
            if (u7hVar2 != null) {
                j2 = u7hVar2.a;
            } else if (u7hVar != null) {
                j2 = u7hVar.a;
            } else {
                int i3 = u7h.l;
                j2 = u7h.j;
            }
            return new mmr0(u7hVar3, new u7h(j2));
        }

        public static int n(int i) {
            return Integer.hashCode(i);
        }

        public static final go80 o(klm klmVar, xbp0 xbp0Var, xbp0 xbp0Var2, xbp0 xbp0Var3, rbp0 rbp0Var, xbp0 xbp0Var4, xbp0 xbp0Var5) {
            return klmVar.a("OfflineStateSaverDaemon", new dy7(xbp0Var, xbp0Var2, xbp0Var3, rbp0Var, xbp0Var4, xbp0Var5, (byte) 24));
        }

        public static boolean p(Activity activity) {
            return activity.isInMultiWindowMode();
        }

        public static final ven0 q(int i, int i2, int i3, String str, b0k b0kVar, dlv dlvVar, boolean z, boolean z2) {
            pxg1 pxg1Var = new pxg1(i2, i, dlvVar);
            int i4 = i3 >> 9;
            return zod.S(new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), pxg1Var, rno1.a), z, z2, (Function0) null, b0kVar, (i4 & 112) | 8 | (i4 & 896), 8);
        }

        public static final long r(String str) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                return date.getTime();
            }
            eg.m("Unable to parse message timestamp");
            return 0L;
        }

        public static String s(int i) {
            if (i == 0) {
                return "None";
            }
            if (i == 1) {
                return "Low";
            }
            if (i == 2) {
                return "Medium";
            }
            return i == 3 ? "High" : "Unknown";
        }
    }
