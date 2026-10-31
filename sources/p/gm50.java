package p;

import android.content.res.Configuration;
import android.graphics.Point;
import android.net.Uri;
import android.view.Display;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.Next;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class gm50 {
    public static final yla a = new yla((byte) 6);
    public static b180 b;
    public static b180 c;

    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    public static final qef1 A(oef1 oef1Var, List list, yqg yqgVar, boolean z) {
        ydf1 ydf1Var;
        xkk1 xkk1Var;
        mq70 mq70Var;
        mq70 mq70Var2;
        pp70 pp70Var;
        up70 up70VarA;
        ArrayList arrayList = oef1Var.d;
        List listD1 = o7h.d1(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(q7h.U(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            arrayList2.add(new sdf1("", oef1Var.c, (String) it.next(), oef1Var.b, 0L, aef1.a, (String) null));
        }
        pdf1 pdf1Var = new pdf1(oef1Var.a, arrayList2);
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            u7h u7hVar = null;
            if (!it2.hasNext()) {
                ArrayList arrayList4 = s110.o(pdf1Var, arrayList3, yqgVar).a;
                ArrayList arrayList5 = new ArrayList();
                int i2 = 0;
                for (Object obj : arrayList4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    cvt0 cvt0Var = ((rdf1) obj).c;
                    pef1 pef1Var = cvt0Var != null ? new pef1(i2, (String) arrayList.get(i2), cvt0Var) : null;
                    if (pef1Var != null) {
                        arrayList5.add(pef1Var);
                    }
                    i2 = i3;
                }
                if (arrayList.isEmpty()) {
                    xkk1Var = null;
                } else {
                    Object objS0 = o7h.s0(list);
                    i1r i1rVar = objS0 instanceof i1r ? (i1r) objS0 : null;
                    if (i1rVar == null || (ydf1Var = (ydf1) i1rVar.a) == null) {
                        xkk1Var = null;
                    } else {
                        xkk1Var = ydf1Var.b;
                    }
                }
                if (!z) {
                    mq70Var = null;
                } else if (xkk1Var == null || (mq70Var = xkk1Var.e) == null) {
                    if (xkk1Var != null) {
                        mq70Var = xkk1Var.a;
                    } else {
                        mq70Var = null;
                    }
                }
                String str = (mq70Var == null || (up70VarA = mq70Var.a(vp70.e)) == null) ? null : up70VarA.a.a;
                if (xkk1Var != null && (mq70Var2 = xkk1Var.a) != null && (pp70Var = mq70Var2.b) != null) {
                    u7hVar = new u7h(pp70Var.c.a.c);
                }
                u7h u7hVar2 = u7hVar;
                Collection collectionK = p7h.K(o7h.d1(arrayList, 3));
                if (!(collectionK instanceof Collection) || !collectionK.isEmpty()) {
                    lr80 it3 = collectionK.iterator();
                    while (((sr80) it3).c) {
                        k1r k1rVar = (k1r) o7h.t0(it3.nextInt(), list);
                        if (k1rVar == null || (k1rVar instanceof j1r)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                return new qef1(oef1Var, arrayList5, str, u7hVar2, z2);
            }
            Object next = it2.next();
            int i4 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList3.add(new mmr0((sdf1) next, o7h.t0(i, list)));
            i = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    public static Next B(kak0 kak0Var, w3k0 w3k0Var) {
        lhg1 lhg1Var;
        nig1 nig1Var = w3k0Var.e;
        lhg1 lhg1VarR = r(nig1Var.a, kak0Var, w3k0Var);
        lhg1 lhg1Var2 = nig1Var.f;
        lhg1 lhg1VarR2 = lhg1Var2 != null ? r(lhg1Var2, kak0Var, w3k0Var) : null;
        lhg1 lhg1Var3 = kak0Var.V0;
        if (u890.j(w3k0Var.a, kak0Var.T0)) {
            String str = w3k0Var.b;
            if (str == null) {
                str = "";
            }
            if (str.equals(kak0Var.U0)) {
                lhg1Var = lhg1Var3;
            } else {
                lhg1Var = null;
            }
        } else {
            lhg1Var = null;
        }
        Float f = nig1Var.b;
        int i = nig1Var.c;
        int i2 = w3k0Var.g;
        uia uiaVar = w3k0Var.f;
        Float f2 = w3k0Var.h;
        float f3 = (float) w3k0Var.c;
        boolean z = nig1Var.e;
        Boolean bool = nig1Var.g;
        Float fValueOf = Float.valueOf(f3);
        rcu0 rcu0Var = rcu0.a;
        xx8 xx8Var = xx8.a;
        z6x z6xVar = z6x.a;
        kak0 kak0VarA = kak0.a(kak0Var, (pdm0) null, (Boolean) null, rcu0Var, lhg1VarR, lhg1VarR, (lhg1) null, xx8Var, z6xVar, z6xVar, f, lhg1Var, (lhg1) null, lhg1VarR, (String) null, (String) null, (lhg1) null, j8w0.a, false, i, 0, i2, (giq0) null, (uia) null, uiaVar, (Float) null, f2, (Float) null, fValueOf, false, false, (String) null, z, lhg1VarR2, bool, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1103601601, 950443);
        k1k0 r0k0Var = new r0k0(lhg1VarR, w3k0Var.d, false, 0L, (String) null, 12);
        ruq0 ruq0Var = lhg1VarR.b;
        return Next.i(kak0VarA, f46.S0(new k1k0[]{r0k0Var, new m0k0(ruq0Var.c, ruq0Var.d, o2p1.o(kak0VarA))}));
    }

    public static final ka10 C(wcm wcmVar, Map map, bbz0 bbz0Var, boolean z, boolean z2) {
        return new ka10(wcm.a(wcmVar, (Function0) null, new nx2(wcmVar, n(map, bbz0Var, z, z2), (byte) 3), false, (String) null, 991), true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(a8o a8oVar, iu30 iu30Var, cfd cfdVar, ivo0 ivo0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1987837785);
        int i2 = i | (x340Var.g(a8oVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(cfdVar) ? 256 : SemanticState.Focused) | (x340Var.i(ivo0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.i0(666664175);
            if (a8oVar instanceof vgk) {
                x340Var.i0(646354131);
                olo0 olo0Var = ((vgk) a8oVar).d;
                boolean zI = x340Var.i(ivo0Var);
                int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
                boolean z = zI | (i3 == 32);
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new svb(ivo0Var, iu30Var, (byte) 0);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zI2 = x340Var.i(ivo0Var) | (i3 == 32);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new tvb(ivo0Var, iu30Var, (byte) 0);
                    x340Var.s0(objT2);
                }
                iu30 iu30Var2 = (iu30) objT2;
                boolean zI3 = x340Var.i(ivo0Var) | (i3 == 32);
                Object objT3 = x340Var.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new tvb(ivo0Var, iu30Var, (byte) 1);
                    x340Var.s0(objT3);
                }
                iu30 iu30Var3 = (iu30) objT3;
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = cu9.W0;
                    x340Var.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                boolean zI4 = (i3 == 32) | x340Var.i(ivo0Var);
                Object objT5 = x340Var.T();
                if (zI4 || objT5 == m4cVar) {
                    objT5 = new svb(ivo0Var, iu30Var, (byte) 1);
                    x340Var.s0(objT5);
                }
                ajo1.l(olo0Var, function0, iu30Var2, iu30Var3, function1, (Function0) objT5, x340Var, 221184);
                x340Var.r(false);
            } else {
                if (!(a8oVar instanceof ugk)) {
                    throw p3d1.k(x340Var, 646352345, false);
                }
                x340Var.i0(-1436806897);
                boolean z2 = ((i2 & 896) == 256) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                Object objT6 = x340Var.T();
                if (z2 || objT6 == m4cVar) {
                    objT6 = new ztb(iu30Var, cfdVar, (byte) 1);
                    x340Var.s0(objT6);
                }
                omo1.a(((ugk) a8oVar).d, (iu30) objT6, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(false);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m(a8oVar, iu30Var, cfdVar, ivo0Var, qim0Var2, i, (byte) 18);
        }
    }

    public static final void b(Function0 function0, phw0 phw0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2098266301);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.g(phw0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strN0 = cwl1.n0(2131960410, new Object[]{xcg1.i(z(x340Var, phw0Var.d), " ", phw0Var.a)}, x340Var);
            gdx gdxVarS = yla.s(x340Var);
            gbx gbxVar = new gbx(z50.c, function0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("preview_element_context_menu_test_tag", qim0Var3);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zqu0(strN0, (byte) 14);
                x340Var.s0(objT);
            }
            wro1.l(gbxVar, s161.b(qim0VarN, false, (iu30) objT), (max) null, gdxVarS, (idn0) null, s9j.a, x340Var, 196608, 20);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(function0, phw0Var, qim0Var2, i, (byte) 26);
        }
    }

    public static final void c(cc81 cc81Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        cr31 cr31VarB;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2052327521);
        int i2 = i | (b0kVar2.g(cc81Var) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            if (cc81Var.d) {
                b0kVar2.i0(-896753494);
                b0kVar2.r(false);
                cr31VarB = er31.a;
            } else {
                b0kVar2.i0(-896752777);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar2).f;
                cr31VarB = er31.b(4.0f);
                b0kVar2.r(false);
            }
            era eraVar = een.Q0;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
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
            int length = str.length();
            nim0 nim0Var = nim0.a;
            if (length > 0) {
                b0kVar2.i0(862749499);
                b0kVar2 = b0kVar2;
                cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070), (String) null, i1p1.q(u291.r(nim0Var, 110.0f), cr31VarB), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(862980325);
                t1c.a(dug.f(i1p1.q(u291.r(nim0Var, 110.0f), cr31VarB), cbx.a(b0kVar2).a.d, d4o1.a), b0kVar2, 0);
                b0kVar2.r(false);
            }
            b0k b0kVar3 = b0kVar2;
            uwo1.e(cc81Var.a, (qim0) null, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1714);
            uwo1.e(cc81Var.b, (qim0) null, cbx.d(b0kVar3).m, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar3, 0, 0, 1714);
            b0kVar2 = b0kVar3;
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(cc81Var, str, qim0Var, i, (byte) 13);
        }
    }

    public static final void d(ArrayList arrayList, Map map, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-643676503);
        int i2 = i | (x340Var.g(arrayList) ? 4 : 2) | (x340Var.g(map) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var, 0);
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
            x340Var.i0(-2076480843);
            for (cc81 cc81Var : o7h.d1(arrayList, 2)) {
                rv21 rv21Var = (rv21) map.get(cc81Var.c);
                String str = rv21Var != null ? rv21Var.c : null;
                if (str == null) {
                    str = "";
                }
                c(cc81Var, str, new wnb0(1.0f, true), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(arrayList, map, qim0Var2, i, (byte) 14);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z2;
        hax haxVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(76267562);
        int i2 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | 384;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), ((vex) zex.a.e).i, d4o1.a);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            uwo1.e(cwl1.o0(x340Var2, 2131956207), new wnb0(1.0f, true), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, bjc0.a, 0, (qx8) null, x340Var2, 0, 0, 1712);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.v(qim0Var3, 12.0f));
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var2);
            if (z) {
                x340Var2.i0(-977050344);
                haxVar = new hax(cwl1.o0(x340Var2, 2131956205));
                z2 = false;
                x340Var2.r(false);
            } else {
                z2 = false;
                x340Var2.i0(-977047595);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            boolean z3 = (i2 & 14) == 4 ? true : z2;
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objT = x340Var2.T();
            if (z4 || objT == fkj0.X) {
                objT = new y96(z, function0, (byte) 4);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, (qim0) null, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2049279757, new dr0((byte) 29, z), x340Var2), x340Var2, 0, 48, 1996);
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
            h311VarV.d = new le3(z, function0, qim0Var2, i, (byte) 11);
        }
    }

    public static final void f(xpw xpwVar, Function0 function0, boolean z, boolean z2, boolean z3, String str, qim0 qim0Var, xpw xpwVar2, b0k b0kVar, int i) {
        int i2;
        String str2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(248803643);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(xpwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.h(z) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.h(z2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.h(z3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            str2 = str;
            i2 |= b0kVar2.g(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar2.i(xpwVar2) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            qim0 qim0VarF = u291.f(u291.j(48.0f, 0.0f, 2, qim0Var), 1.0f);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z4 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarB = uyn1.B(new i5j1(fraVar), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarB.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Object objT = b0kVar2.T();
            if (objT == fkj0.X) {
                objT = z1f0.g;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarThen, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, qim0VarB2, cbx.d(b0kVar2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i3 >> 15) & 14, 0, 2040);
            b0kVar2 = b0kVar2;
            i5j1 i5j1Var = new i5j1(een.N0);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, i5j1Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (xpwVar2 != null) {
                b0kVar2.i0(509196420);
                otw.c(xpwVar2, rih1.a, (qim0) null, (ipb1) null, b0kVar2, ((i3 >> 21) & 14) | 48, 12);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(509268495);
                b0kVar2.r(false);
            }
            if (z3) {
                b0kVar2.i0(509310004);
                otw.c(xpwVar, new jw50(mw50.a), (qim0) null, (ipb1) null, b0kVar2, i3 & 14, 12);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(509458959);
                b0kVar2.r(false);
            }
            if (z2) {
                b0kVar2.i0(509495074);
                otw.c(xpwVar, new jw50(new lw50(function0)), (qim0) null, (ipb1) null, b0kVar2, i3 & 14, 12);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(509661327);
                b0kVar2.r(false);
            }
            if (z) {
                b0kVar2.i0(509697721);
                otw.c(xpwVar, new jw50(kw50.a), (qim0) null, (ipb1) null, b0kVar2, i3 & 14, 12);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(509841871);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new u96(xpwVar, function0, z, z2, z3, str, qim0Var, xpwVar2, i);
        }
    }

    public static final void g(phw0 phw0Var, Function0 function0, Function0 function1, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function2;
        qim0 qim0Var2;
        int i4;
        idn0 idn0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(571588537);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(phw0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function2 = function0;
            i3 |= x340Var.i(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function1) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i3 | (x340Var.g(qim0Var2) ? SemanticState.Modal : SemanticState.ReadOnly);
        }
        int i6 = i4 | 24576;
        if (x340Var.Y(i6 & 1, (i6 & 9363) != 9362)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var3 = (idn0) objT;
            float f = ((Boolean) k1u.m(idn0Var3, x340Var, 6).getValue()).booleanValue() ? 0.7f : 1.0f;
            uwr uwrVar = cbx.a;
            tob1 tob1VarB = z95.b(f, irn1.o0(jfv.t(cbx.c(x340Var).b.a, ngv.d), 0, ((jhx) cbx.c(x340Var).a.b).a, 2), "alpha", (iu30) null, x340Var, 3072, 20);
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            boolean zG = x340Var.g(tob1VarB);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new lws0(tob1VarB, (byte) 3);
                x340Var.s0(objT2);
            }
            cwl1.b(anm1.N("preview_element_test_tag", bin.v(i541.C(qim0VarF, (iu30) objT2), idn0Var3, jtr.f, false, cwl1.o0(x340Var, 2131960411), (pm31) null, function2, 20)), (tl3) null, (hw61) null, mgx.e, new zzq0(12.0f, 12.0f, 4.0f, 12.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(975001328, new hov0(phw0Var, function1, (byte) 3), x340Var), x340Var, 3072, 48, 2022);
            x340Var = x340Var;
            idn0Var2 = idn0Var3;
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            idn0Var2 = idn0Var;
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nym(phw0Var, function0, function1, qim0Var3, idn0Var2, i, i2);
        }
    }

    public static final void h(bc81 bc81Var, Map map, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1058402177);
        int i2 = i | (b0kVar3.g(bc81Var) ? 4 : 2) | (b0kVar3.g(map) ? 32 : 16) | (b0kVar3.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            float f = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 80;
            gbx gbxVar = new gbx(z50.c, function0);
            uwr uwrVar = cbx.a;
            float f2 = cbx.b(b0kVar3).b.a;
            zzq0 zzq0Var = new zzq0(f2, f2, f2, f2);
            qim0 qim0VarV = u291.v(nim0.a, f);
            long jA = cbx.a(b0kVar3).a.a.a();
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            cwl1.b(dug.f(qim0VarV, jA, er31.b(8.0f)), (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1748977418, new nu31(bc81Var, map, function0, (byte) 15), b0kVar3), b0kVar2, 0, 48, 1518);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(bc81Var, map, function0, i, (byte) 15);
        }
    }

    public static final void i(i7a1 i7a1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(314905359);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(i7a1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
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
            vb81 vb81Var = i7a1Var.a;
            String str = vb81Var.b;
            String str2 = vb81Var.c;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            a6o1.i(0, str, str2, b0kVar2, (iu30) null, uyn1.z(16.0f, 0.0f, 2, nim0Var));
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new iv81(i7a1Var, iu30Var, (byte) 14);
                b0kVar2.s0(objT);
            }
            b0kVar2 = b0kVar2;
            ujo1.e((qim0) null, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, 0, 491);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(i7a1Var, iu30Var, i, (byte) 26);
        }
    }

    public static final void j(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-963615318);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            osx osxVar = osx.c;
            long j = cbx.a(x340Var).b.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(osxVar, isl.a, u291.r(qim0Var3, 16.0f), j, 0L, false, x340Var, osx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131962439), (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 25);
        }
    }

    public static final void k(bc81 bc81Var, rv21 rv21Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar;
        Function0 function1;
        bc81 bc81Var2 = bc81Var;
        Function0 function2 = function0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(313718461);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = i | (b0kVar2.g(bc81Var2) ? 4 : 2) | (b0kVar2.g(rv21Var) ? 32 : 16) | (b0kVar2.i(function2) ? SemanticState.Hidden : SemanticState.Focused) | 3072;
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function3 = hmb0.t1;
            if (z) {
                b0kVar2.l(function3);
            } else {
                b0kVar2.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, vu30Var4);
            String str = rv21Var != null ? rv21Var.c : null;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                b0kVar2.i0(1723791519);
                vu30Var2 = vu30Var4;
                function1 = function3;
                vu30Var = vu30Var3;
                lljVar = lljVar3;
                ni7 ni7VarA = oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070);
                as80 as80Var = mif1.P0;
                qim0 qim0VarR = u291.r(qim0Var3, 40.0f);
                cua cuaVar = cbx.b(b0kVar2).f;
                b0kVar2 = b0kVar2;
                cwl1.f(ni7VarA, (String) null, i1p1.q(qim0VarR, er31.b(2.0f)), (tl3) null, as80Var, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
                i2 = 0;
                b0kVar2.r(false);
            } else {
                i2 = 0;
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                function1 = function3;
                b0kVar2.i0(1724096869);
                qim0 qim0VarR2 = u291.r(qim0Var3, 40.0f);
                cua cuaVar2 = cbx.b(b0kVar2).f;
                t1c.a(dug.f(i1p1.q(qim0VarR2, er31.b(2.0f)), cbx.a(b0kVar2).a.d, d4o1.a), b0kVar2, 0);
                b0kVar2.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, i2);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar2);
            nko1.H(xos0VarM2, b0kVar2, vu30Var);
            x0d.q(iHashCode2, b0kVar2, lljVar, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, vu30Var2);
            bc81Var2 = bc81Var;
            b0k b0kVar3 = b0kVar2;
            uwo1.e(bc81Var2.a, (qim0) null, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1714);
            int i4 = bc81Var2.e;
            String strU = cwl1.U(2131820896, i4, new Object[]{Integer.valueOf(i4)}, b0kVar3);
            int i5 = bc81Var2.f;
            uwo1.e(cwl1.n0(2131962440, new Object[]{strU, cwl1.U(2131820897, i5, new Object[]{Integer.valueOf(i5)}, b0kVar3)}, b0kVar3), (qim0) null, cbx.d(b0kVar3).m, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1778);
            b0kVar3.r(true);
            function2 = function0;
            foo1.c(new gbx(z50.c, function2), jdx.c, (qim0) null, (max) null, yla.s(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1573806458, new wh91(bc81Var2, (byte) 6), b0kVar3), b0kVar3, 0, 48, 2012);
            b0kVar2 = b0kVar3;
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, bc81Var2, rv21Var, function2, qim0Var2, (byte) 16);
        }
    }

    public static final void l(phw0 phw0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1415790605);
        int i2 = (x340Var.g(phw0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cwl1.b(u291.m(nim0.a, 64.0f), een.h, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2049101674, new nhw0(phw0Var, (byte) 2), x340Var), x340Var, 54, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ohw0(phw0Var, i, (byte) 0);
        }
    }

    public static final void m(phw0 phw0Var, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(349051746);
        int i2 = (x340Var.g(phw0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            int iC = l1d.C(phw0Var.c);
            if (iC == 0) {
                x340Var.i0(1669675743);
                kqn1.d(1, 6, 2, x340Var, (qim0) null);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1669841934);
                kqn1.d(2, 54, 0, x340Var, anm1.N("preview_element_explicit_badge_test_tag", nim0Var));
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -777426172, false);
                }
                x340Var.i0(1670074682);
                x340Var.r(false);
            }
            suo1.h(48, 4, z(x340Var, phw0Var.d), (String) null, x340Var, anm1.N("preview_element_content_type_badge_test_tag", nim0Var));
            String str = phw0Var.e;
            uwr uwrVar = cbx.a;
            b2 = 1;
            uwo1.e(str, d9y0.k(nim0Var, phw0Var.h ? 1.0f : 0.3f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ohw0(phw0Var, i, b2);
        }
    }

    public static final tgm n(Map map, bbz0 bbz0Var, boolean z, boolean z2) {
        int i;
        boolean z3 = y7y0.t("offline", map) || z;
        boolean zC = y7y0.C(map);
        boolean z4 = bbz0Var.a;
        if (z2) {
            i = bbz0Var.k.contains(abz0.c) ? 1 : 2;
        } else {
            i = 2;
        }
        return new tgm((String) null, false, false, false, false, z3, false, (yh10) null, false, zC, i, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, z4, 2147480511, 1);
    }

    public static String o(String str, Locale locale) {
        return str.length() > 1 ? f4i1.e(str.substring(0, 1).toUpperCase(locale), str.substring(1)) : str.toUpperCase(locale);
    }

    public static String p(String str, Locale locale) {
        StringBuilder sb = new StringBuilder(str.toLowerCase(locale));
        int length = sb.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            char cCharAt = sb.charAt(i);
            if (cCharAt == ' ') {
                z = true;
            } else if (z) {
                sb.replace(i, i + 1, String.valueOf(cCharAt).toUpperCase(locale));
                z = false;
            }
        }
        return sb.toString();
    }

    public static String q(String str, String str2) {
        int i = 0;
        n57.a(0, Integer.valueOf(str.length() % 2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i < str.length()) {
            int i2 = i + 2;
            byteArrayOutputStream.write(Integer.parseInt(str2.substring(i, i2), 16) ^ Integer.parseInt(str.substring(i, i2), 16));
            i = i2;
        }
        return new String(byteArrayOutputStream.toByteArray(), one.c);
    }

    public static lhg1 r(lhg1 lhg1Var, kak0 kak0Var, w3k0 w3k0Var) {
        ruq0 ruq0Var = lhg1Var.b;
        ruq0 ruq0Var2 = kak0Var.S0.b;
        String str = ruq0Var2.g;
        String str2 = w3k0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        return t9p1.t(lhg1.a(lhg1Var, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str2, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, ruq0Var2.R0, w3k0Var.c, 130879), false, false, 13), kak0Var.j1, w3k0Var.h);
    }

    public static final ArrayList s(mhh1 mhh1Var) {
        ArrayList arrayList = new ArrayList();
        Boolean bool = Boolean.TRUE;
        j1p1.m("eq", arrayList, "available", bool);
        j1p1.m("eq", arrayList, "hasTimeLeft", bool);
        j1p1.m("eq", arrayList, "unique", bool);
        j1p1.m("lt", arrayList, "daysLastPlayed", 10);
        j1p1.m("gt", arrayList, "timePlayed", 30);
        return arrayList;
    }

    public static fji0 t(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (!list.isEmpty()) {
            return (fji0) list.get(0);
        }
        hhg1.n("Missing member in members list.");
        return null;
    }

    public static final LinkedHashMap u(t3v0 t3v0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("updateThrottling", String.valueOf(100));
        linkedHashMap.put("responseFormat", "protobuf");
        Boolean bool = t3v0Var.a;
        String strValueOf = bool != null ? String.valueOf(bool.booleanValue()) : null;
        if (strValueOf != null) {
            linkedHashMap.put("preferCached", strValueOf);
        }
        return linkedHashMap;
    }

    public static void v(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String w(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return gvg.l(new StringBuilder(String.valueOf(i).length() + 21), "unknown status code: ", i);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static boolean x(vpu0 vpu0Var) {
        return !u890.j(vpu0Var.c, t(vpu0Var).a.b);
    }

    public static String y(String str) {
        try {
            return Normalizer.normalize(str, Normalizer.Form.NFKD).replaceAll("[^\\x20-\\x7E]", "");
        } catch (AssertionError e) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            try {
                String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKD);
                n57.e("normalize worked after sleeping");
                return strNormalize.replaceAll("[^\\x20-\\x7E]", "");
            } catch (AssertionError unused2) {
                try {
                    Class<?> cls = Class.forName("libcore.icu.NativeNormalizer$1");
                    Field declaredField = cls.getDeclaredField("$SwitchMap$java$text$Normalizer$Form");
                    declaredField.setAccessible(true);
                    int[] iArr = (int[]) declaredField.get(cls);
                    throw new RuntimeException(String.format("switchmap overwritten? 0x%08x,0x%08x,0x%08x,0x%08x", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3])), e);
                } catch (ClassNotFoundException e2) {
                    eg.f(e2);
                    return null;
                } catch (IllegalAccessException e3) {
                    eg.f(e3);
                    return null;
                } catch (NoSuchFieldException e4) {
                    eg.f(e4);
                    return null;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String z(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        int i2;
        int i3;
        int iC = l1d.C(i);
        if (iC == 0) {
            x340Var = (x340) b0kVar;
            i2 = 2131960413;
            i3 = 1177175121;
        } else {
            if (iC != 1) {
                throw p3d1.k((x340) b0kVar, 1177174332, false);
            }
            x340Var = (x340) b0kVar;
            i2 = 2131960414;
            i3 = 1177177490;
        }
        return x0d.k(x340Var, i3, i2, x340Var, false);
    }
}
