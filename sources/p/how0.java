package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class how0 extends am70 {
    public final String b;
    public final byte[] c;

    public how0(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || how0.class != obj.getClass()) {
            return false;
        }
        how0 how0Var = (how0) obj;
        return this.b.equals(how0Var.b) && Arrays.equals(this.c, how0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + cy30.d(527, 31, this.b);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
