package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ggj0 extends hgj0 {
    public final Set a;

    public ggj0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggj0) && this.a.equals(((ggj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
