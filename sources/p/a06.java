package p;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class a06 implements jly0 {
    public static tby0 A(RetrofitMaker retrofitMaker) {
        return (tby0) retrofitMaker.createWebgateService(tby0.class, "android-promptedplaylists-dataimpl");
    }

    public static String B() {
        String str = v7n0.a;
        c8o.m(str);
        return str;
    }

    public static pbk1 C(String str) {
        return new pbk1(str);
    }

    public static cq6 D(yu3 yu3Var) {
        return new cq6(new wzn(yu3Var));
    }

    public static v2 a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 14);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static zb6 b(jly0 jly0Var, caq caqVar, jly0 jly0Var2, g5t g5tVar, jly0 jly0Var3, caq caqVar2, caq caqVar3, jly0 jly0Var4) {
        zb6 zb6Var = new zb6();
        zb6Var.a = jly0Var;
        zb6Var.b = caqVar;
        zb6Var.c = jly0Var2;
        zb6Var.d = g5tVar;
        zb6Var.e = jly0Var3;
        zb6Var.f = caqVar2;
        zb6Var.g = caqVar3;
        zb6Var.h = jly0Var4;
        return zb6Var;
    }

    public static ar6 c(caq caqVar, jly0 jly0Var, jly0 jly0Var2) {
        ar6 ar6Var = new ar6();
        ar6Var.a = caqVar;
        ar6Var.b = jly0Var;
        ar6Var.c = jly0Var2;
        return ar6Var;
    }

    public static dw6 d(r7q r7qVar, g5t g5tVar, caq caqVar, kly0 kly0Var, kly0 kly0Var2, caq caqVar2, caq caqVar3, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, caq caqVar4, kly0 kly0Var3, kly0 kly0Var4, caq caqVar5, r7q r7qVar5, r7q r7qVar6, gbp gbpVar, r7q r7qVar7, kly0 kly0Var5, r7q r7qVar8, kly0 kly0Var6, r7q r7qVar9, r7q r7qVar10, kly0 kly0Var7, kly0 kly0Var8, r7q r7qVar11, r7q r7qVar12, r7q r7qVar13, kly0 kly0Var9) {
        dw6 dw6Var = new dw6();
        dw6Var.a = r7qVar;
        dw6Var.b = g5tVar;
        dw6Var.c = caqVar;
        dw6Var.d = kly0Var;
        dw6Var.e = kly0Var2;
        dw6Var.f = caqVar2;
        dw6Var.g = caqVar3;
        dw6Var.h = r7qVar2;
        dw6Var.i = r7qVar3;
        dw6Var.j = r7qVar4;
        dw6Var.k = caqVar4;
        dw6Var.l = kly0Var3;
        dw6Var.m = kly0Var4;
        dw6Var.n = caqVar5;
        dw6Var.o = r7qVar5;
        dw6Var.p = r7qVar6;
        dw6Var.q = gbpVar;
        dw6Var.r = r7qVar7;
        dw6Var.s = kly0Var5;
        dw6Var.t = r7qVar8;
        dw6Var.u = kly0Var6;
        dw6Var.v = r7qVar9;
        dw6Var.w = r7qVar10;
        dw6Var.x = kly0Var7;
        dw6Var.y = kly0Var8;
        dw6Var.z = r7qVar11;
        dw6Var.A = r7qVar12;
        dw6Var.B = r7qVar13;
        dw6Var.C = kly0Var9;
        return dw6Var;
    }

    public static nz6 e(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, r7q r7qVar6, caq caqVar, r7q r7qVar7, kly0 kly0Var, r7q r7qVar8, r7q r7qVar9) {
        nz6 nz6Var = new nz6();
        nz6Var.a = r7qVar;
        nz6Var.b = r7qVar2;
        nz6Var.c = r7qVar3;
        nz6Var.d = r7qVar4;
        nz6Var.e = r7qVar5;
        nz6Var.f = r7qVar6;
        nz6Var.g = caqVar;
        nz6Var.h = r7qVar7;
        nz6Var.i = kly0Var;
        nz6Var.j = r7qVar8;
        nz6Var.k = r7qVar9;
        return nz6Var;
    }

    public static qz6 f(ynb0 ynb0Var, ynb0 ynb0Var2) {
        qz6 qz6Var = new qz6();
        qz6Var.a = ynb0Var;
        qz6Var.b = ynb0Var2;
        return qz6Var;
    }

    public static ub7 g(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, kly0 kly0Var, jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, kly0 kly0Var2, kly0 kly0Var3, jly0 jly0Var2, caq caqVar5, kly0 kly0Var4, caq caqVar6, kly0 kly0Var5, jly0 jly0Var3, kly0 kly0Var6, kly0 kly0Var7, jly0 jly0Var4, jly0 jly0Var5, caq caqVar7, kly0 kly0Var8, jly0 jly0Var6, caq caqVar8, jly0 jly0Var7, g5t g5tVar, g5t g5tVar2, jly0 jly0Var8, jly0 jly0Var9, kly0 kly0Var9, jly0 jly0Var10, caq caqVar9, caq caqVar10, jly0 jly0Var11, jly0 jly0Var12, caq caqVar11, caq caqVar12, jly0 jly0Var13, kly0 kly0Var10, caq caqVar13, kly0 kly0Var11, jly0 jly0Var14, jly0 jly0Var15, jly0 jly0Var16, jly0 jly0Var17, jly0 jly0Var18, caq caqVar14, caq caqVar15, caq caqVar16, caq caqVar17) {
        ub7 ub7Var = new ub7();
        ub7Var.a = caqVar;
        ub7Var.b = caqVar2;
        ub7Var.c = caqVar3;
        ub7Var.d = caqVar4;
        ub7Var.e = kly0Var;
        ub7Var.f = jo80Var;
        ub7Var.g = jo80Var2;
        ub7Var.h = jly0Var;
        ub7Var.i = kly0Var2;
        ub7Var.j = kly0Var3;
        ub7Var.k = jly0Var2;
        ub7Var.l = caqVar5;
        ub7Var.m = kly0Var4;
        ub7Var.n = caqVar6;
        ub7Var.o = kly0Var5;
        ub7Var.f80p = jly0Var3;
        ub7Var.q = kly0Var6;
        ub7Var.r = kly0Var7;
        ub7Var.s = jly0Var4;
        ub7Var.t = jly0Var5;
        ub7Var.u = caqVar7;
        ub7Var.v = kly0Var8;
        ub7Var.w = jly0Var6;
        ub7Var.x = caqVar8;
        ub7Var.y = jly0Var7;
        ub7Var.z = g5tVar;
        ub7Var.A = g5tVar2;
        ub7Var.B = jly0Var8;
        ub7Var.C = jly0Var9;
        ub7Var.D = kly0Var9;
        ub7Var.E = jly0Var10;
        ub7Var.F = caqVar9;
        ub7Var.G = caqVar10;
        ub7Var.H = jly0Var11;
        ub7Var.I = jly0Var12;
        ub7Var.J = caqVar11;
        ub7Var.K = caqVar12;
        ub7Var.L = jly0Var13;
        ub7Var.M = kly0Var10;
        ub7Var.N = caqVar13;
        ub7Var.O = kly0Var11;
        ub7Var.P = jly0Var14;
        ub7Var.Q = jly0Var15;
        ub7Var.R = jly0Var16;
        ub7Var.S = jly0Var17;
        ub7Var.T = jly0Var18;
        ub7Var.U = caqVar14;
        ub7Var.V = caqVar15;
        ub7Var.W = caqVar16;
        ub7Var.X = caqVar17;
        return ub7Var;
    }

    public static ae7 h(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, caq caqVar13, caq caqVar14, caq caqVar15, caq caqVar16, caq caqVar17, g5t g5tVar, jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8, jly0 jly0Var9, jly0 jly0Var10, jly0 jly0Var11, jly0 jly0Var12, jly0 jly0Var13, jly0 jly0Var14, jly0 jly0Var15, jly0 jly0Var16, jly0 jly0Var17, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5) {
        ae7 ae7Var = new ae7();
        ae7Var.a = caqVar;
        ae7Var.b = caqVar2;
        ae7Var.c = caqVar3;
        ae7Var.d = caqVar4;
        ae7Var.e = caqVar5;
        ae7Var.f = jo80Var;
        ae7Var.g = jo80Var2;
        ae7Var.h = jly0Var;
        ae7Var.i = kly0Var;
        ae7Var.j = jly0Var2;
        ae7Var.k = jly0Var3;
        ae7Var.l = caqVar6;
        ae7Var.m = jly0Var4;
        ae7Var.n = kly0Var2;
        ae7Var.o = jly0Var5;
        ae7Var.f4p = jly0Var6;
        ae7Var.q = caqVar7;
        ae7Var.r = kly0Var3;
        ae7Var.s = g5tVar;
        ae7Var.t = jly0Var7;
        ae7Var.u = caqVar8;
        ae7Var.v = jly0Var8;
        ae7Var.w = jly0Var9;
        ae7Var.x = caqVar9;
        ae7Var.y = jly0Var10;
        ae7Var.z = caqVar10;
        ae7Var.A = jly0Var11;
        ae7Var.B = caqVar11;
        ae7Var.C = caqVar12;
        ae7Var.D = jly0Var12;
        ae7Var.E = kly0Var4;
        ae7Var.F = caqVar13;
        ae7Var.G = kly0Var5;
        ae7Var.H = jly0Var13;
        ae7Var.I = jly0Var14;
        ae7Var.J = jly0Var15;
        ae7Var.K = jly0Var16;
        ae7Var.L = jly0Var17;
        ae7Var.M = caqVar14;
        ae7Var.N = caqVar15;
        ae7Var.O = caqVar16;
        ae7Var.P = caqVar17;
        return ae7Var;
    }

    public static v2 i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 15);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static v2 j(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 20);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static t57 k(t380 t380Var, Application application) {
        return new t57(t380Var, new c67(application));
    }

    public static h54 l(ynb0 ynb0Var, ynb0 ynb0Var2, t380 t380Var, q8n q8nVar) {
        p8n p8nVar = q8n.b;
        h54 h54Var = new h54(qgo1.l(q8nVar.M(1)), ynb0Var, ynb0Var2);
        Iterator it = t380Var.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                bhn0.d();
                return null;
            }
            h54Var.f.add(null);
        }
        return h54Var;
    }

    public static r87 m() {
        return new r87(23);
    }

    public static ue7 n(RetrofitMaker retrofitMaker) {
        return (ue7) retrofitMaker.createWebgateService(ue7.class, "android-assisted-curation-endpointsimpl");
    }

    public static fc7 o(RetrofitMaker retrofitMaker) {
        return (fc7) retrofitMaker.createWebgateService(fc7.class, "android-assisted-curation-endpointsimpl");
    }

    public static ua6 p(CallbackRouter callbackRouter) {
        return new ua6(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 1)));
    }

    public static tr6 q(g23 g23Var) {
        return new tr6(new oql(g23Var));
    }

    public static kd6 r(hgx0 hgx0Var) {
        tzo tzoVar = new tzo((byte) 0);
        tzoVar.b = iy81.a(new fyo((byte) 2));
        return new kd6(tzoVar);
    }

    public static hz6 s(a2x0 a2x0Var) {
        i3b i3bVar = new i3b((byte) 26);
        i3bVar.b = iy81.a(new fyo((byte) 3));
        return new hz6(i3bVar);
    }

    public static jzp0 t(w5b1 w5b1Var) {
        return new jzp0(w5b1Var.c.c());
    }

    public static Looper u() {
        return Looper.getMainLooper();
    }

    public static String v(Context context) {
        return context.getString(2131958432);
    }

    public static er11 w() {
        return new er11();
    }

    public static um5 x(fza fzaVar) {
        return new um5(fzaVar, (byte) 18);
    }

    public static vq6 y(nzp nzpVar) {
        return new vq6(nzpVar, (byte) 0);
    }

    public static vq6 z(h0q h0qVar) {
        return new vq6(h0qVar, (byte) 1);
    }
}
