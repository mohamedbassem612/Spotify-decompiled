package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tu61 extends hab0 implements vu30 {
    public final /* synthetic */ kv61 a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ short g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tu61(kv61 kv61Var, c380 c380Var, qim0 qim0Var, boolean z, String str, vzq0 vzq0Var, int i, int i2) {
        super(2);
        this.a = kv61Var;
        this.b = c380Var;
        this.c = qim0Var;
        this.d = z;
        this.e = str;
        this.f = vzq0Var;
        this.g = i;
        this.h = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.b(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
