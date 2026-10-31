package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y450 implements l700 {
    public final Set a;

    public y450(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y450) && u890.j(this.a, ((y450) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
