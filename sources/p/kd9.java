package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kd9 implements md9 {
    public final Set a;

    public kd9(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd9) && this.a.equals(((kd9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
