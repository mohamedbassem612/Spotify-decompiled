package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wsd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ysd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wsd1(ysd1 ysd1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ysd1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ysd1 ysd1Var = this.b;
        switch (b) {
            case 0:
                return new wsd1(ysd1Var, lnmVar, (byte) 0);
            default:
                return new wsd1(ysd1Var, lnmVar, (byte) 1);
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
        ysd1 ysd1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ysd1Var.b.e();
                break;
            default:
                hm5.M(obj);
                kt91 kt91Var = ysd1Var.e;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963052});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131963052, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
        return rih1Var;
    }
}
