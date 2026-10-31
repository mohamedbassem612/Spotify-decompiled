package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class trs extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mxr c;
    public final /* synthetic */ wea1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ trs(mxr mxrVar, wea1 wea1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mxrVar;
        this.d = wea1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        wea1 wea1Var = this.d;
        mxr mxrVar = this.c;
        switch (b) {
            case 0:
                return new trs(mxrVar, wea1Var, lnmVar, (byte) 0);
            default:
                return new trs(mxrVar, wea1Var, lnmVar, (byte) 1);
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
        Object objH;
        byte b = this.a;
        wea1 wea1Var = this.d;
        mxr mxrVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objW = mxrVar.w(wea1Var, this);
                    return objW == d9nVar ? d9nVar : objW;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    n381 n381Var = (n381) mxrVar.a;
                    if (wea1Var instanceof vea1) {
                        objH = n381Var.i(((vea1) wea1Var).a, this);
                    } else if (wea1Var instanceof tea1) {
                        objH = n381Var.g(((tea1) wea1Var).a, this);
                    } else if (wea1Var instanceof uea1) {
                        uea1 uea1Var = (uea1) wea1Var;
                        objH = n381Var.h(uea1Var.a, uea1Var.b, this);
                    } else {
                        eg.o();
                    }
                    Object obj2 = objH;
                    return obj2 == d9nVar ? d9nVar : obj2;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
