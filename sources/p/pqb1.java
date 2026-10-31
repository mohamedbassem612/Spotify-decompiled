package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pqb1 implements Iterator, ola0 {
    public final hw91 a;
    public final kqs0 b;
    public Object c;
    public Object d;
    public int e;

    public pqb1(hw91 hw91Var, kqs0 kqs0Var) {
        this.a = hw91Var;
        this.b = kqs0Var;
        this.e = ((qqb1) pv91.f(hw91Var.a)).d;
        this.c = this.d;
        this.d = kqs0Var.hasNext() ? kqs0Var.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((qqb1) pv91.f(this.a.a)).d != this.e) {
            eg.d();
            return null;
        }
        this.c = this.d;
        kqs0 kqs0Var = this.b;
        this.d = kqs0Var.hasNext() ? kqs0Var.next() : null;
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        bhn0.w();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        hw91 hw91Var = this.a;
        if (((qqb1) pv91.f(hw91Var.a)).d != this.e) {
            eg.d();
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            bhn0.w();
            return;
        }
        hw91Var.remove(obj);
        this.c = null;
        this.e = ((qqb1) pv91.f(hw91Var.a)).d;
    }
}
