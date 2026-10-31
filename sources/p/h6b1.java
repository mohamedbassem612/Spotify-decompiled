package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h6b1 {
    public final byte[] a;
    public final int b;

    public h6b1(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6b1) {
            return Arrays.equals(this.a, ((h6b1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
