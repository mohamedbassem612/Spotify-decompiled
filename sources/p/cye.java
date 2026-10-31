package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cye implements nye {
    public final Set a;

    public cye(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cye) && this.a.equals(((cye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
