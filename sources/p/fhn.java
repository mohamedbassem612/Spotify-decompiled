package p;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class fhn implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ fhn(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                hmb0 hmb0Var = (hmb0) obj;
                hmb0 hmb0Var2 = (hmb0) obj2;
                float f = hmb0Var.f1.f68p.e1;
                float f2 = hmb0Var2.f1.f68p.e1;
                return f == f2 ? u890.q(hmb0Var.w(), hmb0Var2.w()) : Float.compare(f, f2);
        }
    }
}
