package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j850 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j850(lc20 lc20Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = lc20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        lc20 lc20Var = this.b;
        switch (b) {
            case 0:
                return new j850(lc20Var, lnmVar, (byte) 0);
            default:
                return new j850(lc20Var, lnmVar, (byte) 1);
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
        lc20 lc20Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((i8h1) ((xep) lc20Var.b).get()).f(((wqk0) lc20Var.d).e(), (Set) null);
                break;
            default:
                hm5.M(obj);
                ((i8h1) ((xep) lc20Var.b).get()).f(((wqk0) lc20Var.d).e(), (Set) null);
                break;
        }
        return rih1Var;
    }
}
