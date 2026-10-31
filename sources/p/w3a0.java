package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w3a0 implements z3a0 {
    public final Set a;

    public w3a0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3a0) && this.a.equals(((w3a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
