package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yr2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wjn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr2(wjn wjnVar, byte b) {
        super(1);
        this.a = b;
        this.b = wjnVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wjn wjnVar = this.b;
        switch (b) {
            case 0:
                wjnVar.r((String) obj);
                break;
            case 1:
                wjnVar.v((String) obj);
                break;
            default:
                wjnVar.x((String) obj);
                break;
        }
        return rih1Var;
    }
}
