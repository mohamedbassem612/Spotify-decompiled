package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ha6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ja6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha6(ja6 ja6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ja6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ja6 ja6Var = this.c;
        switch (b) {
            case 0:
                return new ha6(ja6Var, lnmVar, (byte) 0);
            default:
                return new ha6(ja6Var, lnmVar, (byte) 1);
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        ja6 ja6Var = this.c;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.b;
                rih1 rih1Var = rih1.a;
                if (!z) {
                    hm5.M(obj);
                    y7l y7lVar = ja6Var.d;
                    ezc ezcVarG = yoi1.g(y7lVar.b.a());
                    ga6 ga6Var = new ga6(ja6Var, (byte) 0);
                    this.b = true;
                    Object objCollect = ezcVarG.collect(new t0l(ga6Var, y7lVar, (byte) 5), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = ja6Var.b.e;
                ga6 ga6Var2 = new ga6(ja6Var, b2);
                this.b = true;
                bpb1Var.collect(ga6Var2, this);
                return d9nVar;
        }
    }
}
