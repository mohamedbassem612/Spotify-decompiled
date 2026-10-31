package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zq60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zq60(c380 c380Var, vu30 vu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = c380Var;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        c380 c380Var = this.b;
        switch (b) {
            case 0:
                ((rtb0) obj).e(c380Var.size(), new da(new k7f((byte) 17, vu30Var, false), c380Var, (byte) 25), new xg50(c380Var, (byte) 9), new j2i(2039820996, new sf1(c380Var, (byte) 2), true));
                break;
            default:
                b261.l((e261) obj, new f4h(0, c380Var.size() + (vu30Var == null ? 0 : 1)));
                break;
        }
        return rih1Var;
    }
}
