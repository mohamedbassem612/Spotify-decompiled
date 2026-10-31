package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gb60 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ fb60 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ ajc0 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gb60(String str, long j, fb60 fb60Var, qim0 qim0Var, ajc0 ajc0Var, int i, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = j;
        this.c = fb60Var;
        this.d = qim0Var;
        this.e = ajc0Var;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hb60.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
