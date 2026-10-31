package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j43 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ lz20 c;
    public final /* synthetic */ k6a1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j43(boolean z, lz20 lz20Var, k6a1 k6a1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = lz20Var;
        this.d = k6a1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new j43(this.c, this.d, lnmVar);
            default:
                return new j43(this.b, this.c, this.d, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b6t b6tVar = this.d;
        lz20 lz20Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB = ds50.b(this);
                    d9n d9nVar = d9n.a;
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                lz20.b(lz20Var);
                if (b6tVar == null) {
                    return rih1Var;
                }
                b6tVar.b();
                return rih1Var;
            default:
                hm5.M(obj);
                if (this.b) {
                    lz20.b(lz20Var);
                    if (b6tVar != null) {
                        b6tVar.b();
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j43(lz20 lz20Var, k6a1 k6a1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = lz20Var;
        this.d = k6a1Var;
    }
}
