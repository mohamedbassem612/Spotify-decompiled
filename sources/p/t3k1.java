package p;

import android.content.res.Resources;
import android.graphics.PathMeasure;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.libs.sociallistening.events.proto.SocialConnectSessionJoinResult;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.signup.signup.v2.proto.Error;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class t3k1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object B(d0r d0rVar, dc31 dc31Var, ewn0 ewn0Var, vi11 vi11Var, ptf1 ptf1Var, u3k1 u3k1Var, onm onmVar) throws Throwable {
        q3k1 q3k1Var;
        y3k1 m231Var;
        if (onmVar instanceof q3k1) {
            q3k1Var = (q3k1) onmVar;
            int i = q3k1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q3k1Var.b = i - Integer.MIN_VALUE;
            } else {
                q3k1Var = new q3k1(onmVar);
            }
        } else {
            q3k1Var = new q3k1(onmVar);
        }
        Object objS = q3k1Var.a;
        int i2 = q3k1Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                r3k1 r3k1Var = new r3k1(u3k1Var, d0rVar, dc31Var, ewn0Var, vi11Var, ptf1Var, null);
                q3k1Var.b = 1;
                objS = smo1.s(r3k1Var, q3k1Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objS);
            }
            m231Var = (y3k1) objS;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
            return e331.a(m231Var) == null ? m231Var : v3k1.a;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F(d0r d0rVar, o3r o3rVar, k3k1 k3k1Var, onm onmVar) {
        s3k1 s3k1Var;
        if (onmVar instanceof s3k1) {
            s3k1Var = (s3k1) onmVar;
            int i = s3k1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3k1Var.b = i - Integer.MIN_VALUE;
            } else {
                s3k1Var = new s3k1(onmVar);
            }
        } else {
            s3k1Var = new s3k1(onmVar);
        }
        Object objJ = s3k1Var.a;
        int i2 = s3k1Var.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, k3k1Var);
            q1c1 q1c1Var = new q1c1(2, lnmVar, (byte) 27);
            s3k1Var.b = 1;
            objJ = b5p1.j(ay8VarF, q1c1Var, s3k1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (u890.j(i1rVar, j1r.a) || (i1rVar instanceof h1r)) {
            return null;
        }
        if (i1rVar instanceof i1r) {
            return i1rVar.a;
        }
        eg.o();
        return null;
    }

    public static final kpg0 H(xpw xpwVar, iu30 iu30Var) {
        return new kpg0(xpwVar, iu30Var);
    }

    public static qim0 K(qim0 qim0Var, float f, jsg jsgVar, int i) {
        if ((i & 2) != 0) {
            jsgVar = new jsg(0.0f, 1.0f);
        }
        return s161.b(qim0Var, true, new dix0(f, jsgVar, 0));
    }

    public static final long O(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final void a(bbr0 bbr0Var, eq80 eq80Var, m1g0 m1g0Var, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(918760416);
        int i2 = (x340Var.i(bbr0Var) ? 4 : 2) | i | (x340Var.g(eq80Var) ? 32 : 16) | (x340Var.g(m1g0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ViewGroup viewGroup = (ViewGroup) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zG = x340Var.g(viewGroup);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new r1g0(viewGroup);
                x340Var.s0(objT);
            }
            r1g0 r1g0Var = (r1g0) objT;
            r1g0Var.a(x340Var, 0);
            boolean zG2 = x340Var.g(bbr0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = new n1g0(r1g0Var, bbr0Var, eq80Var);
                x340Var.s0(objT2);
            }
            n1g0 n1g0Var = (n1g0) objT2;
            boolean zG3 = x340Var.g(n1g0Var) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == obj) {
                objT3 = new u1g0(n1g0Var, m1g0Var);
                x340Var.s0(objT3);
            }
            j(n1g0Var, apo.r(-795319904, new s1g0((u1g0) objT3), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(bbr0Var, eq80Var, m1g0Var, i, (byte) 21);
        }
    }

    public static final void b(bin0 bin0Var, iu30 iu30Var, poj0 poj0Var, d0r d0rVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object obj = fkj0.X;
        sjq0 sjq0Var = (sjq0) poj0Var.b;
        d2q d2qVar = (d2q) poj0Var.d;
        rtp rtpVar = (rtp) poj0Var.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(516025736);
        int i2 = (i & 6) == 0 ? (b0kVar3.i(bin0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(poj0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(d0rVar) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            if (objT == obj) {
                objT = new y8l0();
                b0kVar3.s0(objT);
            }
            y8l0 y8l0Var = (y8l0) objT;
            boolean zG = b0kVar3.g(y8l0Var);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                objT2 = new h3h1(new xkm0(y8l0Var, (byte) 19));
                b0kVar3.s0(objT2);
            }
            h3h1 h3h1Var = (h3h1) objT2;
            List list = bin0Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Set set = s4b1.f;
                if (uic.x(((gin0) obj2).b).c == blc0.ti) {
                    arrayList.add(obj2);
                }
            }
            List list2 = bin0Var.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                Set set2 = s4b1.f;
                if (uic.x(((gin0) obj3).b).c == blc0.ti) {
                    arrayList2.add(obj3);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            shn0 shn0Var = shn0.a;
            shn0 shn0Var2 = !zIsEmpty ? shn0Var : null;
            boolean zIsEmpty2 = arrayList2.isEmpty();
            shn0 shn0Var3 = shn0.b;
            c9 c9VarF = mqo1.F(f46.i0(new shn0[]{shn0Var2, !zIsEmpty2 ? shn0Var3 : null}));
            shn0 shn0Var4 = bin0Var.d;
            if (shn0Var4 == null || !c9VarF.contains(shn0Var4)) {
                shn0Var4 = null;
            }
            ArrayList arrayList3 = z6x.a;
            if (shn0Var4 == shn0Var3) {
                arrayList = arrayList3;
            }
            if (shn0Var4 == shn0Var) {
                arrayList2 = arrayList3;
            }
            jd21 jd21Var = new jd21(arrayList, arrayList2, c9VarF, shn0Var4);
            b0kVar3.f0(1979510688, shn0Var4);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            b0kVar3.r(false);
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            boolean zG2 = b0kVar3.g(rtpVar);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == obj) {
                abh0 abh0Var = new abh0(ven0VarS, (byte) 20);
                rtpVar.getClass();
                objT3 = new yhn0(abh0Var);
                b0kVar3.s0(objT3);
            }
            yhn0 yhn0Var = (yhn0) objT3;
            boolean zG3 = b0kVar3.g(d0rVar) | b0kVar3.g(d2qVar);
            Object objT4 = b0kVar3.T();
            if (zG3 || objT4 == obj) {
                objT4 = new xzq(d2qVar.a(igu.a, d0rVar), sbn0.O0);
                b0kVar3.s0(objT4);
            }
            tyq tyqVar = (tyq) objT4;
            boolean zG4 = b0kVar3.g(d0rVar) | b0kVar3.g(sjq0Var) | b0kVar3.g(tyqVar);
            Object objT5 = b0kVar3.T();
            if (zG4 || objT5 == obj) {
                objT5 = sjq0Var.r0(d0rVar, new j2i(1426839168, new mbj0(tyqVar, (byte) 28), true));
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(694092079, new e1c(jd21Var, yhn0Var, xtb0VarA, h3h1Var, bin0Var, d0rVar, poj0Var, iu30Var, (eyr0) objT5), b0kVar3), b0kVar2, 24576, 15);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(bin0Var, iu30Var, poj0Var, d0rVar, i, (byte) 11);
        }
    }

    public static final vw4 g() {
        return new vw4(new PathMeasure());
    }

    public static final void h(gin0 gin0Var, boolean z, d0r d0rVar, poj0 poj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qtp qtpVar = (qtp) poj0Var.c;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1775526494);
        int i2 = i | (x340Var.i(gin0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(d0rVar) ? 256 : 128) | (x340Var.i(poj0Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS2 = v8r.s(Boolean.valueOf(z), x340Var);
            String str = gin0Var.a;
            sjq0 sjq0Var = (sjq0) poj0Var.b;
            boolean zG = x340Var.g(str) | x340Var.g(qtpVar);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                j9n0 j9n0Var = new j9n0(ven0VarS, gin0Var, (byte) 4);
                qtpVar.getClass();
                objT = new xfd(j9n0Var);
                x340Var.s0(objT);
            }
            xfd xfdVar = (xfd) objT;
            boolean zG2 = x340Var.g(d0rVar) | x340Var.g(sjq0Var) | x340Var.g(xfdVar);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = sjq0Var.r0(d0rVar, new j2i(770046700, new ukm0(xfdVar, ven0VarS2, (byte) 5), true));
                x340Var.s0(objT2);
            }
            vxr0 vxr0Var = new vxr0(20, gin0Var.b, (String) null, false, false);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c((eyr0) objT2, vxr0Var, uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14), (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0((Object) gin0Var, z, (Object) d0rVar, (Object) poj0Var, (Object) iu30Var, i, (byte) 2);
        }
    }

    public static final void j(n1g0 n1g0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-228662482);
        int i2 = (x340Var.g(n1g0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zG = x340Var.g(n1g0Var.c);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new bsc0(n1g0Var, view, (byte) 25);
                x340Var.s0(objT);
            }
            nyx.a(2, (wux) null, apo.r(-1132662597, new qae0(n1g0Var, (Function0) objT, j2iVar, (byte) 22), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(n1g0Var, j2iVar, i, (byte) 2);
        }
    }

    public static final void k(String str, mr10 mr10Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1150255828);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(mr10Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024) | (x340Var2.i(function2) ? 16384 : 8192) | (x340Var2.i(qim0Var) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new tpj1(function0, (byte) 24);
                x340Var2.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = u5l1.a1;
                x340Var2.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            foo1.c(gbxVar, new hdx(0, (vu30) null, vu30Var, (vu30) null, er31.b(8.0f), 11), (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ksj.a, x340Var2, 0, 48, 2012);
            op71.g(x340Var2, u291.v(nim0.a, 8.0f));
            otw.c(mr10Var, new fr10(str, (String) null, true, Mode.PROMPTABLE_SECTION, (String) null, false, Error.INVALID_COUNTRY_FIELD_NUMBER), (qim0) null, (ipb1) null, x340Var2, (i2 >> 3) & 14, 12);
            boolean z2 = (i2 & 7168) == 2048;
            Object objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new tpj1(function1, (byte) 25);
                x340Var2.s0(objT3);
            }
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT3);
            ldx ldxVar = ldx.c;
            foo1.c(gbxVar2, ldxVar, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ksj.b, x340Var2, 0, 48, 2012);
            boolean z3 = (i2 & 57344) == 16384;
            Object objT4 = x340Var2.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new tpj1(function2, (byte) 26);
                x340Var2.s0(objT4);
            }
            foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ksj.c, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0((Object) str, (Object) mr10Var, function0, function1, function2, qim0Var, i, (byte) 24);
        }
    }

    public static final iy91 l(y4a1 y4a1Var) {
        String str;
        String str2;
        iy91 iy91VarO = SocialConnectSessionJoinResult.o();
        iy91VarO.u("spotify:socialsession:" + y4a1Var.b());
        iy91VarO.t(y4a1Var.a().a);
        iy91VarO.s(y4a1Var.e());
        int iC = l1d.C(y4a1Var.d());
        if (iC == 0) {
            str = "in-person";
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            str = "remote";
        }
        iy91VarO.v(str);
        Set setC = y4a1Var.c();
        ArrayList arrayList = new ArrayList(q7h.U(setC, 10));
        Iterator it = setC.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ko90) it.next()).ordinal();
            if (iOrdinal == 0) {
                str2 = "broadcast";
            } else if (iOrdinal == 1) {
                str2 = "frictionless";
            } else if (iOrdinal == 2) {
                str2 = "bluetooth";
            } else if (iOrdinal == 3) {
                str2 = "user";
            } else {
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                str2 = "listening_activity";
            }
            arrayList.add(str2);
        }
        iy91VarO.n(arrayList);
        iy91VarO.w(y4a1Var.f());
        return iy91VarO;
    }

    public static final Observable n(pta1 pta1Var) {
        return Observable.combineLatest(pta1Var.b(), pta1Var.a(), m9x0.Q0);
    }

    public static final String r(Resources resources, spw spwVar) {
        long j = spwVar.c;
        String quantityString = resources.getQuantityString(2131820573, (int) j, Long.valueOf(j));
        long j2 = spwVar.b;
        return j2 > 0 ? xcg1.i(resources.getQuantityString(2131820572, (int) j2, Long.valueOf(j2)), " ", quantityString) : quantityString;
    }

    public static final Object s(afh0 afh0Var) {
        Object objG = afh0Var.g();
        mlb0 mlb0Var = objG instanceof mlb0 ? (mlb0) objG : null;
        if (mlb0Var != null) {
            return mlb0Var.A0();
        }
        return null;
    }

    public static final qim0 t(v850 v850Var) {
        return zr7.i(nim0.a, new mp20(v850Var, (byte) 21));
    }

    public static final qim0 x(qim0 qim0Var, Object obj) {
        return qim0Var.then(new klb0(obj));
    }
}
