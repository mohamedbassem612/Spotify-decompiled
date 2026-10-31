package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mxl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jno c;
    public final /* synthetic */ qpe1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ short i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mxl(String str, jno jnoVar, qpe1 qpe1Var, int i, long j, qim0 qim0Var, iu30 iu30Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = jnoVar;
        this.d = qpe1Var;
        this.e = i;
        this.f = j;
        this.g = qim0Var;
        this.h = iu30Var;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.i;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                pxl.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                pxl.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
