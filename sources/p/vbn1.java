package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class vbn1 implements ufp1, adp1 {
    public static final /* synthetic */ vbn1 b = new vbn1(0);
    public static final /* synthetic */ vbn1 c = new vbn1(1);
    public static final /* synthetic */ vbn1 d = new vbn1(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ vbn1(byte b2) {
        this.a = b2;
    }

    @Override // p.ufp1
    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return zfn1.a((rbn1) pno1Var);
            default:
                pcn1 pcn1Var = (pcn1) pno1Var;
                if (!boo1.D(1)) {
                    throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                if (ila0.L() == null) {
                    throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
                }
                if (!boo1.D(1)) {
                    throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                pcn1Var.getClass();
                throw null;
        }
    }

    @Override // p.adp1
    public kap1 f(pno1 pno1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        ydn1 ydn1Var = (ydn1) pno1Var;
        return kap1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", kgn1.g(ydn1Var).c(), gap1.f, kgn1.e(ydn1Var.d.c), ydn1Var.g);
    }
}
