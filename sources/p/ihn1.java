package p;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ihn1 implements tap1 {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final ncp1 c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ahn1 ahn1Var = ahn1.a;
        gdn1 gdn1Var = gdn1.b;
        map.put(ahn1Var, gdn1Var);
        map2.put(gdn1Var, ahn1Var);
        ahn1 ahn1Var2 = ahn1.b;
        gdn1 gdn1Var2 = gdn1.c;
        map.put(ahn1Var2, gdn1Var2);
        map2.put(gdn1Var2, ahn1Var2);
        ahn1 ahn1Var3 = ahn1.c;
        gdn1 gdn1Var3 = gdn1.d;
        map.put(ahn1Var3, gdn1Var3);
        map2.put(gdn1Var3, ahn1Var3);
        c = new ncp1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static tap1 b(pdn1 pdn1Var) {
        try {
            int i = xgp1.a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerL = ila0.L();
            if (providerL != null) {
                return jgn1.c(pdn1Var, providerL);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) ygn1.d.a.zza("RSA");
            BigInteger bigInteger = pdn1Var.e;
            idn1 idn1Var = pdn1Var.d;
            return new agn1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, idn1Var.b)), (ahn1) c.a(idn1Var.d), pdn1Var.f.b(), idn1Var.c != hdn1.e ? a : b);
        }
    }
}
