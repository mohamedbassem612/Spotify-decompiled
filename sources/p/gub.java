package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gub extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ o95 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gub(boolean z, o95 o95Var, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.e = o95Var;
        this.d = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new gub(this.c, this.e, this.d, lnmVar);
            default:
                return new gub(this.c, this.d, this.e, lnmVar);
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
        o95 o95Var = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2 || b2 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (z2) {
                    Float f = new Float(1.0f);
                    this.b = (byte) 1;
                    if (o95Var.g(f, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (((Number) o95Var.e()).floatValue() <= 0.0f) {
                        return rih1Var;
                    }
                    o95 o95Var2 = this.e;
                    if (z) {
                        Float f2 = new Float(0.0f);
                        this.b = (byte) 2;
                        if (o95Var2.g(f2, this) != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        Float f3 = new Float(0.0f);
                        pxg1 pxg1VarO0 = irn1.o0(200, 0, kub.e, 2);
                        this.b = (byte) 3;
                        if (o95.b(o95Var2, f3, pxg1VarO0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                            return rih1Var;
                        }
                    }
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1 || b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (z2 || !z) {
                    Float f4 = new Float(1.0f);
                    this.b = (byte) 1;
                    if (o95Var.g(f4, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f5 = new Float(0.0f);
                    pxg1 pxg1Var = new pxg1(150, 50, h4g.c);
                    this.b = (byte) 2;
                    if (o95.b(this.e, f5, pxg1Var, (Float) null, (iu30) null, this, 12) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gub(boolean z, boolean z2, o95 o95Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = z2;
        this.e = o95Var;
    }
}
