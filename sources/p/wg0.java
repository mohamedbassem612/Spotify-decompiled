package p;

import android.app.Application;
import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wg0 implements jly0 {
    public static th30 A(dg30 dg30Var) {
        return dg30Var.e0();
    }

    public static lrw0 B() {
        return new lrw0(krw0.i);
    }

    public static BehaviorSubject C() {
        return BehaviorSubject.f();
    }

    public static v2 a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 2);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static xp0 b(jo80 jo80Var, jo80 jo80Var2, kly0 kly0Var, jly0 jly0Var, kly0 kly0Var2, jly0 jly0Var2, caq caqVar, jly0 jly0Var3, gbp gbpVar, gbp gbpVar2, caq caqVar2) {
        xp0 xp0Var = new xp0();
        xp0Var.a = jo80Var;
        xp0Var.b = jo80Var2;
        xp0Var.c = kly0Var;
        xp0Var.d = jly0Var;
        xp0Var.e = kly0Var2;
        xp0Var.f = jly0Var2;
        xp0Var.g = caqVar;
        xp0Var.h = jly0Var3;
        xp0Var.i = gbpVar;
        xp0Var.j = gbpVar2;
        xp0Var.k = caqVar2;
        return xp0Var;
    }

    public static ot0 c(r7q r7qVar, kly0 kly0Var, r7q r7qVar2, gbp gbpVar, gbp gbpVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, r7q r7qVar6, caq caqVar, caq caqVar2, kly0 kly0Var2, caq caqVar3, caq caqVar4, kly0 kly0Var3) {
        ot0 ot0Var = new ot0();
        ot0Var.a = r7qVar;
        ot0Var.b = kly0Var;
        ot0Var.c = r7qVar2;
        ot0Var.d = gbpVar;
        ot0Var.e = gbpVar2;
        ot0Var.f = r7qVar3;
        ot0Var.g = r7qVar4;
        ot0Var.h = r7qVar5;
        ot0Var.i = r7qVar6;
        ot0Var.j = caqVar;
        ot0Var.k = caqVar2;
        ot0Var.l = kly0Var2;
        ot0Var.m = caqVar3;
        ot0Var.n = caqVar4;
        ot0Var.o = kly0Var3;
        return ot0Var;
    }

    public static pt0 d(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 0);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static d21 e(jly0 jly0Var, caq caqVar, jly0 jly0Var2, jo80 jo80Var, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, jly0 jly0Var3, jly0 jly0Var4, caq caqVar2, kly0 kly0Var4, kly0 kly0Var5, caq caqVar3, kly0 kly0Var6, caq caqVar4, caq caqVar5, kly0 kly0Var7, kly0 kly0Var8, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, kly0 kly0Var9, kly0 kly0Var10, jly0 jly0Var8, jly0 jly0Var9, kly0 kly0Var11, caq caqVar6, caq caqVar7, kly0 kly0Var12, kly0 kly0Var13, caq caqVar8) {
        d21 d21Var = new d21();
        d21Var.a = jly0Var;
        d21Var.b = caqVar;
        d21Var.c = jly0Var2;
        d21Var.d = jo80Var;
        d21Var.e = kly0Var;
        d21Var.f = kly0Var2;
        d21Var.g = kly0Var3;
        d21Var.h = jly0Var3;
        d21Var.i = jly0Var4;
        d21Var.j = caqVar2;
        d21Var.k = kly0Var4;
        d21Var.l = kly0Var5;
        d21Var.m = caqVar3;
        d21Var.n = kly0Var6;
        d21Var.o = caqVar4;
        d21Var.p = caqVar5;
        d21Var.q = kly0Var7;
        d21Var.r = kly0Var8;
        d21Var.s = jly0Var5;
        d21Var.t = jly0Var6;
        d21Var.u = jly0Var7;
        d21Var.v = kly0Var9;
        d21Var.w = kly0Var10;
        d21Var.x = jly0Var8;
        d21Var.y = jly0Var9;
        d21Var.z = kly0Var11;
        d21Var.A = caqVar6;
        d21Var.B = caqVar7;
        d21Var.C = kly0Var12;
        d21Var.D = kly0Var13;
        d21Var.E = caqVar8;
        return d21Var;
    }

    public static h21 f(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 0);
    }

    public static xu1 g(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, caq caqVar5, kly0 kly0Var, jly0 jly0Var6, caq caqVar6, caq caqVar7, jly0 jly0Var7, caq caqVar8, caq caqVar9, kly0 kly0Var2, jly0 jly0Var8, jly0 jly0Var9, jly0 jly0Var10, g5t g5tVar, caq caqVar10, caq caqVar11, jly0 jly0Var11, jly0 jly0Var12, jly0 jly0Var13, jly0 jly0Var14, jly0 jly0Var15, caq caqVar12, jly0 jly0Var16, caq caqVar13, g5t g5tVar2, jly0 jly0Var17, jly0 jly0Var18, caq caqVar14, caq caqVar15, caq caqVar16, caq caqVar17, kly0 kly0Var3, jly0 jly0Var19, caq caqVar18, caq caqVar19, caq caqVar20, kly0 kly0Var4, jly0 jly0Var20, caq caqVar21) {
        xu1 xu1Var = new xu1();
        xu1Var.a = caqVar;
        xu1Var.b = caqVar2;
        xu1Var.c = caqVar3;
        xu1Var.d = caqVar4;
        xu1Var.e = jo80Var;
        xu1Var.f = jo80Var2;
        xu1Var.g = jly0Var;
        xu1Var.h = jly0Var2;
        xu1Var.i = jly0Var3;
        xu1Var.j = jly0Var4;
        xu1Var.k = jly0Var5;
        xu1Var.l = caqVar5;
        xu1Var.m = kly0Var;
        xu1Var.n = jly0Var6;
        xu1Var.o = caqVar6;
        xu1Var.p = caqVar7;
        xu1Var.q = jly0Var7;
        xu1Var.r = caqVar8;
        xu1Var.s = caqVar9;
        xu1Var.t = kly0Var2;
        xu1Var.u = jly0Var8;
        xu1Var.v = jly0Var9;
        xu1Var.w = jly0Var10;
        xu1Var.x = g5tVar;
        xu1Var.y = caqVar10;
        xu1Var.z = caqVar11;
        xu1Var.A = jly0Var11;
        xu1Var.B = jly0Var12;
        xu1Var.C = jly0Var13;
        xu1Var.D = jly0Var14;
        xu1Var.E = jly0Var15;
        xu1Var.F = caqVar12;
        xu1Var.G = jly0Var16;
        xu1Var.H = caqVar13;
        xu1Var.I = g5tVar2;
        xu1Var.J = jly0Var17;
        xu1Var.K = jly0Var18;
        xu1Var.L = caqVar14;
        xu1Var.M = caqVar15;
        xu1Var.N = caqVar16;
        xu1Var.O = caqVar17;
        xu1Var.P = kly0Var3;
        xu1Var.Q = jly0Var19;
        xu1Var.R = caqVar18;
        xu1Var.S = caqVar19;
        xu1Var.T = caqVar20;
        xu1Var.U = kly0Var4;
        xu1Var.V = jly0Var20;
        xu1Var.W = caqVar21;
        return xu1Var;
    }

    public static mx1 h(jly0 jly0Var, jly0 jly0Var2) {
        mx1 mx1Var = new mx1();
        mx1Var.a = jly0Var;
        mx1Var.b = jly0Var2;
        return mx1Var;
    }

    public static i22 i(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7) {
        i22 i22Var = new i22();
        i22Var.a = kly0Var;
        i22Var.b = kly0Var2;
        i22Var.c = kly0Var3;
        i22Var.d = kly0Var4;
        i22Var.e = kly0Var5;
        i22Var.f = kly0Var6;
        i22Var.g = kly0Var7;
        return i22Var;
    }

    public static pt0 j(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 4);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static h21 k(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 2);
    }

    public static ti0 l(Application application) {
        return new ti0(application);
    }

    public static rn0 m(RxRouter rxRouter) {
        return new rn0(new gn0(new CosmosTransport(new sn0(rxRouter, (byte) 0))));
    }

    public static aw0 n(RetrofitMaker retrofitMaker) {
        return (aw0) retrofitMaker.createWebgateService(aw0.class, "android-adsdisplay-preview");
    }

    public static il1 o(fl1 fl1Var) {
        return new il1(fl1Var);
    }

    public static ObservableFromPublisher p(Flowable flowable) {
        return new ObservableFromPublisher(flowable.J(cxo1.c).x(o9p1.c).J(vap1.b));
    }

    public static ylm q() {
        cqz0 cqz0Var = bf81.a;
        ylm ylmVar = new ylm();
        z6x z6xVar = z6x.a;
        ylmVar.a = z6xVar;
        ylmVar.b = z6xVar;
        return ylmVar;
    }

    public static wh1 r(ycc1 ycc1Var) {
        return new wh1(new ham(ycc1Var));
    }

    public static mt1 s() {
        return new mt1((int) Math.ceil(upo1.I(true)), (int) Math.ceil(upo1.I(false)));
    }

    public static jm1 t(a0m a0mVar) {
        return new jm1(a0mVar, (byte) 2);
    }

    public static cn3 u(Context context) {
        return new cn3(context, false);
    }

    public static g21 v(kzp kzpVar) {
        return new g21(kzpVar, (byte) 1);
    }

    public static g21 w(mzp mzpVar) {
        return new g21(mzpVar, (byte) 2);
    }

    public static g21 x(nzp nzpVar) {
        return new g21(nzpVar, (byte) 3);
    }

    public static g21 y(kzp kzpVar) {
        return new g21(kzpVar, (byte) 4);
    }

    public static llm z(dg30 dg30Var) {
        j0d1 j0d1VarB = guo1.B();
        ((f0i) dg30Var).a.a(new zh0(dg30Var, j0d1VarB, (byte) 0));
        fns fnsVar = igu.a;
        fnsVar.getClass();
        return smo1.e(flo1.l(fnsVar, j0d1VarB));
    }
}
