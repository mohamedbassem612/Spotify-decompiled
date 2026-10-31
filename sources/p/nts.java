package p;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nts implements qzh {
    public final /* synthetic */ byte a = 0;
    public final lly b;

    public nts(nfx nfxVar, pky pkyVar) {
        Activity activity = (Activity) nfxVar.b;
        gw70 gw70Var = (gw70) nfxVar.c;
        if ((pkyVar instanceof pky) || pkyVar == null) {
            this.b = new lly(activity, gw70Var, 4, pkyVar == null, true, false, 32);
        } else {
            eg.o();
            throw null;
        }
    }

    public final void f(Object obj) {
        byte b = this.a;
        lly llyVar = this.b;
        switch (b) {
            case 0:
                o0d1 o0d1Var = (o0d1) obj;
                String string = llyVar.c.getResources().getString(2131963005);
                llyVar.a(new cky(new lky(o0d1Var.b, 14, false), new aky(o0d1Var.a, (ujy) null, (njy) null, (sjy) null, 30), (fky) null, new kky(string), (bs51) null, (wiy) null, (bky) null, (piy) null, (cjy) null, 16372));
                break;
            default:
                llyVar.a((cky) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        lly llyVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return llyVar.c;
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.n(iu30Var);
                break;
        }
    }

    private final void a(iu30 iu30Var) {
    }

    public nts(Context context, gw70 gw70Var) {
        this.b = new lly(context, gw70Var, 0, false, false, false, 60);
    }
}
