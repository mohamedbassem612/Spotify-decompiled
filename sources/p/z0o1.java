package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.google.protobuf.Timestamp;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficConnectionMetrics;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficRequestInfo;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficTransactionMetrics;
import com.spotify.remoteconfig.commons.nebula.Attribute;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import com.spotify.useraccount.v1.AccountAttribute;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class z0o1 {
    public static final nma0[] a = new nma0[0];
    public static b180 b;

    public static final void a(xim ximVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1735083578);
        int i2 = (x340Var.i(ximVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c(ximVar.a, rih1.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h1m(ximVar, i, (byte) 10);
        }
    }

    public static final void b(jkr0 jkr0Var, qim0 qim0Var, float f, float f2, long j, long j2, b0k b0kVar, int i) {
        int i2;
        long j3;
        long j4;
        int i3;
        long j5;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1690318810);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(jkr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(6.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var.d(4.0f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var.f(j2) ? 8388608 : 4194304;
        }
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                j4 = cbx.a(x340Var).b.a;
                i3 = i2 & (-3670017);
            } else {
                x340Var.b0();
                i3 = i2 & (-3670017);
                j4 = j;
            }
            x340Var.s();
            qim0 qim0VarR = i1p1.r(u291.h(u291.v(qim0Var, ((6.0f + f) * (Math.min(jkr0Var.l(), 4) - 1)) + f2), 6.0f));
            boolean zI = ((((57344 & i3) ^ 24576) > 16384 && x340Var.d(f2)) || (i3 & 24576) == 16384) | ((((i3 & 7168) ^ 3072) > 2048 && x340Var.d(6.0f)) || (i3 & 3072) == 2048) | ((((i3 & 896) ^ 384) > 256 && x340Var.d(f)) || (i3 & 384) == 256) | x340Var.i(jkr0Var) | ((((458752 & i3) ^ 196608) > 131072 && x340Var.d(4.0f)) || (i3 & 196608) == 131072) | x340Var.f(j4);
            if ((((29360128 & i3) ^ 12582912) <= 8388608 || !x340Var.f(j2)) && (i3 & 12582912) != 8388608) {
                z = false;
            }
            boolean z2 = zI | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                j5 = j4;
                i4 = 0;
                i8i0 i8i0Var = new i8i0(f2, f, jkr0Var, j5, j2, (byte) 2);
                x340Var.s0(i8i0Var);
                objT = i8i0Var;
            } else {
                j5 = j4;
                i4 = 0;
            }
            j0o1.b(i4, x340Var, (iu30) objT, qim0VarR);
            j3 = j5;
        } else {
            x340Var.b0();
            j3 = j;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ljr0(jkr0Var, qim0Var, f, f2, j3, j2, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(iu30 iu30Var, u211 u211Var, int i, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(300859723);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.i(iu30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.e(l1d.C(2)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.g(u211Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.e(i) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (b0kVar3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = ((i4 & 14) == 4) | ((i4 & 896) == 256);
            int i5 = i4 & 7168;
            boolean z2 = z | (i5 == 2048);
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new wv1(iu30Var, u211Var, i, (byte) 23);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            pex pexVar = pex.b;
            lex lexVarW = w(b0kVar3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(qim0Var3, (fra) null, 3);
            boolean z3 = i5 == 2048;
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new sl11(i, (byte) 6);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, pexVar, lexVarW, s161.b(qim0VarZ, false, (iu30) objT2), 0, (String) null, (max) null, bfj.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(2130725904, new u841(u211Var, (byte) 6), b0kVar3), b0kVar2, 12582912, 3072, 8048);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(iu30Var, u211Var, i, qim0Var2, i2, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(v3h1 v3h1Var, qxl qxlVar, dp5 dp5Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        v3h1 v3h1Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(209755415);
        int i2 = i | (x340Var.i(v3h1Var) ? 4 : 2) | (x340Var.g(qxlVar) ? 32 : 16) | (x340Var.i(dp5Var) ? 256 : 128) | (x340Var.g((Object) null) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            x340Var.f0(-288501729, rc11.a.b(qxlVar.getClass()));
            int i3 = i2 & 14;
            Object[] objArr = new Object[0];
            df41 df41Var = x3h1.a;
            boolean zI = x340Var.i(dp5Var) | x340Var.i(v3h1Var);
            Object objT = x340Var.T();
            byte b2 = 28;
            if (zI || objT == m4cVar) {
                objT = new x0e1(dp5Var, v3h1Var, b2);
                x340Var.s0(objT);
            }
            e4h1 e4h1Var = (e4h1) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 0);
            x340Var.r(false);
            d4h1 d4h1Var = v3h1Var instanceof d4h1 ? (d4h1) v3h1Var : null;
            if (d4h1Var == null || (v3h1Var2 = d4h1Var.b) == null) {
                v3h1Var2 = v3h1Var;
            }
            boolean zG = x340Var.g(v3h1Var2) | x340Var.e(v3h1Var.g()) | x340Var.e(v3h1Var.a());
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = yv91.a(new vjh(v3h1Var, (byte) 28));
                x340Var.s0(objT2);
            }
            utl utlVar = (utl) ((tob1) objT2).getValue();
            if (!(qxlVar instanceof qxl)) {
                throw p3d1.k(x340Var, -288496031, false);
            }
            x340Var.i0(-353416854);
            x340Var.i0(-288494607);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zG2 = x340Var.g(xtb0VarA);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new wxl(xtb0VarA);
                x340Var.s0(objT3);
            }
            wxl wxlVar = (wxl) objT3;
            x340Var.r(false);
            xtb0 xtb0Var = wxlVar.a;
            boolean zG3 = x340Var.g(wxlVar) | x340Var.i(v3h1Var) | x340Var.g(e4h1Var) | x340Var.i(dp5Var);
            Object objT4 = x340Var.T();
            if (zG3 || objT4 == m4cVar) {
                objT4 = new j4f1(wxlVar, v3h1Var, e4h1Var, dp5Var);
                x340Var.s0(objT4);
            }
            qxd0.S((Function0) objT4, x340Var);
            boolean zG4 = x340Var.g(wxlVar);
            Object objT5 = x340Var.T();
            if (zG4 || objT5 == m4cVar) {
                objT5 = new ymg1(wxlVar, (byte) 10);
                x340Var.s0(objT5);
            }
            qxd0.i(wxlVar, (iu30) objT5, x340Var);
            x3h1.a(v3h1Var, xtb0Var, e4h1Var, dp5Var, wxlVar, x340Var, ((i2 << 3) & 7168) | i3);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            vzq0 vzq0Var = qxlVar.a;
            g36 g36Var = qxlVar.b;
            boolean zI2 = x340Var.i(v3h1Var) | x340Var.i(utlVar);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new rzf1(v3h1Var, utlVar, (byte) 9);
                x340Var.s0(objT6);
            }
            ujo1.d(qim0VarD, xtb0Var, vzq0Var, false, g36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT6, x340Var, 6, 488);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1(v3h1Var, qxlVar, dp5Var, i, (byte) 4);
        }
    }

    public static final EsTrafficConnectionMetrics.ConnectionMetrics e(j4g1 j4g1Var) {
        csz cszVar;
        osz oszVar;
        esz eszVarU = EsTrafficConnectionMetrics.ConnectionMetrics.u();
        eszVarU.s(j4g1Var.a / 1000.0d);
        Integer num = j4g1Var.b;
        if (num != null) {
            eszVarU.t(num.intValue());
        }
        eszVarU.r(j4g1Var.c);
        eszVarU.q(j4g1Var.d);
        List<s7g1> list = j4g1Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (s7g1 s7g1Var : list) {
            usz uszVarM = EsTrafficTransactionMetrics.TransactionMetrics.M();
            uszVarM.s(s7g1Var.a);
            uszVarM.q(s7g1Var.b);
            uszVarM.r(s7g1Var.c);
            String str = s7g1Var.d;
            if (str != null) {
                uszVarM.B(str);
            }
            Integer num2 = s7g1Var.e;
            if (num2 != null) {
                uszVarM.E(num2.intValue());
            }
            String str2 = s7g1Var.f;
            if (str2 != null) {
                uszVarM.y(str2);
            }
            Long l = s7g1Var.g;
            if (l != null) {
                uszVarM.u(l.longValue());
            }
            Long l2 = s7g1Var.h;
            if (l2 != null) {
                uszVarM.t(l2.longValue());
            }
            Long l3 = s7g1Var.i;
            if (l3 != null) {
                uszVarM.A(l3.longValue());
            }
            Long l4 = s7g1Var.j;
            if (l4 != null) {
                uszVarM.z(l4.longValue());
            }
            Long l5 = s7g1Var.k;
            if (l5 != null) {
                uszVarM.D(l5.longValue());
            }
            Long l6 = s7g1Var.l;
            if (l6 != null) {
                uszVarM.C(l6.longValue());
            }
            int iOrdinal = s7g1Var.m.ordinal();
            if (iOrdinal == 0) {
                cszVar = csz.c;
            } else if (iOrdinal == 1) {
                cszVar = csz.b;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                cszVar = csz.d;
            }
            uszVarM.n(cszVar);
            uszVarM.w(s7g1Var.n);
            uszVarM.x(s7g1Var.o);
            int iC = l1d.C(s7g1Var.p);
            if (iC == 0) {
                oszVar = osz.b;
            } else if (iC == 1) {
                oszVar = osz.c;
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                oszVar = osz.d;
            }
            uszVarM.v(oszVar);
            arrayList.add(uszVarM.build());
        }
        eszVarU.n(arrayList);
        return eszVarU.build();
    }

    public static final EsTrafficRequestInfo.RequestInfo f(ep21 ep21Var) {
        psz pszVar;
        rsz rszVarV = EsTrafficRequestInfo.RequestInfo.v();
        switch (l1d.C(ep21Var.a)) {
            case 0:
                pszVar = psz.c;
                break;
            case 1:
                pszVar = psz.d;
                break;
            case 2:
                pszVar = psz.e;
                break;
            case 3:
                pszVar = psz.f;
                break;
            case 4:
                pszVar = psz.g;
                break;
            case 5:
                pszVar = psz.h;
                break;
            case 6:
                pszVar = psz.i;
                break;
            case 7:
                pszVar = psz.t;
                break;
            case 8:
                pszVar = psz.X;
                break;
            default:
                eg.o();
                return null;
        }
        rszVarV.t(pszVar);
        rszVarV.v(ep21Var.b);
        rszVarV.r(ep21Var.c);
        rszVarV.s(ep21Var.d);
        String strN = rszVarV.n();
        if (strN != null) {
            rszVarV.u(strN);
        }
        rszVarV.q(ep21Var.f);
        return rszVarV.build();
    }

    public static final gia g(csz cszVar) {
        int iOrdinal = cszVar.ordinal();
        if (iOrdinal == 0) {
            return gia.b;
        }
        if (iOrdinal == 1) {
            return gia.a;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return gia.c;
        }
        eg.o();
        return null;
    }

    public static final ep21 h(EsTrafficRequestInfo.RequestInfo requestInfo) {
        int i;
        switch (requestInfo.r().ordinal()) {
            case 0:
            case 10:
                eg.m("Invalid HTTP Method provided.");
                return null;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            default:
                eg.o();
                return null;
        }
        int i2 = i;
        String url = requestInfo.getUrl();
        Map mapQ = requestInfo.q();
        long jO = requestInfo.o();
        String strS = requestInfo.s();
        return new ep21(i2, url, mapQ, jO, strS.length() == 0 ? null : strS, requestInfo.n());
    }

    public static final j4g1 i(EsTrafficConnectionMetrics.ConnectionMetrics connectionMetrics) {
        int i;
        h290<EsTrafficTransactionMetrics.TransactionMetrics> h290VarT = connectionMetrics.t();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarT, 10));
        for (EsTrafficTransactionMetrics.TransactionMetrics transactionMetrics : h290VarT) {
            transactionMetrics.getClass();
            long jQ = transactionMetrics.q();
            long jO = transactionMetrics.o();
            long jP = transactionMetrics.p();
            String strZ = transactionMetrics.I() ? transactionMetrics.z() : null;
            Integer numValueOf = transactionMetrics.L() ? Integer.valueOf(transactionMetrics.C()) : null;
            String strW = transactionMetrics.F() ? transactionMetrics.w() : null;
            Long lValueOf = transactionMetrics.E() ? Long.valueOf(transactionMetrics.s()) : null;
            Long lValueOf2 = transactionMetrics.D() ? Long.valueOf(transactionMetrics.r()) : null;
            Long lValueOf3 = transactionMetrics.H() ? Long.valueOf(transactionMetrics.y()) : null;
            Long lValueOf4 = transactionMetrics.G() ? Long.valueOf(transactionMetrics.x()) : null;
            Long lValueOf5 = transactionMetrics.K() ? Long.valueOf(transactionMetrics.B()) : null;
            Long lValueOf6 = transactionMetrics.J() ? Long.valueOf(transactionMetrics.A()) : null;
            gia giaVarG = g(transactionMetrics.n());
            boolean zU = transactionMetrics.u();
            boolean zV = transactionMetrics.v();
            int iOrdinal = transactionMetrics.t().ordinal();
            if (iOrdinal == 0) {
                i = 1;
            } else if (iOrdinal == 1) {
                i = 2;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                i = 1;
            } else {
                i = 3;
            }
            arrayList.add(new s7g1(jQ, jO, jP, strZ, numValueOf, strW, lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, giaVarG, zU, zV, i));
        }
        return new j4g1(connectionMetrics.r() * 1000.0d, Integer.valueOf(connectionMetrics.s()), connectionMetrics.p(), connectionMetrics.o(), arrayList);
    }

    public static js20 j(iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 8) != 0) {
            iu30Var2 = cgb1.N0;
        }
        return d1o1.o(iu30Var, vu30Var, bhh1Var, iu30Var2);
    }

    public static js20 k(zob1 zob1Var, vu30 vu30Var, iu30 iu30Var, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 8) != 0) {
            iu30Var = cgb1.O0;
        }
        qtr qtrVar = new qtr();
        iu30Var.invoke(qtrVar);
        return new js20(new z5d(zob1Var, (byte) 7), new ccb1((Object) vu30Var, (Object) zob1Var, (byte) 7), vu30Var, qtrVar, false, bhh1Var, true);
    }

    public static final Object l(ef40 ef40Var, hf40 hf40Var) {
        if (ef40Var.j(hf40Var)) {
            return ef40Var.i(hf40Var);
        }
        return null;
    }

    public static final Object m(ef40 ef40Var, hf40 hf40Var, int i) {
        ef40Var.m(hf40Var);
        m220 m220Var = ef40Var.a;
        ff40 ff40Var = hf40Var.d;
        m220Var.getClass();
        ig91 ig91Var = m220Var.a;
        if (!ff40Var.c) {
            hhg1.n("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = ig91Var.get(ff40Var);
        if (i < (obj == null ? 0 : ((List) obj).size())) {
            ef40Var.m(hf40Var);
            if (ff40Var.c) {
                Object obj2 = ig91Var.get(ff40Var);
                if (obj2 != null) {
                    return hf40Var.a(((List) obj2).get(i));
                }
                tw20.p();
                return null;
            }
            hhg1.n("getRepeatedField() can only be called on repeated fields.");
        }
        return null;
    }

    public static final float n(jkr0 jkr0Var) {
        return ((drr0) jkr0Var.d.d).s() + ((err0) jkr0Var.d.c).s();
    }

    public static final mmr0 o(jkr0 jkr0Var) {
        Float fValueOf = Float.valueOf(0.0f);
        if (jkr0Var.l() <= 4) {
            return new mmr0(fValueOf, Float.valueOf(jkr0Var.l() - 1.0f));
        }
        float fN = n(jkr0Var) - 1.0f;
        if (fN < 0.0f) {
            return new mmr0(fValueOf, Float.valueOf(3.0f));
        }
        float fL = jkr0Var.l() - 4;
        if (fN > fL) {
            fN = fL;
        }
        return new mmr0(Float.valueOf(fN), Float.valueOf((fN + 4.0f) - 1.0f));
    }

    public static final zfo0 p(GetAttributesResponse getAttributesResponse) {
        int iP;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : getAttributesResponse.n().entrySet()) {
            String str = (String) entry.getKey();
            Attribute attribute = (Attribute) entry.getValue();
            pk pkVarR = AccountAttribute.r();
            int iQ = attribute.q();
            int i = iQ == 0 ? -1 : f5o0.a[l1d.C(iQ)];
            if (i != -1) {
                if (i == 1) {
                    pkVarR.n(attribute.getBoolValue());
                } else if (i == 2) {
                    pkVarR.q(attribute.o());
                } else if (i == 3) {
                    pkVarR.r(attribute.getStringValue());
                } else if (i == 4) {
                    Timestamp timestampP = attribute.p();
                    long jQ = timestampP.q();
                    if (-62135596800L > jQ || jQ >= 253402300800L || (iP = timestampP.p()) < 0 || iP >= 1000000000) {
                        str.getClass();
                        arrayList.add(str);
                    } else {
                        pkVarR.r(Instant.ofEpochSecond(timestampP.q(), timestampP.p()).toString());
                    }
                } else if (i != 5) {
                    eg.o();
                    return null;
                }
                linkedHashMap.put(str, pkVarR.build());
            }
        }
        return new zfo0(linkedHashMap, o7h.Z0(arrayList));
    }

    public static boolean q(ozo ozoVar) {
        return ((Boolean) ozoVar.n.get()).booleanValue();
    }

    public static boolean r(ozo ozoVar) {
        return ((Boolean) ozoVar.m.get()).booleanValue();
    }

    public static String s(String str, Map map) {
        Object next;
        Object next2;
        Object next3;
        String strK = d1o1.k(str);
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!d1o1.k((String) ((Map.Entry) next).getKey()).equals(strK));
        Map.Entry entry = (Map.Entry) next;
        String str2 = entry != null ? (String) entry.getValue() : null;
        if (str2 != null) {
            return str2;
        }
        String strK2 = d1o1.k(ihc1.Y0(strK, '-'));
        Iterator it2 = map.entrySet().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!d1o1.k((String) ((Map.Entry) next2).getKey()).equals(strK2));
        Map.Entry entry2 = (Map.Entry) next2;
        String str3 = entry2 != null ? (String) entry2.getValue() : null;
        if (str3 != null) {
            return str3;
        }
        Iterator it3 = o7h.a1(map.entrySet(), new p0d((byte) 2)).iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!nhc1.Y(d1o1.k((String) ((Map.Entry) next3).getKey()), strK2.concat("-"), false));
        Map.Entry entry3 = (Map.Entry) next3;
        if (entry3 != null) {
            return (String) entry3.getValue();
        }
        return null;
    }

    public static final float t(jkr0 jkr0Var, int i, float f, float f2) {
        Float fValueOf = Float.valueOf(0.0f);
        int iL = jkr0Var.l();
        Float[] fArr = new Float[iL];
        for (int i2 = 0; i2 < iL; i2++) {
            fArr[i2] = Float.valueOf(1.0f);
        }
        if (jkr0Var.l() >= 4) {
            mmr0 mmr0VarO = o(jkr0Var);
            float fFloatValue = ((Number) mmr0VarO.a).floatValue();
            float fFloatValue2 = ((Number) mmr0VarO.b).floatValue();
            double d = fFloatValue;
            int iCeil = (int) Math.ceil(d);
            int iFloor = (int) Math.floor(d);
            for (int i3 = 0; i3 < iFloor; i3++) {
                fArr[i3] = fValueOf;
            }
            if (iCeil != iFloor) {
                float f3 = fFloatValue - iFloor;
                if (iFloor > 0 || iCeil > 0) {
                    float f4 = 1.0f - f3;
                    fArr[iFloor] = Float.valueOf(f4);
                    fArr[iCeil] = Float.valueOf(f4);
                }
            } else if (iCeil > 0) {
                fArr[iCeil] = fValueOf;
            }
            double d2 = fFloatValue2;
            int iFloor2 = (int) Math.floor(d2);
            int iCeil2 = (int) Math.ceil(d2);
            int iL2 = jkr0Var.l();
            for (int i4 = iCeil2 + 1; i4 < iL2; i4++) {
                fArr[i4] = fValueOf;
            }
            if (iFloor2 != iCeil2) {
                float f5 = iCeil2 - fFloatValue2;
                if (iCeil2 < jkr0Var.l() - 1 || iFloor2 < jkr0Var.l() - 1) {
                    float f6 = 1.0f - f5;
                    fArr[iCeil2] = Float.valueOf(f6);
                    fArr[iFloor2] = Float.valueOf(f6);
                }
            } else if (iFloor2 < jkr0Var.l() - 1) {
                fArr[iFloor2] = fValueOf;
            }
        }
        float fFloatValue3 = fArr[i].floatValue();
        float fFloatValue4 = ((Number) o(jkr0Var).a).floatValue();
        float fFloatValue5 = ((Number) o(jkr0Var).b).floatValue();
        float f7 = i;
        if (fFloatValue4 > f7 || f7 > fFloatValue5) {
            return (i == 0 || i == jkr0Var.l() + (-1)) ? fFloatValue3 * f2 : fFloatValue3 * f;
        }
        return l1d.e(f2, f, fFloatValue3, f);
    }

    public static void u(Context context, Button button, j4b1 j4b1Var, String str) {
        button.setText(str);
        if (j4b1Var == null) {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        float fY = a8o.y(18.0f, context.getResources());
        g4b1 g4b1Var = new g4b1(context, j4b1Var, fY);
        g4b1Var.c(button.getTextColors());
        g4b1Var.d(fY);
        button.setCompoundDrawablesWithIntrinsicBounds((Drawable) g4b1Var, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final String v(List list) {
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return o7h.y0(list, ", ", "Skipped invalid timestamps: ", (String) null, (iu30) null, 60);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final lex w(b0k b0kVar) throws NoWhenBranchMatchedException {
        int iC = l1d.C(2);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(678513052);
            lex lexVarY = yoo1.y(x340Var);
            x340Var.r(false);
            return lexVarY;
        }
        if (iC != 1) {
            throw p3d1.k((x340) b0kVar, 678508685, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(678510907);
        lex lexVarZ = yoo1.z(x340Var2);
        x340Var2.r(false);
        return lexVarZ;
    }

    public static byte[] x(byte[]... bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int length = bArr[i2].length;
            if (i > Integer.MAX_VALUE - length) {
                k220.r("exceeded size limit");
                return null;
            }
            i += length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            byte[] bArr3 = bArr[i4];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }
}
