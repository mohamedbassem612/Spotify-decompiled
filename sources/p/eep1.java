package p;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eep1 {
    public static final eep1 b;
    public final HashMap a = new HashMap();

    static {
        tbn1 tbn1Var = tbn1.l;
        eep1 eep1Var = new eep1();
        try {
            eep1Var.a(ldp1.class, tbn1Var);
            b = eep1Var;
        } catch (GeneralSecurityException e) {
            k220.p("unexpected error.", e);
        }
    }

    public final synchronized void a(Class cls, tbn1 tbn1Var) {
        try {
            HashMap map = this.a;
            tbn1 tbn1Var2 = (tbn1) map.get(cls);
            if (tbn1Var2 != null && !tbn1Var2.equals(tbn1Var)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, tbn1Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
