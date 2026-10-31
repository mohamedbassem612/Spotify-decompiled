package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ftf1 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ftf1(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ftf1.class != obj.getClass()) {
            return false;
        }
        ftf1 ftf1Var = (ftf1) obj;
        return this.a == ftf1Var.a && this.c == ftf1Var.c && this.d == ftf1Var.d && Arrays.equals(this.b, ftf1Var.b);
    }

    public final int hashCode() {
        return ((ktd.f(this.a * 31, this.b, 31) + this.c) * 31) + this.d;
    }
}
