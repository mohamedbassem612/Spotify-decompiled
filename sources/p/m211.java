package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m211 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cr6 c;
    public final /* synthetic */ w111 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m211(cr6 cr6Var, w111 w111Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cr6Var;
        this.d = w111Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        w111 w111Var = this.d;
        cr6 cr6Var = this.c;
        switch (b) {
            case 0:
                return new m211(cr6Var, w111Var, lnmVar, (byte) 0);
            default:
                return new m211(cr6Var, w111Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        w111 w111Var = this.d;
        cr6 cr6Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pp31 pp31Var = (op31) cr6Var.g;
                String str = w111Var.a;
                this.b = true;
                Object objG = pp31Var.g(str, this);
                return objG == d9nVar ? d9nVar : objG;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pp31 pp31Var2 = (op31) cr6Var.g;
                String str2 = w111Var.a;
                this.b = true;
                Object objC = pp31Var2.c(str2, this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }
}
