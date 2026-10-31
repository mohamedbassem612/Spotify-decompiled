package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nc81 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc81(int i, int i2, String str, iu30 iu30Var, boolean z) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = iu30Var;
        this.d = i;
        this.e = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.e | 1);
        j7p1.p(this.d, iP, this.a, (b0k) obj, this.c, this.b);
        return rih1.a;
    }
}
