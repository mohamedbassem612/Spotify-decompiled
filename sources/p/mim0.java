package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mim0 extends ijm1 {
    public final v3h1 j;
    public final List k;
    public final xu30 l;
    public final boolean m;
    public int n;

    public mim0(v3h1 v3h1Var, List list) {
        this.j = v3h1Var;
        v3h1Var.n(this);
        this.k = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof gd21) {
                arrayList.add(obj);
            }
        }
        this.l = ((gd21) o7h.C0(arrayList)) != null ? krz0.t : null;
        List list2 = this.k;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((pyl) it.next()) instanceof kl90) {
                    z = true;
                    break;
                }
            }
        }
        this.m = z;
    }

    @Override // p.ijm1
    public final y3h1 A(int i) {
        y3h1 y3h1VarI = this.j.i(i);
        for (kl90 kl90Var : this.k) {
            if (kl90Var instanceof kl90) {
                y3h1VarI = kl90Var.b(y3h1VarI, i);
            }
        }
        xu30 xu30Var = this.l;
        return (xu30Var == null || y3h1VarI.c != null) ? y3h1VarI : y3h1.a(y3h1VarI, (m6m) null, xu30Var, (vu30) null, 11);
    }

    public final zob1 c() {
        return this.j.c();
    }

    public final boolean d() {
        return this.j.d();
    }

    public void dispose() {
        this.j.b(this);
    }

    public final void e(v3h1 v3h1Var) {
        for (pyl pylVar : this.k) {
        }
        this.g = true;
        z();
    }

    public final eyl f() {
        eyl eylVarF = this.j.f();
        if (eylVarF == null) {
            return null;
        }
        if (this.l != null) {
            hhg1.n("renderWith on a LazyGroup range is not supported");
            return null;
        }
        List list = this.k;
        if ((list instanceof Collection) && list.isEmpty()) {
            return eylVarF;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((pyl) it.next()) instanceof kl90) {
                hhg1.n("Payload mapping over a LazyGroup range is not supported; map inside each entry");
                return null;
            }
        }
        return eylVarF;
    }

    public void h(int i) {
        D();
        this.j.h(i);
    }

    public void j(int i) {
        this.j.j(Integer.valueOf(i).intValue());
    }

    public final int k() {
        return this.j.k();
    }

    public final void l() {
        this.n++;
        this.g = true;
        this.j.l();
    }

    public Function0 m(int i) {
        D();
        return this.j.m(i);
    }

    public int o() {
        int iA = a();
        this.j.o();
        return iA;
    }

    @Override // p.ijm1
    public final void r() {
        for (pyl pylVar : this.k) {
        }
        this.j.p(s());
    }

    @Override // p.ijm1
    public final boolean t() {
        return this.j.d();
    }

    @Override // p.ijm1
    public final List v() {
        boolean z = this.m;
        v3h1 v3h1Var = this.j;
        if (!z) {
            D();
            return p7h.M(new Integer[]{Integer.valueOf(this.c), Integer.valueOf(v3h1Var.g())});
        }
        D();
        return o7h.N0(p7h.M(new Integer[]{Integer.valueOf(hqn1.b), Integer.valueOf(this.n)}), p7h.M(new Integer[]{Integer.valueOf(this.c), Integer.valueOf(v3h1Var.g())}));
    }

    @Override // p.ijm1
    public int w() {
        return this.j.a();
    }

    @Override // p.ijm1
    public final nlx0 x() {
        return new nlx0(this.j.q(), 0, 62, null);
    }
}
