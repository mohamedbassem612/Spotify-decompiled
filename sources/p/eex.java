package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eex extends hab0 implements vu30 {
    public final /* synthetic */ vzq0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lex c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ vu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eex(vzq0 vzq0Var, String str, lex lexVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3) {
        super(2);
        this.a = vzq0Var;
        this.b = str;
        this.c = lexVar;
        this.d = vu30Var;
        this.e = vu30Var2;
        this.f = vu30Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (x340) b0kVar;
        if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            poo1.t(this.a, this.b, this.c, this.d, this.e, this.f, x340Var);
        } else {
            x340Var.b0();
        }
        return rih1.a;
    }
}
