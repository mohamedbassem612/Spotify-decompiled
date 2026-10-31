package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class twr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qwr0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ twr0(qwr0 qwr0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = qwr0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        qwr0 qwr0Var = this.b;
        switch (b) {
            case 0:
                qwr0Var.b("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                iu30Var.invoke(new cxa0((String) obj));
                break;
            default:
                qwr0Var.b("https://support.spotify.com/article/managed-accounts/plain/");
                iu30Var.invoke(new cxa0((String) obj));
                break;
        }
        return rih1Var;
    }
}
