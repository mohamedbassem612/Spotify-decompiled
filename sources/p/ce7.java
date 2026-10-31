package p;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ce7 implements jly0 {
    public static vq6 A(nzp nzpVar) {
        return new vq6(nzpVar, (byte) 3);
    }

    public static vq6 B(ozp ozpVar) {
        return new vq6(ozpVar, (byte) 2);
    }

    public static x2g1 C(o1p o1pVar) {
        return new x2g1(o1pVar.a.c());
    }

    public static o1p a(ym7 ym7Var) {
        return new o1p(ym7Var);
    }

    public static w1p b(nw7 nw7Var) {
        return new w1p(nw7Var);
    }

    public static y1p c(uy2 uy2Var) {
        return new y1p(uy2Var);
    }

    public static v2 d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 21);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static pt0 e(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 16);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static oe7 f(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, caq caqVar13, caq caqVar14, caq caqVar15, caq caqVar16, caq caqVar17, g5t g5tVar, jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8, jly0 jly0Var9, jly0 jly0Var10, jly0 jly0Var11, jly0 jly0Var12, jly0 jly0Var13, jly0 jly0Var14, jly0 jly0Var15, jly0 jly0Var16, jly0 jly0Var17, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5) {
        oe7 oe7Var = new oe7();
        oe7Var.a = caqVar;
        oe7Var.b = caqVar2;
        oe7Var.c = caqVar3;
        oe7Var.d = caqVar4;
        oe7Var.e = caqVar5;
        oe7Var.f = jo80Var;
        oe7Var.g = jo80Var2;
        oe7Var.h = jly0Var;
        oe7Var.i = kly0Var;
        oe7Var.j = jly0Var2;
        oe7Var.k = jly0Var3;
        oe7Var.l = caqVar6;
        oe7Var.m = jly0Var4;
        oe7Var.n = kly0Var2;
        oe7Var.o = kly0Var3;
        oe7Var.f48p = jly0Var5;
        oe7Var.q = jly0Var6;
        oe7Var.r = caqVar7;
        oe7Var.s = g5tVar;
        oe7Var.t = jly0Var7;
        oe7Var.u = caqVar8;
        oe7Var.v = jly0Var8;
        oe7Var.w = jly0Var9;
        oe7Var.x = caqVar9;
        oe7Var.y = jly0Var10;
        oe7Var.z = caqVar10;
        oe7Var.A = jly0Var11;
        oe7Var.B = caqVar11;
        oe7Var.C = caqVar12;
        oe7Var.D = jly0Var12;
        oe7Var.E = kly0Var4;
        oe7Var.F = caqVar13;
        oe7Var.G = kly0Var5;
        oe7Var.H = jly0Var13;
        oe7Var.I = jly0Var14;
        oe7Var.J = jly0Var15;
        oe7Var.K = jly0Var16;
        oe7Var.L = jly0Var17;
        oe7Var.M = caqVar14;
        oe7Var.N = caqVar15;
        oe7Var.O = caqVar16;
        oe7Var.P = caqVar17;
        return oe7Var;
    }

    public static wv7 g(jo80 jo80Var, jly0 jly0Var, jo80 jo80Var2, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, g5t g5tVar) {
        wv7 wv7Var = new wv7();
        wv7Var.a = jo80Var;
        wv7Var.b = jly0Var;
        wv7Var.c = jo80Var2;
        wv7Var.d = jly0Var2;
        wv7Var.e = kly0Var;
        wv7Var.f = kly0Var2;
        wv7Var.g = kly0Var3;
        wv7Var.h = kly0Var4;
        wv7Var.i = kly0Var5;
        wv7Var.j = g5tVar;
        return wv7Var;
    }

    public static gy7 h(g5t g5tVar, caq caqVar, jly0 jly0Var) {
        gy7 gy7Var = new gy7();
        gy7Var.a = g5tVar;
        gy7Var.b = caqVar;
        gy7Var.c = jly0Var;
        return gy7Var;
    }

    public static x38 i(Handler handler) {
        return new x38(handler);
    }

    public static pt0 j(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 17);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static pt0 k(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 18);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static wz3 l(RxRouter rxRouter) {
        return new wz3(new CosmosTransport(new sn0(rxRouter, (byte) 2)));
    }

    public static zwg m(o1p o1pVar) {
        return o1pVar.a();
    }

    public static em3 n(o1p o1pVar) {
        ym7 ym7Var = o1pVar.a;
        return new em3(ym7Var.d(), ym7Var.c(), (byte) 23);
    }

    public static onv0 o(o1p o1pVar) {
        return o1pVar.b();
    }

    public static n2t p(RxRouter rxRouter, luk lukVar) {
        llm llmVar = yt7.a;
        return new n2t(new xt7(rxRouter, !new l54(false, lukVar).a(), (byte) 0));
    }

    public static uw7 q(w1p w1pVar) {
        nw7 nw7Var = w1pVar.a;
        kly0 kly0Var = nw7Var.a;
        Context context = (Context) kly0Var.get();
        return new uw7((AudioManager) context.getSystemService("audio"), new km3((t2j0) nw7Var.b.get(), new t4d1((Context) kly0Var.get()), (byte) 22));
    }

    public static hil1 r(y1p y1pVar) {
        uy2 uy2Var = y1pVar.a;
        return new hil1(new em3((azp0) uy2Var.b.get(), (bz81) uy2Var.c.get(), (byte) 24), (g38) uy2Var.a.get(), (q8n) uy2Var.d.get());
    }

    public static u3x0 s() {
        return new u3x0((byte) 29);
    }

    public static l78 t(a2p a2pVar) {
        l78 l78Var = (l78) a2pVar.b.get();
        c8o.m(l78Var);
        return l78Var;
    }

    public static nbr u(o1p o1pVar) {
        return new nbr((Single) o1pVar.b.get());
    }

    public static z08 v(ix7 ix7Var) {
        return new z08(ix7Var);
    }

    public static xh7 w() {
        xh7 xh7Var = xh7.d;
        c8o.m(xh7Var);
        return xh7Var;
    }

    public static xte0 x(o1p o1pVar) {
        return new xte0(o1pVar.a.e());
    }

    public static zhq0 y() {
        return xh7.d.c;
    }

    public static um5 z(a0b a0bVar) {
        return new um5(a0bVar, (byte) 19);
    }
}
