package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jyo1 {
    public static b180 a;
    public static b180 b;

    public static final aod a(ti31 ti31Var, kj31 kj31Var) {
        return new aod(kj31Var, ti31Var, (byte) 10);
    }

    public static final void b(int i, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i2) {
        Function0 function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-183383170);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            function3 = function2;
            mqo1.e(function3, null, null, lhi.a, apo.r(-963945153, new vx1(i, (byte) 11), x340Var), apo.r(42977536, new bvk(function0, (byte) 5), x340Var), apo.r(1049900225, new bvk(function1, (byte) 6), x340Var), x340Var, ((i3 >> 9) & 14) | 1797120, 6);
        } else {
            function3 = function2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(i, i2, function0, function1, function3);
        }
    }

    public static final void c(boolean z, boolean z2, float f, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-247637450);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | 3072 | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
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
            if (z) {
                x340Var.i0(-952504401);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                int i3 = ((i2 >> 6) & 14) | 384;
                z3 = true;
                qim0Var3 = qim0Var4;
                xto1.f(f, 4, i3, 16, j, 0L, x340Var, u291.r(qim0Var4, 32.0f));
                x340Var.r(false);
            } else {
                z3 = true;
                qim0Var3 = qim0Var4;
                x340Var.i0(-952291834);
                x340Var.r(false);
            }
            wro1.h(new gbx(z50.c, function0), ldx.c, null, z2 ? jax.a : new hax("Preview unavailable"), yla.s(x340Var), null, false, null, null, apo.r(1104450259, new dr0((byte) 27, z), x340Var), x340Var, 12582960, 6, 844);
            x340Var = x340Var;
            x340Var.r(z3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jx10(z, z2, f, qim0Var2, function0, i);
        }
    }

    public static final void d(lbt0 lbt0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        Function0 function0;
        iu30 iu30Var2 = iu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        nl3 nl3Var = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(161202866);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? (x340Var.g(lbt0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            g36 g36Var = h36.c;
            mbh mbhVarA = jbh.a(g36Var, nl3Var, x340Var, 0);
            int i3 = i2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            String str = lbt0Var.d;
            uwr uwrVar = cbx.a;
            Function0 function2 = function1;
            int i4 = i3;
            boolean z2 = false;
            g36 g36Var2 = g36Var;
            uwo1.e(str, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            String str2 = lbt0Var.e;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0Var3 = qim0Var2;
            uwo1.e(str2, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.i0(-2023506618);
            int i5 = 0;
            for (Object obj : lbt0Var.f) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                xe1 xe1Var = (xe1) obj;
                fra fraVar = een.N0;
                d36 d36Var = new d36(12.0f, true, new um5(z2));
                llj lljVar5 = lljVar2;
                qim0 qim0Var4 = qim0Var3;
                qim0 qim0VarX = uyn1.x(dug.f(qim0Var4, z4p1.h(0.1f, 0.1f, 0.1f, 1.0f, 16), er31.b(8.0f)), 16.0f);
                int i7 = i4;
                boolean zE = ((i7 & 896) == 256) | x340Var.e(i5);
                Object objT = x340Var.T();
                if (zE || objT == m4cVar) {
                    objT = new ck0(iu30Var2, i5, (byte) 16);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX2 = bin.x(qim0VarX, false, null, null, null, (Function0) objT, 15);
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar5, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                hux huxVarD = xxq0.d(xe1Var.a);
                uwr uwrVar2 = cbx.a;
                Function0 function3 = function0;
                x340 x340Var2 = x340Var;
                w0h1.a(huxVarD, isl.a, uyn1.x(u291.r(dug.f(qim0Var4, cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 48.0f), 12.0f), 0L, 0L, false, x340Var2, 56, 56);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                g36 g36Var3 = g36Var2;
                mbh mbhVarA2 = jbh.a(g36Var3, nl3Var, x340Var2, 0);
                nl3 nl3Var2 = nl3Var;
                m4c m4cVar2 = m4cVar;
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, wnb0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function3);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar5, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                g36Var2 = g36Var3;
                uwo1.e(xe1Var.b, null, cbx.d(x340Var2).g, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                uwo1.e(xe1Var.c, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(true);
                op71.g(x340Var, u291.r(qim0Var4, 16.0f));
                iu30Var2 = iu30Var;
                qim0Var3 = qim0Var4;
                function2 = function3;
                i5 = i6;
                nl3Var = nl3Var2;
                m4cVar = m4cVar2;
                lljVar2 = lljVar5;
                i4 = i7;
                z2 = false;
            }
            x340Var.r(z2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new act0(lbt0Var, qim0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void e(qvi1 qvi1Var, Function0 function0, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        idn0 idn0Var2;
        int i2;
        idn0 idn0Var3;
        qim0 qim0Var3;
        String strN0;
        m4c m4cVar = fkj0.X;
        String str = qvi1Var.c;
        String str2 = qvi1Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-5954279);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(qvi1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384 | (x340Var.g((Object) null) ? 2048 : 1024) | 8192;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            int i4 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || x340Var.E()) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                i2 = i3 & (-57345);
                idn0Var3 = (idn0) objT;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                i2 = i3 & (-57345);
                qim0Var3 = qim0Var;
                idn0Var3 = idn0Var;
            }
            x340Var.s();
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            String strO0 = cwl1.o0(x340Var, 2131963706);
            if (str2 == null || str2.length() == 0) {
                x340Var.i0(-1289592425);
                strN0 = cwl1.n0(2131963700, new Object[]{strO0, str}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1289760507);
                strN0 = cwl1.n0(2131963699, new Object[]{strO0, str, str2}, x340Var);
                x340Var.r(false);
            }
            jtr jtrVar = jtr.f;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new sah1(function0, (byte) 18);
                x340Var.s0(objT2);
            }
            qim0 qim0Var5 = qim0Var3;
            idn0 idn0Var4 = idn0Var3;
            qim0 qim0VarThen = bin.v(qim0Var3, idn0Var3, jtrVar, false, null, null, (Function0) objT2, 28).then(qim0VarF);
            boolean zG = x340Var.g(strN0);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new ysf1(strN0, (byte) 21);
                x340Var.s0(objT3);
            }
            qim0 qim0VarA = s161.a(qim0VarThen, (iu30) objT3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarQ = i1p1.q(u291.f(qim0Var4, 1.0f), er31.b(8.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarK = xcg1.k(cbx.a, qim0VarQ);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            Uri uri = Uri.parse(qvi1Var.a);
            nkx nkxVar = nkx.c;
            eso1.e(uri, isl.a, qim0VarD, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073766448, 0, 3560);
            x340Var.r(true);
            uwo1.e(qvi1Var.b, uyn1.B(u291.f(qim0Var4, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1712);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var5;
            idn0Var2 = idn0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(qvi1Var, function0, qim0Var2, idn0Var2, i, (byte) 23);
        }
    }

    public static final String g(String str, String str2, c380 c380Var, br01 br01Var) {
        return l1d.n("|", br01Var.a, gvg.n(str, "|", str2, "|", o7h.y0(c380Var, ",", (String) null, (String) null, jt01.T0, 30)));
    }

    public static String h(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static List i() {
        return (List) o571.c.getValue();
    }

    public static final int k(tsj0 tsj0Var) {
        return System.identityHashCode(tsj0Var);
    }

    public static void l(rtb0 rtb0Var, q1d0 q1d0Var) {
        m(rtb0Var, q1d0Var, new d720(l1d0.f, (byte) 24));
    }

    public static final void m(rtb0 rtb0Var, q1d0 q1d0Var, vu30 vu30Var) {
        ven0 ven0Var = q1d0Var.g;
        if (ven0Var == null) {
            u890.C("state");
            throw null;
        }
        List list = ((rnc0) ven0Var.getValue()).b;
        rtb0Var.e(list.size(), new xg50(list, (byte) 18), new xg50(list, (byte) 19), new j2i(2039820996, new rf1((byte) 15, q1d0Var, vu30Var, list), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static final q1d0 n(xtb0 xtb0Var, cnc0 cnc0Var, h3h1 h3h1Var, b0k b0kVar, int i) {
        ?? r0;
        h3h1 h3h1Var2 = (i & 4) != 0 ? null : h3h1Var;
        x340 x340Var = (x340) b0kVar;
        iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = (snc0) cnc0Var.a.invoke();
            x340Var.s0(objT);
        }
        snc0 snc0Var = (snc0) objT;
        boolean zI = x340Var.i(snc0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new s1d0(snc0Var, (byte) 0);
            x340Var.s0(objT2);
        }
        qxd0.i(snc0Var, (iu30) objT2, x340Var);
        x340Var.i0(-160202501);
        boolean zG = x340Var.g(snc0Var);
        Object objT3 = x340Var.T();
        if (zG || objT3 == m4cVar) {
            zob1 zob1VarB = snc0Var.b();
            LinkedHashMap linkedHashMap = cnc0Var.d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), (maa) ((vu30) entry.getValue()).invoke(snc0Var.getMetadata(), iac0Var));
            }
            r0 = 0;
            q1d0 q1d0Var = new q1d0(xtb0Var, zob1VarB, linkedHashMap2, cnc0Var.b, h3h1Var2, new lbc0(1, snc0Var, snc0.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 1));
            x340Var.s0(q1d0Var);
            objT3 = q1d0Var;
        } else {
            r0 = 0;
        }
        q1d0 q1d0Var2 = (q1d0) objT3;
        q1d0Var2.a(x340Var, r0);
        x340Var.r((boolean) r0);
        return q1d0Var2;
    }

    public abstract rd70 f();

    public abstract jyo1 j(y570 y570Var);
}
