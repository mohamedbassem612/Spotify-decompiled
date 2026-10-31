package p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gqs0 implements Iterator, ola0 {
    public Object a;
    public final eqs0 b;
    public Object c = wdu0.P0;
    public boolean d;
    public int e;
    public int f;

    public gqs0(Object obj, eqs0 eqs0Var) {
        this.a = obj;
        this.b = eqs0Var;
        this.e = eqs0Var.d.e;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qlc0 next() {
        hps0 hps0Var = this.b.d;
        if (hps0Var.e != this.e) {
            eg.d();
            return null;
        }
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        Object obj = this.a;
        this.c = obj;
        this.d = true;
        this.f++;
        Object obj2 = hps0Var.get(obj);
        if (obj2 == null) {
            throw new ConcurrentModificationException(td6.l(new StringBuilder("Hash code of a key ("), this.a, ") has changed after it was added to the persistent map."));
        }
        qlc0 qlc0Var = (qlc0) obj2;
        this.a = qlc0Var.c;
        return qlc0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.d.c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            bhn0.w();
            return;
        }
        Object obj = this.c;
        eqs0 eqs0Var = this.b;
        eqs0Var.remove(obj);
        this.c = null;
        this.d = false;
        this.e = eqs0Var.d.e;
        this.f--;
    }
}
