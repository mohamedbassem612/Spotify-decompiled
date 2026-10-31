package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gfj0 extends hfj0 {
    public final Set a;

    public gfj0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfj0) && this.a.equals(((gfj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
