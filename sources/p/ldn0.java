package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ldn0 {
    public long[] a;
    public int b;

    public ldn0(int i) {
        this.a = i == 0 ? p5f0.a : new long[i];
    }

    public final void a(long j) {
        c(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final void b(int i, ldn0 ldn0Var) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            eqr0.O("");
            throw null;
        }
        int i3 = ldn0Var.b;
        if (i3 == 0) {
            return;
        }
        c(i2 + i3);
        long[] jArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            f46.T(jArr, jArr, ldn0Var.b + i, i, i4);
        }
        f46.T(ldn0Var.a, jArr, i, 0, ldn0Var.b);
        this.b += ldn0Var.b;
    }

    public final void c(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        eqr0.O("Index must be between 0 and size");
        throw null;
    }

    public final void e(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            eqr0.O("Index must be between 0 and size");
            throw null;
        }
        if (i2 < i) {
            eqr0.N("The end index must be < start index");
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = this.a;
                f46.T(jArr, jArr, i, i2, i3);
            }
            this.b -= i2 - i;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ldn0) {
            ldn0 ldn0Var = (ldn0) obj;
            int i = ldn0Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = ldn0Var.a;
                tr80 tr80VarQ = yoi1.Q(0, i2);
                int i3 = ((rr80) tr80VarQ).a;
                int i4 = ((rr80) tr80VarQ).b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i, long j) {
        if (i < 0 || i >= this.b) {
            eqr0.O("Index must be between 0 and size");
            throw null;
        }
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ ldn0() {
        this(16);
    }
}
