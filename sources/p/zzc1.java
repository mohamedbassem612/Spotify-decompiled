package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zzc1 {
    public final byte[] a;

    public zzc1(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzc1) {
            return Arrays.equals(this.a, ((zzc1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
