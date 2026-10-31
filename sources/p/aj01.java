package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aj01 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hj01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj01(hj01 hj01Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = hj01Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hj01 hj01Var = this.c;
        switch (b) {
            case 0:
                return new aj01(hj01Var, lnmVar, (byte) 0);
            default:
                return new aj01(hj01Var, lnmVar, (byte) 1);
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
        hj01 hj01Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    hj01Var.f(this);
                    return d9nVar;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1.a;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    dt71 dt71Var = hj01Var.e;
                    this.b = true;
                    obj = b5p1.i(dt71Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new e331(obj);
        }
    }
}
