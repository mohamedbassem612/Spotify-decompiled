package p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ugn1 implements tap1 {
    public static tap1 b(kcn1 kcn1Var) {
        if (boo1.D(1)) {
            try {
                return agn1.b(kcn1Var);
            } catch (GeneralSecurityException unused) {
                return new bgn1(kcn1Var.e.b(), kcn1Var.f.b(), kcn1Var.d.a != acn1.e ? new byte[0] : new byte[]{0});
            }
        }
        k220.r("Can not use Ed25519 in FIPS-mode.");
        return null;
    }
}
