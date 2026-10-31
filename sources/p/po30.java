package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class po30 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ p410 c;
    public final /* synthetic */ j8x0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po30(p410 p410Var, j8x0 j8x0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = p410Var;
        this.d = j8x0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        j8x0 j8x0Var = this.d;
        p410 p410Var = this.c;
        switch (b) {
            case 0:
                return new po30(p410Var, j8x0Var, lnmVar, (byte) 0);
            case 1:
                return new po30(p410Var, j8x0Var, lnmVar, (byte) 1);
            default:
                return new po30(p410Var, j8x0Var, lnmVar, (byte) 2);
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
        j8x0 j8x0Var = this.d;
        p410 p410Var = this.c;
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
                j0a1 j0a1Var = (j0a1) p410Var.e;
                String str = (String) p410Var.c;
                String str2 = j8x0Var.c;
                this.b = true;
                Object objX = j0a1Var.d().x(str, str2, 50, this);
                return objX == d9nVar ? d9nVar : objX;
            case 1:
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
                j0a1 j0a1Var2 = (j0a1) p410Var.e;
                String str3 = (String) p410Var.c;
                String str4 = j8x0Var.c;
                this.b = true;
                Object objF = j0a1Var2.d().f(str3, str4, 50, this);
                return objF == d9nVar ? d9nVar : objF;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j0a1 j0a1Var3 = (j0a1) p410Var.e;
                String str5 = (String) p410Var.c;
                String str6 = j8x0Var.c;
                this.b = true;
                Object objJ = j0a1Var3.d().j(str5, str6, 50, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
