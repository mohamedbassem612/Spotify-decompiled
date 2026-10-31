package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zwc extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwc(String str, String str2, long j, qim0 qim0Var, long j2, float f, int i) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = qim0Var;
        this.e = j2;
        this.f = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ton1.b(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
        return rih1.a;
    }
}
