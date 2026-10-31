package p;

import com.google.android.recaptcha.internal.zzals;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hgn1 {
    public static final wep1 a = new wep1(idn1.class);
    public static final uep1 b = new uep1("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
    public static final ycp1 c = new ycp1(pdn1.class, t9n1.b);
    public static final scp1 d = new scp1("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", uan1.b);
    public static final ycp1 e = new ycp1(odn1.class, bbn1.c);
    public static final scp1 f = new scp1("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", cbn1.b);
    public static final ncp1 g;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        nhp1 nhp1Var = nhp1.SHA256;
        gdn1 gdn1Var = gdn1.b;
        map.put(nhp1Var, gdn1Var);
        map2.put(gdn1Var, nhp1Var);
        nhp1 nhp1Var2 = nhp1.SHA384;
        gdn1 gdn1Var2 = gdn1.c;
        map.put(nhp1Var2, gdn1Var2);
        map2.put(gdn1Var2, nhp1Var2);
        nhp1 nhp1Var3 = nhp1.SHA512;
        gdn1 gdn1Var3 = gdn1.d;
        map.put(nhp1Var3, gdn1Var3);
        map2.put(gdn1Var3, nhp1Var3);
        g = new ncp1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static kap1 a(odn1 odn1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        a2x0.a(a2x0Var);
        rip1 rip1VarG = sip1.G();
        rip1VarG.d();
        ((sip1) rip1VarG.b).H();
        vip1 vip1VarG = g(odn1Var.d);
        rip1VarG.d();
        ((sip1) rip1VarG.b).I(vip1VarG);
        byte[] bArrX = yoi1.X((BigInteger) odn1Var.e.b);
        vhn1 vhn1Var = ain1.b;
        vhn1 vhn1VarX = ain1.x(0, bArrX, bArrX.length);
        rip1VarG.d();
        ((sip1) rip1VarG.b).J(vhn1VarX);
        byte[] bArrX2 = yoi1.X((BigInteger) odn1Var.f.b);
        vhn1 vhn1VarX2 = ain1.x(0, bArrX2, bArrX2.length);
        rip1VarG.d();
        ((sip1) rip1VarG.b).K(vhn1VarX2);
        byte[] bArrX3 = yoi1.X((BigInteger) odn1Var.g.b);
        vhn1 vhn1VarX3 = ain1.x(0, bArrX3, bArrX3.length);
        rip1VarG.d();
        ((sip1) rip1VarG.b).L(vhn1VarX3);
        byte[] bArrX4 = yoi1.X((BigInteger) odn1Var.h.b);
        vhn1 vhn1VarX4 = ain1.x(0, bArrX4, bArrX4.length);
        rip1VarG.d();
        ((sip1) rip1VarG.b).M(vhn1VarX4);
        byte[] bArrX5 = yoi1.X((BigInteger) odn1Var.i.b);
        vhn1 vhn1VarX5 = ain1.x(0, bArrX5, bArrX5.length);
        rip1VarG.d();
        ((sip1) rip1VarG.b).N(vhn1VarX5);
        byte[] bArrX6 = yoi1.X((BigInteger) odn1Var.j.b);
        vhn1 vhn1VarX6 = ain1.x(0, bArrX6, bArrX6.length);
        rip1VarG.d();
        ((sip1) rip1VarG.b).O(vhn1VarX6);
        vhn1 vhn1VarC = ((sip1) rip1VarG.e()).c();
        pdn1 pdn1Var = odn1Var.d;
        return kap1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", vhn1VarC, gap1.e, e(pdn1Var.d.c), pdn1Var.g);
    }

    public static pdn1 b(kap1 kap1Var) {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            hhg1.n("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            vip1 vip1VarB = vip1.B(ain1Var, hin1.b);
            if (vip1VarB.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, vip1VarB.z().z());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = idn1.e;
            fdn1 fdn1Var = new fdn1();
            fdn1Var.c = (gdn1) g.b(vip1VarB.y().x());
            fdn1Var.b = new BigInteger(1, vip1VarB.A().z());
            fdn1Var.a(iBitLength);
            fdn1Var.d = f((clv) kap1Var.d);
            idn1 idn1VarB = fdn1Var.b();
            zrj1 zrj1Var = new zrj1((byte) 23);
            zrj1Var.b = idn1VarB;
            zrj1Var.c = bigInteger;
            zrj1Var.d = (Integer) kap1Var.e;
            return zrj1Var.m();
        } catch (zzals | IllegalArgumentException unused) {
            k220.r("Parsing RsaSsaPkcs1PublicKey failed");
            return null;
        }
    }

    public static odn1 c(kap1 kap1Var, a2x0 a2x0Var) {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            hhg1.n("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            sip1 sip1VarF = sip1.F(ain1Var, hin1.b);
            if (sip1VarF.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            vip1 vip1VarY = sip1VarF.y();
            if (vip1VarY.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, vip1VarY.z().z());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, vip1VarY.A().z());
            BigInteger bigInteger3 = idn1.e;
            fdn1 fdn1Var = new fdn1();
            fdn1Var.c = (gdn1) g.b(vip1VarY.y().x());
            fdn1Var.b = bigInteger2;
            fdn1Var.a(iBitLength);
            fdn1Var.d = f((clv) kap1Var.d);
            idn1 idn1VarB = fdn1Var.b();
            zrj1 zrj1Var = new zrj1((byte) 23);
            zrj1Var.b = idn1VarB;
            zrj1Var.c = bigInteger;
            zrj1Var.d = (Integer) kap1Var.e;
            pdn1 pdn1VarM = zrj1Var.m();
            a2x0.a(a2x0Var);
            mxa1 mxa1VarX = odn1.x();
            mxa1VarX.b = pdn1VarM;
            i2i1 i2i1VarH = h(sip1VarF.A());
            i2i1 i2i1VarH2 = h(sip1VarF.B());
            mxa1VarX.c = i2i1VarH;
            mxa1VarX.e = i2i1VarH2;
            mxa1VarX.d = h(sip1VarF.z());
            i2i1 i2i1VarH3 = h(sip1VarF.C());
            i2i1 i2i1VarH4 = h(sip1VarF.D());
            mxa1VarX.f = i2i1VarH3;
            mxa1VarX.g = i2i1VarH4;
            mxa1VarX.h = h(sip1VarF.E());
            return mxa1VarX.B();
        } catch (zzals | IllegalArgumentException unused) {
            k220.r("Parsing RsaSsaPkcs1PrivateKey failed");
            return null;
        }
    }

    public static void d(rep1 rep1Var) {
        rep1Var.c(a);
        rep1Var.d(b);
        rep1Var.a(c);
        rep1Var.b(d);
        rep1Var.a(e);
        rep1Var.b(f);
    }

    public static clv e(hdn1 hdn1Var) throws GeneralSecurityException {
        if (hdn1Var == hdn1.f) {
            return clv.h;
        }
        if (hdn1Var == hdn1.c) {
            return clv.f;
        }
        if (hdn1Var == hdn1.d) {
            return clv.i;
        }
        if (hdn1Var == hdn1.e) {
            return clv.g;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(hdn1Var)));
    }

    public static hdn1 f(clv clvVar) throws GeneralSecurityException {
        if (clvVar == clv.h) {
            return hdn1.f;
        }
        if (clvVar == clv.f) {
            return hdn1.c;
        }
        if (clvVar == clv.i) {
            return hdn1.d;
        }
        if (clvVar == clv.g) {
            return hdn1.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(clvVar.b));
    }

    public static vip1 g(pdn1 pdn1Var) {
        uip1 uip1VarC = vip1.C();
        idn1 idn1Var = pdn1Var.d;
        pip1 pip1VarY = qip1.y();
        nhp1 nhp1Var = (nhp1) g.a(idn1Var.d);
        pip1VarY.d();
        ((qip1) pip1VarY.b).A(nhp1Var);
        qip1 qip1Var = (qip1) pip1VarY.e();
        uip1VarC.d();
        ((vip1) uip1VarC.b).E(qip1Var);
        byte[] bArrX = yoi1.X(pdn1Var.e);
        vhn1 vhn1Var = ain1.b;
        vhn1 vhn1VarX = ain1.x(0, bArrX, bArrX.length);
        uip1VarC.d();
        ((vip1) uip1VarC.b).F(vhn1VarX);
        byte[] bArrX2 = yoi1.X(pdn1Var.d.b);
        vhn1 vhn1VarX2 = ain1.x(0, bArrX2, bArrX2.length);
        uip1VarC.d();
        ((vip1) uip1VarC.b).G(vhn1VarX2);
        return (vip1) uip1VarC.e();
    }

    public static i2i1 h(ain1 ain1Var) {
        return new i2i1(new BigInteger(1, ain1Var.z()), (byte) 14);
    }
}
