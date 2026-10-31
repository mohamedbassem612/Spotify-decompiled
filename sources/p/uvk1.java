package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uvk1 implements yvk1 {
    public final byte[] a;

    public uvk1(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvk1) && this.a.equals(((uvk1) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
