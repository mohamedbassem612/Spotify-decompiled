package p;

import android.content.Context;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ghp {
    public final b410 a;
    public final jly0 b = xqu.b(new chp(this, 0, (byte) 1));
    public final jly0 c = xqu.b(new chp(this, 5, (byte) 1));
    public final jly0 d = iy81.a(new chp(this, 4, (byte) 1));
    public final chp e = new chp(this, 8, (byte) 1);
    public final chp f = new chp(this, 9, (byte) 1);
    public final chp g = new chp(this, 10, (byte) 1);
    public final jly0 h = iy81.a(new chp(this, 7, (byte) 1));
    public final chp i = new chp(this, 6, (byte) 1);
    public final jly0 j = xqu.b(new chp(this, 3, (byte) 1));
    public final chp k = new chp(this, 12, (byte) 1);
    public final jly0 l = iy81.a(new chp(this, 13, (byte) 1));
    public final chp m = new chp(this, 14, (byte) 1);
    public final chp n = new chp(this, 11, (byte) 1);
    public final chp o = new chp(this, 15, (byte) 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final chp f6p = new chp(this, 16, (byte) 1);
    public final chp q = new chp(this, 2, (byte) 1);
    public final chp r = new chp(this, 17, (byte) 1);
    public final chp s = new chp(this, 18, (byte) 1);
    public final jly0 t = iy81.a(new chp(this, 21, (byte) 1));
    public final jly0 u = iy81.a(new chp(this, 20, (byte) 1));
    public final chp v = new chp(this, 19, (byte) 1);
    public final chp w = new chp(this, 22, (byte) 1);
    public final chp x = new chp(this, 24, (byte) 1);
    public final chp y = new chp(this, 23, (byte) 1);
    public final jly0 z = iy81.a(new chp(this, 26, (byte) 1));
    public final jly0 A = iy81.a(new chp(this, 27, (byte) 1));
    public final chp B = new chp(this, 25, (byte) 1);
    public final chp C = new chp(this, 28, (byte) 1);
    public final chp D = new chp(this, 29, (byte) 1);
    public final chp E = new chp(this, 30, (byte) 1);
    public final chp F = new chp(this, 31, (byte) 1);
    public final chp G = new chp(this, 32, (byte) 1);
    public final chp H = new chp(this, 33, (byte) 1);
    public final jly0 I = iy81.a(new chp(this, 35, (byte) 1));
    public final chp J = new chp(this, 34, (byte) 1);
    public final chp K = new chp(this, 36, (byte) 1);
    public final chp L = new chp(this, 37, (byte) 1);
    public final chp M = new chp(this, 38, (byte) 1);
    public final chp N = new chp(this, 39, (byte) 1);
    public final chp O = new chp(this, 42, (byte) 1);
    public final jly0 P = iy81.a(new chp(this, 41, (byte) 1));
    public final chp Q = new chp(this, 40, (byte) 1);
    public final chp R = new chp(this, 43, (byte) 1);
    public final chp S = new chp(this, 44, (byte) 1);
    public final chp T = new chp(this, 45, (byte) 1);
    public final chp U = new chp(this, 46, (byte) 1);
    public final chp V = new chp(this, 47, (byte) 1);
    public final jly0 W = xqu.b(new chp(this, 49, (byte) 1));
    public final jly0 X = xqu.b(new chp(this, 50, (byte) 1));
    public final chp Y = new chp(this, 48, (byte) 1);
    public final chp Z = new chp(this, 51, (byte) 1);
    public final chp a0 = new chp(this, 52, (byte) 1);
    public final chp b0 = new chp(this, 53, (byte) 1);
    public final chp c0 = new chp(this, 54, (byte) 1);
    public final chp d0 = new chp(this, 55, (byte) 1);
    public final chp e0 = new chp(this, 57, (byte) 1);
    public final jly0 f0 = iy81.a(new chp(this, 56, (byte) 1));
    public final jly0 g0 = xqu.b(new chp(this, 58, (byte) 1));
    public final jly0 h0 = iy81.a(new chp(this, 59, (byte) 1));
    public final jly0 i0 = xqu.b(new chp(this, 1, (byte) 1));
    public final jly0 j0 = xqu.b(new chp(this, 60, (byte) 1));
    public final chp k0 = new chp(this, 62, (byte) 1);
    public final jly0 l0 = xqu.b(new chp(this, 61, (byte) 1));
    public final jly0 m0 = xqu.b(new chp(this, 63, (byte) 1));
    public final jly0 n0 = xqu.b(new chp(this, 64, (byte) 1));
    public final jly0 o0 = iy81.a(new chp(this, 67, (byte) 1));
    public final chp p0 = new chp(this, 68, (byte) 1);
    public final jly0 q0 = iy81.a(new chp(this, 69, (byte) 1));
    public final jly0 r0 = iy81.a(new chp(this, 72, (byte) 1));
    public final jly0 s0 = iy81.a(new chp(this, 71, (byte) 1));
    public final jly0 t0 = iy81.a(new chp(this, 70, (byte) 1));
    public final jly0 u0 = iy81.a(new chp(this, 73, (byte) 1));
    public final jly0 v0 = xqu.b(new chp(this, 66, (byte) 1));
    public final jly0 w0 = xqu.b(new chp(this, 74, (byte) 1));
    public final jly0 x0 = iy81.a(new chp(this, 76, (byte) 1));
    public final jly0 y0 = iy81.a(new chp(this, 77, (byte) 1));
    public final jly0 z0 = xqu.b(new chp(this, 75, (byte) 1));
    public final jly0 A0 = xqu.b(new chp(this, 78, (byte) 1));
    public final jly0 B0 = xqu.b(new chp(this, 79, (byte) 1));
    public final jly0 C0 = iy81.a(new chp(this, 80, (byte) 1));
    public final jly0 D0 = xqu.b(new chp(this, 65, (byte) 1));
    public final jly0 E0 = xqu.b(new chp(this, 81, (byte) 1));

    public ghp(b410 b410Var) {
        this.a = b410Var;
    }

    public static p2k a() {
        t360 t360Var = new t360(8);
        t360Var.a(new f9h((byte) 3));
        t360Var.a(new cia((byte) 1));
        t360Var.a(new cia((byte) 2));
        t360Var.a(new cia((byte) 0));
        t360Var.a(new f9h((byte) 0));
        t360Var.a(new f9h((byte) 1));
        t360Var.a(new f9h((byte) 5));
        t360Var.a(new f9h((byte) 4));
        return new p2k(t360Var.d());
    }

    public static bm00 f() {
        return new bm00(Collections.singleton(new o2s((byte) 1)), (byte) 17);
    }

    public final Observable b() {
        b410 b410Var = this.a;
        zwm1 zwm1Var = (zwm1) b410Var.D0.get();
        return ((xum1) this.h.get()).a().map(new mjv((xna0) b410Var.Q.get(), zwm1Var, (byte) 0));
    }

    public final uw0 c() {
        return new uw0(xqu.a(this.E), xqu.a(this.F), xqu.a(this.G), xqu.a(this.H), xqu.a(this.x), xqu.a(this.D), xqu.a(this.j), xqu.a(this.y), xqu.a(this.i), xqu.a(this.n), xqu.a(this.s), xqu.a(this.r), xqu.a(this.J), xqu.a(this.K), (byte) 19);
    }

    public final q410 d() {
        b410 b410Var = this.a;
        return new q410(b410Var.f(), b410Var.e(), (xrc0) b410Var.g.get(), b410Var.c(), (wqg) b410Var.v.get(), (cyp) this.o0.get(), (n3d0) b410Var.Y.get(), b410Var.g(), this.k, b410Var.a(), (dxz0) b410Var.B.get(), (fgr) this.q0.get(), (q8n) b410Var.p.get(), (Flowable) b410Var.F0.get(), (uu00) b410Var.N.get());
    }

    public final mwm1 e() {
        return new mwm1(new CosmosTransport(new sn0((RxRouter) this.a.G.get(), (byte) 18)));
    }

    public final mre0 g() {
        b410 b410Var = this.a;
        yqg yqgVarA = b410Var.a();
        Context contextB = b410Var.b();
        zwg zwgVar = new zwg();
        Locale localeB = yoi1.A(contextB.getResources().getConfiguration()).b(0);
        zwgVar.d = yqgVarA;
        zwgVar.e = contextB;
        zwgVar.b = new SimpleDateFormat("d MMM", localeB);
        zwgVar.a = DateFormat.getDateInstance(2, localeB);
        zwgVar.c = new SimpleDateFormat("EEE", localeB);
        return new mre0(zwgVar, (byte) 6);
    }

    public final o3e0 h() {
        b410 b410Var = this.a;
        Context contextB = b410Var.b();
        aai0 aai0VarD = b410Var.d();
        p5y p5yVar = (p5y) b410Var.K.get();
        bm00 bm00VarF = f();
        agc0 agc0VarC = b410Var.c();
        new ue4(true, false, false, (luk) b410Var.s0.get());
        return new o3e0(contextB, aai0VarD, p5yVar, bm00VarF, agc0VarC);
    }

    public final Observable i() {
        return eth.X((xm41) this.a.u0.get()).map(f331.O0);
    }

    public final Set j() {
        t360 t360Var = new t360(32);
        t360Var.a(new v741(c(), this.L));
        t360Var.a(new z54(this.M));
        uw0 uw0VarC = c();
        chp chpVar = this.N;
        t360Var.a(new z54(uw0VarC, xqu.a(chpVar), (byte) 0));
        t360Var.a(new s64(c(), xqu.a(this.Q)));
        t360Var.a(new e74(xqu.a(chpVar), (byte) 0));
        t360Var.a(new z54(c(), xqu.a(this.R), (byte) 1));
        t360Var.a(new z54(c(), xqu.a(this.S)));
        t360Var.a(new e74(xqu.a(this.T), (byte) 1));
        t360Var.a(new s64(xqu.a(this.U), (byte) 1));
        t360Var.a(new h9h(c(), (byte) 4));
        t360Var.a(new e74(xqu.a(this.V), (byte) 2));
        t360Var.a(new h9h(c(), (byte) 14));
        t360Var.a(new dfp0(c()));
        ynb0 ynb0VarA = xqu.a(this.Y);
        ynb0 ynb0VarA2 = xqu.a(this.Z);
        ynb0 ynb0VarA3 = xqu.a(this.a0);
        ynb0 ynb0VarA4 = xqu.a(this.b0);
        ynb0 ynb0VarA5 = xqu.a(this.c0);
        b410 b410Var = this.a;
        t360Var.a(new jyq0(ynb0VarA, ynb0VarA2, ynb0VarA3, ynb0VarA4, ynb0VarA5, new zx4((luk) b410Var.s0.get())));
        t360Var.a(new qyq0(xqu.a(this.d0)));
        t360Var.a(new s64(new v1v0(c(), (Flowable) b410Var.E0.get()), (byte) 2));
        t360Var.a(new h9h(c(), (byte) 0));
        t360Var.a(new h9h(c(), (byte) 1));
        t360Var.a(new h9h(c(), (byte) 7));
        t360Var.a(new h9h(c(), (byte) 8));
        t360Var.a(new h9h(c(), (byte) 9));
        t360Var.a(new h9h(c(), (byte) 10));
        t360Var.a(new h9h(c(), (byte) 5));
        t360Var.a(new h9h(c(), (byte) 6));
        t360Var.a(new s64(c(), (byte) 3));
        t360Var.a(new h9h(c(), (byte) 15));
        t360Var.a(new h9h(c(), (byte) 11));
        t360Var.a(new h9h(c(), (byte) 12));
        t360Var.a(new h9h(c(), (byte) 13));
        t360Var.a(new dfp0(c(), new bw4(true, (luk) b410Var.s0.get())));
        t360Var.a(new h9h(c(), (byte) 2));
        t360Var.a(new h9h(c(), (byte) 3));
        return t360Var.d();
    }

    public final r2a1 k() {
        return new r2a1((dhp) this.u.get(), (lw21) this.a.r0.get(), (byte) 5);
    }

    public final e821 l() {
        b410 b410Var = this.a;
        Context contextB = b410Var.b();
        n3q0 n3q0Var = (n3q0) b410Var.X.get();
        aai0 aai0VarD = b410Var.d();
        zwm1 zwm1Var = (zwm1) b410Var.D0.get();
        e821 e821Var = new e821();
        e821Var.b = contextB;
        e821Var.a = n3q0Var;
        e821Var.c = aai0VarD;
        e821Var.d = zwm1Var;
        e821Var.e = f46.S0(new gtm1[]{gtm1.a, gtm1.b, gtm1.c, gtm1.d, gtm1.e, gtm1.f, gtm1.g});
        return e821Var;
    }
}
