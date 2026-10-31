package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dyt implements gyt {
    public final Set a;

    public dyt(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyt) && u890.j(this.a, ((dyt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
