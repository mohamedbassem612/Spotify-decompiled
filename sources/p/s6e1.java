package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s6e1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6e1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6e1(x6e1 x6e1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = x6e1Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        x6e1 x6e1Var = this.b;
        switch (b) {
            case 0:
                return new s6e1(x6e1Var, lnmVar, (byte) 0);
            case 1:
                return new s6e1(x6e1Var, lnmVar, (byte) 1);
            case 2:
                return new s6e1(x6e1Var, lnmVar, (byte) 2);
            default:
                return new s6e1(x6e1Var, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x6e1 x6e1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                x6e1Var.A = false;
                break;
            case 1:
                hm5.M(obj);
                x6e1Var.c();
                break;
            case 2:
                hm5.M(obj);
                x6e1Var.a(x6e1Var.A);
                break;
            default:
                hm5.M(obj);
                x6e1Var.o();
                break;
        }
        return rih1Var;
    }
}
