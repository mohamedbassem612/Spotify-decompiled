package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rw20 implements Iterable {
    public final spq0 a;

    public rw20(Iterable iterable) {
        this.a = spq0.d(iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.a.e(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public rw20() {
        this.a = j5.a;
    }
}
