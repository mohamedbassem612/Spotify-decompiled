package p;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class j310 implements jly0 {
    public static b791 A(ghp ghpVar) {
        return new b791((g510) ghpVar.a.P.get(), (i710) ghpVar.A0.get(), (a710) ghpVar.v0.get(), (oyr) ghpVar.g0.get());
    }

    public static oyr B(ghp ghpVar) {
        oyr oyrVar = (oyr) ghpVar.g0.get();
        c8o.m(oyrVar);
        return oyrVar;
    }

    public static mwm1 C(ghp ghpVar) {
        return ghpVar.e();
    }

    public static ghp a(b410 b410Var) {
        return new ghp(b410Var);
    }

    public static String b() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("FANDOMCOLLECTIBLES_STORIES", "fandomcollectibles/stories", 549, "fandomcollectibles").c;
    }

    public static x0w c(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 11);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static w7w d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 5);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static t700 e(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 1);
    }

    public static ik10 f(kly0 kly0Var, r7q r7qVar, caq caqVar, r7q r7qVar2) {
        ik10 ik10Var = new ik10();
        ik10Var.a = kly0Var;
        ik10Var.b = r7qVar;
        ik10Var.c = caqVar;
        ik10Var.d = r7qVar2;
        return ik10Var;
    }

    public static an10 g(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, kly0 kly0Var, kly0 kly0Var2, caq caqVar) {
        an10 an10Var = new an10();
        an10Var.a = jo80Var;
        an10Var.b = jly0Var;
        an10Var.c = jly0Var2;
        an10Var.d = jly0Var3;
        an10Var.e = jly0Var4;
        an10Var.f = jly0Var5;
        an10Var.g = kly0Var;
        an10Var.h = kly0Var2;
        an10Var.i = caqVar;
        return an10Var;
    }

    public static u620 h(r7q r7qVar) {
        u620 u620Var = new u620();
        u620Var.a = r7qVar;
        return u620Var;
    }

    public static nh20 i(jo80 jo80Var, r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, caq caqVar, caq caqVar2, r7q r7qVar5, jly0 jly0Var, kly0 kly0Var, r7q r7qVar6, kly0 kly0Var2, r7q r7qVar7, r7q r7qVar8, caq caqVar3, r7q r7qVar9, g5t g5tVar, r7q r7qVar10, kly0 kly0Var3, caq caqVar4, gbp gbpVar, g5t g5tVar2, caq caqVar5, caq caqVar6, caq caqVar7, r7q r7qVar11, caq caqVar8, caq caqVar9, caq caqVar10, r7q r7qVar12, gbp gbpVar2, kly0 kly0Var4, kly0 kly0Var5, r7q r7qVar13) {
        nh20 nh20Var = new nh20();
        nh20Var.a = jo80Var;
        nh20Var.b = r7qVar;
        nh20Var.c = r7qVar2;
        nh20Var.d = r7qVar3;
        nh20Var.e = r7qVar4;
        nh20Var.f = caqVar;
        nh20Var.g = caqVar2;
        nh20Var.h = r7qVar5;
        nh20Var.i = jly0Var;
        nh20Var.j = kly0Var;
        nh20Var.k = r7qVar6;
        nh20Var.l = kly0Var2;
        nh20Var.m = r7qVar7;
        nh20Var.n = r7qVar8;
        nh20Var.o = caqVar3;
        nh20Var.f20p = r7qVar9;
        nh20Var.q = g5tVar;
        nh20Var.r = r7qVar10;
        nh20Var.s = kly0Var3;
        nh20Var.t = caqVar4;
        nh20Var.u = gbpVar;
        nh20Var.v = g5tVar2;
        nh20Var.w = caqVar5;
        nh20Var.x = caqVar6;
        nh20Var.y = caqVar7;
        nh20Var.z = r7qVar11;
        nh20Var.A = caqVar8;
        nh20Var.B = caqVar9;
        nh20Var.C = caqVar10;
        nh20Var.D = r7qVar12;
        nh20Var.E = gbpVar2;
        nh20Var.F = kly0Var4;
        nh20Var.G = kly0Var5;
        nh20Var.H = r7qVar13;
        return nh20Var;
    }

    public static x0w j(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 12);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static t700 k(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 2);
    }

    public static d0r l(j3v j3vVar) {
        return (rzq) j3vVar.b;
    }

    public static yk10 m(w2z w2zVar) {
        return new yk10(new z2p(w2zVar));
    }

    public static j810 n(hhp hhpVar) {
        return (j810) hhpVar.b.get();
    }

    public static j810 o(hhp hhpVar) {
        j810 j810Var = (j810) hhpVar.b.get();
        c8o.m(j810Var);
        return j810Var;
    }

    public static hhp p(dqu dquVar) {
        return new hhp(dquVar);
    }

    public static ya10 q(RetrofitMaker retrofitMaker) {
        ya10 ya10Var = (ya10) retrofitMaker.createWebgateService(ya10.class, "android-partner-account-linking-common");
        c8o.m(ya10Var);
        return ya10Var;
    }

    public static gn10 r(fn10 fn10Var) {
        gn10 gn10VarQ = fn10Var.Q();
        c8o.m(gn10VarQ);
        return gn10VarQ;
    }

    public static wf2 s(t380 t380Var) {
        wf2 wf2Var = new wf2();
        wf2Var.b = t380Var;
        return wf2Var;
    }

    public static yx10 t(RetrofitMaker retrofitMaker) {
        return (yx10) retrofitMaker.createWebgateService(yx10.class, "android-home-common");
    }

    public static cua u() {
        return new cua((byte) 11);
    }

    public static sua v() {
        return new sua((byte) 11);
    }

    public static mev w(Context context) {
        return new mev(FirebaseAnalytics.getInstance(context), (byte) 16);
    }

    public static ruz x(dg30 dg30Var, t8u0 t8u0Var) {
        return t8u0Var.a(((f0i) dg30Var).a).a();
    }

    public static h241 y(ghp ghpVar) {
        h241 h241Var = (h241) ghpVar.B0.get();
        c8o.m(h241Var);
        return h241Var;
    }

    public static y610 z(ghp ghpVar) {
        y610 y610Var = (y610) ghpVar.D0.get();
        c8o.m(y610Var);
        return y610Var;
    }
}
