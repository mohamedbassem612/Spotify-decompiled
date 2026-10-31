package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class co extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ eo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co(eo eoVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = eoVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        eo eoVar = this.c;
        switch (b) {
            case 0:
                return new co(eoVar, lnmVar, (byte) 0);
            case 1:
                return new co(eoVar, lnmVar, (byte) 1);
            default:
                return new co(eoVar, lnmVar, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eo eoVar = this.c;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
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
                huz huzVar = (huz) eoVar.X.b;
                bo boVar = new bo(eoVar, (byte) 0);
                this.b = true;
                Object objCollect = huzVar.collect(new o010(boVar, (byte) 25), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = (bpb1) eoVar.X.c;
                bo boVar2 = new bo(eoVar, b2);
                this.b = true;
                bpb1Var.collect(boVar2, this);
                return d9nVar;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    c6 c6Var = new c6(eoVar, (lnm) null, (byte) 2);
                    this.b = true;
                    return z8p1.u(eoVar, w8c0.d, c6Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
