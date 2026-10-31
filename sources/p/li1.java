package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class li1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li1(c380 c380Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 5;
        this.b = c380Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        c380 c380Var = this.b;
        switch (b) {
            case 0:
                ((rtb0) obj).e(c380Var.size(), new qf1(c380Var, (byte) 2), new qf1(c380Var, (byte) 3), new j2i(2039820996, new ki1(c380Var, iu30Var, (byte) 0), true));
                break;
            case 1:
                ((rtb0) obj).e(c380Var.size(), new kwd(c380Var, (byte) 2), new kwd(c380Var, (byte) 3), new j2i(802480018, new ki1(c380Var, iu30Var, (byte) 2), true));
                break;
            case 2:
                h5f h5fVar = (h5f) obj;
                if (c380Var.contains(h5fVar)) {
                    iu30Var.invoke(new ydf(h5fVar));
                }
                break;
            case 3:
                ((rtb0) obj).e(c380Var.size(), new f1m(c380Var, (byte) 6), new f1m(c380Var, (byte) 7), new j2i(2039820996, new ki1(c380Var, iu30Var, (byte) 3), true));
                break;
            case 4:
                ((rtb0) obj).e(c380Var.size(), (iu30) null, new xg50(c380Var, (byte) 14), new j2i(2039820996, new ki1(c380Var, iu30Var, (byte) 6), true));
                break;
            case 5:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.b(rtb0Var, c380Var.size(), (iu30) null, new j2i(1820376762, new juy0(c380Var, iu30Var), true), 6);
                rtb0.c(rtb0Var, (Object) null, new j2i(-316334749, new ict0(iu30Var), true), 3);
                break;
            case 6:
                ((rtb0) obj).e(c380Var.size(), (iu30) null, new iio0(c380Var, (byte) 17), new j2i(802480018, new ki1(c380Var, iu30Var, (byte) 7), true));
                break;
            default:
                ((pub0) obj).P(c380Var.size(), (iu30) null, new rw11(c380Var, (byte) 23), (gv20) null, new j2i(-334987442, new ki1(c380Var, iu30Var, (byte) 8), true));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li1(byte b, iu30 iu30Var, c380 c380Var) {
        super(1);
        this.a = b;
        this.b = c380Var;
        this.c = iu30Var;
    }
}
