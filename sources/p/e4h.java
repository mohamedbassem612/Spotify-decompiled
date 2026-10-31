package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e4h {
    public final List a;

    public e4h(List list) {
        this.a = list;
    }

    public final rjo0 a(String str) {
        Object next;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((rjo0) next).a(str)) {
                return (rjo0) next;
            }
        }
        next = null;
        return (rjo0) next;
    }
}
