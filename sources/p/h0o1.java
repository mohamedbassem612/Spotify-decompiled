package p;

import com.google.android.gms.internal.wearable.zzdv;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h0o1 {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new k1e(bArr, 0).a(0);
        } catch (zzdv e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
