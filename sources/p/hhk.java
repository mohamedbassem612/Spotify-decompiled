package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hhk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhk(kt91 kt91Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = kt91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                return new hhk(kt91Var, lnmVar, (byte) 0);
            case 1:
                return new hhk(kt91Var, lnmVar, (byte) 1);
            case 2:
                return new hhk(kt91Var, lnmVar, (byte) 2);
            default:
                return new hhk(kt91Var, lnmVar, (byte) 3);
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
            case 2:
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
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954201});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131954201, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 1:
                hm5.M(obj);
                hle0.a(2131963269, kt91Var);
                break;
            case 2:
                hm5.M(obj);
                hle0.a(2131960270, kt91Var);
                break;
            default:
                hm5.M(obj);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958324});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131958324, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
        return rih1Var;
    }
}
