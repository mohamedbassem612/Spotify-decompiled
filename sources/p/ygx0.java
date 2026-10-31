package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ygx0 implements ahx0 {
    public final Set a;

    public ygx0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygx0) && u890.j(this.a, ((ygx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
