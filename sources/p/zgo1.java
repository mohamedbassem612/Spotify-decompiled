package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.widget.FrameLayout;
import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.casita.v1.resolved.EmbeddedAdTrackingUrls;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zgo1 {
    public static final long[] a = new long[0];
    public static b180 b;

    public static int A(byte[] bArr, int i, ebo1 ebo1Var, qhn1 qhn1Var) {
        mao1 mao1Var = (mao1) ebo1Var;
        int iC = C(bArr, i, qhn1Var);
        int i2 = qhn1Var.a + iC;
        while (iC < i2) {
            iC = C(bArr, iC, qhn1Var);
            mao1Var.b(qhn1Var.a);
        }
        if (iC == i2) {
            return iC;
        }
        x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, cjo1 cjo1Var, qhn1 qhn1Var) {
        if ((i >>> 3) == 0) {
            x4n1.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iF = F(bArr, i2, qhn1Var);
            cjo1Var.c(i, Long.valueOf(qhn1Var.b));
            return iF;
        }
        if (i4 == 1) {
            cjo1Var.c(i, Long.valueOf(I(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iC = C(bArr, i2, qhn1Var);
            int i5 = qhn1Var.a;
            if (i5 < 0) {
                x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iC) {
                x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                cjo1Var.c(i, n5o1.b);
            } else {
                cjo1Var.c(i, n5o1.m(iC, bArr, i5));
            }
            return iC + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                cjo1Var.c(i, Integer.valueOf(y(bArr, i2)));
                return i2 + 4;
            }
            x4n1.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        cjo1 cjo1VarB = cjo1.b();
        int i7 = qhn1Var.d + 1;
        qhn1Var.d = i7;
        if (i7 >= 100) {
            x4n1.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iC2 = C(bArr, i2, qhn1Var);
            int i9 = qhn1Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iC2;
                break;
            }
            i2 = B(i9, bArr, iC2, i3, cjo1VarB, qhn1Var);
            i8 = i9;
        }
        qhn1Var.d--;
        if (i2 > i3 || i8 != i6) {
            x4n1.i("Failed to parse the message.");
            return 0;
        }
        cjo1Var.c(i, cjo1VarB);
        return i2;
    }

    public static int C(byte[] bArr, int i, qhn1 qhn1Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return D(b2, i2, qhn1Var, bArr);
        }
        qhn1Var.a = b2;
        return i2;
    }

    public static int D(int i, int i2, qhn1 qhn1Var, byte[] bArr) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            qhn1Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            qhn1Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            qhn1Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            qhn1Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                qhn1Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int E(int i, byte[] bArr, int i2, int i3, ebo1 ebo1Var, qhn1 qhn1Var) {
        mao1 mao1Var = (mao1) ebo1Var;
        int iC = C(bArr, i2, qhn1Var);
        mao1Var.b(qhn1Var.a);
        while (iC < i3) {
            int iC2 = C(bArr, iC, qhn1Var);
            if (i != qhn1Var.a) {
                break;
            }
            iC = C(bArr, iC2, qhn1Var);
            mao1Var.b(qhn1Var.a);
        }
        return iC;
    }

    public static int F(byte[] bArr, int i, qhn1 qhn1Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            qhn1Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        qhn1Var.b = j2;
        return i3;
    }

    public static int G(Object obj, sgo1 sgo1Var, byte[] bArr, int i, int i2, int i3, qhn1 qhn1Var) {
        ufo1 ufo1Var = (ufo1) sgo1Var;
        int i4 = qhn1Var.d + 1;
        qhn1Var.d = i4;
        if (i4 >= 100) {
            x4n1.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iO = ufo1Var.o(obj, bArr, i, i2, i3, qhn1Var);
        qhn1Var.d--;
        qhn1Var.c = obj;
        return iO;
    }

    public static int H(Object obj, sgo1 sgo1Var, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        int iD = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iD = D(i3, iD, qhn1Var, bArr);
            i3 = qhn1Var.a;
        }
        int i4 = iD;
        if (i3 < 0 || i3 > i2 - i4) {
            x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = qhn1Var.d + 1;
        qhn1Var.d = i5;
        if (i5 >= 100) {
            x4n1.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        sgo1Var.e(obj, bArr, i4, i6, qhn1Var);
        qhn1Var.d--;
        qhn1Var.c = obj;
        return i6;
    }

    public static long I(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static final void a(float f, float f2, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        Float fValueOf = Float.valueOf(1.0f);
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1417232637);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f3 = f * 0.32667664f;
            float f4 = 0.08383234f * f;
            float f5 = f - f3;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ag6.b;
                x340Var.s0(objT);
            }
            bb80 bb80VarY = irn1.Y(irn1.e0((iu30) objT), 0, -1000L, 2);
            tzg1 tzg1Var = rno1.a;
            int i3 = ((i2 >> 3) & 112) | 8;
            ven0 ven0VarR = zod.R(new hsi1("artistCardsPackHighlightPosition", fValueOf, fValueOf, bb80VarY, tzg1Var), z, (Function0) null, x340Var, i3, 4);
            ilv.a.getClass();
            ven0 ven0VarR2 = zod.R(new hsi1("artistCardsPackHighlightAlpha", Float.valueOf(0.0f), fValueOf, new pxg1(1000, 1000, flv.e), tzg1Var), z, (Function0) null, x340Var, i3, 4);
            float f6 = (0.04632427f * f2) - (f4 / 2.0f);
            qim0 qim0VarH = u291.h(u291.v(qim0Var, f3), f4);
            boolean zG = x340Var.g(ven0VarR) | x340Var.d(f5) | x340Var.d(f6) | x340Var.g(ven0VarR2);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new yf6(ven0VarR, f5, f6, ven0VarR2, (byte) 0);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarH, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            g(f, i2 & 14, x340Var);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zf6(f, f2, z, qim0Var, i);
        }
    }

    public static final void b(rb81 rb81Var, u961 u961Var, s24 s24Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        fe60 ge60Var;
        h290 h290Var = rb81Var.d;
        String str = rb81Var.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-145487987);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rb81Var) : x340Var.i(rb81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(u961Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(s24Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2;
        boolean z = true;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            bb81 bb81Var = rb81Var.g;
            if (bb81Var == null) {
                x340Var.i0(-610337416);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    ThreadLocal threadLocal = szq.a;
                    objT = cgj1.H((wu70) szq.b((d0r) u961Var.d, new qv61(u961Var, (byte) 27)), (qim0) null, (FrameLayout.LayoutParams) null, 7);
                    x340Var.s0(objT);
                }
                tyq tyqVar = (tyq) objT;
                if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !x340Var.g(rb81Var))) {
                    z = false;
                }
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new hv70(str, wgo1.G(rb81Var), h290Var, false, (n1x) null, 112);
                    x340Var.s0(objT2);
                }
                otw.c(tyqVar, (hv70) objT2, qim0Var, (ipb1) null, x340Var, 64 | ((i3 >> 3) & 896), 8);
                x340Var.r(false);
            } else {
                x340Var.i0(-610080271);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    ThreadLocal threadLocal2 = szq.a;
                    objT3 = (af60) szq.b((d0r) s24Var.e, new hb81(s24Var, (byte) 1));
                    x340Var.s0(objT3);
                }
                af60 af60Var = (af60) objT3;
                if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !x340Var.g(rb81Var))) {
                    z = false;
                }
                Object objT4 = x340Var.T();
                if (z || objT4 == m4cVar) {
                    hvl1 hvl1VarG = wgo1.G(rb81Var);
                    c380 c380VarA = mqo1.A(h290Var);
                    if (bb81Var.equals(ab81.a)) {
                        ge60Var = fe60.a;
                    } else if (bb81Var.equals(cb81.a)) {
                        ge60Var = he60.a;
                    } else if (bb81Var instanceof bb81) {
                        ge60Var = new ge60(bb81Var.a);
                    } else {
                        if (!bb81Var.equals(za81.a)) {
                            eg.o();
                            return;
                        }
                        ge60Var = ee60.a;
                    }
                    objT4 = new ue60(str, hvl1VarG, c380VarA, ge60Var);
                    x340Var.s0(objT4);
                }
                otw.c(af60Var, (ue60) objT4, qim0Var, (ipb1) null, x340Var, af60.X | 64 | ((i3 >> 3) & 896), 8);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, rb81Var, u961Var, s24Var, qim0Var, (byte) 14);
        }
    }

    public static final void c(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        h311 h311VarV;
        gy0 gy0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1476951816);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(48.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (ihc1.y0(str)) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    gy0Var = new gy0(str, qim0Var, i, (byte) 12);
                }
            } else {
                gw70 gw70Var = (gw70) x340Var.k(oi7.a);
                int iI0 = ((wat) x340Var.k(t4k.h)).i0(48.0f);
                boolean zG = x340Var.g(gw70Var) | ((i2 & 14) == 4) | x340Var.e(iI0);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    ixg ixgVarB = gw70Var.b(Uri.parse(str));
                    ixgVarB.p(iI0, iI0, 1);
                    mmr0 mmr0Var = new mmr0(ixgVarB.a(), ixgVarB.a);
                    x340Var.s0(mmr0Var);
                    objT = mmr0Var;
                }
                mmr0 mmr0Var2 = (mmr0) objT;
                dm5.d((zy70) mmr0Var2.a, (String) null, (rf01) mmr0Var2.b, i1p1.q(u291.r(qim0Var, 48.0f), er31.b(4.0f)), mif1.P0, x340Var, 48, 0, 3952);
            }
            h311VarV.d = gy0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            gy0Var = new gy0(str, qim0Var, i, (byte) 13);
            h311VarV.d = gy0Var;
        }
    }

    public static final void d(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(406892944);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131959149);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 12.0f, 12.0f, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            gra graVar = een.e;
            h2c h2cVar = h2c.a;
            c((i3 & 14) | 48, str, x340Var, h2cVar.a(qim0Var3, graVar));
            qim0 qim0VarN = anm1.N("not-interested-followup-undo-button", h2cVar.a(qim0Var3, een.f));
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, null, gdxVarS, null, null, null, null, null, apo.r(-1912679339, new tej0(strO0, (byte) 18), x340Var), x340Var, 0, 48, 2008);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var2, i, (byte) 9);
        }
    }

    public static final void e(String str, qim0 qim0Var, boolean z, float f, b0k b0kVar, int i) {
        b0k b0kVar2;
        float fE;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2099099235);
        int i2 = i | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(qim0Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.d(f) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                b0kVar3.i0(-1400257326);
                Object objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = ktd.o(0.0f, b0kVar3);
                }
                ven0 ven0Var = (ven0) objT;
                w2g0.c((qim0) null, (tl3) null, apo.r(-1531405060, new nf0(ven0Var, (byte) 1), b0kVar3), b0kVar3, 3072, 7);
                fE = ((p3v) ven0Var.getValue()).a;
                b0kVar3.r(false);
            } else {
                fE = z5c.e(b0kVar3, -1400256645, 2131165289, b0kVar3, false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float f2 = fE + 16.0f;
            b0kVar2 = b0kVar3;
            uwo1.e(str, anm1.N("subtitle_test_tag", uyn1.B(qim0Var, f2, 0.0f, f2 + f, 0.0f, 10).then(new tq60(een.P0))), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, ((i2 >> 3) & 14) | 1572864, 0, 1712);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new t260(str, qim0Var, z, f, i, (byte) 0);
        }
    }

    public static final void f(String str, qim0 qim0Var, boolean z, float f, b0k b0kVar, int i) {
        b0k b0kVar2;
        float fE;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1150796819);
        int i2 = i | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(qim0Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.d(f) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                b0kVar3.i0(-2109135268);
                Object objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = ktd.o(0.0f, b0kVar3);
                }
                ven0 ven0Var = (ven0) objT;
                w2g0.c((qim0) null, (tl3) null, apo.r(-1531405060, new nf0(ven0Var, (byte) 1), b0kVar3), b0kVar3, 3072, 7);
                fE = ((p3v) ven0Var.getValue()).a;
                b0kVar3.r(false);
            } else {
                fE = z5c.e(b0kVar3, -2109134587, 2131165289, b0kVar3, false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float f2 = fE + 16.0f;
            b0kVar2 = b0kVar3;
            uwo1.e(str, anm1.N("title_test_tag", uyn1.B(qim0Var, f2, 0.0f, f2 + f, 0.0f, 10).then(new tq60(een.P0))), cbx.d(b0kVar3).a, cbx.a(b0kVar3).b.a, null, null, 0, false, new cjc0(2), 0, new px8(cbx.d(b0kVar3).b.a.b, cbx.d(b0kVar3).a.a.b, fc11.G(10), (mx8) null, 8), b0kVar2, (i2 >> 3) & 14, 8, 752);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new t260(str, qim0Var, z, f, i, (byte) 1);
        }
    }

    public static final void g(float f, int i, b0k b0kVar) {
        int i2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-711919646);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float f2 = f / 334.0f;
            long j = u7h.j;
            mmr0 mmr0Var = new mmr0(fValueOf2, new u7h(j));
            Float fValueOf3 = Float.valueOf(0.15f);
            long j2 = u7h.f;
            mic0 mic0VarK = v9c.k(new mmr0[]{mmr0Var, new mmr0(fValueOf3, new u7h(u7h.b(j2, 0.35f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.4f), new u7h(u7h.b(j2, 0.75f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.5f), new u7h(j2)), new mmr0(Float.valueOf(0.6f), new u7h(u7h.b(j2, 0.75f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.85f), new u7h(u7h.b(j2, 0.35f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf, new u7h(j))}, 0.0f, 0.0f, 14);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 6.0f * f2);
            cr31 cr31Var = er31.a;
            op71.g(x340Var, dug.e(qim0VarH, mic0VarK, cr31Var, 0.0f, 4));
            qim0 qim0VarR = d7e.r(1.6f, u291.c(nim0Var, 0.8f), false);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ag6.c;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
            float f3 = 3.0f * f2;
            op71.g(x340Var, dug.e(fc11.n(qim0VarC, f3, f3, d4o1.a), v9c.p(new mmr0[]{new mmr0(fValueOf2, new u7h(j2)), new mmr0(Float.valueOf(0.35f), new u7h(u7h.b(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf, new u7h(j))}, 0L, 0.0f, 14), cr31Var, 0.0f, 4));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bg6(f, i);
        }
    }

    public static final void h(String str, String str2, int i, int i2, int i3, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i4) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(42574820);
        int i5 = i4 | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16) | (b0kVar2.e(i) ? 256 : 128) | (b0kVar2.e(i2) ? 2048 : 1024) | (b0kVar2.e(i3) ? 16384 : 8192) | (b0kVar2.i(function0) ? 131072 : 65536) | (b0kVar2.i(function1) ? 1048576 : 524288) | 12582912;
        if (b0kVar2.Y(i5 & 1, (4793491 & i5) != 4793490)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar2).a.a.a(), d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarN = anm1.N("not-interested-followup-content", too1.y(qim0VarF2, new bgc0(lhc.g(b0kVar2).g, 32)));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            d(((i5 >> 3) & 14) | ((i5 >> 15) & 112), str2, function1, b0kVar2, null);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(cwl1.o0(b0kVar2, i), uyn1.B(qim0VarF3, 16.0f, 0.0f, 16.0f, 16.0f, 2), cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            rqo1.g(0, 1, b0kVar2, null);
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            cvx cvxVar7 = cbx.b(b0kVar2).b;
            qim0 qim0VarA = uyn1.A(qim0VarF4, 16.0f, 16.0f, 16.0f, 12.0f);
            int i6 = i5 >> 9;
            uwo1.e(cwl1.o0(b0kVar2, i2), qim0VarA, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            tq60 tq60Var = new tq60(een.Q0);
            cvx cvxVar8 = cbx.b(b0kVar2).b;
            cvx cvxVar9 = cbx.b(b0kVar2).b;
            cvx cvxVar10 = cbx.b(b0kVar2).b;
            b0kVar2 = b0kVar2;
            k(i3, (i5 & 14) | (i6 & 112) | (i6 & 896), str, function0, b0kVar2, uyn1.B(tq60Var, 16.0f, 0.0f, 16.0f, 16.0f, 2));
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n3m(str, str2, i, i2, i3, function0, function1, qim0Var2, i4);
        }
    }

    public static final void i(String str, qim0 qim0Var, long j, long j2, izy0 izy0Var, String str2, dzy0 dzy0Var, fzy0 fzy0Var, jzy0 jzy0Var, b0k b0kVar, int i, int i2) {
        int i3;
        long j3;
        long j4;
        fzy0 fzy0Var2;
        jzy0 jzy0Var2;
        long j5;
        long j6;
        izy0 izy0Var2;
        dzy0 dzy0Var2;
        izy0 izy0Var3;
        dzy0 dzy0Var3;
        fzy0 fzy0Var3;
        int i4;
        jzy0 jzy0Var3;
        long j7;
        long j8;
        long j9;
        Object hzy0Var;
        jzy0 jzy0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-170994033);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                int i5 = x340Var.f(j3) ? 256 : 128;
                i3 |= i5;
            } else {
                j3 = j;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                int i6 = x340Var.f(j4) ? 2048 : 1024;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            i3 |= i6;
        } else {
            j4 = j2;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= x340Var.e(izy0Var == null ? -1 : izy0Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.g(str2) ? 131072 : 65536;
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= x340Var.e(dzy0Var == null ? -1 : dzy0Var.ordinal()) ? 1048576 : 524288;
        }
        int i9 = i3 | 113246208;
        if (x340Var.Y(i9 & 1, (38347923 & i9) != 38347922)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 4) != 0) {
                    uwr uwrVar = cbx.a;
                    j3 = ((vex) zex.a.b).a;
                    i9 &= -897;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar2 = cbx.a;
                    j4 = ((vex) zex.a.b).b;
                    i9 &= -7169;
                }
                izy0 izy0Var4 = i7 != 0 ? izy0.d : izy0Var;
                dzy0 dzy0Var4 = i8 != 0 ? dzy0.a : dzy0Var;
                jzy0 jzy0Var5 = jzy0.b;
                izy0Var3 = izy0Var4;
                dzy0Var3 = dzy0Var4;
                fzy0Var3 = fzy0.b;
                long j10 = j4;
                i4 = i9;
                jzy0Var3 = jzy0Var5;
                j7 = j3;
                j8 = j10;
            } else {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i9 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i9 &= -7169;
                }
                izy0Var3 = izy0Var;
                dzy0Var3 = dzy0Var;
                fzy0Var3 = fzy0Var;
                j7 = j3;
                j8 = j4;
                i4 = i9;
                jzy0Var3 = jzy0Var;
            }
            x340Var.s();
            long j11 = j8;
            int i10 = i4;
            Object[] objArr = {str, new u7h(j7), new u7h(j8), izy0Var3, dzy0Var3, fzy0Var3};
            boolean z = ((i10 & 14) == 4) | ((((i10 & 896) ^ 384) > 256 && x340Var.f(j7)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && x340Var.f(j11)) || (i10 & 3072) == 2048) | ((i10 & 57344) == 16384) | ((3670016 & i10) == 1048576) | ((29360128 & i10) == 8388608);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                j9 = j7;
                hzy0Var = new hzy0(str, j9, j11, izy0Var3, dzy0Var3, fzy0Var3, (lnm) null);
                j6 = j11;
                x340Var.s0(hzy0Var);
            } else {
                j9 = j7;
                hzy0Var = objT;
                j6 = j11;
            }
            ven0 ven0VarR = yto.r(null, objArr, (vu30) hzy0Var, x340Var);
            qim0 qim0VarF = dug.f(qim0Var, j6, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            Bitmap bitmap = (Bitmap) ven0VarR.getValue();
            if (bitmap == null) {
                x340Var.i0(594534555);
                x340Var.r(false);
                jzy0Var4 = jzy0Var3;
            } else {
                x340Var.i0(594534556);
                jzy0Var4 = jzy0Var3;
                j(bitmap, u291.d(nim0.a, 1.0f), j6, str2, jzy0Var4, x340Var, ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (57344 & (i10 >> 12)));
                x340Var.r(false);
            }
            x340Var.r(true);
            jzy0Var2 = jzy0Var4;
            j5 = j9;
            izy0Var2 = izy0Var3;
            dzy0Var2 = dzy0Var3;
            fzy0Var2 = fzy0Var3;
        } else {
            x340Var.b0();
            fzy0Var2 = fzy0Var;
            jzy0Var2 = jzy0Var;
            j5 = j3;
            j6 = j4;
            izy0Var2 = izy0Var;
            dzy0Var2 = dzy0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gzy0(str, qim0Var, j5, j6, izy0Var2, str2, dzy0Var2, fzy0Var2, jzy0Var2, i, i2);
        }
    }

    public static final void j(Bitmap bitmap, qim0 qim0Var, long j, String str, jzy0 jzy0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(528857573);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.e(jzy0Var == null ? -1 : jzy0Var.ordinal()) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            w2g0.c(dug.f(qim0Var, j, d4o1.a), een.h, apo.r(-888864197, new hho0(bitmap, str, jzy0Var, (byte) 11), x340Var), x340Var, 3072, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(bitmap, qim0Var, j, str, jzy0Var, i);
        }
    }

    public static final void k(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        String str2;
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(221632856);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (b0kVar3.g(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String strN0 = cwl1.n0(i, new Object[]{str2}, b0kVar3);
            qim0 qim0VarN = anm1.N("not-interested-followup-show-less-button", qim0Var);
            kdx kdxVar = kdx.c;
            gdx gdxVarR = yla.r(b0kVar3);
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strN0), function0), kdxVar, qim0VarN, null, gdxVarR, null, null, null, w3j.a, null, apo.r(-1518865833, new tej0(strN0, (byte) 19), b0kVar3), b0kVar2, 805306368, 48, 1496);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wx1(str2, i, function0, qim0Var, i2);
        }
    }

    public static final void l(boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1643685054);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            mta mtaVar = cbx.b(x340Var).d;
            long jA = cbx.a(x340Var).a.b.a();
            float f = ((p3v) x340Var.k(jw80.c)).a;
            boolean zD = x340Var.d(32.0f) | x340Var.f(jA);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new vfe1((byte) 7, jA);
                x340Var.s0(objT);
            }
            qim0Var2 = nim0.a;
            qim0 qim0VarQ = exd0.q(qim0Var2, (iu30) objT);
            jw31 jw31VarA = ew31.a(new d36(cbx.b(x340Var).b.a - (f - 16.0f), true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            m(qtx.c, z, function0, cwl1.o0(x340Var, 2131960617), cwl1.o0(x340Var, 2131960618), x340Var, qtx.d | ((i2 << 3) & 112) | (i2 & 896));
            m(vrx.c, z2, function1, cwl1.o0(x340Var, 2131960614), cwl1.o0(x340Var, 2131960615), x340Var, vrx.d | (i2 & 112) | ((i2 >> 3) & 896));
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new knk0(z, z2, function0, function1, qim0Var2, i, (byte) 3);
        }
    }

    public static final void m(hux huxVar, boolean z, Function0 function0, String str, String str2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1620784778);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str2) ? 16384 : 8192;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            dxo1.f(new gbx(new y50(str), function0), null, z ? jax.a : new hax(str2), yla.s(x340Var), apo.r(-1841802632, new cp9(str, huxVar), x340Var), x340Var, 1572864, 38);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(huxVar, z, function0, str, str2, i, (byte) 13);
        }
    }

    public static jpr0 n() {
        return new jpr0((Set) null);
    }

    public static jpr0 o(Object[] objArr, Object obj) {
        return new jpr0(dm61.y0(Collections.singleton(obj), f46.S0(objArr)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final k2r p(cxc cxcVar, bpa bpaVar, yeg1 yeg1Var) {
        byte b2 = 0;
        Object[] objArr = 0;
        dzp0 dzp0Var = new dzp0(cxcVar, (byte) 0);
        dzp0Var.d = yeg1Var;
        if (bpaVar == null) {
            return dzp0Var;
        }
        bm00 bm00Var = new bm00(false);
        bm00Var.b = yeg1Var;
        wpc wpcVar = new wpc();
        wpcVar.a = bpaVar.a();
        wpcVar.e = dzp0Var;
        wpcVar.c = new jma(b2, (boolean) (objArr == true ? 1 : 0));
        wpcVar.b = bm00Var;
        if (bpaVar instanceof coa) {
            wpcVar.d = true;
        }
        return wpcVar;
    }

    public static final Bitmap q(ty9 ty9Var, Map map, float f, boolean z) {
        float f2;
        Rect rect;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (ty9Var.a * f), (int) (ty9Var.b * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        float f3 = 2.0f;
        float f4 = 1.0f;
        if (z) {
            canvas.scale(-1.0f, 1.0f, bitmapCreateBitmap.getWidth() / 2.0f, 0.0f);
        }
        for (pkb0 pkb0Var : ty9Var.c) {
            Bitmap bitmap = (Bitmap) map.get(pkb0Var.a);
            if (bitmap != null) {
                float f5 = pkb0Var.d * f;
                float f6 = pkb0Var.e * f;
                float f7 = pkb0Var.f;
                double radians = Math.toRadians(f7);
                float fAbs = (float) Math.abs(Math.cos(radians));
                float fAbs2 = (float) Math.abs(Math.sin(radians));
                canvas.save();
                canvas.translate((((f6 * fAbs2) + (f5 * fAbs)) / f3) + (pkb0Var.b * f), (((fAbs * f6) + (fAbs2 * f5)) / f3) + (pkb0Var.c * f));
                canvas.rotate(-f7);
                if (z && !pkb0Var.j) {
                    canvas.scale(-1.0f, f4);
                }
                if (pkb0Var.g) {
                    canvas.scale(f4, -1.0f);
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float f8 = f5 / f6;
                float f9 = width;
                float f10 = height;
                f2 = f3;
                if (f9 / f10 > f8) {
                    int i = (int) (f10 * f8);
                    int i2 = (width - i) / 2;
                    rect = new Rect(i2, 0, i + i2, height);
                } else {
                    int i3 = (int) (f9 / f8);
                    int i4 = (height - i3) / 2;
                    rect = new Rect(0, i4, width, i3 + i4);
                }
                RectF rectF = new RectF((-f5) / f2, (-f6) / f2, f5 / f2, f6 / f2);
                eza ezaVar = pkb0Var.h;
                Paint paint = new Paint(2);
                if (ezaVar instanceof dza) {
                    paint.setAlpha(60);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
                }
                canvas.drawBitmap(bitmap, rect, rectF, paint);
                canvas.restore();
            } else {
                f2 = f3;
            }
            f3 = f2;
            f4 = 1.0f;
        }
        return bitmapCreateBitmap;
    }

    public static final hp51 r(Object obj) {
        if (obj != lvx.a) {
            return (hp51) obj;
        }
        eg.m("Does not contain segment");
        return null;
    }

    public static final boolean s(Object obj) {
        return obj == lvx.a;
    }

    public static final boolean t(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final n1x u(EmbeddedAdMetadata embeddedAdMetadata) {
        String id = embeddedAdMetadata.getId();
        String strO = embeddedAdMetadata.o();
        String strR = embeddedAdMetadata.r();
        String strS = embeddedAdMetadata.s();
        String strQ = embeddedAdMetadata.q();
        String strT = embeddedAdMetadata.t();
        Map mapU = embeddedAdMetadata.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapU.size()));
        for (Map.Entry entry : mapU.entrySet()) {
            linkedHashMap.put(entry.getKey(), new g2x(((EmbeddedAdTrackingUrls) entry.getValue()).p()));
        }
        return new n1x(id, strO, strR, strS, strQ, strT, linkedHashMap);
    }

    public static final iai1 v(fhb fhbVar, boolean z) {
        return new iai1(new k560(fhbVar.a, fhbVar.c), new z9i1(fhbVar.d, fhbVar.e, fhbVar.g, fhbVar.h, fhbVar.j, z ? fhbVar.f : false, fhbVar.i));
    }

    public static final jai1 w(tul1 tul1Var, boolean z) {
        return new jai1(new l560(tul1Var.a), new z9i1(tul1Var.c, tul1Var.d, tul1Var.f, tul1Var.g, tul1Var.i, z ? tul1Var.e : false, tul1Var.h));
    }

    public static int x(byte[] bArr, int i, qhn1 qhn1Var) {
        int iC = C(bArr, i, qhn1Var);
        int i2 = qhn1Var.a;
        if (i2 < 0) {
            x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iC) {
            x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            qhn1Var.c = n5o1.b;
            return iC;
        }
        qhn1Var.c = n5o1.m(iC, bArr, i2);
        return iC + i2;
    }

    public static int y(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int z(sgo1 sgo1Var, int i, byte[] bArr, int i2, int i3, ebo1 ebo1Var, qhn1 qhn1Var) {
        iao1 iao1VarZze = sgo1Var.zze();
        sgo1 sgo1Var2 = sgo1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        qhn1 qhn1Var2 = qhn1Var;
        int iH = H(iao1VarZze, sgo1Var2, bArr2, i2, i4, qhn1Var2);
        sgo1Var2.zzf(iao1VarZze);
        qhn1Var2.c = iao1VarZze;
        ebo1Var.add(iao1VarZze);
        while (iH < i4) {
            qhn1 qhn1Var3 = qhn1Var2;
            int i5 = i4;
            int iC = C(bArr2, iH, qhn1Var3);
            if (i != qhn1Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            sgo1 sgo1Var3 = sgo1Var2;
            iao1 iao1VarZze2 = sgo1Var3.zze();
            iH = H(iao1VarZze2, sgo1Var3, bArr3, iC, i5, qhn1Var3);
            sgo1Var2 = sgo1Var3;
            bArr2 = bArr3;
            i4 = i5;
            qhn1Var2 = qhn1Var3;
            sgo1Var2.zzf(iao1VarZze2);
            qhn1Var2.c = iao1VarZze2;
            ebo1Var.add(iao1VarZze2);
        }
        return iH;
    }
}
