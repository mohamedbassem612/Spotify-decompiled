package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fzc1 {
    public final byte[] a;
    public final String b;

    public fzc1(String str, byte[] bArr) {
        this.a = bArr;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final byte[] b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzc1)) {
            return false;
        }
        fzc1 fzc1Var = (fzc1) obj;
        return Arrays.equals(this.a, fzc1Var.a) && this.b.equals(fzc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }
}
