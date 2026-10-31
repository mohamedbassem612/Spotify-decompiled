package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kim0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g4r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kim0(g4r g4rVar, byte b) {
        super(1);
        this.a = b;
        this.b = g4rVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g4r g4rVar = this.b;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                for (mmr0 mmr0Var : g4rVar.a) {
                    qv00Var.a((String) mmr0Var.a, (Class) mmr0Var.b, false);
                }
                break;
            default:
                qv00 qv00Var2 = (qv00) obj;
                for (mmr0 mmr0Var2 : g4rVar.a) {
                    qv00Var2.a((String) mmr0Var2.a, (Class) mmr0Var2.b, false);
                }
                break;
        }
        return rih1Var;
    }
}
