package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rwj1 extends twj1 {
    public final Set a;

    public rwj1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwj1) && this.a.equals(((rwj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
