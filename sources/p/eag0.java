package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eag0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mag0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eag0(mag0 mag0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = mag0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mag0 mag0Var = this.b;
        switch (b) {
            case 0:
                return new eag0(mag0Var, lnmVar, (byte) 0);
            default:
                return new eag0(mag0Var, lnmVar, (byte) 1);
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mag0 mag0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                mag0Var.d.e();
                break;
            default:
                hm5.M(obj);
                mag0Var.b.k(new er91((fs91) null, mag0Var.c.getString(2131958105), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
        return rih1Var;
    }
}
