package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class krg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ jl1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ krg1(jl1 jl1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = jl1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        jl1 jl1Var = this.c;
        switch (b) {
            case 0:
                return new krg1(jl1Var, lnmVar, (byte) 0);
            default:
                return new krg1(jl1Var, lnmVar, (byte) 1);
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
        jl1 jl1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    k6g1 k6g1Var = new k6g1(jl1Var, (lnm) null, (byte) 4);
                    this.b = true;
                    obj = rc2.O(2000L, k6g1Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
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
                ezc ezcVar = ((ov20) jl1Var.b).a;
                this.b = true;
                Object objI = b5p1.i(ezcVar, this);
                return objI == d9nVar ? d9nVar : objI;
        }
    }
}
