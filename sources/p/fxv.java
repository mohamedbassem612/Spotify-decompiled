package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fxv {
    public final Set a;

    public fxv(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxv) && u890.j(this.a, ((fxv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
