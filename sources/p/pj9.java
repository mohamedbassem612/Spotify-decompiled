package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pj9 implements uj9 {
    public final Set a;

    public pj9(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj9) && this.a.equals(((pj9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
