package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nt0 implements h0r0 {
    public final hvj a;
    public final vt0 b;
    public final lzn0 c;
    public final av0 d;
    public final kwo e;
    public final fv0 f;
    public final yq0 g;
    public final dz0 h;
    public final ddo i;
    public final r791 j;
    public final q7r0 k;
    public final q8n l;
    public final bt0 m;
    public final a44 n;
    public final zt0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ynb0 f82p;
    public final woa q;
    public final lt0 r;
    public final u70 s;
    public final cbr0 t;
    public faa0 u;
    public String v;
    public String w;

    public nt0(hvj hvjVar, vt0 vt0Var, lzn0 lzn0Var, g9c0 g9c0Var, av0 av0Var, kwo kwoVar, fv0 fv0Var, yq0 yq0Var, dz0 dz0Var, ddo ddoVar, r791 r791Var, q7r0 q7r0Var, q8n q8nVar, bt0 bt0Var, a44 a44Var, zt0 zt0Var, ynb0 ynb0Var) {
        this.a = hvjVar;
        this.b = vt0Var;
        this.c = lzn0Var;
        this.d = av0Var;
        this.e = kwoVar;
        this.f = fv0Var;
        this.g = yq0Var;
        this.h = dz0Var;
        this.i = ddoVar;
        this.j = r791Var;
        this.k = q7r0Var;
        this.l = q8nVar;
        this.m = bt0Var;
        this.n = a44Var;
        this.o = zt0Var;
        this.f82p = ynb0Var;
        this.q = g9c0Var.a(q7r0Var.d.c);
        this.r = new lt0(fv0Var.b(), (byte) 0);
        this.s = new u70(fv0Var.b(), (byte) 4);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.t = new cbr0(new dbr0[]{new bn70(yon1.B(), nik1.d2, (nar0) null), new pu00(true), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.t;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 0)), apo.j(2143526975, new o2(this, (byte) 10), true));
    }

    public final Object c(tv80 tv80Var, a8d1 a8d1Var) {
        p1f0 p1f0VarW = rrn1.w(nik1.z0.a);
        p1f0VarW.i();
        if (tv80Var != null) {
            p1f0VarW.B(tv80Var);
        }
        Object objH = c921.H(this.l, new k2(this, p1f0VarW, (lnm) null, (byte) 4), a8d1Var);
        return objH == d9n.a ? objH : rih1.a;
    }
}
