package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.player.model.PlayOrigin;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class yne implements jly0 {
    public static q58 A(dgb dgbVar) {
        return new q58(dgbVar, (byte) 28);
    }

    public static lpd B(kzp kzpVar) {
        return new lpd(kzpVar, (byte) 6);
    }

    public static Resources C(Context context) {
        return context.getResources();
    }

    public static lik1 D(tgf tgfVar) {
        kik1 kik1Var = nik1.T4;
        String str = tgfVar.a;
        if (kik1Var.a(str)) {
            return kik1Var.b(str);
        }
        kik1 kik1Var2 = nik1.U4;
        if (kik1Var2.a(str)) {
            return kik1Var2.b(str);
        }
        kik1 kik1Var3 = nik1.V4;
        if (kik1Var3.a(str)) {
            return kik1Var3.b(str);
        }
        kik1 kik1Var4 = nik1.W4;
        if (kik1Var4.a(str)) {
            return kik1Var4.b(str);
        }
        kik1 kik1Var5 = nik1.X4;
        if (kik1Var5.a(str)) {
            return kik1Var5.b(str);
        }
        eg.m("ChatPage can only be created with a valid chat URI, but received: ".concat(str));
        return null;
    }

    public static String a(tgf tgfVar) {
        String str = tgfVar.c;
        c8o.m(str);
        return str;
    }

    public static h21 b(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 13);
    }

    public static t8c c(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 10);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static odc d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 2);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static ose e(jly0 jly0Var, kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, kly0 kly0Var2, g5t g5tVar, caq caqVar4, kly0 kly0Var3, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8, caq caqVar5, kly0 kly0Var4, jly0 jly0Var9, jly0 jly0Var10, caq caqVar6, jly0 jly0Var11, jly0 jly0Var12, kly0 kly0Var5, kly0 kly0Var6, jly0 jly0Var13, kly0 kly0Var7, caq caqVar7, kly0 kly0Var8) {
        ose oseVar = new ose();
        oseVar.a = jly0Var;
        oseVar.b = kly0Var;
        oseVar.c = caqVar;
        oseVar.d = caqVar2;
        oseVar.e = caqVar3;
        oseVar.f = jly0Var2;
        oseVar.g = jly0Var3;
        oseVar.h = jly0Var4;
        oseVar.i = jly0Var5;
        oseVar.j = kly0Var2;
        oseVar.k = g5tVar;
        oseVar.l = caqVar4;
        oseVar.m = kly0Var3;
        oseVar.n = jly0Var6;
        oseVar.o = jly0Var7;
        oseVar.f49p = jly0Var8;
        oseVar.q = caqVar5;
        oseVar.r = kly0Var4;
        oseVar.s = jly0Var9;
        oseVar.t = jly0Var10;
        oseVar.u = caqVar6;
        oseVar.v = jly0Var11;
        oseVar.w = jly0Var12;
        oseVar.x = kly0Var5;
        oseVar.y = kly0Var6;
        oseVar.z = jly0Var13;
        oseVar.A = kly0Var7;
        oseVar.B = caqVar7;
        oseVar.C = kly0Var8;
        return oseVar;
    }

    public static vse f(jly0 jly0Var) {
        vse vseVar = new vse();
        vseVar.a = jly0Var;
        return vseVar;
    }

    public static zve g(caq caqVar, jly0 jly0Var, jly0 jly0Var2) {
        zve zveVar = new zve();
        zveVar.a = jly0Var;
        zveVar.b = caqVar;
        zveVar.c = jly0Var2;
        return zveVar;
    }

    public static fwe h(jo80 jo80Var, jly0 jly0Var, caq caqVar, jly0 jly0Var2, caq caqVar2, jly0 jly0Var3) {
        fwe fweVar = new fwe();
        fweVar.a = jo80Var;
        fweVar.b = jly0Var;
        fweVar.c = caqVar;
        fweVar.d = jly0Var2;
        fweVar.e = caqVar2;
        fweVar.f = jly0Var3;
        return fweVar;
    }

    public static lof i(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, caq caqVar2, jly0 jly0Var7, kly0 kly0Var, jly0 jly0Var8, kly0 kly0Var2, jly0 jly0Var9, jly0 jly0Var10, caq caqVar3, caq caqVar4, caq caqVar5, kly0 kly0Var3, caq caqVar6, kly0 kly0Var4, caq caqVar7, caq caqVar8) {
        lof lofVar = new lof();
        lofVar.a = jo80Var;
        lofVar.b = jly0Var;
        lofVar.c = jly0Var2;
        lofVar.d = jly0Var3;
        lofVar.e = caqVar;
        lofVar.f = jly0Var4;
        lofVar.g = jly0Var5;
        lofVar.h = jly0Var6;
        lofVar.i = caqVar2;
        lofVar.j = jly0Var7;
        lofVar.k = kly0Var;
        lofVar.l = jly0Var8;
        lofVar.m = kly0Var2;
        lofVar.n = jly0Var9;
        lofVar.o = jly0Var10;
        lofVar.p = caqVar3;
        lofVar.q = caqVar4;
        lofVar.r = caqVar5;
        lofVar.s = kly0Var3;
        lofVar.t = caqVar6;
        lofVar.u = kly0Var4;
        lofVar.v = caqVar7;
        lofVar.w = caqVar8;
        return lofVar;
    }

    public static utf j(jly0 jly0Var, kly0 kly0Var, caq caqVar, kly0 kly0Var2, caq caqVar2, caq caqVar3, kly0 kly0Var3, caq caqVar4, caq caqVar5) {
        utf utfVar = new utf();
        utfVar.a = jly0Var;
        utfVar.b = kly0Var;
        utfVar.c = caqVar;
        utfVar.d = kly0Var2;
        utfVar.e = caqVar2;
        utfVar.f = caqVar3;
        utfVar.g = kly0Var3;
        utfVar.h = caqVar4;
        utfVar.i = caqVar5;
        return utfVar;
    }

    public static t8c k(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 12);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static odc l(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 5);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static odc m(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 6);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static tl7 n(q7r0 q7r0Var) {
        tl7 tl7VarB = cwl1.B(q7r0Var);
        c8o.m(tl7VarB);
        return tl7VarB;
    }

    public static y7f o(RetrofitMaker retrofitMaker) {
        return (y7f) retrofitMaker.createWebgateService(y7f.class, "android-campfire-chatinsights-impl");
    }

    public static bhf p() {
        return new bhf();
    }

    public static fpf q(String str, zgq zgqVar) {
        return zgqVar.a(str);
    }

    public static u9c0 r(q7r0 q7r0Var) {
        return cto1.q(q7r0Var.d.c);
    }

    public static d0r s(q7r0 q7r0Var) {
        return cwl1.C(q7r0Var);
    }

    public static iac0 t(q7r0 q7r0Var) {
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public static ttm0 u(q7r0 q7r0Var) {
        ttm0 ttm0VarE = cwl1.E(q7r0Var);
        c8o.m(ttm0VarE);
        return ttm0VarE;
    }

    public static PlayOrigin v(lik1 lik1Var) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return PlayOrigin.builder(yon1.p0().a).viewUri(lik1Var.a).build();
    }

    public static cyp w(q7r0 q7r0Var, t8u0 t8u0Var) {
        return t8u0Var.a(q7r0Var.d.c.getLifecycle());
    }

    public static q58 x(hfb hfbVar) {
        return new q58(hfbVar, (byte) 25);
    }

    public static q58 y(lfb lfbVar) {
        return new q58(lfbVar, (byte) 26);
    }

    public static q58 z(nfb nfbVar) {
        return new q58(nfbVar, (byte) 27);
    }
}
