package p;

import android.content.Context;
import android.view.GestureDetector;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class mid implements jly0 {
    public static z611 A(Context context, e7p0 e7p0Var) {
        return new z611(new GestureDetector(context, new lwd()), new c20(e7p0Var, (byte) 13));
    }

    public static q2e B(ynb0 ynb0Var, a0m a0mVar) {
        q2e q2eVar = ((p3l) ((ynb0) a0mVar.b).get()).e() ? q2e.c : q2e.b;
        jch0.a = ynb0Var;
        jch0.b = q2eVar;
        return q2eVar;
    }

    public static y2e C(ynb0 ynb0Var, jo20 jo20Var) {
        if (jo20Var.isEnabled()) {
            return new z2e();
        }
        Object obj = ynb0Var.get();
        obj.getClass();
        return (y2e) obj;
    }

    public static Executor D(q8n q8nVar) {
        return qgo1.l(q8nVar);
    }

    public static h21 a(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 11);
    }

    public static t8c b(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 2);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static odc c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 1);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static l5e d(jo80 jo80Var, r7q r7qVar, caq caqVar, gbp gbpVar, gbp gbpVar2, r7q r7qVar2, r7q r7qVar3, caq caqVar2, caq caqVar3, caq caqVar4, r7q r7qVar4, caq caqVar5, caq caqVar6, caq caqVar7) {
        l5e l5eVar = new l5e();
        l5eVar.a = jo80Var;
        l5eVar.b = r7qVar;
        l5eVar.c = caqVar;
        l5eVar.d = gbpVar;
        l5eVar.e = gbpVar2;
        l5eVar.f = r7qVar2;
        l5eVar.g = r7qVar3;
        l5eVar.h = caqVar2;
        l5eVar.i = caqVar3;
        l5eVar.j = caqVar4;
        l5eVar.k = r7qVar4;
        l5eVar.l = caqVar5;
        l5eVar.m = caqVar6;
        l5eVar.n = caqVar7;
        return l5eVar;
    }

    public static t5e e(jo80 jo80Var, r7q r7qVar, caq caqVar, gbp gbpVar, gbp gbpVar2, r7q r7qVar2, caq caqVar2, caq caqVar3, g5t g5tVar, r7q r7qVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7) {
        t5e t5eVar = new t5e();
        t5eVar.a = jo80Var;
        t5eVar.b = r7qVar;
        t5eVar.c = caqVar;
        t5eVar.d = gbpVar;
        t5eVar.e = gbpVar2;
        t5eVar.f = r7qVar2;
        t5eVar.g = caqVar2;
        t5eVar.h = caqVar3;
        t5eVar.i = g5tVar;
        t5eVar.j = r7qVar3;
        t5eVar.k = caqVar4;
        t5eVar.l = caqVar5;
        t5eVar.m = caqVar6;
        t5eVar.n = caqVar7;
        return t5eVar;
    }

    public static z7e f(jo80 jo80Var, jo80 jo80Var2, caq caqVar, kly0 kly0Var, r7q r7qVar, r7q r7qVar2, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, r7q r7qVar3, caq caqVar6) {
        z7e z7eVar = new z7e();
        z7eVar.a = jo80Var;
        z7eVar.b = jo80Var2;
        z7eVar.c = caqVar;
        z7eVar.d = kly0Var;
        z7eVar.e = r7qVar;
        z7eVar.f = r7qVar2;
        z7eVar.g = caqVar2;
        z7eVar.h = caqVar3;
        z7eVar.i = caqVar4;
        z7eVar.j = caqVar5;
        z7eVar.k = r7qVar3;
        z7eVar.l = caqVar6;
        return z7eVar;
    }

    public static h8e g(r7q r7qVar, jo80 jo80Var, jo80 jo80Var2, caq caqVar, kly0 kly0Var, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, r7q r7qVar2) {
        h8e h8eVar = new h8e();
        h8eVar.a = r7qVar;
        h8eVar.b = jo80Var;
        h8eVar.c = jo80Var2;
        h8eVar.d = caqVar;
        h8eVar.e = kly0Var;
        h8eVar.f = caqVar2;
        h8eVar.g = caqVar3;
        h8eVar.h = caqVar4;
        h8eVar.i = caqVar5;
        h8eVar.j = r7qVar2;
        return h8eVar;
    }

    public static lee h(caq caqVar, r7q r7qVar, kly0 kly0Var, jo80 jo80Var, jo80 jo80Var2, caq caqVar2, r7q r7qVar2, kly0 kly0Var2) {
        lee leeVar = new lee();
        leeVar.a = caqVar;
        leeVar.b = r7qVar;
        leeVar.c = kly0Var;
        leeVar.d = jo80Var;
        leeVar.e = jo80Var2;
        leeVar.f = caqVar2;
        leeVar.g = r7qVar2;
        leeVar.h = kly0Var2;
        return leeVar;
    }

    public static xje i(jo80 jo80Var, jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, kly0 kly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, caq caqVar, kly0 kly0Var3, jly0 jly0Var6, caq caqVar2) {
        xje xjeVar = new xje();
        xjeVar.a = jo80Var;
        xjeVar.b = jly0Var;
        xjeVar.c = kly0Var;
        xjeVar.d = jly0Var2;
        xjeVar.e = kly0Var2;
        xjeVar.f = jly0Var3;
        xjeVar.g = jly0Var4;
        xjeVar.h = jly0Var5;
        xjeVar.i = caqVar;
        xjeVar.j = kly0Var3;
        xjeVar.k = jly0Var6;
        xjeVar.l = caqVar2;
        return xjeVar;
    }

    public static tke j(jly0 jly0Var, caq caqVar, jly0 jly0Var2, caq caqVar2, kly0 kly0Var, jly0 jly0Var3, jly0 jly0Var4) {
        tke tkeVar = new tke();
        tkeVar.a = jly0Var;
        tkeVar.b = caqVar;
        tkeVar.c = jly0Var2;
        tkeVar.d = caqVar2;
        tkeVar.e = kly0Var;
        tkeVar.f = jly0Var3;
        tkeVar.g = jly0Var4;
        return tkeVar;
    }

    public static fme k(jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, caq caqVar, kly0 kly0Var2, kly0 kly0Var3, caq caqVar2, jly0 jly0Var5, jly0 jly0Var6, kly0 kly0Var4, kly0 kly0Var5, jly0 jly0Var7, jly0 jly0Var8, caq caqVar3, caq caqVar4, caq caqVar5, kly0 kly0Var6, jly0 jly0Var9, caq caqVar6) {
        fme fmeVar = new fme();
        fmeVar.a = jly0Var;
        fmeVar.b = kly0Var;
        fmeVar.c = jly0Var2;
        fmeVar.d = jly0Var3;
        fmeVar.e = jly0Var4;
        fmeVar.f = caqVar;
        fmeVar.g = kly0Var2;
        fmeVar.h = kly0Var3;
        fmeVar.i = caqVar2;
        fmeVar.j = jly0Var5;
        fmeVar.k = jly0Var6;
        fmeVar.l = kly0Var4;
        fmeVar.m = kly0Var5;
        fmeVar.n = jly0Var7;
        fmeVar.o = jly0Var8;
        fmeVar.f15p = caqVar3;
        fmeVar.q = caqVar4;
        fmeVar.r = caqVar5;
        fmeVar.s = kly0Var6;
        fmeVar.t = jly0Var9;
        fmeVar.u = caqVar6;
        return fmeVar;
    }

    public static h21 l(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 12);
    }

    public static t8c m(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 4);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static t8c n(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 5);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static t8c o(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 7);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static t8c p(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 8);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static t8c q(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 9);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static lid r(ynb0 ynb0Var, ynb0 ynb0Var2, tid tidVar, xzb0 xzb0Var) {
        return new lid(ynb0Var, ynb0Var2, tidVar, xzb0Var);
    }

    public static zid s(i4p i4pVar) {
        dkd dkdVar = i4pVar.a;
        return new zid((zmj0) dkdVar.b.get(), (lv00) dkdVar.c.get(), (q8n) dkdVar.a.get());
    }

    public static bjd t(lid lidVar) {
        return (bjd) lidVar.a.get();
    }

    public static i4p u(dkd dkdVar) {
        return new i4p(dkdVar);
    }

    public static lkd v(lid lidVar) {
        return (lkd) lidVar.b.get();
    }

    public static a4e w(CallbackRouter callbackRouter) {
        return new a4e(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 2)));
    }

    public static efe x(RetrofitMaker retrofitMaker) {
        return (efe) retrofitMaker.createWebgateService(efe.class, "android-playlist-creation-playlist4serviceimpl");
    }

    public static llm y(q8n q8nVar) {
        return smo1.e(q8nVar);
    }

    public static xzb0 z(lid lidVar) {
        xzb0 xzb0Var = lidVar.d;
        c8o.m(xzb0Var);
        return xzb0Var;
    }
}
