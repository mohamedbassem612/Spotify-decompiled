package p;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v340 extends v3k {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final oi d;
    public HashSet e;
    public final oen0 f;
    public final hrr0 g;
    public final /* synthetic */ x340 h;

    public v340(x340 x340Var, long j, boolean z, boolean z2, oi oiVar) {
        this.h = x340Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = oiVar;
        oen0 oen0Var = ij41.a;
        this.f = new oen0();
        eso1.B();
        this.g = xto.s(xos0.e, c4x0.f);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void A() {
        oen0 oen0Var = this.f;
        if (oen0Var.h()) {
            HashSet hashSet = this.e;
            if (hashSet != null) {
                Object[] objArr = oen0Var.b;
                long[] jArr = oen0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    x340 x340Var = (x340) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(x340Var.B());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            oen0Var.b();
        }
    }

    @Override // p.v3k
    public final void a(h4k h4kVar, vu30 vu30Var) {
        this.h.b.a(h4kVar, vu30Var);
    }

    @Override // p.v3k
    public final oen0 b(h4k h4kVar, n181 n181Var, vu30 vu30Var) {
        return this.h.b.b(h4kVar, n181Var, vu30Var);
    }

    @Override // p.v3k
    public final void c(znm0 znm0Var) {
        this.h.b.c(znm0Var);
    }

    @Override // p.v3k
    public final void d() {
        this.h.A--;
    }

    @Override // p.v3k
    public final boolean e() {
        return this.h.b.e();
    }

    @Override // p.v3k
    public final boolean f() {
        return this.b;
    }

    @Override // p.v3k
    public final boolean g() {
        return this.c;
    }

    @Override // p.v3k
    public final long h() {
        return this.a;
    }

    @Override // p.v3k
    public final j3k i() {
        return this.h.h;
    }

    @Override // p.v3k
    public final xos0 j() {
        return (xos0) this.g.getValue();
    }

    @Override // p.v3k
    public final o8n k() {
        return this.h.b.k();
    }

    @Override // p.v3k
    public final oi l() {
        return this.d;
    }

    @Override // p.v3k
    public final boolean m() {
        return this.h.b.m();
    }

    @Override // p.v3k
    public final void n(znm0 znm0Var) {
        this.h.b.n(znm0Var);
    }

    @Override // p.v3k
    public final void o(h4k h4kVar) {
        x340 x340Var = this.h;
        v3k v3kVar = x340Var.b;
        v3kVar.o(x340Var.h);
        v3kVar.o(h4kVar);
    }

    @Override // p.v3k
    public final void p(znm0 znm0Var, ynm0 ynm0Var, j06 j06Var) {
        this.h.b.p(znm0Var, ynm0Var, j06Var);
    }

    @Override // p.v3k
    public final ynm0 q(znm0 znm0Var) {
        return this.h.b.q(znm0Var);
    }

    @Override // p.v3k
    public final oen0 r(h4k h4kVar, n181 n181Var, oen0 oen0Var) {
        return this.h.b.r(h4kVar, n181Var, oen0Var);
    }

    @Override // p.v3k
    public final void s(Set set) {
        HashSet hashSet = this.e;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.e = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p.v3k
    public final void t(x340 x340Var) {
        this.f.a(x340Var);
    }

    @Override // p.v3k
    public final void u(h311 h311Var) {
        this.h.b.u(h311Var);
    }

    @Override // p.v3k
    public final void v(h4k h4kVar) {
        this.h.b.v(h4kVar);
    }

    @Override // p.v3k
    public final uhd w(g030 g030Var) {
        return this.h.b.w(g030Var);
    }

    @Override // p.v3k
    public final void x() {
        this.h.A++;
    }

    @Override // p.v3k
    public final void y(x340 x340Var) {
        HashSet hashSet = this.e;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(x340Var.B());
            }
        }
        if (x340Var != null) {
            this.f.l(x340Var);
        }
    }

    @Override // p.v3k
    public final void z(h4k h4kVar) {
        this.h.b.z(h4kVar);
    }
}
