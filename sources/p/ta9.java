package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ta9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ ssw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta9(ssw0 ssw0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ssw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ta9(this.c, lnmVar, (byte) 0);
            case 1:
                return new ta9(this.c, lnmVar, (byte) 1);
            default:
                return new ta9(this.c, lnmVar, (byte) 2);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ssw0 ssw0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    long j = va9.g;
                    this.b = (byte) 1;
                    if (hap1.j(j, this) != d9nVar) {
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
                Boolean bool = Boolean.FALSE;
                this.b = (byte) 2;
                if (ssw0Var.b(bool, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    long j2 = oua.f;
                    this.b = (byte) 1;
                    if (hap1.j(j2, this) != d9nVar) {
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
                Boolean bool2 = Boolean.FALSE;
                this.b = (byte) 2;
                if (ssw0Var.b(bool2, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    ytw0 ytw0Var = jfv.b;
                    long jK0 = fdg1.k0(100, ngv.d);
                    this.b = (byte) 1;
                    if (hap1.j(jK0, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (ssw0Var.b((Object) null, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
