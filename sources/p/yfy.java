package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yfy extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o95 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfy(byte b, o95 o95Var, lnm lnmVar, boolean z) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = o95Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new yfy((byte) 0, this.d, lnmVar, this.c);
            case 1:
                return new yfy((byte) 1, this.d, lnmVar, this.c);
            default:
                return new yfy((byte) 2, this.d, lnmVar, this.c);
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
        boolean z = this.c;
        d9n d9nVar = d9n.a;
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
                    Float f = new Float(8.0f);
                    this.b = (byte) 1;
                    if (o95.b(o95Var, f, (fe5) null, (Float) null, (iu30) null, this, 14) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f2 = new Float(0.0f);
                    this.b = (byte) 2;
                    if (o95Var.g(f2, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 1:
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
                    Float f3 = new Float(1.0f);
                    pxg1 pxg1VarO0 = irn1.o0(500, 0, (dlv) null, 6);
                    this.b = (byte) 1;
                    if (o95.b(o95Var2, f3, pxg1VarO0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f4 = new Float(0.0f);
                    this.b = (byte) 2;
                    if (o95Var2.g(f4, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            default:
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var3 = this.d;
                if (z) {
                    Float f5 = new Float(1.0f);
                    bb80 bb80VarY = irn1.Y(irn1.o0(1500, 0, mlv.d, 2), 1, 0L, 4);
                    this.b = (byte) 1;
                    if (o95.b(o95Var3, f5, bb80VarY, (Float) null, (iu30) null, this, 12) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    Float f6 = new Float(0.0f);
                    this.b = (byte) 2;
                    if (o95Var3.g(f6, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }
}
