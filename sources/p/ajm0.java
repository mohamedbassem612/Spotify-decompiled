package p;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ajm0 extends o9r implements zim0 {
    public final qoe0 X;
    public final idd1 Y;
    public final voe0 d;
    public final g6b0 e;
    public final Map f;
    public final mzq0 g;
    public yim0 h;
    public fzq0 i;
    public final boolean t;

    public ajm0(ajn0 ajn0Var, voe0 voe0Var, g6b0 g6b0Var, int i) {
        super(rzs0.g, ajn0Var);
        this.d = voe0Var;
        this.e = g6b0Var;
        if (!ajn0Var.b) {
            hhg1.g(ajn0Var, "Module name must be special: ");
            throw null;
        }
        this.f = b7x.a;
        mzq0 mzq0Var = (mzq0) t(kc20.V0);
        this.g = mzq0Var == null ? mzq0.a : mzq0Var;
        this.t = true;
        this.X = voe0Var.a(new gqb0(this, (byte) 5));
        this.Y = new idd1(new jia0(this, (byte) 1));
    }

    @Override // p.zim0
    public final dub0 D(kf30 kf30Var) {
        w1();
        return (dub0) this.X.invoke(kf30Var);
    }

    @Override // p.zim0
    public final boolean P(zim0 zim0Var) {
        if (this == zim0Var) {
            return true;
        }
        this.h.getClass();
        if (o7h.i0(w7x.a, zim0Var)) {
            return true;
        }
        i0();
        return zim0Var.i0().contains(this);
    }

    @Override // p.zim0
    public final g6b0 e() {
        return this.e;
    }

    @Override // p.zim0
    public final Collection i(kf30 kf30Var, iu30 iu30Var) {
        w1();
        w1();
        return ((j2k) this.Y.getValue()).i(kf30Var, iu30Var);
    }

    @Override // p.zim0
    public final List i0() {
        if (this.h != null) {
            return z6x.a;
        }
        eg.f(l1d.n(getName().a, " were not set", new StringBuilder("Dependencies of module ")));
        return null;
    }

    @Override // p.n9r
    public final n9r k() {
        return null;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.b(obj, this);
    }

    @Override // p.zim0
    public final Object t(acn1 acn1Var) {
        Object obj = this.f.get(acn1Var);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p.o9r
    public final String toString() {
        StringBuilder sb = new StringBuilder(o9r.v1(this));
        if (!this.t) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        fzq0 fzq0Var = this.i;
        sb.append(fzq0Var != null ? fzq0Var.getClass().getSimpleName() : null);
        return sb.toString();
    }

    public final void w1() {
        if (this.t) {
            return;
        }
        if (t(w6d1.a) != null) {
            bhn0.d();
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }
}
