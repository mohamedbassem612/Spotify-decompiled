package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mz2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz2(Object obj, float f, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        float f = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new mz2((nz2) obj2, f, lnmVar, (byte) 0);
            case 1:
                return new mz2((s24) obj2, f, lnmVar, (byte) 1);
            case 2:
                return new mz2((xtb0) obj2, f, lnmVar, (byte) 2);
            case 3:
                return new mz2((sfx0) obj2, f, lnmVar, (byte) 3);
            default:
                return new mz2((jfe) obj2, f, lnmVar, (byte) 4);
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
        Object objK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nz2 nz2Var = (nz2) obj2;
                pgr pgrVar = nz2Var.b1;
                if (pgrVar == null) {
                    u890.C("attentionTracker");
                    throw null;
                }
                lz2 lz2Var = new lz2(nz2Var, (byte) 2);
                this.b = true;
                n811 n811Var = new n811();
                n811Var.a = ((Number) lz2Var.invoke()).intValue();
                Object objCollect = rwq.q(lz2Var).collect(new pz2(pgrVar, n811Var, f), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return ((s24) obj2).e0(f, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                xtb0 xtb0Var = (xtb0) obj2;
                this.b = true;
                int i = xtb0Var.h().o;
                if (i == 0 || (objK = xtb0Var.k(yoi1.p((int) (i * f), 0, i - 1), 0, this)) != d9nVar) {
                    objK = rih1Var;
                }
                return objK == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    qfx0 qfx0Var = new qfx0(f);
                    this.b = true;
                    return ((sfx0) obj2).a(qfx0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    rj31 rj31Var = new rj31("iconScale", f);
                    this.b = true;
                    return ((jfe) obj2).b(rj31Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
