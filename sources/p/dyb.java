package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dyb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ vy71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyb(vy71 vy71Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vy71Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new dyb(this.c, lnmVar, (byte) 0);
            default:
                return new dyb(this.c, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        vy71 vy71Var = this.c;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (vy71Var.c) {
                    this.b = (byte) 2;
                    if (vy71Var.j(this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    this.b = (byte) 1;
                    if (vy71Var.h(this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    m441 m441VarQ = rwq.q(new bk01(vy71Var, (byte) 0));
                    ck01 ck01Var = new ck01(2, (lnm) null, (byte) 0);
                    this.b = (byte) 1;
                    if (b5p1.j(m441VarQ, ck01Var, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (vy71Var.b(this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
