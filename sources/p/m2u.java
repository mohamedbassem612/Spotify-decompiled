package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m2u implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;

    public /* synthetic */ m2u(ohd ohdVar, byte b) {
        this.a = b;
        this.b = ohdVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        g621 g621Var = g621.a;
        g621 g621Var2 = g621.c;
        ohd ohdVar = this.b;
        switch (b) {
            case 0:
                q2u.a(ohdVar, g621.b);
                break;
            case 1:
                q2u.a(ohdVar, g621Var);
                break;
            case 2:
                q2u.a(ohdVar, g621Var2);
                break;
            case 3:
                q2u.a(ohdVar, g621Var);
                break;
            default:
                q2u.a(ohdVar, g621Var2);
                break;
        }
    }
}
