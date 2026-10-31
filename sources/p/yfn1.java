package p;

import com.google.android.recaptcha.internal.zzals;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yfn1 {
    public static final wep1 a = new wep1(bcn1.class);
    public static final uep1 b = new uep1("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
    public static final ycp1 c = new ycp1(kcn1.class, lzm1.b);
    public static final scp1 d = new scp1("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", f2n1.b);
    public static final ycp1 e = new ycp1(ccn1.class, p4n1.b);
    public static final scp1 f = new scp1("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", d8n1.c);

    public static void a(rep1 rep1Var) {
        rep1Var.c(a);
        rep1Var.d(b);
        rep1Var.a(c);
        rep1Var.b(d);
        rep1Var.a(e);
        rep1Var.b(f);
    }

    public static kap1 b(ccn1 ccn1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        ihp1 ihp1VarB = jhp1.B();
        mhp1 mhp1VarG = g(ccn1Var.d);
        ihp1VarB.d();
        ((jhp1) ihp1VarB.b).D(mhp1VarG);
        a1g1 a1g1Var = ccn1Var.e;
        a2x0.a(a2x0Var);
        byte[] bArrB = ((mhn1) a1g1Var.b).b();
        vhn1 vhn1VarX = ain1.x(0, bArrB, bArrB.length);
        ihp1VarB.d();
        ((jhp1) ihp1VarB.b).C(vhn1VarX);
        vhn1 vhn1VarC = ((jhp1) ihp1VarB.e()).c();
        kcn1 kcn1Var = ccn1Var.d;
        return kap1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", vhn1VarC, gap1.e, e(kcn1Var.d.a), kcn1Var.g);
    }

    public static kcn1 c(kap1 kap1Var) throws GeneralSecurityException {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            hhg1.n("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            mhp1 mhp1VarZ = mhp1.z(ain1Var, hin1.b);
            if (mhp1VarZ.x() == 0) {
                return kcn1.x(f((clv) kap1Var.d), mhn1.a(mhp1VarZ.y().z()), (Integer) kap1Var.e);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzals unused) {
            k220.r("Parsing Ed25519PublicKey failed");
            return null;
        }
    }

    public static ccn1 d(kap1 kap1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        String str = (String) kap1Var.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            hhg1.n("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            ain1 ain1Var = (ain1) kap1Var.b;
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            jhp1 jhp1VarA = jhp1.A(ain1Var, hin1.b);
            if (jhp1VarA.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            mhp1 mhp1VarZ = jhp1VarA.z();
            if (mhp1VarZ.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            kcn1 kcn1VarX = kcn1.x(f((clv) kap1Var.d), mhn1.a(mhp1VarZ.y().z()), (Integer) kap1Var.e);
            byte[] bArrZ = jhp1VarA.y().z();
            a2x0.a(a2x0Var);
            return ccn1.x(kcn1VarX, new a1g1(mhn1.a(bArrZ), (byte) 18));
        } catch (zzals unused) {
            k220.r("Parsing Ed25519PrivateKey failed");
            return null;
        }
    }

    public static clv e(acn1 acn1Var) throws GeneralSecurityException {
        if (acn1Var == acn1.f) {
            return clv.h;
        }
        if (acn1Var == acn1.c) {
            return clv.f;
        }
        if (acn1Var == acn1.d) {
            return clv.i;
        }
        if (acn1Var == acn1.e) {
            return clv.g;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(acn1Var.b));
    }

    public static acn1 f(clv clvVar) throws GeneralSecurityException {
        if (clvVar == clv.h) {
            return acn1.f;
        }
        if (clvVar == clv.f) {
            return acn1.c;
        }
        if (clvVar == clv.i) {
            return acn1.d;
        }
        if (clvVar == clv.g) {
            return acn1.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(clvVar.b));
    }

    public static mhp1 g(kcn1 kcn1Var) {
        lhp1 lhp1VarA = mhp1.A();
        byte[] bArrB = kcn1Var.e.b();
        vhn1 vhn1VarX = ain1.x(0, bArrB, bArrB.length);
        lhp1VarA.d();
        ((mhp1) lhp1VarA.b).C(vhn1VarX);
        return (mhp1) lhp1VarA.e();
    }
}
