package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z450 implements l700 {
    public final Set a;

    public z450(Set set) {
        this.a = set;
    }

    public final Set a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z450) && this.a.equals(((z450) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
