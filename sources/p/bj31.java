package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bj31 implements cj31 {
    public final byte[] a;

    public bj31(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj31) && u890.j(this.a, ((bj31) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
