package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xin1 {
    public static final byte[] a;
    public static final ByteBuffer b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = ByteBuffer.wrap(bArr);
        din1.c(0, bArr, 0);
    }

    public static void a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
