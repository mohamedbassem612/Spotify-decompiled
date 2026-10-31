package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iex extends hab0 implements vu30 {
    public final /* synthetic */ short N0;
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ gbx a;
    public final /* synthetic */ qex b;
    public final /* synthetic */ lex c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ idn0 h;
    public final /* synthetic */ ga80 i;
    public final /* synthetic */ vzq0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iex(gbx gbxVar, qex qexVar, lex lexVar, qim0 qim0Var, String str, vu30 vu30Var, vu30 vu30Var2, idn0 idn0Var, ga80 ga80Var, vzq0 vzq0Var, vu30 vu30Var3, int i, int i2, int i3) {
        super(2);
        this.a = gbxVar;
        this.b = qexVar;
        this.c = lexVar;
        this.d = qim0Var;
        this.e = str;
        this.f = vu30Var;
        this.g = vu30Var2;
        this.h = idn0Var;
        this.i = ga80Var;
        this.t = vzq0Var;
        this.X = vu30Var3;
        this.Y = i;
        this.Z = i2;
        this.N0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        short s = this.N0;
        poo1.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
