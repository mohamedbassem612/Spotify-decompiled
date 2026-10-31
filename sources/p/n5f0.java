package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n5f0 implements lsg, Iterable, ola0 {
    public static final n5f0 c = new n5f0(1, 0);
    public final long a;
    public final long b;

    public n5f0(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
    }

    public final boolean c(long j) {
        return this.a <= j && j <= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n5f0)) {
            return false;
        }
        if (isEmpty() && ((n5f0) obj).isEmpty()) {
            return true;
        }
        n5f0 n5f0Var = (n5f0) obj;
        return this.a == n5f0Var.a && this.b == n5f0Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // p.lsg
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m5f0(this.a, this.b);
    }

    @Override // p.lsg
    public final Comparable m() {
        return Long.valueOf(this.a);
    }

    @Override // p.lsg
    public final Comparable n() {
        return Long.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
