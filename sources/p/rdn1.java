package p;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class rdn1 implements ufp1, cgp1, zgn1, cgo1 {
    public static final /* synthetic */ rdn1 a = new rdn1();
    public static final /* synthetic */ rdn1 b = new rdn1();
    public static final /* synthetic */ rdn1 c = new rdn1();

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        return ihn1.b((pdn1) pno1Var);
    }

    public /* synthetic */ Object zza() {
        throw new IllegalStateException();
    }
}
