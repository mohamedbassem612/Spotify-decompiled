package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class piy {
    public final Set a;

    public piy(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof piy) && u890.j(this.a, ((piy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
