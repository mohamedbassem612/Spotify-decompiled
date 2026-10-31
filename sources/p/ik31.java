package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ik31 {
    public final String a;
    public final byte[] b;

    public ik31(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik31)) {
            return false;
        }
        ik31 ik31Var = (ik31) obj;
        return u890.j(this.a, ik31Var.a) && u890.j(this.b, ik31Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
