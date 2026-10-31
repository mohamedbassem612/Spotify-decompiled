package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ujv0 implements akv0 {
    public final Set a;

    public ujv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujv0) && this.a.equals(((ujv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
