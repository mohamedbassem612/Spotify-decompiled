package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ts2 {
    public final byte[] a;

    public ts2(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ts2) {
            return Arrays.equals(this.a, ((ts2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) - 1487394660;
    }
}
