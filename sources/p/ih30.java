package p;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ih30 implements qti0 {
    public final /* synthetic */ th30 a;

    public ih30(th30 th30Var) {
        this.a = th30Var;
    }

    @Override // p.qti0
    public final void a(Menu menu) {
        this.a.r();
    }

    @Override // p.qti0
    public final void b(Menu menu) {
        this.a.u();
    }

    @Override // p.qti0
    public final boolean c(MenuItem menuItem) {
        return this.a.q();
    }

    @Override // p.qti0
    public final void d(Menu menu, MenuInflater menuInflater) {
        this.a.l();
    }
}
