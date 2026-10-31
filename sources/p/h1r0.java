package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h1r0 {
    public final Set a;

    public h1r0(Set set) {
        this.a = set;
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((g1r0) it.next()).d();
        }
    }

    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((g1r0) it.next()).c();
        }
    }
}
