package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lh41 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mh41 b;

    public /* synthetic */ lh41(mh41 mh41Var, byte b) {
        this.a = b;
        this.b = mh41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        mh41 mh41Var = this.b;
        switch (b) {
            case 0:
                mh41Var.Z0(false, false);
                break;
            default:
                mh41Var.Z0(false, false);
                break;
        }
    }
}
