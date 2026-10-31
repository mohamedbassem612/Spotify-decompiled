package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vux0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ytp0 b;

    public /* synthetic */ vux0(ytp0 ytp0Var, byte b) {
        this.a = b;
        this.b = ytp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ytp0 ytp0Var = this.b;
        switch (b) {
            case 0:
                ((y11) ytp0Var.e).accept(vrx0.a);
                break;
            default:
                ((y11) ytp0Var.e).accept(orx0.a);
                break;
        }
    }
}
