package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iue1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iue1(boolean z, o95 o95Var, float f, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = o95Var;
        this.e = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new iue1(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new iue1(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        float f = this.e;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var = this.d;
                if (z) {
                    Float f2 = new Float(f);
                    n8b1 n8b1VarL0 = irn1.l0(0.5f, 400.0f, (Object) null, 4);
                    this.b = (byte) 1;
                    if (o95.b(o95Var, f2, n8b1VarL0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f3 = new Float(f);
                    this.b = (byte) 2;
                    if (o95Var.g(f3, this) != d9nVar) {
                        return rih1Var;
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
                o95 o95Var2 = this.d;
                if (z) {
                    Float f4 = new Float(f);
                    n8b1 n8b1VarL1 = irn1.l0(0.5f, 400.0f, (Object) null, 4);
                    this.b = (byte) 1;
                    if (o95.b(o95Var2, f4, n8b1VarL1, (Float) null, (iu30) null, this, 12) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f5 = new Float(f);
                    this.b = (byte) 2;
                    if (o95Var2.g(f5, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }
}
