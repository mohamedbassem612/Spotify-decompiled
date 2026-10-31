package p;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zdn1 implements ufp1, bgp1, zgn1 {
    public static final /* synthetic */ zdn1 a = new zdn1();
    public static final /* synthetic */ zdn1 b = new zdn1();

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        return jhn1.a((xdn1) pno1Var);
    }
}
