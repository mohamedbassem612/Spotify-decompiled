package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.icu.text.DateTimePatternGenerator;
import androidx.compose.ui.geometry.Offset;
import com.google.type.DateTime;
import defpackage.m;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class z4p1 {
    public static b180 a;
    public static b180 b;

    public static final long A(float f, long j, long j2) {
        xzp0 xzp0Var = kah.x;
        long jA = u7h.a(j, xzp0Var);
        long jA2 = u7h.a(j2, xzp0Var);
        float fC = u7h.c(jA);
        float fG = u7h.g(jA);
        float f2 = u7h.f(jA);
        float fD = u7h.d(jA);
        float fC2 = u7h.c(jA2);
        float fG2 = u7h.g(jA2);
        float f3 = u7h.f(jA2);
        float fD2 = u7h.d(jA2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return u7h.a(p(dm5.T(fG, fG2, f), dm5.T(f2, f3, f), dm5.T(fD, fD2, f), dm5.T(fC, fC2, f), xzp0Var), u7h.e(j2));
    }

    public static final float B(long j) {
        je31 je31VarE = u7h.e(j);
        if (!jch0.x(((hah) je31VarE).b, 12884901888L)) {
            pf80.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(jch0.g0(((hah) je31VarE).b)));
        }
        ge31 ge31Var = je31VarE.p;
        double dC = ge31Var.c(u7h.g(j));
        float fC = (float) ((ge31Var.c(u7h.d(j)) * 0.0722d) + (ge31Var.c(u7h.f(j)) * 0.7152d) + (dC * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            return 1.0f;
        }
        return fC;
    }

    public static ksk0 C() {
        return new ksk0((byte) 0);
    }

    public static void D(rtb0 rtb0Var, c380 c380Var, int i, cm0 cm0Var, int i2, ksk0 ksk0Var) {
        String str;
        if (c380Var.isEmpty()) {
            return;
        }
        if (i == 2131961062) {
            str = "top-10-countdowns";
        } else {
            if (i != 2131961059) {
                nkx0.e(i);
                return;
            }
            str = "countdowns-for-you";
        }
        String str2 = str;
        rtb0.c(rtb0Var, (Object) null, new j2i(191609122, new tj6((byte) 3, i, nim0.a, str2, new h3h1(new ju01(ksk0Var, str2, i2, (byte) 1)), c380Var, cm0Var), true), 3);
    }

    public static final qy71 E(u331 u331Var, iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        ven0 ven0VarS = v8r.s(iu30Var, x340Var);
        boolean zG = x340Var.g(cir0Var) | x340Var.g(u331Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new qy71(cir0Var.h(), cir0Var.g().d.c.getLifecycle(), u331Var, new ry71(ven0VarS, (byte) 0));
            x340Var.s0(objT);
        }
        return (qy71) objT;
    }

    public static final wt20 F(mr20 mr20Var, int i) {
        if (i > 0) {
            return new wt20(mr20Var, i);
        }
        hhg1.f(gvg.e(i, "Requested element count ", " should be positive"));
        return null;
    }

    public static final int G(long j) {
        float[] fArr = kah.a;
        return (int) (u7h.a(j, kah.e) >>> 32);
    }

    public static final LocalDateTime H(DateTime dateTime) {
        return LocalDateTime.of(dateTime.getYear(), dateTime.r(), dateTime.n(), dateTime.p(), dateTime.q(), dateTime.t(), dateTime.s());
    }

    public static final LocalDateTime I(h7r h7rVar) {
        Instant instant;
        try {
            try {
                instant = OffsetDateTime.parse(h7rVar.a, DateTimeFormatter.ISO_DATE_TIME).toInstant();
            } catch (Exception unused) {
                instant = LocalDateTime.parse(h7rVar.a, DateTimeFormatter.ISO_DATE_TIME).toInstant(ZoneOffset.UTC);
            }
            return instant.atOffset(ZoneOffset.ofTotalSeconds(h7rVar.b * 60)).toLocalDateTime();
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final m441 J(mr20 mr20Var, xu30 xu30Var) {
        return new m441(new lqv(mr20Var, xu30Var, (lnm) null, (byte) 12));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(d5p1 d5p1Var, iu30 iu30Var, em0 em0Var, hdh hdhVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-489769251);
        int i2 = i | (x340Var.g(d5p1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(em0Var) ? 256 : 128) | (x340Var.g(hdhVar) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new cr0(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                r8x r8xVar = new r8x(false, ((qq) ((mwo) em0Var.h).a.c).e());
                x340Var.s0(r8xVar);
                objT2 = r8xVar;
            }
            r8x r8xVar2 = (r8x) objT2;
            boolean z2 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new sm(iu30Var, (byte) 4);
                x340Var.s0(objT3);
            }
            vu30 vu30Var = (vu30) objT3;
            boolean z3 = i3 == 32;
            Object objT4 = x340Var.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new cr0(iu30Var, (byte) 4);
                x340Var.s0(objT4);
            }
            Function0 function1 = (Function0) objT4;
            if (d5p1Var instanceof ob1) {
                x340Var.i0(-711011183);
                otw.c(r8xVar2, new l8x(1, cwl1.o0(x340Var, 2131951883), cwl1.o0(x340Var, 2131951882)), (qim0) null, (ipb1) null, x340Var, 6, 12);
                x340Var.r(false);
            } else if (d5p1Var instanceof qb1) {
                x340Var.i0(1778192489);
                j((cx0) em0Var.t, x340Var, 0);
                x340Var.r(false);
            } else if (d5p1Var instanceof pb1) {
                x340Var.i0(1778195564);
                rrn1.l(function0, (nwo) em0Var.X, qim0Var, false, x340Var, (i2 >> 6) & 896, 8);
                x340Var = x340Var;
                x340Var.r(false);
            } else if (d5p1Var instanceof rb1) {
                x340Var.i0(1778201761);
                h4o1.g(((rb1) d5p1Var).c, r8xVar2, x340Var, 48);
                x340Var.r(false);
            } else {
                if (!(d5p1Var instanceof sb1)) {
                    throw p3d1.k(x340Var, 1778178644, false);
                }
                x340Var.i0(-710186707);
                sb1 sb1Var = (sb1) d5p1Var;
                p2o1.h(sb1Var.c, sb1Var.e, vu30Var, em0Var, u291.d(qim0Var, 1.0f), sb1Var.f, sb1Var.g, function1, sb1Var.h, hdhVar, sb1Var.i, x340Var, ((i2 << 18) & 1879048192) | ((i2 << 3) & 7168));
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m((Object) d5p1Var, (Object) iu30Var, (Object) em0Var, (Object) hdhVar, qim0Var, i, (byte) 3);
        }
    }

    public static final void b(bb1 bb1Var, iu30 iu30Var, em0 em0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-260818824);
        int i2 = i | (x340Var.i(bb1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(em0Var) ? 256 : 128) | 3072;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            az20 az20Var = (az20) x340Var.k(t4k.i);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                x340Var.s0(iu30Var);
                objT = iu30Var;
            }
            iu30 iu30Var2 = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                p251 p251Var = new p251(new qj(iu30Var2, (byte) 24), new d4((Object) iu30Var2, (Object) az20Var, (byte) 12), new cr0(iu30Var2, (byte) 6), false, ((qq) ((wwo) em0Var.g).a.c).e());
                x340Var.s0(p251Var);
                objT2 = p251Var;
            }
            p251 p251Var2 = (p251) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new fb1(p251Var2, null, (byte) 0);
                x340Var.s0(objT3);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT3);
            irn1.u(null, apo.r(-1953967573, new gb1(p251Var2, bb1Var, b2), x340Var), null, null, apo.r(131084017, new n891(bb1Var, iu30Var2, em0Var), x340Var), x340Var, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) bb1Var, (Object) iu30Var, (Object) em0Var, (Object) qim0Var2, (byte) 10);
        }
    }

    public static final void c(wwy wwyVar, g2z g2zVar, xwa xwaVar, xwa xwaVar2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        xwa xwaVar3;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-769230761);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wwyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(g2zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(xwaVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            xwaVar3 = xwaVar2;
            i2 |= x340Var.g(xwaVar3) ? 2048 : 1024;
        } else {
            xwaVar3 = xwaVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            jlw0 jlw0VarH = wwyVar.h();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = g2z.x(g2zVar, xwaVar, 3);
                x340Var.s0(objT);
            }
            ka71 ka71Var = (ka71) objT;
            llw0 llw0Var = wwyVar.f;
            int iC = l1d.C(wwyVar.b);
            if (iC == 0) {
                i3 = 2;
            } else if (iC == 1) {
                i3 = 1;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i3 = 3;
            }
            z971 z971Var = new z971(llw0Var, i3, jlw0VarH != null ? 1 : 2);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            otw.c(ka71Var, z971Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
            if (jlw0VarH == null) {
                x340Var.i0(1392762916);
                x340Var.r(false);
            } else {
                x340Var.i0(1392762917);
                und.a(xwaVar3, (qim0) null, 0.0f, apo.r(-1600814186, new kz9(jlw0VarH, (byte) 1), x340Var), x340Var, ((i2 >> 9) & 14) | 3072, 6);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 15, i, wwyVar, g2zVar, xwaVar, xwaVar2, qim0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0186  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    public static final long d(float f, float f2, float f3, float f4, hah hahVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (hahVar.c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i23 = u7h.l;
            return j;
        }
        int i24 = hahVar.c;
        if (i24 == -1) {
            pf80.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i25 = 0;
        float fB3 = hahVar.b(0);
        float fA3 = hahVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i26 = iFloatToRawIntBits3 >>> 31;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = iFloatToRawIntBits3 & 8388607;
        if (i27 == 255) {
            i2 = i28 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | (i26 << 15);
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fB = hahVar.b(1);
                    fA = hahVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fB2 = hahVar.b(2);
                                fA2 = hahVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i25 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i25 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i25 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i30 = u7h.l;
                                            return j2;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i25 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j3 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i31 = u7h.l;
                                return j3;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fB2 = hahVar.b(2);
                    fA2 = hahVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = u7h.l;
                                return j4;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j5 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i33 = u7h.l;
                    return j5;
                }
                if (i >= -10) {
                    int i34 = (i28 | 8388608) >> (1 - i);
                    if ((i34 & 4096) != 0) {
                        i34 += 8192;
                    }
                    i2 = i34 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i26 << 15) | (i << 10);
        short s8 = (short) i3;
        fB = hahVar.b(1);
        fA = hahVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fB2 = hahVar.b(2);
                    fA2 = hahVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j6 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i35 = u7h.l;
                                return j6;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j7 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i36 = u7h.l;
                    return j7;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fB2 = hahVar.b(2);
        fA2 = hahVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i25 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i25 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i25 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = u7h.l;
                    return j8;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i25 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j9 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i38 = u7h.l;
        return j9;
    }

    public static final long e(int i) {
        long j = ((long) i) << 32;
        int i2 = u7h.l;
        return j;
    }

    public static final long f(int i, int i2, int i3, int i4) {
        return e(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long g(long j) {
        long j2 = j << 32;
        int i = u7h.l;
        return j2;
    }

    public static long h(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return d(f, f2, f3, f4, kah.e);
    }

    public static final void j(cx0 cx0Var, b0k b0kVar, int i) {
        cx0 cx0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2043274494);
        int i2 = (x340Var.g(cx0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cx0Var2 = cx0Var;
            otw.c(cx0Var2, new fce0(), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
        } else {
            cx0Var2 = cx0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2c0(cx0Var2, i, (byte) 19);
        }
    }

    public static final void k(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(171031388);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, i), uyn1.x(qim0Var, 16.0f), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 27, i, i2, qim0Var);
        }
    }

    public static final void l(a8f1 a8f1Var, hce1 hce1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(488129559);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(a8f1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(hce1Var) : x340Var.i(hce1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(a8f1Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = yv91.a(new ow11(a8f1Var, (byte) 0));
                x340Var.s0(objT);
            }
            long j = u7h.j;
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(x340Var).b.a;
            long j3 = cbx.a(x340Var).b.a;
            ti5.b(apo.r(323035934, new lpk((tob1) objT, (byte) 7), x340Var), dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(((xex) ((gmt) zex.a.c).b).F), new u7h(cbx.a(x340Var).a.c)}), 0.0f, 0.0f, 14), null, 0.0f, 6), apo.r(1846798556, new ps11(hce1Var, (byte) 6), x340Var), apo.r(38769427, new lw11(hce1Var, (byte) 1), x340Var), 0.0f, 0.0f, (erl1) null, new x7f1(j, j, j2, j3, cbx.a(x340Var).b.a, j3), a8f1Var, x340Var, ((i2 << 24) & 234881024) | 3462);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(a8f1Var, hce1Var, qim0Var, i, (byte) 24);
        }
    }

    public static final void m(cm0 cm0Var, rwj rwjVar, c380 c380Var, c380 c380Var2, c380 c380Var3, hce1 hce1Var, ksk0 ksk0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        hce1 hce1Var2 = hce1Var;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-734699172);
        int i2 = i | (x340Var2.i(cm0Var) ? 4 : 2) | (x340Var2.i(rwjVar) ? 32 : 16) | (x340Var2.i(c380Var) ? 256 : 128) | (x340Var2.i(c380Var2) ? 2048 : 1024) | (x340Var2.g(c380Var3) ? 16384 : 8192) | (x340Var2.g(hce1Var2) ? 131072 : 65536) | (x340Var2.i(ksk0Var) ? 1048576 : 524288) | 12582912;
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            on00 on00VarN = kkn.n(ti5.g(x340Var2), x340Var2);
            boolean zG = x340Var2.g(on00VarN);
            Object objT = x340Var2.T();
            if (zG || objT == obj) {
                objT = yv91.a(new ow11(on00VarN, (byte) 1));
                x340Var2.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == obj) {
                objT2 = Boolean.valueOf(c380Var == null || c380Var.isEmpty());
                x340Var2.s0(objT2);
            }
            boolean zBooleanValue = ((Boolean) objT2).booleanValue();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.d(qim0Var3, 1.0f), (d6o0) tob1Var.getValue(), (g6o0) null);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarL);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            hce1Var2 = hce1Var;
            l(on00VarN, hce1Var2, anm1.N("page-toolbar", qim0Var3), x340Var2, (i2 >> 12) & 112);
            qim0 qim0VarD = u291.d(anm1.N("page-container", qim0Var3), 1.0f);
            boolean zI = ((i2 & 896) == 256 || x340Var2.i(c380Var)) | ((i2 & 14) == 4 || x340Var2.i(cm0Var)) | x340Var2.i(ksk0Var) | ((i2 & 7168) == 2048 || x340Var2.i(c380Var2)) | ((57344 & i2) == 16384) | ((i2 & 112) == 32 || x340Var2.i(rwjVar));
            Object objT3 = x340Var2.T();
            if (zI || objT3 == obj) {
                jqy jqyVar = new jqy((byte) 2, c380Var, c380Var2, c380Var3, cm0Var, ksk0Var, rwjVar, zBooleanValue);
                x340Var2.s0(jqyVar);
                objT3 = jqyVar;
            }
            ujo1.d(qim0VarD, xtb0VarA, null, false, null, null, null, false, null, (iu30) objT3, x340Var2, 0, 508);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(cm0Var, rwjVar, c380Var, c380Var2, c380Var3, hce1Var2, ksk0Var, qim0Var2, i, (byte) 26);
        }
    }

    public static final void n(hce1 hce1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-479013796);
        int i2 = (x340Var.g(hce1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131954307);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pw11(hce1Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, ldx.c, anm1.N("back-button", qim0Var3), null, null, null, false, null, null, apo.r(-1941282011, new p9y0(strO0, (byte) 14), x340Var), x340Var, 0, 6, 1016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw11(hce1Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void o(hce1 hce1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(326910942);
        int i2 = (x340Var.g(hce1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131962246);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pw11(hce1Var, (byte) 1);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, ldx.c, anm1.N("share-button", qim0Var3), null, null, null, false, null, null, apo.r(-2053730763, new p9y0(strO0, (byte) 15), x340Var), x340Var, 0, 6, 1016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw11(hce1Var, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long p(float f, float f2, float f3, float f4, hah hahVar) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (hahVar.c()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = u7h.l;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i24) + 1) | (i19 << 15);
                    } else {
                        i2 = i24;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
                                    int i25 = u7h.l;
                                    return jMax;
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
                                int i26 = u7h.l;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
                        int i27 = u7h.l;
                        return jMax3;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
                    int i28 = u7h.l;
                    return jMax4;
                }
                if (i >= -10) {
                    int i29 = (i21 | 8388608) >> (1 - i);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i2 = i29 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
                        int i210 = u7h.l;
                        return jMax5;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
                    int i211 = u7h.l;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
            int i212 = u7h.l;
            return jMax7;
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) hahVar.c) & 63);
        int i213 = u7h.l;
        return jMax8;
    }

    public static final void q(int i, int i2, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1964915147);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            foo1.c(new gbx(z50.c, function0), new idx(4), null, null, null, null, null, null, null, null, apo.r(884614580, new zxd1((byte) 3, i, false), x340Var), x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m3j1(i, i2, function0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void r(vr20 vr20Var, Object obj, Object obj2, onm onmVar) throws AbortFlowException {
        ut20 ut20Var;
        if (onmVar instanceof ut20) {
            ut20Var = (ut20) onmVar;
            int i = ut20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ut20Var.c = i - Integer.MIN_VALUE;
            } else {
                ut20Var = new ut20(onmVar);
            }
        } else {
            ut20Var = new ut20(onmVar);
        }
        Object obj3 = ut20Var.b;
        int i2 = ut20Var.c;
        if (i2 == 0) {
            hm5.M(obj3);
            ut20Var.a = obj2;
            ut20Var.c = 1;
            if (vr20Var.emit(obj, ut20Var) == d9n.a) {
                return;
            }
        } else if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = ut20Var.a;
            hm5.M(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    public static final long s(long j, n511 n511Var) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = n511Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = n511Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = n511Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = n511Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static final long t(long j, long j2) {
        float f;
        float f2;
        long jA = u7h.a(j, u7h.e(j2));
        float fC = u7h.c(j2);
        float fC2 = u7h.c(jA);
        float f3 = 1.0f - fC2;
        float f4 = (fC * f3) + fC2;
        float fG = u7h.g(jA);
        float fG2 = u7h.g(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fG2 * fC) * f3) + (fG * fC2)) / f4;
        }
        float f6 = u7h.f(jA);
        float f7 = u7h.f(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((f7 * fC) * f3) + (f6 * fC2)) / f4;
        }
        float fD = u7h.d(jA);
        float fD2 = u7h.d(j2);
        if (f4 != 0.0f) {
            f5 = (((fD2 * fC) * f3) + (fD * fC2)) / f4;
        }
        return p(f, f2, f5, f4, u7h.e(j2));
    }

    public static final LayerDrawable u(Context context, Drawable drawable) {
        Drawable drawable2 = context.getDrawable(2131232966);
        drawable2.getClass();
        drawable2.setTintList(x74.E(context, 2131101340));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        int intrinsicWidth = (drawable.getIntrinsicWidth() - drawable2.getIntrinsicWidth()) / 2;
        int iY = a8o.y(6.0f, context.getResources()) + drawable.getIntrinsicHeight();
        layerDrawable.setLayerGravity(0, 16);
        layerDrawable.setLayerInset(1, intrinsicWidth, iY, intrinsicWidth, 0);
        return layerDrawable;
    }

    public static final qt20 v(mr20 mr20Var, int i) {
        if (i >= 0) {
            return new qt20(mr20Var, i);
        }
        hhg1.f(f4i1.c(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final ht20 w(mr20 mr20Var, vu30 vu30Var) {
        return new ht20(mr20Var, vu30Var, (byte) 2);
    }

    public static final String x(LocalDateTime localDateTime, String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
        return localDateTime.format(DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance(localeForLanguageTag).getBestPattern(str), localeForLanguageTag));
    }

    public static final long y(aae1 aae1Var, long j) {
        Offset offset;
        elb0 elb0VarE = aae1Var.e();
        if (elb0VarE != null) {
            elb0 elb0VarB = aae1Var.b();
            if (elb0VarB != null) {
                offset = new Offset((elb0VarE.a() && elb0VarB.a()) ? elb0VarE.K(elb0VarB, j) : j);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.a;
            }
        }
        return j;
    }

    public static final boolean z(fhu0 fhu0Var) {
        o940 o940Var = fhu0Var.l;
        return o940Var != null && o940Var.a();
    }
}
