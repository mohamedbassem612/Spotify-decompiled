package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e4a0 implements g4a0 {
    public final Set a;

    public e4a0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4a0) && this.a.equals(((e4a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
