package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class af3 extends hab0 implements zu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bf3 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af3(boolean z, bf3 bf3Var, boolean z2) {
        super(4);
        this.a = z;
        this.b = bf3Var;
        this.c = z2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        Long lN;
        mq70 mq70Var;
        up70 up70VarA;
        jo70 jo70Var = (jo70) obj;
        xkk1 xkk1Var = (xkk1) obj2;
        zoy0 zoy0Var = (zoy0) obj3;
        bql bqlVar = (bql) obj4;
        yqg yqgVar = this.b.a;
        if (jo70Var == null || (this.a && zoy0Var == null)) {
            return r6g1.a;
        }
        boolean zJ = u890.j(bqlVar != null ? bqlVar.a : null, kql.a);
        String str2 = jo70Var.a;
        Long lP = zoy0Var != null ? t890.p(zoy0Var, yqgVar) : null;
        String str3 = jo70Var.b;
        if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null || (str = up70VarA.a.a) == null) {
            str = "";
        }
        return new q6g1((xn70) null, new bv11(str2, (String) null, lP, (Long) null, (u380) null, 0, false, (c380) null, (h540) null, (vno1) null, (c380) null, new sz6(str), false, str3, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (!this.c || !zJ || zoy0Var == null || (lN = t890.n(zoy0Var, yqgVar)) == null) ? null : new msv0(lN.longValue()), (ati1) null, (c380) null, (String) null, (ktl) null, 66050042));
    }
}
