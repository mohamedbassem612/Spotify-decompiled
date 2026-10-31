package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nqs0 extends a9 implements Collection, pla0 {
    public lqs0 a;
    public Object b;
    public Object c;
    public final hps0 d;

    public nqs0(lqs0 lqs0Var) {
        this.a = lqs0Var;
        this.b = lqs0Var.a;
        this.c = lqs0Var.b;
        dps0 dps0Var = lqs0Var.c;
        dps0Var.getClass();
        this.d = new hps0(dps0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        wdu0 wdu0Var = wdu0.P0;
        hps0 hps0Var = this.d;
        if (hps0Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            hps0Var.put(obj, new xlc0(wdu0Var, wdu0Var));
            return true;
        }
        Object obj2 = hps0Var.get(this.c);
        obj2.getClass();
        hps0Var.put(this.c, new xlc0(((xlc0) obj2).a, obj));
        hps0Var.put(obj, new xlc0(this.c, wdu0Var));
        this.c = obj;
        return true;
    }

    public final int b() {
        return this.d.f;
    }

    public final lqs0 c() {
        dps0 dps0VarBuild = this.d.build();
        lqs0 lqs0Var = this.a;
        if (dps0VarBuild != lqs0Var.c) {
            lqs0Var = new lqs0(this.b, this.c, dps0VarBuild);
        }
        this.a = lqs0Var;
        return lqs0Var;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.d.clear();
        wdu0 wdu0Var = wdu0.P0;
        this.b = wdu0Var;
        this.c = wdu0Var;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final hps0 d() {
        return this.d;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        hps0 hps0Var = this.d;
        Set set = (Set) obj;
        if (hps0Var.f != set.size()) {
            return false;
        }
        if (set instanceof lqs0) {
            return hps0Var.c.g(((lqs0) obj).c.b, cps0.R0);
        }
        return set instanceof nqs0 ? hps0Var.c.g(((nqs0) obj).d.c, cps0.S0) : super.equals(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qqs0(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        hps0 hps0Var = this.d;
        xlc0 xlc0Var = (xlc0) hps0Var.remove(obj);
        if (xlc0Var == null) {
            return false;
        }
        Object obj2 = xlc0Var.b;
        Object obj3 = xlc0Var.a;
        wdu0 wdu0Var = wdu0.P0;
        if (obj3 != wdu0Var) {
            Object obj4 = hps0Var.get(obj3);
            obj4.getClass();
            hps0Var.put(obj3, new xlc0(((xlc0) obj4).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == wdu0Var) {
            this.c = obj3;
            return true;
        }
        Object obj5 = hps0Var.get(obj2);
        obj5.getClass();
        hps0Var.put(obj2, new xlc0(obj3, ((xlc0) obj5).b));
        return true;
    }
}
