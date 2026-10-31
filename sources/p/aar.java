package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aar {
    public final byte[] a;
    public final svz0 b;

    public aar(byte[] bArr, svz0 svz0Var) {
        this.a = bArr;
        this.b = svz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aar)) {
            return false;
        }
        aar aarVar = (aar) obj;
        return this.a.equals(aarVar.a) && u890.j(this.b, aarVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }
}
