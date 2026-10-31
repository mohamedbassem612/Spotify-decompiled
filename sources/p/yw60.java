package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yw60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw60(cm0 cm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cm0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                return new x010(new ipr(d5p1.h(((vu60) cm0Var.c).e), cm0Var, (vw60) obj, (byte) 22), (mr20) cm0Var.t, new mnl(3, (lnm) null, (byte) 28), (byte) 1);
            default:
                return cm0Var.m((os60) d5p1.h(((vu60) cm0Var.c).e).a.getValue(), ((vw60) obj).a);
        }
    }
}
