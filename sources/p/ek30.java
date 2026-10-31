package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ek30 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ek30(String str, boolean z, long j, boolean z2, int i, int i2) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gk30.b(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}
