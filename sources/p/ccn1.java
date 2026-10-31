package p;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ccn1 extends ifn1 {
    public final kcn1 d;
    public final a1g1 e;

    public ccn1(kcn1 kcn1Var, a1g1 a1g1Var) {
        this.d = kcn1Var;
        this.e = a1g1Var;
    }

    public static ccn1 x(kcn1 kcn1Var, a1g1 a1g1Var) throws GeneralSecurityException {
        mhn1 mhn1Var = (mhn1) a1g1Var.b;
        if (mhn1Var.a.length != 32) {
            int length = mhn1Var.a.length;
            throw new GeneralSecurityException(gvg.l(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (Arrays.equals(kcn1Var.e.b(), fcp1.a(fcp1.b(mhn1Var.b())))) {
            return new ccn1(kcn1Var, a1g1Var);
        }
        k220.r("Ed25519 keys mismatch");
        return null;
    }

    @Override // p.pno1
    public final w9p1 u() {
        return this.d.d;
    }

    @Override // p.ifn1
    public final /* synthetic */ jfn1 w() {
        return this.d;
    }
}
