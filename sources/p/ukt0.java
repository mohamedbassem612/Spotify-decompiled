package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ukt0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zkt0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ ksl d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ukt0(zkt0 zkt0Var, qim0 qim0Var, ksl kslVar, long j, boolean z, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = zkt0Var;
        this.c = qim0Var;
        this.d = kslVar;
        this.e = j;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.h;
                wkt0.a(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.h;
                wkt0.a(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
