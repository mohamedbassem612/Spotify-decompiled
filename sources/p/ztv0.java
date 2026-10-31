package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ztv0 implements euv0 {
    public final Set a;

    public ztv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztv0) && this.a.equals(((ztv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
