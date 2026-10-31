package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kae implements mae {
    public final Set a;

    public kae(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kae) && this.a.equals(((kae) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
