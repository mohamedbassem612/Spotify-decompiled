package p;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w9g implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gag b;

    public /* synthetic */ w9g(gag gagVar, byte b) {
        this.a = b;
        this.b = gagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        utm0 utm0Var;
        byte b = this.a;
        gag gagVar = this.b;
        switch (b) {
            case 0:
                Context context = gagVar.a;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 1:
                r091 r091Var = gagVar.r;
                if (r091Var != null) {
                    r091Var.g();
                }
                gagVar.r = null;
                zau0 zau0Var = gagVar.q;
                if (zau0Var != null && (utm0Var = gagVar.f4p) != null) {
                    utm0Var.b(zau0Var);
                }
                gagVar.q = null;
                utm0 utm0Var2 = gagVar.f4p;
                if (utm0Var2 != null) {
                    utm0Var2.d();
                }
                gagVar.f4p = null;
                gagVar.o = null;
                break;
            default:
                try {
                    r091 r091Var2 = gagVar.r;
                    if (r091Var2 != null) {
                        r091Var2.j();
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
