package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vmk0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ res c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmk0(res resVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = resVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        res resVar = this.c;
        switch (b) {
            case 0:
                return new vmk0(resVar, lnmVar, (byte) 0);
            default:
                return new vmk0(resVar, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        res resVar = this.c;
        switch (b) {
            case 0:
                ldk0 ldk0Var = (cdk0) resVar.d;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1.a;
                }
                hm5.M(obj);
                this.b = (byte) 1;
                if (ldk0Var.h(this) == d9nVar) {
                    return d9nVar;
                }
                lt20 lt20VarG = ldk0Var.g();
                fca0 fca0Var = new fca0(2, (lnm) null, (byte) 23);
                this.b = (byte) 2;
                if (b5p1.j(lt20VarG, fca0Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
            default:
                ldk0 ldk0Var2 = (cdk0) resVar.d;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    if (ldk0Var2.h(this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20VarG2 = ldk0Var2.g();
                fca0 fca0Var2 = new fca0(2, (lnm) null, (byte) 25);
                this.b = (byte) 2;
                Object objJ = b5p1.j(lt20VarG2, fca0Var2, this);
                if (objJ != d9nVar) {
                    return objJ;
                }
                return d9nVar;
        }
    }
}
