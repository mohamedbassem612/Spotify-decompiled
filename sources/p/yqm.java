package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yqm extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ o95 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqm(o95 o95Var, o95 o95Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = o95Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new yqm(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new yqm(this.c, this.d, lnmVar, (byte) 1);
            default:
                return new yqm(this.c, this.d, lnmVar, (byte) 2);
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
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    Float f = new Float(0.0f);
                    this.b = (byte) 1;
                    if (o95.b(this.c, f, (fe5) null, (Float) null, (iu30) null, this, 14) != d9nVar) {
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
                Float f2 = new Float(0.0f);
                this.b = (byte) 2;
                if (o95.b(this.d, f2, (fe5) null, (Float) null, (iu30) null, this, 14) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    Float f3 = new Float(0.0f);
                    this.b = (byte) 1;
                    if (this.c.g(f3, this) != d9nVar) {
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
                Float f4 = new Float(0.0f);
                this.b = (byte) 2;
                if (this.d.g(f4, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    Float f5 = new Float(0.0f);
                    this.b = (byte) 1;
                    if (o95.b(this.c, f5, (fe5) null, (Float) null, (iu30) null, this, 14) != d9nVar) {
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
                Float f6 = new Float(0.0f);
                this.b = (byte) 2;
                if (o95.b(this.d, f6, (fe5) null, (Float) null, (iu30) null, this, 14) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
