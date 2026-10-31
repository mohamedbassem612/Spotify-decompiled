package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b4h1 extends hab0 implements zu30 {
    public final /* synthetic */ v3h1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ utl c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4h1(v3h1 v3h1Var, int i, utl utlVar, int i2) {
        super(4);
        this.a = v3h1Var;
        this.b = i;
        this.c = utlVar;
        this.d = i2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            int i = this.b + iIntValue;
            w0o1.a(this.a, i, this.c.a.get(i), this.d, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
