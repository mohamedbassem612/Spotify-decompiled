package p;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nxh extends oqq0 implements Serializable {
    public final Comparator a;

    public nxh(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nxh) {
            return this.a.equals(((nxh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
