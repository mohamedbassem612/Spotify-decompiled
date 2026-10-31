package p;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pgp1 implements map1 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public /* synthetic */ pgp1(cik1 cik1Var) {
        this.a = new HashMap((HashMap) cik1Var.b);
        this.b = new HashMap((HashMap) cik1Var.c);
        this.c = new HashMap((HashMap) cik1Var.d);
        this.d = new HashMap((HashMap) cik1Var.e);
    }

    public final pno1 a(kap1 kap1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        String str = (String) kap1Var.a;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return ((scp1) map.get(str)).b.a(kap1Var, a2x0Var);
        }
        throw new GeneralSecurityException(l1d.q(new StringBuilder(String.valueOf(str).length() + 47), "No Key Parser for requested key type ", str, " available"));
    }

    public final kap1 b(pno1 pno1Var, a2x0 a2x0Var) throws GeneralSecurityException {
        Class<?> cls = pno1Var.getClass();
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            return ((ycp1) map.get(pno1Var.getClass())).b.f(pno1Var, a2x0Var);
        }
        String strValueOf = String.valueOf(pno1Var.getClass());
        throw new GeneralSecurityException(l1d.q(new StringBuilder(strValueOf.length() + 32), "No Key serializer for ", strValueOf, " available"));
    }
}
