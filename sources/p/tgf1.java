package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tgf1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eg1 b;
    public final /* synthetic */ mhf1 c;

    public /* synthetic */ tgf1(eg1 eg1Var, mhf1 mhf1Var, byte b) {
        this.a = b;
        this.b = eg1Var;
        this.c = mhf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        mhf1 mhf1Var = this.c;
        eg1 eg1Var = this.b;
        switch (b) {
            case 0:
                uaq0 uaq0Var = eg1Var.b;
                if (uaq0Var != null) {
                    uaq0Var.d(mhf1Var.h.g);
                }
                break;
            default:
                uaq0 uaq0Var2 = eg1Var.b;
                if (uaq0Var2 != null) {
                    uaq0Var2.b(mhf1Var.h.d);
                }
                break;
        }
    }
}
