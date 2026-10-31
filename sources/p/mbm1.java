package p;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mbm1 implements wgn {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();

    public final synchronized List a() {
        return p7h.M(new ugn[]{new tgn(!this.a.isEmpty()), new rgn(!this.b.isEmpty()), new qgn(!this.c.isEmpty()), new sgn(!this.d.isEmpty())});
    }

    public final synchronized void b(Object obj, boolean z) {
        LinkedHashSet linkedHashSet = this.a;
        if (z) {
            linkedHashSet.add(obj);
        } else {
            linkedHashSet.remove(obj);
        }
    }
}
