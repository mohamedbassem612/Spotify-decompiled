package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.wearable.zzdv;
import com.spotify.casita.v1.resolved.Heading;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xfo1 {
    public static b180 a;

    public static int A(r6o1 r6o1Var, byte[] bArr, int i, int i2, int i3, qhn1 qhn1Var) throws zzdv {
        vyn1 vyn1VarZza = r6o1Var.zza();
        int iC = C(vyn1VarZza, r6o1Var, bArr, i, i2, i3, qhn1Var);
        r6o1Var.b(vyn1VarZza);
        qhn1Var.c = vyn1VarZza;
        return iC;
    }

    public static int B(Object obj, r6o1 r6o1Var, byte[] bArr, int i, int i2, qhn1 qhn1Var) throws zzdv {
        int iV = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iV = v(i3, iV, qhn1Var, bArr);
            i3 = qhn1Var.a;
        }
        int i4 = iV;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = qhn1Var.d + 1;
        qhn1Var.d = i5;
        if (i5 >= 100) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        r6o1Var.f(obj, bArr, i4, i6, qhn1Var);
        qhn1Var.d--;
        qhn1Var.c = obj;
        return i6;
    }

    public static int C(Object obj, r6o1 r6o1Var, byte[] bArr, int i, int i2, int i3, qhn1 qhn1Var) throws zzdv {
        z4o1 z4o1Var = (z4o1) r6o1Var;
        int i4 = qhn1Var.d + 1;
        qhn1Var.d = i4;
        if (i4 >= 100) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iU = z4o1Var.u(obj, bArr, i, i2, i3, qhn1Var);
        qhn1Var.d--;
        qhn1Var.c = obj;
        return iU;
    }

    public static void D(byte[] bArr, int i, c0o1 c0o1Var, qhn1 qhn1Var) {
        if (c0o1Var != null) {
            throw new ClassCastException();
        }
        u(bArr, i, qhn1Var);
        throw null;
    }

    public static int E(byte[] bArr, int i, c0o1 c0o1Var, qhn1 qhn1Var) throws zzdv {
        if (c0o1Var != null) {
            bhn0.d();
            return 0;
        }
        int iU = u(bArr, i, qhn1Var);
        int i2 = qhn1Var.a + iU;
        if (iU < i2) {
            u(bArr, iU, qhn1Var);
            throw null;
        }
        if (iU == i2) {
            return iU;
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int F(r6o1 r6o1Var, int i, byte[] bArr, int i2, int i3, c0o1 c0o1Var, qhn1 qhn1Var) throws zzdv {
        vyn1 vyn1VarZza = r6o1Var.zza();
        r6o1 r6o1Var2 = r6o1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        qhn1 qhn1Var2 = qhn1Var;
        int iB = B(vyn1VarZza, r6o1Var2, bArr2, i2, i4, qhn1Var2);
        r6o1Var2.b(vyn1VarZza);
        qhn1Var2.c = vyn1VarZza;
        c0o1Var.add(vyn1VarZza);
        while (iB < i4) {
            qhn1 qhn1Var3 = qhn1Var2;
            int i5 = i4;
            int iU = u(bArr2, iB, qhn1Var3);
            if (i != qhn1Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            r6o1 r6o1Var3 = r6o1Var2;
            vyn1 vyn1VarZza2 = r6o1Var3.zza();
            iB = B(vyn1VarZza2, r6o1Var3, bArr3, iU, i5, qhn1Var3);
            r6o1Var2 = r6o1Var3;
            bArr2 = bArr3;
            i4 = i5;
            qhn1Var2 = qhn1Var3;
            r6o1Var2.b(vyn1VarZza2);
            qhn1Var2.c = vyn1VarZza2;
            c0o1Var.add(vyn1VarZza2);
        }
        return iB;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, n8o1 n8o1Var, qhn1 qhn1Var) throws zzdv {
        if ((i >>> 3) == 0) {
            throw new zzdv("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iW = w(bArr, i2, qhn1Var);
            n8o1Var.e(i, Long.valueOf(qhn1Var.b));
            return iW;
        }
        if (i4 == 1) {
            n8o1Var.e(i, Long.valueOf(y(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iU = u(bArr, i2, qhn1Var);
            int i5 = qhn1Var.a;
            if (i5 < 0) {
                throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iU) {
                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                n8o1Var.e(i, gun1.b);
            } else {
                n8o1Var.e(i, gun1.l(iU, bArr, i5));
            }
            return iU + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzdv("Protocol message contained an invalid tag (zero).");
            }
            n8o1Var.e(i, Integer.valueOf(x(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        n8o1 n8o1VarA = n8o1.a();
        int i7 = qhn1Var.d + 1;
        qhn1Var.d = i7;
        if (i7 >= 100) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iU2 = u(bArr, i2, qhn1Var);
            int i9 = qhn1Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iU2;
                break;
            }
            i2 = G(i9, bArr, iU2, i3, n8o1VarA, qhn1Var);
            i8 = i9;
        }
        qhn1Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw new zzdv("Failed to parse the message.");
        }
        n8o1Var.e(i, n8o1VarA);
        return i2;
    }

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1446000548);
        int i2 = i | 6 | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            f65 f65Var = (f65) x340Var.k(t4k.s);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = uyn1.A(u291.f(qim0Var3, 1.0f), 16.0f, 16.0f, 16.0f, 8.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(cwl1.o0(x340Var, 2131952447), null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            vzq0 zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
            cvx cvxVar6 = cbx.b(x340Var).b;
            ydx ydxVar = new ydx((30 & 1) != 0 ? 4.0f : 8.0f, (30 & 2) != 0 ? 12.0f : 0.0f, (30 & 4) != 0 ? 8.0f : 0.0f, (30 & 8) != 0 ? zzq0Var : null, (30 & 16) != 0 ? vdx.a : wdx.a);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ad5.h;
                x340Var.s0(objT);
            }
            byte b = 3;
            ioo1.c(null, new kgx(3, (vu30) objT, (vu30) null, (vu30) null, 12), ydxVar, null, null, null, null, null, null, null, null, null, apo.r(-7455385, new o3(z, iu30Var, f65Var, b), x340Var), null, null, null, apo.r(-953926685, new aw1(b, z), x340Var), x340Var, 512, 1573248, 61433);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc6(qim0Var2, z, iu30Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final void b(gzd gzdVar, xho xhoVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var;
        Function0 function1;
        ?? r2;
        vu30 vu30Var2;
        llj lljVar;
        ?? r1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1512124086);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(gzdVar) ? 4 : 2) | (x340Var.i(xhoVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = bin.x(dug.f(qim0VarF, jC, er31.b(16.0f)), false, gzdVar.b, null, null, function0, 13);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            String str = gzdVar.d;
            if (str == null) {
                x340Var.i0(-1104320190);
                x340Var.r(false);
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                function1 = function2;
                r2 = 0;
                r1 = 1;
            } else {
                x340Var.i0(-1104320189);
                Uri uri = Uri.parse(str);
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0 qim0VarQ = i1p1.q(nim0Var, er31.b(8.0f));
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX2 = uyn1.x(qim0VarQ, 8.0f);
                zov0 zov0Var = cbx.b(x340Var).g;
                vu30Var = vu30Var3;
                function1 = function2;
                r2 = 0;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                r1 = 1;
                eso1.e(uri, isl.a, u291.r(qim0VarX2, 88.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                x340Var.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, (boolean) r1);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(wnb0Var, 8.0f, 4.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, (boolean) r1, new um5((boolean) r2)), een.P0, x340Var, (int) r2);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, vu30Var);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            uwo1.e(gzdVar.b, null, cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1722);
            if (gzdVar.c.isEmpty()) {
                x340Var.i0(1400177382);
                x340Var.r((boolean) r2);
            } else {
                x340Var.i0(1399782411);
                uwo1.e(o7h.y0(gzdVar.c, cwl1.o0(x340Var, 2131961029), (String) null, (String) null, (iu30) null, 62), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0((int) r1), 0, null, x340Var, 0, 0, 1714);
                x340Var.r((boolean) r2);
            }
            x340Var.r((boolean) r1);
            cvx cvxVar5 = cbx.b(x340Var).b;
            otw.c(xhoVar, new uho(gzdVar.a, (String) null, qho.a, (nho) null, (String) null, (Function0) null, 250), uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), (ipb1) null, x340Var, (i2 >> 3) & 14, 8);
            x340Var.r((boolean) r1);
            qim0Var2 = nim0Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, gzdVar, xhoVar, function0, qim0Var2, (byte) 0);
        }
    }

    public static final void c(k0e k0eVar, umf0 umf0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        jwd jwdVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(240476550);
        int i2 = (x340Var.g(k0eVar) ? 4 : 2) | i | (x340Var.i(umf0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (k0eVar.b.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    jwdVar = new jwd(k0eVar, umf0Var, i, (byte) 0);
                }
            } else {
                nyx.a(2, (wux) null, apo.r(-364333805, new jwd(k0eVar, umf0Var), x340Var), x340Var, 3078, 6);
            }
            h311VarV.d = jwdVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            jwdVar = new jwd(k0eVar, umf0Var, i, (byte) 2);
            h311VarV.d = jwdVar;
        }
    }

    public static final void d(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1265889290);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarD, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131958051);
            lee1 lee1Var = cbx.d(x340Var).f;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.e;
            vex vexVar2 = (vex) zscVar.e;
            long j = vexVar.n;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            lee1 lee1Var2 = cbx.d(x340Var).g;
            long j2 = vexVar2.n;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var2, j2, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
            String strO1 = cwl1.o0(x340Var, 2131958052);
            lee1 lee1Var3 = cbx.d(x340Var).f;
            long j3 = vexVar2.n;
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.B(qim0VarF3, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var3, j3, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            lee1 lee1Var4 = new lee1(0L, fc11.G(14), FontWeight.t, FontFamily.d, fc11.G(0), 0L, 0, 0, fc11.G(20), (shc0) null, 0, 16645977);
            long j4 = cbx.a(x340Var).b.b;
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.B(qim0VarF4, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var4, j4, new a0e1(4), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2016);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1825949647);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131957166);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 4);
        }
    }

    public static final void f(o860 o860Var, tv80 tv80Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-811613933);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(o860Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tv80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(o860Var) | x340Var.i(tv80Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new vq80(o860Var, tv80Var, (byte) 11);
                x340Var.s0(objT);
            }
            int i3 = i2 & 14;
            qxd0.h(o860Var, tv80Var, (iu30) objT, x340Var);
            boolean zI2 = x340Var.i(o860Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new pdb0(o860Var, (byte) 2);
                x340Var.s0(objT2);
            }
            cso1.m(o860Var, null, (iu30) objT2, x340Var, i3);
            int i4 = i2 & 896;
            boolean zI3 = x340Var.i(o860Var) | (i4 == 256);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new keb0(o860Var, function0, (byte) 0);
                x340Var.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            String strO0 = cwl1.o0(x340Var, 2131957172);
            String strO1 = cwl1.o0(x340Var, 2131957171);
            String strO2 = cwl1.o0(x340Var, 2131957168);
            String strO3 = cwl1.o0(x340Var, 2131957168);
            boolean zI4 = x340Var.i(o860Var) | (i4 == 256);
            Object objT4 = x340Var.T();
            if (zI4 || objT4 == m4cVar) {
                objT4 = new keb0(o860Var, function0, (byte) 1);
                x340Var.s0(objT4);
            }
            Function0 function2 = (Function0) objT4;
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function1, null, null, strO0, strO1, new zgx(strO2, new gbx(new y50(strO3), function2)), null, x340Var, 262144, 70);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(o860Var, tv80Var, function0, i, (byte) 19);
        }
    }

    public static final void g(List list, String str, vu30 vu30Var, vu30 vu30Var2, b0k b0kVar, int i) throws Throwable {
        Throwable th;
        Object obj;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1776255329);
        int i2 = (i & 6) == 0 ? (x340Var.i(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Throwable th2 = null;
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            String string = y7e1VarD.d().d.toString();
            boolean zG = x340Var.g(list) | x340Var.g(string);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    Throwable th3 = th2;
                    eno0 eno0Var = (eno0) obj2;
                    if (ihc1.h0(eno0Var.b, string, true) || ihc1.h0(eno0Var.c, string, true) || ihc1.h0(eno0Var.a, string, true)) {
                        arrayList.add(obj2);
                    }
                    th2 = th3;
                }
                th = th2;
                x340Var.s0(arrayList);
                obj = arrayList;
            } else {
                th = null;
                obj = objT;
            }
            List list2 = (List) obj;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            qim0 qim0VarY = too1.y(qim0VarD, new bgc0(u85Var, 32));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarY, 16.0f, 16.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
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
            e(x340Var, 0);
            rwo1.a(y7e1VarD, eyx.e, u291.f(nim0Var, 1.0f), null, cwl1.o0(x340Var, 2131957169), wui.a, null, false, null, null, null, null, d6e1.b, null, null, null, null, null, 0.0f, false, x340Var, 196608, 0, 0, 2088904);
            x340Var = x340Var;
            if (list2.isEmpty()) {
                x340Var.i0(1659543768);
                uwo1.e(cwl1.o0(x340Var, 2131957167), null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(1659701527);
                z = true;
                ijo1.f(list2, str, vu30Var, vu30Var2, kx40.h(1.0f, u291.f(nim0Var, 1.0f), true), x340Var, i2 & 8176);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, list, str, vu30Var, vu30Var2, (byte) 4);
        }
    }

    public static final void h(eeb0 eeb0Var, leb0 leb0Var, tv80 tv80Var, o860 o860Var, vu30 vu30Var, iu30 iu30Var, b0k b0kVar, int i) throws Throwable {
        b0k b0kVar2;
        List list;
        boolean z;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1168455357);
        int i2 = i | (b0kVar3.g(eeb0Var) ? 4 : 2) | (b0kVar3.i(leb0Var) ? 32 : 16) | (b0kVar3.i(tv80Var) ? 256 : 128) | (b0kVar3.i(o860Var) ? 2048 : 1024) | (b0kVar3.i(vu30Var) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (i2 & 74899) != 74898)) {
            beb0 beb0Var = eeb0Var.a;
            adb0 adb0Var = eeb0Var.b;
            b0kVar3.i0(-1899119324);
            List list2 = beb0Var.a;
            String strA = adb0Var.a();
            boolean zI = b0kVar3.i(leb0Var);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                list = list2;
                z = false;
                c4z c4zVar = new c4z(2, leb0Var, leb0.class, "logLanguageRowImpression", "logLanguageRowImpression(Ljava/lang/String;I)V", 0, (byte) 16);
                b0kVar3.s0(c4zVar);
                objT = c4zVar;
            } else {
                list = list2;
                z = false;
            }
            vu30 vu30Var2 = (vu30) objT;
            int i3 = i2 >> 3;
            b0kVar2 = b0kVar3;
            g(list, strA, vu30Var2, vu30Var, b0kVar2, i3 & 7168);
            b0kVar2.r(z);
            if (adb0Var instanceof ycb0) {
                b0kVar2.i0(1257175763);
                boolean z2 = (i2 & 458752) != 131072 ? z : true;
                Object objT2 = b0kVar2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new sya0(iu30Var, (byte) 2);
                    b0kVar2.s0(objT2);
                }
                f(o860Var, tv80Var, (Function0) objT2, b0kVar2, ((i2 >> 9) & 14) | (i3 & 112));
                b0kVar2.r(z);
            } else {
                b0kVar2.i0(1257402559);
                b0kVar2.r(z);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy((Object) eeb0Var, (Object) leb0Var, (Object) tv80Var, (Object) o860Var, (Object) vu30Var, (Object) iu30Var, i, (byte) 12);
        }
    }

    public static final void i(xfx xfxVar, lbt0 lbt0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        lbt0 lbt0Var2;
        x340 x340Var;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int color;
        int i3;
        String str5;
        iu30 iu30Var2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        lbt0 lbt0Var3;
        String str12;
        iu30 iu30Var3 = iu30Var;
        m4c m4cVar = fkj0.X;
        Map map = lbt0Var.c;
        d7t0 d7t0Var = lbt0Var.a;
        String str13 = d7t0Var.a;
        String str14 = d7t0Var.d;
        nk nkVar = lbt0Var.b;
        im imVar = nkVar.h;
        String str15 = nkVar.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1361307972);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(lbt0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var3) ? 2048 : 1024;
        }
        int i4 = i2;
        if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            c10 c10Var = null;
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
            int i5 = nkVar.a;
            c10 c10Var2 = imVar.f ? (c10) map.get(t80.t) : null;
            if (imVar.c) {
                c10Var = (c10) map.get(t80.e);
            } else if (nkVar.d) {
                c10Var = (c10) map.get(t80.f);
            }
            c10 c10Var3 = c10Var;
            int iC = l1d.C(i5);
            nim0 nim0Var = nim0.a;
            String str16 = "";
            if (iC != 0) {
                if (iC == 1) {
                    x340Var2.i0(-641336695);
                    color = ihc1.y0(str14) ? -1 : Color.parseColor(str14);
                    String str17 = (c10Var3 == null || (str8 = c10Var3.b) == null) ? "" : str8;
                    int i6 = nkVar.i;
                    int iC2 = l1d.C(nkVar.j);
                    if (iC2 == 0) {
                        i3 = 1;
                    } else if (iC2 == 1) {
                        i3 = 2;
                    } else if (iC2 == 2) {
                        i3 = 3;
                    } else {
                        if (iC2 != 3) {
                            eg.o();
                            return;
                        }
                        i3 = 4;
                    }
                    long j = nkVar.e;
                    String str18 = (c10Var2 == null || (str7 = c10Var2.b) == null) ? "" : str7;
                    if (c10Var2 == null || (str5 = c10Var2.c) == null) {
                        str5 = "";
                    }
                    if (c10Var2 != null && (str6 = c10Var2.e) != null) {
                        str16 = str6;
                    }
                    x340Var = x340Var2;
                    lbt0Var2 = lbt0Var;
                    q191 q191Var = new q191(str13, color, i6, i3, j, str15, str17, str18, str5, str16);
                    qim0 qim0VarX = uyn1.x(nim0Var, 0.0f);
                    boolean zG = ((i4 & 7168) == 2048) | x340Var.g(c10Var3) | ((i4 & 112) == 32);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        iu30Var2 = iu30Var;
                        objT = new ymr0(iu30Var2, c10Var3, lbt0Var2, (byte) 2);
                        x340Var.s0(objT);
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    ago1.f(xfxVar, q191Var, qim0VarX, (iu30) objT, x340Var, i4 & 14);
                    x340Var.r(false);
                    iu30Var3 = iu30Var2;
                } else if (iC != 2) {
                    x340Var2.i0(-638162450);
                    x340Var2.r(false);
                    lbt0Var2 = lbt0Var;
                    x340Var = x340Var2;
                } else {
                    x340Var2.i0(-639490149);
                    color = ihc1.y0(str14) ? -1 : Color.parseColor(str14);
                    if (c10Var3 == null || (str9 = c10Var3.b) == null) {
                        str9 = "";
                    }
                    if (c10Var2 == null || (str10 = c10Var2.b) == null) {
                        str10 = "";
                    }
                    if (c10Var2 == null || (str11 = c10Var2.c) == null) {
                        str11 = "";
                    }
                    s191 s191Var = new s191(str13, str15, str9, str10, color, str11, (c10Var2 == null || (str12 = c10Var2.e) == null) ? "" : str12);
                    qim0 qim0VarX2 = uyn1.x(nim0Var, 0.0f);
                    boolean zG2 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | x340Var2.g(c10Var3);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        lbt0Var3 = lbt0Var;
                        objT2 = new ymr0(iu30Var3, c10Var3, lbt0Var3, (byte) 3);
                        x340Var2.s0(objT2);
                    } else {
                        lbt0Var3 = lbt0Var;
                    }
                    dgo1.e(xfxVar, s191Var, qim0VarX2, (iu30) objT2, x340Var2, i4 & 14);
                    x340Var2.r(false);
                    lbt0Var2 = lbt0Var3;
                    x340Var = x340Var2;
                }
                z = true;
            } else {
                x340Var = x340Var2;
                x340Var.i0(-642785356);
                int color2 = ihc1.y0(str14) ? -1 : Color.parseColor(str14);
                String str19 = (c10Var3 == null || (str4 = c10Var3.b) == null) ? "" : str4;
                long j2 = nkVar.e;
                String str20 = (c10Var2 == null || (str3 = c10Var2.b) == null) ? "" : str3;
                String str21 = (c10Var2 == null || (str2 = c10Var2.c) == null) ? "" : str2;
                String str22 = (c10Var2 == null || (str = c10Var2.e) == null) ? "" : str;
                lbt0Var2 = lbt0Var;
                u191 u191Var = new u191(str13, color2, j2, str15, str19, str20, str21, str22);
                qim0 qim0VarX3 = uyn1.x(nim0Var, 0.0f);
                boolean zG3 = x340Var.g(c10Var3) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
                Object objT3 = x340Var.T();
                if (zG3 || objT3 == m4cVar) {
                    iu30Var3 = iu30Var;
                    z = true;
                    objT3 = new ymr0(iu30Var3, c10Var3, lbt0Var2, (byte) 1);
                    x340Var.s0(objT3);
                } else {
                    iu30Var3 = iu30Var;
                    z = true;
                }
                ggo1.l(xfxVar, u191Var, qim0VarX3, (iu30) objT3, x340Var, i4 & 14);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            lbt0Var2 = lbt0Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(xfxVar, lbt0Var2, qim0Var, iu30Var3, i, (byte) 23);
        }
    }

    public static final void j(j2i j2iVar, iu30 iu30Var, i8h1 i8h1Var, l6h1 l6h1Var, gw70 gw70Var, op80 op80Var, b0k b0kVar, int i) {
        op80 op80Var2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1314115708);
        int i2 = i | (b0kVar3.i(i8h1Var) ? 256 : 128) | (b0kVar3.i(l6h1Var) ? 2048 : 1024) | (b0kVar3.i(gw70Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.g(op80Var) ? 131072 : 65536;
        }
        int i3 = i & 1572864;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= b0kVar3.g(nim0Var) ? 1048576 : 524288;
        }
        byte b = 1;
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            int i4 = i2 & 458752;
            boolean zI = (i4 == 131072) | b0kVar3.i(i8h1Var) | b0kVar3.i(l6h1Var) | b0kVar3.i(gw70Var);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                t3t0 t3t0Var = new t3t0(i8h1Var, l6h1Var, gw70Var, op80Var, j2iVar, iu30Var, (byte) 9);
                b0kVar3.s0(t3t0Var);
                objT = t3t0Var;
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean z = i4 == 131072;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new qpr(op80Var, b);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            dm5.a(iu30Var2, qim0VarF, (iu30) objT2, b0kVar2, 0, 0);
        } else {
            op80Var2 = op80Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ryb1(j2iVar, iu30Var, i8h1Var, l6h1Var, gw70Var, op80Var2, i);
        }
    }

    public static final String k(byte[] bArr) {
        return f46.r0(bArr, afm.c1, 30);
    }

    public static final String l(Context context, int i, long j, boolean z) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            arrayList.add(context.getResources().getQuantityString(2131820697, i, new DecimalFormat("#,###", new DecimalFormatSymbols(Locale.getDefault())).format(i)));
        }
        if (j > 0) {
            long j2 = j / 60;
            long j3 = j2 / 60;
            long j4 = j2 % 60;
            if (j3 > 0) {
                string = context.getResources().getString(2131956516, Long.valueOf(j3), Long.valueOf(j4));
                string.getClass();
            } else {
                string = context.getResources().getString(2131956517, Long.valueOf(j4));
                string.getClass();
            }
            arrayList.add(string);
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
    }

    public static final dtw m(wpw wpwVar, ConstraintLayout constraintLayout) {
        tka0 tka0Var = dtw.C;
        return mhc.b(constraintLayout.getContext(), constraintLayout, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public static final rdo0 n(Object[] objArr, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i, int i2) {
        String str = (i2 & 4) != 0 ? null : "page";
        x340 x340Var = (x340) b0kVar;
        xnn0 xnn0Var = (xnn0) x340Var.k(aon0.a);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        Object obj = objT;
        if (objT == m4cVar) {
            bf30 bf30Var = new bf30();
            bf30Var.a = xnn0Var;
            x340Var.s0(bf30Var);
            obj = bf30Var;
        }
        bf30 bf30Var2 = (bf30) obj;
        boolean zI = x340Var.i(bf30Var2) | x340Var.i(xnn0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new s2n0(bf30Var2, xnn0Var, (byte) 19);
            x340Var.s0(objT2);
        }
        qxd0.S((Function0) objT2, x340Var);
        boolean zG = x340Var.g(iu30Var) | x340Var.g(bf30Var2);
        Object objT3 = x340Var.T();
        if (zG || objT3 == m4cVar) {
            objT3 = (cf41) iu30Var.invoke(bf30Var2);
            x340Var.s0(objT3);
        }
        cf41 cf41Var = (cf41) objT3;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zG2 = x340Var.g(iu30Var2) | x340Var.i(bf30Var2);
        Object objT4 = x340Var.T();
        if (zG2 || objT4 == m4cVar) {
            objT4 = new s2n0(iu30Var2, bf30Var2, (byte) 20);
            x340Var.s0(objT4);
        }
        rdo0 rdo0Var = (rdo0) k5p1.t(objArrCopyOf, cf41Var, str, (Function0) objT4, x340Var, i & 896, 0);
        boolean zI2 = x340Var.i(rdo0Var);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            objT5 = new tdo0(rdo0Var, (byte) 1);
            x340Var.s0(objT5);
        }
        qxd0.i(rdo0Var, (iu30) objT5, x340Var);
        return rdo0Var;
    }

    public static TypedValue o(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean p(Context context, int i, boolean z) {
        TypedValue typedValueO = o(context, i);
        if (typedValueO == null || typedValueO.type != 18) {
            return z;
        }
        return typedValueO.data != 0;
    }

    public static int q(int i, Context context, String str) {
        TypedValue typedValueO = o(context, i);
        if (typedValueO != null) {
            return typedValueO.data;
        }
        k220.q("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return 0;
    }

    public static int r(View view, int i) {
        return q(i, view.getContext(), view.getClass().getCanonicalName());
    }

    public static final qim0 s(qim0 qim0Var, ct41 ct41Var, qqq0 qqq0Var, hxq0 hxq0Var, boolean z, boolean z2, iq20 iq20Var, jdn0 jdn0Var, p5c p5cVar) {
        qqq0 qqq0Var2 = qqq0.a;
        nim0 nim0Var = nim0.a;
        return qim0Var.then(qqq0Var == qqq0Var2 ? i1p1.q(nim0Var, u5j1.b) : i1p1.q(nim0Var, gcg.c)).then(new qs41(p5cVar, iq20Var, jdn0Var, qqq0Var, hxq0Var, ct41Var, z, z2, false));
    }

    public static final x360 t(Heading heading, boolean z) {
        int iQ = heading.q();
        int i = iQ == 0 ? -1 : wi51.a[l1d.C(iQ)];
        if (i == 1) {
            if (z) {
                return new mhq0(heading.u().r(), heading.u().p(), new lay("", "", ""));
            }
            return new hvl1(heading.u().r(), 240, heading.u().p(), heading.u().s() ? heading.u().q().p() : null, false, heading.u().s() ? heading.u().q().getUri() : null);
        }
        if (i == 2) {
            return z ? new mhq0(heading.p().getFormat(), heading.p().q(), new lay(heading.p().o().getTitle(), heading.p().o().getUri(), heading.p().o().getImageUrl())) : new jzg1(heading.p().getFormat(), heading.p().q(), new lay(heading.p().o().getTitle(), heading.p().o().getUri(), heading.p().o().getImageUrl()));
        }
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return new prb1(heading.t().r(), heading.t().q(), heading.t().getImageUrl(), heading.t().p());
        }
        String title = heading.r().getTitle();
        String subtitle = heading.r().getSubtitle();
        String strP = heading.r().p();
        String uri = heading.r().q().getUri();
        uri.getClass();
        return new i460(title, 8, subtitle, strP, false, !ihc1.y0(uri) ? uri : null);
    }

    public static int u(byte[] bArr, int i, qhn1 qhn1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return v(b, i2, qhn1Var, bArr);
        }
        qhn1Var.a = b;
        return i2;
    }

    public static int v(int i, int i2, qhn1 qhn1Var, byte[] bArr) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            qhn1Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            qhn1Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            qhn1Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            qhn1Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                qhn1Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int w(byte[] bArr, int i, qhn1 qhn1Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            qhn1Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        qhn1Var.b = j2;
        return i3;
    }

    public static int x(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long y(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int z(byte[] bArr, int i, qhn1 qhn1Var) throws zzdv {
        int iU = u(bArr, i, qhn1Var);
        int i2 = qhn1Var.a;
        if (i2 < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iU) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            qhn1Var.c = gun1.b;
            return iU;
        }
        qhn1Var.c = gun1.l(iU, bArr, i2);
        return iU + i2;
    }
}
