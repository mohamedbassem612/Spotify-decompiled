package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ozc1 {
    public final byte[] a;
    public final byte[] b;
    public final String c;

    public ozc1(String str, byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozc1)) {
            return false;
        }
        ozc1 ozc1Var = (ozc1) obj;
        return Arrays.equals(this.a, ozc1Var.a) && Arrays.equals(this.b, ozc1Var.b) && u890.j(this.c, ozc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.f(Arrays.hashCode(this.a) * 31, this.b, 31);
    }
}
