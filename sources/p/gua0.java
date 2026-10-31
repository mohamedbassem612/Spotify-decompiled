package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class gua0 implements uql1, iv30 {
    public final /* synthetic */ vu30 a;

    public gua0(gs90 gs90Var) {
        this.a = gs90Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof uql1) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // p.uql1
    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) this.a.invoke(view, windowInsets);
    }
}
