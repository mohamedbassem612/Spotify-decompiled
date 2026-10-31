package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class phe1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qhe1 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ phe1(qhe1 qhe1Var, float f, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qhe1Var;
        this.d = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        float f = this.d;
        qhe1 qhe1Var = this.c;
        switch (b) {
            case 0:
                return new phe1(qhe1Var, f, lnmVar, (byte) 0);
            default:
                return new phe1(qhe1Var, f, lnmVar, (byte) 1);
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
        Object objB;
        Object objB2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fe5 fe5Var = ljo1.b;
        float f = this.d;
        d9n d9nVar = d9n.a;
        qhe1 qhe1Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o95 o95Var = qhe1Var.T0;
                    if (o95Var == null) {
                        return rih1Var;
                    }
                    Float f2 = new Float(f);
                    fe5 fe5Var2 = qhe1Var.R0 ? fe5Var : qhe1Var.Q0;
                    this.b = true;
                    objB = o95.b(o95Var, f2, fe5Var2, (Float) null, (iu30) null, this, 12);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    o95 o95Var2 = qhe1Var.S0;
                    if (o95Var2 == null) {
                        return rih1Var;
                    }
                    Float f3 = new Float(f);
                    fe5 fe5Var3 = qhe1Var.R0 ? fe5Var : qhe1Var.Q0;
                    this.b = true;
                    objB2 = o95.b(o95Var2, f3, fe5Var3, (Float) null, (iu30) null, this, 12);
                    if (objB2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB2 = obj;
                }
                return rih1Var;
        }
    }
}
