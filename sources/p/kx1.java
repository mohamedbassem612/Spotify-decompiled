package p;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kx1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4n b;
    public final /* synthetic */ v4n c;

    public /* synthetic */ kx1(v4n v4nVar, t4n t4nVar, byte b) {
        this.a = b;
        this.c = v4nVar;
        this.b = t4nVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Resources resources;
        Configuration configuration;
        byte b = this.a;
        un91 un91Var = this.c;
        t4n t4nVar = this.b;
        switch (b) {
            case 0:
                if (((lx1) un91Var).N0().getResources().getConfiguration().orientation == 2) {
                    t4nVar.g().L(3);
                    t4nVar.g().E = true;
                }
                break;
            default:
                dg30 dg30VarF0 = un91Var.f0();
                if (dg30VarF0 != null && (resources = dg30VarF0.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
                    t4nVar.g().L(3);
                    t4nVar.g().E = true;
                    break;
                }
                break;
        }
    }
}
