package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p7t extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w7t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7t(w7t w7tVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = w7tVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        w7t w7tVar = this.b;
        switch (b) {
            case 0:
                return new p7t(w7tVar, lnmVar, (byte) 0);
            case 1:
                return new p7t(w7tVar, lnmVar, (byte) 1);
            default:
                return new p7t(w7tVar, lnmVar, (byte) 2);
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
        w7t w7tVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                w7tVar.d.e();
                break;
            case 1:
                hm5.M(obj);
                w7tVar.b.k(new er91((fs91) null, w7tVar.c.getString(2131954928), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                hm5.M(obj);
                w7tVar.b.k(new er91((fs91) null, w7tVar.c.getString(2131954931), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
        return rih1Var;
    }
}
