package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class snw0 implements Comparable {
    public final byte[] a;

    public snw0(byte[] bArr) {
        this.a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        snw0 snw0Var = (snw0) obj;
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = snw0Var.a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = snw0Var.a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof snw0) {
            return Arrays.equals(this.a, ((snw0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return hm5.s(this.a);
    }
}
