package p;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wcc {
    public static final int b = whc.a;
    public final occ a;

    public wcc(byte[] bArr) {
        v280 v280VarM = b380.m();
        int length = bArr.length;
        int i = b;
        int iG = zoi1.g(length, i);
        for (int i2 = 0; i2 < iG; i2++) {
            Bundle bundle = new Bundle();
            int i3 = i2 * i;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i3, Math.min(i3 + i, bArr.length)));
            v280VarM.c(bundle);
        }
        this.a = new occ(v280VarM.g());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(xcc.g);
        if (binder != null) {
            try {
                b380 b380VarA = occ.a(binder);
                if (b380VarA.isEmpty()) {
                    return zoi1.b;
                }
                byte[] byteArray = ((Bundle) hr80.r(b380VarA)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = b380VarA.size() - 1;
                    int i = b;
                    int i2 = size * i;
                    byte[] bArr = new byte[byteArray.length + i2];
                    System.arraycopy(byteArray, 0, bArr, i2, byteArray.length);
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] byteArray2 = ((Bundle) b380VarA.get(i3)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i) {
                            System.arraycopy(byteArray2, 0, bArr, i3 * i, i);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e) {
                oon1.I("Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
