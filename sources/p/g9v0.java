package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g9v0 implements i9v0 {
    public final Set a;

    public g9v0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9v0) && this.a.equals(((g9v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
