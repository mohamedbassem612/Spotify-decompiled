package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lw10 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ j5c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw10(j5c j5cVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j5cVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new lw10(this.c, lnmVar, (byte) 0);
            default:
                return new lw10(this.c, lnmVar, (byte) 1);
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
        j5c j5cVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    if (hap1.i(400L, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (j5cVar.a((n511) null, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    if (hap1.i(300L, this) != d9nVar) {
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
                if (j5cVar.a((n511) null, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
