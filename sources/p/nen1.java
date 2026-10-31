package p;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class nen1 implements ufp1, bgp1, fsc1, amo1 {
    public static final /* synthetic */ nen1 a = new nen1();
    public static final /* synthetic */ nen1 b = new nen1();

    @Override // p.amo1
    public byte a(tdp1 tdp1Var, int i) {
        return tdp1Var.b(i);
    }

    @Override // p.ufp1
    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        Provider providerL;
        sjp1 sjp1Var = (sjp1) pno1Var;
        if (ila0.L() == null) {
            throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
        }
        if (boo1.D(1) && (providerL = ila0.L()) != null) {
            try {
                KeyFactory.getInstance("MLDSA44-Ed25519-SHA512", providerL);
                sjp1Var.getClass();
                throw null;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("Composite ML-DSA is not supported in this environment.");
    }

    @Override // p.amo1
    public tdp1 c(tdp1 tdp1Var, int i, int i2) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i < 0 || i > i2 || i2 > (length = (bArr = tdp1Var.a).length) || i > i2 || i2 > length) {
            tw20.p();
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            bArr2 = bArr3;
        }
        return new tdp1(bArr2);
    }

    public hfp1 e(Object obj) {
        return o0c.z((Object) null);
    }

    @Override // p.amo1
    public amo1 zzc() {
        return new nen1();
    }
}
