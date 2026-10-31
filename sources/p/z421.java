package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z421 implements a521 {
    public final Set a;

    public z421(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z421) && this.a.equals(((z421) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
