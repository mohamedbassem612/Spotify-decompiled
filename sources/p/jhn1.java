package p;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jhn1 implements qap1 {
    public static qap1 a(xdn1 xdn1Var) throws GeneralSecurityException {
        try {
            return zfn1.c(xdn1Var);
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) ygn1.d.a.zza("RSA");
            ydn1 ydn1Var = xdn1Var.d;
            ydn1 ydn1Var2 = xdn1Var.d;
            BigInteger bigInteger = ydn1Var.e;
            wdn1 wdn1Var = ydn1Var2.d;
            wdn1 wdn1Var2 = ydn1Var2.d;
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, wdn1Var.b, (BigInteger) xdn1Var.e.b, (BigInteger) xdn1Var.f.b, (BigInteger) xdn1Var.g.b, (BigInteger) xdn1Var.h.b, (BigInteger) xdn1Var.i.b, (BigInteger) xdn1Var.j.b));
            ncp1 ncp1Var = lhn1.a;
            ahn1 ahn1Var = (ahn1) ncp1Var.a(wdn1Var2.d);
            ahn1 ahn1Var2 = (ahn1) ncp1Var.a(wdn1Var2.e);
            ydn1Var2.f.b();
            vdn1 vdn1Var = wdn1Var2.c;
            zfn1 zfn1Var = new zfn1();
            if (nbp1.a()) {
                k220.r("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                return null;
            }
            q1o1.w(ahn1Var);
            if (!ahn1Var.equals(ahn1Var2)) {
                k220.r("sigHash and mgf1Hash must be the same");
                return null;
            }
            q1o1.x(rSAPrivateCrtKey.getModulus().bitLength());
            q1o1.y(rSAPrivateCrtKey.getPublicExponent());
            return zfn1Var;
        }
    }
}
