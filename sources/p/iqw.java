package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iqw extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iqw(kqw kqwVar, byte b) {
        super(1);
        this.a = b;
        this.b = kqwVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kqw kqwVar = this.b;
        switch (b) {
            case 0:
                kqwVar.b.add((iu30) obj);
                break;
            default:
                kqwVar.c.add((iu30) obj);
                break;
        }
        return rih1Var;
    }
}
