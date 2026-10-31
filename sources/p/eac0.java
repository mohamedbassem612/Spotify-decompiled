package p;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eac0 implements qti0 {
    public final /* synthetic */ fac0 a;

    public eac0(fac0 fac0Var) {
        this.a = fac0Var;
    }

    @Override // p.qti0
    public final boolean c(MenuItem menuItem) {
        return false;
    }

    @Override // p.qti0
    public final void d(Menu menu, MenuInflater menuInflater) {
        this.a.F1.a(new t8c0(menu, (byte) 0));
    }
}
