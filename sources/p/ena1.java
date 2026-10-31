package p;

import android.media.MediaCodec;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ena1 implements Comparator {
    public final /* synthetic */ byte a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.a) {
            case 0:
                fna1 fna1Var = (fna1) obj;
                fna1 fna1Var2 = (fna1) obj2;
                int iCompare = Integer.compare(fna1Var2.b, fna1Var.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = fna1Var.c.compareTo(fna1Var2.c);
                return iCompareTo != 0 ? iCompareTo : fna1Var.d.compareTo(fna1Var2.d);
            case 1:
                fna1 fna1Var3 = (fna1) obj;
                fna1 fna1Var4 = (fna1) obj2;
                int iCompare2 = Integer.compare(fna1Var4.a, fna1Var3.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = fna1Var4.c.compareTo(fna1Var3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : fna1Var4.d.compareTo(fna1Var3.d);
            case 2:
                b29 b29Var = (b29) obj2;
                Class cls = ((b29) obj).a.j;
                int i2 = cls == MediaCodec.class ? 2 : cls == law0.class ? 0 : 1;
                Class cls2 = b29Var.a.j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 != law0.class) {
                    i = 1;
                }
                return i2 - i;
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i3 = 0; i3 < Math.min(bArr.length, bArr2.length); i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                return 0;
            case 4:
                return Integer.compare(((vll1) obj).a.b, ((vll1) obj2).a.b);
            default:
                return Long.compare(((ull1) obj).b, ((ull1) obj2).b);
        }
    }
}
