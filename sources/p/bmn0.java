package p;

import java.security.SecureRandom;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bmn0 extends SecureRandom {
    public int a;
    public final /* synthetic */ byte[] b;

    public bmn0(byte[] bArr) {
        this.b = bArr;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        int i = this.a;
        int length = bArr.length + i;
        byte[] bArr2 = this.b;
        if (length > bArr2.length) {
            eg.m(l1d.j(i + bArr.length, bArr2.length, "Ed25519 KeyPairGenerator requested ", " random bytes, but only ", " seed bytes available"));
        } else {
            f46.O(0, i, bArr.length + i, bArr2, bArr);
            this.a += bArr.length;
        }
    }
}
