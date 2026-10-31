package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class lzm1 implements Init, bgp1, adp1, e4o1 {
    public static final /* synthetic */ lzm1 a = new lzm1();
    public static final /* synthetic */ lzm1 b = new lzm1();

    public First e0(Object obj) {
        return First.b((hzm1) obj);
    }

    public kap1 f(pno1 pno1Var, a2x0 a2x0Var) {
        kcn1 kcn1Var = (kcn1) pno1Var;
        return kap1.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", yfn1.g(kcn1Var).c(), gap1.f, yfn1.e(kcn1Var.d.a), kcn1Var.g);
    }

    public boolean zzb(Class cls) {
        return false;
    }

    public g6o1 zzc(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
