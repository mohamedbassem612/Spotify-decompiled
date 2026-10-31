package p;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lhn1 implements tap1 {
    public static final ncp1 a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ahn1 ahn1Var = ahn1.a;
        udn1 udn1Var = udn1.b;
        map.put(ahn1Var, udn1Var);
        map2.put(udn1Var, ahn1Var);
        ahn1 ahn1Var2 = ahn1.b;
        udn1 udn1Var2 = udn1.c;
        map.put(ahn1Var2, udn1Var2);
        map2.put(udn1Var2, ahn1Var2);
        ahn1 ahn1Var3 = ahn1.c;
        udn1 udn1Var3 = udn1.d;
        map.put(ahn1Var3, udn1Var3);
        map2.put(udn1Var3, ahn1Var3);
        a = new ncp1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        b = new byte[0];
        c = new byte[]{0};
    }

    public static tap1 b(ydn1 ydn1Var) {
        try {
            return lgn1.d(ydn1Var);
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) ygn1.d.a.zza("RSA");
            BigInteger bigInteger = ydn1Var.e;
            wdn1 wdn1Var = ydn1Var.d;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, wdn1Var.b));
            udn1 udn1Var = wdn1Var.d;
            ncp1 ncp1Var = a;
            return new khn1(rSAPublicKey, (ahn1) ncp1Var.a(udn1Var), (ahn1) ncp1Var.a(wdn1Var.e), wdn1Var.f, ydn1Var.f.b(), wdn1Var.c != vdn1.e ? b : c);
        }
    }
}
