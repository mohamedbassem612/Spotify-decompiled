package p;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u280 implements Serializable {
    public static final u280 c = new u280(0, new int[0]);
    public final int[] a;
    public final int b;

    public u280(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public static u280 c(int i, int i2) {
        return new u280(2, new int[]{i, i2});
    }

    public static u280 d(int... iArr) {
        dm5.n(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new u280(length, iArr2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[RETURN] */
    public final boolean a(int i) {
        int i2 = 0;
        while (i2 < this.b) {
            if (this.a[i2] == i) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public final int b(int i) {
        dm5.q(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u280) {
            u280 u280Var = (u280) obj;
            int i = u280Var.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (b(i3) == u280Var.b(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
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
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        if (i >= length) {
            return this;
        }
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, i);
        return new u280(iArrCopyOfRange.length, iArrCopyOfRange);
    }
}
