package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nfs implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;

    public /* synthetic */ nfs(iu30 iu30Var, int i, byte b) {
        this.a = b;
        this.b = iu30Var;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                if (iu30Var != null) {
                    iu30Var.invoke(new rzu0(i));
                }
                break;
            default:
                if (iu30Var != null) {
                    iu30Var.invoke(new lui0(i));
                }
                break;
        }
    }
}
