package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class snk1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hok1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snk1(hok1 hok1Var, byte b) {
        super(1);
        this.a = b;
        this.b = hok1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hok1 hok1Var = this.b;
        switch (b) {
            case 0:
                return new dnk1(fnk1.a, false, hok1Var.c.a());
            case 1:
                cas casVar = (a7m0) obj;
                casVar.a = olj1.a1;
                casVar.d = new tnk1(hok1Var, (byte) 0);
                casVar.e = new tnk1(hok1Var, (byte) 1);
                return rih1Var;
            default:
                hok1Var.b.k(new er91((fs91) null, (String) obj, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
        }
    }
}
