package p;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class ayn0 implements dkl, iv30 {
    public final /* synthetic */ eyn0 a;

    public ayn0(eyn0 eyn0Var) {
        this.a = eyn0Var;
    }

    public final void accept(Object obj) {
        Intent intent = (Intent) obj;
        eyn0 eyn0Var = this.a;
        ((bnj0) eyn0Var.l).x(intent);
        Intent intentC = ((st60) eyn0Var.c).C(intent);
        if (intentC == null) {
            return;
        }
        Uri data = intentC.getData();
        if (data != null && ((g8h1) eyn0Var.m).a(data)) {
            intentC.putExtra("extra_deeplink_navigation_logged", true);
        }
        if (((jvn0) eyn0Var.e).b()) {
            eyn0Var.a(intentC);
            ((o0g1) eyn0Var.d).p(intentC);
            return;
        }
        ggs0 ggs0Var = (ggs0) eyn0Var.b;
        synchronized (ggs0Var.d) {
            ggs0Var.c.add(intentC);
            ggs0Var.T();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dkl) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return new tv30(1, this.a, eyn0.class, "handleNewIntent", "handleNewIntent(Landroid/content/Intent;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
