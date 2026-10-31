package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pc5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ lee1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Float g;
    public final /* synthetic */ short h;
    public final /* synthetic */ dlv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pc5(int i, String str, long j, lee1 lee1Var, float f, Float f2, int i2, dlv dlvVar, int i3) {
        super(2);
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = lee1Var;
        this.f = f;
        this.g = f2;
        this.h = i2;
        this.i = dlvVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Float f = this.g;
                int iP = czo1.p(1);
                wqn1.d(this.f, this.b, this.h, iP, this.d, f, this.c, (b0k) obj, this.i, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                dlv dlvVar = this.i;
                int iP2 = czo1.p(1);
                t0c.e(this.f, this.b, this.h, iP2, this.d, this.g, this.c, (b0k) obj, dlvVar, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pc5(int i, String str, long j, lee1 lee1Var, dlv dlvVar, float f, int i2, Float f2, int i3) {
        super(2);
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = lee1Var;
        this.i = dlvVar;
        this.f = f;
        this.h = i2;
        this.g = f2;
    }
}
