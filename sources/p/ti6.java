package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ti6 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ lee1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ float f;
    public final /* synthetic */ p3v g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ti6(String str, lee1 lee1Var, long j, qim0 qim0Var, int i, float f, p3v p3vVar, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = lee1Var;
        this.c = j;
        this.d = qim0Var;
        this.e = i;
        this.f = f;
        this.g = p3vVar;
        this.h = i2;
        this.i = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vi6.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}
