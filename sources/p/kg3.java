package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kg3 implements w6g1 {
    public final /* synthetic */ yqg a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ boolean c;

    public kg3(yqg yqgVar, iu30 iu30Var, boolean z) {
        this.a = yqgVar;
        this.b = iu30Var;
        this.c = z;
    }

    public final Object a(String str, String str2, ioj0 ioj0Var) {
        String str3;
        mq70 mq70Var;
        up70 up70VarA;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        bql bqlVar;
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        hoj0 hoj0VarC2 = ioj0Var.c(xkk1.class, str);
        hoj0 hoj0VarC3 = ioj0Var.c(zoy0.class, str);
        hoj0 hoj0VarC4 = ioj0Var.c(bql.class, str);
        boolean zJ = u890.j((hoj0VarC4 == null || (goj0VarA2 = hoj0VarC4.a()) == null || (bqlVar = (bql) goj0VarA2.a) == null) ? null : bqlVar.a, kql.a);
        if ((hoj0VarC != null ? hoj0VarC.a() : null) != null) {
            if ((hoj0VarC3 != null ? hoj0VarC3.a() : null) != null) {
                goj0 goj0VarA3 = hoj0VarC.a();
                goj0VarA3.getClass();
                jo70 jo70Var = (jo70) goj0VarA3.a;
                xkk1 xkk1Var = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null) ? null : (xkk1) goj0VarA.a;
                goj0 goj0VarA4 = hoj0VarC3.a();
                goj0VarA4.getClass();
                zoy0 zoy0Var = (zoy0) goj0VarA4.a;
                boolean zBooleanValue = ((Boolean) this.b.invoke(str)).booleanValue();
                boolean z = this.c && zJ;
                yqg yqgVar = this.a;
                Long lP = t890.p(zoy0Var, yqgVar);
                Long lN = t890.n(zoy0Var, yqgVar);
                String str4 = jo70Var.a;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null || (str3 = up70VarA.a.a) == null) {
                    str3 = "";
                }
                return new q6g1((xn70) null, new bv11(str4, (String) null, lP, (Long) null, (u380) null, 0, false, (c380) null, (h540) null, (vno1) null, (c380) null, new sz6(str3), false, jo70Var.b, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (lP == null || !zBooleanValue) ? null : new po11(lP.longValue()), (z && lN != null && zBooleanValue) ? new msv0(lN.longValue()) : null, (ati1) null, (c380) null, (String) null, (ktl) null, 65525754));
            }
        }
        return ((hoj0VarC == null || !(hoj0VarC instanceof foj0)) && (hoj0VarC3 == null || !(hoj0VarC3 instanceof foj0))) ? r6g1.a : p6g1.a;
    }
}
