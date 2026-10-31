package p;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f380 implements Serializable {
    public static final f380 c = new f380(new long[0], 0);
    public final long[] a;
    public final int b;

    public f380(long[] jArr, int i) {
        this.a = jArr;
        this.b = i;
    }

    public final long a(int i) {
        dm5.q(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f380) {
            f380 f380Var = (f380) obj;
            int i = f380Var.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == f380Var.a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iZ = 1;
        for (int i = 0; i < this.b; i++) {
            iZ = (iZ * 31) + anm1.z(this.a[i]);
        }
        return iZ;
    }

    public Object readResolve() {
        return this.b == 0 ? c : this;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.a;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        if (i >= length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, 0, i);
        return new f380(jArrCopyOfRange, jArrCopyOfRange.length);
    }
}
