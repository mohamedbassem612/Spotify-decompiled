package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class arz0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arz0(wf2 wf2Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = wf2Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                arz0 arz0Var = new arz0(3, (lnm) obj3);
                arz0Var.c = (uld) obj;
                arz0Var.b = zBooleanValue;
                return arz0Var.invokeSuspend(rih1Var);
            default:
                return new arz0((wf2) this.c, (lnm) obj3).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        switch (this.a) {
            case 0:
                uld uldVar = (uld) this.c;
                boolean z = this.b;
                hm5.M(obj);
                if (!(uldVar instanceof old) && !(uldVar instanceof sld)) {
                    if (!(uldVar instanceof qld) && !(uldVar instanceof rld) && !(uldVar instanceof tld)) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                return yah0.m(z);
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    wf2 wf2Var = (wf2) this.c;
                    this.b = true;
                    obj = wf2.d(wf2Var, this);
                    d9n d9nVar = d9n.a;
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((Boolean) obj).booleanValue() ? lfb.m(w2n1.class, aqr0.a) : crn0.a;
        }
    }

    public /* synthetic */ arz0(int i, lnm lnmVar) {
        super(i, lnmVar);
    }
}
