package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lpg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ npg1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpg1(npg1 npg1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = npg1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        npg1 npg1Var = this.d;
        switch (b) {
            case 0:
                lpg1 lpg1Var = new lpg1(npg1Var, lnmVar, (byte) 0);
                lpg1Var.c = obj;
                return lpg1Var;
            default:
                lpg1 lpg1Var2 = new lpg1(npg1Var, lnmVar, (byte) 1);
                lpg1Var2.c = obj;
                return lpg1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bst bstVar = (bst) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(bstVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        npg1 npg1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                bst bstVar = (bst) this.c;
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
                this.c = null;
                this.b = true;
                Object objY = fn31.Y(npg1Var.i, new k6g1(npg1Var, bstVar, (lnm) null, (byte) 3), this);
                return objY == d9nVar ? d9nVar : objY;
            default:
                bst bstVar2 = (bst) this.c;
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
                this.c = null;
                this.b = true;
                Object objY2 = fn31.Y(npg1Var.i, new k6g1(npg1Var, bstVar2, (lnm) null, (byte) 3), this);
                return objY2 == d9nVar ? d9nVar : objY2;
        }
    }
}
