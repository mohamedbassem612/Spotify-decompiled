package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x5a1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ usb1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nsq d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5a1(usb1 usb1Var, boolean z, nsq nsqVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = usb1Var;
        this.c = z;
        this.d = nsqVar;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                e130.l(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                b3o1.n(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
