package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jdg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ o0i c;
    public final /* synthetic */ h680 d;
    public final /* synthetic */ pe e;
    public final /* synthetic */ idg1 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdg1(o0i o0iVar, h680 h680Var, pe peVar, idg1 idg1Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o0iVar;
        this.d = h680Var;
        this.e = peVar;
        this.f = idg1Var;
        this.g = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new jdg1(this.c, this.d, this.e, this.f, this.g, lnmVar, (byte) 0);
            default:
                return new jdg1(this.c, this.d, this.e, this.f, this.g, lnmVar, (byte) 1);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    n2u0 n2u0Var = this.c.c.b;
                    Observable observableI = n2u0Var != null ? yoi1.i(new mt(n2u0Var.c, (byte) 23), o6x.a) : null;
                    if (observableI != null) {
                        ezc ezcVarG = yoi1.g(((obl1) this.d.b).b(observableI));
                        efb1 efb1Var = new efb1(this.e, this.f, this.g, (byte) 9);
                        this.b = true;
                        return ezcVarG.collect(efb1Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    hhg1.n("Required value was null.");
                } else {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    df6 df6Var = new df6(this.c, this.d, this.e, this.f, this.g, (lnm) null);
                    this.b = true;
                    return smo1.s(df6Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
