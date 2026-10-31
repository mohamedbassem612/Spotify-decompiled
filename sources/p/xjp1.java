package p;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xjp1 {
    public static final xjp1 c = new xjp1("NIST_P256", lcp1.a);
    public static final xjp1 d = new xjp1("NIST_P384", lcp1.b);
    public static final xjp1 e = new xjp1("NIST_P521", lcp1.c);
    public final String a;
    public final ECParameterSpec b;

    public xjp1(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
