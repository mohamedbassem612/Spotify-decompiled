package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class zqq0 implements ne41, iv30 {
    public final /* synthetic */ arq0 a;

    public zqq0(arq0 arq0Var) {
        this.a = arq0Var;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("orientation_plugin_saved_state", this.a.a.a());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ne41) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return new tv30(0, this.a, arq0.class, "onSaveInstanceState", "onSaveInstanceState()Landroid/os/Bundle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
