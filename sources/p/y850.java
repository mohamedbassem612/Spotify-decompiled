package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y850 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sp00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y850(sp00 sp00Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = sp00Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        sp00 sp00Var = this.b;
        switch (b) {
            case 0:
                return new y850(sp00Var, lnmVar, (byte) 0);
            default:
                return new y850(sp00Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sp00 sp00Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((i8h1) ((idd1) sp00Var.e).getValue()).f(((wqk0) sp00Var.c).e(), (Set) null);
                break;
            default:
                hm5.M(obj);
                ((i8h1) ((idd1) sp00Var.e).getValue()).f(((wqk0) sp00Var.d).e(), (Set) null);
                break;
        }
        return rih1Var;
    }
}
