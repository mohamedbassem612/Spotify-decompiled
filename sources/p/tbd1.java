package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tbd1 implements sl7 {
    public final /* synthetic */ ubd1 a;

    public tbd1(ubd1 ubd1Var) {
        this.a = ubd1Var;
    }

    public final void a(rl7 rl7Var) {
        ubd1 ubd1Var = this.a;
        if (ubd1Var.l()) {
            Iterator it = ubd1.d(ubd1Var).iterator();
            while (it.hasNext()) {
                ((sl7) it.next()).a(rl7Var);
            }
        }
        ubd1.k(ubd1Var, (rl7) null);
    }

    public final void b(rl7 rl7Var) {
        ubd1 ubd1Var = this.a;
        ubd1.k(ubd1Var, rl7Var);
        if (ubd1Var.l()) {
            Iterator it = ubd1.d(ubd1Var).iterator();
            while (it.hasNext()) {
                ((sl7) it.next()).b(rl7Var);
            }
        }
    }
}
