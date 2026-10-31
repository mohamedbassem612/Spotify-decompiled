package p;

import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d80 implements e80 {
    public final SortedSet a;

    public d80(SortedSet sortedSet) {
        this.a = sortedSet;
    }

    public final Set a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d80) && this.a.equals(((d80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
