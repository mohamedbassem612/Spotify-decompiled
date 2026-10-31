package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uv60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv60(xv60 xv60Var, byte b) {
        super(1);
        this.a = b;
        this.b = xv60Var;
    }

    public final Object invoke(Object obj) {
        ms60 ms60Var;
        byte b = this.a;
        xv60 xv60Var = this.b;
        switch (b) {
            case 0:
                qv60 qv60Var = (qv60) obj;
                os60 os60Var = (os60) d5p1.h(xv60Var.a.e).a.getValue();
                if (os60Var == null || (ms60Var = os60Var.b) == null) {
                    ms60Var = is60.a;
                }
                return sto1.n(ms60Var, qv60Var, xv60Var.t);
            default:
                ((qtr) obj).b(new k1(xv60Var, (lnm) null, (byte) 13));
                return rih1.a;
        }
    }
}
