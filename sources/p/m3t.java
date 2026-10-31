package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3t extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ayh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3t(ayh ayhVar, byte b) {
        super(1);
        this.a = b;
        this.b = ayhVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ayh ayhVar = this.b;
        switch (b) {
            case 0:
                ayhVar.m0(rih1Var);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ayhVar.m0(bool);
                break;
        }
        return rih1Var;
    }
}
