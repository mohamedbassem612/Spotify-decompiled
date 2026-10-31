package p;

import android.content.res.Resources;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class uou0 implements jly0 {
    public static r781 A(s381 s381Var, pql pqlVar, s9v0 s9v0Var) {
        return s9v0Var.a() ? pqlVar : s381Var;
    }

    public static ga81 B(eyp eypVar) {
        return f7z.B((RxRouter) eypVar.a.b.get());
    }

    public static jih1 C(eyp eypVar) {
        uau0 uau0Var = eypVar.a;
        return new jih1(new lih1(s5h.k((RxRouter) uau0Var.b.get()), (lv00) uau0Var.e.get()));
    }

    public static ezu0 D(xrc0 xrc0Var, zo4 zo4Var) {
        return new ezu0(xrc0Var, zo4Var);
    }

    public static t700 a(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 28);
    }

    public static l9g0 b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 22);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static egn0 c(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 21);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static ypu0 d(caq caqVar, caq caqVar2, jo80 jo80Var, jo80 jo80Var2, r7q r7qVar, caq caqVar3, r7q r7qVar2, gbp gbpVar, caq caqVar4, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var, caq caqVar5, thq thqVar, thq thqVar2, r7q r7qVar5, g5t g5tVar, g5t g5tVar2, r7q r7qVar6, kly0 kly0Var2, r7q r7qVar7, r7q r7qVar8, caq caqVar6, kly0 kly0Var3, r7q r7qVar9, caq caqVar7) {
        ypu0 ypu0Var = new ypu0();
        ypu0Var.a = caqVar;
        ypu0Var.b = caqVar2;
        ypu0Var.c = jo80Var;
        ypu0Var.d = jo80Var2;
        ypu0Var.e = r7qVar;
        ypu0Var.f = caqVar3;
        ypu0Var.g = r7qVar2;
        ypu0Var.h = gbpVar;
        ypu0Var.i = caqVar4;
        ypu0Var.j = r7qVar3;
        ypu0Var.k = r7qVar4;
        ypu0Var.l = kly0Var;
        ypu0Var.m = caqVar5;
        ypu0Var.n = thqVar;
        ypu0Var.o = thqVar2;
        ypu0Var.f91p = r7qVar5;
        ypu0Var.q = g5tVar;
        ypu0Var.r = g5tVar2;
        ypu0Var.s = r7qVar6;
        ypu0Var.t = kly0Var2;
        ypu0Var.u = r7qVar7;
        ypu0Var.v = r7qVar8;
        ypu0Var.w = caqVar6;
        ypu0Var.x = kly0Var3;
        ypu0Var.y = r7qVar9;
        ypu0Var.z = caqVar7;
        return ypu0Var;
    }

    public static nwu0 e(g5t g5tVar, caq caqVar) {
        nwu0 nwu0Var = new nwu0();
        nwu0Var.a = g5tVar;
        nwu0Var.b = caqVar;
        return nwu0Var;
    }

    public static a3v0 f(jo80 jo80Var, jo80 jo80Var2, r7q r7qVar, caq caqVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar2, kly0 kly0Var4, r7q r7qVar2, g5t g5tVar, kly0 kly0Var5, caq caqVar3, kly0 kly0Var6, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var7) {
        a3v0 a3v0Var = new a3v0();
        a3v0Var.a = jo80Var;
        a3v0Var.b = jo80Var2;
        a3v0Var.c = r7qVar;
        a3v0Var.d = caqVar;
        a3v0Var.e = kly0Var;
        a3v0Var.f = kly0Var2;
        a3v0Var.g = kly0Var3;
        a3v0Var.h = caqVar2;
        a3v0Var.i = kly0Var4;
        a3v0Var.j = r7qVar2;
        a3v0Var.k = g5tVar;
        a3v0Var.l = kly0Var5;
        a3v0Var.m = caqVar3;
        a3v0Var.n = kly0Var6;
        a3v0Var.o = caqVar4;
        a3v0Var.f2p = caqVar5;
        a3v0Var.q = caqVar6;
        a3v0Var.r = kly0Var7;
        return a3v0Var;
    }

    public static i3v0 g(jo80 jo80Var, r7q r7qVar, r7q r7qVar2, caq caqVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar2, kly0 kly0Var4, r7q r7qVar3, g5t g5tVar, kly0 kly0Var5, caq caqVar3, kly0 kly0Var6, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var7) {
        i3v0 i3v0Var = new i3v0();
        i3v0Var.a = jo80Var;
        i3v0Var.b = r7qVar;
        i3v0Var.c = r7qVar2;
        i3v0Var.d = caqVar;
        i3v0Var.e = kly0Var;
        i3v0Var.f = kly0Var2;
        i3v0Var.g = kly0Var3;
        i3v0Var.h = caqVar2;
        i3v0Var.i = kly0Var4;
        i3v0Var.j = r7qVar3;
        i3v0Var.k = g5tVar;
        i3v0Var.l = kly0Var5;
        i3v0Var.m = caqVar3;
        i3v0Var.n = kly0Var6;
        i3v0Var.o = caqVar4;
        i3v0Var.f33p = caqVar5;
        i3v0Var.q = caqVar6;
        i3v0Var.r = kly0Var7;
        return i3v0Var;
    }

    public static h7v0 h(jo80 jo80Var, r7q r7qVar, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, r7q r7qVar2, caq caqVar4, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var2, caq caqVar5, caq caqVar6, caq caqVar7, g5t g5tVar, caq caqVar8, caq caqVar9, caq caqVar10, r7q r7qVar5, r7q r7qVar6, gbp gbpVar, kly0 kly0Var3) {
        h7v0 h7v0Var = new h7v0();
        h7v0Var.a = jo80Var;
        h7v0Var.b = r7qVar;
        h7v0Var.c = caqVar;
        h7v0Var.d = caqVar2;
        h7v0Var.e = caqVar3;
        h7v0Var.f = kly0Var;
        h7v0Var.g = r7qVar2;
        h7v0Var.h = caqVar4;
        h7v0Var.i = r7qVar3;
        h7v0Var.j = r7qVar4;
        h7v0Var.k = kly0Var2;
        h7v0Var.l = caqVar5;
        h7v0Var.m = caqVar6;
        h7v0Var.n = caqVar7;
        h7v0Var.o = g5tVar;
        h7v0Var.f27p = caqVar8;
        h7v0Var.q = caqVar9;
        h7v0Var.r = caqVar10;
        h7v0Var.s = r7qVar5;
        h7v0Var.t = r7qVar6;
        h7v0Var.u = gbpVar;
        h7v0Var.v = kly0Var3;
        return h7v0Var;
    }

    public static eyp i(uau0 uau0Var) {
        return new eyp(uau0Var);
    }

    public static wh41 j(x2z x2zVar, uvy uvyVar, hre1 hre1Var, boolean z) {
        return new wh41(uvyVar, x2zVar, hre1Var, z, (byte) 3);
    }

    public static dc31 k(x2z x2zVar, u271 u271Var) {
        return new dc31(x2zVar, u271Var, (byte) 24);
    }

    public static vvu0 l(dg8 dg8Var, il00 il00Var, ye90 ye90Var, mka mkaVar, l1p0 l1p0Var, fza fzaVar) {
        return new vvu0(dg8Var, il00Var, ye90Var, mkaVar, l1p0Var, fzaVar);
    }

    public static muu m(zvu zvuVar, iac0 iac0Var) {
        x2p x2pVar = (x2p) zvuVar.a.a.c;
        x1v x1vVarG = x2pVar.g();
        suu suuVarF = x2pVar.f();
        Scheduler scheduler = (Scheduler) ((otu) ((h72) x2pVar.c).Y).c;
        c8o.m(scheduler);
        return new muu(x1vVarG, suuVarF, scheduler, iac0Var);
    }

    public static a4v0 n() {
        return new a4v0();
    }

    public static sfs o(n6r0 n6r0Var, lik1 lik1Var) {
        return new sfs(n6r0Var, lik1Var, r6h1.c);
    }

    public static hpo0 p(Resources resources) {
        return new hpo0(resources.getString(2131959187), resources.getString(2131959185), resources.getString(2131959184), 1, new bpo0(resources.getString(2131959186), resources.getString(2131959194), resources.getString(2131959188)));
    }

    public static e0v0 q(RetrofitMaker retrofitMaker) {
        return new e0v0(retrofitMaker);
    }

    public static f0v0 r(d0v0 d0v0Var) {
        return new f0v0(d0v0Var, (byte) 0);
    }

    public static x3v0 s(eyp eypVar) {
        uau0 uau0Var = eypVar.a;
        u3v0 u3v0Var = (u3v0) ((Cosmonaut) uau0Var.a.get()).createCosmosService(u3v0.class);
        c8o.m(u3v0Var);
        return new x3v0(u3v0Var, (ujs) uau0Var.c.get(), new vo30((lv00) uau0Var.e.get()));
    }

    public static x2z t(uu00 uu00Var) {
        return new x2z(uu00Var);
    }

    public static u271 u(uu00 uu00Var) {
        return new u271(uu00Var, (byte) 1);
    }

    public static i6v0 v(skm skmVar, ruz ruzVar, PlayOrigin playOrigin, muz muzVar) {
        return skmVar.a(ruzVar, playOrigin, muzVar);
    }

    public static ewn0 w(u271 u271Var) {
        return new ewn0(u271Var, (byte) 27);
    }

    public static tou0 x(ahu0 ahu0Var, pvc pvcVar, uqv0 uqv0Var, xrc0 xrc0Var, fum0 fum0Var, xnu0 xnu0Var) {
        return new tou0(ahu0Var, pvcVar, uqv0Var, xrc0Var, fum0Var, xnu0Var);
    }

    public static n481 y(eyp eypVar) {
        uau0 uau0Var = eypVar.a;
        ga81 ga81VarB = f7z.B((RxRouter) uau0Var.b.get());
        kly0 kly0Var = uau0Var.e;
        hur hurVar = new hur(new eyr((lv00) kly0Var.get(), new yla((byte) 10), new jma((byte) 10)), new byr((lv00) kly0Var.get(), new yla((byte) 10), new jma((byte) 10)), (byte) 3);
        new pvc((byte) 24);
        return new n481(ga81VarB, hurVar, new qos(), new dgb((l5n) uau0Var.d.get(), (byte) 7));
    }

    public static h481 z(eyp eypVar) {
        uau0 uau0Var = eypVar.a;
        return new h481(new vo30((lv00) uau0Var.e.get()), rt71.v((Cosmonaut) uau0Var.a.get()), (ujs) uau0Var.c.get());
    }
}
