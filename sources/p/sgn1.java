package p;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sgn1 implements tap1 {
    public final mfp1 a;

    public sgn1(mfp1 mfp1Var) {
        this.a = mfp1Var;
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) {
        int iBinarySearch;
        mfp1 mfp1Var = this.a;
        List list = mfp1Var.c;
        Objects.requireNonNull(bArr, "text must be non-null");
        long[] jArr = mfp1Var.a;
        if (jArr.length != 0 && bArr.length >= 5 && (iBinarySearch = Arrays.binarySearch(jArr, mfp1.a(bArr))) >= 0) {
            list = mfp1Var.b[iBinarySearch];
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                ((tgn1) list.get(i)).a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        k220.r("invalid signature");
    }
}
