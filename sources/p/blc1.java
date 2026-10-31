package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class blc1 implements n561, x9v {
    public final n561 a;
    public final int b;
    public final int c;

    public blc1(n561 n561Var, int i, int i2) {
        this.a = n561Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            hhg1.f(f4i1.c(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            hhg1.f(f4i1.c(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        hhg1.f(cy30.i(i2, "endIndex should be not less than startIndex, but was ", i, " < "));
        throw null;
    }

    public final n561 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? v7x.a : new blc1(this.a, i3 + i, i2);
    }

    public final n561 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new blc1(this.a, i3, i + i3);
    }

    public final Iterator iterator() {
        return new pqs0(this);
    }
}
