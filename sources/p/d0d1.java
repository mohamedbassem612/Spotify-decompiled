package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d0d1 {
    public final byte[] a;

    public d0d1(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0d1)) {
            return false;
        }
        return Arrays.equals(this.a, ((d0d1) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
