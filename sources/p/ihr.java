package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ihr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mhr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ihr(mhr mhrVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mhrVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mhr mhrVar = this.c;
        switch (b) {
            case 0:
                return new ihr(mhrVar, lnmVar, (byte) 0);
            default:
                return new ihr(mhrVar, lnmVar, (byte) 1);
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
        mhr mhrVar = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(750L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952629});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                mhrVar.c.k(new er91((fs91) null, "", 2131952629, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
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
                geo0 geo0Var = geo0.b;
                ihr ihrVar = new ihr(mhrVar, lnmVar, (byte) 0);
                this.b = true;
                return fn31.Y(geo0Var, ihrVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
