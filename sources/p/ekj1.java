package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ekj1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hij1 b;

    public /* synthetic */ ekj1(hij1 hij1Var, byte b) {
        this.a = b;
        this.b = hij1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        hij1 hij1Var = this.b;
        switch (b) {
            case 0:
                hij1Var.invoke(h331.b);
                break;
            default:
                hij1Var.invoke(h331.a);
                break;
        }
    }
}
