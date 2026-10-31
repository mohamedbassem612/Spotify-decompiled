package p;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lx40 extends pql1 {
    public final Window.Callback b;
    public final /* synthetic */ mx40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx40(mx40 mx40Var, Window.Callback callback) {
        super(callback);
        this.c = mx40Var;
        this.b = callback;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean zOnPreparePanel = ((pql1) this).a.onPreparePanel(i, view, menu);
        if (zOnPreparePanel) {
            mx40 mx40Var = this.c;
            if (!mx40Var.d) {
                mx40Var.d = true;
            }
        }
        return zOnPreparePanel;
    }
}
