package p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wbn1 implements ufp1, vcp1, weo1 {
    public static final /* synthetic */ wbn1 a = new wbn1();
    public static final /* synthetic */ wbn1 b = new wbn1();

    @Override // p.vcp1
    public /* synthetic */ pno1 a(kap1 kap1Var, a2x0 a2x0Var) {
        return kgn1.b(kap1Var);
    }

    @Override // p.ufp1
    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        qcn1 qcn1Var = (qcn1) pno1Var;
        if (!boo1.D(1)) {
            k220.r("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
            return null;
        }
        if (ila0.L() == null) {
            k220.r("Obtaining Conscrypt provider failed");
            return null;
        }
        if (!boo1.D(1)) {
            throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
        }
        qcn1Var.getClass();
        throw null;
    }

    public ogo1 zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public boolean zzc(Class cls) {
        return false;
    }
}
