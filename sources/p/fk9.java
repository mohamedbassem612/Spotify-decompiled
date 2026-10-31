package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fk9 {
    public final ee9 a;
    public final byte[] b;

    public fk9(ee9 ee9Var, byte[] bArr) {
        this.a = ee9Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk9)) {
            return false;
        }
        fk9 fk9Var = (fk9) obj;
        return this.a.equals(fk9Var.a) && this.b.equals(fk9Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
