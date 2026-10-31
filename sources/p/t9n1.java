package p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t9n1 implements phs0, agp1, adp1, v0i {
    public static final /* synthetic */ t9n1 a = new t9n1();
    public static final /* synthetic */ t9n1 b = new t9n1();

    public /* bridge */ /* synthetic */ Object d(p331 p331Var) {
        return null;
    }

    @Override // p.adp1
    public kap1 f(pno1 pno1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        pdn1 pdn1Var = (pdn1) pno1Var;
        return kap1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", hgn1.g(pdn1Var).c(), gap1.f, hgn1.e(pdn1Var.d.c), pdn1Var.g);
    }

    public Object m(dxy dxyVar) {
        synchronized (i9p1.class) {
            l7p1 l7p1Var = new l7p1();
            synchronized (i9p1.class) {
                try {
                    owo1 owo1Var = i9p1.a;
                    if (owo1Var == null) {
                        owo1Var = new owo1((byte) 1);
                        i9p1.a = owo1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new pbo1((byte) 0);
        }
        return new pbo1((byte) 0);
    }
}
