package p;

import android.content.Context;
import android.os.Parcelable;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class voa {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f72p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public voa(oe7 oe7Var, pe7 pe7Var, q7r0 q7r0Var) {
        this.a = pe7Var;
        this.b = oe7Var;
        this.c = q7r0Var;
        this.d = xqu.b(new fwo(this, 1, (byte) 27));
        this.e = byo.b(this, 3);
        this.f = byo.b(this, 2);
        this.g = byo.b(this, 4);
        this.h = xqu.b(new fwo(this, 6, (byte) 27));
        this.i = byo.b(this, 5);
        this.j = byo.b(this, 7);
        this.k = byo.b(this, 8);
        this.l = byo.b(this, 0);
        this.m = byo.b(this, 12);
        this.n = xqu.b(new fwo(this, 13, (byte) 27));
        this.o = xqu.b(new fwo(this, 16, (byte) 27));
        this.f72p = byo.b(this, 15);
        this.q = xqu.b(new fwo(this, 14, (byte) 27));
        this.r = byo.b(this, 11);
        this.s = byo.b(this, 17);
        this.t = byo.b(this, 18);
        this.u = byo.b(this, 19);
        this.v = byo.b(this, 20);
        this.w = byo.b(this, 21);
        this.x = byo.b(this, 10);
        this.y = xqu.b(new fwo(this, 25, (byte) 27));
        this.z = xqu.b(new fwo(this, 24, (byte) 27));
        this.A = xqu.b(new fwo(this, 23, (byte) 27));
        this.B = byo.b(this, 26);
        this.C = byo.b(this, 27);
        this.D = byo.b(this, 22);
        this.E = byo.b(this, 9);
    }

    public vu4 a() {
        luk lukVarW = ((ve50) this.a).w();
        c8o.l(lukVarW);
        return new vu4(false, false, false, lukVarW);
    }

    public ow3 b() {
        oe7 oe7Var = (oe7) this.b;
        Context contextA = oe7Var.a();
        c8o.l(contextA);
        n451 n451Var = (n451) oe7Var.u.get();
        c8o.l(n451Var);
        return new ow3(contextA, n451Var, (byte) 17);
    }

    public gae c() {
        oe7 oe7Var = (oe7) this.b;
        xrc0 xrc0VarC = oe7Var.c();
        c8o.l(xrc0VarC);
        me30 me30Var = (me30) oe7Var.G.get();
        c8o.l(me30Var);
        e0b e0bVar = new e0b(xrc0VarC, me30Var, (t0p) ((jly0) this.f).get());
        yn50 yn50Var = new yn50(((jly0) this.g).get(), (byte) 2);
        kly0 kly0Var = oe7Var.M;
        agc0 agc0Var = (agc0) kly0Var.get();
        c8o.l(agc0Var);
        ccc0 ccc0Var = (ccc0) oe7Var.L.get();
        c8o.l(ccc0Var);
        xrc0 xrc0VarC2 = oe7Var.c();
        c8o.l(xrc0VarC2);
        zwm1 zwm1Var = (zwm1) oe7Var.N.get();
        c8o.l(zwm1Var);
        String str = ((pe7) this.a).b;
        c8o.m(str);
        agc0 agc0Var2 = (agc0) kly0Var.get();
        c8o.l(agc0Var2);
        yn50 yn50Var2 = new yn50(agc0Var, new lcc0(ccc0Var, new v6a0(xrc0VarC2, zwm1Var, str, agc0Var2)));
        yn50 yn50Var3 = new yn50(((jly0) this.i).get(), (byte) 0);
        z0t z0tVar = (z0t) oe7Var.P.get();
        c8o.l(z0tVar);
        l0p l0pVar = (l0p) ((jly0) this.j).get();
        xrm1 xrm1Var = (xrm1) oe7Var.O.get();
        c8o.l(xrm1Var);
        c5c c5cVar = new c5c(z0tVar, l0pVar, xrm1Var);
        m0p m0pVar = (m0p) ((jly0) this.k).get();
        rxj0 rxj0Var = (rxj0) oe7Var.H.get();
        c8o.l(rxj0Var);
        return new gae(p7h.M(new ejo[]{e0bVar, yn50Var2, yn50Var3, c5cVar, new c5c(m0pVar, rxj0Var), yn50Var}));
    }

    public l270 d() {
        return (l270) this.j;
    }

    public yqg e() {
        return (yqg) this.g;
    }

    public luk f() {
        return (luk) this.d;
    }

    public iru g() {
        return (fxu) this.b;
    }

    public t2j0 h() {
        return (t2j0) this.h;
    }

    public nfa0 i() {
        return (nfa0) this.i;
    }

    public o241 j() {
        return (o241) this.e;
    }

    public RxRouter k() {
        return (RxRouter) this.a;
    }

    public lik1 l() {
        pe7 pe7Var = (pe7) this.a;
        Parcelable.Creator creator = lik1.CREATOR;
        Set set = s4b1.f;
        String strZ = uic.x(pe7Var.a).z();
        if (strZ != null) {
            return new lik1(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public voa(RxRouter rxRouter, fxu fxuVar, r3b1 r3b1Var, luk lukVar, o241 o241Var, Context context, yqg yqgVar, t2j0 t2j0Var, nfa0 nfa0Var, l270 l270Var, zwz0 zwz0Var, vfs0 vfs0Var, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, q8n q8nVar2, q8n q8nVar3, q8n q8nVar4, y2g0 y2g0Var, gw70 gw70Var, be beVar, z48 z48Var, hmn0 hmn0Var, s6b1 s6b1Var, uu00 uu00Var, Cosmonaut cosmonaut, mrj1 mrj1Var, vsg vsgVar, byp0 byp0Var, c2u0 c2u0Var, pjm0 pjm0Var) {
        this.a = rxRouter;
        this.b = fxuVar;
        this.c = r3b1Var;
        this.d = lukVar;
        this.e = o241Var;
        this.f = context;
        this.g = yqgVar;
        this.h = t2j0Var;
        this.i = nfa0Var;
        this.j = l270Var;
        this.k = zwz0Var;
        this.l = vfs0Var;
        this.m = scheduler;
        this.n = scheduler2;
        this.o = q8nVar;
        this.f72p = q8nVar2;
        this.q = q8nVar3;
        this.r = q8nVar4;
        this.s = y2g0Var;
        this.t = gw70Var;
        this.u = beVar;
        this.v = z48Var;
        this.w = hmn0Var;
        this.x = s6b1Var;
        this.y = uu00Var;
        this.z = cosmonaut;
        this.A = mrj1Var;
        this.B = vsgVar;
        this.C = byp0Var;
        this.D = c2u0Var;
        this.E = pjm0Var;
    }

    public voa(ve50 ve50Var, q2p0 q2p0Var) {
        this.a = ve50Var;
        this.b = q2p0Var;
        this.c = byo.y(this, 2);
        this.d = byo.y(this, 1);
        this.e = byo.y(this, 3);
        this.f = byo.y(this, 4);
        this.g = byo.y(this, 5);
        this.h = byo.y(this, 7);
        this.i = byo.y(this, 9);
        this.j = byo.y(this, 10);
        this.k = byo.y(this, 8);
        this.l = byo.y(this, 11);
        byte b = 15;
        this.m = new chp(this, 12, b);
        this.n = byo.y(this, 14);
        this.o = byo.y(this, 15);
        this.f72p = byo.y(this, 13);
        this.q = new chp(this, 6, b);
        this.r = new chp(this, 16, b);
        this.s = byo.y(this, 17);
        this.t = byo.y(this, 18);
        this.u = byo.y(this, 19);
        this.v = byo.y(this, 20);
        this.w = byo.y(this, 21);
        this.x = byo.y(this, 22);
        this.y = new chp(this, 23, b);
        this.z = new chp(this, 24, b);
        this.A = xqu.b(new chp(this, 25, b));
        this.B = new chp(this, 26, b);
        this.C = new chp(this, 27, b);
        this.D = byo.y(this, 28);
        this.E = new chp(this, 0, b);
    }
}
