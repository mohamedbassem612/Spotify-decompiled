package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yhk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ qnv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yhk(Object obj, lnm lnmVar, qnv0 qnv0Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = qnv0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qnv0 qnv0Var = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                yhk yhkVar = new yhk(obj2, lnmVar, qnv0Var, (byte) 0);
                yhkVar.c = obj;
                return yhkVar;
            default:
                yhk yhkVar2 = new yhk(obj2, lnmVar, qnv0Var, (byte) 1);
                yhkVar2.c = obj;
                return yhkVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        qnv0 qnv0Var = this.e;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    dgk dgkVar = (dgk) obj2;
                    this.c = null;
                    this.b = true;
                    Object objI = jik.i(qnv0Var, dgkVar.e, dgkVar.f, true, this);
                    if (objI != d9nVar) {
                        objI = rih1Var;
                    }
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    fgk fgkVar = (fgk) obj2;
                    this.c = null;
                    this.b = true;
                    Object objI2 = jik.i(qnv0Var, fgkVar.e, fgkVar.f, false, this);
                    if (objI2 != d9nVar) {
                        objI2 = rih1Var;
                    }
                    if (objI2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
