package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sj9 implements uj9 {
    public final Set a;

    public sj9(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj9) && this.a.equals(((sj9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
