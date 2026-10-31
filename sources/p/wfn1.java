package p;

import com.google.android.recaptcha.internal.zzals;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wfn1 {
    public static final wep1 a = new wep1(bkp1.class);
    public static final uep1 b = new uep1("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
    public static final ycp1 c = new ycp1(sbn1.class, opm1.b);
    public static final scp1 d = new scp1("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", ism1.b);
    public static final ycp1 e = new ycp1(rbn1.class, kum1.c);
    public static final scp1 f = new scp1("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", yxm1.b);

    public static kap1 a(rbn1 rbn1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        int iH = h(rbn1Var.d.d.b);
        dhp1 dhp1VarB = ehp1.B();
        sbn1 sbn1Var = rbn1Var.d;
        hhp1 hhp1VarI = i(sbn1Var);
        dhp1VarB.d();
        ((ehp1) dhp1VarB.b).C(hhp1VarI);
        i2i1 i2i1Var = rbn1Var.e;
        a2x0.a(a2x0Var);
        byte[] bArrY = yoi1.Y((BigInteger) i2i1Var.b, iH);
        vhn1 vhn1Var = ain1.b;
        vhn1 vhn1VarX = ain1.x(0, bArrY, bArrY.length);
        dhp1VarB.d();
        ((ehp1) dhp1VarB.b).D(vhn1VarX);
        return kap1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((ehp1) dhp1VarB.e()).c(), gap1.e, e(sbn1Var.d.d), sbn1Var.g);
    }

    public static sbn1 b(kap1 kap1Var) {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            hhg1.n("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            hhp1 hhp1VarB = hhp1.B(ain1Var, hin1.b);
            if (hhp1VarB.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            cik1 cik1Var = new cik1((byte) 22);
            cik1Var.d = f(hhp1VarB.y().x());
            cik1Var.b = k(hhp1VarB.y().C());
            cik1Var.c = j(hhp1VarB.y().B());
            cik1Var.e = g((clv) kap1Var.d);
            bkp1 bkp1VarW = cik1Var.w();
            zrj1 zrj1Var = new zrj1((byte) 22);
            zrj1Var.c = null;
            zrj1Var.d = null;
            zrj1Var.b = bkp1VarW;
            zrj1Var.c = new ECPoint(new BigInteger(1, hhp1VarB.z().z()), new BigInteger(1, hhp1VarB.A().z()));
            zrj1Var.d = (Integer) kap1Var.e;
            return zrj1Var.l();
        } catch (zzals | IllegalArgumentException unused) {
            k220.r("Parsing EcdsaPublicKey failed");
            return null;
        }
    }

    public static rbn1 c(kap1 kap1Var, a2x0 a2x0Var) {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            hhg1.n("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            ehp1 ehp1VarA = ehp1.A(ain1Var, hin1.b);
            if (ehp1VarA.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            hhp1 hhp1VarY = ehp1VarA.y();
            if (hhp1VarY.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            cik1 cik1Var = new cik1((byte) 22);
            cik1Var.d = f(hhp1VarY.y().x());
            cik1Var.b = k(hhp1VarY.y().C());
            cik1Var.c = j(hhp1VarY.y().B());
            cik1Var.e = g((clv) kap1Var.d);
            bkp1 bkp1VarW = cik1Var.w();
            zrj1 zrj1Var = new zrj1((byte) 22);
            zrj1Var.c = null;
            zrj1Var.d = null;
            zrj1Var.b = bkp1VarW;
            zrj1Var.c = new ECPoint(new BigInteger(1, hhp1VarY.z().z()), new BigInteger(1, hhp1VarY.A().z()));
            zrj1Var.d = (Integer) kap1Var.e;
            sbn1 sbn1VarL = zrj1Var.l();
            bym1 bym1Var = new bym1((byte) 5);
            bym1Var.c = null;
            bym1Var.b = sbn1VarL;
            BigInteger bigInteger = new BigInteger(1, ehp1VarA.z().z());
            a2x0.a(a2x0Var);
            bym1Var.c = new i2i1(bigInteger, (byte) 14);
            return bym1Var.o();
        } catch (zzals | IllegalArgumentException unused) {
            k220.r("Parsing EcdsaPrivateKey failed");
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

    public static clv e(akp1 akp1Var) throws GeneralSecurityException {
        if (akp1Var == akp1.c) {
            return clv.f;
        }
        if (akp1Var == akp1.d) {
            return clv.i;
        }
        if (akp1Var == akp1.f) {
            return clv.h;
        }
        if (akp1Var == akp1.e) {
            return clv.g;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(akp1Var.b));
    }

    public static yjp1 f(nhp1 nhp1Var) throws GeneralSecurityException {
        int iOrdinal = nhp1Var.ordinal();
        if (iOrdinal == 2) {
            return yjp1.d;
        }
        if (iOrdinal == 3) {
            return yjp1.c;
        }
        if (iOrdinal == 4) {
            return yjp1.e;
        }
        int iZza = nhp1Var.zza();
        throw new GeneralSecurityException(gvg.l(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    public static akp1 g(clv clvVar) throws GeneralSecurityException {
        if (clvVar == clv.f) {
            return akp1.c;
        }
        if (clvVar == clv.i) {
            return akp1.d;
        }
        if (clvVar == clv.g) {
            return akp1.e;
        }
        if (clvVar == clv.h) {
            return akp1.f;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(clvVar.b));
    }

    public static int h(xjp1 xjp1Var) throws GeneralSecurityException {
        if (xjp1Var.equals(xjp1.c)) {
            return 33;
        }
        if (xjp1Var == xjp1.d) {
            return 49;
        }
        if (xjp1Var == xjp1.e) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(xjp1Var.a));
    }

    public static hhp1 i(sbn1 sbn1Var) throws GeneralSecurityException {
        nhp1 nhp1Var;
        int i;
        int iH = h(sbn1Var.d.b);
        ECPoint eCPoint = sbn1Var.e;
        ghp1 ghp1VarC = hhp1.C();
        bkp1 bkp1Var = sbn1Var.d;
        bhp1 bhp1VarY = chp1.y();
        yjp1 yjp1Var = bkp1Var.c;
        if (yjp1Var.equals(yjp1.c)) {
            nhp1Var = nhp1.SHA256;
        } else if (yjp1Var == yjp1.d) {
            nhp1Var = nhp1.SHA384;
        } else {
            if (yjp1Var != yjp1.e) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(yjp1Var.b));
            }
            nhp1Var = nhp1.SHA512;
        }
        bhp1VarY.d();
        ((chp1) bhp1VarY.b).A(nhp1Var);
        xjp1 xjp1Var = bkp1Var.b;
        int i2 = 4;
        if (xjp1Var.equals(xjp1.c)) {
            i = 4;
        } else if (xjp1Var == xjp1.d) {
            i = 5;
        } else {
            if (xjp1Var != xjp1.e) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(xjp1Var.a));
            }
            i = 6;
        }
        bhp1VarY.d();
        ((chp1) bhp1VarY.b).D(i);
        zjp1 zjp1Var = bkp1Var.a;
        if (zjp1Var.equals(zjp1.c)) {
            i2 = 3;
        } else if (zjp1Var != zjp1.d) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zjp1Var.b));
        }
        bhp1VarY.d();
        ((chp1) bhp1VarY.b).E(i2);
        chp1 chp1Var = (chp1) bhp1VarY.e();
        ghp1VarC.d();
        ((hhp1) ghp1VarC.b).E(chp1Var);
        byte[] bArrY = yoi1.Y(eCPoint.getAffineX(), iH);
        vhn1 vhn1Var = ain1.b;
        vhn1 vhn1VarX = ain1.x(0, bArrY, bArrY.length);
        ghp1VarC.d();
        ((hhp1) ghp1VarC.b).F(vhn1VarX);
        byte[] bArrY2 = yoi1.Y(eCPoint.getAffineY(), iH);
        vhn1 vhn1VarX2 = ain1.x(0, bArrY2, bArrY2.length);
        ghp1VarC.d();
        ((hhp1) ghp1VarC.b).G(vhn1VarX2);
        return (hhp1) ghp1VarC.e();
    }

    public static xjp1 j(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return xjp1.c;
        }
        if (i2 == 3) {
            return xjp1.d;
        }
        if (i2 == 4) {
            return xjp1.e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(gvg.l(new StringBuilder(String.valueOf(i2).length() + 35), "Unable to parse EllipticCurveType: ", i2));
        }
        xin1.a();
        throw null;
    }

    public static zjp1 k(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zjp1.c;
        }
        if (i2 == 2) {
            return zjp1.d;
        }
        if (i != 1) {
            throw new GeneralSecurityException(gvg.l(new StringBuilder(String.valueOf(i2).length() + 40), "Unable to parse EcdsaSignatureEncoding: ", i2));
        }
        xin1.a();
        throw null;
    }
}
