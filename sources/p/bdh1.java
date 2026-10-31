package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bdh1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm6 b;
    public final /* synthetic */ kt91 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bdh1(nm6 nm6Var, kt91 kt91Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = nm6Var;
        this.c = kt91Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new bdh1(this.b, this.c, this.d, lnmVar, (byte) 0);
            default:
                return new bdh1(this.b, this.c, this.d, lnmVar, (byte) 1);
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
        kt91 kt91Var = this.c;
        nm6 nm6Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (nm6Var instanceof km6) {
                    kt91Var.k(new er91((fs91) null, this.d, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                break;
            default:
                hm5.M(obj);
                if (nm6Var instanceof km6) {
                    kt91Var.k(new er91((fs91) null, this.d, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                break;
        }
        return rih1Var;
    }
}
