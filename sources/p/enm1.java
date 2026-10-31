package p;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class enm1 implements n8n, bgp1, ufp1, phs0, v0i {
    public static final /* synthetic */ enm1 a = new enm1();
    public static final /* synthetic */ enm1 b = new enm1();
    public static final /* synthetic */ enm1 c = new enm1();

    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        mfn1 mfn1Var = (mfn1) pno1Var;
        if (!boo1.D(1)) {
            k220.r("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
            return null;
        }
        Provider providerL = ila0.L();
        if (providerL == null) {
            k220.r("Obtaining Conscrypt provider failed");
            return null;
        }
        if (!boo1.D(1)) {
            throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
        }
        mfn1Var.getClass();
        KeyFactory.getInstance("SLH-DSA-SHA2-128S", providerL);
        throw null;
    }

    public Object m(dxy dxyVar) {
        return new lzo1((y0p1) dxyVar.a(y0p1.class), (im00) dxyVar.a(im00.class));
    }

    public /* synthetic */ Object d(p331 p331Var) {
        return p331Var;
    }
}
