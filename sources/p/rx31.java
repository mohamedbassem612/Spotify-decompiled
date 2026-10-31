package p;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.search.historyroom.db.HistoryDatabase;
import io.reactivex.rxjava3.core.Observable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class rx31 implements jly0 {
    public static rd51 A(RetrofitMaker retrofitMaker, di4 di4Var) {
        return (rd51) retrofitMaker.createWebgateService(rd51.class, "android-search-onlineproto", new md51(di4Var.Y()));
    }

    public static sqs0 B(Context context, ut71 ut71Var) {
        return new sqs0(context, ut71Var);
    }

    public static yoq C(cqz cqzVar) {
        return new yoq(cqzVar);
    }

    public static ppw0 a(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 27);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static uww0 b(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 7);
    }

    public static nh41 c(kly0 kly0Var, kly0 kly0Var2) {
        nh41 nh41Var = new nh41();
        nh41Var.a = kly0Var;
        nh41Var.b = kly0Var2;
        return nh41Var;
    }

    public static v651 d(r7q r7qVar, r7q r7qVar2, jo80 jo80Var, thq thqVar, jo80 jo80Var2, r7q r7qVar3, r7q r7qVar4, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, caq caqVar4, caq caqVar5, kly0 kly0Var2, r7q r7qVar5, r7q r7qVar6, kly0 kly0Var3, caq caqVar6, r7q r7qVar7, kly0 kly0Var4, caq caqVar7, r7q r7qVar8, caq caqVar8, r7q r7qVar9, caq caqVar9, r7q r7qVar10, kly0 kly0Var5, caq caqVar10, g5t g5tVar, gbp gbpVar, kly0 kly0Var6, kly0 kly0Var7, kly0 kly0Var8, kly0 kly0Var9, caq caqVar11, caq caqVar12, caq caqVar13, caq caqVar14, caq caqVar15, caq caqVar16, thq thqVar2, caq caqVar17, g5t g5tVar2, r7q r7qVar11, caq caqVar18, caq caqVar19, kly0 kly0Var10, r7q r7qVar12, caq caqVar20, r7q r7qVar13, jly0 jly0Var, r7q r7qVar14, r7q r7qVar15, r7q r7qVar16, r7q r7qVar17, kly0 kly0Var11, kly0 kly0Var12, kly0 kly0Var13, kly0 kly0Var14, r7q r7qVar18, r7q r7qVar19, kly0 kly0Var15, r7q r7qVar20, r7q r7qVar21, caq caqVar21, gbp gbpVar2, jly0 jly0Var2, caq caqVar22, caq caqVar23, caq caqVar24, kly0 kly0Var16, kly0 kly0Var17, kly0 kly0Var18, r7q r7qVar22, r7q r7qVar23, gbp gbpVar3, jly0 jly0Var3, r7q r7qVar24, caq caqVar25, r7q r7qVar25, kly0 kly0Var19, kly0 kly0Var20, caq caqVar26, kly0 kly0Var21, kly0 kly0Var22, kly0 kly0Var23, r7q r7qVar26, r7q r7qVar27, caq caqVar27, r7q r7qVar28, caq caqVar28, kly0 kly0Var24, caq caqVar29, caq caqVar30, caq caqVar31, kly0 kly0Var25, g5t g5tVar3, caq caqVar32, caq caqVar33, caq caqVar34, kly0 kly0Var26, r7q r7qVar29, r7q r7qVar30, caq caqVar35, thq thqVar3, r7q r7qVar31) {
        v651 v651Var = new v651();
        v651Var.a = r7qVar;
        v651Var.b = r7qVar2;
        v651Var.c = jo80Var;
        v651Var.d = thqVar;
        v651Var.e = jo80Var2;
        v651Var.f = r7qVar3;
        v651Var.g = r7qVar4;
        v651Var.h = caqVar;
        v651Var.i = caqVar2;
        v651Var.j = caqVar3;
        v651Var.k = kly0Var;
        v651Var.l = caqVar4;
        v651Var.m = caqVar5;
        v651Var.n = kly0Var2;
        v651Var.o = r7qVar5;
        v651Var.f41p = r7qVar6;
        v651Var.q = kly0Var3;
        v651Var.r = caqVar6;
        v651Var.s = r7qVar7;
        v651Var.t = kly0Var4;
        v651Var.u = caqVar7;
        v651Var.v = r7qVar8;
        v651Var.w = caqVar8;
        v651Var.x = r7qVar9;
        v651Var.y = caqVar9;
        v651Var.z = r7qVar10;
        v651Var.A = kly0Var5;
        v651Var.B = caqVar10;
        v651Var.C = g5tVar;
        v651Var.D = gbpVar;
        v651Var.E = kly0Var6;
        v651Var.F = kly0Var7;
        v651Var.G = kly0Var8;
        v651Var.H = kly0Var9;
        v651Var.I = caqVar11;
        v651Var.J = caqVar12;
        v651Var.K = caqVar13;
        v651Var.L = caqVar14;
        v651Var.M = caqVar15;
        v651Var.N = caqVar16;
        v651Var.O = thqVar2;
        v651Var.P = caqVar17;
        v651Var.Q = g5tVar2;
        v651Var.R = r7qVar11;
        v651Var.S = caqVar18;
        v651Var.T = caqVar19;
        v651Var.U = kly0Var10;
        v651Var.V = r7qVar12;
        v651Var.W = caqVar20;
        v651Var.X = r7qVar13;
        v651Var.Y = jly0Var;
        v651Var.Z = r7qVar14;
        v651Var.a0 = r7qVar15;
        v651Var.b0 = r7qVar16;
        v651Var.c0 = r7qVar17;
        v651Var.d0 = kly0Var11;
        v651Var.e0 = kly0Var12;
        v651Var.f0 = kly0Var13;
        v651Var.g0 = kly0Var14;
        v651Var.h0 = r7qVar18;
        v651Var.i0 = r7qVar19;
        v651Var.j0 = kly0Var15;
        v651Var.k0 = r7qVar20;
        v651Var.l0 = r7qVar21;
        v651Var.m0 = caqVar21;
        v651Var.n0 = gbpVar2;
        v651Var.o0 = jly0Var2;
        v651Var.p0 = caqVar22;
        v651Var.q0 = caqVar23;
        v651Var.r0 = caqVar24;
        v651Var.s0 = kly0Var16;
        v651Var.t0 = kly0Var17;
        v651Var.u0 = kly0Var18;
        v651Var.v0 = r7qVar22;
        v651Var.w0 = r7qVar23;
        v651Var.x0 = gbpVar3;
        v651Var.y0 = jly0Var3;
        v651Var.z0 = r7qVar24;
        v651Var.A0 = caqVar25;
        v651Var.B0 = r7qVar25;
        v651Var.C0 = kly0Var19;
        v651Var.D0 = kly0Var20;
        v651Var.E0 = caqVar26;
        v651Var.F0 = kly0Var21;
        v651Var.G0 = kly0Var22;
        v651Var.H0 = kly0Var23;
        v651Var.I0 = r7qVar26;
        v651Var.J0 = r7qVar27;
        v651Var.K0 = caqVar27;
        v651Var.L0 = r7qVar28;
        v651Var.M0 = caqVar28;
        v651Var.N0 = kly0Var24;
        v651Var.O0 = caqVar29;
        v651Var.P0 = caqVar30;
        v651Var.Q0 = caqVar31;
        v651Var.R0 = kly0Var25;
        v651Var.S0 = g5tVar3;
        v651Var.T0 = caqVar32;
        v651Var.U0 = caqVar33;
        v651Var.V0 = caqVar34;
        v651Var.W0 = kly0Var26;
        v651Var.X0 = r7qVar29;
        v651Var.Y0 = r7qVar30;
        v651Var.Z0 = caqVar35;
        v651Var.a1 = thqVar3;
        v651Var.b1 = r7qVar31;
        return v651Var;
    }

    public static uo51 e(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, jo80 jo80Var, jly0 jly0Var4) {
        uo51 uo51Var = new uo51();
        uo51Var.a = jly0Var;
        uo51Var.b = jly0Var2;
        uo51Var.c = jly0Var3;
        uo51Var.d = caqVar;
        uo51Var.e = jo80Var;
        uo51Var.f = jly0Var4;
        return uo51Var;
    }

    public static ppw0 f(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 28);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static List g(fza fzaVar, n4b n4bVar, owf1 owf1Var, eea0 eea0Var, mhc mhcVar, pvc pvcVar, lhc lhcVar, kr60 kr60Var, sua suaVar, jd1 jd1Var, dqu dquVar, q7j0 q7j0Var, vee0 vee0Var, zb91 zb91Var, rgm rgmVar, xq81 xq81Var, twa twaVar, tpp0 tpp0Var, av8 av8Var, rgm rgmVar2, uic uicVar, lqc lqcVar, ujc1 ujc1Var, i3b i3bVar, wcr wcrVar, av8 av8Var2, t4d1 t4d1Var, jd1 jd1Var2, sun sunVar, rgm rgmVar3, mev mevVar, jxp0 jxp0Var, mev mevVar2, gna0 gna0Var, ujc1 ujc1Var2, lxh1 lxh1Var, ujc1 ujc1Var3, l2a l2aVar, ujc1 ujc1Var4, av8 av8Var3, mlw0 mlw0Var, ij01 ij01Var, s8y0 s8y0Var, zb91 zb91Var2, twa1 twa1Var, gna0 gna0Var2, aod aodVar, ruc0 ruc0Var, vee0 vee0Var2, rgm rgmVar4, ruc0 ruc0Var2, av8 av8Var4, gna0 gna0Var3, vee0 vee0Var3, av8 av8Var5, n801 n801Var, ujc1 ujc1Var5, tym0 tym0Var, av8 av8Var6) {
        return p7h.M(new k1v0[]{new k1v0(av8Var2, new uve0(r6p1.p(new n0v0(pvcVar, (byte) 0), new n0v0(lqcVar, (byte) 0)).r(new n0v0(twaVar, (byte) 0)).s(r6p1.u(new n0v0(fzaVar, (byte) 0), dquVar)).s(r6p1.u(new n0v0(eea0Var, (byte) 0), wcrVar)).s(r6p1.u(new n0v0(suaVar, (byte) 0), tym0Var)).s(r6p1.u(new n0v0(lhcVar, (byte) 0), ruc0Var2)).s(r6p1.u(new n0v0(n4bVar, (byte) 0), aodVar)))), new k1v0(ujc1Var, lqcVar), new k1v0(ujc1Var4, owf1Var), new k1v0(gna0Var2, new uve0(r6p1.p(eea0Var, new n0v0(wcrVar, (byte) 0)))), new k1v0(vee0Var3, new uve0(r6p1.p(suaVar, new n0v0(tym0Var, (byte) 0)))), new k1v0(s8y0Var, new uve0(r6p1.p(ij01Var, new n0v0(n801Var, (byte) 0)))), new k1v0(gna0Var3, lhcVar), new k1v0(av8Var3, new uve0(r6p1.p(n4bVar, new n0v0(aodVar, (byte) 0)))), new k1v0(twa1Var, new uve0(r6p1.p(zb91Var2, new n0v0(lhcVar, (byte) 0)).r(new n0v0(eea0Var, (byte) 0)))), new k1v0(rgmVar, mevVar), new k1v0(gna0Var, mhcVar), new k1v0(rgmVar4, mevVar2), new k1v0(vee0Var, q7j0Var), new k1v0(rgmVar2, twaVar), new k1v0(jd1Var, new uve0(r6p1.p(new n0v0(uicVar, (byte) 0), new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(jxp0Var, (byte) 0)).r(new n0v0(twaVar, (byte) 0)).s(r6p1.u(new n0v0(eea0Var, (byte) 0), new n0v0(wcrVar, (byte) 0))).r(new n0v0(n4bVar, (byte) 0)))), new k1v0(av8Var4, l2aVar), new k1v0(av8Var5, new uve0(r6p1.p(i3bVar, new n0v0(dquVar, (byte) 0)))), new k1v0(av8Var6, i3bVar), new k1v0(av8Var, kr60Var), new k1v0(rgmVar3, sunVar), new k1v0(jd1Var2, t4d1Var), new k1v0(ujc1Var3, lxh1Var), new k1v0(vee0Var2, ruc0Var), new k1v0(ujc1Var5, zb91Var), new k1v0(tpp0Var, jxp0Var), new k1v0(ujc1Var2, new uve0(r6p1.p(jxp0Var, mlw0Var)))});
    }

    public static List h(e2x0 e2x0Var, n4b n4bVar, eea0 eea0Var, pvc pvcVar, lhc lhcVar, sua suaVar, lhc lhcVar2, rgm rgmVar, nhc nhcVar, vem1 vem1Var, djx0 djx0Var, jd1 jd1Var, rgm rgmVar2, xq81 xq81Var, av8 av8Var, vee0 vee0Var, jd1 jd1Var2, ps7 ps7Var, av8 av8Var2, av8 av8Var3, jxa jxaVar, jd1 jd1Var3, her herVar, tpp0 tpp0Var, jxp0 jxp0Var, ujc1 ujc1Var, gna0 gna0Var, gna0 gna0Var2, jd1 jd1Var4, jd1 jd1Var5, a42 a42Var, jd1 jd1Var6, gna0 gna0Var3, gna0 gna0Var4, jd1 jd1Var7, av8 av8Var4, vee0 vee0Var2, jd1 jd1Var8, av8 av8Var5, tpp0 tpp0Var2, sks0 sks0Var, tpp0 tpp0Var3, s8y0 s8y0Var) {
        return p7h.M(new k1v0[]{new k1v0(av8Var2, ps7Var), new k1v0(rgmVar2, herVar), new k1v0(ujc1Var, new ypa((byte) 20, false)), new k1v0(av8Var, new uve0(r6p1.p(new n0v0(e2x0Var, (byte) 0), new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(eea0Var, (byte) 0)).r(new n0v0(jxp0Var, (byte) 0)).r(new n0v0(pvcVar, (byte) 0)).r(new n0v0(suaVar, (byte) 0)).r(new n0v0(n4bVar, (byte) 0)))), new k1v0(gna0Var, lhcVar), new k1v0(jd1Var4, e2x0Var), new k1v0(tpp0Var2, jxp0Var), new k1v0(s8y0Var, jxp0Var), new k1v0(tpp0Var3, new uve0(r6p1.p(jxp0Var, sks0Var))), new k1v0(jd1Var7, e2x0Var), new k1v0(jd1Var, e2x0Var), new k1v0(jd1Var6, a42Var), new k1v0(gna0Var2, nhcVar), new k1v0(jd1Var5, e2x0Var), new k1v0(av8Var4, lhcVar2), new k1v0(av8Var5, lhcVar2), new k1v0(rgmVar, new uve0(r6p1.p(new n0v0(eea0Var, (byte) 0), new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(pvcVar, (byte) 0)).r(new n0v0(jxp0Var, (byte) 0)).r(new n0v0(jxaVar, (byte) 0)).r(new n0v0(n4bVar, (byte) 0)))), new k1v0(jd1Var2, djx0Var), new k1v0(vee0Var, new uve0(r6p1.p(new n0v0(e2x0Var, (byte) 0), new n0v0(eea0Var, (byte) 0)).r(new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(suaVar, (byte) 0)).r(new n0v0(vem1Var, (byte) 0)).r(new n0v0(pvcVar, (byte) 0)).r(new n0v0(jxaVar, (byte) 0)).r(new n0v0(n4bVar, (byte) 0)))), new k1v0(tpp0Var, e2x0Var), new k1v0(jd1Var8, e2x0Var), new k1v0(jd1Var3, e2x0Var), new k1v0(gna0Var3, eea0Var), new k1v0(gna0Var4, pvcVar), new k1v0(vee0Var2, suaVar), new k1v0(av8Var3, n4bVar)});
    }

    public static kh60 i(HistoryDatabase historyDatabase) {
        kh60 kh60VarU = historyDatabase.u();
        c8o.m(kh60VarU);
        return kh60VarU;
    }

    public static HistoryDatabase j(Application application, zgc1 zgc1Var) {
        bn31 bn31VarT = u890.t(application.getApplicationContext(), HistoryDatabase.class, "main-search-database");
        bn31VarT.d();
        bn31VarT.a(new trj0[]{j541.a, j541.b, j541.c, j541.d});
        bn31VarT.b(zgc1Var);
        return bn31VarT.c();
    }

    public static List k(l7c l7cVar, e2x0 e2x0Var, eea0 eea0Var, ujc1 ujc1Var, jd1 jd1Var, m4e0 m4e0Var, t7o0 t7o0Var, ke90 ke90Var, jd1 jd1Var2, vee0 vee0Var, ymm0 ymm0Var, nfb nfbVar, rgm rgmVar, jd1 jd1Var3, h0y h0yVar, rgm rgmVar2) {
        k1v0 k1v0Var = new k1v0(ujc1Var, l7cVar);
        k1v0 k1v0Var2 = new k1v0(jd1Var3, t7o0Var);
        k1v0 k1v0Var3 = new k1v0(jd1Var2, new n0v0(t7o0Var, (byte) 0));
        k1v0 k1v0Var4 = new k1v0(jd1Var, e2x0Var);
        uo5 uo5Var = new uo5((vve0) r6p1.u(ymm0Var, nfbVar).b, (byte) 16);
        uo5Var.d = new uo5(m4e0Var);
        uve0 uve0Var = new uve0(uo5Var);
        n0v0 n0v0Var = new n0v0(h0yVar, (byte) 0);
        uo5 uo5Var2 = new uo5(uve0Var, (byte) 16);
        uo5Var2.c = new uo5(n0v0Var);
        return p7h.M(new k1v0[]{k1v0Var, k1v0Var2, k1v0Var3, k1v0Var4, new k1v0(vee0Var, new uve0(new uo5(uo5Var2))), new k1v0(rgmVar, new n0v0(eea0Var, (byte) 0)), new k1v0(rgmVar2, new n0v0(eea0Var, (byte) 0)), new k1v0(ke90Var, new ypa((byte) 20, false))});
    }

    public static List l(v9c v9cVar, sua suaVar, m4e0 m4e0Var, av8 av8Var, twa1 twa1Var, vee0 vee0Var, vee0 vee0Var2, vee0 vee0Var3) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, v9cVar), new k1v0(vee0Var2, suaVar), new k1v0(vee0Var, m4e0Var), new k1v0(vee0Var3, new ypa((byte) 20, false)), new k1v0(twa1Var, new ypa((byte) 20, false))});
    }

    public static iac0 m(q7r0 q7r0Var) {
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public static List n(owf1 owf1Var, mjv mjvVar, rgm rgmVar, ujc1 ujc1Var) {
        return p7h.M(new k1v0[]{new k1v0(rgmVar, mjvVar), new k1v0(ujc1Var, owf1Var)});
    }

    public static pdl0 o() {
        return new pdl0((byte) 7);
    }

    public static wxl0 p() {
        r6h1 r6h1Var = r6h1.c;
        return new wxl0();
    }

    public static jf11 q(jbq jbqVar) {
        return new jf11(jbqVar, (byte) 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cbr0 r(y651 y651Var, q1r0 q1r0Var, pu00 pu00Var) {
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarU4 = yon1.U4();
        kik1 kik1Var = nik1.q;
        String str = y651Var.c;
        return new cbr0(new dbr0[]{q1r0Var, t1r0Var, s9h1Var, yxe1Var, new bn70(p6r0VarU4, kik1Var.b((str == null || str.length() == 0) ? "spotify:search" : String.format("spotify:search:%s", Arrays.copyOf(new Object[]{d1o1.i(str)}, 1))), (nar0) null), new j0c0(mno1.e0), new x7u0(), pu00Var}, false);
    }

    public static RxRouter s(RxRouterProvider rxRouterProvider, x8c0 x8c0Var) {
        RxRouter rxRouterProvideWithLifecycle = rxRouterProvider.provideWithLifecycle(x8c0Var);
        c8o.m(rxRouterProvideWithLifecycle);
        return rxRouterProvideWithLifecycle;
    }

    public static dn41 t(yoq yoqVar) {
        dn41 dn41Var = (dn41) yoqVar.c.get();
        c8o.m(dn41Var);
        return dn41Var;
    }

    public static yue0 u(yoq yoqVar) {
        yue0 yue0Var = (yue0) yoqVar.d.get();
        c8o.m(yue0Var);
        return yue0Var;
    }

    public static pp41 v(ycc1 ycc1Var) {
        if (Build.VERSION.SDK_INT < 34) {
            ((k8q) ycc1Var.c).getClass();
            return new jfo0();
        }
        daq daqVar = ((j8q) ycc1Var.b).a.a;
        daqVar.getClass();
        return new qp41(new bp41(xqu.a(daqVar.Cg), xqu.a(daqVar.Dg), (q8n) daqVar.E1.get()));
    }

    public static fu41 w(RetrofitMaker retrofitMaker) {
        fu41 fu41Var = (fu41) retrofitMaker.createWebgateService(fu41.class, "android-nowplaying-scrollsection");
        c8o.m(fu41Var);
        return fu41Var;
    }

    public static n801 x(yqg yqgVar) {
        return new n801(yqgVar, (byte) 13);
    }

    public static Observable y(int i, o241 o241Var, rh11 rh11Var) {
        return ((p241) o241Var).a.filter(a4x0.i).map(new uic(rh11Var, (byte) 23)).distinctUntilChanged().map(new ho41(i));
    }

    public static fwp0 z(RxRouter rxRouter) {
        return new fwp0(new CosmosTransport(new x430(rxRouter, (byte) 7)));
    }
}
