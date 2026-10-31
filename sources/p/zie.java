package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zie extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ahe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zie(d0r d0rVar, String str, ahe aheVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d0rVar;
        this.d = str;
        this.e = aheVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new zie(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new zie(this.c, this.d, this.e, lnmVar, (byte) 1);
            case 2:
                return new zie(this.c, this.d, this.e, lnmVar, (byte) 2);
            default:
                return new zie(this.c, this.d, this.e, lnmVar, (byte) 3);
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
        ahe aheVar = this.e;
        String str = this.d;
        d0r d0rVar = this.c;
        d9n d9nVar = d9n.a;
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
                te1 te1Var = new te1(d3p1.F(d0rVar, mje.d, new noa0(str, aheVar.a, aheVar.b)), (byte) 10);
                s4 s4Var = new s4(2, (lnm) null, (byte) 26);
                this.b = true;
                Object objJ = b5p1.j(te1Var, s4Var, this);
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
                ik ikVar = new ik(new te1(d3p1.F(d0rVar, mje.d, new noa0(str, aheVar.a, aheVar.b)), (byte) 11), (byte) 25);
                this.b = true;
                Object objI = b5p1.i(ikVar, this);
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
                ik ikVar2 = new ik(new te1(d3p1.F(d0rVar, mje.d, new noa0(str, aheVar.a, aheVar.b)), (byte) 12), (byte) 26);
                this.b = true;
                Object objI2 = b5p1.i(ikVar2, this);
                return objI2 == d9nVar ? d9nVar : objI2;
            default:
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
                ik ikVar3 = new ik(new te1(d3p1.F(d0rVar, mje.d, new noa0(str, aheVar.a, aheVar.b)), (byte) 13), (byte) 27);
                this.b = true;
                Object objI3 = b5p1.i(ikVar3, this);
                return objI3 == d9nVar ? d9nVar : objI3;
        }
    }
}
