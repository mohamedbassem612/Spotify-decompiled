package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lm50 implements Iterator, ola0 {
    public final ze91 a;
    public final int b;
    public int c;
    public final int d;

    public lm50(ze91 ze91Var, int i, int i2) {
        this.a = ze91Var;
        this.b = i2;
        this.c = i;
        this.d = ze91Var.h;
        if (ze91Var.g) {
            bf91.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ze91 ze91Var = this.a;
        int i = ze91Var.h;
        int i2 = this.d;
        if (i != i2) {
            bf91.e();
        }
        int i3 = this.c;
        this.c = ze91Var.a[(i3 * 5) + 3] + i3;
        return new af91(ze91Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
