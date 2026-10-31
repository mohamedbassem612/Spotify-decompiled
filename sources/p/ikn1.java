package p;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ikn1 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset charset = StandardCharsets.UTF_16;
    }

    public static int a(int i, int i2) {
        if (i % 2 != 0) {
            return (i | i2) - (i & i2);
        }
        return ((~i) & i2) | ((~i2) & i);
    }

    public static final void b(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iA = a(iArr[i3], i5);
        iArr[i3] = (iA << i4) | (iA >>> (32 - i4));
    }

    public static final void c(int i, int i2, int i3, int i4, int[] iArr) {
        b(i, i2, i4, 16, iArr);
        b(i3, i4, i2, 12, iArr);
        b(i, i2, i4, 8, iArr);
        b(i3, i4, i2, 7, iArr);
    }

    public static final int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }
}
