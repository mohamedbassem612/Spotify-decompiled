package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uva0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzn0 b;

    public /* synthetic */ uva0(lzn0 lzn0Var, byte b) {
        this.a = b;
        this.b = lzn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        lzn0 lzn0Var = this.b;
        switch (b) {
            case 0:
                lzn0Var.e();
                break;
            case 1:
                lzn0Var.e();
                break;
            default:
                lzn0Var.e();
                break;
        }
    }
}
