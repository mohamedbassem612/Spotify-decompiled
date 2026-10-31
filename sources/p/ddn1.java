package p;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class ddn1 implements ufp1, agp1, zgn1 {
    public static final /* synthetic */ ddn1 a = new ddn1();
    public static final /* synthetic */ ddn1 b = new ddn1();

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // p.ufp1
    public Object b(pno1 pno1Var) {
        a2x0 a2x0Var = a2x0.c1;
        kap1 kap1Var = ((jdp1) pno1Var).d;
        jdp1.w(kap1Var, a2x0Var);
        return new bgn1((tap1) rcp1.d.a(tap1.class, (String) kap1Var.a).a((ain1) kap1Var.b), bgn1.c(kap1Var), ((clv) kap1Var.d) != clv.g ? new byte[0] : new byte[]{0});
    }
}
