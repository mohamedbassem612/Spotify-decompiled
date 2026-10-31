package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rdm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ sdm0 c;
    public final /* synthetic */ vt9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rdm0(sdm0 sdm0Var, vt9 vt9Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = sdm0Var;
        this.d = vt9Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vt9 vt9Var = this.d;
        sdm0 sdm0Var = this.c;
        switch (b) {
            case 0:
                return new rdm0(sdm0Var, vt9Var, lnmVar, (byte) 0);
            default:
                return new rdm0(sdm0Var, vt9Var, lnmVar, (byte) 1);
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
        vt9 vt9Var = this.d;
        sdm0 sdm0Var = this.c;
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
                o95 o95Var = sdm0Var.e;
                Float f = new Float(yt9.a.a(vt9Var.c));
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
                o95 o95Var2 = sdm0Var.e;
                Float f2 = new Float(yt9.a.a(vt9Var.c));
                this.b = true;
                return o95Var2.g(f2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
