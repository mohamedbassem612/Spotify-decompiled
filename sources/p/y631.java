package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y631 {
    public final Set a;

    public y631(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y631) && this.a.equals(((y631) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
