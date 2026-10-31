package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k1m1 implements r1m1 {
    public final byte[] a;
    public final String b;

    public k1m1(String str, byte[] bArr) {
        this.a = bArr;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1m1)) {
            return false;
        }
        k1m1 k1m1Var = (k1m1) obj;
        return Arrays.equals(this.a, k1m1Var.a) && this.b.equals(k1m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }
}
