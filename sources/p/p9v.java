package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p9v implements n561, x9v {
    public final n561 a;
    public final int b;

    public p9v(n561 n561Var, int i) {
        this.a = n561Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        n9v.b(i, "count must be non-negative, but was ");
        throw null;
    }

    public final n561 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new p9v(this, i) : new p9v(this.a, i2);
    }

    public final n561 b(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new ipd1(this, i) : new blc1(this.a, i2, i3);
    }

    public final Iterator iterator() {
        return new o9v(this);
    }
}
