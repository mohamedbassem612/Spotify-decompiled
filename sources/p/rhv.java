package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rhv extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ uhv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhv(uhv uhvVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = uhvVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        uhv uhvVar = this.c;
        switch (b) {
            case 0:
                return new rhv(uhvVar, lnmVar, (byte) 0);
            default:
                return new rhv(uhvVar, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        uhv uhvVar = this.c;
        byte b2 = 1;
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
                y7l y7lVar = uhvVar.j;
                ezc ezcVarG = yoi1.g(y7lVar.b.a());
                qhv qhvVar = new qhv(uhvVar, (byte) 0);
                this.b = true;
                Object objCollect = ezcVarG.collect(new t0l(qhvVar, y7lVar, (byte) 5), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
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
                plu pluVarW = rqt0.w(new pzs(new p3t(yoi1.g(uhvVar.h.d()), (byte) 12), uhvVar, (byte) 14), o6v.c1, rqt0.b);
                qhv qhvVar2 = new qhv(uhvVar, b2);
                this.b = true;
                return pluVarW.collect(qhvVar2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
