package p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hds {
    public final yun0 a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public hds(yun0 yun0Var) {
        this.a = yun0Var;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((t1q0) it.next()).a(this.a.e());
        }
    }
}
