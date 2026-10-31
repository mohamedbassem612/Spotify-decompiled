package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zo11 {
    public final Set a;

    public zo11(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo11) && this.a.equals(((zo11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
