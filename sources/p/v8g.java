package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v8g extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fyf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8g(fyf fyfVar, byte b) {
        super(1);
        this.a = b;
        this.b = fyfVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fyf fyfVar = this.b;
        switch (b) {
            case 0:
                if (!(((swf) obj) instanceof pwf)) {
                    fyfVar.g();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    fyfVar.g();
                }
                break;
        }
        return rih1Var;
    }
}
