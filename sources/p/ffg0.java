package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ffg0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hfg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffg0(hfg0 hfg0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = hfg0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hfg0 hfg0Var = this.b;
        switch (b) {
            case 0:
                return new ffg0(hfg0Var, lnmVar, (byte) 0);
            default:
                return new ffg0(hfg0Var, lnmVar, (byte) 1);
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
        hfg0 hfg0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                hfg0Var.b.e();
                break;
            default:
                hm5.M(obj);
                hfg0Var.c.k(new er91((fs91) null, hfg0Var.d.getString(2131958152), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
        return rih1Var;
    }
}
