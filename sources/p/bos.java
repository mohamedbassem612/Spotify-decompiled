package p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bos implements je61 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // p.je61
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((je61) it.next()).a();
        }
    }
}
