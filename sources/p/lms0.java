package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lms0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yup0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lms0(yup0 yup0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yup0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yup0 yup0Var = this.b;
        switch (b) {
            case 0:
                l6s l6sVar = (l6s) yup0Var.c;
                return rqt0.u(new x010(((c9c0) l6sVar.a).b.current(), d5p1.h(((vu60) l6sVar.b).e), new qr0(l6sVar, null, (byte) 13), (byte) 1));
            default:
                ((qtr) obj).b(new pnp0(yup0Var, null, (byte) 6));
                return rih1.a;
        }
    }
}
