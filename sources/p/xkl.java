package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xkl implements all {
    public final Set a;

    public xkl(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xkl) && this.a.equals(((xkl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
