package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rom1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cm0 c;
    public final /* synthetic */ kom1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rom1(cm0 cm0Var, kom1 kom1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cm0Var;
        this.d = kom1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kom1 kom1Var = this.d;
        cm0 cm0Var = this.c;
        switch (b) {
            case 0:
                return new rom1(cm0Var, kom1Var, lnmVar, (byte) 0);
            default:
                return new rom1(cm0Var, kom1Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        byte b = this.a;
        fom1 fom1Var = this.d;
        cm0 cm0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    wml wmlVar = (wml) cm0Var.e;
                    String str = fom1Var.a;
                    this.b = true;
                    obj = wmlVar.a(str, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((zlj0) obj).a();
            default:
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
                String str2 = fom1Var.b;
                this.b = true;
                Object objP = cm0Var.p(str2, this);
                return objP == d9nVar ? d9nVar : objP;
        }
    }
}
