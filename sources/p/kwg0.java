package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kwg0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mwg0 b;

    public /* synthetic */ kwg0(mwg0 mwg0Var, byte b) {
        this.a = b;
        this.b = mwg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        mwg0 mwg0Var = this.b;
        switch (b) {
            case 0:
                ivg0 ivg0VarZ0 = mwg0Var.Z0();
                cyg0 cyg0Var = ivg0VarZ0.g;
                iug0 iug0Var = ivg0VarZ0.a;
                ivg0VarZ0.a(cyg0Var.c(2, iug0Var.X, iug0Var.a));
                break;
            case 1:
                mwg0Var.Z0().b(false);
                break;
            default:
                ivg0 ivg0VarZ1 = mwg0Var.Z0();
                dg30 dg30VarN0 = mwg0Var.N0();
                cyg0 cyg0Var2 = ivg0VarZ1.g;
                iug0 iug0Var2 = ivg0VarZ1.a;
                cyg0Var2.c(4, (String) null, iug0Var2.a);
                tmq0 tmq0Var = iug0Var2.N0;
                w0o1.r(dg30VarN0, tmq0Var.c, iug0Var2.Z, iug0Var2.a, tmq0Var.a, tmq0Var.b, tmq0Var.d, tmq0Var.e);
                break;
        }
    }
}
