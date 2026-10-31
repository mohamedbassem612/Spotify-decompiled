package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h041 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ l041 c;
    public final /* synthetic */ xz31 d;
    public final /* synthetic */ voe1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h041(l041 l041Var, xz31 xz31Var, voe1 voe1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = l041Var;
        this.d = xz31Var;
        this.e = voe1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new h041(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new h041(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        voe1 voe1Var = this.e;
        xz31 xz31Var = this.d;
        l041 l041Var = this.c;
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
                this.b = true;
                vp70 vp70Var = l041.h;
                Object objH = l041Var.h(xz31Var, voe1Var, this);
                return objH == d9nVar ? d9nVar : objH;
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
                this.b = true;
                vp70 vp70Var2 = l041.h;
                Object objH2 = l041Var.h(xz31Var, voe1Var, this);
                return objH2 == d9nVar ? d9nVar : objH2;
        }
    }
}
