package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class edn0 {
    public int[] a;
    public int b;

    public edn0(int i) {
        this.a = i == 0 ? xr80.a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        eqr0.O("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        bhn0.t("IntList is empty.");
        return 0;
    }

    public final void e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            eqr0.O("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            f46.P(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edn0) {
            edn0 edn0Var = (edn0) obj;
            int i = edn0Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = edn0Var.a;
                tr80 tr80VarQ = yoi1.Q(0, i2);
                int i3 = ((rr80) tr80VarQ).a;
                int i4 = ((rr80) tr80VarQ).b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            eqr0.O("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ edn0() {
        this(16);
    }
}
