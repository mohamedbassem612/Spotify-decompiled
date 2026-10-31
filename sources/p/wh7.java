package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wh7 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xh7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh7(xh7 xh7Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xh7Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xh7 xh7Var = this.c;
        switch (b) {
            case 0:
                return new wh7(xh7Var, lnmVar, (byte) 0);
            default:
                return new wh7(xh7Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        xh7 xh7Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var = (xe01) xh7Var.c.c;
                vi viVar = new vi(xh7Var, (byte) 2);
                this.b = true;
                if (xe01Var.a.collect(viVar, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
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
                xe01 xe01Var2 = xh7Var.b;
                nw5 nw5Var = new nw5(2, (lnm) null, (byte) 1);
                this.b = true;
                Object objJ = b5p1.j(xe01Var2, nw5Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
