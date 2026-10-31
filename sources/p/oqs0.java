package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oqs0 extends a9 implements Collection, pla0 {
    public mqs0 a;
    public Object b;
    public Object c;
    public final ips0 d;

    public oqs0(mqs0 mqs0Var) {
        this.a = mqs0Var;
        this.b = mqs0Var.a;
        this.c = mqs0Var.b;
        this.d = mqs0Var.c.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        ips0 ips0Var = this.d;
        if (ips0Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            ips0Var.put(obj, new ylc0());
            return true;
        }
        Object obj2 = ips0Var.get(this.c);
        obj2.getClass();
        ips0Var.put(this.c, new ylc0(((ylc0) obj2).a, obj));
        ips0Var.put(obj, new ylc0(this.c));
        this.c = obj;
        return true;
    }

    public final int b() {
        return this.d.c();
    }

    public final mqs0 c() {
        eps0 eps0VarE = this.d.e();
        mqs0 mqs0Var = this.a;
        if (eps0VarE == mqs0Var.c) {
            Object obj = mqs0Var.a;
            Object obj2 = mqs0Var.b;
        } else {
            mqs0Var = new mqs0(this.b, this.c, eps0VarE);
        }
        this.a = mqs0Var;
        return mqs0Var;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.d.clear();
        vf61 vf61Var = vf61.R0;
        this.b = vf61Var;
        this.c = vf61Var;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new rqs0(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ips0 ips0Var = this.d;
        ylc0 ylc0Var = (ylc0) ips0Var.remove(obj);
        if (ylc0Var == null) {
            return false;
        }
        Object obj2 = ylc0Var.b;
        Object obj3 = ylc0Var.a;
        vf61 vf61Var = vf61.R0;
        if (obj3 != vf61Var) {
            Object obj4 = ips0Var.get(obj3);
            obj4.getClass();
            ips0Var.put(obj3, new ylc0(((ylc0) obj4).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == vf61Var) {
            this.c = obj3;
            return true;
        }
        Object obj5 = ips0Var.get(obj2);
        obj5.getClass();
        ips0Var.put(obj2, new ylc0(obj3, ((ylc0) obj5).b));
        return true;
    }
}
