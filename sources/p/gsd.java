package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gsd extends hsd {
    public final Set a;

    public gsd(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsd) && this.a.equals(((gsd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
