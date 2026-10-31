package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qoe1 extends hab0 implements zu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ yy31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoe1(float f, yy31 yy31Var) {
        super(4);
        this.a = f;
        this.b = yy31Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        qim0 qim0VarB = aqb0.b((aqb0) obj, u291.c(h2c.a.a(u291.v(nim0.a, this.a), een.h), 1.0f), (pxg1) null, (ni20) null, 7);
        xy31 xy31Var = this.b.c;
        if (iIntValue % (xy31Var != null ? xy31Var.c : 1) == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1619791515);
            roe1.a(qim0VarB, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1619847067);
            roe1.b(qim0VarB, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }
}
