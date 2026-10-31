package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u921 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u921(ba21 ba21Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ba21Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ba21 ba21Var = this.b;
        switch (b) {
            case 0:
                return new u921(ba21Var, lnmVar, (byte) 0);
            case 1:
                return new u921(ba21Var, lnmVar, (byte) 1);
            default:
                return new u921(ba21Var, lnmVar, (byte) 2);
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
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ba21 ba21Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ba21Var.b.e();
                break;
            case 1:
                hm5.M(obj);
                ba21Var.c.k(new er91((fs91) null, ba21Var.d.getString(2131961165), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                hm5.M(obj);
                ba21Var.c.k(new er91((fs91) null, ba21Var.d.getString(2131961171), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                lzn0 lzn0Var = ba21Var.b;
                lzn0Var.d(blc0.Lc);
                lzn0Var.e();
                break;
        }
        return rih1Var;
    }
}
