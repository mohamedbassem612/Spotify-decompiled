package p;

import android.content.Context;
import android.os.Build;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ilg implements jly0 {
    public static tif1 A() {
        return !ihc1.h0("profile", "release", false) ? xco0.a : e95.a;
    }

    public static vhc B(m6p m6pVar) {
        s24 s24Var = m6pVar.a;
        return new vhc((agc0) ((kly0) s24Var.i).get(), (xrm1) ((kly0) s24Var.N0).get(), (byte) 28);
    }

    public static rpm1 C(m6p m6pVar) {
        return new rpm1((iyc0) ((kly0) m6pVar.a.X).get());
    }

    public static u9c D(Context context, cxc cxcVar, zk4 zk4Var) {
        u9c u9cVar = new u9c(context);
        ic10 ic10Var = (ic10) u9cVar.e;
        u9cVar.c = new idd1(new mo2(context, (byte) 4));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList4.add(new og(new o7o0(new g030(new d4e(cxcVar, (byte) 1), (byte) 24)), rc11.a.b(j2i1.class), (byte) 17));
        final byte b = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            final mb5 mb5Var = new mb5();
            arrayList5.add(new Function0() { // from class: p.f1i
                public final Object invoke() {
                    byte b2 = b;
                    bar barVar = mb5Var;
                    switch (b2) {
                        case 0:
                            break;
                    }
                    return Collections.singletonList(barVar);
                }
            });
        } else {
            final vr40 vr40Var = new vr40();
            arrayList5.add(new Function0() { // from class: p.f1i
                public final Object invoke() {
                    byte b2 = b;
                    bar barVar = vr40Var;
                    switch (b2) {
                        case 0:
                            break;
                    }
                    return Collections.singletonList(barVar);
                }
            });
        }
        u9cVar.d = new h1i(ila0.F(arrayList), ila0.F(arrayList2), ila0.F(arrayList3), ila0.F(arrayList4), ila0.F(arrayList5));
        ic10Var.a(dz70.f, Boolean.valueOf(hmr.a));
        double dC = ((double) zk4Var.c()) / 100.0d;
        jc10 jc10Var = qw70.a;
        if (0.0d > dC || dC > 1.0d) {
            hhg1.n("percent must be in the range [0.0, 1.0].");
            return null;
        }
        ic10Var.a(qw70.d, Double.valueOf(dC));
        u9cVar.a = wy70.a((wy70) u9cVar.a, (kc10) null, 12287);
        ic10Var.a(cz70.b, eth.c(3072, 3072));
        return u9cVar;
    }

    public static h6p a() {
        h6p h6pVar = new h6p();
        h6pVar.a = xqu.b(new fyo((byte) 6));
        return h6pVar;
    }

    public static m6p b(s24 s24Var) {
        return new m6p(s24Var);
    }

    public static t8c c(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 22);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static odc d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 8);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static cng e(caq caqVar, caq caqVar2, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var) {
        cng cngVar = new cng();
        cngVar.a = caqVar;
        cngVar.b = jly0Var;
        cngVar.c = caqVar2;
        cngVar.d = kly0Var;
        cngVar.e = jly0Var2;
        return cngVar;
    }

    public static nqg f(caq caqVar, r7q r7qVar, caq caqVar2, g5t g5tVar, kly0 kly0Var) {
        nqg nqgVar = new nqg();
        nqgVar.a = caqVar;
        nqgVar.b = r7qVar;
        nqgVar.c = caqVar2;
        nqgVar.d = g5tVar;
        nqgVar.e = kly0Var;
        return nqgVar;
    }

    public static k2h g(jo80 jo80Var, jo80 jo80Var2, caq caqVar, caq caqVar2, r7q r7qVar, caq caqVar3, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, caq caqVar4, kly0 kly0Var, r7q r7qVar6, r7q r7qVar7, r7q r7qVar8, r7q r7qVar9, r7q r7qVar10, caq caqVar5, kly0 kly0Var2, kly0 kly0Var3, caq caqVar6, r7q r7qVar11, kly0 kly0Var4, r7q r7qVar12, r7q r7qVar13, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, caq caqVar7, kly0 kly0Var8, r7q r7qVar14, caq caqVar8, r7q r7qVar15, r7q r7qVar16, r7q r7qVar17) {
        k2h k2hVar = new k2h();
        k2hVar.a = jo80Var;
        k2hVar.b = jo80Var2;
        k2hVar.c = caqVar;
        k2hVar.d = caqVar2;
        k2hVar.e = r7qVar;
        k2hVar.f = caqVar3;
        k2hVar.g = r7qVar2;
        k2hVar.h = r7qVar3;
        k2hVar.i = r7qVar4;
        k2hVar.j = r7qVar5;
        k2hVar.k = caqVar4;
        k2hVar.l = kly0Var;
        k2hVar.m = r7qVar6;
        k2hVar.n = r7qVar7;
        k2hVar.o = r7qVar8;
        k2hVar.f32p = r7qVar9;
        k2hVar.q = r7qVar10;
        k2hVar.r = caqVar5;
        k2hVar.s = kly0Var2;
        k2hVar.t = kly0Var3;
        k2hVar.u = caqVar6;
        k2hVar.v = r7qVar11;
        k2hVar.w = kly0Var4;
        k2hVar.x = r7qVar12;
        k2hVar.y = r7qVar13;
        k2hVar.z = kly0Var5;
        k2hVar.A = kly0Var6;
        k2hVar.B = kly0Var7;
        k2hVar.C = caqVar7;
        k2hVar.D = kly0Var8;
        k2hVar.E = r7qVar14;
        k2hVar.F = caqVar8;
        k2hVar.G = r7qVar15;
        k2hVar.H = r7qVar16;
        k2hVar.I = r7qVar17;
        return k2hVar;
    }

    public static t8c h(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 23);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static qmg i(boolean z, boolean z2, uu00 uu00Var, boolean z3, joo jooVar) {
        return new qmg(z, z2, uu00Var, z3, jooVar);
    }

    public static rf01 j(u9c u9cVar, z4n z4nVar, dmm0 dmm0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList.add(new e3i1());
        arrayList.add(new vlm0(dmm0Var));
        arrayList.add(new qas0());
        jd11 jd11Var = rc11.a;
        arrayList4.add(new og(z4nVar, jd11Var.b(j2i1.class), (byte) 17));
        arrayList3.add(new mmr0(new q05((byte) 2), jd11Var.b(j2i1.class)));
        u9cVar.d = new h1i(ila0.F(arrayList), ila0.F(arrayList2), ila0.F(arrayList3), ila0.F(arrayList4), ila0.F(arrayList5));
        return u9cVar.d();
    }

    public static lxg k() {
        lxg lxgVarA = nxg.a();
        c8o.m(lxgVarA);
        return lxgVarA;
    }

    public static w4h l(m6p m6pVar) {
        return new w4h(new CosmosTransport(new sn0((RxRouter) ((kly0) m6pVar.a.d).get(), (byte) 8)));
    }

    public static r5h m(m6p m6pVar) {
        return s5h.k((RxRouter) ((kly0) m6pVar.a.d).get());
    }

    public static g7h n(m6p m6pVar) {
        s24 s24Var = m6pVar.a;
        return new g7h(new u9c(s5h.k((RxRouter) ((kly0) s24Var.d).get()), (mwm1) ((kly0) s24Var.e).get(), (nwf1) ((kly0) s24Var.f).get(), (n6g1) ((kly0) s24Var.g).get(), (q8n) ((kly0) s24Var.h).get(), f46.S0(new blc0[]{blc0.ti, blc0.Pg, blc0.ed, blc0.M3, blc0.C8})));
    }

    public static zxl o(m6p m6pVar) {
        Context context = (Context) ((kly0) m6pVar.a.b).get();
        dn3 dn3Var = new dn3();
        dn3Var.a = context.getApplicationContext();
        return new zxl(dn3Var);
    }

    public static z4n p(Context context, f5n f5nVar, amm0 amm0Var, cxc cxcVar, z8c0 z8c0Var) {
        return new z4n(context, f5nVar, amm0Var, cxcVar, (nq80) null, z8c0Var);
    }

    public static DateFormat q() {
        return DateFormat.getDateInstance(2);
    }

    public static gmr r(Context context, rf01 rf01Var) {
        return new gmr(context, rf01Var);
    }

    public static oyg s(aod aodVar) {
        return new oyg(new b6p(aodVar));
    }

    public static eny t(m6p m6pVar) {
        s24 s24Var = m6pVar.a;
        return new eny((xrc0) ((kly0) s24Var.t).get(), (zwm1) ((kly0) s24Var.Y).get(), (agc0) ((kly0) s24Var.i).get(), (ueg) ((kly0) s24Var.Z).get());
    }

    public static byl u(m6p m6pVar) {
        return new byl((Context) ((kly0) m6pVar.a.c).get());
    }

    public static q58 v(ejb ejbVar) {
        return new q58(ejbVar, (byte) 29);
    }

    public static lpd w(kzp kzpVar) {
        return new lpd(kzpVar, (byte) 11);
    }

    public static lpd x(a0q a0qVar) {
        return new lpd(a0qVar, (byte) 13);
    }

    public static lpd y(y0q y0qVar) {
        return new lpd(y0qVar, (byte) 12);
    }

    public static eqg z(sjb sjbVar) {
        return new eqg(sjbVar, (byte) 0);
    }
}
