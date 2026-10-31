package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nqf1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qqf1 b;
    public final /* synthetic */ aqf1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ nqf1(qqf1 qqf1Var, aqf1 aqf1Var, int i, byte b) {
        this.a = b;
        this.b = qqf1Var;
        this.c = aqf1Var;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.d;
        aqf1 aqf1Var = this.c;
        qqf1 qqf1Var = this.b;
        switch (b) {
            case 0:
                if (!qqf1Var.t) {
                    qqf1Var.h.invoke(new krf1(aqf1Var.a, i, aqf1Var.h));
                    break;
                }
                break;
            default:
                qqf1Var.h.invoke(new lrf1(aqf1Var.a, i, aqf1Var.h, aqf1Var.f));
                break;
        }
    }
}
