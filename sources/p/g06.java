package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g06 implements o5s {
    public final Set a = Collections.newSetFromMap(mp10.l());
    public final tac0 b;

    public g06(y2g0 y2g0Var) {
        krw0 krw0Var = krw0.i;
        this.b = u7n0.w().f;
        y2g0Var.a(new f85(this, (byte) 26));
    }

    public final boolean a() {
        return !this.b.i.a(w8c0.d);
    }

    @Override // p.o5s
    public final void onStart(iac0 iac0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((p3u0) it.next()).F0();
        }
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((p3u0) it.next()).B0();
        }
    }
}
