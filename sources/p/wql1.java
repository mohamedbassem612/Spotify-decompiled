package p;

import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wql1 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ xql1 a;

    public wql1(xql1 xql1Var) {
        this.a = xql1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            windowInsets = ((uql1) it.next()).onApplyWindowInsets(view, windowInsets);
        }
        return windowInsets;
    }
}
