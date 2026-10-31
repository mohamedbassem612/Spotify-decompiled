package p;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class p1p1 {
    public static b180 a;
    public static b180 b;

    public static final mmr0 A(CardShareConfiguration cardShareConfiguration, Integer num, boolean z) {
        Object next;
        if (z) {
            return new mmr0(cardShareConfiguration, Integer.valueOf(num != null ? num.intValue() : 0));
        }
        Iterator it = cardShareConfiguration.t().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j((String) next, "default"));
        String str = (String) next;
        h290 h290VarT = cardShareConfiguration.t();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarT) {
            if (!u890.j((String) obj, "default")) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listN = arrayList;
        if (zIsEmpty) {
            return new mmr0(cardShareConfiguration, 0);
        }
        if (num != null) {
            listN = p7h.N(o7h.t0(num.intValue(), arrayList));
        }
        boolean zIsEmpty2 = listN.isEmpty();
        List listN0 = listN;
        if (zIsEmpty2) {
            return new mmr0(cardShareConfiguration, 0);
        }
        if (str != null) {
            listN0 = o7h.N0(Collections.singletonList(str), listN);
        }
        evd builder = cardShareConfiguration.toBuilder();
        builder.q();
        builder.n(listN0);
        return new mmr0(builder.build(), 0);
    }

    public static final ArrayList B(Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new cb11(annotation));
        }
        return arrayList;
    }

    public static dd9 C(td9 td9Var) {
        boolean z = td9Var.b;
        Set set = td9Var.d;
        if (!z || !td9Var.c || set.isEmpty()) {
            set = w7x.a;
        }
        return new dd9(set);
    }

    public static String D(String str) {
        String strJ;
        String str2;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        if (s4b1VarX.c != blc0.ea) {
            s4b1VarX = null;
        }
        if (s4b1VarX == null || (strJ = s4b1VarX.j()) == null) {
            strJ = null;
        }
        if (strJ != null) {
            return strJ;
        }
        jxu0 jxu0VarC = oxu0.a.c(str);
        jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
        if (jxu0Var != null) {
            if (!u890.j(jxu0Var.a, "listening-party") || !cmd0.a.e(jxu0Var.b)) {
                jxu0Var = null;
            }
            if (jxu0Var != null && (str2 = jxu0Var.b) != null) {
                return str2;
            }
        }
        return null;
    }

    public static final ihg0 E(o1p1 o1p1Var, iu30 iu30Var, b0k b0kVar) {
        Object uh0Var;
        o1p1 o1p1Var2;
        v8r.s(o1p1Var, b0kVar);
        ven0 ven0VarS = v8r.s(iu30Var, b0kVar);
        String str = (String) k5p1.t(new Object[0], null, null, p4.i, b0kVar, 3072, 6);
        x340 x340Var = (x340) b0kVar;
        vh0 vh0Var = (vh0) x340Var.k(nce0.a);
        if (vh0Var == null) {
            x340Var.i0(1006590171);
            Context baseContext = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof vh0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            vh0Var = (vh0) baseContext;
        } else {
            x340Var.i0(1006589303);
        }
        x340Var.r(false);
        if (vh0Var == null) {
            eg.m("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        sh0 sh0VarM = vh0Var.m();
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new lh0();
            x340Var.s0(objT);
        }
        lh0 lh0Var = (lh0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new ihg0(lh0Var);
            x340Var.s0(objT2);
        }
        ihg0 ihg0Var = (ihg0) objT2;
        boolean zI = x340Var.i(lh0Var) | x340Var.i(sh0VarM) | x340Var.g(str) | x340Var.i(o1p1Var) | x340Var.g(ven0VarS);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            o1p1Var2 = o1p1Var;
            uh0Var = new uh0(lh0Var, sh0VarM, str, o1p1Var2, ven0VarS, (byte) 0);
            x340Var.s0(uh0Var);
        } else {
            uh0Var = objT3;
            o1p1Var2 = o1p1Var;
        }
        qxd0.g(sh0VarM, str, o1p1Var2, (iu30) uh0Var, x340Var);
        return ihg0Var;
    }

    public static final Integer F(Set set, Set set2, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            String str = (String) it.next();
            if (set.contains(str) && !set2.contains(str)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static Next G(td9 td9Var, md9 md9Var, yqg yqgVar, boolean z) {
        Set set;
        Set set2 = td9Var.d;
        if (md9Var instanceof kd9) {
            Set set3 = ((kd9) md9Var).a;
            set = set3.isEmpty() ? null : set3;
            if (set == null) {
                return Next.j();
            }
            Set setO1 = o7h.o1(set2);
            Set set4 = set;
            if (setO1.containsAll(set4)) {
                return Next.j();
            }
            setO1.addAll(set4);
            td9 td9VarA = td9.a(td9Var, false, false, false, setO1, 7);
            return Next.i(td9VarA, Effects.a(new ed9[]{C(td9VarA), new cd9(td9VarA.d)}));
        }
        if (md9Var instanceof ld9) {
            Set set5 = ((ld9) md9Var).a;
            set = set5.isEmpty() ? null : set5;
            if (set == null) {
                return Next.j();
            }
            Set setO2 = o7h.o1(set2);
            Set set6 = set;
            if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                Iterator it = set6.iterator();
                while (it.hasNext()) {
                    if (setO2.contains((ee9) it.next())) {
                        setO2.removeAll(set);
                        td9 td9VarA2 = td9.a(td9Var, false, false, false, setO2, 7);
                        return Next.i(td9VarA2, Effects.a(new ed9[]{C(td9VarA2), new cd9(td9VarA2.d)}));
                    }
                }
            }
            return Next.j();
        }
        if (md9Var instanceof id9) {
            id9 id9Var = (id9) md9Var;
            td9 td9VarA3 = td9.a(td9Var, false, id9Var.a, id9Var.b, (Set) null, 9);
            return Next.i(td9VarA3, Effects.a(new dd9[]{C(td9VarA3)}));
        }
        if (md9Var instanceof gd9) {
            td9 td9VarA4 = td9.a(td9Var, true, false, false, (Set) null, 14);
            return Next.i(td9VarA4, Effects.a(new zc9[]{new zc9(td9VarA4.a)}));
        }
        if (md9Var instanceof hd9) {
            td9 td9VarA5 = td9.a(td9Var, false, false, false, (Set) null, 14);
            return Next.i(td9VarA5, Effects.a(new zc9[]{new zc9(td9VarA5.a)}));
        }
        if (!(md9Var instanceof jd9)) {
            eg.o();
            return null;
        }
        jd9 jd9Var = (jd9) md9Var;
        ee9 ee9Var = jd9Var.b;
        if (!set2.contains(ee9Var)) {
            n57.s("Received write for unregistered BLE characteristic");
            if (!z) {
                return Next.j();
            }
        }
        return Next.a(Effects.a(new ed9[]{new ad9(jd9Var.a, ee9Var, jd9Var.c, jd9Var.d), new bd9(yqgVar.b())}));
    }

    public static final void a(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1157307716);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 1.0f);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            long j = ((vex) zscVar.e).j;
            u5j1 u5j1Var = d4o1.a;
            t1c.a(dug.f(qim0VarH, j, u5j1Var), x340Var, 0);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            qim0 qim0VarS = u291.s(nim0Var, 36.0f, 4.0f);
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(dug.f(i1p1.q(qim0VarS, er31.b(4.0f)), ((vex) zscVar.e).j, u5j1Var).then(new tq60(een.Q0)), x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            j2iVar.invoke(x340Var, 6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar, i, (byte) 25);
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, hux huxVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1704520671);
        int i3 = ((i2 & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            long j = cbx.a(x340Var).b.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var, 56 | (i3 & 14), 48);
            uwo1.e(cwl1.o0(x340Var, i), null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dfd0(huxVar, i, i2, (byte) 2);
        }
    }

    public static final void c(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2131360296);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, i);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = pod1.d1;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarF, false, (iu30) objT), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 29, i, i2);
        }
    }

    public static final void d(String str, String str2, boolean z, Function0 function0, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2119296496);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar2) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        byte b3 = 0;
        byte b4 = 1;
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            uvx uvxVarA = uvx.a((uvx) b0kVar3.k(vvx.a), (pgx) null, 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (vzq0) null, (tvx) null, (p3v) null, 503);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new sah1(function0, (byte) 24);
                b0kVar3.s0(objT);
            }
            j2i j2iVar3 = (str2 == null || ihc1.y0(str2)) ? null : new j2i(-1837582110, new a9j1(b4, str2, (Function0) objT, z), true);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var3, uvxVarA, null, false, null, null, null, null, null, j2iVar3, apo.r(-1390557497, new xy30(z, function0, b2), b0kVar3), null, apo.r(1768465353, new qje1(j2iVar, (byte) 3), b0kVar3), apo.r(1200493130, new qje1(j2iVar2, (byte) 4), b0kVar3), null, apo.r(64548684, new a9j1(b3, str, function0, z), b0kVar3), b0kVar2, ((i3 >> 18) & 14) | 64, 200070, 18940);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1(str, str2, z, function0, j2iVar, j2iVar2, qim0Var2, i);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(276856401);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(qim0Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = sgc1.D(1, u291.f(nim0Var, 1.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
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
            cbx.a.getClass();
            qim0 qim0VarL0 = cwl1.l0(i1p1.q(d7e.r(uwr.a().a, nim0Var, false), cr31VarB), jA, cr31VarB, 12);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarL0);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            lee1 lee1Var = cbx.d(x340Var).j;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = tzf.c1;
                x340Var.s0(objT);
            }
            uwo1.e("\n\n", exd0.s(qim0VarX, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2040);
            x340Var.r(true);
            qim0 qim0VarF2 = dug.f(cwl1.l0(i1p1.q(new wnb0(1.0f, true), cr31VarB), jA, cr31VarB, 12), cbx.a(x340Var).a.b.a(), d4o1.a);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF2, 16.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarX2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new y7e1((String) null, 3);
                x340Var.s0(objT2);
            }
            xea.c((y7e1) objT2, u291.f(nim0Var, 1.0f), false, false, (dk80) null, lee1.a(cbx.d(x340Var).j, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (kua0) null, (yta0) null, new c6e1(3, 3), (vu30) null, (idn0) null, new n6a1(cbx.a(x340Var).b.a), (uwg) null, (o4e1) null, (es41) null, x340Var, 384, 0, 30424);
            x340Var = x340Var;
            us71.m(x340Var, true, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 23);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(fdj1 fdj1Var, jbj1 jbj1Var, j2i j2iVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, qim0 qim0Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        j2i j2iVar2;
        iu30 iu30Var2;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        int i4;
        fdj1 fdj1Var2;
        jbj1 jbj1Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-603489331);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(fdj1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(jbj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2iVar2 = j2iVar;
            i3 |= b0kVar3.i(j2iVar2) ? 256 : 128;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((i & 3072) == 0) {
            iu30Var2 = iu30Var;
            i3 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 24576) == 0) {
            function6 = function0;
            i3 |= b0kVar3.i(function6) ? 16384 : 8192;
        } else {
            function6 = function0;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar3.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function7 = function2;
            i3 |= b0kVar3.i(function7) ? 1048576 : 524288;
        } else {
            function7 = function2;
        }
        if ((12582912 & i) == 0) {
            function8 = function3;
            i3 |= b0kVar3.i(function8) ? 8388608 : 4194304;
        } else {
            function8 = function3;
        }
        if ((100663296 & i) == 0) {
            i3 |= b0kVar3.i(function4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.i(function5) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.i(qim0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (b0kVar3.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            zx zxVar = new zx((Object) fdj1Var, (Object) iu30Var2, (Object) jbj1Var, (Object) j2iVar2, (Object) function6, (Object) function7, (Object) function8, (Object) function4, (Object) function5, (byte) 15);
            fdj1Var2 = fdj1Var;
            jbj1Var2 = jbj1Var;
            j2i j2iVarR = apo.r(-1162708605, zxVar, b0kVar3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
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
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int iC = l1d.C(jbj1Var2.a);
            if (iC == 0) {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-1349476835);
                j2iVarR.invoke(b0kVar2, 6);
                b0kVar2.r(false);
            } else {
                if (iC != 1) {
                    if (iC != 2) {
                        throw p3d1.k(b0kVar3, -1349477937, false);
                    }
                    b0kVar3.i0(-1349466070);
                    b0kVar3.r(false);
                    eg.m("LEGACY_HOME is routed to ContentLegacyHome");
                    return;
                }
                b0kVar3.i0(-1349475266);
                ji0 ji0Var = fdj1Var2.a;
                b0kVar2 = b0kVar3;
                d(ji0Var.c, ji0Var.U0, ji0Var.b(), function1, j2iVar, j2iVarR, null, b0kVar2, ((i5 >> 6) & 7168) | 196608 | ((i5 << 6) & 57344));
                b0kVar2.r(false);
            }
            int iC2 = l1d.C(jbj1Var2.b);
            if (iC2 == 0) {
                b0kVar2.i0(1116378025);
                b0kVar2.r(false);
            } else {
                if (iC2 != 1) {
                    if (iC2 != 2) {
                        throw p3d1.k(b0kVar2, -1349463913, false);
                    }
                    b0kVar2.i0(-1349458742);
                    b0kVar2.r(false);
                    eg.m("LEGACY_HOME is routed to ContentLegacyHome");
                    return;
                }
                b0kVar2.i0(-1349462550);
                m(b0kVar2, 0);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            fdj1Var2 = fdj1Var;
            jbj1Var2 = jbj1Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b9j1(fdj1Var2, jbj1Var2, j2iVar, iu30Var, function0, function1, function2, function3, function4, function5, qim0Var, i, i2);
        }
    }

    public static final void g(aob1 aob1Var, iu30 iu30Var, kly0 kly0Var, lu70 lu70Var, b0k b0kVar, int i) {
        int i2;
        kly0 kly0Var2;
        ArrayList arrayList;
        xtb0 xtb0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1319653551);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(aob1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            kly0Var2 = kly0Var;
            i2 |= x340Var.i(kly0Var2) ? 256 : 128;
        } else {
            kly0Var2 = kly0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(lu70Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (iuj) kly0Var2.get();
                x340Var.s0(objT);
            }
            iuj iujVar = (iuj) objT;
            tyq tyqVar = (tyq) lu70Var.Y.getValue();
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new c491();
                x340Var.s0(objT2);
            }
            c491 c491Var = (c491) objT2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            boolean z = aob1Var instanceof kmb1;
            if (z) {
                arrayList = ((kmb1) aob1Var).a;
            } else if (aob1Var instanceof pmb1) {
                arrayList = ((pmb1) aob1Var).a;
            } else {
                if (!(aob1Var instanceof wmb1)) {
                    eg.o();
                    return;
                }
                arrayList = null;
            }
            if (arrayList == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yu70(aob1Var, iu30Var, kly0Var2, lu70Var, i, (byte) 1);
                    return;
                }
                return;
            }
            kmb1 kmb1Var = z ? (kmb1) aob1Var : null;
            List list = kmb1Var != null ? kmb1Var.d : null;
            if (list == null) {
                list = z6x.a;
            }
            Set set = kmb1Var != null ? kmb1Var.e : null;
            if (set == null) {
                set = w7x.a;
            }
            x340Var.f0(-1171684127, aob1Var.b());
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            x340Var.r(false);
            boolean zG = x340Var.g(aob1Var.b());
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = v8r.q(set);
                x340Var.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            boolean zI = x340Var.i(ven0Var) | x340Var.g(set) | x340Var.g(list) | x340Var.i(xtb0VarA);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                xtb0Var = xtb0VarA;
                objT4 = new xu70(set, list, ven0Var, xtb0Var, (lnm) null);
                x340Var.s0(objT4);
            } else {
                xtb0Var = xtb0VarA;
            }
            qxd0.s(list, set, (vu30) objT4, x340Var);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z2 = (i2 & 112) == 32;
            Object objT5 = x340Var.T();
            if (z2 || objT5 == m4cVar) {
                objT5 = new z720(iu30Var, (byte) 29);
                x340Var.s0(objT5);
            }
            qim0 qim0VarW = jzn1.w(qim0VarF, (iu30) objT5, x340Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
            iujVar.a(aob1Var.a(), x340Var, 0);
            x340Var.r(true);
            x340Var.f0(608388655, aob1Var.b());
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean zI2 = x340Var.i(arrayList) | x340Var.i(tyqVar) | x340Var.i(c491Var);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new lb50(arrayList, tyqVar, c491Var, (byte) 7);
                x340Var.s0(objT6);
            }
            s3o1.e(qim0VarF2, xtb0Var, zzq0VarH, d36Var, null, null, null, (iu30) objT6, x340Var, 0, 232);
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new yu70(aob1Var, iu30Var, kly0Var, lu70Var, i, (byte) 0);
        }
    }

    public static final void h(qa20 qa20Var, c380 c380Var, uny unyVar, qim0 qim0Var, b0k b0kVar, int i) {
        qa20 qa20Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        m4c m4cVar = fkj0.X;
        String str = qa20Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-396154201);
        int i2 = i | (b0kVar3.i(qa20Var) ? 4 : 2) | (b0kVar3.i(c380Var) ? 32 : 16) | (b0kVar3.g(unyVar) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (((qa20) obj).b) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((qa20) it.next()).a);
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                objT = v8r.p(Arrays.copyOf(strArr, strArr.length));
                b0kVar3.s0(objT);
            }
            bw91 bw91Var = (bw91) objT;
            boolean zContains = bw91Var.contains(str);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarThen = anm1.N(str, qim0Var3).then(uyn1.B(qim0Var3, 0.0f, 4.0f, 0.0f, 4.0f, 5));
            lex lexVarZ = yoo1.z(b0kVar3);
            nex nexVar = new nex(8);
            j2i j2iVar = zContains ? xoi.a : null;
            boolean zH = b0kVar3.h(zContains) | b0kVar3.i(bw91Var) | b0kVar3.i(qa20Var) | ((i2 & 896) == 256);
            Object objT2 = b0kVar3.T();
            if (zH || objT2 == m4cVar) {
                gh1 gh1Var = new gh1(zContains, bw91Var, qa20Var, unyVar, (byte) 11);
                z = zContains;
                qa20Var2 = qa20Var;
                b0kVar3.s0(gh1Var);
                objT2 = gh1Var;
            } else {
                qa20Var2 = qa20Var;
                z = zContains;
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT2, nexVar, lexVarZ, qim0VarThen, 0, null, null, null, null, j2iVar, null, null, false, null, apo.r(2002968260, new rr10(qa20Var2, (byte) 7), b0kVar3), b0kVar2, 0, 196608, 31712);
            qim0Var2 = qim0Var3;
        } else {
            qa20Var2 = qa20Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, qa20Var2, c380Var, unyVar, qim0Var2, (byte) 16);
        }
    }

    public static final void i(c380 c380Var, uny unyVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2090119401);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(unyVar) : x340Var.i(unyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            d7 d7Var = new d7(ja20.d, (byte) 0);
            while (d7Var.hasNext()) {
                int i4 = i3 << 3;
                j(c380Var, (ja20) d7Var.next(), unyVar, qim0Var, x340Var, (i3 & 14) | (i4 & 896) | (i4 & 7168));
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(c380Var, unyVar, qim0Var, i, (byte) 4);
        }
    }

    public static final void j(c380 c380Var, ja20 ja20Var, uny unyVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1998929919);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(ja20Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(unyVar) : x340Var.i(unyVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarN = anm1.N(ja20Var.name(), qim0Var);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(c380Var);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var.i(unyVar))) {
                z = true;
            }
            boolean z2 = zI | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new lz6(c380Var, ja20Var, unyVar, (byte) 3);
                x340Var.s0(objT);
            }
            too1.b(qim0VarN, null, null, (iu30) objT, x340Var, 0, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, c380Var, ja20Var, unyVar, qim0Var, (byte) 0);
        }
    }

    public static final void k(c380 c380Var, uny unyVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1323668329);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.g(unyVar) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            String strO0 = cwl1.o0(x340Var, 2131955968);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarF, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            op71.g(x340Var, u291.r(qim0Var3, 8.0f));
            i(c380Var, unyVar, u291.f(qim0Var3, 1.0f), x340Var, i2 & 126);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(c380Var, unyVar, qim0Var2, i, (byte) 13);
        }
    }

    public static final void l(String str, String str2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2086957520);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | (x340Var.i(function2) ? 8388608 : 4194304) | (x340Var.i(function3) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            gfx.b(18, apo.r(733551835, new c9j1(z2, z3, function2, function3, str, z, function0, str2, function1), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c9j1(str, str2, z, z2, z3, function0, function1, function2, function3, i);
        }
    }

    public static final void m(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2056302835);
        if (!x340Var.Y(i & 1, i != 0)) {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i, (byte) 3);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1680070218);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, i != 0)) {
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            String strO0 = cwl1.o0(x340Var, 2131956409);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = ywx0.k(nim0Var, 16.0f, x340Var, x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            b(2131956408, grx.d, x340Var, grx.c);
            b(2131956419, xtx.d, x340Var, xtx.c);
            b(2131956412, tnx.d, x340Var, tnx.c);
            b(2131956413, uox.d, x340Var, uox.c);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 3);
        }
    }

    public static final void o(int i, String str, String str2, Function0 function0, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1667059497);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(j2iVar) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfx.b(18, apo.r(-468911980, new be90(str, str2, function0, j2iVar), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new be90(str, str2, j2iVar, function0, i, (byte) 2);
        }
    }

    public static final void p(int i, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-155038449);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, z ? 2131952018 : 2131952016);
            String strO1 = cwl1.o0(x340Var, z ? 2131952017 : 2131952015);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strO0);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new eb7(z, function1, function0, (byte) 3);
                x340Var.s0(objT);
            }
            wro1.k(new gbx(y50Var, (Function0) objT), qim0Var, null, null, null, apo.r(-1382433660, new mv8(z, strO1, (byte) 17), x340Var), x340Var, ((i2 >> 3) & 112) | 196608, 28);
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y2t0(z, function0, qim0Var2, function1, i);
        }
    }

    public static final void q(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(279238937);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, i != 0)) {
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            c(2131956418, x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = ywx0.k(nim0Var, 16.0f, x340Var, x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            b(2131956412, tnx.d, x340Var, tnx.c);
            b(2131956413, uox.d, x340Var, uox.c);
            b(2131956415, nrx.d, x340Var, nrx.c);
            x340Var.r(true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            c(2131956414, x340Var, 0);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = ywx0.k(nim0Var, 16.0f, x340Var, x340Var).b;
            mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            b(2131956408, ltx.d, x340Var, ltx.c);
            b(2131956419, xtx.d, x340Var, xtx.c);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 4);
        }
    }

    public static final void r(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1682532025);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            yla.r(x340Var);
            qim0 qim0VarR = u291.r(qim0Var, 48.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, cbx.a(x340Var).a.c, er31.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            xto1.e(h2c.a.a(nim0.a, een.h), 2, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b271(qim0Var, i, (byte) 1);
        }
    }

    public static final void s(wvj0 wvj0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
        yqk1 i820Var;
        w8w0 w8w0Var;
        w8w0 w8w0Var2;
        w8w0 w8w0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(290044320);
        int i2 = i | (x340Var.i(wvj0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(xskVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            vvj0 vvj0Var = wvj0Var.a;
            Map map = wvj0Var.b;
            b8w0 b8w0Var = vvj0Var.b;
            ryb rybVar = vvj0Var.a;
            if (rybVar instanceof ryb) {
                x340Var.i0(-763436242);
                ryb rybVar2 = rybVar;
                c380 c380VarA = mqo1.A(rybVar2.b);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = v8r.q(Integer.valueOf(rybVar2.a));
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Object value = ven0Var.getValue();
                boolean zG = x340Var.g(c380VarA) | ((i2 & 112) == 32);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new awj0(ven0Var, iu30Var, c380VarA);
                    x340Var.s0(objT2);
                }
                c680.c(c380VarA, value, (iu30) objT2, p1j.a, rybVar, (qim0) null, cwl1.o0(x340Var, 2131958619), x340Var, 3072);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (rybVar instanceof zyb) {
                    x340Var.i0(-762402423);
                    duk1 duk1Var = (map == null || (w8w0Var3 = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var3.a.a;
                    i820Var = duk1Var != null ? new yqk1(duk1Var) : null;
                    boolean zG2 = x340Var.g(i820Var);
                    Object objT3 = x340Var.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = v8r.q(i820Var);
                        x340Var.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    p811 p811Var = new p811();
                    List listC = xskVar.c();
                    ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yqk1((duk1) it.next()));
                    }
                    p811Var.a = arrayList;
                    c680.c(mqo1.A(arrayList), ven0Var2.getValue(), new bwj0(ven0Var2, iu30Var, p811Var, wvj0Var, (byte) 0), p1j.b, rybVar, (qim0) null, cwl1.o0(x340Var, 2131958629), x340Var, 3072);
                    x340Var.r(false);
                } else if (rybVar instanceof syb) {
                    x340Var.i0(-759527080);
                    jez jezVar = (map == null || (w8w0Var2 = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var2.b.a;
                    i820Var = jezVar != null ? new eez(jezVar) : null;
                    boolean zG3 = x340Var.g(i820Var);
                    Object objT4 = x340Var.T();
                    if (zG3 || objT4 == m4cVar) {
                        objT4 = v8r.q(i820Var);
                        x340Var.s0(objT4);
                    }
                    ven0 ven0Var3 = (ven0) objT4;
                    p811 p811Var2 = new p811();
                    List listA = xskVar.a();
                    ArrayList arrayList2 = new ArrayList(q7h.U(listA, 10));
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new eez((jez) it2.next()));
                    }
                    p811Var2.a = arrayList2;
                    c680.c(mqo1.A(arrayList2), ven0Var3.getValue(), new bwj0(ven0Var3, iu30Var, p811Var2, wvj0Var, (byte) 1), p1j.c, rybVar, (qim0) null, cwl1.o0(x340Var, 2131958627), x340Var, 3072);
                    x340Var.r(false);
                } else if (rybVar instanceof tyb) {
                    x340Var.i0(-756780945);
                    ha20 ha20Var = (map == null || (w8w0Var = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var.c.a;
                    i820Var = ha20Var != null ? new i820(ha20Var) : null;
                    boolean zG4 = x340Var.g(i820Var);
                    Object objT5 = x340Var.T();
                    if (zG4 || objT5 == m4cVar) {
                        objT5 = v8r.q(i820Var);
                        x340Var.s0(objT5);
                    }
                    ven0 ven0Var4 = (ven0) objT5;
                    p811 p811Var3 = new p811();
                    List listB = xskVar.b();
                    ArrayList arrayList3 = new ArrayList(q7h.U(listB, 10));
                    Iterator it3 = listB.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new i820((ha20) it3.next()));
                    }
                    p811Var3.a = arrayList3;
                    c680.c(mqo1.A(arrayList3), ven0Var4.getValue(), new bwj0(ven0Var4, iu30Var, p811Var3, wvj0Var, (byte) 2), p1j.d, rybVar, (qim0) null, cwl1.o0(x340Var, 2131958628), x340Var, 3072);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-754012800);
                    x340Var.r(false);
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(wvj0Var, iu30Var, xskVar, i, (byte) 22);
        }
    }

    public static final void t(int i, hct0 hct0Var, Function0 function0, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-124402666);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(hct0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            r1p1.c(48, apo.r(184665455, new zo7(hct0Var, i, function0, (byte) 8), x340Var), x340Var, new gsc1(hct0Var, (byte) 8));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(i, hct0Var, function0, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void u(fdj1 fdj1Var, jbj1 jbj1Var, j2i j2iVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        fdj1 fdj1Var2;
        int i2;
        j2i j2iVar2;
        iu30 iu30Var2;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-300533776);
        if ((i & 6) == 0) {
            fdj1Var2 = fdj1Var;
            i2 = (x340Var.i(fdj1Var2) ? 4 : 2) | i;
        } else {
            fdj1Var2 = fdj1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jbj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2iVar2 = j2iVar;
            i2 |= x340Var.i(j2iVar2) ? 256 : 128;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((i & 3072) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 24576) == 0) {
            function6 = function0;
            i2 |= x340Var.i(function6) ? 16384 : 8192;
        } else {
            function6 = function0;
        }
        if ((196608 & i) == 0) {
            function7 = function1;
            i2 |= x340Var.i(function7) ? 131072 : 65536;
        } else {
            function7 = function1;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function8 = function3;
            i2 |= x340Var.i(function8) ? 8388608 : 4194304;
        } else {
            function8 = function3;
        }
        if ((100663296 & i) == 0) {
            function9 = function4;
            i2 |= x340Var.i(function9) ? 67108864 : 33554432;
        } else {
            function9 = function4;
        }
        if ((805306368 & i) == 0) {
            i2 |= x340Var.i(function5) ? 536870912 : 268435456;
        }
        int i3 = x340Var.i(qim0Var) ? 4 : 2;
        if (!x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            x340Var.b0();
        } else if (jbj1Var.a == 3 || jbj1Var.b == 3) {
            x340Var.i0(1805584029);
            int i4 = i2 >> 3;
            int i5 = (i2 & 14) | (i4 & 112) | (i4 & 896);
            int i6 = i2 >> 12;
            o1p1.e(fdj1Var, j2iVar, iu30Var, function3, function4, function5, qim0Var, x340Var, i5 | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | ((i3 << 18) & 3670016));
            x340Var.r(false);
        } else {
            x340Var.i0(1805868857);
            f(fdj1Var2, jbj1Var, j2iVar2, iu30Var2, function6, function7, function2, function8, function9, function5, qim0Var, x340Var, 2147483646 & i2, i3 & 14);
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pnu(fdj1Var, jbj1Var, j2iVar, iu30Var, function0, function1, function2, function3, function4, function5, qim0Var, i);
        }
    }

    public static final void v(o2u0 o2u0Var, List list, boolean z, boolean z2, boolean z3, iu30 iu30Var, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(561918504);
        int i2 = i | (x340Var.i(o2u0Var) ? 4 : 2) | (x340Var.i(list) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536) | (x340Var.i(vu30Var) ? 1048576 : 524288) | (x340Var.i(vu30Var2) ? 8388608 : 4194304) | 100663296;
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            j2i j2iVarR = apo.r(1241152351, new xpg1(o2u0Var, list, z, z2, z3, iu30Var, vu30Var, vu30Var2), x340Var);
            qim0 qim0Var3 = nim0.a;
            cwl1.b(qim0Var3, (tl3) null, cr31VarB, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, j2iVarR, x340Var, 6, 48, 2026);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c9j1(o2u0Var, list, z, z2, z3, iu30Var, vu30Var, vu30Var2, qim0Var2, i);
        }
    }

    public static final void w(boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-343456828);
        int i2 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.h(z2) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024) | (x340Var2.i(qim0Var) ? 16384 : 8192);
        if (!x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (z) {
            x340Var2.i0(-1310090212);
            r(qim0Var, x340Var2, (i2 >> 12) & 14);
            x340Var2.r(false);
            x340Var = x340Var2;
        } else {
            x340Var2.i0(-1310046967);
            x340Var = x340Var2;
            p((i2 & 7168) | ((i2 >> 3) & 126) | ((i2 >> 6) & 896), function0, function1, x340Var, qim0Var, z2);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new knk0(z, z2, function0, function1, qim0Var, i, (byte) 4);
        }
    }

    public static final void x(o2u0 o2u0Var, List list, boolean z, boolean z2, boolean z3, iu30 iu30Var, b0k b0kVar, int i) {
        uoa uoaVar;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(860715801);
        int i2 = i | (x340Var.i(o2u0Var) ? 4 : 2) | (x340Var.i(list) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zG = x340Var.g(o2u0Var);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = (uoa) iu30Var.invoke(o2u0Var);
                x340Var.s0(objT);
            }
            uoa uoaVar2 = (uoa) objT;
            boolean zG2 = x340Var.g(list);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = a4p1.k(list);
                x340Var.s0(objT2);
            }
            a7j1 a7j1Var = (a7j1) objT2;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zG3 = x340Var.g(o2u0Var) | x340Var.g(a7j1Var);
            Object objT3 = x340Var.T();
            Object obj2 = objT3;
            if (zG3 || objT3 == obj) {
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView(context);
                videoSurfaceView.setSupportsSurfaceView(a7j1Var != null);
                if (!videoSurfaceView.getSupportsSurfaceView()) {
                    videoSurfaceView.setUseSurfaceView(false);
                }
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.b);
                if (a7j1Var != null) {
                    videoSurfaceView.d(a7j1Var.b, a7j1Var.c);
                }
                x340Var.s0(videoSurfaceView);
                obj2 = videoSurfaceView;
            }
            VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj2;
            boolean zI = x340Var.i(uoaVar2) | x340Var.i(videoSurfaceView2);
            Object objT4 = x340Var.T();
            if (zI || objT4 == obj) {
                objT4 = new rzf1(uoaVar2, videoSurfaceView2, (byte) 21);
                x340Var.s0(objT4);
            }
            qxd0.h(uoaVar2, videoSurfaceView2, (iu30) objT4, x340Var);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zI2 = x340Var.i(uoaVar2) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | x340Var.i(o2u0Var);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == obj) {
                uoaVar = uoaVar2;
                z8j1 z8j1Var = new z8j1(uoaVar, z2, z, o2u0Var, (byte) 1);
                x340Var.s0(z8j1Var);
                objT5 = z8j1Var;
            } else {
                uoaVar = uoaVar2;
            }
            Function0 function0 = (Function0) objT5;
            if (x340Var.g(uoaVar) | x340Var.g(boolValueOf) | x340Var.g(boolValueOf2)) {
                qxd0.S(function0, x340Var);
            }
            gfx.b(1, apo.r(400848644, new kf2(z3, (Object) videoSurfaceView2, (byte) 28), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z96(o2u0Var, list, z, z2, z3, iu30Var, i, (byte) 3);
        }
    }

    public static tnm y(kpz0 kpz0Var, aqr0 aqr0Var, q7r0 q7r0Var, rih1 rih1Var) {
        kpz0Var.getClass();
        rih1Var.getClass();
        return new tnm(kpz0Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c A[RETURN] */
    public static final cb11 z(Annotation[] annotationArr, kf30 kf30Var) {
        for (Annotation annotation : annotationArr) {
            if (u890.j(bb11.a(j2h1.s(annotation).n()).a(), kf30Var)) {
                if (annotation != null) {
                    return new cb11(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new cb11(annotation);
        }
        return null;
    }
}
