package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ipd1 implements n561, x9v {
    public final n561 a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ipd1(n561 n561Var, int i) {
        this.a = n561Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        n9v.b(i, "count must be non-negative, but was ");
        throw null;
    }

    public final n561 a(int i) {
        byte b = this.b;
        return i >= b ? v7x.a : new blc1(this.a, i, b);
    }

    public final n561 b(int i) {
        return i >= this.b ? this : new ipd1(this.a, i);
    }

    public final Iterator iterator() {
        return new o9v(this);
    }
}
