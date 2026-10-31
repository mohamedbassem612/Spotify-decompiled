package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uok0 extends am70 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public uok0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uok0.class != obj.getClass()) {
            return false;
        }
        uok0 uok0Var = (uok0) obj;
        return this.b == uok0Var.b && this.c == uok0Var.c && this.d == uok0Var.d && Arrays.equals(this.e, uok0Var.e) && Arrays.equals(this.f, uok0Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
