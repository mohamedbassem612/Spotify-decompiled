package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dz80 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ez80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz80(ez80 ez80Var, byte b) {
        super(1);
        this.a = b;
        this.b = ez80Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ez80 ez80Var = this.b;
        switch (b) {
            case 0:
                ky80 ky80Var = ((mx80) obj).a;
                w25 w25Var = ez80Var.c;
                pe peVar = ez80Var.j;
                boolean zM = w25Var.m();
                boolean zU = w25Var.u();
                boolean zT = w25Var.t();
                mr4 mr4Var = ez80Var.m;
                return new ky80(ky80Var.a, ky80Var.b, ky80Var.c, zM, zU, w25Var.q(), w25Var.t(), w25Var.w(), w25Var.s(), mr4Var.i() && peVar.b(6), mr4Var.l(), peVar.b(6), w25Var.p() == v25.c, tx9.t(zT, mr4Var.n(), mr4Var.u()), mr4Var.g() && mr4Var.y() && w25Var.s());
            default:
                View view = (View) obj;
                view.setTag(2131428353, Integer.valueOf((int) (ez80Var.c.v() * view.getResources().getDisplayMetrics().density)));
                return rih1.a;
        }
    }
}
