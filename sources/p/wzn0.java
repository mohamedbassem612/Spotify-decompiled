package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wzn0 {
    public final Set a;

    public wzn0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzn0) && this.a.equals(((wzn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
