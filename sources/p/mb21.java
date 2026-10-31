package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mb21 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob21 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb21(ob21 ob21Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ob21Var;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.c;
        ob21 ob21Var = this.b;
        switch (b) {
            case 0:
                return new mb21(ob21Var, str, lnmVar, (byte) 0);
            default:
                return new mb21(ob21Var, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.c;
        ob21 ob21Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.valueOf(z710.d(ob21Var.c, str, false, 6));
            default:
                hm5.M(obj);
                ob21Var.d.k(new er91((fs91) null, ob21Var.e.getString(2131961190, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                lzn0 lzn0Var = ob21Var.b;
                lzn0Var.b(iwr0.e);
                lzn0Var.e();
                return rih1.a;
        }
    }
}
