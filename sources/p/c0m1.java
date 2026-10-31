package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c0m1 implements g0m1 {
    public final byte[] a;
    public final String b;

    public c0m1(String str, byte[] bArr) {
        this.a = bArr;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0m1)) {
            return false;
        }
        c0m1 c0m1Var = (c0m1) obj;
        return Arrays.equals(this.a, c0m1Var.a) && this.b.equals(c0m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }
}
