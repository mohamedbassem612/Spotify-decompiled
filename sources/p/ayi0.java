package p;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ayi0 extends t5 {
    public final MessageDigest c;
    public final int d;
    public boolean e;

    public ayi0(MessageDigest messageDigest, int i) {
        this.c = messageDigest;
        this.d = i;
    }

    @Override // p.bmq0
    public final wt50 C() {
        dm5.z(!this.e, "Cannot re-use a Hasher after calling hash() on it");
        this.e = true;
        MessageDigest messageDigest = this.c;
        int digestLength = messageDigest.getDigestLength();
        int i = this.d;
        return i == digestLength ? new ut50(messageDigest.digest()) : new ut50(Arrays.copyOf(messageDigest.digest(), i));
    }

    @Override // p.t5
    public final void n0(byte[] bArr, int i) {
        dm5.z(!this.e, "Cannot re-use a Hasher after calling hash() on it");
        this.c.update(bArr, 0, i);
    }
}
