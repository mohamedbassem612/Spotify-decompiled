package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class muv0 implements tuv0 {
    public final Set a;

    public muv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muv0) && this.a.equals(((muv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
