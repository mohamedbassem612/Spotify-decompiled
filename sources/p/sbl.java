package p;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sbl {
    public static final swz0 a = new swz0(new eho0(false, false));
    public static b180 b;
    public static b180 c;

    public static final e7m0 A(iu30 iu30Var, Update update, Connectable connectable, vu30 vu30Var, iu30 iu30Var2) {
        w6m0 w6m0Var = new w6m0(update, (byte) 0);
        cas casVar = new cas();
        iu30Var2.invoke(casVar);
        return new e7m0(iu30Var, w6m0Var, connectable, vu30Var, casVar);
    }

    public static final e7m0 B(Object obj, Update update, Connectable connectable, vu30 vu30Var, iu30 iu30Var) {
        return C(new sa5(obj, (byte) 2), update, connectable, vu30Var, iu30Var);
    }

    public static final e7m0 C(iu30 iu30Var, Update update, Connectable connectable, vu30 vu30Var, iu30 iu30Var2) {
        dq7 dq7Var = new dq7(update, (byte) 21);
        cas casVar = new cas();
        iu30Var2.invoke(casVar);
        return new e7m0(iu30Var, dq7Var, connectable, vu30Var, casVar);
    }

    public static final long D(int i, int i2, boolean z, boolean z2) {
        long j = i;
        long j2 = ((long) i2) & 2147483647L;
        long j3 = z ? (j << 32) | Long.MIN_VALUE : (j << 32) & Long.MAX_VALUE;
        if (z2) {
            j2 |= 2147483648L;
        }
        return j2 | j3;
    }

    public static final tzd E(int i, int i2, int i3, Integer num, float f, float f2, float f3, int i4, int i5, int i6, int i7, float f4, boolean z) {
        List listM = z ? p7h.M(new Float[]{Float.valueOf(i), Float.valueOf(i2)}) : Collections.singletonList(Float.valueOf(i3));
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Math.min(f4, ((Number) it.next()).floatValue())));
        }
        float fIntValue = (!z || num == null) ? 0.0f : num.intValue();
        float f5 = f * f2;
        float f6 = f3 * f2;
        float f7 = i4;
        float f8 = i5;
        float f9 = i6 + f5 + fIntValue;
        Iterator it2 = listM.iterator();
        float fFloatValue = 0.0f;
        while (it2.hasNext()) {
            fFloatValue = ((Number) it2.next()).floatValue() + fFloatValue;
        }
        float fMax = Math.max(0.0f, (((fFloatValue + f9) + f7) + f8) - i7);
        float f10 = fIntValue;
        double dFloatValue = 0.0d;
        for (mmr0 mmr0Var : o7h.v1(listM, arrayList)) {
            dFloatValue += (double) (((Number) mmr0Var.a).floatValue() - ((Number) mmr0Var.b).floatValue());
        }
        float f11 = (float) dFloatValue;
        float fMin = Math.min(fMax, f11);
        float f12 = f11 == 0.0f ? 0.0f : fMin / f11;
        ArrayList<mmr0> arrayListV1 = o7h.v1(listM, arrayList);
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListV1, 10));
        for (mmr0 mmr0Var2 : arrayListV1) {
            float fFloatValue2 = ((Number) mmr0Var2.a).floatValue();
            arrayList2.add(Float.valueOf(fFloatValue2 - ((fFloatValue2 - ((Number) mmr0Var2.b).floatValue()) * f12)));
        }
        float f13 = fMax - fMin;
        float fMin2 = Math.min(f13, f8);
        float f14 = f8 - fMin2;
        float f15 = f13 - fMin2;
        float fMin3 = Math.min(f15, f7);
        float f16 = f7 - fMin3;
        float f17 = f15 - fMin3;
        if (z && f17 > 0.0f) {
            return f17 >= f10 * 0.05f ? E(i, i2, i3, num, f, f2, f3, i4, i5, i6, i7, f4, false) : new tzd(f, ((Number) o7h.q0(arrayList2)).floatValue(), ((Number) arrayList2.get(1)).floatValue(), true, f16, f14);
        }
        return new tzd(f17 >= f5 - f6 ? f3 : (f5 - f17) / f2, ((Number) o7h.q0(arrayList2)).floatValue(), ((Number) (1 < arrayList2.size() ? arrayList2.get(1) : Float.valueOf(0.0f))).floatValue(), z, f16, f14);
    }

    public static final void F(lw4 lw4Var, BlurMaskFilter blurMaskFilter) {
        lw4Var.a.setMaskFilter(blurMaskFilter);
    }

    public static final boolean G(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    public static final boolean H(long j) {
        return (j & 2147483648L) != 0;
    }

    public static final int I(long j) {
        return (int) ((j & 9223372032559808512L) >>> 32);
    }

    public static Next J(kak0 kak0Var, u2k0 u2k0Var) {
        mmr0 mmr0Var;
        s69 s69Var = u2k0Var.b;
        s69 s69Var2 = u2k0Var.c;
        q6w0 q6w0Var = kak0Var.S0.a;
        gez gezVar = q6w0Var.t;
        if (gezVar == null) {
            gezVar = new gez((s69) null, (s69) null, (s69) null);
        }
        s69 s69Var3 = gezVar.c;
        s69 s69Var4 = gezVar.b;
        gez gezVar2 = q6w0Var.X;
        if (gezVar2 == null) {
            gezVar2 = new gez((s69) null, (s69) null, (s69) null);
        }
        s69 s69Var5 = gezVar2.c;
        s69 s69Var6 = gezVar2.b;
        int iOrdinal = u2k0Var.a.ordinal();
        if (iOrdinal == 0) {
            gez gezVar3 = new gez(s69Var, s69Var4, s69Var3);
            s69 s69Var7 = gezVar2.a;
            if (s69Var7 != null) {
                s69Var2 = s69Var7;
            }
            mmr0Var = new mmr0(gezVar3, new gez(s69Var2, s69Var6, s69Var5));
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            s69 s69Var8 = gezVar.a;
            if (s69Var8 != null) {
                s69Var2 = s69Var8;
            }
            mmr0Var = new mmr0(new gez(s69Var2, s69Var4, s69Var3), new gez(s69Var, s69Var6, s69Var5));
        }
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, q6w0.a(q6w0Var, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) mmr0Var.a, (gez) mmr0Var.b, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 63999), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 1);
    }

    public static final void a(ArrayList arrayList, String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        String str2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        int i2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1365850176);
        j06 j06Var = ((x340) b0kVar3).a;
        int i3 = i | (b0kVar3.g(arrayList) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused) | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            String strO0 = cwl1.o0(b0kVar3, 2131962203);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            long j = cbx.a(b0kVar3).b.b;
            float f = cbx.b(b0kVar3).e.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0Var2 = qim0Var3;
            int i4 = i3;
            uwo1.e(strO0, uyn1.y(qim0Var3, f, 12.0f), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2032);
            b0kVar2 = b0kVar3;
            qim0 qim0VarF2 = nho1.F(u291.f(qim0Var2, 1.0f));
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            b0kVar2.i0(-1244832572);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kx2 kx2Var = (kx2) it.next();
                boolean zEquals = kx2Var.a.equals(str);
                int i5 = i4;
                boolean zG = b0kVar2.g(kx2Var) | ((i5 & 896) == 256);
                Object objT = b0kVar2.T();
                if (zG || objT == fkj0.X) {
                    i2 = 0;
                    objT = new nx2(iu30Var, kx2Var, (byte) 0);
                    b0kVar2.s0(objT);
                } else {
                    i2 = 0;
                }
                b(kx2Var, zEquals, (Function0) objT, b0kVar2, i2);
                i4 = i5;
            }
            str2 = str;
            iu30Var2 = iu30Var;
            us71.m(b0kVar2, false, true, true);
        } else {
            b0kVar2 = b0kVar3;
            str2 = str;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(arrayList, str2, iu30Var2, qim0Var2, i);
        }
    }

    public static final void b(kx2 kx2Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1871400);
        int i2 = i | (b0kVar3.g(kx2Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            b0kVar3.i0(84574687);
            b0kVar3.r(false);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new gy((byte) 1, z);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("agent_voice_row", s161.b(qim0VarF, false, (iu30) objT)), (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1873759858, new aw1((byte) 1, z), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(165358356, new o2(kx2Var, (byte) 26), b0kVar3), b0kVar2, 100663296, 196608, 30398);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(kx2Var, z, function0, i, (byte) 4);
        }
    }

    public static final void c(r6f1 r6f1Var, qim0 qim0Var, b0k b0kVar, int i) {
        nim0 nim0Var;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1248865269);
        int i2 = i | (x340Var.i(r6f1Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vu30 vu30Var = r6f1Var.a;
            vu30 vu30Var2 = r6f1Var.c;
            boolean z = vu30Var != null;
            boolean z2 = vu30Var2 != null;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f2 = cbx.b(x340Var).b.b;
            float f3 = z ? 8.0f : 0.0f;
            float f4 = z2 ? 8.0f : 0.0f;
            if (!z2 && z) {
                f2 = 8.0f;
            }
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            vu30 vu30Var3 = r6f1Var.a;
            nim0 nim0Var2 = nim0.a;
            if (vu30Var3 == null) {
                x340Var.i0(37898159);
                x340Var.r(false);
                nim0Var = nim0Var2;
                f = f4;
            } else {
                x340Var.i0(37898160);
                nim0Var = nim0Var2;
                f = f4;
                qgo1.f((vnr0) vu30Var3.invoke(x340Var, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var, 8, 62);
                x0d.s(nim0Var, f3, x340Var, false);
            }
            qgo1.f((vnr0) r6f1Var.b.invoke(x340Var, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var, 8, 62);
            if (vu30Var2 == null) {
                x340Var.i0(38097644);
                x340Var.r(false);
            } else {
                v8i0.i(f, 38097645, x340Var, x340Var, nim0Var);
                qgo1.f((vnr0) vu30Var2.invoke(x340Var, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var, 8, 62);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, f2));
            qgo1.f((vnr0) r6f1Var.e.invoke(x340Var, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var, 8, 62);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(r6f1Var, qim0Var, i, (byte) 29);
        }
    }

    public static final void d(int i, int i2, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        h311 h311VarV;
        ryh ryhVar;
        ncf0 ncf0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(403851274);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : SemanticState.Focused) | (x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (str == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ryhVar = new ryh(i, str, z, qim0Var, i2, (byte) 2);
                }
            } else {
                ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, (xu30) null, x340Var, 57344 & (i3 << 9), 46);
                kbf0 kbf0VarS = m5n1.S(x340Var);
                Integer numValueOf = Integer.valueOf(i);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zI = x340Var.i(kbf0VarS) | ((i3 & 896) == 256) | x340Var.i(ncf0VarG);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    ncf0Var = ncf0VarG;
                    hl1 hl1Var = new hl1(z, kbf0VarS, ncf0Var, (lnm) null, (byte) 9);
                    x340Var.s0(hl1Var);
                    objT = hl1Var;
                } else {
                    ncf0Var = ncf0VarG;
                }
                int i4 = i3 >> 3;
                qxd0.s(numValueOf, boolValueOf, (vu30) objT, x340Var);
                fcf0 value = ncf0Var.getValue();
                as80 as80Var = mif1.P0;
                gra graVar = een.h;
                boolean zI2 = x340Var.i(kbf0VarS);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new uk1(kbf0VarS, (byte) 5);
                    x340Var.s0(objT2);
                }
                mp10.e(value, (Function0) objT2, qim0Var, false, false, false, (xc21) null, false, (ddf0) null, graVar, as80Var, false, false, (Map) null, (jj7) null, false, x340Var, i4 & 896, 0, 63992);
            }
            h311VarV.d = ryhVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ryhVar = new ryh(i, str, z, qim0Var, i2, (byte) 3);
            h311VarV.d = ryhVar;
        }
    }

    public static final void e(wam wamVar, float f, float f2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-246418122);
        int i2 = i | (b0kVar2.g(wamVar) ? 4 : 2) | (b0kVar2.d(f) ? 32 : 16) | (b0kVar2.d(f2) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar2.i(function0) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar2.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        byte b2 = 0;
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            kiv kivVar = t4k.h;
            wat watVar = (wat) b0kVar2.k(kivVar);
            float fH = watVar.h();
            float fU0 = watVar.U0();
            if (fU0 > 1.5f) {
                fU0 = 1.5f;
            }
            xat xatVar = new xat(fH, fU0);
            boolean z = f2 > 0.95f;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
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
            pbh pbhVar = pbh.a;
            nim0 nim0Var = nim0.a;
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, true));
            mod.b(kivVar.a(xatVar), apo.r(-226220820, new k340(wamVar, b2), b0kVar2), b0kVar2, 56);
            op71.g(b0kVar2, u291.h(nim0Var, 12.0f));
            boolean z2 = z;
            byte b3 = 1;
            n(wamVar.c(), wamVar.b(), u291.v(nim0Var, f), d1u.E(4.0f, wamVar.d(), nim0Var, er31.a), null, b0kVar2, 0, 16);
            op71.g(b0kVar2, pbhVar.a(0.32f, nim0Var, true));
            boolean zH = b0kVar2.h(z2) | ((i2 & 7168) == 2048);
            Object objT = b0kVar2.T();
            if (zH || objT == fkj0.X) {
                objT = new y96(z2, function0, (byte) 3);
                b0kVar2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(), (qim0) null, (max) null, yla.r(b0kVar2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-880405333, new k340(wamVar, b3), b0kVar2), b0kVar2, 0, 48, 2012);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, true));
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ub9(wamVar, f, f2, function0, qim0Var, i);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1893191531);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float f = rck.b;
            xie1 xie1Var = new xie1(4.0f, 10.0f, 10.0f, 0.5f);
            qim0Var2 = nim0.a;
            qim0 qim0VarE = d1u.E(1.0f, rck.a, i1p1.q(u291.h(u291.f(qim0Var2, 1.0f), 56.0f), xie1Var), xie1Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarE, cbx.a(x340Var).a.b.a(), d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
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
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE2, x340Var, lljVar4);
            s(40.0f, 40.0f, null, er31.b(2.0f), x340Var, 54, 4);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(z)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            s(140.0f, 12.0f, null, null, x340Var, 0, 12);
            s(100.0f, 12.0f, null, null, x340Var, 0, 12);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 28);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(881033600);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = us71.i(0.6567f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            boolean zD = x340Var.d(drr0Var.s());
            Object objT2 = x340Var.T();
            if (zD || objT2 == obj) {
                float f = rck.b;
                objT2 = new xie1(16.0f, 16.0f, 16.0f, drr0Var.s());
                x340Var.s0(objT2);
            }
            xie1 xie1Var = (xie1) objT2;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = d1u.E(1.0f, rck.a, i1p1.q(u291.f(qim0Var2, 1.0f), xie1Var), xie1Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarE, cbx.a(x340Var).a.b.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            j2i j2iVar = jei.a;
            j2i j2iVar2 = jei.b;
            boolean zI = x340Var.i(drr0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new qg6(drr0Var, (byte) 12);
                x340Var.s0(objT3);
            }
            wie1.a(j2iVar, j2iVar2, qim0VarF2, (iu30) objT3, x340Var, 54);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 29);
        }
    }

    public static final void h(float f, int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        iu30 iu30Var2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(659513944);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.d(f) ? SemanticState.Hidden : SemanticState.Focused) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(new d36(20.0f, false, new g21(een.N0, (byte) 28)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarV = u291.v(qim0Var3, f);
            String str = ((o9g) c380Var.get(0)).b;
            Uri uri = ((o9g) c380Var.get(0)).c;
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new l340((byte) 0, iu30Var, c380Var);
                x340Var.s0(objT);
            }
            n(str, uri, qim0VarV, null, (Function0) objT, x340Var, 0, 8);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(20.0f, true, new g21(eraVar, (byte) 29)), een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarV2 = u291.v(qim0Var3, f);
            String str2 = ((o9g) c380Var.get(1)).b;
            Uri uri2 = ((o9g) c380Var.get(1)).c;
            boolean z3 = (i4 == 4) | (i3 == 32);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new l340((byte) 1, iu30Var, c380Var);
                x340Var.s0(objT2);
            }
            iu30Var2 = iu30Var;
            n(str2, uri2, qim0VarV2, null, (Function0) objT2, x340Var, 0, 8);
            qim0 qim0VarV3 = u291.v(qim0Var3, f);
            String str3 = ((o9g) c380Var.get(2)).b;
            Uri uri3 = ((o9g) c380Var.get(2)).c;
            boolean z4 = (i3 == 32) | (i4 == 4);
            Object objT3 = x340Var.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new l340((byte) 2, iu30Var2, c380Var);
                x340Var.s0(objT3);
            }
            n(str3, uri3, qim0VarV3, null, (Function0) objT3, x340Var, 0, 8);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m340(c380Var, iu30Var2, f, qim0Var2, i);
        }
    }

    public static final qbl i(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && x74.j(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new rbl(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return qbl.a;
    }

    public static final void j(String str, boolean z, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        h311 h311VarV;
        n340 n340Var;
        Object obj;
        ncf0 ncf0Var;
        Object obj2 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-733633825);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : SemanticState.Focused) | (b0kVar3.i(iu30Var) ? 2048 : SemanticState.ReadOnly);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                b0kVar3.i0(1403518915);
                b0kVar3.r(false);
                ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, (xu30) null, b0kVar3, (i2 << 12) & 57344, 46);
                kbf0 kbf0VarN = zpn1.n(ncf0VarG.getValue(), true, false, (bcf0) null, 0.0f, 0, b0kVar3, 1020);
                Object objT = b0kVar3.T();
                if (objT == obj2) {
                    objT = p7h.M(new String[]{"3", "2", "1"});
                    b0kVar3.s0(objT);
                }
                List list = (List) objT;
                Object objT2 = b0kVar3.T();
                if (objT2 == obj2) {
                    objT2 = new LinkedHashSet();
                    b0kVar3.s0(objT2);
                }
                Set set = (Set) objT2;
                Object value = kbf0VarN.getValue();
                fcf0 value2 = ncf0VarG.getValue();
                boolean zI = b0kVar3.i(ncf0VarG) | b0kVar3.i(kbf0VarN) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objT3 = b0kVar3.T();
                if (zI || objT3 == obj2) {
                    obj = value;
                    ncf0Var = ncf0VarG;
                    df6 df6Var = new df6(ncf0Var, kbf0VarN, function0, list, set, iu30Var, (lnm) null, (byte) 9);
                    b0kVar3.s0(df6Var);
                    objT3 = df6Var;
                } else {
                    obj = value;
                    ncf0Var = ncf0VarG;
                }
                qxd0.s(obj, value2, (vu30) objT3, b0kVar3);
                qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                fcf0 value3 = ncf0Var.getValue();
                h6m h6mVar = mif1.Q0;
                boolean zI2 = b0kVar3.i(kbf0VarN);
                Object objT4 = b0kVar3.T();
                if (zI2 || objT4 == obj2) {
                    objT4 = new uk1(kbf0VarN, (byte) 6);
                    b0kVar3.s0(objT4);
                }
                b0kVar2 = b0kVar3;
                mp10.e(value3, (Function0) objT4, qim0VarD, false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, h6mVar, false, false, (Map) null, (jj7) null, false, b0kVar2, 0, 0, 64504);
            } else {
                b0kVar3.i0(1403462216);
                boolean z2 = (i2 & 896) == 256;
                Object objT5 = b0kVar3.T();
                if (z2 || objT5 == obj2) {
                    objT5 = new to1(function0, null, (byte) 10);
                    b0kVar3.s0(objT5);
                }
                qxd0.t(rih1.a, b0kVar3, (vu30) objT5);
                b0kVar3.r(false);
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    n340Var = new n340(str, z, function0, iu30Var, i, (byte) 0);
                }
            }
            h311VarV.d = n340Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            n340Var = new n340(str, z, function0, iu30Var, i, (byte) 1);
            h311VarV.d = n340Var;
        }
    }

    public static final void k(final xr91 xr91Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i) {
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1354335728);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(xr91Var) : x340Var.i(xr91Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                obj = objT;
                wg10 wg10Var = new wg10();
                wg10Var.a = new Object();
                wg10Var.b = new ArrayList();
                x340Var.s0(wg10Var);
                obj = wg10Var;
            }
            obj = objT;
            final wg10 wg10Var2 = (wg10) obj;
            x340Var.k(AndroidCompositionLocals_androidKt.a);
            final String string = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources().getString(2131958375);
            Object obj2 = wg10Var2.a;
            ArrayList arrayList = wg10Var2.b;
            if (u890.j(xr91Var, obj2)) {
                x340Var.i0(95881138);
                x340Var.r(false);
            } else {
                x340Var.i0(93279711);
                wg10Var2.a = xr91Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((xr91) ((ug10) arrayList.get(i3)).a);
                }
                final ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(xr91Var)) {
                    arrayList3.add(xr91Var);
                }
                arrayList.clear();
                ArrayList arrayListA = p5d0.a(arrayList3);
                int size2 = arrayListA.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    final xr91 xr91Var2 = (xr91) arrayListA.get(i4);
                    arrayList.add(new ug10(xr91Var2, apo.r(-1032415134, new xu30() { // from class: p.rr91
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Boolean bool;
                            int i5;
                            vu30 vu30Var = (vu30) obj3;
                            x340 x340Var2 = (b0k) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            Object obj6 = fkj0.X;
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= x340Var2.i(vu30Var) ? 4 : 2;
                            }
                            x340 x340Var3 = x340Var2;
                            if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                                xr91 xr91Var3 = xr91Var2;
                                boolean zJ = u890.j(xr91Var3, xr91Var);
                                int i6 = zJ ? 150 : 75;
                                int i7 = (!zJ || p5d0.a(arrayList3).size() == 1) ? 0 : 75;
                                pxg1 pxg1Var = new pxg1(i6, i7, mlv.d);
                                boolean zI = x340Var3.i(xr91Var3);
                                wg10 wg10Var3 = wg10Var2;
                                boolean zI2 = zI | x340Var3.i(wg10Var3);
                                Object objT2 = x340Var3.T();
                                byte b3 = 14;
                                if (zI2 || objT2 == obj6) {
                                    objT2 = new qga0(xr91Var3, wg10Var3, b3);
                                    x340Var3.s0(objT2);
                                }
                                Function0 function0 = (Function0) objT2;
                                Object objT3 = x340Var3.T();
                                if (objT3 == obj6) {
                                    objT3 = c97.b(!zJ ? 1.0f : 0.0f);
                                    x340Var3.s0(objT3);
                                }
                                o95 o95Var = (o95) objT3;
                                Boolean boolValueOf = Boolean.valueOf(zJ);
                                boolean zI3 = x340Var3.i(o95Var) | x340Var3.h(zJ) | x340Var3.i(pxg1Var) | x340Var3.g(function0);
                                Object objT4 = x340Var3.T();
                                if (zI3 || objT4 == obj6) {
                                    bool = boolValueOf;
                                    i5 = i6;
                                    du2 du2Var = new du2(o95Var, zJ, pxg1Var, function0, (lnm) null, (byte) 19);
                                    x340Var3.s0(du2Var);
                                    objT4 = du2Var;
                                } else {
                                    i5 = i6;
                                    bool = boolValueOf;
                                }
                                qxd0.t(bool, x340Var3, (vu30) objT4);
                                ie5 ie5Var = o95Var.c;
                                pxg1 pxg1Var2 = new pxg1(i5, i7, mlv.a);
                                Object objT5 = x340Var3.T();
                                if (objT5 == obj6) {
                                    objT5 = c97.b(zJ ? 0.8f : 1.0f);
                                    x340Var3.s0(objT5);
                                }
                                o95 o95Var2 = (o95) objT5;
                                Boolean boolValueOf2 = Boolean.valueOf(zJ);
                                boolean zI4 = x340Var3.i(o95Var2) | x340Var3.h(zJ) | x340Var3.i(pxg1Var2);
                                Object objT6 = x340Var3.T();
                                if (zI4 || objT6 == obj6) {
                                    objT6 = new vr91(o95Var2, zJ, pxg1Var2, (lnm) null);
                                    x340Var3.s0(objT6);
                                }
                                qxd0.t(boolValueOf2, x340Var3, (vu30) objT6);
                                ie5 ie5Var2 = o95Var2.c;
                                qim0 qim0VarE = i541.E(nim0.a, ((Number) ie5Var2.b.getValue()).floatValue(), ((Number) ie5Var2.b.getValue()).floatValue(), ((Number) ie5Var.b.getValue()).floatValue(), 0.0f, (hw61) null, 131064);
                                boolean zH = x340Var3.h(zJ);
                                String str = string;
                                boolean zG = zH | x340Var3.g(str) | x340Var3.i(xr91Var3);
                                Object objT7 = x340Var3.T();
                                if (zG || objT7 == obj6) {
                                    objT7 = new ojr0(zJ, str, xr91Var3, (byte) 1);
                                    x340Var3.s0(objT7);
                                }
                                qim0 qim0VarB = s161.b(qim0VarE, false, (iu30) objT7);
                                gfh0 gfh0VarC = t1c.c(een.d, false);
                                int iK = tgp1.k(x340Var3);
                                xos0 xos0VarM = x340Var3.m();
                                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarB);
                                hzj.A.getClass();
                                if (x340Var3.a == null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var3.m0();
                                if (x340Var3.S) {
                                    x340Var3.l(hmb0.t1);
                                } else {
                                    x340Var3.v0();
                                }
                                nko1.H(gfh0VarC, x340Var3, y580.O0);
                                nko1.H(xos0VarM, x340Var3, y580.N0);
                                llj lljVar = y580.R0;
                                if (x340Var3.S || !u890.j(x340Var3.T(), Integer.valueOf(iK))) {
                                    z5c.f(iK, x340Var3, iK, lljVar);
                                }
                                nko1.H(qim0VarE2, x340Var3, y580.Y);
                                us71.j(iIntValue & 14, vu30Var, x340Var3, true);
                            } else {
                                x340Var3.b0();
                            }
                            return rih1.a;
                        }
                    }, x340Var)));
                }
                x340Var.r(false);
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
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
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            wg10Var2.c = tgp1.m(x340Var);
            x340Var.i0(-1757732554);
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ug10 ug10Var = (ug10) arrayList.get(i5);
                xr91 xr91Var3 = (xr91) ug10Var.a;
                j2i j2iVar = ug10Var.b;
                x340Var.f0(-1515535286, xr91Var3);
                j2iVar.invoke(apo.r(2017516783, new sr91(xu30Var, xr91Var3, b2), x340Var), x340Var, 6);
                x340Var.r(false);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05((Object) xr91Var, (Object) qim0Var, (cv30) xu30Var, i, (byte) 12);
        }
    }

    public static final void l(r340 r340Var, bjx bjxVar, boolean z, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1485415375);
        int i2 = i | (x340Var2.g(r340Var) ? 4 : 2) | (x340Var2.i(bjxVar) ? 32 : 16) | (x340Var2.h(z) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            zy9 zy9Var = r340Var.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), yah.a, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            fq7.g(zy9Var.b, (qim0) null, bby.b, xay.f(2, z ? irn1.o0(ContentFeedType.OTHER, 0, (dlv) null, 6) : irn1.j0()), (String) null, apo.r(1859748913, new mp20(zy9Var, (byte) 15), x340Var2), x340Var2, 196608, 18);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            zam zamVar = r340Var.c;
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new mj10((byte) 3, z);
                x340Var2.s0(objT);
            }
            hm5.a(zamVar, qim0VarD, (iu30) objT, (tl3) null, (String) null, (iu30) null, apo.r(868437925, new q340(z, bjxVar, r340Var), x340Var2), x340Var2, 1572864, 56);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(r340Var, bjxVar, z, i, (byte) 19);
        }
    }

    public static final void m(m360 m360Var, Function0 function0, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        boolean z2;
        pxg1 pxg1VarJ0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1361655619);
        int i2 = i | (b0kVar3.g(m360Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.h(z) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(b0kVar3);
            boolean z3 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new zg20(function0, (byte) 11);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarA, (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, dqi.a, b0kVar2, 0, 6, 984);
            if (m360Var.d) {
                b0kVar2.i0(-1899709769);
                q(m360Var.a, m360Var.b, 0, b0kVar2, h2cVar.a(nim0Var, een.h));
                qim0 qim0VarF = u291.f(h2cVar.a(nim0Var, een.i), 1.0f);
                String strValueOf = String.valueOf(m360Var.c);
                if (z) {
                    b0kVar2.i0(-1899353982);
                    uwr uwrVar = cbx.a;
                    z2 = false;
                    pxg1VarJ0 = irn1.o0(ContentFeedType.OTHER, 0, ((jhx) cbx.c(b0kVar2).a.b).b, 2);
                    b0kVar2.r(false);
                } else {
                    z2 = false;
                    b0kVar2.i0(-1899251899);
                    b0kVar2.r(false);
                    pxg1VarJ0 = irn1.j0();
                }
                eth.a(strValueOf, qim0VarF, pxg1VarJ0, (String) null, dqi.b, b0kVar2, 24576, 8);
                b0kVar2.r(z2);
            } else {
                b0kVar2.i0(-1898896763);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(m360Var, function0, qim0Var, z, i, (byte) 26);
        }
    }

    public static final void n(String str, Uri uri, qim0 qim0Var, qim0 qim0Var2, Function0 function0, b0k b0kVar, int i, int i2) {
        qim0 qim0Var3;
        int i3;
        Function0 function1;
        int i4;
        x340 x340Var;
        qim0 qim0Var4;
        Function0 function2;
        qim0 qim0VarV;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1286568866);
        j06 j06Var = x340Var2.a;
        int i5 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(uri) ? 32 : 16) | (x340Var2.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            qim0Var3 = qim0Var2;
        } else {
            qim0Var3 = qim0Var2;
            i3 = i5 | (x340Var2.i(qim0Var3) ? SemanticState.Modal : SemanticState.ReadOnly);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            function1 = function0;
        } else {
            function1 = function0;
            i4 = i3 | (x340Var2.i(function1) ? 16384 : SemanticState.Multiline);
        }
        boolean z = false;
        if (x340Var2.Y(i4 & 1, (i4 & 9363) != 9362)) {
            qim0 qim0Var5 = nim0.a;
            qim0 qim0Var6 = i6 != 0 ? qim0Var5 : qim0Var3;
            Function0 function3 = i7 != 0 ? null : function1;
            if (function3 != null) {
                x340Var2.i0(-114852843);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var2);
                }
                idn0 idn0Var = (idn0) objT;
                jtr jtrVar = jtr.f;
                boolean z2 = (57344 & i4) == 16384;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new zg20(function3, (byte) 12);
                    x340Var2.s0(objT2);
                }
                qim0VarV = bin.v(qim0Var5, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-114620374);
                x340Var2.r(false);
                qim0VarV = qim0Var5;
            }
            qim0 qim0VarThen = qim0Var.then(qim0VarV);
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(z)), een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var5);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            nkx nkxVar = nkx.c;
            nux nuxVar = new nux(nkxVar, nkxVar);
            qim0Var4 = qim0Var6;
            eso1.e(uri, isl.a, i1p1.q(d7e.r(1.0f, u291.f(qim0Var5, 0.75f), false).then(qim0Var6), er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, ((i4 >> 3) & 14) | 1073769520, 0, 3552);
            x340Var2.r(true);
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, lee1.a(cbx.d(x340Var2).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(3), 0, new px8(cbx.d(x340Var2).n.a.b, cbx.d(x340Var2).h.a.b, 0L, (mx8) null, 12), x340Var2, i4 & 14, 8, 746);
            x340Var = x340Var2;
            x340Var.r(true);
            function2 = function3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var4 = qim0Var3;
            function2 = function1;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ik2(str, uri, qim0Var, qim0Var4, function2, i, i2, (byte) 4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void o(s171 s171Var, qim0 qim0Var, int i, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        qim0 qim0Var2;
        int i5;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1597965727);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(s171Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | 48;
        int i7 = i3 & 4;
        if (i7 != 0) {
            i6 = i4 | 432;
        } else if ((i2 & 384) == 0) {
            i6 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            int i8 = i7 != 0 ? 1 : i;
            int iC = l1d.C(i8);
            if (iC == 0) {
                x340Var.i0(1953235602);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                x340Var.r(false);
                f = 16.0f;
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, 1953233317, false);
                }
                x340Var.i0(1953237217);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                f = zjy.j(12.0f, new p3v(12.0f)).a;
                x340Var.r(false);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 54);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zpn1.f(u291.D(u291.h(qim0Var3, f), (era) null, 3), 0L, x340Var, 0, 2);
            wwo1.l(s171Var, (qim0) null, i8, x340Var, i6 & 910);
            x340Var.r(true);
            i5 = i8;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            i5 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e13((byte) 3, i5, i2, i3, s171Var, qim0Var2);
        }
    }

    public static final void p(String str, LocalDate localDate, int i, String str2, String str3, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(411362224);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(localDate) ? 32 : 16) | (b0kVar3.e(i) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.g(str2) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar3.g(str3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (b0kVar3.i(iu30Var) ? 131072 : 65536) | 1572864;
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            String strO0 = cwl1.o0(b0kVar3, 2131960375);
            boolean z = (i3 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            ogx ogxVar = ogx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx(2.0f, 12.0f, 8.0f, new zzq0(8.0f, 8.0f, 8.0f, 8.0f));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            ioo1.c(uyn1.z(16.0f, 0.0f, 2, qim0VarF), ogxVar, ydxVar, (hw61) null, (max) null, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(730455013, new dk0(str, str2, str3, i, localDate), b0kVar3), b0kVar2, 512, 1572864, 65400);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(str, localDate, i, str2, str3, iu30Var, qim0Var2, i2);
        }
    }

    public static final void q(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1037899890);
        byte b2 = 2;
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused);
        boolean z = false;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            d36 d36Var = new d36(4.0f, true, new um5(z));
            fra fraVar = een.N0;
            boolean z2 = ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i4 & 14) == 4);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new mun(b2, i2, i);
                x340Var.s0(objT);
            }
            ujo1.e(qim0Var, (xtb0) null, (vzq0) null, d36Var, fraVar, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, (i4 >> 6) & 14, 462);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 4, i, i2, i3, qim0Var);
        }
    }

    public static final void r(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1199453249);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            long jC = cbx.a(x340Var).a.b.c();
            long j = cbx.a(x340Var).a.d;
            qim0 qim0Var2 = nim0.a;
            t1c.a(d1u.E(1.0f, j, cwl1.l0(dug.f(u291.r(qim0Var2, 192.0f), jC, cr31VarB), jC, cr31VarB, 12), cr31VarB), x340Var, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 19);
        }
    }

    public static final void s(float f, float f2, qim0 qim0Var, cr31 cr31Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        cr31 cr31VarB;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1369704243);
        if ((i & 6) == 0) {
            i3 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.d(f2) ? 32 : 16;
        }
        int i4 = i3 | 384 | (((i2 & 8) == 0 && x340Var.g(cr31Var)) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                int i5 = i2 & 8;
                qim0Var3 = nim0.a;
                if (i5 != 0) {
                    cr31VarB = er31.b(8.0f);
                }
                x340Var.s();
                qim0 qim0VarS = u291.s(qim0Var3, f, f2);
                uwr uwrVar = cbx.a;
                t1c.a(cwl1.l0(dug.f(qim0VarS, cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            cr31VarB = cr31Var;
            x340Var.s();
            qim0 qim0VarS2 = u291.s(qim0Var3, f, f2);
            uwr uwrVar2 = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarS2, cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            cr31VarB = cr31Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vdk(f, f2, qim0Var2, cr31VarB, i, i2);
        }
    }

    public static final void t(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1612325765);
        int i2 = i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var, 72.0f);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarR, cbx.a(x340Var).a.b.a(), er31.a), 0L, er31.b(72.0f), 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 0);
        }
    }

    public static final void u(final cs91 cs91Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        final qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1351125615);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(cs91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & 384) == 0) {
            i4 |= x340Var.i(xu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                xu30Var = b2u.a;
            }
            xr91 xr91Var = (xr91) cs91Var.b.getValue();
            cg cgVar = (cg) x340Var.k(t4k.a);
            boolean zI = x340Var.i(xr91Var) | x340Var.i(cgVar);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new sb91(xr91Var, cgVar, (lnm) null, (byte) 6);
                x340Var.s0(objT);
            }
            qxd0.t(xr91Var, x340Var, (vu30) objT);
            xr91 xr91Var2 = (xr91) cs91Var.b.getValue();
            int i6 = i4 & ContentMediaFormat.PREVIEW_EPISODE;
            qim0 qim0Var3 = nim0.a;
            k(xr91Var2, qim0Var3, xu30Var, x340Var, i6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        final xu30 xu30Var2 = xu30Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            final byte b2 = 4;
            h311VarV.d = new vu30() { // from class: p.rd4
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    rih1 rih1Var = rih1.a;
                    int i7 = i;
                    xu30 xu30Var3 = xu30Var2;
                    Object obj3 = qim0Var2;
                    Object obj4 = cs91Var;
                    switch (b3) {
                        case 0:
                            ((Integer) obj2).getClass();
                            anm1.a((Function0) obj4, (i3u) obj3, (j2i) xu30Var3, (b0k) obj, czo1.p(i7 | 1), i2);
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            dm5.a((iu30) obj4, (qim0) obj3, (iu30) xu30Var3, (b0k) obj, czo1.p(i7 | 1), i2);
                            break;
                        case 2:
                            ((Integer) obj2).getClass();
                            w2g0.c((qim0) obj4, (tl3) obj3, (j2i) xu30Var3, (b0k) obj, czo1.p(i7 | 1), i2);
                            break;
                        case 3:
                            ((Integer) obj2).getClass();
                            sok.k((bs91) obj4, (qim0) obj3, xu30Var3, (b0k) obj, czo1.p(i7 | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            sbl.u((cs91) obj4, (qim0) obj3, xu30Var3, (b0k) obj, czo1.p(i7 | 1), i2);
                            break;
                    }
                    return rih1Var;
                }
            };
        }
    }

    public static final void v(c380 c380Var, float f, float f2, float f3, float f4, float f5, float f6, qim0 qim0Var, vu30 vu30Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-589391841);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.d(16.0f) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.d(f3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.d(f4) ? 131072 : 65536) | (x340Var.d(8.0f) ? 1048576 : 524288) | (x340Var.d(f5) ? 8388608 : 4194304) | (x340Var.d(16.0f) ? 67108864 : 33554432) | (x340Var.d(f6) ? 536870912 : 268435456);
        int i3 = 384 | (x340Var.g(qim0Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            boolean z = ((i2 & 14) == 4 || x340Var.i(c380Var)) | ((1879048192 & i2) == 536870912) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 234881024) == 67108864);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                v6f1 v6f1Var = new v6f1(c380Var, vu30Var, f, f2, f3, f4, f5, f6, j2iVar);
                x340Var.s0(v6f1Var);
                objT = v6f1Var;
            }
            ejo1.l(i3 & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w6f1(c380Var, f, f2, f3, f4, f5, f6, qim0Var, vu30Var, j2iVar, i);
        }
    }

    public static final void w(int i, int i2, b0k b0kVar, qim0 qim0Var) throws Throwable {
        Object ha5Var;
        drr0 drr0Var;
        Throwable th;
        long jA;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(429670649);
        int i3 = (x340Var.i(qim0Var) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(1.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = p3d1.m(0L, x340Var);
            }
            frr0 frr0Var = (frr0) objT2;
            boolean zI = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | x340Var.i(frr0Var) | x340Var.i(drr0Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                drr0Var = drr0Var2;
                ha5Var = new ha5(frr0Var, drr0Var, i, (lnm) null, (byte) 5);
                x340Var.s0(ha5Var);
            } else {
                ha5Var = objT3;
                drr0Var = drr0Var2;
            }
            qxd0.t(rih1.a, x340Var, (vu30) ha5Var);
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(50.0f);
            float fO = yoi1.o(drr0Var.s() * 3.0f, 0.0f, 3.0f);
            if (fO < 1.0f) {
                jA = z4p1.A(fO, yah.d, yah.e);
                th = null;
            } else if (fO < 2.0f) {
                th = null;
                jA = z4p1.A(fO - 1.0f, yah.e, yah.c);
            } else {
                th = null;
                if (fO < 3.0f) {
                    jA = z4p1.A(fO - 2.0f, yah.c, yah.b);
                } else {
                    jA = yah.b;
                }
            }
            qim0 qim0VarH = u291.h(qim0Var, 10.0f);
            boolean zI2 = x340Var.i(drr0Var) | x340Var.f(jA) | x340Var.d(fX0);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                j = jA;
                objT4 = new of0(j, fX0, (ven0) drr0Var, (byte) 2);
                x340Var.s0(objT4);
            } else {
                j = jA;
            }
            qim0 qim0VarS = exd0.s(qim0VarH, (iu30) objT4);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            tto1.d(drr0Var.s(), 0, 8, j, 0L, x340Var, i541.D(h2c.a.b(nim0.a), -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048574));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, i2);
        }
    }

    public static l0l x(zv31 zv31Var, g0l g0lVar) {
        Object next;
        Iterator it = ((inr) g0lVar).i().iterator();
        while (it.hasNext()) {
            next = it.next();
            l0l l0lVar = (l0l) next;
            if (u890.j(l0lVar.d(), zv31Var.a) || zv31Var.g.contains(l0lVar.d())) {
                return (l0l) next;
            }
        }
        next = null;
        return (l0l) next;
    }

    public static final boolean y(abu abuVar) {
        xau xauVar = abuVar instanceof xau ? (xau) abuVar : null;
        return u890.j(xauVar != null ? xauVar.a : null, "wrapped");
    }

    public static final e7m0 z(Object obj, Update update, Connectable connectable, vu30 vu30Var, iu30 iu30Var) {
        return A(new sa5(obj, (byte) 1), update, connectable, vu30Var, iu30Var);
    }
}
