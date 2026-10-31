package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dy5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy5(ssw0 ssw0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ssw0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ssw0 ssw0Var = this.b;
        switch (b) {
            case 0:
                ssw0Var.l((Object) null);
                break;
            case 1:
                ssw0Var.l((tr80) obj);
                break;
            default:
                ssw0Var.H((Throwable) null);
                break;
        }
        return rih1Var;
    }
}
