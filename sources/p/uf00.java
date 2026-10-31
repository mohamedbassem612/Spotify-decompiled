package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uf00 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ig00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf00(ig00 ig00Var, pf00 pf00Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = ig00Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ig00 ig00Var = this.b;
        switch (b) {
            case 0:
                return new uf00(ig00Var, lnmVar, (byte) 0);
            case 1:
                return new uf00(ig00Var, (pf00) null, lnmVar);
            default:
                return new uf00(ig00Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                throw null;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ig00 ig00Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ig00Var.a.e();
                return rih1Var;
            case 1:
                hm5.M(obj);
                i1k0.r();
                throw null;
            default:
                hm5.M(obj);
                kt91 kt91Var = ig00Var.g;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959132});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131959132, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf00(ig00 ig00Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ig00Var;
    }
}
