package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w5a1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ usb1 b;
    public final /* synthetic */ nsq c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5a1(usb1 usb1Var, nsq nsqVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = usb1Var;
        this.c = nsqVar;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        nsq nsqVar = this.c;
        usb1 usb1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                e130.j(usb1Var, nsqVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                e130.k(usb1Var, nsqVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                b3o1.g(usb1Var, nsqVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                b3o1.h(usb1Var, nsqVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
