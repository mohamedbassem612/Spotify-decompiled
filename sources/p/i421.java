package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i421 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ j421 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i421(j421 j421Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j421Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        j421 j421Var = this.c;
        switch (b) {
            case 0:
                return new i421(j421Var, lnmVar, (byte) 0);
            case 1:
                return new i421(j421Var, lnmVar, (byte) 1);
            default:
                return new i421(j421Var, lnmVar, (byte) 2);
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
        d9n d9nVar = d9n.a;
        j421 j421Var = this.c;
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
                ezc ezcVar = j421Var.i1().h;
                h421 h421Var = new h421(j421Var, (byte) 0);
                this.b = true;
                return ezcVar.collect(h421Var, this) == d9nVar ? d9nVar : rih1Var;
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
                bpb1 bpb1Var = j421Var.i1().g;
                h421 h421Var2 = new h421(j421Var, (byte) 1);
                this.b = true;
                bpb1Var.collect(h421Var2, this);
                return d9nVar;
            default:
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
                iac0 iac0VarN0 = j421Var.n0();
                p2z0 p2z0Var = new p2z0(j421Var, (lnm) null, (byte) 16);
                this.b = true;
                return z8p1.u(iac0VarN0, w8c0.d, p2z0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
