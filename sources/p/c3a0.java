package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c3a0 implements g3a0 {
    public final Set a;

    public c3a0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3a0) && this.a.equals(((c3a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
