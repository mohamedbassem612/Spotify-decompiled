package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class az9 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bkc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az9(bkc0 bkc0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = bkc0Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new az9(this.b, lnmVar, (byte) 0);
            case 1:
                return new az9(this.b, lnmVar, (byte) 1);
            case 2:
                return new az9(this.b, lnmVar, (byte) 2);
            default:
                return new az9(this.b, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                az9 az9VarCreate = create(lnmVar);
                hm5.M(rih1Var);
                return az9VarCreate.b;
            case 1:
                az9 az9VarCreate2 = create(lnmVar);
                hm5.M(rih1Var);
                return az9VarCreate2.b;
            case 2:
                az9 az9VarCreate3 = create(lnmVar);
                hm5.M(rih1Var);
                return az9VarCreate3.b;
            default:
                az9 az9VarCreate4 = create(lnmVar);
                hm5.M(rih1Var);
                return az9VarCreate4.b;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                break;
            case 1:
                hm5.M(obj);
                break;
            case 2:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return this.b;
    }
}
