package p;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bzx implements s82 {
    public final o980 a;
    public final iuf0 b;
    public final int c;

    public bzx(o980 o980Var, iuf0 iuf0Var, int i) {
        this.a = o980Var;
        this.b = iuf0Var;
        this.c = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return ila0.n(new byte[][]{bArrA, this.b.b(ila0.n(new byte[][]{bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)}))});
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            k220.r("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, ila0.n(new byte[][]{bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)}));
        return this.a.b(bArrCopyOfRange);
    }
}
