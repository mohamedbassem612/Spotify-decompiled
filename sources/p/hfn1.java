package p;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hfn1 {
    static {
        int i = oip1.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        cdn1 cdn1Var = cdn1.a;
        oep1 oep1Var = oep1.b;
        oep1Var.b(cdn1.a);
        oep1Var.a(cdn1.b);
        oep1Var.b(edn1.a);
        oep1Var.a(edn1.b);
        byte b = ybn1.f;
        if (!boo1.D(b)) {
            k220.r("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        rep1 rep1Var = rep1.b;
        wfn1.d(rep1Var);
        nep1 nep1Var = nep1.b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", adn1.a);
        map.put("ECDSA_P256_IEEE_P1363", adn1.d);
        cik1 cik1Var = new cik1((byte) 22);
        cik1Var.d = yjp1.c;
        cik1Var.c = xjp1.c;
        cik1Var.b = zjp1.c;
        cik1Var.e = akp1.f;
        map.put("ECDSA_P256_RAW", cik1Var.w());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", adn1.f);
        map.put("ECDSA_P384", adn1.b);
        map.put("ECDSA_P384_IEEE_P1363", adn1.e);
        cik1 cik1Var2 = new cik1((byte) 22);
        cik1Var2.d = yjp1.e;
        xjp1 xjp1Var = xjp1.d;
        cik1Var2.c = xjp1Var;
        zjp1 zjp1Var = zjp1.d;
        cik1Var2.b = zjp1Var;
        akp1 akp1Var = akp1.c;
        cik1Var2.e = akp1Var;
        map.put("ECDSA_P384_SHA512", cik1Var2.w());
        cik1 cik1Var3 = new cik1((byte) 22);
        cik1Var3.d = yjp1.d;
        cik1Var3.c = xjp1Var;
        cik1Var3.b = zjp1Var;
        cik1Var3.e = akp1Var;
        map.put("ECDSA_P384_SHA384", cik1Var3.w());
        map.put("ECDSA_P521", adn1.c);
        map.put("ECDSA_P521_IEEE_P1363", adn1.g);
        nep1Var.b(Collections.unmodifiableMap(map));
        oep1Var.a(ybn1.a);
        oep1Var.a(ybn1.b);
        eep1 eep1Var = eep1.b;
        eep1Var.a(bkp1.class, ybn1.e);
        rcp1 rcp1Var = rcp1.d;
        rcp1Var.b(ybn1.c, b, true);
        rcp1Var.b(ybn1.d, b, false);
        byte b2 = sdn1.f;
        if (!boo1.D(b2)) {
            k220.r("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        hgn1.d(rep1Var);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", adn1.h);
        BigInteger bigInteger = idn1.e;
        fdn1 fdn1Var = new fdn1();
        fdn1Var.c = gdn1.b;
        fdn1Var.a(3072);
        BigInteger bigInteger2 = idn1.e;
        fdn1Var.b = bigInteger2;
        hdn1 hdn1Var = hdn1.f;
        fdn1Var.d = hdn1Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", fdn1Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", adn1.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", adn1.j);
        fdn1 fdn1Var2 = new fdn1();
        fdn1Var2.c = gdn1.d;
        fdn1Var2.a(4096);
        fdn1Var2.b = bigInteger2;
        fdn1Var2.d = hdn1Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", fdn1Var2.b());
        nep1Var.b(map2);
        oep1Var.a(sdn1.a);
        oep1Var.a(sdn1.b);
        eep1Var.a(idn1.class, sdn1.e);
        rcp1Var.b(sdn1.c, b2, true);
        rcp1Var.b(sdn1.d, b2, false);
        byte b3 = ben1.f;
        if (!boo1.D(b3)) {
            k220.r("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        kgn1.d(rep1Var);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = wdn1.g;
        tdn1 tdn1Var = new tdn1();
        udn1 udn1Var = udn1.b;
        tdn1Var.c = udn1Var;
        tdn1Var.d = udn1Var;
        tdn1Var.b(32);
        tdn1Var.a(3072);
        BigInteger bigInteger4 = wdn1.g;
        tdn1Var.b = bigInteger4;
        vdn1 vdn1Var = vdn1.c;
        tdn1Var.f = vdn1Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", tdn1Var.c());
        tdn1 tdn1Var2 = new tdn1();
        tdn1Var2.c = udn1Var;
        tdn1Var2.d = udn1Var;
        tdn1Var2.b(32);
        tdn1Var2.a(3072);
        tdn1Var2.b = bigInteger4;
        vdn1 vdn1Var2 = vdn1.f;
        tdn1Var2.f = vdn1Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", tdn1Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", adn1.k);
        tdn1 tdn1Var3 = new tdn1();
        udn1 udn1Var2 = udn1.d;
        tdn1Var3.c = udn1Var2;
        tdn1Var3.d = udn1Var2;
        tdn1Var3.b(64);
        tdn1Var3.a(4096);
        tdn1Var3.b = bigInteger4;
        tdn1Var3.f = vdn1Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", tdn1Var3.c());
        tdn1 tdn1Var4 = new tdn1();
        tdn1Var4.c = udn1Var2;
        tdn1Var4.d = udn1Var2;
        tdn1Var4.b(64);
        tdn1Var4.a(4096);
        tdn1Var4.b = bigInteger4;
        tdn1Var4.f = vdn1Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", tdn1Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", adn1.l);
        nep1Var.b(Collections.unmodifiableMap(map3));
        oep1Var.a(ben1.a);
        oep1Var.a(ben1.b);
        eep1Var.a(wdn1.class, ben1.e);
        rcp1Var.b(ben1.c, b3, true);
        rcp1Var.b(ben1.d, b3, false);
        if (nbp1.a()) {
            return;
        }
        sfp1 sfp1Var = jcn1.a;
        if (!boo1.D(1)) {
            k220.r("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        yfn1.a(rep1Var);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new bcn1(acn1.c));
        acn1 acn1Var = acn1.f;
        map4.put("ED25519_RAW", new bcn1(acn1Var));
        map4.put("ED25519WithRawOutput", new bcn1(acn1Var));
        nep1Var.b(Collections.unmodifiableMap(map4));
        eep1Var.a(bcn1.class, jcn1.f);
        iep1 iep1Var = iep1.b;
        fcn1 fcn1Var = jcn1.e;
        fcn1 fcn1Var2 = (fcn1) iep1Var.a.putIfAbsent(bcn1.class, fcn1Var);
        if (fcn1Var2 != null && fcn1Var2 != fcn1Var) {
            k220.r("Different key creator for parameters class already inserted");
            return;
        }
        oep1Var.a(jcn1.a);
        oep1Var.a(jcn1.b);
        ddp1 ddp1Var = jcn1.c;
        synchronized (rcp1Var) {
            rcp1Var.b(ddp1Var, 1, true);
        }
        fdp1 fdp1Var = jcn1.d;
        synchronized (rcp1Var) {
            rcp1Var.b(fdp1Var, 1, false);
        }
    }
}
