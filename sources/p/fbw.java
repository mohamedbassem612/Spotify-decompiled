package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fbw {
    public final Set a;

    public fbw(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbw) && this.a.equals(((fbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
