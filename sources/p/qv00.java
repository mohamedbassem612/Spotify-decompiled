package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qv00 {
    public final ArrayList a = new ArrayList();

    public final boolean a(String str, Class cls, boolean z) {
        return this.a.add(new rv00(str, cls, z));
    }

    public final void b(Class cls, Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add(new rv00((String) it.next(), cls, z));
        }
    }
}
