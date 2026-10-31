package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd0(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                zc0 zc0Var = (zc0) obj;
                yv31 yv31Var = zc0Var.a;
                yc0 yc0Var = zc0Var.e;
                return yc0Var != null ? new huz(new ad0(yv31Var, yc0Var.c, zc0Var), (byte) 10) : new gk(((oos) ((ynb0) resVar.d).get()).a(new fd0(yv31Var.a)), zc0Var, (byte) 2);
            default:
                ((qtr) obj).b(new lu(resVar, (lnm) null, (byte) 2));
                return rih1.a;
        }
    }
}
