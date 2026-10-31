package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r4d0 implements x4d0 {
    public final Set a;

    public r4d0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4d0) && this.a.equals(((r4d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
