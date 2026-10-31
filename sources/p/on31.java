package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class on31 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pn31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on31(pn31 pn31Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pn31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pn31 pn31Var = this.c;
        switch (b) {
            case 0:
                return new on31(pn31Var, lnmVar, (byte) 0);
            case 1:
                return new on31(pn31Var, lnmVar, (byte) 1);
            default:
                return new on31(pn31Var, lnmVar, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        pn31 pn31Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var = pn31Var.e;
                nn31 nn31Var = new nn31(pn31Var, (byte) 0);
                this.b = true;
                if (xe01Var.a.collect(nn31Var, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
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
                z2k z2kVar = pn31Var.f;
                if (!(z2kVar instanceof z2k)) {
                    return rih1.a;
                }
                this.b = true;
                z2kVar.G(this);
                return d9nVar;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zob1 zob1VarC = pn31Var.f.c();
                nn31 nn31Var2 = new nn31(pn31Var, (byte) 1);
                this.b = true;
                if (zob1VarC.collect(nn31Var2, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
        }
    }
}
