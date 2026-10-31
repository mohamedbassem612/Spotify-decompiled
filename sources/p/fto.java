package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fto implements w6g1 {
    public static final fto a = new fto();

    public final Object a(String str, String str2, ioj0 ioj0Var) {
        mdz mdzVar;
        goj0 goj0VarA;
        jo70 jo70Var;
        String str3;
        goj0 goj0VarA2;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        Set set = gto.a;
        hoj0 hoj0VarC = ioj0Var.c(mdz.class, str);
        if (hoj0VarC == null) {
            return r6g1.a;
        }
        goj0 goj0VarA3 = hoj0VarC.a();
        if (goj0VarA3 == null || (mdzVar = (mdz) goj0VarA3.a) == null) {
            return p6g1.a;
        }
        hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str2);
        hoj0 hoj0VarC3 = ioj0Var.c(xkk1.class, str2);
        xn70 xn70Var = null;
        if (hoj0VarC2 != null && (goj0VarA = hoj0VarC2.a()) != null && (jo70Var = (jo70) goj0VarA.a) != null) {
            if (hoj0VarC3 == null || (goj0VarA2 = hoj0VarC3.a()) == null || (xkk1Var = (xkk1) goj0VarA2.a) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str3 = up70VarA.a.a) == null) {
                str3 = "";
            }
            xn70Var = new xn70(jo70Var.a, str3, 4, (String) null);
        }
        return new q6g1(xn70Var, new bv11(mdzVar.c, (String) null, (Long) null, Long.valueOf(mdzVar.n), (u380) null, 0, false, oqn1.q(mdzVar), (h540) null, (vno1) null, (c380) null, (boo1) null, false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67108726));
    }
}
