package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qql implements w6g1 {
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;

    public qql(vu30 vu30Var, boolean z, boolean z2, boolean z3, long j) {
        this.a = vu30Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
    }

    public final Object a(String str, String str2, ioj0 ioj0Var) {
        goj0 goj0VarA;
        hll hllVar;
        goj0 goj0VarA2;
        sz6 sz6Var;
        goj0 goj0VarA3;
        a7q0 a7q0Var;
        goj0 goj0VarA4;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        hoj0 hoj0VarC2 = ioj0Var.c(xkk1.class, str);
        hoj0 hoj0VarC3 = ioj0Var.c(hll.class, str);
        hoj0 hoj0VarC4 = ioj0Var.c(a7q0.class, str);
        String str3 = (String) this.a.invoke(ioj0Var, str2);
        if (hoj0VarC3 == null || (goj0VarA = hoj0VarC3.a()) == null || (hllVar = (hll) goj0VarA.a) == null || hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null) {
            return r6g1.a;
        }
        goj0 goj0VarA5 = goj0VarA2.a();
        Long lValueOf = null;
        xn70 xn70Var = goj0VarA5 != null ? new xn70(o7h.y0(((jo70) goj0VarA5.a).d, (CharSequence) null, (String) null, (String) null, vll.Q0, 31), str3, 4, (String) null) : null;
        String str4 = ((jo70) goj0VarA2.a).a;
        if (this.c) {
            sz6Var = new sz6((hoj0VarC2 == null || (goj0VarA4 = hoj0VarC2.a()) == null || (xkk1Var = (xkk1) goj0VarA4.a) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null) ? null : up70VarA.a.a);
        } else {
            sz6Var = q17.c;
        }
        sz6 sz6Var2 = sz6Var;
        c380 c380VarA = mqo1.A(hllVar.b);
        boolean z = this.b && hllVar.d.contains(fll.c);
        if (this.d && hoj0VarC4 != null && (goj0VarA3 = hoj0VarC4.a()) != null && (a7q0Var = (a7q0) goj0VarA3.a) != null) {
            lValueOf = Long.valueOf(a7q0Var.c);
        }
        return new q6g1(xn70Var, new bv11(str4, (String) null, (Long) null, (Long) null, (u380) null, 0, false, c380VarA, (h540) null, (vno1) null, (c380) null, sz6Var2, z, (String) null, lValueOf, this.e, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67053438));
    }
}
