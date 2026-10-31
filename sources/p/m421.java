package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m421 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i521 b;

    public /* synthetic */ m421(i521 i521Var, byte b) {
        this.a = b;
        this.b = i521Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        i521 i521Var = this.b;
        switch (b) {
            case 0:
                i521Var.invoke(p521.a);
                break;
            default:
                i521Var.invoke(p521.b);
                break;
        }
    }
}
