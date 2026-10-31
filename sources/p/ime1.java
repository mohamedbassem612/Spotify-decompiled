package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ime1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ime1(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ime1(1, lnmVar, (byte) 0);
            default:
                return new ime1(1, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                return z6x.a;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                return z6x.a;
            default:
                hm5.M(obj);
                return rih1.a;
        }
    }
}
