package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rte0 implements o5s {
    public final /* synthetic */ tte0 a;

    public rte0(tte0 tte0Var) {
        this.a = tte0Var;
    }

    public final void onCreate(iac0 iac0Var) {
        tte0 tte0Var = this.a;
        tte0Var.g.b.e.d.a(new d8l(tte0Var, (byte) 2));
    }

    public final void onStart(iac0 iac0Var) {
        tte0 tte0Var = this.a;
        if (tte0Var.m) {
            tte0Var.a();
        }
    }

    public final void onStop(iac0 iac0Var) {
        ute0 ute0Var = this.a.a;
        Iterator it = ute0Var.c.iterator();
        while (it.hasNext()) {
            ((iyf0) it.next()).d();
        }
        ute0Var.d.b(b4t.b);
    }
}
