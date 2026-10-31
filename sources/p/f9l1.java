package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f9l1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g9l1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9l1(g9l1 g9l1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g9l1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new f9l1(this.c, lnmVar, (byte) 0);
            default:
                return new f9l1(this.c, lnmVar, (byte) 1);
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
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        g9l1 g9l1Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = g9l1Var.b.d;
                e9l1 e9l1Var = new e9l1(g9l1Var, (byte) 0);
                this.b = true;
                bpb1Var.collect(e9l1Var, this);
                return d9nVar;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(g9l1Var.c.d);
                    e9l1 e9l1Var2 = new e9l1(g9l1Var, (byte) 1);
                    this.b = true;
                    if (ezcVarG.collect(e9l1Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
