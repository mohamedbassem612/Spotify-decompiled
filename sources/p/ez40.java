package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ez40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ qim0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez40(int i, String str, String str2, String str3, boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = iu30Var;
        this.i = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.b | 1);
                op71.d(this.c, this.d, this.f, this.e, this.g, this.h, this.i, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.i;
                int iP2 = czo1.p(1);
                l0p1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, qim0Var, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez40(String str, String str2, boolean z, String str3, boolean z2, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.c = str;
        this.d = str2;
        this.f = z;
        this.e = str3;
        this.g = z2;
        this.h = iu30Var;
        this.i = qim0Var;
        this.b = i;
    }
}
