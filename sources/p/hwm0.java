package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hwm0 extends x8 {
    public final x8 e;
    public final dp5 f;

    public hwm0(x8 x8Var, dp5 dp5Var) {
        x8Var.getClass();
        this.e = x8Var;
        this.f = dp5Var;
    }

    @Override // p.x8
    public final void b() {
        this.e.b();
    }

    @Override // p.x8
    public final Map e() {
        return new qqg0(this.e.a(), new m6k0(this, (byte) 7));
    }

    @Override // p.x8
    public final Collection f() {
        return new v8(this, (byte) 0);
    }

    @Override // p.x8
    public final Set g() {
        return this.e.k();
    }

    @Override // p.x8
    public final Iterator i() {
        return new bo90(this.e.h().iterator(), new nqg0(this.f));
    }

    @Override // p.x8
    public final Collection j(Object obj) {
        return z1p1.D((List) this.e.j(obj), new lqg0(this.f, obj));
    }

    @Override // p.x8
    public final boolean l(Object obj, Object obj2) {
        return j(obj).remove(obj2);
    }

    @Override // p.x8
    public final int m() {
        return this.e.m();
    }
}
