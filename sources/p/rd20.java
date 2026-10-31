package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rd20 {
    public final Set a;

    public rd20(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd20) && this.a.equals(((rd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
