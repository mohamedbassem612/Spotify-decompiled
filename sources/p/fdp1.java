package p;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class fdp1 {
    public final String a;
    public final Class b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public fdp1(int i, Class cls, String str) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    public final Object a(ain1 ain1Var) throws GeneralSecurityException {
        pno1 pno1VarE = rep1.b.e(kap1.a(this.a, ain1Var, yoo1.F(this.c), yoo1.G(5), (Integer) null), a2x0.c1);
        xfp1 xfp1Var = (xfp1) oep1.b.a.get();
        xfp1Var.getClass();
        wfp1 wfp1Var = new wfp1(pno1VarE.getClass(), this.b);
        HashMap map = xfp1Var.a;
        if (map.containsKey(wfp1Var)) {
            return ((sfp1) map.get(wfp1Var)).c.b(pno1VarE);
        }
        String string = wfp1Var.toString();
        throw new GeneralSecurityException(l1d.q(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
