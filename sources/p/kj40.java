package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kj40 extends am70 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public kj40(String str, String str2, byte[] bArr, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj40.class != obj.getClass()) {
            return false;
        }
        kj40 kj40Var = (kj40) obj;
        return Objects.equals(this.b, kj40Var.b) && this.c.equals(kj40Var.c) && this.d.equals(kj40Var.d) && Arrays.equals(this.e, kj40Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + cy30.d(cy30.d((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
