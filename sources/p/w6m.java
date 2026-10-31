package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w6m {
    public final Set a;

    public w6m(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6m) && this.a.equals(((w6m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
