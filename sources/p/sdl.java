package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Observable;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class sdl implements jly0 {
    public static yll A(RxRouter rxRouter) {
        return new yll(new CosmosTransport(new sn0(rxRouter, (byte) 11)));
    }

    public static hfb B(ujm ujmVar) {
        return new hfb(ujmVar, (byte) 3);
    }

    public static jz91 C(xrc0 xrc0Var, pvc pvcVar) {
        return new jz91(xrc0Var, pvcVar);
    }

    public static hp91 D(jz91 jz91Var, sks0 sks0Var) {
        return new hp91(jz91Var, sks0Var, (byte) 2);
    }

    public static h21 a(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 20);
    }

    public static odc b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 13);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static rdl c(caq caqVar, caq caqVar2, kly0 kly0Var, jly0 jly0Var, caq caqVar3) {
        rdl rdlVar = new rdl();
        rdlVar.a = caqVar;
        rdlVar.b = caqVar2;
        rdlVar.c = kly0Var;
        rdlVar.d = jly0Var;
        rdlVar.e = caqVar3;
        return rdlVar;
    }

    public static tdl d(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 0);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static cel e(caq caqVar, caq caqVar2, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var) {
        cel celVar = new cel();
        celVar.a = jly0Var;
        celVar.b = kly0Var;
        celVar.c = caqVar;
        celVar.d = caqVar2;
        celVar.e = jly0Var2;
        return celVar;
    }

    public static eml f(caq caqVar, caq caqVar2, r7q r7qVar, r7q r7qVar2, kly0 kly0Var, jo80 jo80Var, caq caqVar3, r7q r7qVar3, r7q r7qVar4, caq caqVar4, kly0 kly0Var2, r7q r7qVar5) {
        eml emlVar = new eml();
        emlVar.a = caqVar;
        emlVar.b = caqVar2;
        emlVar.c = r7qVar;
        emlVar.d = r7qVar2;
        emlVar.e = kly0Var;
        emlVar.f = jo80Var;
        emlVar.g = caqVar3;
        emlVar.h = r7qVar3;
        emlVar.i = r7qVar4;
        emlVar.j = caqVar4;
        emlVar.k = kly0Var2;
        emlVar.l = r7qVar5;
        return emlVar;
    }

    public static u1m g(kly0 kly0Var, kly0 kly0Var2, jly0 jly0Var, kly0 kly0Var3, jly0 jly0Var2, jly0 jly0Var3, kly0 kly0Var4, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, kly0 kly0Var5, jly0 jly0Var8, jly0 jly0Var9, jly0 jly0Var10, jly0 jly0Var11) {
        u1m u1mVar = new u1m();
        u1mVar.a = kly0Var;
        u1mVar.b = kly0Var2;
        u1mVar.c = jly0Var;
        u1mVar.d = kly0Var3;
        u1mVar.e = jly0Var2;
        u1mVar.f = jly0Var3;
        u1mVar.g = kly0Var4;
        u1mVar.h = jly0Var4;
        u1mVar.i = jly0Var5;
        u1mVar.j = jly0Var6;
        u1mVar.k = jly0Var7;
        u1mVar.l = kly0Var5;
        u1mVar.m = jly0Var8;
        u1mVar.n = jly0Var9;
        u1mVar.o = jly0Var10;
        u1mVar.f66p = jly0Var11;
        return u1mVar;
    }

    public static sfm h(jo80 jo80Var, jly0 jly0Var, caq caqVar, kly0 kly0Var, kly0 kly0Var2, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, jly0 jly0Var2, kly0 kly0Var3, g5t g5tVar, caq caqVar9, caq caqVar10, jly0 jly0Var3) {
        sfm sfmVar = new sfm();
        sfmVar.a = jo80Var;
        sfmVar.b = jly0Var;
        sfmVar.c = caqVar;
        sfmVar.d = kly0Var;
        sfmVar.e = kly0Var2;
        sfmVar.f = caqVar2;
        sfmVar.g = caqVar3;
        sfmVar.h = caqVar4;
        sfmVar.i = caqVar5;
        sfmVar.j = caqVar6;
        sfmVar.k = caqVar7;
        sfmVar.l = caqVar8;
        sfmVar.m = jly0Var2;
        sfmVar.n = kly0Var3;
        sfmVar.o = g5tVar;
        sfmVar.f63p = caqVar9;
        sfmVar.q = caqVar10;
        sfmVar.r = jly0Var3;
        return sfmVar;
    }

    public static kim i(jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, kly0 kly0Var, kly0 kly0Var2, caq caqVar, jly0 jly0Var2, caq caqVar2, caq caqVar3, caq caqVar4, jly0 jly0Var3, kly0 kly0Var3, g5t g5tVar, caq caqVar5, caq caqVar6, jly0 jly0Var4, caq caqVar7, kly0 kly0Var4, jly0 jly0Var5, caq caqVar8) {
        kim kimVar = new kim();
        kimVar.a = jo80Var;
        kimVar.b = jo80Var2;
        kimVar.c = jly0Var;
        kimVar.d = kly0Var;
        kimVar.e = kly0Var2;
        kimVar.f = caqVar;
        kimVar.g = jly0Var2;
        kimVar.h = caqVar2;
        kimVar.i = caqVar3;
        kimVar.j = caqVar4;
        kimVar.k = jly0Var3;
        kimVar.l = kly0Var3;
        kimVar.m = g5tVar;
        kimVar.n = caqVar5;
        kimVar.o = caqVar6;
        kimVar.f35p = jly0Var4;
        kimVar.q = caqVar7;
        kimVar.r = kly0Var4;
        kimVar.s = jly0Var5;
        kimVar.t = caqVar8;
        return kimVar;
    }

    public static lim j(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, kly0 kly0Var) {
        lim limVar = new lim();
        limVar.a = r7qVar;
        limVar.b = caqVar;
        limVar.c = r7qVar2;
        limVar.d = kly0Var;
        limVar.e = r7qVar3;
        return limVar;
    }

    public static tdl k(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 1);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static tdl l(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 6);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static tdl m(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 7);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static yix0 n(boolean z, yll yllVar, yix0 yix0Var) {
        return z ? yllVar : yix0Var;
    }

    public static Set o(qim qimVar) {
        return qimVar.a;
    }

    public static zy91 p(ahu0 ahu0Var, hp91 hp91Var, Optional optional) {
        hgx0 hgx0Var = new hgx0((byte) 27);
        udq udqVar = (udq) optional.orElse(null);
        return new zy91(hgx0Var, hp91Var, ahu0Var, udqVar != null ? new s6z0(udqVar, (byte) 3) : null);
    }

    public static ujm q(RxRouter rxRouter) {
        return new ujm(new CosmosTransport(new sn0(rxRouter, (byte) 13)));
    }

    public static gqr r(o241 o241Var) {
        return new gqr(((p241) o241Var).a.map(m9h.W0), false);
    }

    public static Observable s(Observable observable) {
        return observable.map(p9w.U0).distinctUntilChanged();
    }

    public static lpd t(kzp kzpVar) {
        return new lpd(kzpVar, (byte) 26);
    }

    public static lpd u(nzp nzpVar) {
        return new lpd(nzpVar, (byte) 23);
    }

    public static eqg v(pob pobVar) {
        return new eqg(pobVar, (byte) 6);
    }

    public static eqg w(hwb hwbVar) {
        return new eqg(hwbVar, (byte) 7);
    }

    public static eqg x(twb twbVar) {
        return new eqg(twbVar, (byte) 9);
    }

    public static eqg y(q3c q3cVar) {
        return new eqg(q3cVar, (byte) 10);
    }

    public static eqg z(m4c m4cVar) {
        return new eqg(m4cVar, (byte) 11);
    }
}
