package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nbu implements rbu {
    public final Set a;

    public nbu(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbu) && u890.j(this.a, ((nbu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
