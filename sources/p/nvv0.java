package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nvv0 implements svv0 {
    public final Set a;

    public nvv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvv0) && this.a.equals(((nvv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
