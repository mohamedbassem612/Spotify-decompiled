package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pvg0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvg0(o95 o95Var, float f, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new pvg0(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new pvg0(this.c, this.d, lnmVar, (byte) 1);
            case 2:
                return new pvg0(this.c, this.d, lnmVar, (byte) 2);
            default:
                return new pvg0(this.c, this.d, lnmVar, (byte) 3);
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
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        o95 o95Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    Float f2 = new Float(f);
                    this.b = (byte) 1;
                    if (o95Var.g(f2, this) != d9nVar) {
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
                Float f3 = new Float(0.0f);
                n8b1 n8b1VarL0 = irn1.l0(0.6f, 0.0f, (Object) null, 6);
                this.b = (byte) 2;
                if (o95.b(this.c, f3, n8b1VarL0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    Float f4 = new Float(f);
                    this.b = (byte) 1;
                    if (o95Var.g(f4, this) != d9nVar) {
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
                Float f5 = new Float(0.0f);
                n8b1 n8b1VarL1 = irn1.l0(0.6f, 0.0f, (Object) null, 6);
                this.b = (byte) 2;
                if (o95.b(this.c, f5, n8b1VarL1, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 2:
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    Float f6 = new Float(f);
                    this.b = (byte) 1;
                    if (o95Var.g(f6, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f7 = new Float(0.0f);
                n8b1 n8b1VarL2 = irn1.l0(0.6f, 0.0f, (Object) null, 6);
                this.b = (byte) 2;
                if (o95.b(this.c, f7, n8b1VarL2, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    Float f8 = new Float(f);
                    this.b = (byte) 1;
                    if (o95Var.g(f8, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f9 = new Float(0.0f);
                n8b1 n8b1VarL3 = irn1.l0(0.6f, 0.0f, (Object) null, 6);
                this.b = (byte) 2;
                if (o95.b(this.c, f9, n8b1VarL3, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
