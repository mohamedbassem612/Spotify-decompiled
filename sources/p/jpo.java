package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jpo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpo(o95 o95Var, float f, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new jpo(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new jpo(this.c, this.d, lnmVar, (byte) 1);
            case 2:
                return new jpo(this.c, this.d, lnmVar, (byte) 2);
            case 3:
                return new jpo(this.c, this.d, lnmVar, (byte) 3);
            case 4:
                return new jpo(this.c, this.d, lnmVar, (byte) 4);
            case 5:
                return new jpo(this.c, this.d, lnmVar, (byte) 5);
            default:
                return new jpo(this.c, this.d, lnmVar, (byte) 6);
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        o95 o95Var = this.c;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Float f2 = new Float(f);
                    this.b = true;
                    return o95Var.g(f2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
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
                p3v p3vVar = new p3v(f);
                n8b1 n8b1VarL0 = irn1.l0(0.0f, 400.0f, (Object) null, 1);
                this.b = true;
                return o95.b(this.c, p3vVar, n8b1VarL0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f3 = new Float(f);
                pxg1 pxg1VarO0 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f3, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f4 = new Float(-f);
                pxg1 pxg1VarO1 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f4, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f5 = new Float(f);
                pxg1 pxg1VarO2 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f5, pxg1VarO2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f6 = new Float(f);
                pxg1 pxg1VarO3 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f6, pxg1VarO3, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    Float f7 = new Float(f);
                    this.b = true;
                    return o95Var.g(f7, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
