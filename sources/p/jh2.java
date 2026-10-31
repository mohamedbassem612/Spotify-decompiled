package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jh2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh2(String str, iu30 iu30Var, boolean z, boolean z2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = iu30Var;
        this.d = z;
        this.e = z2;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                j82.d(czo1.p(1), this.b, (b0k) obj, this.c, qim0Var, this.d, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                j82.x(czo1.p(1), this.b, (b0k) obj, this.c, qim0Var2, this.d, this.e);
                break;
        }
        return rih1Var;
    }
}
