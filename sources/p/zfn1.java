package p;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zfn1 implements qap1 {
    public static final byte[] a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static zfn1 a(rbn1 rbn1Var) throws GeneralSecurityException {
        Provider providerL = ila0.L();
        ahn1 ahn1Var = (ahn1) xfn1.i.a(rbn1Var.d.d.c);
        ncp1 ncp1Var = xfn1.j;
        sbn1 sbn1Var = rbn1Var.d;
        ncp1 ncp1Var2 = xfn1.k;
        bkp1 bkp1Var = sbn1Var.d;
        sbn1Var.f.b();
        akp1 akp1Var = bkp1Var.d;
        zfn1 zfn1Var = new zfn1();
        if (!boo1.D(2)) {
            k220.r("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            return null;
        }
        q1o1.w(ahn1Var);
        ahn1Var.toString().concat("withECDSA");
        return zfn1Var;
    }

    public static zfn1 b(ccn1 ccn1Var) throws InvalidKeySpecException, NoSuchProviderException {
        Provider providerL = ila0.L();
        if (providerL == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        a1g1 a1g1Var = ccn1Var.e;
        kcn1 kcn1Var = ccn1Var.d;
        byte[] bArrB = ((mhn1) a1g1Var.b).b();
        kcn1Var.f.b();
        zfn1 zfn1Var = new zfn1();
        if (!boo1.D(1)) {
            k220.r("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        if (bArrB.length != 32) {
            hhg1.n("Given private key's length is not 32");
            return null;
        }
        KeyFactory.getInstance("Ed25519", providerL).generatePrivate(new PKCS8EncodedKeySpec(z0o1.x(new byte[][]{a, bArrB})));
        return zfn1Var;
    }

    public static zfn1 c(xdn1 xdn1Var) throws GeneralSecurityException {
        int i = xgp1.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
        }
        Provider providerL = ila0.L();
        if (providerL == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerL);
        ydn1 ydn1Var = xdn1Var.d;
        wdn1 wdn1Var = ydn1Var.d;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(ydn1Var.e, wdn1Var.b, (BigInteger) xdn1Var.e.b, (BigInteger) xdn1Var.f.b, (BigInteger) xdn1Var.g.b, (BigInteger) xdn1Var.h.b, (BigInteger) xdn1Var.i.b, (BigInteger) xdn1Var.j.b));
        udn1 udn1Var = wdn1Var.d;
        udn1 udn1Var2 = wdn1Var.e;
        int i2 = wdn1Var.f;
        ydn1Var.f.b();
        zfn1 zfn1Var = new zfn1();
        if (!boo1.D(2)) {
            k220.r("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        q1o1.x(rSAPrivateCrtKey.getModulus().bitLength());
        q1o1.y(rSAPrivateCrtKey.getPublicExponent());
        lgn1.b(udn1Var);
        lgn1.c(udn1Var, udn1Var2, i2);
        return zfn1Var;
    }

    public static qap1 d(ccn1 ccn1Var) {
        if (!boo1.D(1)) {
            k220.r("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        try {
            return b(ccn1Var);
        } catch (GeneralSecurityException unused) {
            a1g1 a1g1Var = ccn1Var.e;
            kcn1 kcn1Var = ccn1Var.d;
            byte[] bArrB = ((mhn1) a1g1Var.b).b();
            kcn1Var.f.b();
            zfn1 zfn1Var = new zfn1();
            if (!boo1.D(1)) {
                k220.r("Can not use Ed25519 in FIPS-mode.");
                return null;
            }
            if (bArrB.length == 32) {
                fcp1.a(fcp1.b(bArrB));
                return zfn1Var;
            }
            hhg1.n("Given private key's length is not 32");
            return null;
        }
    }
}
