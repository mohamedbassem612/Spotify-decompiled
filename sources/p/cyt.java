package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyt implements gyt {
    public final Set a;

    public cyt(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyt) && u890.j(this.a, ((cyt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
