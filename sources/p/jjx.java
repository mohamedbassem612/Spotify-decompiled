package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jjx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jjx(String str, qim0 qim0Var, long j, long j2, lee1 lee1Var, boolean z, int i, int i2) {
        super(2);
        this.h = str;
        this.b = qim0Var;
        this.c = j;
        this.d = j2;
        this.i = lee1Var;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                w0h1.a((hux) obj4, (ksl) obj3, this.b, this.c, this.d, this.e, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                qim0 qim0Var = this.b;
                long j = this.c;
                long j2 = this.d;
                vbe.s((String) obj4, qim0Var, j, j2, (lee1) obj3, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jjx(hux huxVar, ksl kslVar, qim0 qim0Var, long j, long j2, boolean z, int i, int i2) {
        super(2);
        this.h = huxVar;
        this.i = kslVar;
        this.b = qim0Var;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i;
        this.g = i2;
    }
}
