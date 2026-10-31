package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gzy0 extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ izy0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ dzy0 g;
    public final /* synthetic */ fzy0 h;
    public final /* synthetic */ jzy0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gzy0(String str, qim0 qim0Var, long j, long j2, izy0 izy0Var, String str2, dzy0 dzy0Var, fzy0 fzy0Var, jzy0 jzy0Var, int i, int i2) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = j;
        this.d = j2;
        this.e = izy0Var;
        this.f = str2;
        this.g = dzy0Var;
        this.h = fzy0Var;
        this.i = jzy0Var;
        this.t = i;
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.t | 1);
        short s = this.X;
        zgo1.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP, s);
        return rih1.a;
    }
}
