package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ct40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct40(kaa kaaVar, Context context, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.d = kaaVar;
        this.e = context;
        this.c = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        int i = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return new ct40((kaa) obj3, (Context) obj2, i, lnmVar);
            default:
                return new ct40((xtb0) obj3, i, (tob1) obj2, lnmVar);
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
        Object obj2 = this.e;
        int i = this.c;
        Object obj3 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return ws40.e(((kaa) obj3).b(), (Context) obj2, i, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iP = yoi1.p(i, 0, kzt.b((tob1) obj2));
                this.b = true;
                df41 df41Var = xtb0.y;
                return ((xtb0) obj3).k(iP, 0, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct40(xtb0 xtb0Var, int i, tob1 tob1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = xtb0Var;
        this.c = i;
        this.e = tob1Var;
    }
}
