package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class glz0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ o95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glz0(o95 o95Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new glz0(this.c, lnmVar, (byte) 0);
            default:
                return new glz0(this.c, lnmVar, (byte) 1);
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
        o95 o95Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    Float f = new Float(0.0f);
                    this.b = (byte) 1;
                    if (o95Var.g(f, this) != d9nVar) {
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
                Float f2 = new Float(360.0f);
                pxg1 pxg1VarO0 = irn1.o0(1000, 0, mlv.d, 2);
                this.b = (byte) 2;
                if (o95.b(this.c, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    Float f3 = new Float(1.15f);
                    this.b = (byte) 1;
                    if (o95Var.g(f3, this) != d9nVar) {
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
                Float f4 = new Float(1.0f);
                pxg1 pxg1VarO1 = irn1.o0(300, 0, h4g.b, 2);
                this.b = (byte) 2;
                if (o95.b(this.c, f4, pxg1VarO1, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
