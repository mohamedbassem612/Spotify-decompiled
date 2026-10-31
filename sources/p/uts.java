package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uts extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ h98 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uts(byte b, h98 h98Var, iu30 iu30Var) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = h98Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h98 h98Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new bod1((hod1) ((eod1) h98Var.d).a.get(((dhd1) obj).b)));
                break;
            case 1:
                iu30Var.invoke(new cod1((hod1) ((eod1) h98Var.d).a.get(((dhd1) obj).b)));
                break;
            default:
                iu30Var.invoke(new aod1((hod1) ((eod1) h98Var.d).a.get(((dhd1) obj).b)));
                break;
        }
        return rih1Var;
    }
}
