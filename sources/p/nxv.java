package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nxv implements oxv {
    public final Set a;

    public nxv(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxv) && u890.j(this.a, ((nxv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
