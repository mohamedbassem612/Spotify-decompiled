package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qvs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qvs(fws fwsVar, byte b) {
        super(1);
        this.a = b;
        this.b = fwsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fws fwsVar = this.b;
        switch (b) {
            case 0:
                fwsVar.e.invoke(((Boolean) obj).booleanValue() ? fzf1.i : fzf1.t);
                break;
            default:
                fwsVar.e.invoke((fzf1) obj);
                break;
        }
        return rih1Var;
    }
}
