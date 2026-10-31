package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c0d1 {
    public final byte[] a;
    public final String b;

    public c0d1(String str, byte[] bArr) {
        this.a = bArr;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0d1)) {
            return false;
        }
        c0d1 c0d1Var = (c0d1) obj;
        return Arrays.equals(this.a, c0d1Var.a) && this.b.equals(c0d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }
}
