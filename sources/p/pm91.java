package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pm91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qm91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm91(qm91 qm91Var, byte b) {
        super(1);
        this.a = b;
        this.b = qm91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qm91 qm91Var = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new f3(qm91Var, (lnm) null, (byte) 26));
                return rih1.a;
            default:
                return (qzh) qm91Var.d;
        }
    }
}
