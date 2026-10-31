package p;

import com.google.android.recaptcha.internal.zzals;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kgn1 {
    public static final wep1 a = new wep1(wdn1.class);
    public static final uep1 b = new uep1("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
    public static final ycp1 c = new ycp1(ydn1.class, vbn1.d);
    public static final scp1 d = new scp1("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", wbn1.b);
    public static final ycp1 e = new ycp1(xdn1.class, xbn1.b);
    public static final scp1 f = new scp1("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", hcn1.b);
    public static final ncp1 g;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        nhp1 nhp1Var = nhp1.SHA256;
        udn1 udn1Var = udn1.b;
        map.put(nhp1Var, udn1Var);
        map2.put(udn1Var, nhp1Var);
        nhp1 nhp1Var2 = nhp1.SHA384;
        udn1 udn1Var2 = udn1.c;
        map.put(nhp1Var2, udn1Var2);
        map2.put(udn1Var2, nhp1Var2);
        nhp1 nhp1Var3 = nhp1.SHA512;
        udn1 udn1Var3 = udn1.d;
        map.put(nhp1Var3, udn1Var3);
        map2.put(udn1Var3, nhp1Var3);
        g = new ncp1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static kap1 a(xdn1 xdn1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        a2x0.a(a2x0Var);
        ajp1 ajp1VarG = djp1.G();
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).H();
        gjp1 gjp1VarG = g(xdn1Var.d);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).I(gjp1VarG);
        byte[] bArrX = yoi1.X((BigInteger) xdn1Var.e.b);
        vhn1 vhn1Var = ain1.b;
        vhn1 vhn1VarX = ain1.x(0, bArrX, bArrX.length);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).J(vhn1VarX);
        byte[] bArrX2 = yoi1.X((BigInteger) xdn1Var.f.b);
        vhn1 vhn1VarX2 = ain1.x(0, bArrX2, bArrX2.length);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).K(vhn1VarX2);
        byte[] bArrX3 = yoi1.X((BigInteger) xdn1Var.g.b);
        vhn1 vhn1VarX3 = ain1.x(0, bArrX3, bArrX3.length);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).L(vhn1VarX3);
        byte[] bArrX4 = yoi1.X((BigInteger) xdn1Var.h.b);
        vhn1 vhn1VarX4 = ain1.x(0, bArrX4, bArrX4.length);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).M(vhn1VarX4);
        byte[] bArrX5 = yoi1.X((BigInteger) xdn1Var.i.b);
        vhn1 vhn1VarX5 = ain1.x(0, bArrX5, bArrX5.length);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).N(vhn1VarX5);
        byte[] bArrX6 = yoi1.X((BigInteger) xdn1Var.j.b);
        vhn1 vhn1VarX6 = ain1.x(0, bArrX6, bArrX6.length);
        ajp1VarG.d();
        ((djp1) ajp1VarG.b).O(vhn1VarX6);
        vhn1 vhn1VarC = ((djp1) ajp1VarG.e()).c();
        ydn1 ydn1Var = xdn1Var.d;
        return kap1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", vhn1VarC, gap1.e, e(ydn1Var.d.c), ydn1Var.g);
    }

    public static ydn1 b(kap1 kap1Var) {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            hhg1.n("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            gjp1 gjp1VarB = gjp1.B(ain1Var, hin1.b);
            if (gjp1VarB.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, gjp1VarB.z().z());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = wdn1.g;
            tdn1 tdn1Var = new tdn1();
            ncp1 ncp1Var = g;
            tdn1Var.c = (udn1) ncp1Var.b(gjp1VarB.y().x());
            tdn1Var.d = (udn1) ncp1Var.b(gjp1VarB.y().y());
            tdn1Var.b = new BigInteger(1, gjp1VarB.A().z());
            tdn1Var.a(iBitLength);
            tdn1Var.b(gjp1VarB.y().z());
            tdn1Var.f = f((clv) kap1Var.d);
            wdn1 wdn1VarC = tdn1Var.c();
            zrj1 zrj1Var = new zrj1((byte) 24);
            zrj1Var.b = wdn1VarC;
            zrj1Var.c = bigInteger;
            zrj1Var.d = (Integer) kap1Var.e;
            return zrj1Var.n();
        } catch (zzals | IllegalArgumentException unused) {
            k220.r("Parsing RsaSsaPssPublicKey failed");
            return null;
        }
    }

    public static xdn1 c(kap1 kap1Var, a2x0 a2x0Var) {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            hhg1.n("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            djp1 djp1VarF = djp1.F(ain1Var, hin1.b);
            if (djp1VarF.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            gjp1 gjp1VarY = djp1VarF.y();
            if (gjp1VarY.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, gjp1VarY.z().z());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, gjp1VarY.A().z());
            BigInteger bigInteger3 = wdn1.g;
            tdn1 tdn1Var = new tdn1();
            ncp1 ncp1Var = g;
            tdn1Var.c = (udn1) ncp1Var.b(gjp1VarY.y().x());
            tdn1Var.d = (udn1) ncp1Var.b(gjp1VarY.y().y());
            tdn1Var.b = bigInteger2;
            tdn1Var.a(iBitLength);
            tdn1Var.b(gjp1VarY.y().z());
            tdn1Var.f = f((clv) kap1Var.d);
            wdn1 wdn1VarC = tdn1Var.c();
            zrj1 zrj1Var = new zrj1((byte) 24);
            zrj1Var.b = wdn1VarC;
            zrj1Var.c = bigInteger;
            zrj1Var.d = (Integer) kap1Var.e;
            ydn1 ydn1VarN = zrj1Var.n();
            a2x0.a(a2x0Var);
            mxa1 mxa1VarX = xdn1.x();
            mxa1VarX.b = ydn1VarN;
            i2i1 i2i1VarH = h(djp1VarF.A());
            i2i1 i2i1VarH2 = h(djp1VarF.B());
            mxa1VarX.c = i2i1VarH;
            mxa1VarX.e = i2i1VarH2;
            mxa1VarX.d = h(djp1VarF.z());
            i2i1 i2i1VarH3 = h(djp1VarF.C());
            i2i1 i2i1VarH4 = h(djp1VarF.D());
            mxa1VarX.f = i2i1VarH3;
            mxa1VarX.g = i2i1VarH4;
            mxa1VarX.h = h(djp1VarF.E());
            return mxa1VarX.C();
        } catch (zzals | IllegalArgumentException unused) {
            k220.r("Parsing RsaSsaPssPrivateKey failed");
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

    public static clv e(vdn1 vdn1Var) throws GeneralSecurityException {
        if (vdn1Var == vdn1.f) {
            return clv.h;
        }
        if (vdn1Var == vdn1.c) {
            return clv.f;
        }
        if (vdn1Var == vdn1.d) {
            return clv.i;
        }
        if (vdn1Var == vdn1.e) {
            return clv.g;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(vdn1Var)));
    }

    public static vdn1 f(clv clvVar) throws GeneralSecurityException {
        if (clvVar == clv.h) {
            return vdn1.f;
        }
        if (clvVar == clv.f) {
            return vdn1.c;
        }
        if (clvVar == clv.i) {
            return vdn1.d;
        }
        if (clvVar == clv.g) {
            return vdn1.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(clvVar.b));
    }

    public static gjp1 g(ydn1 ydn1Var) {
        fjp1 fjp1VarC = gjp1.C();
        wdn1 wdn1Var = ydn1Var.d;
        xip1 xip1VarA = zip1.A();
        udn1 udn1Var = wdn1Var.d;
        ncp1 ncp1Var = g;
        nhp1 nhp1Var = (nhp1) ncp1Var.a(udn1Var);
        xip1VarA.d();
        ((zip1) xip1VarA.b).C(nhp1Var);
        nhp1 nhp1Var2 = (nhp1) ncp1Var.a(wdn1Var.e);
        xip1VarA.d();
        ((zip1) xip1VarA.b).D(nhp1Var2);
        int i = wdn1Var.f;
        xip1VarA.d();
        ((zip1) xip1VarA.b).E(i);
        zip1 zip1Var = (zip1) xip1VarA.e();
        fjp1VarC.d();
        ((gjp1) fjp1VarC.b).F(zip1Var);
        byte[] bArrX = yoi1.X(ydn1Var.e);
        vhn1 vhn1Var = ain1.b;
        vhn1 vhn1VarX = ain1.x(0, bArrX, bArrX.length);
        fjp1VarC.d();
        ((gjp1) fjp1VarC.b).G(vhn1VarX);
        byte[] bArrX2 = yoi1.X(ydn1Var.d.b);
        vhn1 vhn1VarX2 = ain1.x(0, bArrX2, bArrX2.length);
        fjp1VarC.d();
        ((gjp1) fjp1VarC.b).H(vhn1VarX2);
        fjp1VarC.d();
        ((gjp1) fjp1VarC.b).E(0);
        return (gjp1) fjp1VarC.e();
    }

    public static i2i1 h(ain1 ain1Var) {
        return new i2i1(new BigInteger(1, ain1Var.z()), (byte) 14);
    }
}
