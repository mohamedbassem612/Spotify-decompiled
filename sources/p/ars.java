package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ars extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ers b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ars(ers ersVar, byte b) {
        super(1);
        this.a = b;
        this.b = ersVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ers ersVar = this.b;
        switch (b) {
            case 0:
                qw91 qw91Var = (qw91) obj;
                return yoi1.g(ersVar.d.b(new oi("snooze_recommendation", false, new vas(qw91Var, (byte) 16))).map(new rmr(qw91Var, (byte) 11)));
            default:
                ((qtr) obj).b(new f3(ersVar, (lnm) null, (byte) 11));
                return rih1.a;
        }
    }
}
