package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fh20 extends lh20 {
    public final Map a;

    public fh20(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh20) && this.a.equals(((fh20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
