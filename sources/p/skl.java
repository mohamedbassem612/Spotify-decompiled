package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class skl {
    public final Set a;

    public skl(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skl) && this.a.equals(((skl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
