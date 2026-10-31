package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p9s extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ y9s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9s(y9s y9sVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = y9sVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        y9s y9sVar = this.c;
        switch (b) {
            case 0:
                return new p9s(y9sVar, lnmVar, (byte) 0);
            case 1:
                return new p9s(y9sVar, lnmVar, (byte) 1);
            case 2:
                return new p9s(y9sVar, lnmVar, (byte) 2);
            case 3:
                return new p9s(y9sVar, lnmVar, (byte) 3);
            default:
                return new p9s(y9sVar, lnmVar, (byte) 4);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        y9s y9sVar = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarK = r4p1.k(yoi1.g(y9sVar.a.j()), y9sVar.d.b());
                o9s o9sVar = new o9s(y9sVar, null, (byte) 0);
                this.b = true;
                Object objJ = b5p1.j(mr20VarK, o9sVar, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV = z4p1.v(d5p1.h(y9sVar.b.f), 1);
                this.b = true;
                Object objI = b5p1.i(qt20VarV, this);
                return objI == d9nVar ? d9nVar : objI;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zlo zloVar = new zlo((Object) y9sVar, lnmVar, (byte) 13);
                this.b = true;
                Object objS = smo1.s(zloVar, this);
                return objS == d9nVar ? d9nVar : objS;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV2 = z4p1.v(d5p1.h(y9sVar.f.X), 1);
                this.b = true;
                Object objI2 = b5p1.i(qt20VarV2, this);
                return objI2 == d9nVar ? d9nVar : objI2;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = y9sVar.a(this);
                    return objA == d9nVar ? d9nVar : objA;
                }
                if (z5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
