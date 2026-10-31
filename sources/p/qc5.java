package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qc5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Float c;
    public final /* synthetic */ o95 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc5(Float f, o95 o95Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = f;
        this.d = o95Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new qc5(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new qc5(this.c, this.d, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        o95 o95Var = this.d;
        Float f = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (f == null) {
                    return rih1Var;
                }
                this.b = true;
                return o95Var.g(f, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (f == null) {
                    return rih1Var;
                }
                this.b = true;
                return o95Var.g(f, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
