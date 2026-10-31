package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eqb0 implements fg5 {
    public final o860 a;
    public final m7a0 b;
    public final boolean c;
    public final ffr d;

    public eqb0(o860 o860Var, m7a0 m7a0Var, boolean z) {
        this.a = o860Var;
        this.b = m7a0Var;
        this.c = z;
        this.d = ((voe0) ((uw0) o860Var.b).d).b(new p5(this, (byte) 29));
    }

    @Override // p.fg5
    public final pf5 F(kf30 kf30Var) {
        pf5 pf5Var;
        m7a0 m7a0Var = this.b;
        cb11 cb11VarA = m7a0Var.a(kf30Var);
        if (cb11VarA != null && (pf5Var = (pf5) this.d.invoke(cb11VarA)) != null) {
            return pf5Var;
        }
        ajn0 ajn0Var = l7a0.a;
        return l7a0.a(kf30Var, m7a0Var, this.a);
    }

    @Override // p.fg5
    public final boolean d0(kf30 kf30Var) {
        return F(kf30Var) != null;
    }

    @Override // p.fg5
    public final boolean isEmpty() {
        return this.b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m7a0 m7a0Var = this.b;
        n561 sgg1Var = new sgg1(this.d, new i46(m7a0Var.getAnnotations(), (byte) 1));
        ajn0 ajn0Var = l7a0.a;
        return new mf20(z561.V(z561.Z(z561.i0(new n561[]{sgg1Var, z561.h0(l7a0.a(rfb1.m, m7a0Var, this.a))}))));
    }
}
