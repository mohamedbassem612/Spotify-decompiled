package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ggc0 implements qzh {
    public final /* synthetic */ byte a = 0;
    public final dtw b;
    public iu30 c;

    public ggc0(Context context, u0i u0iVar, t4m0 t4m0Var) {
        rt01 rt01Var = new rt01(u0iVar, t4m0Var);
        tka0 tka0Var = dtw.C;
        this.b = mhc.d(context, new FrameLayout(context), rt01Var, (drw) null, 24);
        this.c = rz71.P0;
    }

    public final void f(Object obj) {
        byte b = this.a;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                fgc0 fgc0Var = (fgc0) obj;
                igc0 igc0Var = new igc0(fgc0Var, new vq80(this, fgc0Var, (byte) 25));
                joa0 joa0Var = new joa0(fgc0Var.a);
                tka0 tka0Var = dtw.C;
                dtwVar.k(igc0Var, joa0Var, (vu30) null);
                break;
            default:
                a781 a781Var = (a781) obj;
                i281 i281Var = a781Var.a;
                hey0 hey0Var = new hey0(i281Var, a781Var.b, a781Var.c, new c861(this, a781Var, (byte) 24));
                joa0 joa0Var2 = new joa0(i281Var.a);
                tka0 tka0Var2 = dtw.C;
                dtwVar.k(hey0Var, joa0Var2, (vu30) null);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return dtwVar.w;
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                this.c = iu30Var;
                break;
            default:
                this.c = iu30Var;
                break;
        }
    }

    public ggc0(Context context, u0i u0iVar, r4m0 r4m0Var) {
        bs0 bs0Var = new bs0(context, u0iVar, r4m0Var);
        tka0 tka0Var = dtw.C;
        this.b = mhc.d(context, new FrameLayout(context), bs0Var, (drw) null, 24);
        this.c = xdc0.N0;
    }
}
