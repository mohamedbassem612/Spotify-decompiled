package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l590 extends n4h {
    @Override // p.apn0
    public final Object c(Object obj, String str) {
        double[] dArr = (double[]) obj;
        if (dArr == null) {
            return new double[]{Double.parseDouble(str)};
        }
        double[] dArr2 = {Double.parseDouble(str)};
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, 1);
        return dArrCopyOf;
    }
}
