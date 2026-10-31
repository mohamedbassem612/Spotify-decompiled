package p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k4n implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int b(b9v b9vVar) {
        int iIntValue;
        synchronized (this.a) {
            try {
                iIntValue = this.b.containsKey(b9vVar) ? ((Integer) this.b.get(b9vVar)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
