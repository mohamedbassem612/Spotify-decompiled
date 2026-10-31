package p;

import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kim1 implements ufp1, jgg1 {
    public static final /* synthetic */ kim1 b = new kim1((byte) 1);
    public static final /* synthetic */ kim1 c = new kim1((byte) 2);
    public final /* synthetic */ byte a;

    public kim1(SpotifyWearableListenerService spotifyWearableListenerService) {
        this.a = (byte) 4;
    }

    public Object apply(Object obj) {
        return ((kqo1) obj).b();
    }

    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        switch (this.a) {
            case 1:
                byte[] bArr = xfn1.g;
                return xfn1.b((sbn1) pno1Var, ila0.L());
            default:
                lfn1 lfn1Var = (lfn1) pno1Var;
                if (!boo1.D(1)) {
                    throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                Provider providerL = ila0.L();
                if (providerL == null) {
                    throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
                }
                if (!boo1.D(1)) {
                    throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                lfn1Var.getClass();
                KeyFactory.getInstance("SLH-DSA-SHA2-128S", providerL);
                throw null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kim1(byte b2) {
        this.a = b2;
    }
}
