package p;

import android.os.Handler;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z9p {
    public final Object A;
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
    public final Object f87p;
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

    public z9p(v801 v801Var, p901 p901Var, q7r0 q7r0Var) {
        this.j = p901Var;
        this.k = v801Var;
        this.a = q7r0Var;
        byte b = 12;
        this.b = xqu.b(new ykq(this, 0, b));
        this.c = xqu.b(new ykq(this, 2, b));
        this.d = xqu.b(new ykq(this, 3, b));
        this.e = xqu.b(new ykq(this, 1, b));
        this.l = new ykq(this, 4, b);
        this.m = new ykq(this, 6, b);
        this.n = new ykq(this, 7, b);
        this.o = new ykq(this, 9, b);
        this.f87p = new ykq(this, 10, b);
        this.q = new ykq(this, 8, b);
        this.f = xqu.b(new ykq(this, 11, b));
        this.g = xqu.b(new ykq(this, 5, b));
        this.h = iy81.a(new ykq(this, b, b));
        this.i = iy81.a(new ykq(this, 13, b));
        this.r = iy81.a(new ykq(this, 16, b));
        this.s = iy81.a(new ykq(this, 17, b));
        this.t = iy81.a(new ykq(this, 15, b));
        this.u = xqu.b(new ykq(this, 18, b));
        this.v = iy81.a(new ykq(this, 19, b));
        this.w = iy81.a(new ykq(this, 21, b));
        this.x = iy81.a(new ykq(this, 20, b));
        this.y = iy81.a(new ykq(this, 22, b));
        this.z = iy81.a(new ykq(this, 23, b));
        this.A = iy81.a(new ykq(this, 14, b));
    }

    public vu4 a() {
        luk lukVarA = ((v801) this.k).a();
        c8o.l(lukVarA);
        return new vu4(false, false, false, lukVarA);
    }

    public v1k b() {
        String str = ((p901) this.j).a;
        c8o.m(str);
        i8h1 i8h1Var = (i8h1) ((v801) this.k).u.get();
        c8o.l(i8h1Var);
        return new v1k(str, i8h1Var, (otl0) ((ykq) this.m).get(), (byte) 20);
    }

    public sso c() {
        LinkedHashMap linkedHashMapC0 = d0p1.c0(2);
        ynb0 ynb0VarA = xqu.a((d7p) this.m);
        ynb0 ynb0VarA2 = xqu.a((d7p) this.r);
        k4z0 k4z0Var = new k4z0((byte) 0);
        k4z0Var.b = ynb0VarA;
        k4z0Var.c = ynb0VarA2;
        linkedHashMapC0.put(m4z0.class, k4z0Var);
        ynb0 ynb0VarA3 = xqu.a((d7p) this.y);
        ynb0 ynb0VarA4 = xqu.a((d7p) this.z);
        w7w w7wVar = new w7w((byte) 18);
        w7wVar.b = ynb0VarA3;
        w7wVar.c = ynb0VarA4;
        linkedHashMapC0.put(wne0.class, w7wVar);
        return new sso(linkedHashMapC0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapC0));
    }

    public ruz d() {
        return ((cyp) ((jly0) this.u).get()).a();
    }

    public k3i0 e() {
        ud71 ud71Var = (ud71) this.j;
        return new k3i0(ud71Var.a, ud71Var.c);
    }

    public jz51 f() {
        v801 v801Var = (v801) this.k;
        lzn0 lzn0Var = (lzn0) v801Var.b.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) v801Var.c.get();
        c8o.l(a1r0Var);
        dg30 dg30Var = (dg30) v801Var.q.get();
        c8o.l(dg30Var);
        return new jz51(lzn0Var, a1r0Var, dg30Var);
    }

    public yp91 g() {
        v801 v801Var = (v801) this.k;
        uvy uvyVar = (uvy) v801Var.w.get();
        c8o.l(uvyVar);
        luk lukVarA = v801Var.a();
        c8o.l(lukVarA);
        yu4 yu4Var = new yu4(false, lukVarA);
        q8n q8nVar = (q8n) v801Var.e.get();
        c8o.l(q8nVar);
        return new yp91(f2u0.D(h()), uvyVar, yu4Var, q8nVar);
    }

    public FlowableFilter h() {
        v801 v801Var = (v801) this.k;
        t8u0 t8u0Var = (t8u0) v801Var.r.get();
        c8o.l(t8u0Var);
        iac0 iac0VarO = xcz0.o((q7r0) this.a);
        Flowable flowable = (Flowable) v801Var.s.get();
        c8o.l(flowable);
        loc1 loc1Var = new loc1();
        Scheduler scheduler = (Scheduler) ((ykq) this.l).get();
        yqg yqgVar = (yqg) v801Var.h.get();
        c8o.l(yqgVar);
        cyp cypVarA = t8u0Var.a(iac0VarO.getLifecycle());
        grb1 grb1Var = new grb1(flowable.L(scheduler), yqgVar, new erb1(yqgVar), new frb1(yqgVar), new Handler());
        cypVarA.a();
        cypVarA.c();
        r2a1 r2a1Var = new r2a1(loc1Var, grb1Var.l, (byte) 22);
        int i = Flowable.a;
        return new FlowableCreate(r2a1Var, BackpressureStrategy.d).L(scheduler).x(xi10.Z0);
    }

    public z9p(iso isoVar, uso usoVar, fso fsoVar, q7r0 q7r0Var) {
        this.j = isoVar;
        this.k = usoVar;
        this.a = q7r0Var;
        this.b = xqu.b(new d7p(this, 2, (byte) 21));
        this.c = iy81.a(new d7p(this, 4, (byte) 21));
        this.l = new d7p(this, 3, (byte) 21);
        this.m = new d7p(this, 5, (byte) 21);
        this.n = new d7p(this, 7, (byte) 21);
        this.o = new d7p(this, 8, (byte) 21);
        this.f87p = new d7p(this, 9, (byte) 21);
        this.q = new d7p(this, 10, (byte) 21);
        this.r = new d7p(this, 6, (byte) 21);
        this.s = new d7p(this, 12, (byte) 21);
        this.t = new d7p(this, 13, (byte) 21);
        this.u = new d7p(this, 14, (byte) 21);
        this.v = new d7p(this, 15, (byte) 21);
        this.w = new d7p(this, 16, (byte) 21);
        this.d = iy81.a(new d7p(this, 18, (byte) 21));
        this.x = new d7p(this, 17, (byte) 21);
        this.y = new d7p(this, 11, (byte) 21);
        this.z = new d7p(this, 19, (byte) 21);
        this.e = xqu.b(new d7p(this, 20, (byte) 21));
        this.f = xqu.b(new d7p(this, 1, (byte) 21));
        this.g = xqu.b(new d7p(this, 0, (byte) 21));
        this.h = xqu.b(new d7p(this, 21, (byte) 21));
        this.A = new d7p(this, 22, (byte) 21);
        this.i = xqu.b(new d7p(this, 23, (byte) 21));
    }

    public z9p(f971 f971Var, jl21 jl21Var, dc31 dc31Var, oh41 oh41Var, dg8 dg8Var, oy1 oy1Var, oy1 oy1Var2, ke71 ke71Var, cab cabVar, t2 t2Var, r2a1 r2a1Var, i6c i6cVar, in8 in8Var, kr60 kr60Var, yjq yjqVar, k811 k811Var, fad0 fad0Var, yge0 yge0Var, eyh0 eyh0Var, e821 e821Var, kqi0 kqi0Var, dxy dxyVar, vi11 vi11Var, nuh0 nuh0Var, xj1 xj1Var, lik1 lik1Var, i1z i1zVar) {
        this.j = f971Var;
        this.k = jl21Var;
        this.a = dc31Var;
        this.b = oh41Var;
        this.c = dg8Var;
        this.d = oy1Var;
        this.e = oy1Var2;
        this.f = ke71Var;
        this.g = cabVar;
        this.h = t2Var;
        this.i = r2a1Var;
        this.l = i6cVar;
        this.m = in8Var;
        this.n = kr60Var;
        this.o = yjqVar;
        this.f87p = k811Var;
        this.q = fad0Var;
        this.r = yge0Var;
        this.s = eyh0Var;
        this.t = e821Var;
        this.u = kqi0Var;
        this.v = dxyVar;
        this.w = vi11Var;
        this.x = nuh0Var;
        this.y = xj1Var;
        this.z = lik1Var;
        this.A = i1zVar;
    }

    public z9p(ud71 ud71Var) {
        this.j = ud71Var;
        byte b = 8;
        this.k = new ipq(this, 0, b);
        this.a = new ipq(this, 1, b);
        this.b = new ipq(this, 2, b);
        this.c = new ipq(this, 3, b);
        this.d = new ipq(this, 4, b);
        this.e = new ipq(this, 5, b);
        this.f = new ipq(this, 6, b);
        this.g = new ipq(this, 7, b);
        this.h = new ipq(this, b, b);
        this.i = new ipq(this, 9, b);
        this.l = new ipq(this, 10, b);
        this.m = new ipq(this, 11, b);
        this.n = new ipq(this, 12, b);
        this.o = new ipq(this, 13, b);
        this.f87p = new ipq(this, 14, b);
        this.q = new ipq(this, 15, b);
        this.r = new ipq(this, 16, b);
        this.s = new ipq(this, 17, b);
        this.t = new ipq(this, 18, b);
        this.u = new ipq(this, 19, b);
        this.v = new ipq(this, 20, b);
        this.w = new ipq(this, 21, b);
        this.x = new ipq(this, 22, b);
        this.y = new ipq(this, 23, b);
        this.z = new ipq(this, 24, b);
        this.A = new ipq(this, 25, b);
    }
}
