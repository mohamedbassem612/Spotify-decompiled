package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lw31 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public byte c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lw31(int i, float[] fArr, float f, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = i;
        this.e = fArr;
        this.d = f;
        this.f = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return new lw31(this.b, (o95) obj3, this.d, (l811) obj2, lnmVar);
            default:
                return new lw31(this.c, (float[]) obj3, this.d, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objB2;
        del1 del1Var;
        byte b = this.a;
        Object obj2 = this.f;
        float f = this.d;
        Object obj3 = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    o95 o95Var = (o95) obj3;
                    if (this.b) {
                        Float f2 = new Float(-f);
                        n8b1 n8b1VarL0 = irn1.l0(1.0f, 400.0f, (Object) null, 4);
                        this.c = (byte) 1;
                        objB2 = o95.b(o95Var, f2, n8b1VarL0, (Float) null, (iu30) null, this, 12);
                        if (objB2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!((l811) obj2).a) {
                            f = 0.0f;
                        }
                        Float f3 = new Float(f);
                        n8b1 n8b1VarL1 = irn1.l0(1.0f, 400.0f, (Object) null, 4);
                        this.c = (byte) 2;
                        objB = o95.b(o95Var, f3, n8b1VarL1, (Float) null, (iu30) null, this, 12);
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (b2 == 1) {
                    hm5.M(obj);
                    objB2 = obj;
                } else {
                    if (b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                return rih1.a;
            default:
                boolean z = this.b;
                if (z && !z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                do {
                    del1Var = new del1(this.c, (float[]) obj3, f, (ven0) obj2);
                    this.b = true;
                } while (s110.q(del1Var, this) != d9nVar);
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw31(boolean z, o95 o95Var, float f, l811 l811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.e = o95Var;
        this.d = f;
        this.f = l811Var;
    }
}
