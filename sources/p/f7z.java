package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.eventsender.api.EventSenderCoreBridge;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class f7z implements jly0 {
    public static pov0 A(wep wepVar) {
        pov0 pov0Var = (pov0) wepVar.b.get();
        c8o.m(pov0Var);
        return pov0Var;
    }

    public static ga81 B(RxRouter rxRouter) {
        return new ga81(new CosmosTransport(new sn0(rxRouter, (byte) 20)));
    }

    public static yep a(yc00 yc00Var) {
        return new yep(yc00Var);
    }

    public static nhc b() {
        return new nhc((byte) 9);
    }

    public static e7z c(kly0 kly0Var, thq thqVar, kly0 kly0Var2, jo80 jo80Var, caq caqVar, caq caqVar2, kly0 kly0Var3, r7q r7qVar, caq caqVar3, jly0 jly0Var, kly0 kly0Var4, caq caqVar4, jo80 jo80Var2, jo80 jo80Var3, r7q r7qVar2, thq thqVar2, thq thqVar3, r7q r7qVar3, kly0 kly0Var5, kly0 kly0Var6, thq thqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var7, thq thqVar5, g5t g5tVar, gbp gbpVar, caq caqVar7, caq caqVar8, caq caqVar9, gbp gbpVar2, r7q r7qVar4, kly0 kly0Var8, thq thqVar6, r7q r7qVar5, caq caqVar10, thq thqVar7, kly0 kly0Var9, kly0 kly0Var10, gbp gbpVar3, caq caqVar11, kly0 kly0Var11, kly0 kly0Var12, gbp gbpVar4, gbp gbpVar5, caq caqVar12, r7q r7qVar6, r7q r7qVar7, r7q r7qVar8, r7q r7qVar9, jly0 jly0Var2, caq caqVar13, caq caqVar14, r7q r7qVar10, g5t g5tVar2, kly0 kly0Var13, r7q r7qVar11, gbp gbpVar6, r7q r7qVar12, gbp gbpVar7, kly0 kly0Var14, kly0 kly0Var15, kly0 kly0Var16, kly0 kly0Var17, kly0 kly0Var18, kly0 kly0Var19, r7q r7qVar13, r7q r7qVar14, kly0 kly0Var20, r7q r7qVar15, kly0 kly0Var21, jly0 jly0Var3, caq caqVar15, kly0 kly0Var22) {
        e7z e7zVar = new e7z();
        e7zVar.a = kly0Var;
        e7zVar.b = thqVar;
        e7zVar.c = kly0Var2;
        e7zVar.d = jo80Var;
        e7zVar.e = caqVar;
        e7zVar.f = caqVar2;
        e7zVar.g = kly0Var3;
        e7zVar.h = r7qVar;
        e7zVar.i = caqVar3;
        e7zVar.j = jly0Var;
        e7zVar.k = kly0Var4;
        e7zVar.l = caqVar4;
        e7zVar.m = jo80Var2;
        e7zVar.n = jo80Var3;
        e7zVar.o = r7qVar2;
        e7zVar.f2p = thqVar2;
        e7zVar.q = thqVar3;
        e7zVar.r = r7qVar3;
        e7zVar.s = kly0Var5;
        e7zVar.t = kly0Var6;
        e7zVar.u = thqVar4;
        e7zVar.v = caqVar5;
        e7zVar.w = caqVar6;
        e7zVar.x = kly0Var7;
        e7zVar.y = thqVar5;
        e7zVar.z = g5tVar;
        e7zVar.A = gbpVar;
        e7zVar.B = caqVar7;
        e7zVar.C = caqVar8;
        e7zVar.D = caqVar9;
        e7zVar.E = gbpVar2;
        e7zVar.F = r7qVar4;
        e7zVar.G = kly0Var8;
        e7zVar.H = thqVar6;
        e7zVar.I = r7qVar5;
        e7zVar.J = caqVar10;
        e7zVar.K = thqVar7;
        e7zVar.L = kly0Var9;
        e7zVar.M = kly0Var10;
        e7zVar.N = gbpVar3;
        e7zVar.O = caqVar11;
        e7zVar.P = kly0Var11;
        e7zVar.Q = kly0Var12;
        e7zVar.R = gbpVar4;
        e7zVar.S = gbpVar5;
        e7zVar.T = caqVar12;
        e7zVar.U = r7qVar6;
        e7zVar.V = r7qVar7;
        e7zVar.W = r7qVar8;
        e7zVar.X = r7qVar9;
        e7zVar.Y = jly0Var2;
        e7zVar.Z = caqVar13;
        e7zVar.a0 = caqVar14;
        e7zVar.b0 = r7qVar10;
        e7zVar.c0 = g5tVar2;
        e7zVar.d0 = kly0Var13;
        e7zVar.e0 = r7qVar11;
        e7zVar.f0 = gbpVar6;
        e7zVar.g0 = r7qVar12;
        e7zVar.h0 = gbpVar7;
        e7zVar.i0 = kly0Var14;
        e7zVar.j0 = kly0Var15;
        e7zVar.k0 = kly0Var16;
        e7zVar.l0 = kly0Var17;
        e7zVar.m0 = kly0Var18;
        e7zVar.n0 = kly0Var19;
        e7zVar.o0 = r7qVar13;
        e7zVar.p0 = r7qVar14;
        e7zVar.q0 = kly0Var20;
        e7zVar.r0 = r7qVar15;
        e7zVar.s0 = kly0Var21;
        e7zVar.t0 = jly0Var3;
        e7zVar.u0 = caqVar15;
        e7zVar.v0 = kly0Var22;
        return e7zVar;
    }

    public static ijz d(ynb0 ynb0Var) {
        return new ijz();
    }

    public static r700 e(jly0 jly0Var, jly0 jly0Var2) {
        r700 r700Var = new r700();
        r700Var.a = jly0Var;
        r700Var.b = jly0Var2;
        return r700Var;
    }

    public static t700 f(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 0);
    }

    public static void g() {
        r6h1 r6h1Var = r6h1.c;
    }

    public static u9c0 h(gj5 gj5Var) {
        return zso1.H(((f0i) gj5Var).a);
    }

    public static lmo i(vk00 vk00Var) {
        return new lmo(vk00Var.a);
    }

    public static mev j(yqg yqgVar) {
        return new mev(yqgVar, (byte) 8);
    }

    public static wep k(cqz cqzVar) {
        return new wep(cqzVar);
    }

    public static kb00 l(yep yepVar) {
        kb00 kb00Var = (kb00) yepVar.b.get();
        c8o.m(kb00Var);
        return kb00Var;
    }

    public static nb00 m(yep yepVar) {
        nb00 nb00Var = (nb00) yepVar.k.get();
        c8o.m(nb00Var);
        return nb00Var;
    }

    public static t2j0 n(yep yepVar) {
        t2j0 t2j0Var = (t2j0) yepVar.l.get();
        c8o.m(t2j0Var);
        return t2j0Var;
    }

    public static xb00 o(yep yepVar) {
        xb00 xb00Var = (xb00) yepVar.j.get();
        c8o.m(xb00Var);
        return xb00Var;
    }

    public static EventSenderCoreBridge p(yep yepVar) {
        EventSenderCoreBridge eventSenderCoreBridge = (EventSenderCoreBridge) yepVar.m.get();
        c8o.m(eventSenderCoreBridge);
        return eventSenderCoreBridge;
    }

    public static d2e q(RetrofitMaker retrofitMaker) {
        return (d2e) retrofitMaker.createWebgateService(d2e.class, "android-home-evo-page");
    }

    public static kp00 r(w25 w25Var, xrk xrkVar) {
        return new kp00(w25Var, xrkVar, (byte) 26);
    }

    public static sp00 s(xfx xfxVar, lo60 lo60Var, gw70 gw70Var, agc0 agc0Var) {
        return new sp00(xfxVar, lo60Var, gw70Var, agc0Var);
    }

    public static np60 t(mp60 mp60Var, lbp lbpVar, lbp lbpVar2, lbp lbpVar3, lbp lbpVar4, lbp lbpVar5, lbp lbpVar6, vk00 vk00Var, w25 w25Var) {
        String str = vk00Var.a;
        if (u890.j(str, "static-chip")) {
            return (np60) lbpVar.get();
        }
        if (u890.j(str, "sandbox-chip")) {
            return (np60) lbpVar2.get();
        }
        if (u890.j(str, "cardashians-chip")) {
            return (np60) lbpVar3.get();
        }
        if (u890.j(str, "cardashians-music-chip")) {
            return (np60) lbpVar4.get();
        }
        return u890.j(str, "top-stories-chip") ? (np60) lbpVar5.get() : new w3t(w25Var, lbpVar6, mp60Var);
    }

    public static bzm0 u(yep yepVar) {
        bzm0 bzm0Var = (bzm0) yepVar.c.get();
        c8o.m(bzm0Var);
        return bzm0Var;
    }

    public static c3n0 v(yep yepVar) {
        c3n0 c3n0Var = (c3n0) yepVar.b.get();
        c8o.m(c3n0Var);
        return c3n0Var;
    }

    public static vfs0 w(yep yepVar) {
        vfs0 vfs0Var = (vfs0) yepVar.n.get();
        c8o.m(vfs0Var);
        return vfs0Var;
    }

    public static nay x(kzp kzpVar) {
        return new nay(kzpVar, (byte) 4);
    }

    public static t19 y(uf0 uf0Var) {
        Context context = uf0Var.a;
        w280 w280Var = b380.b;
        if (bg11.e == null) {
            bhn0.i("Null acceptLinkTypes");
            return null;
        }
        String string = context.getString(2131964133);
        if (string == null) {
            bhn0.i("Null title");
            return null;
        }
        String string2 = context.getString(2131964132);
        if (string2 == null) {
            bhn0.i("Null emptyTitle");
            return null;
        }
        String string3 = context.getString(2131964131);
        if (string3 == null) {
            bhn0.i("Null emptyActionText");
            return null;
        }
        bg11 bg11VarT = b380.t(blc0.k4);
        if (bg11VarT != null) {
            return new t19(string, string2, string3, bg11VarT);
        }
        bhn0.i("Null acceptLinkTypes");
        return null;
    }

    public static bqz z(wep wepVar) {
        bqz bqzVar = (bqz) wepVar.c.get();
        c8o.m(bqzVar);
        return bqzVar;
    }
}
